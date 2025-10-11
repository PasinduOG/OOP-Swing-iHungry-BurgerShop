# 🍔 iHungry Burger Shop - OOP Swing Application# 🍔 iHungry Burger Shop - OOP Swing Application



<div align="center"><div align="center">



![Java](https://img.shields.io/badge/Java_11-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)![Java](https://img.shields.io/badge/Java_11-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

![Swing](https://img.shields.io/badge/Swing-GUI-orange?style=for-the-badge&logo=java&logoColor=white)![Swing](https://img.shields├── 📄 README.md                         # Proje### 📋 **Key Components**

![FlatLaf](https://img.shields.io/badge/FlatLaf-3.6.1-blue?style=for-the-badge)

![NetBeans](https://img.shields.io/badge/NetBeans-IDE-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)| Component | Description | Type |

![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)|-----------|-------------|------|

| `Burger.ja- ✅ Complex data structure operations hidden

*A comprehensive Java Swing desktop application for burger shop management with modern UI* 🏪- ✅ User-friendly public interface

- ✅ Implementation details concealed

[Features](#-key-features) • [Installation](#-installation) • [Documentation](#️-project-architecture) • [License](#-license)- ✅ Dynamic array resizing with load factor (50% expansion)

- ✅ File I/O abstraction for data persistence

</div>

### 🎯 **Composition**

---```java

// HomePage contains List instance

## 📋 Table of Contentspublic class HomePage extends JFrame {

    private List burgerList;

- [🎯 Overview](#-overview)    

- [✨ Key Features](#-key-features)    public HomePage(List burgerList) {

- [🛠️ Technologies & Dependencies](#️-technologies--dependencies)        this.burgerList = burgerList;data model with status constants | Model |

- [📦 Installation](#-installation)| `List.java` | Dynamic array with file I/O & business logic | Controller |

- [🚀 Getting Started](#-getting-started)| `Burger.txt` | CSV file for data persistence | Data Storage |

- [🏗️ Project Architecture](#️-project-architecture)| `HomePage.java` | Main application entry point & dashboard | View |

- [🎮 User Interface Guide](#-user-interface-guide)| `PlaceOrder.java` | Order creation form with validation | View |

- [💡 OOP Principles Demonstrated](#-oop-principles-demonstrated)| `Search*.java` | Search & analytics interfaces | View |

- [📊 Business Logic](#-business-logic)| `*Orders.java` | Status-specific order views | View |

- [🔧 Development](#-development)

- [🤝 Contributing](#-contributing)### 🔢 **Status Constants**

- [📄 License](#-license)```java

- [👨‍💻 Author](#-author)// Defined in Burger.java

public static final int CANCEL = 0;      // Cancelled orders

---public static final int PROCESSING = 1;  // Active/Processing orders  

public static final int DELIVERED = 500; // Completed/Delivered orders

## 🎯 Overviewpublic static final int BURGER_PRICE = 500; // LKR per burger

```

**iHungry Burger Shop** is a full-featured Java Swing desktop application that demonstrates advanced Object-Oriented Programming concepts through a real-world burger shop management system. Built with NetBeans IDE and styled with the modern FlatLaf Look & Feel library, this application showcases professional GUI development and solid OOP principles.

### 📂 **Data Persistence**

### 🎓 **Educational Value**Orders are stored in `Burger.txt` in CSV format:

This project serves as an excellent learning resource for:```csv

- Object-Oriented Programming (OOP) conceptsB0001,0712345678,Pasindu,10,1

- Java Swing GUI development with NetBeans Form DesignerB0002,0712345687,Imalka,5,1

- Event-driven programming patternsorderId,phoneNumber,customerName,quantity,status

- Modern UI design with FlatLaf themes```

- Build automation with Apache Ant- File is loaded on application startup using `List.loadDataFromFile("Burger.txt")`

- Data persistence with file I/O- Orders persist between application sessionstation

├── 📄 LICENSE                           # MIT License

### 🏢 **Real-World Application**├── 📄 .gitignore                       # Git ignore patterns

Complete burger shop management system featuring:├── 📄 build.xml                        # Ant build configuration

- Order lifecycle management (Place → Process → Deliver/Cancel)├── 📄 manifest.mf                      # JAR manifest

- Customer information tracking with phone validation├── 📄 Burger.txt                       # Order data persistence file (CSV format)

- Real-time price calculation (LKR 500 per burger)│

- Advanced search and analytics capabilities├── 📁 src/main/                        # Source code directory

- Automatic order ID generation│   ├── 🍔 Burger.java                 # Core order model class with constants

- File-based data persistence│   ├── 📦 List.java                   # Dynamic array data structure & business logic

│   ├── 🏠 HomePage.java/.form         # Main application dashboard & entry pointSwing-GUI-orange?style=for-the-badge&logo=java&logoColor=white)

---![FlatLaf](https://img.shields.io/badge/FlatLaf-3.6.1-blue?style=for-the-badge)

![NetBeans](https://img.shields.io/badge/NetBeans-IDE-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)

## ✨ Key Features![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)



### 🏠 **Core Functionality***A comprehensive Java Swing desktop application for burger shop management with modern UI* 🏪

- ✅ **Place Order**: Create new burger orders with customer validation

- ✅ **View Orders**: Browse and filter orders by status[Features](#-features) • [Installation](#-installation) • [Documentation](#-project-architecture) • [License](#-license)

- ✅ **Update Order**: Modify existing order quantities and details

- ✅ **Order Status Tracking**: </div>

  - 🔄 Processing Orders (Status: 1)

  - ✅ Delivered Orders (Status: 500)---

  - ❌ Cancelled Orders (Status: 0)

- ✅ **Search System**:## 📋 Table of Contents

  - 🔍 Search by Order ID

  - 👤 Search by Customer Phone- [🎯 Overview](#-overview)

  - 🏆 Best Customer Analytics- [✨ Key Features](#-key-features)

- [🛠️ Technologies & Dependencies](#️-technologies--dependencies)

### 🎨 **User Interface**- [📦 Installation](#-installation)

- 🖥️ **Modern GUI**: FlatMac Light theme for contemporary appearance- [🚀 Getting Started](#-getting-started)

- 🎯 **Intuitive Navigation**: Clean button-based menu system- [🏗️ Project Architecture](#️-project-architecture)

- 📱 **Responsive Layout**: NetBeans Form Designer generated layouts- [� User Interface Guide](#-user-interface-guide)

- 🍔 **Branded Design**: Custom burger icon and themed colors- [� OOP Principles Demonstrated](#-oop-principles-demonstrated)

- ⚡ **Real-time Updates**: Dynamic price calculation and form validation- [📊 Business Logic](#-business-logic)

- [🔧 Development](#-development)

### 🏗️ **Technical Features**- [🤝 Contributing](#-contributing)

- 🧩 **Pure OOP Design**: Encapsulation, abstraction, and composition patterns- [📄 License](#-license)

- 📋 **Data Management**: Custom dynamic array implementation with load factor- [👨‍💻 Author](#-author)

- 💾 **File Persistence**: CSV-based data storage (Burger.txt)

- 🔐 **Input Validation**: Phone number format and duplicate detection---

- 💰 **Price System**: Fixed pricing (LKR 500/burger) with automatic total calculation

- 🆔 **Auto ID Generation**: Sequential order IDs (B0001, B0002, ...)## 🎯 Overview



---**iHungry Burger Shop** is a full-featured Java Swing desktop application that demonstrates advanced Object-Oriented Programming concepts through a real-world burger shop management system. Built with NetBeans IDE and styled with the modern FlatLaf Look & Feel library, this application showcases professional GUI development and solid OOP principles.



## 🛠️ Technologies & Dependencies### 🎓 **Educational Value**

This project serves as an excellent learning resource for:

| Technology | Purpose | Version |- Object-Oriented Programming (OOP) concepts

|------------|---------|---------|- Java Swing GUI development with NetBeans Form Designer

| ☕ **Java** | Core Programming Language | JDK 11 |- Event-driven programming patterns

| 🖼️ **Java Swing** | GUI Framework | Built-in |- Modern UI design with FlatLaf themes

| 🎨 **FlatLaf** | Modern Look and Feel | 3.6.1 |- Build automation with Apache Ant

| 🎨 **FlatLaf IntelliJ Themes** | Additional UI Themes | 3.6.1 |

| 🏗️ **Apache Ant** | Build Automation | NetBeans bundled |### 🏢 **Real-World Application**

| 💻 **NetBeans** | IDE & Form Designer | Latest |Complete burger shop management system featuring:

- Order lifecycle management (Place → Process → Deliver/Cancel)

### 📚 **External Libraries**- Customer information tracking with phone validation

```- Real-time price calculation (LKR 500 per burger)

lib/- Advanced search and analytics capabilities

├── flatlaf-3.6.1.jar                    # Modern Look & Feel- Automatic order ID generation

└── flatlaf-intellij-themes-3.6.1.jar    # Theme extensions

```## ✨ Key Features



---### � **Core Functionality**

- ✅ **Place Order**: Create new burger orders with customer validation

## 📦 Installation- ✅ **View Orders**: Browse and filter orders by status

- ✅ **Update Order**: Modify existing order quantities and details

### 📋 **Prerequisites**- ✅ **Order Status Tracking**: 

- ☕ **Java Development Kit (JDK) 11 or higher**  - 🔄 Processing Orders

- 💻 **NetBeans IDE** (recommended for Form Designer support)  - ✅ Delivered Orders  

- 🔧 **Apache Ant** (bundled with NetBeans)  - ❌ Cancelled Orders

- 🌐 **Git** (for version control)- ✅ **Search System**:

  - 🔍 Search by Order ID

### 🚀 **Installation Steps**  - 👤 Search by Customer Phone

  - 🏆 Best Customer Analytics

#### **Method 1: NetBeans IDE (Recommended)**

### 🎨 **User Interface**

1. **📥 Clone the Repository**- 🖥️ **Modern GUI**: FlatMac Light theme for contemporary appearance

   ```bash- 🎯 **Intuitive Navigation**: Clean button-based menu system

   git clone https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop.git- 📱 **Responsive Layout**: NetBeans Form Designer generated layouts

   cd OOP-Swing-iHungry-BurgerShop- 🍔 **Branded Design**: Custom burger icon and themed colors

   ```- ⚡ **Real-time Updates**: Dynamic price calculation and form validation



2. **📂 Open in NetBeans**### 🏗️ **Technical Features**

   - Launch NetBeans IDE- 🧩 **Pure OOP Design**: Encapsulation, abstraction, and composition patterns

   - Go to `File` → `Open Project`- 📋 **Data Management**: In-memory storage with dynamic array implementation

   - Navigate to the cloned repository- 🔐 **Input Validation**: Phone number format and duplicate detection

   - Select the project and click "Open Project"- 💰 **Price System**: Fixed pricing (LKR 500/burger) with automatic total calculation

- 🆔 **Auto ID Generation**: Sequential order IDs (B0001, B0002, ...)

3. **🔧 Clean and Build**

   - Right-click on project in Project Explorer## 🛠️ Technologies & Dependencies

   - Select `Clean and Build` (or press `Shift+F11`)

   - Wait for dependencies to resolve| Technology | Purpose | Version |

|------------|---------|---------|

4. **▶️ Run the Application**| ☕ **Java** | Core Programming Language | JDK 11 |

   - Right-click on project| 🖼️ **Java Swing** | GUI Framework | Built-in |

   - Select `Run` (or press `F6`)| 🎨 **FlatLaf** | Modern Look and Feel | 3.6.1 |

   - Application launches with HomePage| 🎨 **FlatLaf IntelliJ Themes** | Additional UI Themes | 3.6.1 |

| 🏗️ **Apache Ant** | Build Automation | NetBeans bundled |

#### **Method 2: Command Line (Apache Ant)**| � **NetBeans** | IDE & Form Designer | Latest |



1. **📥 Clone the Repository**### 📚 **External Libraries**

   ```bash```

   git clone https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop.gitlib/

   cd OOP-Swing-iHungry-BurgerShop├── flatlaf-3.6.1.jar                    # Modern Look & Feel

   ```└── flatlaf-intellij-themes-3.6.1.jar    # Theme extensions

```

2. **🔧 Build the Project**

   ```bash## 📦 Installation

   ant clean compile

   ```### 📋 **Prerequisites**

- ☕ **Java Development Kit (JDK) 11 or higher**

3. **▶️ Run the Application**- 💻 **NetBeans IDE** (recommended for Form Designer support)

   ```bash- 🔧 **Apache Ant** (bundled with NetBeans)

   ant run- 🌐 **Git** (for version control)

   ```

### 🚀 **Installation Steps**

4. **📦 Create Distributable JAR**

   ```bash#### **Method 1: NetBeans IDE (Recommended)**

   ant jar

   # Output: dist/OOP-iHungry-Swing.jar1. **📥 Clone the Repository**

   ```   ```bash

   git clone https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop.git

---   cd OOP-Swing-iHungry-BurgerShop

   ```

## 🚀 Getting Started

2. **📂 Open in NetBeans**

### ⚡ **Quick Start Guide**   - Launch NetBeans IDE

   - Go to `File` → `Open Project`

1. **🎬 Launch the Application**   - Navigate to the cloned repository

   - Main Class: `main.HomePage`   - Select the project and click "Open Project"

   - FlatMac Light theme automatically applies

   - Data loads from `Burger.txt` file3. **🔧 Clean and Build**

   - Welcome screen displays with burger icon   - Right-click on project in Project Explorer

   - Select `Clean and Build` (or press `Shift+F11`)

2. **📋 Main Dashboard Options**   - Wait for dependencies to resolve

   - **Place Order**: Create new customer orders

   - **Search**: Access search and analytics features4. **▶️ Run the Application**

   - **View Orders**: Browse all orders with status filters   - Right-click on project

   - **Update Order**: Modify existing order details   - Select `Run` (or press `F6`)

   - **Exit**: Close application   - Application launches with HomePage



3. **🍔 Creating an Order**#### **Method 2: Command Line (Apache Ant)**

   ```

   1. Click "Place Order" button1. **📥 Clone the Repository**

   2. Enter customer phone (10 digits starting with 0)   ```bash

   3. Enter/verify customer name (auto-fills for returning customers)   git clone https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop.git

   4. Specify burger quantity   cd OOP-Swing-iHungry-BurgerShop

   5. Price automatically calculated (LKR 500/burger)   ```

   6. Click "Place Order" to confirm

   7. Order saved to Burger.txt automatically2. **🔧 Build the Project**

   ```   ```bash

   ant clean compile

4. **🔍 Searching Orders**   ```

   ```

   - Search by Order ID (B0001, B0002, etc.)3. **▶️ Run the Application**

   - Search by Customer Phone Number   ```bash

   - View Best Customer analytics   ant run

   ```   ```



5. **📊 Managing Orders**4. **📦 Create Distributable JAR**

   ```   ```bash

   - View Processing Orders (Status: 1)   ant jar

   - View Delivered Orders (Status: 500)   # Output: dist/OOP-iHungry-Swing.jar

   - View Cancelled Orders (Status: 0)   ```

   - Update order quantities and details

   ```## 🚀 Getting Started



---### ⚡ **Quick Start Guide**



## 🏗️ Project Architecture1. **🎬 Launch the Application**

   - Main Class: `main.HomePage`

```   - FlatMac Light theme automatically applies

OOP-Swing-iHungry-BurgerShop/   - Welcome screen displays with burger icon

│

├── 📄 README.md                         # Project documentation2. **� Main Dashboard Options**

├── 📄 LICENSE                           # MIT License   - **Place Order**: Create new customer orders

├── 📄 .gitignore                       # Git ignore patterns   - **Search**: Access search and analytics features

├── 📄 build.xml                        # Ant build configuration   - **View Orders**: Browse all orders with status filters

├── 📄 manifest.mf                      # JAR manifest   - **Update Order**: Modify existing order details

├── 📄 Burger.txt                       # Order data persistence file (CSV)   - **Exit**: Close application

│

├── 📁 src/main/                        # Source code directory3. **🍔 Creating an Order**

│   ├── 🍔 Burger.java                 # Core order model class with constants   ```

│   ├── 📦 List.java                   # Dynamic array data structure & business logic   1. Click "Place Order" button

│   ├── 🏠 HomePage.java/.form         # Main application dashboard & entry point   2. Enter customer phone (10 digits starting with 0)

│   ├── 📋 PlaceOrder.java/.form       # Order creation interface   3. Enter/verify customer name

│   ├── 👁️ ViewOrders.java/.form       # Order viewing with status filters   4. Specify burger quantity

│   ├── ✏️ UpdateOrder.java/.form      # Order modification interface   5. Price automatically calculated (LKR 500/burger)

│   ├── 🔄 ProcessingOrders.java/.form # Processing orders view (status = 1)   6. Click "Place Order" to confirm

│   ├── ✅ DeliveredOrders.java/.form  # Delivered orders view (status = 500)   ```

│   ├── ❌ CancelledOrders.java/.form  # Cancelled orders view (status = 0)

│   ├── 🔍 Search.java/.form           # Main search interface4. **🔍 Searching Orders**

│   ├── 🔎 SearchOrder.java/.form      # Order search by ID   ```

│   ├── 👤 SearchCustomer.java/.form   # Customer search by phone   - Search by Order ID (B0001, B0002, etc.)

│   ├── 🏆 SearchBestCustomer.java/.form # Customer analytics   - Search by Customer Phone Number

│   └── 🖼️ burger.png                  # Application icon   - View Best Customer analytics

│   ```

├── 📁 lib/                             # External dependencies

│   ├── flatlaf-3.6.1.jar              # Modern Look and Feel5. **📊 Managing Orders**

│   └── flatlaf-intellij-themes-3.6.1.jar # Theme extensions   ```

│   - View Processing Orders

├── 📁 nbproject/                       # NetBeans project configuration   - View Delivered Orders

│   ├── project.properties             # Build configuration   - View Cancelled Orders

│   ├── build-impl.xml                 # Build implementation   - Update order quantities

│   └── private/                       # User-specific settings   ```

│

├── 📁 build/                          # Compiled classes (auto-generated)## 🏗️ Project Architecture

│   └── classes/main/                  # Compiled .class files

│```

└── 📁 dist/                           # Distribution filesOOP-Swing-iHungry-BurgerShop/

    └── OOP-iHungry-Swing.jar         # Executable JAR│

```├── 📄 README.md                         # Project documentation

├── 📄 LICENSE                           # MIT License

### 📋 **Key Components**├── � .gitignore                       # Git ignore patterns

├── � build.xml                        # Ant build configuration

| Component | Description | Type |├── 📄 manifest.mf                      # JAR manifest

|-----------|-------------|------|│

| `Burger.java` | Order data model with status constants | Model |├── 📁 src/main/                        # Source code directory

| `List.java` | Dynamic array with file I/O & business logic | Controller |│   ├── 🍔 Burger.java                 # Core order model class with constants

| `Burger.txt` | CSV file for data persistence | Data Storage |│   ├── 📦 List.java                   # Dynamic array data structure & business logic

| `HomePage.java` | Main application entry point & dashboard | View |│   ├── � HomePage.java/.form         # Main application dashboard

| `PlaceOrder.java` | Order creation form with validation | View |│   ├── � PlaceOrder.java/.form       # Order creation interface

| `Search*.java` | Search & analytics interfaces | View |│   ├── �️ ViewOrders.java/.form       # Order viewing with status filters

| `*Orders.java` | Status-specific order views | View |│   ├── ✏️ UpdateOrder.java/.form      # Order modification interface

│   ├── � ProcessingOrders.java/.form # Processing orders view

### 🔢 **Status Constants**│   ├── ✅ DeliveredOrders.java/.form  # Delivered orders view

```java│   ├── ❌ CancelledOrders.java/.form  # Cancelled orders view

// Defined in Burger.java│   ├── 🔍 Search.java/.form           # Main search interface

public static final int CANCEL = 0;      // Cancelled orders│   ├── � SearchOrder.java/.form      # Order search by ID

public static final int PROCESSING = 1;  // Active/Processing orders  │   ├── � SearchCustomer.java/.form   # Customer search by phone

public static final int DELIVERED = 500; // Completed/Delivered orders│   ├── 🏆 SearchBestCustomer.java/.form # Customer analytics

public static final int BURGER_PRICE = 500; // LKR per burger│   └── 🖼️ burger.png                  # Application icon

```│

├── 📁 lib/                             # External dependencies

### 📂 **Data Persistence**│   ├── flatlaf-3.6.1.jar              # Modern Look and Feel

Orders are stored in `Burger.txt` in CSV format:│   └── flatlaf-intellij-themes-3.6.1.jar # Theme extensions

```csv│

B0001,0712345678,Pasindu,10,1├── 📁 nbproject/                       # NetBeans project configuration

B0002,0712345687,Imalka,5,1│   ├── project.properties             # Build configuration

B0003,0718762345,Sabith,0,0│   ├── build-impl.xml                 # Build implementation

B0004,0725733695,Maalik,15,500│   └── private/                       # User-specific settings

orderId,phoneNumber,customerName,quantity,status│

```├── 📁 build/                          # Compiled classes (auto-generated)

- File is loaded on application startup using `List.loadDataFromFile("Burger.txt")`│   └── classes/main/                  # Compiled .class files

- Orders persist between application sessions│

└── 📁 dist/                           # Distribution files

---    └── OOP-iHungry-Swing.jar         # Executable JAR

```

## 🎮 User Interface Guide

### � **Key Components**

### 🏠 **HomePage - Main Dashboard**

The application starts with a welcome screen featuring:| Component | Description | Type |

- 🍔 Burger icon with "Welcome to Burgers" message|-----------|-------------|------|

- 🎨 Modern FlatMac Light theme| `Burger.java` | Order data model with customer info | Model |

- 📋 Five main navigation buttons:| `BurgerCollection.java` | Order management & business logic | Controller |

  - **Place Order** → Create new orders| `HomePage.java` | Main application entry point | View |

  - **Search** → Access search features| `PlaceOrder.java` | Order creation form | View |

  - **View Orders** → Browse all orders| `Search*.java` | Search & analytics interfaces | View |

  - **Update Order** → Modify existing orders| `*Orders.java` | Status-specific order views | View |

  - **Exit** → Close application

## � User Interface Guide

### 📋 **Place Order Interface**

- Customer phone number input (10-digit validation)### 🏠 **HomePage - Main Dashboard**

- Customer name field (auto-fills for returning customers)The application starts with a welcome screen featuring:

- Quantity selector- 🍔 Burger icon with "Welcome to Burgers" message

- Real-time price calculation display (LKR 500 × quantity)- 🎨 Modern FlatMac Light theme

- Order placement confirmation- 📋 Five main navigation buttons:

- Automatic order ID generation  - **Place Order** → Create new orders

  - **Search** → Access search features

### 🔍 **Search System**  - **View Orders** → Browse all orders

1. **Search Best Customer**: Analytics showing top customers by order value  - **Update Order** → Modify existing orders

2. **Search Order**: Find orders by Order ID (e.g., B0001)  - **Exit** → Close application

3. **Search Customer**: Find customers by phone number

### � **Place Order Interface**

### 📊 **View Orders Interface**- Customer phone number input (10-digit validation)

Filter orders by status:- Customer name field (auto-fills for returning customers)

- **Processing Orders**: Active orders being prepared (Status: 1)- Quantity selector

- **Delivered Orders**: Successfully completed orders (Status: 500)- Real-time price calculation display

- **Cancelled Orders**: Cancelled order history (Status: 0)- Order placement confirmation



### ✏️ **Update Order Interface**### 🔍 **Search System**

- Search existing orders by Order ID1. **Search Best Customer**: Analytics showing top customers

- Modify order quantities2. **Search Order**: Find orders by Order ID

- Real-time price recalculation3. **Search Customer**: Find customers by phone number

- Update confirmation with validation

### � **View Orders Interface**

---Filter orders by status:

- **Processing Orders**: Active orders being prepared

## 💡 OOP Principles Demonstrated- **Delivered Orders**: Successfully completed orders

- **Cancelled Orders**: Cancelled order history

### 🔒 **Encapsulation**

```java### ✏️ **Update Order Interface**

// Burger class - Private fields with public accessors- Search existing orders by ID

public class Burger {- Modify order quantities

    private String orderId;- Real-time price recalculation

    private String customerId;- Update confirmation

    private String customerName;

    private int orderQty;## � OOP Principles Demonstrated

    private int orderStatus;

    ### 🔒 **Encapsulation**

    // Public getters and setters```java

    public String getOrderId() { return orderId; }// Burger class - Private fields with public accessors

    public void setOrderId(String orderId) { this.orderId = orderId; }public class Burger {

    // ... more getters/setters    private String orderId;

}    private String customerId;

```    private String customerName;

- ✅ Data hiding through private fields    private int orderQty;

- ✅ Controlled access via getter/setter methods    private int orderStatus;

- ✅ Protection of internal object state    

    // Public getters and setters

### 🏗️ **Abstraction**    public String getOrderId() { return orderId; }

```java    public void setOrderId(String orderId) { this.orderId = orderId; }

// List class - Complex operations simplified}

public class List {```

    private Burger[] burgerList;- ✅ Data hiding through private fields

    private int nextIndex;- ✅ Controlled access via getter/setter methods

    private double loadFact;- ✅ Protection of internal object state

    

    // Abstract complex array management### 🏗️ **Abstraction**

    private void extendsArray() { /*...*/ }```java

    public String generateOrderId() { /*...*/ }// List class - Complex operations simplified

    public boolean placeOrder(Burger burger) { /*...*/ }public class List {

    public void loadDataFromFile(String fileName) { /*...*/ }    private Burger[] burgerList;

}    private int nextIndex;

```    private double loadFact;

- ✅ Complex data structure operations hidden    

- ✅ User-friendly public interface    // Abstract complex array management

- ✅ Implementation details concealed    private void extendsArray() { /*...*/ }

- ✅ Dynamic array resizing with load factor (50% expansion)    public String generateOrderId() { /*...*/ }

- ✅ File I/O abstraction for data persistence    public boolean placeOrder(Burger burger) { /*...*/ }

    public void loadDataFromFile(String fileName) { /*...*/ }

### 🎯 **Composition**}

```java```

// HomePage contains List instance- ✅ Complex data structure operations hidden

public class HomePage extends JFrame {- ✅ User-friendly public interface

    private List burgerList;- ✅ Implementation details concealed

    

    public HomePage(List burgerList) {### � **Composition**

        this.burgerList = burgerList;```java

    }// HomePage contains BurgerCollection instance

}public class HomePage extends JFrame {

```    private BurgerCollection burgerCollection;

- ✅ "Has-a" relationships between classes    

- ✅ Component-based architecture    public HomePage(BurgerCollection burgerCollection) {

- ✅ Shared state management across all views        this.burgerCollection = burgerCollection;

    }

### 📋 **Design Patterns**}

```

#### **Model-View Pattern**- ✅ "Has-a" relationships between classes

- **Model**: `Burger` (data model), `List` (data structure & business logic)- ✅ Component-based architecture

- **View**: `HomePage`, `PlaceOrder`, `Search*`, `*Orders` (UI components)- ✅ Shared state management across all views

- Clear separation of concerns

### 📋 **Design Patterns**

#### **Data Structure Design**

- Custom dynamic array implementation with load factor#### **Model-View Pattern**

- Automatic resizing when capacity reached- **Model**: `Burger` (data model), `List` (data structure & business logic)

- Efficient memory management- **View**: `HomePage`, `PlaceOrder`, `Search*`, `*Orders` (UI components)

- Clear separation of concerns

#### **Event-Driven Programming**

```java#### **Data Structure Design**

// Button event handlers in GUI classes- Custom dynamic array implementation with load factor

private void btnPlaceOrderActionPerformed(ActionEvent evt) {- Automatic resizing when capacity reached

    this.dispose();- Efficient memory management

    new PlaceOrder(burgerList).setVisible(true);

}#### **Event-Driven Programming**

``````java

- ✅ Observer pattern with Swing event listeners// Button event handlers in GUI classes

- ✅ Loose coupling between componentsprivate void btnPlaceOrderActionPerformed(ActionEvent evt) {

- ✅ Responsive user interactions    this.dispose();

    new PlaceOrder(burgerList).setVisible(true);

---}

```

## 📊 Business Logic- ✅ Observer pattern with Swing event listeners

- ✅ Loose coupling between components

### 💰 **Pricing System**- ✅ Responsive user interactions

```java

// Fixed burger price defined in Burger.java## 📊 Business Logic

public static final int BURGER_PRICE = 500; // LKR

### 💰 **Pricing System**

// Dynamic total calculation```java

Total = Quantity × 500 LKR// Fixed burger price defined in Burger.java

```public static final int BURGER_PRICE = 500; // LKR



### 🆔 **Order ID Generation**// Dynamic total calculation

```javaTotal = Quantity × 500 LKR

// Sequential auto-generated IDs in List.java```

B0001 → B0002 → B0003 → B0004 ...

### 🆔 **Order ID Generation**

// Format: B + 4-digit zero-padded number```java

public String generateOrderId() {// Sequential auto-generated IDs in List.java

    if (nextIndex == 0) return "B0001";B0001 → B0002 → B0003 → B0004 ...

    String lastOrderId = burgerList[nextIndex - 1].getOrderId();

    int lastOrderIdNum = Integer.parseInt(lastOrderId.substring(1));// Format: B + 4-digit zero-padded number

    return String.format("B%04d", lastOrderIdNum + 1);public String generateOrderId() {

}    if (nextIndex == 0) return "B0001";

```    String lastOrderId = burgerList[nextIndex - 1].getOrderId();

    int lastOrderIdNum = Integer.parseInt(lastOrderId.substring(1));

### 📱 **Phone Validation Rules**    return String.format("B%04d", lastOrderIdNum + 1);

```java}

// Implemented in List.isValidPhoneNumber()```

✅ Must be exactly 10 digits

✅ Must start with 0### 📱 **Phone Validation Rules**

✅ Only numeric characters allowed```java

✅ Format: 0XXXXXXXXX (Sri Lankan phone number format)// Implemented in List.isValidPhoneNumber()

```✅ Must be exactly 10 digits

✅ Must start with 0

### 📈 **Order Status Flow**✅ Only numeric characters allowed

```✅ Format: 0XXXXXXXXX (Sri Lankan phone number format)

[PROCESSING (1)] → [DELIVERED (500)]```

       ↓

  [CANCELLED (0)]### 📈 **Order Status Flow**

``````

**Note**: DELIVERED status is uniquely set to `500` (same as BURGER_PRICE) in this implementation.[PROCESSING (1)] → [DELIVERED (500)]

       ↓

### 🔢 **Status Constants (from Burger.java)**  [CANCELLED (0)]

```java```

public static final int CANCEL = 0;      // Cancelled orders**Note**: DELIVERED status is uniquely set to `500` (same as BURGER_PRICE) in this implementation.

public static final int PROCESSING = 1;  // Active orders

public static final int DELIVERED = 500; // Completed orders### 🔢 **Status Constants (from Burger.java)**

``````java

public static final int CANCEL = 0;      // Cancelled orders

### 👥 **Customer Management**public static final int PROCESSING = 1;  // Active orders

- Duplicate phone number detection (`isDuplicateCustomer()`)public static final int DELIVERED = 500; // Completed orders

- Automatic name retrieval for returning customers (`getDuplicateCustomerName()`)```

- Order history tracking per customer

- CSV file persistence for data storage### 👥 **Customer Management**

- Duplicate phone number detection (`isDuplicateCustomer()`)

### 📂 **Data Persistence**- Automatic name retrieval for returning customers (`getDuplicateCustomerName()`)

```java- Order history tracking per customer

// Load orders from file on startup- CSV file persistence for data storage

List burgerList = new List(100, 0.5);

burgerList.loadDataFromFile("Burger.txt");### 📂 **Data Persistence**

```java

// CSV Format: orderId,phone,name,qty,status// Load orders from file on startup

// Example: B0001,0712345678,Pasindu,10,1List burgerList = new List(100, 0.5);

```burgerList.loadDataFromFile("Burger.txt");



---// CSV Format: orderId,phone,name,qty,status

// Example: B0001,0712345678,Pasindu,10,1

## 🔧 Development```



### 🛠️ **Build Commands**---

```bash

# Clean previous builds## 🔧 Development

ant clean

### 🛠️ **Build Commands**

# Compile source code```bash

ant compile# Clean previous builds

ant clean

# Run application

ant run# Compile source code

ant compile

# Create distributable JAR

ant jar# Run application

ant run

# Full build and package

ant dist# Create distributable JAR

```ant jar



### 🐛 **Debugging in NetBeans**# Full build and package

```bashant dist

# Run with debugger```

Right-click project → Debug (F5)

### 🐛 **Debugging in NetBeans**

# Set breakpoints```bash

Click line number in code editor# Run with debugger

Right-click project → Debug (F5)

# Step through code

F7 (Step Into) | F8 (Step Over)# Set breakpoints

```Click line number in code editor



### 📝 **Code Style Guidelines**# Step through code

- Follow Java naming conventions (camelCase, PascalCase)F7 (Step Into) | F8 (Step Over)

- Use meaningful variable names```

- Comment complex logic

- Maintain consistent indentation### 📝 **Code Style Guidelines**

- Keep methods focused and concise- Follow Java naming conventions (camelCase, PascalCase)

- Use meaningful variable names

---- Comment complex logic

- Maintain consistent indentation

## 🤝 Contributing- Keep methods focused and concise



Contributions are welcome! 🌟---



### **How to Contribute**## 🤝 Contributing



1. **🍴 Fork the Repository**Contributions are welcome! 🌟

2. **🌿 Create Feature Branch**

   ```bash### **How to Contribute**

   git checkout -b feature/amazing-feature

   ```1. **🍴 Fork the Repository**

3. **💾 Commit Changes**2. **🌿 Create Feature Branch**

   ```bash   ```bash

   git commit -m "Add amazing feature"   git checkout -b feature/amazing-feature

   ```   ```

4. **📤 Push to Branch**3. **💾 Commit Changes**

   ```bash   ```bash

   git push origin feature/amazing-feature   git commit -m "Add amazing feature"

   ```   ```

5. **🔄 Open Pull Request**4. **📤 Push to Branch**

   ```bash

### **📋 Guidelines**   git push origin feature/amazing-feature

- ✅ Follow existing code style   ```

- ✅ Test all functionality5. **🔄 Open Pull Request**

- ✅ Update documentation

- ✅ Maintain OOP principles### **📋 Guidelines**

- ✅ Use meaningful commit messages- ✅ Follow existing code style

- ✅ Test all functionality

---- ✅ Update documentation

- ✅ Maintain OOP principles

## 🎓 Learning Outcomes- ✅ Use meaningful commit messages



### **Java Skills Demonstrated**---

✅ Object-Oriented Programming (OOP)  

✅ Java Swing GUI Development  ## 🎓 Learning Outcomes

✅ NetBeans Form Designer  

✅ Event-Driven Programming  ### **Java Skills Demonstrated**

✅ Custom Data Structure Implementation  ✅ Object-Oriented Programming (OOP)  

✅ File I/O and Data Persistence  ✅ Java Swing GUI Development  

✅ Input Validation & Error Handling  ✅ NetBeans Form Designer  

✅ Build Automation with Ant  ✅ Event-Driven Programming  

✅ Version Control with Git✅ Data Structure Implementation  

✅ Input Validation & Error Handling  

### **Software Engineering Practices**✅ Build Automation with Ant  

✅ Model-View separation  ✅ Version Control with Git

✅ Code organization & modularity  

✅ Professional documentation  ### **Software Engineering Practices**

✅ Modern UI/UX design  ✅ Model-View separation  

✅ Business logic implementation✅ Code organization & modularity  

✅ Professional documentation  

---✅ Modern UI/UX design  

✅ Business logic implementation

## 🚀 Future Enhancements

---

### **Potential Features**

- 💾 Database integration (MySQL/SQLite)## 🚀 Future Enhancements

- 📊 Advanced reporting and charts

- 🖨️ Receipt printing functionality### **Potential Features**

- 👥 Multi-user authentication system- 💾 Database integration (MySQL/SQLite)

- 🌐 REST API integration- 📊 Advanced reporting and charts

- 📱 Mobile companion app- 🖨️ Receipt printing functionality

- 💳 Payment gateway integration- 👥 Multi-user authentication system

- 📧 Email notifications- 🌐 REST API integration

- 🔄 Real-time order status updates- 📱 Mobile companion app

- 💳 Payment gateway integration

---- 📧 Email notifications



## 📄 License## 📄 License



This project is licensed under the **MIT License**.This project is licensed under the **MIT License**.



``````

MIT LicenseMIT License



Copyright (c) 2025 PasinduOGCopyright (c) 2025 PasinduOG



Permission is hereby granted, free of charge, to any person obtaining a copyPermission is hereby granted, free of charge, to any person obtaining a copy

of this software and associated documentation files (the "Software"), to dealof this software and associated documentation files (the "Software"), to deal

in the Software without restriction, including without limitation the rightsin the Software without restriction, including without limitation the rights

to use, copy, modify, merge, publish, distribute, sublicense, and/or sellto use, copy, modify, merge, publish, distribute, sublicense, and/or sell

copies of the Software, and to permit persons to whom the Software iscopies of the Software, and to permit persons to whom the Software is

furnished to do so, subject to the following conditions:furnished to do so, subject to the following conditions:



The above copyright notice and this permission notice shall be included in allThe above copyright notice and this permission notice shall be included in all

copies or substantial portions of the Software.copies or substantial portions of the Software.



THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS ORTHE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR

IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,

FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THEFITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE

AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHERAUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER

LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,

OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THEOUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE

SOFTWARE.SOFTWARE.

``````



See [LICENSE](LICENSE) file for full details.See [LICENSE](LICENSE) file for full details.



------



## 👨‍💻 Author## 👨‍💻 Author



<div align="center"><div align="center">



**PasinduOG** 👋**PasinduOG** 👋



[![GitHub](https://img.shields.io/badge/GitHub-PasinduOG-181717?style=for-the-badge&logo=github)](https://github.com/PasinduOG)[![GitHub](https://img.shields.io/badge/GitHub-PasinduOG-181717?style=for-the-badge&logo=github)](https://github.com/PasinduOG)

[![Email](https://img.shields.io/badge/Contact-via_GitHub-blue?style=for-the-badge&logo=gmail)](https://github.com/PasinduOG)[![Email](https://img.shields.io/badge/Contact-via_GitHub-blue?style=for-the-badge&logo=gmail)](https://github.com/PasinduOG)



</div></div>



### 🌟 **Related Projects**### 🌟 **Related Projects**

- 🍔 [iHungry-Shop](https://github.com/PasinduOG/iHungry-Shop) - Web-based version- 🍔 [iHungry-Shop](https://github.com/PasinduOG/iHungry-Shop) - Web-based version

- 🥘 [OOP-iHungry-Shop](https://github.com/PasinduOG/OOP-iHungry-Shop) - Console application- 🥘 [OOP-iHungry-Shop](https://github.com/PasinduOG/OOP-iHungry-Shop) - Console application



------



## 🙏 Acknowledgments## 🙏 Acknowledgments



- **FlatLaf** - Modern Look and Feel for Java Swing ([FormDev](https://www.formdev.com/flatlaf/))- **FlatLaf** - Modern Look and Feel for Java Swing ([FormDev](https://www.formdev.com/flatlaf/))

- **NetBeans** - Excellent IDE with Form Designer- **NetBeans** - Excellent IDE with Form Designer

- **Oracle Java** - Robust programming platform- **Oracle Java** - Robust programming platform



------



## 🐛 Issues & Support## � Issues & Support



Found a bug or have a suggestion? Found a bug or have a suggestion? 



- 📋 [Create an Issue](https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop/issues)- 📋 [Create an Issue](https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop/issues)

- 💬 [Start a Discussion](https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop/discussions)- � [Start a Discussion](https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop/discussions)



------



<div align="center"><div align="center">



### 🌟 **Star this repository if you found it helpful!** 🌟### � **Star this repository if you found it helpful!** 🌟



**Made with ❤️ and Java ☕****Made with ❤️ and Java ☕**



*iHungry Burger Shop - Where OOP meets real-world applications!* 🍔*iHungry Burger Shop - Where OOP meets real-world applications!* 🍔



------



### 🏷️ **Tags**### 🏷️ **Tags**



`java` `swing` `gui` `oop` `desktop-application` `burger-shop` `management-system` `netbeans` `flatlaf` `java-11` `object-oriented-programming` `coursework` `education` `portfolio``java` `swing` `gui` `oop` `desktop-application` `burger-shop` `management-system` `netbeans` `flatlaf` `java-11` `object-oriented-programming` `coursework` `education` `portfolio`



------



📅 **Last Updated**: October 2025  📅 **Last Updated**: October 2025  

⭐ **Project Status**: Active & Complete  ⭐ **Project Status**: Active & Complete  

🎓 **Purpose**: Educational & Portfolio🎓 **Purpose**: Educational & Portfolio



</div></div>

