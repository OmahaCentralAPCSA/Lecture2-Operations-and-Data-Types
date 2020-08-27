# Lecture2-Operations-and-Data-Types

## Data Types 
A type is a category or set of data values. Type constrains the operations that can be performed on data

### Java has 8 primitive data types:

| Name | Description | Examples |
| ---- | ------------| ---------|
| int | integers | 42, -3, 0, 92839|
| double | real numbers | 3.1, -.25, 8.4e4 |
| boolean | logical values | true, false |
| char | character | a, b, ~, @, E|

The other 4 primitive types are long, short, float, and byte.  Those are less common within the AP Curriculum.  

---

## Expressions
A value or operation that computes a value.  Expressions can be literal values or be complex expressions that use operators and parenthesis.  

## Arithmetic operators
The arithmetic operators that Java has available are:
-  addition  
-  subtraction  
-  multiplication  
-  division  
- %   modulus (remainder)  

### Integer Division
Dividing integers result in the quotient also being an integer. 
```
14 / 4 = 3
32 / 5 = 6
84 / 10 = 8
156 / 100 = 1
40 / 8 = 5
```
### Integer Remainder with % 
The % operator comptues the remainder from integer division
```
14 % 4 = 2
32 % 5 = 2
84 % 10 = 4
156 % 100 = 56 
40 % 8 = 0
```

### Precedence
Precedence is the order in which operators are evaluated.  They generally follow the order of operations you have learned in math.  
- Evaluated left to right
- the operators * / % have higher precedence than + - 
- Parenthesis force a certain order of evaluation

Examples: 
```
1 * 2 + 3 * 5 % 4

1 + 8 % 3 * 2 - 9 

```

---

## Real Numbers (type `double`)

> Placing .0 or . after an integer makes it a `double`
> The operators all still work with `double`

## Mixing Data Types

**Main Idea:** When `int` and `double` are mixed, the result is a `double`.  Java converts the integer values to a double.  
The conversion is per-operator, affecting only its operands.  
> 7 / 3 * 1. 2 + 3 / 2  

7 / 3 would still be integer division.  ( = 2) 
Then 2 * 1.2, would become a double 2.4.  2 would be converted to 2.0 before it is multiplied with 1.2 
3 / 2 would also be integer division.  Then it would be converted to 1.0 before being added to 2.4 


## String Concatenation

```
"hello" + 42  is "hello42"  
1 + 2 + "abc" is "3abc"  
"abc" + 1 + 2 is "abc12"
"1" + 1  is "11"  
```  
We can use parenthesis to force an arithmetic expression to evaluate before being concatenated with a String.  


--- 

## Variables
3 steps:  
- *declare* it  - state name and type
- *intialize* it  - store a value into it
- *use* it  - print it or use it as part of an expression. 

**Assignment uses =, but means "gets the value of"**
**The right side is evaluated first and THEN its result is stored in the variable at the left.**

```
int x = 4; //declares an integer and assigns a value of 4. 
double cost = 4.88 //declares an double (real) and assigns a value of 4.88
double grade = 4   //declares a double and assigns a value of 4.0 

double avg = 11 / 2    //stores the value 5.0.  WHY? 
```

Things to consider with assignment and types
1. A variable can only store a value of its own type. 
2. An `int` value can be stored in a `double` variable.  (the reverse is not true)
3. A variable can't be used until it is assigned a value
4. You can't declare a variable twice

