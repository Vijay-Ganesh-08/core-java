# Core Java Tutorial - Contains basic Java Concepts

`JDK (Java Development Kit)`
 * This is the complete set of tools for creating Java applications. 
 * It includes the JRE (Java Runtime Environment), plus additional tools like a compiler (javac) and debugger, which are necessary for development. 

`JRE (Java Runtime Environment)`
 * This package provides the environment needed to run Java applications. 
 * It includes the JVM (Java Virtual Machine) and the necessary class libraries. 

`JVM (Java Virtual Machine)`
 * This is the core engine that interprets and executes Java bytecode, which is the compiled form of Java source code. 
 * The JVM allows Java programs to run on any platform that has a JVM installed, making Java platform-independent. 

`First Java Code`
 * System.out is an output stream which connects to consoler/terminal
 * println is used to print the content and a new line.
 * print is used to print the content and will allow you to append text.
 * main method is the starting point of the java program and its mandatory.
 * any method defined should be done through class and the name of the class should be same as file name

`Variables`
 * Variables are used to store the data temporarily in-order to process the data for required output
 * Strongly typed Language - Int/Double/String/Array etc
 * This defines the storage type for the variables
 * Variables created inside the class is called instance variable
 * Variables created inside the method is called local variable
 * Static variable is shared across the class, once changed will affect all objects of that class

`Data Types`
 * Primitive - Int/Float/Char/Boolean - value itself is stored in stack
 * Int - byte/short/int/long - Long comes with suffix l at the value (ex: long l1 = 12345l)
 * Float - Float/Double (decimal values) float comes with suffix f at the value (ex: float f1 = 123.45f)
 * Non-Primitive - String/Arrays/Object/Class - value is stored in heap and its reference is stored in stack

`Type Casting`
 * Casting - Explicit Conversion (Ex: Int to Short/Byte)
 * Convertion - Implicit Conversion (Ex : Short to Int/Long)
 * Type Promotion - Promoting the type to bigger range when it exceeds

`Assignment Operators`
 * Operators which are used to assign values to an Variable and Manipulation
 * Incremental and Decremental operators are specific to single variables
 * Arithmetic Operators are used to process the data and perform Arithmetic Operations

`Relational Operators`
 * Relational Operators are used to compare 2 values
 * `<` (Lesser Than), `>` (Greater Than)
 * `>=` (Lesser or Equal), `<=` (Greater or Equal)
 * `==` (Equals To), `!=` (Not Equals To)
 * Output of RelationOperators is Boolean (true/false)

`Logical Operators`
 * Logical Operators are used to compare multiple variables/conditions
 * Output of LogicalOperators is Boolean (true/false)
 * && (Logical AND), || (Logical OR), ! (Logical NOT)
 * `&&` - Returns True only if All Conditions Results TRUE else FALSE
 * `||` - Returns Trus if any one of the Conditions Results TRUE else FALSE
 * `!`- Returns the reversed result (TRUE to FALSE or FALSE to TRUE)

`If..Else`
 * Decision making statements based on the outcome of conditions
 * Conditional statements helps to execute the piece of code
 * if..else helps us with conditional statements in java

`If..Else..If`
 * Decision making statements based on the outcome of conditions
 * Conditional statements helps to execute the piece of code
 * if..else..if..else helps us with multiple conditional statements in java

`Ternary Operator`
 * Ternary Operator is used to simplify if..else statement into a Single line
 * Syntax result = (Condition) ? true : false

`Switch Statement`
 * Switch Statement is used when you are aware of the possible outputs 
 * And need to perform set of action based on specific output.
 * Break is mandatory to skip other cases instead of executing all other cases once matched.

`While Loop`
 * Loops are used when you want to iterate set of statements based on condition and to stop at some point
 * While - Checks the condition and executes until the conditions are matched/true

`Do..While Loop`
 * Loops are used when you want to iterate set of statements based on condition and to stop at some point
 * Do-While - Executes at least once and until the conditions are matched

`For Loop`
 * Loops are used when you want to iterate set of statements based on condition and to stop at some point
 * For Loops is used when you have finite loop meaning, you know the iteration count
 * Ex. Reading the Array with the length of Array as limit etc.

`Method overloading`
 * Method overloading is done to update the version of the methods in the same class
 * Method overloading is nothing but we have same method names but different behaviors
 * Can be done with different num of parameters/order of parameters

`Arrays`
 * Storing multiple values of same type into a single variable
 * Stored in Heap memory, Size once declared cannot be modified.

