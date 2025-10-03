# 🍔 iHungry Burger Shop - OOP Swing Application

A comprehensive Java Swing-based burger shop management system built using Object-Oriented Programming principles. This desktop application provides a complete solution for managing burger shop operations including order management, customer tracking, and business analytics.

## 📋 Project Overview

iHungry Burger Shop is a full-featured desktop application that demonstrates advanced OOP concepts through a real-world burger shop management scenario. The application provides intuitive GUI interfaces for managing orders, customers, and business operations with modern UI styling using FlatLaf themes.

## ✨ Key Features

### 🏠 **Core Functionality**
- **Order Management System**: Complete order lifecycle management
- **Customer Management**: Track customer information and order history
- **Order Status Tracking**: Real-time order status updates (Processing → Delivered → Cancelled)
- **Search & Analytics**: Advanced search functionality and customer analytics
- **Modern UI**: Clean, modern interface with FlatLaf Mac Light theme

### 🎯 **Specific Features**
- **Place Order**: Create new burger orders with customer details
- **View Orders**: Comprehensive order viewing and management
- **Update Orders**: Modify existing order details
- **Order Status Management**:
  - Processing Orders view
  - Delivered Orders tracking
  - Cancelled Orders management
- **Advanced Search**:
  - Search orders by various criteria
  - Customer search functionality
  - Best customer analytics
- **Business Intelligence**: Customer behavior analysis and reporting

## 🛠️ Technologies & Dependencies

### **Core Technologies**
- **Language:** Java (JDK 8+)
- **GUI Framework:** Java Swing with NetBeans GUI Builder
- **IDE:** NetBeans IDE
- **Build System:** Apache Ant (build.xml)

### **External Libraries**
- **FlatLaf 3.6.1** - Modern Look and Feel for Java Swing
- **FlatLaf IntelliJ Themes 3.6.1** - Additional theme support

## 📁 Project Architecture

```
OOP-Swing-iHungry-BurgerShop/
│
├── src/main/                      # Source code directory
│   ├── Burger.java               # Core burger order model class
│   ├── BurgerCollection.java     # Collection management for orders
│   ├── HomePage.java/.form       # Main application dashboard
│   ├── PlaceOrder.java/.form     # Order placement interface
│   ├── ViewOrders.java/.form     # Order viewing interface
│   ├── UpdateOrder.java/.form    # Order modification interface
│   ├── ProcessingOrders.java/.form # Processing orders management
│   ├── DeliveredOrders.java/.form  # Delivered orders tracking
│   ├── CancelledOrders.java/.form  # Cancelled orders management
│   ├── Search.java/.form         # Main search interface
│   ├── SearchOrder.java/.form    # Order search functionality
│   ├── SearchCustomer.java/.form # Customer search functionality
│   ├── SearchBestCustomer.java/.form # Customer analytics
│   └── burger.png               # Application icon/imagery
│
├── lib/                          # External dependencies
│   ├── flatlaf-3.6.1.jar       # Modern Look and Feel library
│   └── flatlaf-intellij-themes-3.6.1.jar # Theme extensions
│
├── nbproject/                    # NetBeans project configuration
├── build/                       # Compiled classes (auto-generated)
├── build.xml                    # Ant build configuration
├── manifest.mf                  # JAR manifest file
└── .gitignore                   # Git ignore patterns
```

## 🚀 Getting Started

### Prerequisites

- **Java Development Kit (JDK) 8 or higher**
- **NetBeans IDE** (recommended for development)
- **Git** (for version control)

### Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop.git
   cd OOP-Swing-iHungry-BurgerShop
   ```

2. **Open in NetBeans:**
   - Launch NetBeans IDE
   - File → Open Project
   - Navigate to the cloned repository folder
   - Select and open the project
   - NetBeans will automatically configure the classpath and dependencies

3. **Build the project:**
   - In NetBeans: Right-click project → Clean and Build
   - Or via command line: `ant clean compile`

4. **Run the application:**
   - In NetBeans: Right-click project → Run (or press F6)
   - Or via command line: `ant run`

### Alternative Setup (Command Line)

```bash
# Build the application
ant clean compile

# Run the application
ant run

