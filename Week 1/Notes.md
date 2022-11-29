# Java
## main
- Entry point
- Java must have a main method to run directly
- public = makes the method/class accessible
- static = makes it so you can use methods without creating and instance 
- void = makes it not need a return or it returns nothing

- **Java is a strongly Typed lang**

## Type Casting
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
```

## Data Types and Wrapper classes
### Primitive 
```java
int = 0
double = 1.1
int[] = {1,3,5}
```
### Wrapper Classes
```java
String =
Integer =
Double =
ArrayList<String> = new ArrayList<String>();
HashMap<String, String> userMap = new HashMap<String, String>();
```

## ArrayList
- CANNOT USE PRIMITIVE DATA TYPES
- .size() = length 
- .add() = push()
- .get() = arr[]

## String.format
- %s = string
- %d = integer
- %.2f = double with 2 decimal spots
- %n = New line

## .equals
- Compares the value instead of the place in memory 

## Classes
- ClassName varName = new ClassName();
- varName.Notation to use methods 

### Class Variables
- Member variables - object attributes or fields that belong to a data type or class.

- Local variables - variables within methods code blocks that are not member variables (these are the primary type of variable you have been using so far). You can think of them as more temporary, since they vanish when the method ends (goes out of scope or returns).

- Parameter variables - those that are declared in your method signature (between the parentheses!) which are also temporary.
Note: You will see member variables called members, attributes, instance variables, fields, and properties. These all refer to the same thing, but in Java they are typically referred to as member variables.

## Methods
 - public ReturnType methodName(Type args){}

### Method Over Loading
- method can have the same name as long as they have different args
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