`MultiDimentional Arrays`
 * MultiDimentional Array is an Array of Arrays with fixed size/length of same type

`Jagged Arrays`
 * JaggedArrays is an Array of Arrays with different size/length of same type

`ForEach Loop`
 * ForEach is basically used in collections
 * Its an enhanced ForLoop, It iterates through Array and gives the value of each index

`String Class`
 * String is stored in both Stack (Refs to Heap Location) and Heap (Value of String)
 * Any Update done to a String variable creates a new location in Heap and updates the Refs in Stack
 * When same value is assigned to different variable, it has different variables in stack but pointing to same Refs in Heap
 * Immutable - Something cannot be changed , String is immutable in nature.
 * Muttable - Something can be changed , StringBuilder and StringBuffer
 * StringBuffer - Thread Safe
 * StringBuilder - Not Thread Safe

`Static Keyword`
 * Static properties are shared to the entire class
 * Static variables to be called via class (ClassName.StaticVariable)
 * Static variables can be used in Non-Static Method

`Static Block`
 * Static Block can be used to initialise the static members of a class
 * When a object is created the class gets loaded and then the class members are instatiated
 * Static Block will be executed once at the time of class getting loaded
 * Constructor will be executed everytime an object is created for that class
 * Unless the Object is created, it will not load the class or instantiate the members of the class
 * Class.forName(<<ClassName>>) can be used to load the class to execute the static block of the class

`Static Method`
 * Non-Static members cannot be used in static method
 * its a restriction to avoid confusion with non-static variables based on object since each object will have different values
 * Main is marked as static since its the starting point of program and without static the class will not be loaded and main will not be executed

`Encapsulation`
 * Encapsulation is nothing but to capusle the resoures of programs
 * Applied to class members or methods to restrict the usage from outside
 * Private is applied to variables to restrict the direct usage 
 * Private variable can be accessed only through Methods.

`This Keyword`
 * This Keyword is used to differentiate the Instance and Local variable
 * This KeyWord refers to the Instance variables of the current Object

`Constructors`
 * Constructors are used to initialize the instance variables
 * By Default when a Object is created the class Constructor is called to initialize the variables
 * Constructors name should same as Class name
 * Constructors can be parameterized and its Constructor Overloading

`Super keyword`
 * Super keywords is default in java which calls the constructor of parent class
 * this() is used to excecute the constructor of the same class and will be useful when the parameterized constructor is in use.

`Inheritance`
 * Inheriting properties of a class by other class called Inheritance
 * Class which is getting inherited is called Parent/Super/Base Class
 * Class which is inheriting from other class is called Child/Sub/Derived Class
 * extends is the keyword is used to implement Inheritance
 * Multilevel Inheritance will work Ex : Class C extends Class B extends Class A
 * Multiple Inheritance will not work Ec : Class C extends both Class B and Class A

`Method Overriding`
 * MethodOverriding is concept of overriding the implementation of a same method 
 * which is available in both Parent and Child Class

`Access Modifiers`
`Public`
 * Same Class --> Yes
 * Same Package SubClass --> Yes
 * Same Package Non-SubClass --> Yes
 * Different Package SubClass --> Yes
 * Different Package Non-SubClass --> Yes

`Private`
 * Same Class --> Yes
 * Same Package SubClass --> No
 * Same Package Non-SubClass --> No
 * Different Package SubClass --> No
 * Different Package Non-SubClass --> No

`Protected`
 * Same Class --> Yes
 * Same Package SubClass --> Yes
 * Same Package Non-SubClass --> Yes
 * Different Package SubClass --> Yes
 * Different Package Non-SubClass --> No

`Default`
 * Same Class --> Yes
 * Same Package SubClass --> Yes
 * Same Package Non-SubClass --> Yes
 * Different Package SubClass --> No
 * Different Package Non-SubClass --> No

`Polymorphism`
 * Poly - Many 
 * Morphism - Behavior
 * A Method has different behaviors/functionality
 * Compile Time : Method Overloading, behavior is decided at the compile time itself.
 * Run Time : Method Overriding, behavior is decided at the run time based on execution.

`Dynamic Method Dispatch`
 * DynamicMethodDispatch is used to implement RunTime Polymorphism
 * Which method of which class to be implemented at the RunTime
 * Allows to create a Reference Object of Parent class for Child Class
 * Ex. ParenClass Obj = new ChildClass(); --> Used to access the Child Class Methods
 * Not Allows to create a Reference Object of Child class for Parent Class
 * Ex. ChildClass Obj = new ParenClass(); --> Since Child Class already has visibility of Parent Class