# Create distributable JAR
ant jar
```

## 🏗️ Object-Oriented Architecture

This project exemplifies solid OOP principles:

### **Core OOP Principles Demonstrated**

#### 🔒 **Encapsulation**
- **Burger Class**: Private fields with public getter/setter methods
- **Data Protection**: All model classes properly encapsulate their data
- **Access Control**: Controlled access to internal state through methods

#### 🏗️ **Abstraction**
- **GUI Abstraction**: Complex Swing operations abstracted into user-friendly interfaces
- **Business Logic Separation**: Clear separation between UI and business logic
- **Collection Management**: Abstract data handling through BurgerCollection class

#### 🔄 **Composition & Aggregation**
- **Component Relationships**: HomePage contains references to various functional components
- **Collection Management**: BurgerCollection manages multiple Burger instances
- **UI Components**: Form classes compose multiple Swing components

#### 📋 **Design Patterns**
- **Model-View Pattern**: Clear separation between data models (Burger) and view components
- **Factory Pattern**: Object creation patterns for GUI components
- **Observer Pattern**: Event-driven programming with Swing event listeners

## 🎮 User Interface Guide

### **Main Navigation (HomePage)**
- **Place Order**: Create new customer orders
- **Search**: Access various search functionalities
- **View Orders**: Browse all orders in the system
- **Update Order**: Modify existing order details
- **Exit**: Close the application

### **Order Management Workflow**
1. **Create**: Use "Place Order" to add new orders
2. **Track**: Monitor order status (Processing → Delivered/Cancelled)
3. **Update**: Modify order details as needed
4. **Analyze**: Use search functions for business insights

## 🔍 Advanced Features

### **Search Capabilities**
- **Order Search**: Find orders by ID, customer, or status
- **Customer Search**: Locate customer information and history
- **Best Customer Analytics**: Identify top customers by order frequency/value

### **Order Status Management**
- **Processing Orders**: Active orders being prepared
- **Delivered Orders**: Completed successful orders
- **Cancelled Orders**: Cancelled or failed orders

## 🧪 Testing & Development

### **Development Workflow**
```bash
# Clean previous builds
ant clean

# Compile with debug information
ant compile

# Run with debugging
ant debug

# Create distribution
ant dist
```

### **Code Quality**
- **NetBeans Form Designer**: GUI components built with visual designer
- **Event-Driven Architecture**: Proper event handling throughout the application
- **Error Handling**: Comprehensive error handling in UI operations

## ⚡ Performance & Optimization

### **Application Performance**
- **Efficient Data Structures**: Optimized collection management for order handling
- **GUI Responsiveness**: Non-blocking UI operations with proper event handling
- **Memory Management**: Efficient object lifecycle management

### **UI/UX Enhancements**
- **Modern Look & Feel**: FlatLaf provides contemporary UI styling
- **Responsive Design**: Adaptive layouts for different screen sizes
- **Intuitive Navigation**: User-friendly interface design

## 📚 Learning Outcomes

This project demonstrates mastery of:

### **Java Programming Concepts**
- ✅ Object-Oriented Programming (OOP) principles
- ✅ Java Swing GUI development
- ✅ Event-driven programming
- ✅ Collection framework usage
- ✅ Package organization and structure

### **Software Development Practices**
- ✅ MVC (Model-View-Controller) pattern implementation
- ✅ Code organization and modularity
- ✅ GUI design with NetBeans Form Designer
- ✅ Build automation with Apache Ant
- ✅ Version control with Git

### **Real-World Application Development**
- ✅ Business logic implementation
- ✅ Data persistence simulation
- ✅ User interface design principles
- ✅ Error handling and validation
- ✅ Application deployment and distribution

## 🛠️ Development Setup

### **IDE Configuration**
```bash
# NetBeans-specific files (auto-configured)
nbproject/project.properties  # Project configuration
nbproject/build-impl.xml      # Build implementation
lib/nblibraries.properties    # Library definitions
```

### **Build Configuration**
```xml
<!-- build.xml - Main build targets -->
ant clean      # Clean previous builds
ant compile    # Compile source code
ant run        # Run application
ant jar        # Create distributable JAR
ant dist       # Create distribution package
```

## 🔧 Troubleshooting

### **Common Issues & Solutions**

#### **Build Issues**
```bash
# If build fails, clean and rebuild
ant clean
ant compile

