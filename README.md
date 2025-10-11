# 🍔 iHungry Burger Shop - Java Swing Desktop Application

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-orange?style=for-the-badge)
![OOP](https://img.shields.io/badge/OOP-Concepts-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

*A delicious desktop application for managing burger shop operations* 🏪

</div>

## 📋 Table of Contents

- [🎯 Overview](#-overview)
- [✨ Features](#-features)
- [🛠️ Technologies Used](#️-technologies-used)
- [📦 Installation](#-installation)
- [🚀 Getting Started](#-getting-started)
- [🏗️ Project Structure](#️-project-structure)
- [🎨 Screenshots](#-screenshots)
- [🔧 Usage](#-usage)
- [📚 OOP Concepts Demonstrated](#-oop-concepts-demonstrated)
- [🤝 Contributing](#-contributing)
- [📄 License](#-license)
- [👨‍💻 Author](#-author)

## 🎯 Overview

**iHungry Burger Shop** is a comprehensive desktop application developed in Java using the Swing GUI framework. This project serves as a practical demonstration of Object-Oriented Programming (OOP) concepts in a real-world burger shop management scenario.

The application provides an intuitive interface for managing various aspects of a burger shop's daily operations, from order management to inventory tracking, all while showcasing fundamental OOP principles.

## ✨ Features

### 🍟 Core Functionality
- **📋 Order Management**: Create, modify, and track customer orders
- **🧾 Bill Generation**: Automatic calculation and invoice generation
- **👥 Customer Management**: Store and manage customer information
- **📊 Inventory Tracking**: Monitor stock levels and ingredient availability
- **💰 Sales Analytics**: Track daily, weekly, and monthly sales performance

### 🎨 User Interface
- **🖥️ Modern GUI**: Clean and intuitive Swing-based interface
- **📱 Responsive Design**: Optimized for various screen sizes
- **🎯 User-Friendly**: Easy navigation and streamlined workflows
- **🔄 Real-time Updates**: Live updates for orders and inventory

### 🏗️ Technical Features
- **🧩 Modular Architecture**: Well-structured codebase following OOP principles
- **🛡️ Error Handling**: Robust exception handling and validation
- **💾 Data Persistence**: Efficient data storage and retrieval
- **🔍 Search & Filter**: Advanced search capabilities

## 🛠️ Technologies Used

| Technology | Purpose | Version |
|------------|---------|---------|
| ☕ **Java** | Core Programming Language | JDK 8+ |
| 🖼️ **Swing** | GUI Framework | Built-in |
| 🎨 **AWT** | Graphics and UI Components | Built-in |
| 📁 **File I/O** | Data Persistence | Built-in |

## 📦 Installation

### Prerequisites 📋
- ☕ Java Development Kit (JDK) 8 or higher
- 💻 Any Java-compatible IDE (IntelliJ IDEA, Eclipse, NetBeans)
- 🖥️ Operating System: Windows, macOS, or Linux

### Installation Steps 🚀

1. **📥 Clone the Repository**
   ```bash
   git clone https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop.git
   ```

2. **📂 Navigate to Project Directory**
   ```bash
   cd OOP-Swing-iHungry-BurgerShop
   ```

3. **🔧 Compile the Project**
   ```bash
   javac -cp . *.java
   ```

4. **▶️ Run the Application**
   ```bash
   java MainClass
   ```

## 🚀 Getting Started

### Quick Start Guide 🏃‍♂️

1. **🎬 Launch the Application**
   - Run the main class to start the burger shop management system

2. **👤 User Authentication**
   - Login with your credentials or create a new account

3. **🍔 Start Managing Orders**
   - Navigate through the intuitive menu system
   - Add items to customer orders
   - Process payments and generate receipts

4. **📊 Monitor Performance**
   - Check sales reports and inventory levels
   - Analyze business metrics

## 🏗️ Project Structure

```
📁 OOP-Swing-iHungry-BurgerShop/
├── 📄 README.md
├── 📄 LICENSE
├── 📁 src/
│   ├── 📁 main/
│   │   ├── 📁 java/
│   │   │   ├── 📁 models/
│   │   │   │   ├── 🍔 Burger.java
│   │   │   │   ├── 👤 Customer.java
│   │   │   │   ├── 📋 Order.java
│   │   │   │   └── 🧾 Receipt.java
│   │   │   ├── 📁 views/
│   │   │   │   ├── 🏠 MainFrame.java
│   │   │   │   ├── 📋 OrderPanel.java
│   │   │   │   └── 💰 PaymentPanel.java
│   │   │   ├── 📁 controllers/
│   │   │   │   ├── 🎮 OrderController.java
│   │   │   │   └── 💳 PaymentController.java
│   │   │   └── 🚀 Main.java
│   │   └── 📁 resources/
│   │       ├── 🖼️ images/
│   │       └── 📁 data/
├── 📁 docs/
└── 📁 screenshots/
```

## 🎨 Screenshots

### 🏠 Main Dashboard
*Coming Soon - Add your application screenshots here*

### 📋 Order Management
*Coming Soon - Add order management interface screenshots*

### 💰 Payment Processing
*Coming Soon - Add payment interface screenshots*

## 🔧 Usage

### 📋 Order Management
```java
// Example: Creating a new order
Order newOrder = new Order();
newOrder.addItem(new Burger("Classic Burger", 8.99));
newOrder.calculateTotal();
```

### 👤 Customer Operations
```java
// Example: Adding a customer
Customer customer = new Customer("John Doe", "123-456-7890");
customer.addOrder(newOrder);
```

### 💳 Payment Processing
```java
// Example: Processing payment
Payment payment = new Payment(newOrder.getTotal(), PaymentType.CASH);
payment.processPayment();
```

## 📚 OOP Concepts Demonstrated

### 🧩 **Encapsulation**
- Private fields with public getter/setter methods
- Data hiding and controlled access to object properties

### 🔗 **Inheritance**
- Base classes for common functionality
- Specialized classes inheriting from parent classes

### 🎭 **Polymorphism**
- Method overriding for specialized behavior
- Interface implementations for flexible design

### 🏭 **Abstraction**
- Abstract classes for common behavior
- Interface definitions for contract-based programming

### 🎨 **Design Patterns**
- **🏭 Factory Pattern**: For creating different types of menu items
- **👁️ Observer Pattern**: For updating UI components
- **🎮 MVC Pattern**: Separating concerns between Model, View, and Controller

## 🤝 Contributing

We welcome contributions from the community! 🌟

### How to Contribute 📝

1. **🍴 Fork the Repository**
2. **🌿 Create a Feature Branch**
   ```bash
   git checkout -b feature/amazing-feature
   ```
3. **💾 Commit Your Changes**
   ```bash
   git commit -m "Add amazing feature"
   ```
4. **📤 Push to Branch**
   ```bash
   git push origin feature/amazing-feature
   ```
5. **🔄 Open a Pull Request**

### 📋 Contribution Guidelines
- Follow Java coding conventions
- Write meaningful commit messages
- Add documentation for new features
- Ensure code is properly tested

## 📄 License

This project is licensed under the **MIT License** 📋

```
MIT License

Copyright (c) 2024 PasinduOG

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

## 👨‍💻 Author

**PasinduOG** 👋
- 🐙 GitHub: [@PasinduOG](https://github.com/PasinduOG)
- 📧 Email: [Contact via GitHub](https://github.com/PasinduOG)

---

<div align="center">

### 🌟 Star this repository if you found it helpful! 🌟

**Made with ❤️ and lots of ☕**

*iHungry Burger Shop - Where code meets cuisine!* 🍔

</div>

---

### 📊 Repository Stats

- ⭐ Stars: 1
- 👀 Watchers: 1
- 🍴 Forks: 0
- 📝 Language: Java
- 📅 Created: 12 days ago
- 🔄 Last Updated: 7 days ago

### 🏷️ Tags
`java` `swing` `gui` `oop` `desktop-application` `burger-shop` `management-system` `mvc-pattern` `java-swing` `object-oriented-programming`
