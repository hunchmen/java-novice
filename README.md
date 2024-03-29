# java-novice
## Java Basics Fundamentals

What is Programming Language?
> A means to define a set of instruction to carry out a task\
> A formal language with its own vocabulary and syntax\
> Used to implement algorithms

Java Programming Language
> An object-oriented, class-based programming language designed to have as few implementation dependecies as possible.

Object-oriented Language
> Each entity is an object containing fields and methods.
>>* Fields(also called attributes or properties) describe an object\
>>> Ex: name, date of birth of an customer

>>* Methods(functions) enable operations using objects.
>>> Ex: getName() or getDateOfBirth()

Class-based Language
> A type of object-oriented programming language that uses classes to define sets of objects.\
>* A class is a generic definition of an entity while an object is an instance of that entity
>>* A class defines what fields and methods are required for a customer.
>>* Objects represent specific customer(Alice, Bob, etc)

>* Classes enable the encapsulation of associated fields and methods.
>* Classes may permit inheritance

Platform-independent
> Java programs run on most operating systems and are not tied to specific hardware.

>* Java programs can run on Linux, Windows, macOS, etc.
>* Programs don't run directly on the OS, but in a Java Virtual Machine(JVM)
>* There are JVMs available for most platforms.
>* Java programs run on any JVM - regardless of underlying OS

Java Terminology
>* Source code: the set of instruction written by the developer
>* Compiler: converts source code into Java Bytecode
>* Bytecode: the which can be executed in a Java virtual machine(JVM)

Java Properties
>* statically typed
>* is usually just-in time compiled
>* includes a variety of built-in libraries
>* has a built-in garbage collector
>* has a number of related languages

Java Libraries
>* The JRE includes a Java Class Library(JCL) that the JVM can call
>* A library is a collection of commonly used programming resources
>* The JCL contains a number of different packages:
>>* java.lang contains basic classes and interfaces(e.g., Object, Thread)
>>* java.math includes common math operations
>>* java.text helps interact with SQL databases

Java Garbage Collection
>* Java's automatic garbage collector periodically cleans up unused objects
>* A process that scans heap memory and identifies unused objects
>* an unsused object is one that is not referenced by any part of a running program
>* Un-referenced objects are deleted and the resources they consumed are available for other objects
>* prevents users from having to explicitly free up resources
>* add some overhead, but pros nearly always outweigh costs

JVM Languages
>* Several languages have compilers that translate their source code int JVM bytecode
>* JVM languages typically have syntax very similar to Java
>>* **Groovy** is a dynamic programming and scripting language
>>* **Scala** is a functional programming language
>>* **Kotlin** is commonly used in Android app development
>>* **Clojure** is a dynamic language related to Lisp
>* Knowing Java makes it very easy to learn these languages

Benefits of Java
>* Programs are easy to write, compile, debug and run
>* Being object-oriented enables code-reusability
>* Code is platform-independent
>* Automatic garbage collection allows developers to focus on business logic
>* Improved performance with multi-threading

The limitations of Java
>* Performance may not match languages that compile to native code, like C/C++
>* static typing limits flexibility

Applications of Java
>* scientific applications: NLP, math operations
>* web programming: through JSP, servlets and struts
>* Big data: hadoop is written in Java
>* GUI development: with Swing, JavaFX
>* Mobile apps: android studio and kotlin
>* Game development: jMonkeyEngine
>* Distributed computing: with JDBC, MPI, etc
>* ETL: various platforms use JAVA

Java for Web Development
>* servlets to respond to HTTP requests
>* Java Server Pages(JSP) contain HTML and Java
>* Spring is a framework that simplifies the building of complex web apps

The Springframework for Web Apps
>* Simplifies server-side development
>* eliminates need for boiler-plate code and configurations
>* enables the development of Rest APIs
>* streamlines data access to
>>* relational and NoSQL DBs
>>* cloud-based data services, and
>>* MapReduce frameworks

Java for Big Data
>* Apache Hadoop and most tools in its ecosystem are written in Java
>* Apache Spark contains APIs for big data and is written in Scala and Java libraries
>* Apache Kafka is used for realtime data and messaging and is written in Java and Scala

Java for Mobile Apps
>* Java was originally Google's preferred language for Android app development and is still supported
>* the current preferred language is Kotlin - which is a JVM language
>* Kotlin is fully interoperable with Java

Classes
>* a mold for a basic building block, a mold from which objects can be cast
>* a template or building block that represents entities or "objects" in the real world(type of an object)

Object-Oriented Programming
>* a programming paradigm based on the concepts of "objects", which can contain data and code, and objects have types and those types are classes.

Member Variables
>* also refers as instance variables, associated with individual objects of the class, every object is going to have its own copy.

Static Variables
>* also refers as class variable, associated with the class itself, which means there is just one copy of a static variable for all object of a class

The "this" keyword
>* special reference to a particular object from within the object itself

Methods
>* define the behavior of a class and the actions it can perform

Inheritance
>* models entities using an is-a relationship
>* One class that extends or inherits from another class is known as inheritance
>* a class is open for extension but close in modification

Composition
>* member variables of one class contained within another class is known as composition
>* is meant for has-a relationship

Polymorphism
>* to have methods or behavior with the same name exhibit different behavior
>* the ability of an object to behave in multiple ways

Encapsulation
>* to have a single object hold data and behavior
>* data associated with an object of a class is hidden within the class
>* and should only be accessed using the method of the class

Constructors in Polymorphism
<br />
![alt text](resources/images/constructor_polymophism_overview.png)


>* In polymorphism, the extends keyword is used to create a subclass that inherits from a superclass, while the implements keyword is used to specify that a class adheres to a particular interface.
>* abstract class cannot be instantiated but can be extend
>* 'final' keyword to a class makes the class un-extendible

Access modifiers
>* 'public' can be accessed by other class or anywhere
>* 'protected' can be access by the same package and sub-class
>* 'private' can only be accessed within the class where it is declared
>* 'default' can be access within the same package

Interfaces
>* any method declared in interface is public
>* member variables in interface is always public static final
>* can create a method with body in interface using static and default keyword