`Final Keyword`
 * Final Keyword can be used at property/method/class
 * Final keyword is used to make something constant which will not change
 * Final keyword used on variable is to restrict any modification to its values and make it a constant
 * Final keyword used on class is to restrict/stop inheritance
 * Final Keyword used on method is to restrict/stop Method Overriding

`Up and Down Casting`
 * Up and DownCasting is possible with the Objects to the class which is inherited
 * UpCasting Creating a Object of type SuperClass and referencing to ChildClass
 * DownCasting Creating a Object of type ChildClass and referencing to ParentClass

`Abstract keyword`
 * Abstract keyword is used to declare a method/class which should be implemented by Sub/Child Class
 * Abstract class can contain Abstract and Non-Abstract methods and there's no compuslion to have only abstract methods
 * Abstract methods can be defined only inside Abstract Class
 * Objects cannot be created for an Abstract class
 * All abstract methods should implemented by the Sub/Child class.

`Inner Class`
 * Class inside a class is called InnerClass or Nested Class
 * Inner class can be instatiated with OuterClass Object and Reference
 * static keyword can be used only in the inner class and not for outer class

`Anonymous Class`
 * Anonymous class is to change the implementation of class for only once.
 * This is done at the time of Object instantiating and it will execute the newer implementation.

`Anonymous Abstract Class`
 * Anonymous class is to change the implementation of class for only once.
 * This is done at the time of Object instantiating and it will execute the newer implementation.
 * Its is possbile to implement this type in Abstract class

`Interface`
 * Interface is nothing but an abstract class which is full of abstract methods
 * Interface is not a class like abstract, its a type of class itself
 * By Default every method in Interface is public abstract - meaning any class inherits should implement all the methods inside interface
 * Abstract is implemented using extend keyword, interface is done with implements keyword
 * A class can inherit from only 1 abstract class but many interface
 * Like Abstract, interface cannot be instantiated
 * Any Variables created in interface is final and static by default

`Enum Class`
 * Enum (Enumeration) class is nothing but a class contains named Constants
 * Like class Enum can have constructors, parameterized constructors and properties.

`Annotations in Java`
 * Extra Information provided to the compiler to perform the action effectively. 
 * Annotations helps to identify any bug or error at the compile time itself

`Functional Interface`
 * FunctionalInterface is implemented to an interface which has only 1 declared method similar to Anonymous Class
 * @FunctionalInterface annotation can be used to notify the compiler and restrict creating more methods

`Lambda Expression`
 * Lambda Expression is introduced in Java 8
 * Lambda Expression can be implemented only with Functional Interface (which has only 1 method)
 * Lambda expression is simplified implementation of Functional Interface
 * Curly Braces is used to implement multiple Lines
 * Single line implementation can be done at the object initialisation itself

`Exception Handling`
 * Exceptions are nothing but the error which occured while executing the Program
 * Types of Errors:
 * Compile Time Error : Errors occured at the time of compiling the Program
 * Ex : Syntax Error, TypeCasting Error etc
 * Run Time Error : When the expected output is not acheived and it stops the execution
 * Ex : File not found at the execution time, Connection to DB error, Array Index 
 * Logical Error : Error with the logic implemented.
 * Ex : 2+2 = 4 but implemented as 2+2=5
 * All RunTime Exceptions are UnChecked Exceptions (Ex. NullPointer, ArrayIndex, Arithmetic etc), its developer's responsibility to handle the exception.
 * Checked Exceptions are Possible Exceptions which can impact the execution (IO, SQL Exception etc), compiler will force you to handle the exception.
 * Exceptions are Run Time Errors occured in the program.
 * Try block is used to execute the critical statement which has potentials to through exception
 * Catch block is used to catch the exception thrown by try block and handles it
 * Finally block is used to execute set of statement irrespective of exception is being throw or not
 * usually finally block is used to close the resources like IO stream, Scanner etc

 `Throws & Throws`
 * Throw Keyword is used to throw the exception manually
 * Throws Keyword is used at the method level to indicate the compiler that the method execution could possibly throw a type of exception.
 * The Calling method should catch the type of exceptions which is mentioned after Throws Keyword
 * Throws is majorly used for Checked Exception (IO, SQL Connection etc)
 * Throws is not recommended to implement in MAIN class, it will stop the execution

`Custom Exception`
 * Custom Exceptions are used to Customize the exceptions based on business needs
 * Class which extends Exception class is called Custom Exception

