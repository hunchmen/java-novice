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














