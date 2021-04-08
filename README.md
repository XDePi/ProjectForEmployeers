# ProjectForEmployers
This project was made for employeers that want to see my skills in making simple applications.
It creates a simple SpringBoot application that works with built-in MySQL database and JSON formatted views.
Here you can create your product with it's description and price. Every single product will have a creation date and update time. You can also change currency and language of description. 

**How to make everything work**
1. You must connect to your empty MySQL database via `application.properties`
2. Then in `database.sql` you need to copy the script and execute it in the database 

**Working with JSON**
1. In your browser connect to http://***your_db_server***/products. Here you can see the list of all products
2. http://***your_db_server***/products/info/***keywords***. Here you can search any product by its info.
3. http://***your_db_server***/products/name/***keywords***. Here you can search any product by its name.
4. If you want to add new product, you should use program like `Postman Agent`. Select `POST` and paste the link http://***your_db_server***/products here: ![image](https://user-images.githubusercontent.com/62597006/114078358-a42a8d80-98ca-11eb-9b67-c2026ed64318.png)
5. If you want to update existing product, select `PUT` and paste the link http://***your_db_server***/products/***id*** here: ![image](https://user-images.githubusercontent.com/62597006/114079070-87db2080-98cb-11eb-928e-7ab13e77d009.png)
6. Same with deleting, but you need to choose `DELETE` instead: ![image](https://user-images.githubusercontent.com/62597006/114079218-b822bf00-98cb-11eb-8cba-738aaba1e67c.png) 
