Kaiburr Task 1

Task 1 involves implementing an application in java which provides a REST API with endpoints for searching, creating and deleting “server” objects.

Tools Required and Setup Process:

The following task utilizes maven project structure and is created entirely on Spring tool Suite(https://spring.io/tools).

To get started, we need Spring Boot maven project with required dependencies. Go to https://start.spring.io/ to create your Spring Boot Project and add necessary dependencies.

![1](https://user-images.githubusercontent.com/65592677/162903896-bc9403f1-1f8e-4951-977e-a339387b9d80.png)

The Spring Web dependency allows us to create RESTful applications using Spring MVC and Spring Data MongoDB provides support for connecting MongoDB database to our application.

Now, generating the project will download a zip file of Spring Boot Project with all dependencies added. Just unzip the file and import the project folder on Spring tool suite. Once you are done, our project structure might look like this :

![2](https://user-images.githubusercontent.com/65592677/162905072-149a07dc-3c0a-4c70-ae63-0451806926b1.png)

Here, src/main/java will contain all our necessary packages with java classes.

src/main/resources  will contain application.properties configuration file which will be required when we configure our mongodb database to connect with our application.

pom.xml file contains all the necessary dependencies defined for this project.

The package structure inside src/main/java is as follows:

![3](https://user-images.githubusercontent.com/65592677/162909877-af10ca7b-00c6-4868-8fa3-64c9feda3c12.png)
 
Task1Application.java is the entry point for execution of this application as it contains main method.

Task1Controller.java contains the controller class which receives the http requests and delegates it to various methods depending on request type.

Cars.java defines the structure of json object.It includes the type of data that wil be stored as json object in database and used depending on http request.

CarData.java interface extends from MongoRepository interface which provides us with built in methods to perform CRUD operations with data.

Now to showcase the response from the database we need to connect the database. For that we neeed to configure application.properties with following configuration.

![4](https://user-images.githubusercontent.com/65592677/162915897-332ffca0-7153-4945-9d16-afcd946288c1.png)
Note that we need to create a new database in mongodb using "use" command before we can configure it to work with our spring boot application.

To send http requests we need postman tool.Download postman from https://www.postman.com/downloads/

We are now ready to send request.

1. Start your Spring Boot Application from Spring Tool Suite(STS)

![15](https://user-images.githubusercontent.com/65592677/162930938-5a19fd5e-cf63-4381-a1b4-6a981d5ecd9d.png)

2. Now in Postman we will send GET request to retrive data from database.

![5](https://user-images.githubusercontent.com/65592677/162919941-35dbb87c-c2b4-4107-b046-72741b06856d.png)

3. The Response will return no json object as the database is empty.

4. We will now use POST request to create car object and send it to the database.

![6](https://user-images.githubusercontent.com/65592677/162927938-c4ab0779-435b-425f-ac86-9bc619b9eeca.png)

5. If we send GET request again, we now receive a json object which we created in previous step using POST request.

![7](https://user-images.githubusercontent.com/65592677/162928013-c8a168fc-045e-4929-b1af-fc255088baad.png)

6. We will now add another car object using POST.

![8](https://user-images.githubusercontent.com/65592677/162928097-5aec25c9-c2d0-4a06-82c3-7a87f92d13e0.png)

![9](https://user-images.githubusercontent.com/65592677/162928133-ffbc3182-1037-41a5-94ce-0c2bc842f382.png)

7. We can use GET request to get specific car object by specifying its id in the http request.

 ![10](https://user-images.githubusercontent.com/65592677/162928182-5ee09a5f-497b-4807-a914-4679dfa068ac.png)

8. We can use PUT request to update existing object by specifying new object data in the http request body

![11](https://user-images.githubusercontent.com/65592677/162922706-ef374d40-f4ba-451d-a735-ae728e21217e.png)

![12](https://user-images.githubusercontent.com/65592677/162922735-7e9789e4-5fc6-4c69-a42e-6943426ca490.png)

9. We can use DELETE request to delete existing car object by specifying its id in the http request.

![13](https://user-images.githubusercontent.com/65592677/162924915-144e0378-5112-4a45-9385-97d5706a347e.png)

![14](https://user-images.githubusercontent.com/65592677/162924951-cfb8360b-41f9-4a5b-b3c9-e9f4fb1db482.png)
