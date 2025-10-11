# 🍔 iHungry Burger Shop - OOP Swing Application

<div align="center">

![Java](https://img.shields.io/badge/Java_11-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-orange?style=for-the-badge&logo=java&logoColor=white)
![FlatLaf](https://img.shields.io/badge/FlatLaf-3.6.1-blue?style=for-the-badge)
![NetBeans](https://img.shields.io/badge/NetBeans-IDE-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

*A comprehensive Java Swing desktop application for burger shop management with modern UI* 🏪

[Features](#-key-features) • [Installation](#-installation) • [Documentation](#️-project-architecture) • [License](#-license)

</div>

---

## 📋 Table of Contents

- [🎯 Overview](#-overview)
- [✨ Key Features](#-key-features)
- [🛠️ Technologies & Dependencies](#️-technologies--dependencies)
- [📦 Installation](#-installation)
- [🚀 Getting Started](#-getting-started)
- [🏗️ Project Architecture](#️-project-architecture)
- [🎮 User Interface Guide](#-user-interface-guide)
- [💡 OOP Principles Demonstrated](#-oop-principles-demonstrated)
- [📊 Business Logic](#-business-logic)
- [🔧 Development](#-development)
- [🤝 Contributing](#-contributing)
- [📄 License](#-license)
- [👨‍💻 Author](#-author)

---

## 🎯 Overview

**iHungry Burger Shop** is a full-featured Java Swing desktop application that demonstrates advanced Object-Oriented Programming concepts through a real-world burger shop management system. Built with NetBeans IDE and styled with the modern FlatLaf Look & Feel library, this application showcases professional GUI development and solid OOP principles.

### 🎓 **Educational Value**
This project serves as an excellent learning resource for:
- Object-Oriented Programming (OOP) concepts
- Java Swing GUI development with NetBeans Form Designer
- Event-driven programming patterns
- Modern UI design with FlatLaf themes
- Build automation with Apache Ant
- Data persistence with file I/O

### 🏢 **Real-World Application**
Complete burger shop management system featuring:
- Order lifecycle management (Place → Process → Deliver/Cancel)
- Customer information tracking with phone validation
- Real-time price calculation (LKR 500 per burger)
- Advanced search and analytics capabilities
- Automatic order ID generation
- File-based data persistence


---

## ✨ Key Features

### 🏠 **Core Functionality**
- ✅ **Place Order**: Create new burger orders with customer validation
- ✅ **View Orders**: Browse and filter orders by status
- ✅ **Update Order**: Modify existing order quantities and details
- ✅ **Order Status Tracking**: 
  - 🔄 Processing Orders (Status: 1)
  - ✅ Delivered Orders (Status: 500)
  - ❌ Cancelled Orders (Status: 0)
- ✅ **Search System**:
  - 🔍 Search by Order ID
  - 👤 Search by Customer Phone
  - 🏆 Best Customer Analytics

### 🎨 **User Interface**
- 🖥️ **Modern GUI**: FlatMac Light theme for contemporary appearance
- 🎯 **Intuitive Navigation**: Clean button-based menu system
- 📱 **Responsive Layout**: NetBeans Form Designer generated layouts
- 🍔 **Branded Design**: Custom burger icon and themed colors
- ⚡ **Real-time Updates**: Dynamic price calculation and form validation

### 🏗️ **Technical Features**
- 🧩 **Pure OOP Design**: Encapsulation, abstraction, and composition patterns
- 📋 **Data Management**: Custom dynamic array implementation with load factor
- 💾 **File Persistence**: CSV-based data storage (Burger.txt)
- 🔐 **Input Validation**: Phone number format and duplicate detection
- 💰 **Price System**: Fixed pricing (LKR 500/burger) with automatic total calculation
- 🆔 **Auto ID Generation**: Sequential order IDs (B0001, B0002, ...)


---

## 🛠️ Technologies & Dependencies

| Technology | Purpose | Version |
|------------|---------|---------|
| ☕ **Java** | Core Programming Language | JDK 11 |
| 🖼️ **Java Swing** | GUI Framework | Built-in |
| 🎨 **FlatLaf** | Modern Look and Feel | 3.6.1 |
| 🎨 **FlatLaf IntelliJ Themes** | Additional UI Themes | 3.6.1 |
| 🏗️ **Apache Ant** | Build Automation | NetBeans bundled |
| 💻 **NetBeans** | IDE & Form Designer | Latest |

### 📚 **External Libraries**
```
lib/
├── flatlaf-3.6.1.jar                    # Modern Look & Feel
└── flatlaf-intellij-themes-3.6.1.jar    # Theme extensions
```


---

## 📦 Installation

### 📋 **Prerequisites**
- ☕ **Java Development Kit (JDK) 11 or higher**
- 💻 **NetBeans IDE** (recommended for Form Designer support)
- 🔧 **Apache Ant** (bundled with NetBeans)
- 🌐 **Git** (for version control)

### 🚀 **Installation Steps**

#### **Method 1: NetBeans IDE (Recommended)**

1. **📥 Clone the Repository**
   ```bash
   git clone https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop.git
   cd OOP-Swing-iHungry-BurgerShop
   ```

2. **📂 Open in NetBeans**
   - Launch NetBeans IDE
   - Go to File → Open Project
   - Navigate to the cloned repository
   - Select the project and click Open Project

3. **🔧 Clean and Build**
   - Right-click on project in Project Explorer
   - Select Clean and Build (or press Shift+F11)
   - Wait for dependencies to resolve

4. **▶️ Run the Application**
   - Right-click on project
   - Select Run (or press F6)
   - Application launches with HomePage

#### **Method 2: Command Line (Apache Ant)**

1. **📥 Clone the Repository**
   ```bash
   git clone https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop.git
   cd OOP-Swing-iHungry-BurgerShop
   ```

2. **🔧 Build the Project**
   ```bash
   ant clean compile
   ```

3. **▶️ Run the Application**
   ```bash
   ant run
   ```

4. **📦 Create Distributable JAR**
   ```bash
   ant jar
   # Output: dist/OOP-iHungry-Swing.jar
   ```


---

## 🚀 Getting Started

### ⚡ **Quick Start Guide**

1. **🎬 Launch the Application**
   - Main Class: main.HomePage
   - FlatMac Light theme automatically applies
   - Data loads from Burger.txt file
   - Welcome screen displays with burger icon

2. **📋 Main Dashboard Options**
   - **Place Order**: Create new customer orders
   - **Search**: Access search and analytics features
   - **View Orders**: Browse all orders with status filters
   - **Update Order**: Modify existing order details
   - **Exit**: Close application

3. **🍔 Creating an Order**
   - Click Place Order button
   - Enter customer phone (10 digits starting with 0)
   - Enter/verify customer name (auto-fills for returning customers)
   - Specify burger quantity
   - Price automatically calculated (LKR 500/burger)
   - Click Place Order to confirm
   - Order saved to Burger.txt automatically

4. **🔍 Searching Orders**
   - Search by Order ID (B0001, B0002, etc.)
   - Search by Customer Phone Number
   - View Best Customer analytics

5. **📊 Managing Orders**
   - View Processing Orders (Status: 1)
   - View Delivered Orders (Status: 500)
   - View Cancelled Orders (Status: 0)
   - Update order quantities and details


---

## 🏗️ Project Architecture

```
OOP-Swing-iHungry-BurgerShop/
│
├── 📄 README.md                         # Project documentation
├── 📄 LICENSE                           # MIT License
├── 📄 .gitignore                       # Git ignore patterns
├── 📄 build.xml                        # Ant build configuration
├── 📄 manifest.mf                      # JAR manifest
├── 📄 Burger.txt                       # Order data persistence file (CSV)
│
├── 📁 src/main/                        # Source code directory
│   ├── 🍔 Burger.java                 # Core order model class with constants
│   ├── 📦 List.java                   # Dynamic array data structure & business logic
│   ├── 🏠 HomePage.java/.form         # Main application dashboard & entry point
│   ├── 📋 PlaceOrder.java/.form       # Order creation interface
│   ├── 👁️ ViewOrders.java/.form       # Order viewing with status filters
│   ├── ✏️ UpdateOrder.java/.form      # Order modification interface
│   ├── 🔄 ProcessingOrders.java/.form # Processing orders view (status = 1)
│   ├── ✅ DeliveredOrders.java/.form  # Delivered orders view (status = 500)
│   ├── ❌ CancelledOrders.java/.form  # Cancelled orders view (status = 0)
│   ├── 🔍 Search.java/.form           # Main search interface
│   ├── 🔎 SearchOrder.java/.form      # Order search by ID
│   ├── 👤 SearchCustomer.java/.form   # Customer search by phone
│   ├── 🏆 SearchBestCustomer.java/.form # Customer analytics
│   └── 🖼️ burger.png                  # Application icon
│
├── 📁 lib/                             # External dependencies
│   ├── flatlaf-3.6.1.jar              # Modern Look and Feel
│   └── flatlaf-intellij-themes-3.6.1.jar # Theme extensions
│
├── 📁 nbproject/                       # NetBeans project configuration
├── 📁 build/                          # Compiled classes (auto-generated)
└── 📁 dist/                           # Distribution files
```

### 📋 **Key Components**

| Component | Description | Type |
|-----------|-------------|------|
| Burger.java | Order data model with status constants | Model |
| List.java | Dynamic array with file I/O & business logic | Controller |
| Burger.txt | CSV file for data persistence | Data Storage |
| HomePage.java | Main application entry point & dashboard | View |
| PlaceOrder.java | Order creation form with validation | View |

### 🔢 **Status Constants**
```java
// Defined in Burger.java
public static final int CANCEL = 0;      // Cancelled orders
public static final int PROCESSING = 1;  // Active/Processing orders  
public static final int DELIVERED = 500; // Completed/Delivered orders
public static final int BURGER_PRICE = 500; // LKR per burger
```

### 📂 **Data Persistence**
Orders are stored in Burger.txt in CSV format:
```csv
B0001,0712345678,Pasindu,10,1
B0002,0712345687,Imalka,5,1
orderId,phoneNumber,customerName,quantity,status
```


---

## 💡 OOP Principles Demonstrated

### 🔒 **Encapsulation**
```java
public class Burger {
    private String orderId;
    private String customerId;
    private String customerName;
    private int orderQty;
    private int orderStatus;
    
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }
}
```

### 🏗️ **Abstraction**
```java
public class List {
    private Burger[] burgerList;
    private int nextIndex;
    private double loadFact;
    
    private void extendsArray() { /*...*/ }
    public String generateOrderId() { /*...*/ }
    public void loadDataFromFile(String fileName) { /*...*/ }
}
```

### 🎯 **Composition**
```java
public class HomePage extends JFrame {
    private List burgerList;
    
    public HomePage(List burgerList) {
        this.burgerList = burgerList;
    }
}
```

---

## 📊 Business Logic

### 💰 **Pricing System**
- Fixed price: LKR 500 per burger
- Total = Quantity × 500

### 🆔 **Order ID Generation**
- Format: B0001, B0002, B0003...
- Sequential auto-generated

### 📱 **Phone Validation**
- Must be exactly 10 digits
- Must start with 0
- Only numeric characters
- Format: 0XXXXXXXXX

### 📈 **Order Status Flow**
```
[PROCESSING (1)] → [DELIVERED (500)]
       ↓
  [CANCELLED (0)]
```

---

## 🔧 Development

### 🛠️ **Build Commands**
```bash
ant clean      # Clean previous builds
ant compile    # Compile source code
ant run        # Run application
ant jar        # Create distributable JAR
ant dist       # Full build and package
```

---

## 🤝 Contributing

Contributions are welcome! 🌟

1. Fork the Repository
2. Create Feature Branch (git checkout -b feature/amazing-feature)
3. Commit Changes (git commit -m 'Add feature')
4. Push to Branch (git push origin feature/amazing-feature)
5. Open Pull Request

---

## 📄 License

This project is licensed under the MIT License.

Copyright (c) 2025 PasinduOG

See [LICENSE](LICENSE) file for details.

---

## 👨‍💻 Author

**PasinduOG**

[![GitHub](https://img.shields.io/badge/GitHub-PasinduOG-181717?style=for-the-badge&logo=github)](https://github.com/PasinduOG)

### 🌟 Related Projects
- 🍔 [iHungry-Shop](https://github.com/PasinduOG/iHungry-Shop)
- 🥘 [OOP-iHungry-Shop](https://github.com/PasinduOG/OOP-iHungry-Shop)

---

## 🙏 Acknowledgments

- **FlatLaf** - Modern Look and Feel for Java Swing
- **NetBeans** - Excellent IDE with Form Designer
- **Oracle Java** - Robust programming platform

---

<div align="center">

### 🌟 **Star this repository if you found it helpful!** 🌟

**Made with ❤️ and Java ☕**

*iHungry Burger Shop - Where OOP meets real-world applications!* 🍔

---

**Tags:** java | swing | gui | oop | desktop-application | burger-shop | netbeans | flatlaf | education

📅 **Last Updated**: October 2025  
⭐ **Project Status**: Active & Complete  
🎓 **Purpose**: Educational & Portfolio

</div>
