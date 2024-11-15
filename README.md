# Real-Time-Order-Processing-System

This project demonstrates a Microservices Architecture using Apache Kafka for asynchronous communication, Spring Boot for backend development, and Docker for containerization. It includes three primary services that work together to simulate a real-world e-commerce workflow:

🛒 Order Service: Handles order placements and publishes events to Kafka.
📩 Notification Service: Listens to order events and sends user notifications.
💳 Payment Service: Processes payments and updates the order status in real-time.
⚙️ Tech Stack

Technology	Description
Spring Boot	Microservices and REST API development.
Apache Kafka	Event-driven communication.
Docker	Containerization of services.
Postman	API testing and debugging.
Kafka Topics	Communication channels for services.

🏗️ Architecture Diagram

+---------------+         +-----------------+        +-------------------+  
| Order Service | ----->  | Notification    | ----> | Payment Service    |  
|  (Producer)   |         |  Service        |       | (Consumer)         |  
|               |         |  (Consumer)     |       |                   |  
+---------------+         +-----------------+        +-------------------+  
🚀 How to Run

1️⃣ Prerequisites
🐳 Docker Desktop Installed
☕ Java 17+
🔧 Kafka & Zookeeper setup
2️⃣ Clone the Repository
git clone https://github.com/your-username/your-repo.git  
cd your-repo  
3️⃣ Start Docker Containers
docker-compose up -d  
4️⃣ Run Microservices
Open each service (Order, Notification, Payment) in your IDE.
Run each service on separate ports.
🌐 API Endpoints

🛒 Order Service 
📩 Notification Service
Automatically listens to events on order_topic.
💳 Payment Service
Automatically processes payment on order confirmation.
📦 Features

Real-time Notifications: Instant updates on order status.
Payment Processing: Automated validation of payments.
Scalable & Decoupled: Services communicate via Kafka topics.
Dockerized Setup: Easy to run, replicate, and scale.
🎉 Key Learnings

Building event-driven architectures with Kafka.
Implementing real-world workflows in microservices.
Efficient containerization with Docker Compose.
🤝 Connect With Me

💼 LinkedIn: https://www.linkedin.com/in/vaibhav-shekhar-028325228

⭐ Show Your Support

If you found this project insightful:

⭐ Star this repository!
