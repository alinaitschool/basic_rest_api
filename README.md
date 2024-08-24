hallenge
Objective: Create a simple Spring Boot application that generates personalized greetings and exposes the functionality via RESTful APIs.
Requirements
Create a GreetingService class with the following requirements: 
Mark the class with the @Service annotation. 
Implement a method called getGreeting() that takes a String parameter (name) and returns a personalized greeting message, such as "Hello, John!". 
Create a GreetingController class with the following requirements: 
Mark the class with the @RestController annotation. 
Inject the GreetingService class using the @Autowired annotation. 
Implement a method called greet() that takes a path variable called name as a parameter. 
Annotate the greet() method with the @GetMapping annotation and map it to the "/greet/{name}" URL path. 
In the greet() method, call the getGreeting() method from the GreetingService class and return the personalized greeting message. 
Create a Spring Boot application class with the following requirements: 
Mark the class with the @SpringBootApplication annotation. 
Implement the main() method that starts the Spring Boot application using the SpringApplication.run() method.
To test your application, run the main class and make HTTP GET requests to the "/greet/{name}" endpoint (e.g., "/greet/John") using a web browser, REST client, or command-line tool like curl. The application should return personalized greeting messages based on the provided name.
