# High level Test Plan
| Test ID | Module               | Test Scenario                 | Expected Result              |
| ------- | -------------------- | ----------------------------- | ---------------------------- |
| HL001   | User Service         | Verify user registration      | User registered successfully |
| HL002   | Login Module         | Verify login authentication   | User login successful        |
| HL003   | Appointment Service  | Verify appointment booking    | Appointment created          |
| HL004   | Notification Service | Verify notification sending   | Notification received        |
| HL005   | Kafka Integration    | Verify Kafka message transfer | Consumer receives event      |
| HL006   | API Gateway          | Verify API routing            | Requests routed correctly    |
| HL007   | Eureka Server        | Verify service registration   | Services visible in Eureka   |
| HL008   | Docker               | Verify container execution    | Containers running           |
| HL009   | Kubernetes           | Verify pod deployment         | Pods running successfully    |
| HL010   | AWS Deployment       | Verify EKS deployment         | Application accessible       |

# Low Level Test Plan
| Test Case ID | Description            | Input                 | Expected Output              | Actual Output                   | Status |
| ------------ | ---------------------- | --------------------- | ---------------------------- | ------------------------------- | ------ |
| TC001        | User Registration      | Name, Email, Password | User account created         | User created successfully       | Pass   |
| TC002        | Duplicate Registration | Existing Email        | Error message                | Duplicate email error displayed | Pass   |
| TC003        | User Login             | Valid credentials     | Login success                | JWT/Auth success                | Pass   |
| TC004        | Invalid Login          | Wrong password        | Authentication failed        | Invalid credentials shown       | Pass   |
| TC005        | View Services          | API Request           | List of beauty services      | Services displayed              | Pass   |
| TC006        | Book Appointment       | Appointment details   | Appointment booked           | Booking successful              | Pass   |
| TC007        | Cancel Appointment     | Appointment ID        | Appointment cancelled        | Status updated                  | Pass   |
| TC008        | Kafka Producer         | “Hello Kafka” message | Event published              | Event published successfully    | Pass   |
| TC009        | Kafka Consumer         | Kafka topic event     | Notification received        | Event consumed successfully     | Pass   |
| TC010        | Notification Service   | Appointment event     | Email/notification generated | Notification displayed          | Pass   |
| TC011        | API Gateway Routing    | Service endpoint      | Correct routing              | Routed successfully             | Pass   |
| TC012        | Eureka Registration    | Start services        | Services registered          | Eureka dashboard updated        | Pass   |
| TC013        | Docker Container Build | Docker build command  | Docker image created         | Image generated                 | Pass   |
| TC014        | Docker Container Run   | Run container         | Container running            | Container active                | Pass   |
| TC015        | Kubernetes Deployment  | kubectl apply         | Pod deployment               | Pods running                    | Pass   |
| TC016        | AWS ECR Push           | Docker push           | Image uploaded               | Push successful                 | Pass   |
| TC017        | AWS EKS Deployment     | Deploy YAML           | Cluster deployment           | App accessible                  | Pass   |