# Check Java version compatibility
java -version
javac -version
```

#### **Runtime Issues**
- **Missing Libraries**: Ensure FlatLaf JARs are in lib/ directory
- **ClassPath Issues**: Use NetBeans to manage classpath automatically
- **GUI Rendering**: Verify Java Swing compatibility with your OS

#### **NetBeans Setup**
- **Project Import**: Use "Open Project" not "Open Files"
- **Library Path**: NetBeans automatically manages lib/ folder
- **Form Designer**: .form files are NetBeans-specific GUI layouts

## 🚀 Deployment

### **Creating Executable JAR**
```bash
# Build distributable version
ant dist

# JAR file will be created in dist/ directory
# Include lib/ folder when distributing
```

### **Distribution Package**
When sharing the application:
1. Include the main JAR file
2. Include lib/ directory with dependencies
3. Provide Java runtime requirements
4. Include basic usage instructions

## 🎓 Educational Value

### **For Students Learning OOP**
- **Practical Application**: Real-world OOP implementation
- **Design Patterns**: Observable patterns in GUI development
- **Code Structure**: Professional-level code organization
- **Best Practices**: Industry-standard development practices

### **For Java GUI Development**
- **Swing Mastery**: Comprehensive Swing component usage
- **Event Handling**: Professional event-driven programming
- **Modern UI**: Contemporary look and feel implementation
- **Form Design**: NetBeans Form Designer proficiency

## 🤝 Contributing

We welcome contributions to improve the iHungry Burger Shop application!

### **How to Contribute**
1. **Fork the repository**
2. **Create your feature branch**: `git checkout -b feature/AmazingFeature`
3. **Follow coding standards**: Maintain existing code style and OOP principles
4. **Test thoroughly**: Ensure all functionality works as expected
5. **Commit your changes**: `git commit -m 'Add some AmazingFeature'`
6. **Push to the branch**: `git push origin feature/AmazingFeature`
7. **Open a Pull Request**: Describe your changes and their benefits

### **Contribution Guidelines**
- Follow Java naming conventions
- Maintain OOP principles in new code
- Update documentation for new features
- Test all GUI functionality before submitting
- Respect the existing project structure

## 👨‍💻 Author & Acknowledgments

### **Primary Developer**
**PasinduOG**
- GitHub: [@PasinduOG](https://github.com/PasinduOG)
- Project: Object-Oriented Programming Coursework
- Institution: [Your Institution Name]

### **Technologies Acknowledgment**
- **Oracle Java**: Core programming language and Swing framework
- **FlatLaf**: Modern Look and Feel library by FormDev
- **NetBeans**: Integrated Development Environment
- **Apache Ant**: Build automation tool

## 🔗 Related Projects

Explore other projects in the iHungry series:
- 🍔 [iHungry-Shop](https://github.com/PasinduOG/iHungry-Shop) - Web-based version
- 🥘 [OOP-iHungry-Shop](https://github.com/PasinduOG/OOP-iHungry-Shop) - Console application
- 🍕 [OOP-Swing-iHungry-BurgerShop](https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop) - This desktop application

## � License

This project is developed for educational purposes as part of an Object-Oriented Programming coursework. It is available under the MIT License - see the [LICENSE](LICENSE) file for details.

### **Usage Rights**
- ✅ Use for educational purposes
- ✅ Modify and distribute
- ✅ Commercial use (with attribution)
- ✅ Private use

## 🐛 Issues & Support

### **Getting Help**
- 📋 [Create an Issue](https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop/issues/new) for bugs or feature requests
- 💬 [Start a Discussion](https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop/discussions) for questions or ideas
- 📧 Contact the author for academic inquiries

### **Issue Guidelines**
When reporting issues, please include:
- Java version and operating system
- Steps to reproduce the problem
- Expected vs actual behavior
- Screenshots (for GUI issues)
- Error messages or stack traces

---

## 🌟 Project Status & Future Enhancements

### **Current Status: ✅ Complete & Functional**
- ✅ Core functionality implemented
- ✅ Modern UI with FlatLaf integration
- ✅ Comprehensive order management
- ✅ Advanced search capabilities
- ✅ Full OOP implementation

### **Potential Future Enhancements**
- 🔄 Database integration (MySQL/SQLite)
- 📊 Advanced reporting and analytics
- 🌐 Network/multi-user support
- 📱 Mobile companion app
- 🔐 User authentication system
- 💳 Payment processing integration

---

⭐ **Don't forget to star this repository if you found it helpful for your OOP learning journey!**

📚 **Perfect for:** Java students, OOP learners, Swing GUI enthusiasts, and software development portfolios.
