# 🍔 iHungry Burger Shop - OOP Swing Application

<div align="center">

![Java](https://img.shields.io/badge/Java_11-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields├── 📄 README.md                         # Proje### 📋 **Key Components**

| Component | Description | Type |
|-----------|-------------|------|
| `Burger.ja- ✅ Complex data structure operations hidden
- ✅ User-friendly public interface
- ✅ Implementation details concealed
- ✅ Dynamic array resizing with load factor (50% expansion)
- ✅ File I/O abstraction for data persistence

### 🎯 **Composition**
```java
// HomePage contains List instance
public class HomePage extends JFrame {
    private List burgerList;
    
    public HomePage(List burgerList) {
        this.burgerList = burgerList;data model with status constants | Model |
| `List.java` | Dynamic array with file I/O & business logic | Controller |
| `Burger.txt` | CSV file for data persistence | Data Storage |
| `HomePage.java` | Main application entry point & dashboard | View |
| `PlaceOrder.java` | Order creation form with validation | View |
| `Search*.java` | Search & analytics interfaces | View |
| `*Orders.java` | Status-specific order views | View |

### 🔢 **Status Constants**
```java
// Defined in Burger.java
public static final int CANCEL = 0;      // Cancelled orders
public static final int PROCESSING = 1;  // Active/Processing orders  
public static final int DELIVERED = 500; // Completed/Delivered orders
public static final int BURGER_PRICE = 500; // LKR per burger
```

### 📂 **Data Persistence**
Orders are stored in `Burger.txt` in CSV format:
```csv
B0001,0712345678,Pasindu,10,1
B0002,0712345687,Imalka,5,1
orderId,phoneNumber,customerName,quantity,status
```
- File is loaded on application startup using `List.loadDataFromFile("Burger.txt")`
- Orders persist between application sessionstation
├── 📄 LICENSE                           # MIT License
├── 📄 .gitignore                       # Git ignore patterns
├── 📄 build.xml                        # Ant build configuration
├── 📄 manifest.mf                      # JAR manifest
├── 📄 Burger.txt                       # Order data persistence file (CSV format)
│
├── 📁 src/main/                        # Source code directory
│   ├── 🍔 Burger.java                 # Core order model class with constants
│   ├── 📦 List.java                   # Dynamic array data structure & business logic
│   ├── 🏠 HomePage.java/.form         # Main application dashboard & entry pointSwing-GUI-orange?style=for-the-badge&logo=java&logoColor=white)
![FlatLaf](https://img.shields.io/badge/FlatLaf-3.6.1-blue?style=for-the-badge)
![NetBeans](https://img.shields.io/badge/NetBeans-IDE-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

*A comprehensive Java Swing desktop application for burger shop management with modern UI* 🏪

[Features](#-features) • [Installation](#-installation) • [Documentation](#-project-architecture) • [License](#-license)

</div>

---

## 📋 Table of Contents

- [🎯 Overview](#-overview)
- [✨ Key Features](#-key-features)
- [🛠️ Technologies & Dependencies](#️-technologies--dependencies)
- [📦 Installation](#-installation)
- [🚀 Getting Started](#-getting-started)
- [🏗️ Project Architecture](#️-project-architecture)
- [� User Interface Guide](#-user-interface-guide)
- [� OOP Principles Demonstrated](#-oop-principles-demonstrated)
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

### 🏢 **Real-World Application**
Complete burger shop management system featuring:
- Order lifecycle management (Place → Process → Deliver/Cancel)
- Customer information tracking with phone validation
- Real-time price calculation (LKR 500 per burger)
- Advanced search and analytics capabilities
- Automatic order ID generation

## ✨ Key Features

### � **Core Functionality**
- ✅ **Place Order**: Create new burger orders with customer validation
- ✅ **View Orders**: Browse and filter orders by status
- ✅ **Update Order**: Modify existing order quantities and details
- ✅ **Order Status Tracking**: 
  - 🔄 Processing Orders
  - ✅ Delivered Orders  
  - ❌ Cancelled Orders
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
- 📋 **Data Management**: In-memory storage with dynamic array implementation
- 🔐 **Input Validation**: Phone number format and duplicate detection
- 💰 **Price System**: Fixed pricing (LKR 500/burger) with automatic total calculation
- 🆔 **Auto ID Generation**: Sequential order IDs (B0001, B0002, ...)

## 🛠️ Technologies & Dependencies

| Technology | Purpose | Version |
|------------|---------|---------|
| ☕ **Java** | Core Programming Language | JDK 11 |
| 🖼️ **Java Swing** | GUI Framework | Built-in |
| 🎨 **FlatLaf** | Modern Look and Feel | 3.6.1 |
| 🎨 **FlatLaf IntelliJ Themes** | Additional UI Themes | 3.6.1 |
| 🏗️ **Apache Ant** | Build Automation | NetBeans bundled |
| � **NetBeans** | IDE & Form Designer | Latest |

### 📚 **External Libraries**
```
lib/
├── flatlaf-3.6.1.jar                    # Modern Look & Feel
└── flatlaf-intellij-themes-3.6.1.jar    # Theme extensions
```

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
   - Go to `File` → `Open Project`
   - Navigate to the cloned repository
   - Select the project and click "Open Project"

3. **🔧 Clean and Build**
   - Right-click on project in Project Explorer
   - Select `Clean and Build` (or press `Shift+F11`)
   - Wait for dependencies to resolve

4. **▶️ Run the Application**
   - Right-click on project
   - Select `Run` (or press `F6`)
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

## 🚀 Getting Started

### ⚡ **Quick Start Guide**

1. **🎬 Launch the Application**
   - Main Class: `main.HomePage`
   - FlatMac Light theme automatically applies
   - Welcome screen displays with burger icon

2. **� Main Dashboard Options**
   - **Place Order**: Create new customer orders
   - **Search**: Access search and analytics features
   - **View Orders**: Browse all orders with status filters
   - **Update Order**: Modify existing order details
   - **Exit**: Close application

3. **🍔 Creating an Order**
   ```
   1. Click "Place Order" button
   2. Enter customer phone (10 digits starting with 0)
   3. Enter/verify customer name
   4. Specify burger quantity
   5. Price automatically calculated (LKR 500/burger)
   6. Click "Place Order" to confirm
   ```

4. **🔍 Searching Orders**
   ```
   - Search by Order ID (B0001, B0002, etc.)
   - Search by Customer Phone Number
   - View Best Customer analytics
   ```

5. **📊 Managing Orders**
   ```
   - View Processing Orders
   - View Delivered Orders
   - View Cancelled Orders
   - Update order quantities
   ```

## 🏗️ Project Architecture

```
OOP-Swing-iHungry-BurgerShop/
│
├── 📄 README.md                         # Project documentation
├── 📄 LICENSE                           # MIT License
├── � .gitignore                       # Git ignore patterns
├── � build.xml                        # Ant build configuration
├── 📄 manifest.mf                      # JAR manifest
│
├── 📁 src/main/                        # Source code directory
│   ├── 🍔 Burger.java                 # Core order model class with constants
│   ├── 📦 List.java                   # Dynamic array data structure & business logic
│   ├── � HomePage.java/.form         # Main application dashboard
│   ├── � PlaceOrder.java/.form       # Order creation interface
│   ├── �️ ViewOrders.java/.form       # Order viewing with status filters
│   ├── ✏️ UpdateOrder.java/.form      # Order modification interface
│   ├── � ProcessingOrders.java/.form # Processing orders view
│   ├── ✅ DeliveredOrders.java/.form  # Delivered orders view
│   ├── ❌ CancelledOrders.java/.form  # Cancelled orders view
│   ├── 🔍 Search.java/.form           # Main search interface
│   ├── � SearchOrder.java/.form      # Order search by ID
│   ├── � SearchCustomer.java/.form   # Customer search by phone
│   ├── 🏆 SearchBestCustomer.java/.form # Customer analytics
│   └── 🖼️ burger.png                  # Application icon
│
├── 📁 lib/                             # External dependencies
│   ├── flatlaf-3.6.1.jar              # Modern Look and Feel
│   └── flatlaf-intellij-themes-3.6.1.jar # Theme extensions
│
├── 📁 nbproject/                       # NetBeans project configuration
│   ├── project.properties             # Build configuration
│   ├── build-impl.xml                 # Build implementation
│   └── private/                       # User-specific settings
│
├── 📁 build/                          # Compiled classes (auto-generated)
│   └── classes/main/                  # Compiled .class files
│
└── 📁 dist/                           # Distribution files
    └── OOP-iHungry-Swing.jar         # Executable JAR
```

### � **Key Components**

| Component | Description | Type |
|-----------|-------------|------|
| `Burger.java` | Order data model with customer info | Model |
| `BurgerCollection.java` | Order management & business logic | Controller |
| `HomePage.java` | Main application entry point | View |
| `PlaceOrder.java` | Order creation form | View |
| `Search*.java` | Search & analytics interfaces | View |
| `*Orders.java` | Status-specific order views | View |

## � User Interface Guide

### 🏠 **HomePage - Main Dashboard**
The application starts with a welcome screen featuring:
- 🍔 Burger icon with "Welcome to Burgers" message
- 🎨 Modern FlatMac Light theme
- 📋 Five main navigation buttons:
  - **Place Order** → Create new orders
  - **Search** → Access search features
  - **View Orders** → Browse all orders
  - **Update Order** → Modify existing orders
  - **Exit** → Close application

### � **Place Order Interface**
- Customer phone number input (10-digit validation)
- Customer name field (auto-fills for returning customers)
- Quantity selector
- Real-time price calculation display
- Order placement confirmation

### 🔍 **Search System**
1. **Search Best Customer**: Analytics showing top customers
2. **Search Order**: Find orders by Order ID
3. **Search Customer**: Find customers by phone number

### � **View Orders Interface**
Filter orders by status:
- **Processing Orders**: Active orders being prepared
- **Delivered Orders**: Successfully completed orders
- **Cancelled Orders**: Cancelled order history

### ✏️ **Update Order Interface**
- Search existing orders by ID
- Modify order quantities
- Real-time price recalculation
- Update confirmation

## � OOP Principles Demonstrated

### 🔒 **Encapsulation**
```java
// Burger class - Private fields with public accessors
public class Burger {
    private String orderId;
    private String customerId;
    private String customerName;
    private int orderQty;
    private int orderStatus;
    
    // Public getters and setters
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }
}
```
- ✅ Data hiding through private fields
- ✅ Controlled access via getter/setter methods
- ✅ Protection of internal object state

### 🏗️ **Abstraction**
```java
// List class - Complex operations simplified
public class List {
    private Burger[] burgerList;
    private int nextIndex;
    private double loadFact;
    
    // Abstract complex array management
    private void extendsArray() { /*...*/ }
    public String generateOrderId() { /*...*/ }
    public boolean placeOrder(Burger burger) { /*...*/ }
    public void loadDataFromFile(String fileName) { /*...*/ }
}
```
- ✅ Complex data structure operations hidden
- ✅ User-friendly public interface
- ✅ Implementation details concealed

### � **Composition**
```java
// HomePage contains BurgerCollection instance
public class HomePage extends JFrame {
    private BurgerCollection burgerCollection;
    
    public HomePage(BurgerCollection burgerCollection) {
        this.burgerCollection = burgerCollection;
    }
}
```
- ✅ "Has-a" relationships between classes
- ✅ Component-based architecture
- ✅ Shared state management across all views

### 📋 **Design Patterns**

#### **Model-View Pattern**
- **Model**: `Burger` (data model), `List` (data structure & business logic)
- **View**: `HomePage`, `PlaceOrder`, `Search*`, `*Orders` (UI components)
- Clear separation of concerns

#### **Data Structure Design**
- Custom dynamic array implementation with load factor
- Automatic resizing when capacity reached
- Efficient memory management

#### **Event-Driven Programming**
```java
// Button event handlers in GUI classes
private void btnPlaceOrderActionPerformed(ActionEvent evt) {
    this.dispose();
    new PlaceOrder(burgerList).setVisible(true);
}
```
- ✅ Observer pattern with Swing event listeners
- ✅ Loose coupling between components
- ✅ Responsive user interactions

## 📊 Business Logic

### 💰 **Pricing System**
```java
// Fixed burger price defined in Burger.java
public static final int BURGER_PRICE = 500; // LKR

// Dynamic total calculation
Total = Quantity × 500 LKR
```

### 🆔 **Order ID Generation**
```java
// Sequential auto-generated IDs in List.java
B0001 → B0002 → B0003 → B0004 ...

// Format: B + 4-digit zero-padded number
public String generateOrderId() {
    if (nextIndex == 0) return "B0001";
    String lastOrderId = burgerList[nextIndex - 1].getOrderId();
    int lastOrderIdNum = Integer.parseInt(lastOrderId.substring(1));
    return String.format("B%04d", lastOrderIdNum + 1);
}
```

### 📱 **Phone Validation Rules**
```java
// Implemented in List.isValidPhoneNumber()
✅ Must be exactly 10 digits
✅ Must start with 0
✅ Only numeric characters allowed
✅ Format: 0XXXXXXXXX (Sri Lankan phone number format)
```

### 📈 **Order Status Flow**
```
[PROCESSING (1)] → [DELIVERED (500)]
       ↓
  [CANCELLED (0)]
```
**Note**: DELIVERED status is uniquely set to `500` (same as BURGER_PRICE) in this implementation.

### 🔢 **Status Constants (from Burger.java)**
```java
public static final int CANCEL = 0;      // Cancelled orders
public static final int PROCESSING = 1;  // Active orders
public static final int DELIVERED = 500; // Completed orders
```

### 👥 **Customer Management**
- Duplicate phone number detection (`isDuplicateCustomer()`)
- Automatic name retrieval for returning customers (`getDuplicateCustomerName()`)
- Order history tracking per customer
- CSV file persistence for data storage

### 📂 **Data Persistence**
```java
// Load orders from file on startup
List burgerList = new List(100, 0.5);
burgerList.loadDataFromFile("Burger.txt");

// CSV Format: orderId,phone,name,qty,status
// Example: B0001,0712345678,Pasindu,10,1
```

---

## 🔧 Development

### 🛠️ **Build Commands**
```bash
# Clean previous builds
ant clean

# Compile source code
ant compile

# Run application
ant run

# Create distributable JAR
ant jar

# Full build and package
ant dist
```

### 🐛 **Debugging in NetBeans**
```bash
# Run with debugger
Right-click project → Debug (F5)

# Set breakpoints
Click line number in code editor

# Step through code
F7 (Step Into) | F8 (Step Over)
```

### 📝 **Code Style Guidelines**
- Follow Java naming conventions (camelCase, PascalCase)
- Use meaningful variable names
- Comment complex logic
- Maintain consistent indentation
- Keep methods focused and concise

---

## 🤝 Contributing

Contributions are welcome! 🌟

### **How to Contribute**

1. **🍴 Fork the Repository**
2. **🌿 Create Feature Branch**
   ```bash
   git checkout -b feature/amazing-feature
   ```
3. **💾 Commit Changes**
   ```bash
   git commit -m "Add amazing feature"
   ```
4. **📤 Push to Branch**
   ```bash
   git push origin feature/amazing-feature
   ```
5. **🔄 Open Pull Request**

### **📋 Guidelines**
- ✅ Follow existing code style
- ✅ Test all functionality
- ✅ Update documentation
- ✅ Maintain OOP principles
- ✅ Use meaningful commit messages

---

## 🎓 Learning Outcomes

### **Java Skills Demonstrated**
✅ Object-Oriented Programming (OOP)  
✅ Java Swing GUI Development  
✅ NetBeans Form Designer  
✅ Event-Driven Programming  
✅ Data Structure Implementation  
✅ Input Validation & Error Handling  
✅ Build Automation with Ant  
✅ Version Control with Git

### **Software Engineering Practices**
✅ Model-View separation  
✅ Code organization & modularity  
✅ Professional documentation  
✅ Modern UI/UX design  
✅ Business logic implementation

---

## 🚀 Future Enhancements

### **Potential Features**
- 💾 Database integration (MySQL/SQLite)
- 📊 Advanced reporting and charts
- 🖨️ Receipt printing functionality
- 👥 Multi-user authentication system
- 🌐 REST API integration
- 📱 Mobile companion app
- 💳 Payment gateway integration
- 📧 Email notifications

## 📄 License

This project is licensed under the **MIT License**.

```
MIT License

Copyright (c) 2025 PasinduOG

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

See [LICENSE](LICENSE) file for full details.

---

## 👨‍💻 Author

<div align="center">

**PasinduOG** 👋

[![GitHub](https://img.shields.io/badge/GitHub-PasinduOG-181717?style=for-the-badge&logo=github)](https://github.com/PasinduOG)
[![Email](https://img.shields.io/badge/Contact-via_GitHub-blue?style=for-the-badge&logo=gmail)](https://github.com/PasinduOG)

</div>

### 🌟 **Related Projects**
- 🍔 [iHungry-Shop](https://github.com/PasinduOG/iHungry-Shop) - Web-based version
- 🥘 [OOP-iHungry-Shop](https://github.com/PasinduOG/OOP-iHungry-Shop) - Console application

---

## 🙏 Acknowledgments

- **FlatLaf** - Modern Look and Feel for Java Swing ([FormDev](https://www.formdev.com/flatlaf/))
- **NetBeans** - Excellent IDE with Form Designer
- **Oracle Java** - Robust programming platform

---

## � Issues & Support

Found a bug or have a suggestion? 

- 📋 [Create an Issue](https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop/issues)
- � [Start a Discussion](https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop/discussions)

---

<div align="center">

### � **Star this repository if you found it helpful!** 🌟

**Made with ❤️ and Java ☕**

*iHungry Burger Shop - Where OOP meets real-world applications!* 🍔

---

### 🏷️ **Tags**

`java` `swing` `gui` `oop` `desktop-application` `burger-shop` `management-system` `netbeans` `flatlaf` `java-11` `object-oriented-programming` `coursework` `education` `portfolio`

---

📅 **Last Updated**: October 2025  
⭐ **Project Status**: Active & Complete  
🎓 **Purpose**: Educational & Portfolio

</div>
