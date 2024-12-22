1. what are static methods
just like we can have static data in the class, similarly we also can have static methods.

2. why do we need static methods
we need static methods when we want to access the data members of the class without creating an object of the class.
To make a method as "static" we just have to prefix the decl of the method with the keyword
"static"
Syntax:
====
static <acces_mod> <ret_type> <method_name>(<arg>)
{ method
// method body
}
Ex:
=== public static void display(){
static public void display() {
{
}

Impt Points
========

1. We always call a static method using class name.
2. A static method can only access static data of the class directly. For accessing non static
data we will have to create object of the class in the static method.
