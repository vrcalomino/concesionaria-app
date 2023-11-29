# Concesionaria Application

This project was made as a one of the final projects for [OOP course]() from TodoCode.
I used:
- Java 11
- EclipseLink 2.2 as the JPA provider
- MySQL
- Swing for the user interface

I use layered architecture dividing the app in User Graphic Interface, the Logic and the Persistence.
The app is a simple car dealership CRUD where you can use the User Interface in order to do and see the operations.

To run the project you can follow this steps:
- Clone the repository
- Configure your database credentials in `./src/main/resources/META-INF/persistence.xml`
- Run `mvn clean package`
- Run `java -cp .\target\Concesionaria-1.0-SNAPSHOT.jar com.mycompany.concesionaria.Concesionaria`

##### Considerations:
In order to run the project, you need [JDK 11](https://www.oracle.com/ar/java/technologies/javase/jdk11-archive-downloads.html) and [maven](https://maven.apache.org/index.html)
