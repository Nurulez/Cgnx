# Cgnx
ToDoList Server

To run the project in VS Code, follow these steps:

Install Visual Studio Code:
If you haven't installed Visual Studio Code, download and install it from https://code.visualstudio.com/.

Install Java Extension Pack:
Open VS Code, go to the Extensions view (click on the Extensions icon in the Activity Bar on the side of the window or use the keyboard shortcut Ctrl+Shift+X), and search for "Java Extension Pack". Install it.

Clone the GitHub Repository:
Clone your GitHub repository containing the TODO list project to your local machine.
-git clone https://github.com/yourusername/todo-list-server.git
Open the Project in VS Code:
Open VS Code and use the "Open Folder" option to open the project folder (todo-list-server).

Install Dependencies:
Open the integrated terminal in VS Code (View -> Terminal or Ctrl+ backtick) and navigate to the project folder. Run the following command to install dependencies:
-mvn clean install
Run the Application:
Use the terminal to run the application using Maven. Run the following command:

-mvn spring-boot:run
This will start the Spring Boot application.

Access the API Endpoints:
Once the application is running, you can access the API endpoints using curl or a tool like Postman.

Example:
-curl http://localhost:8080/api/todos
Replace the URL and API path 

Now, you should have the TODO list server running in VS Code, and you can interact with it using the specified API endpoints.





