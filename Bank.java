package jspiders;

public interface Bank {
void deposit(int amount);
void withdraw(int amount);
int getBalance();
String displayErrorMessage();
}
//All the above methods are automatically public and abstract