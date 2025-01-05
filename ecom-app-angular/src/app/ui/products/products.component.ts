import {Component, OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {KeycloakService} from 'keycloak-angular';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrl: './products.component.css'
})
export class ProductsComponent implements OnInit {

  public products: any;

  constructor(private http: HttpClient,
              private keycloakService: KeycloakService) {
  }


  async ngOnInit() {
    try {
      const token = await this.keycloakService.getToken();

      this.http.get("http://localhost:8087/api/products", {
        headers: {
          'Authorization': `Bearer ${token}`
        }
      }).subscribe({
        next: data => {
          this.products = data;
        },
        error: err => {
          console.error('Error fetching products:', err);
        }
      });
    } catch (error) {
      console.error('Error getting token:', error);
    }
  }
}
