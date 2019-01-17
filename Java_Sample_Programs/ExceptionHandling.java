package Java_Sample_Programs;

public class ExceptionHandling {

// Exception handling is one of the most important feature of Java programming that allows us to handle the runtime errors caused by exception.

// Exception : is an unwanted event thst interrupts the normal flow of the program.
// Exceptions are events that occurs in the code.
// when exception occurs program execution gets terminated. in such cases we get a system generated error message.
// By handling exception we can provide a meaningfull message to the user about the issue rather than a system generated message.

// Advantages of Exception handling
    // ensures that the flow of the program doesn't break when an exception occurs.

    // Errors:   indicates something severe enough has gone wrong. the application should crash rather than try to handle the error.


// Types of Exceptions

    // 1. Checked Exception : are checked at compile time
    // Compiler checks them during compilation to see whether the programmer has handled them or not.

    // 2. Unchecked Exception :
    // Runtime Exception are also known as Unchecked Exceptions. These exception are not checked at compile-time as complier does not check whether the programmer
    // has handled them or not but it's the responsibility of the programmer to handle these exceptions and provide a safe exit.

// checked exception are handled by using try -catch block, if the method is thowing exception we use throws keyword.

// A try block is always followed by catch block which handles exception

// try block
// syntax :
// try {
// statements;
// statements;
// statements;
// }catch( exception(type) e(object))

// A single try block can have multiple catch blocks

// nested try block
//try {
// statements;
// statements;
//        try {
// statements;
// statements;
// statements;
//            try {
// statements;
// statements;
// statements;
// }catch( exception(type) e(object))

// }catch( exception(type) e(object))

// statements;
// }catch( exception(type) e(object))


// Finally block : contains all the critical statements that must be executed whether exception occurs or not.
// the statements present in finally bloc will always execute regardless of whether exception occurs in try block or not.


}


