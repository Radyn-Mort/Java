# Java
- **Java is a strongly Typed language**
## main
- Entry point
- **Java** must have a main method to run directly
- **public** makes the method/class accessible
- **static**  makes it so you can use methods without creating and instance 
- **void** makes it not need a return or it returns nothing
# Type Casting
- Cant convert if it will make you lose data
```java
// This wont work
int x = 0;
double y = 10;
int z = x + y;
```
### Implicit Type Casting
```java 
int x = 10;
double y = 10;
double z = y + x;
```
### Explicit Type Casting*
```java
int x = 0;
double y = 10;
int z = (int) y + x;
char a = 'a'
String a = Character.toString(a); 
```

# Data Types and Wrapper classes
## Primitive 
```java
int = 0
double = 1.1
int[] = {1,3,5}
char = 'a'
```
## Wrapper Classes
```java
String ="Hello Reader"
Integer = 1
Double = 10.1
ArrayList<String> = new ArrayList<String>();
HashMap<String, String> userMap = new HashMap<String, String>();
```

## ArrayList
- CANNOT USE PRIMITIVE DATA TYPES
```java
ArrayList<Integer> myArray= new ArrayList<Integer>();
//length of th array
myArray.size();// = 0
//myArray.push(1)
myArray.add(1);
//myArray[0]
myArray.get(0); //=1
```
## String.format
- %s = String
- %d = int
- %.2f = double with 2 decimal spots
- %n = New line

## .equals
- Compares the value instead of the place in memory 

# Classes
- Creation ClassName varName = new ClassName();
- varName.Notation to use methods 
### creating class
```java
public class ClassName{
    //method
    public void helloWord(){
        System.out.println("helloWord");
}
}
```
### Instantiating an instance of a class
```java
ClassName instance1 = new ClassName();
//calling the method woth our new instance
instance.helloWorld();
```



## Class Variables
- **Member Variables** - object attributes or fields that belong to a data type or class.

- **Local Variables**- variables within methods code blocks that are not member variables (these are the primary type of variable you have been using so far). You can think of them as more temporary, since they vanish when the method ends (goes out of scope or returns).

- **Parameter Variables** - those that are declared in your method signature (between the parentheses!) which are also temporary.
- **Note:** You will see member variables called members, attributes, instance variables, fields, and properties. These all refer to the same thing, but in Java they are typically referred to as member variables.

## Methods
- Every method has the following parts: ***modifiers***, ***return type***, ***method name*** , and ***method body***.
```java
Modifiers ReturnType methodName(Type args){
    MethodBody
}
```

### Method Overloading
- methods can have the same name as long as they have different args
```java
public Return type methodName(String name){}
public Return type methodName(String name, Date date){}
```
**Util Methods**
```java
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.
```


## Modifiers  
- **Access Modifiers**
```java

public //The defualt // Every class everywhere has access to the method.
private//Only the class it is can see and access this method or variable 
protected
```
- ***Return Type***
The method will always return this type
```java
public [ReturnType] name(){}
//ex
String 
int
boolean
double
array
ArrayList<double>
void 
```
- **Method Name** should be named based on the action and what it returns
```java
//returns a boolean
isEmpty();
isLoggedIn();
hasItems();
//Non-Boolean  methods we will use either verbs or get and set for property values, e.g.:
getValue();
setValue();
greet();
addToList();
createGreeting();

//
```
- **Method Body** This is where the logic goes

# Static
- **Purpose** static variable are use to keep track of data that is tied to the class not a single instance of a class
- **Static Modifier** tells us it is a class method and allows us to use it without instantiating an instance
- **Static Attributes / Member variable** are only initialized once and shared between all instances of the class 
- **Static Methods** can only access  other static methods and Variables.They can't use the this keyword  because they are not running on an instance 
- When we create static variables, it is common practice to create static methods to access the said variables.
- most  Static variables are changed within the other methods of the class and don't need a setMethod
```java
public class Player{
    private static int numberOfPlayers =0;
    public Player(){
        numberOfPlayers++;
    }
    public  Static int getNumberOfPlayers(){
        return numberOfPlayers;
    }

}
```
- To call static methods we just use the class 
```java
Player.getNumberOfPlayers();
```
# OOP

## The four pillars of OOP:

### Abstraction
- **Abstraction** is a general concept formed by extracting common features form specific examples
- Breaking things down to an abstract point
- Ex a developer could be broken down to a person 
### Inheritance 
- **Inheriting** method and variables from a super class 
### Encapsulation
- **Encapsulation** is the mechanism that binds together code and the data it manipulates, and keeps both sade from outside interference and misuse.
- in Java everything is Encapsulated
- You can't create a method without a class
- you can implement encapsulation with **Access Modifiers** 
- **Simplified** encapsulation mean hiding data using getters and setters
### Polymorphism  
- Method overloading 

## Layout
- **Attributes / Member Variable** should be private so they cant be modified directly
- **Constructor** Should be named after class 
- **Methods** outside of getters and setters that solve a problem
- **Getters and Setters** should have them for each attribute
```java
//Developer class 
import java.util.ArrayList;
public class Developer{
    //First: attributes
    private String name;
    private boolean employed;
    private int salary;
    private double hoursOfSleep;
    private ArrayList<String> languages;
    private ArrayList<Project> projects; 
    //Second:Constructor
    // zero argument constructor
    public Developer(){
        this.name = "no name yet"
        this.languages = new ArrayList<String>;
        this.languages = new ArrayList<String>;
    }
    public Developer(String name, boolean employed, int salary, double hoursOfSleep){
        this.name = name;
        this.employed = employed;
        this.salary = salary;
        this.hoursOfSleep= hoursOfSleep;
        this.languages = new ArrayList<String>;
        this.languages = new ArrayList<String>;
    }
    //Thirst: Methods 
    public String displayStats(){
        //Change this to a string builder later!!!!
        String output = "name: " +this.name+"\n";
        output+= "Salary: " + this.salary+"\n";
        output+= "Employed: " + this.employed+"\n";
        output+= "Hours of Sleep: " + this.hoursOfSleep+"\n";
        output+= "Languages: " + this.languages+"\n";
        output+= "Projects: \n";
        for(Project project : this.projects){
            output+= project.displayInfo();
        }
        return output;
        
    }
    // Projects
    public void addProject(Project project){
        this.projects.add(project);

    //Fourth Getters and Setters
    public String getName(){
        return this.name
    }
    public void setName(String newName){
        this.name = newName;
    }
    public boolean isEmployed(){
        return this.employed;
    }
    public void setEmployed(boolean employed){
        this.employed = employed;
    }
    public int getSalary(){
        return this.salary;
    }
    public double getHoursOfSleep(){
        return this.hoursOfSleep;
    }
    public void setHoursOfSleep(double hours){
        this.hoursOfSleep = hours
    }
    public ArrayList<Strings> getProjects(){
        return this.projects
    }
    public void setProjects(ArrayList<Project> projects){
        this.projects = projects

    }
    }
}
```
```java
public class Project{
    public String title;
    public String language;

    public String displayInfo(){
        String output = "Title: " + this.title+"\n";
        output=+ "Language: "+ this.language+"\n";
        return output ;
    }
}
```
