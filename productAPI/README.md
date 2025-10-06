# Product API with Java Spring Boot

This project is a simple RESTful API built with Java and Spring Boot for managing products. It supports the basic CRUD operations: Create, Read, Update, and Delete.

## Features

- **Create a Product**: Add new products to the database.
- **Retrieve a Product**: Get a product by its unique ID.
- **Retrieve All Products**: List all products with HATEOAS self-links.
- **Update a Product**: Modify an existing product's details.
- **Delete a Product**: Remove a product from the database.

## Technologies Used

- **Java 17+**
- **Spring Boot** - Framework for building the API.
- **Spring Data JPA** - For database interactions.
- **Hibernate Validator** - For validating request data.
- **MySQL** (or any other relational DB) - Data persistence.
- **HATEOAS** - To add hypermedia links for better RESTful responses.

## API Endpoints

| Method | Endpoint           | Description                       | Request Body           | Response                 |
|--------|--------------------|---------------------------------|-----------------------|--------------------------|
| POST   | `/products`        | Create a new product             | `ProductRecordDto`     | Created product (201)    |
| GET    | `/products/{id}`   | Get product by ID                | None                  | Product data (200)       |
| GET    | `/products`        | Get all products                 | None                  | List of products (200)   |
| PUT    | `/products/{id}`   | Update product by ID             | `ProductRecordDto`     | Updated product (200)    |
| DELETE | `/products/{id}`   | Delete product by ID             | None                  | Success message (200)    |

## Request and Response Examples

### Create Product
```json
POST /products
{
  "name": "Laptop",
  "description": "High performance laptop",
  "price": 1200.00
}
GET /products/{id}
{
  "idProduct": "uuid",
  "name": "Laptop",
  "description": "High performance laptop",
  "price": 1200.00,
  "_links": {
    "self": {
      "href": "http://localhost:8080/products/{id}"
    }
  }
}