`Scanner class`
 * Scanner class is used to get the input from the user.
 * Scanner object needs to be closed once done with the program.

 `Try With Resources`
 * Try With Resources is used to Auto Close the resources which is used in the try block
 * Its not necessary that every Try should have catch block
 * Finally block can be avoided since the resources are auto closed

`Threads in Java`
 * Threads are used to perform multiple task at the same time
 * Threads flows cannot be defined but the priority can be set
 * Class extending Thread is considered as Threads by default
 * Thread class must contain public void run method
 * class.start() is used to execute the run methods from the Thread class.
 * Thread Priority 10-Max 5-Normal 1-Min, Priority is used to suggest the OS Scheduler to set the Execution Priority
 * Thread Sleep is to let the scheduler to wait for Execution when you want other thread to execute

`Runnable Threads`
 * Thread is implemented by Runnable interface by default
 * if a class implements Runnable and when Thread needs to be involved it can be done only by Thread object.
 * Runnable Threads can be implemented using Anonymous Class and Lambda Expression

`Thread Safe`
 * Thread.Join() is used when we want the main Thread needs to wait until the class thread is executed
 * Removing thread.join() from the below code will print some value since the main thread is ended as soon as Thread is started is called
 * Keeping thread.join() from the below code will print some value since the main thread will wait until Threads are executed
 * 
 * synchronized keyword is used to a method to restrict mutiple thread accessing at the same time

`Thread States`
 * New - When the Thread is initialized with a Object
 * Runnable - When the Method start() is executed
 * Running - When the Method run() is executed
 * Waiting - When the Method sleep() or wait() is executed and needs to used notify() along with it restart the execution which happens internally
 * Dead - When the Method stop() --> Not recommended, as it auto processing

`Collections`
 * Collection API --> Concept
 * Collection --> Interface
 * Collections --> Class
 * Collections is used to store multiple values
 * Data Structure : Stack - Last In First Out ; Queue - First In First Out
 * If need to access the collection with Index Values use List Reference Object else Collection, set
 * Unlike Array, Collections will allow to print the list values in [] braces , seperated by default
 * List will allow duplicate values
 * Set work with HashSet,TreeSet etc. 
 * Set - allows only unique values and its unsorted.
 * TreeSet - allows only Unique and Sorted Values

`Map Collection`
 * Map is collection of values with Key,Value pair
 * Unique Key, any modification to the key updates the value
 * Map is a combination of Set (Key - Unique Value) and List (Value - Duplicate Values)
 * HashMap can allow atmost 1 Key as Null and Duplicate Null in Values
 * HashTable will not allow Null in both Key or Values

`Sorting Collection`
 * Its not a compulsion to declare the type in both sides at the time of instantiation
 * List<Integer> nIntegers = new ArrayList<>(Integer); --> Not Mandatory
 * List<Integer> nIntegers = new ArrayList<>(); --> This should suffice
 * Collections.sort can be used to sort the Collection Data.
 * Comparator - Is a concept to implement custom sorting logic, can be invoked with Lambda Expression
 * Comparable - Providing power to a class to compare itself by implementing the logic in compareTo() method and This Keyword.

`ForEach in Collections`
 * ForEach is a class to iterate through the collections.
 * Various possible ways to iterate the collection -> For Loop, Enhanced For Loop, ForEach loop.
 * ForEach is implemented through Consumer Class Lambda Expression

`Streaming in Java`
 * Stream is implemented to Collection in different types
 * Stream can be used only once in the execution.
 * Any Changes/Data Manipulations will not affect the actual list of collection. 
 * `Filter` is used to filter the values in list based on the given condition and its derived from Predicate FunctionalInterface and the statement given in filter is a Lambda Expression of a implementation since Predicate return Boolean (`test` Method)
    * In the example code file filter is used to filter the even numbers from intList
 * `Map` is used to manipulate the value and replace the values in the list and its derived from Function FunctionalInterface and the statement given in map is a Lambda Expression of a implementation since Function return Integer (`apply` Method)
    * In the example code file map is used to multiple the even numbers from intList by 2
 * `Reduce` is the action which needs to be taken at the time of execution and its derived from BinaryOperator and BiFuction Functional Interfaces, identity is the starting point, c and e and 2 different values and c+e is the output needed.
    * In the example code file reduce sums up the even numbers in the intList which is muliplied by 2 in map statement 
 * Parallel Stream is another function of stream which helps the execution in multiple Threads.
 * Not to use Parallel Stream when you want to sort the elements