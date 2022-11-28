**Java main**
Entry point
Java must have a main method to run
public = makes the method/class accessible
static = makes it so you can use methods without creating and instance 
void = makes it not need a return or it returns nothing

**Java Typing**
Java is a strongly Typed lang



*** Data Types and Wrapper classes***
String
int = Integer
double = Double

**String.format**
%s = string
%d = integer
%.2f = double with 2 decimal spots
%n = New line

**.equals**
Compares the value instead of the place in memory 

**Classes**
ClassName varName = new ClassName();
varName.Notation to use methods 

**Dot Notation**
Member variables - object attributes or fields that belong to a data type or class.
Local variables - variables within methods code blocks that are not member variables (these are the primary type of variable you have been using so far). You can think of them as more temporary, since they vanish when the method ends (goes out of scope or returns).
Parameter variables - those that are declared in your method signature (between the parentheses!) which are also temporary.
Note: You will see member variables called members, attributes, instance variables, fields, and properties. These all refer to the same thing, but in Java they are typically referred to as member variables.

**Methods**
public Return type methodName(Type args){}

**Method Over Loading**
method can have the same name as long as they have different args
exp.
public Return type methodName(String name){}
public Return type methodName(String name, Date date){}

**Util Methods**
import java.util.Date;