# 1.19.1: LAB: BankAccount class (EO)

Build a class called BankAccount that manages checking and savings accounts. The class has three private member fields: a customer name `(String)`, the customer's savings account balance `(double)`, and the customer's checking account balance `(double)`.

## Implement the following Constructor and instance methods:

```java
public BankAccount(String newName, double amt1, double amt2)
// set the customer name to parameter newName, set the checking account balance to parameter amt1 and set the savings account balance to parameter amt2. (amt stands for amount)
```

```java
public void setName(String newName) 
// set the customer name
```

```java
public String getName() 
// return the customer name
```

```java
public void setChecking(double amt) 
// set the checking account balance to parameter amt
```

```java
public double getChecking() 
// return the checking account balance
```

```java
public void setSavings(double amt) 
// set the savings account balance to parameter amt
```

```java
public double getSavings() 
// return the savings account balance
```

```java
public void depositChecking(double amt) 
// add parameter amt to the checking account balance (only if positive)
```

```java
public void depositSavings(double amt) 
// add parameter amt to the savings account balance (only if positive)
```

```java
public void withdrawChecking(double amt) 
// subtract parameter amt from the checking account balance (only if positive)
```

```java
public void withdrawSavings(double amt) 
// subtract parameter amt from the savings account balance (only if positive)
```

```java
public void transferToSavings(double amt) 
// subtract parameter amt from the checking account balance and add to the savings account balance (only if positive)
```