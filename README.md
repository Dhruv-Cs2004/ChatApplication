# Chat Application 💬

Welcome to the Chat Application project! 🚀 This is a real-time chat application built using Java, MySQL, Micronaut, and Swing. The app allows users to send and receive messages, and it stores message data in a MySQL database for persistence.

## Features ✨

- **Real-time messaging** 🕹️
- **Message history** 📜
- **MySQL database integration** 🗄️
- **Swing-based user interface** 🎨
- **Responsive chat layout** 📱

## Installation 🛠️

Follow these steps to get your development environment set up:

### Prerequisites

Make sure you have the following installed:

- Java Development Kit (JDK) 8 or higher ☕
- MySQL Database 🛢️
- Maven or Gradle (for building the project) 📦

### Setup Instructions

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/yourusername/chat-app.git

2. Navigate to the project directory:
   ```bash
   cd chat-app
   ```

3. Set up the MySQL database:

   - Open MySQL and create a new database:
     ```sql
     CREATE DATABASE chatapp;
     ```

   - Import the schema (you can modify this as per your requirements):
     ```sql
     USE chatapp;
     CREATE TABLE messages (
         id INT AUTO_INCREMENT PRIMARY KEY,
         sender VARCHAR(255),
         message TEXT
     );
     ```

4. Configure the database connection in the `ConnectionMysql.Con` class. Make sure to replace the username and password:
   ```java
   c=DriverManager.getConnection("jdbc:mysql:///chatapp","root","YOUR_PASSWORD");
   ```

5. Run the server and client:

   - Start the **Server**:
     ```bash
     java UserInterface.Server
     ```

   - Then, start the **Client**:
     ```bash
     java UserInterface.Client
     ```

6. Now you should be able to start chatting! 💬

## Screenshots 📸

![Chat Interface](https://github.com/Dhruv-Cs2004/ChatApplication/blob/main/ScreenShots/Screenshot%202025-03-29%20at%2010.12.36%E2%80%AFPM.png?raw=true)


## Technologies Used 🔧

- **Java** ☕
- **Swing** 🎨
- **MySQL** 🗄️
- **Micronaut** 🚀
- **Sockets** 🌐

## Contributing 🤝

We welcome contributions to improve this project! Please fork the repository, make your changes, and create a pull request. 🚀

## License 📄

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Thank you for using Chat App! Happy coding! 🎉
```

### Steps to add this to your GitHub repository:

1. Copy the markdown above.
2. In your project, create a new file named `README.md`.
3. Paste the copied content into the `README.md` file.
4. Commit and push to your GitHub repository.

Now, your GitHub repository will have a nice README with emojis to help explain the project and guide new users!
