<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shopping Cart System - Spring Boot</title>
</head>
<body>
    <h1>Shopping Cart System - Spring Boot</h1>

  <p>This is a simple Shopping Cart application built with <strong>Spring Boot</strong>. The system allows users to:</p>
    <ul>
        <li>Add products to the shopping cart</li>
        <li>View all items in the cart</li>
        <li>Update the quantity of items in the cart</li>
        <li>Remove items from the cart</li>
    </ul>

   <h2>Project Setup</h2>
    <p>This project was built using <strong>Spring Boot</strong> and uses <strong>H2 database</strong> (in-memory) for simplicity. You can easily configure it to use other databases like MySQL or PostgreSQL.</p>

  <h3>Dependencies</h3>
    <ul>
        <li>Spring Boot</li>
        <li>Spring Web</li>
        <li>Spring Data JPA</li>
        <li>H2 Database (or MySQL/PostgreSQL)</li>
    </ul>

  <h2>How to Run</h2>
    <p>Follow these steps to get the application running on your local machine:</p>
    <ol>
        <li>Clone the repository:</li>
        <pre><code>git clone https://github.com/yourusername/shopping-cart-system-spring-boot.git</code></pre>
        
   <li>Navigate to the project directory:</li>
        <pre><code>cd shopping-cart-system-spring-boot</code></pre>
          <li>Build and run the application:</li>
        <pre><code>mvn spring-boot:run</code></pre>
     <li>Access the application at <a href="http://localhost:8080">http://localhost:8080</a></li>
    </ol>

<h2>API Endpoints</h2>
    <p>The application exposes the following RESTful API endpoints:</p>
    <table border="1">
        <tr>
            <th>Method</th>
            <th>Endpoint</th>
            <th>Description</th>
        </tr>
        <tr>
            <td>POST</td>
            <td>/api/cart/add/{productId}</td>
            <td>Add a product to the cart (quantity is passed as a query parameter).</td>
        </tr>
        <tr>
            <td>GET</td>
            <td>/api/cart/items</td>
            <td>Retrieve all items in the shopping cart.</td>
        </tr>
        <tr>
            <td>PUT</td>
            <td>/api/cart/update/{cartId}</td>
            <td>Update the quantity of a product in the cart.</td>
        </tr>
        <tr>
            <td>DELETE</td>
            <td>/api/cart/remove/{cartId}</td>
            <td>Remove a product from the cart.</td>
        </tr>
    </table>

  <h2>Product Entity</h2>
    <p>The <code>Product</code> entity represents a product in the system with the following fields:</p>
    <ul>
        <li><strong>id</strong>: Unique identifier for the product.</li>
        <li><strong>name</strong>: The name of the product.</li>
        <li><strong>price</strong>: The price of the product.</li>
    </ul>
    <h2>Cart Entity</h2>
    <p>The <code>Cart</code> entity represents an item in the shopping cart with the following fields:</p>
    <ul>
        <li><strong>id</strong>: Unique identifier for the cart item.</li>
        <li><strong>product</strong>: The product associated with the cart item.</li>
        <li><strong>quantity</strong>: The quantity of the product in the cart.</li>
    </ul>

   <h2>Database Configuration</h2>
    <p>The application uses an in-memory H2 database for simplicity. To configure a different database, modify the <code>application.properties</code> file located in <code>src/main/resources/application.properties</code>:</p>
    <pre><code>
# H2 Database (default configuration)
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
    </code></pre>
    <h2>Notes</h2>
    <ul>
        <li>You can easily swap the H2 database for MySQL or PostgreSQL by adjusting the <code>application.properties</code> configuration.</li>
        <li>Ensure that the product IDs and cart IDs are valid when testing the API.</li>
    </ul>
    <h2>Contributing</h2>
    <p>If you'd like to contribute to this project, please fork the repository, make your changes, and create a pull request.</p>

  <footer>
        <p>&copy; 2024 Developed Sifiso Vinjwa. All Rights Reserved.</p>
    </footer>
</body>
</html>
