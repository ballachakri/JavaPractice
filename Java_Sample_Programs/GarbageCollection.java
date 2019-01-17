package Java_Sample_Programs;

public class GarbageCollection {

// When JVM starts up, it creates a heep area which is known as runtime data. This is where all the objects are stored.
// Since this area is limited. it is required to manager this area effectively by removing the objects that are no longer in use.
// The process of removing unused objects from heep memory is known as Garbage Collection and it is process of memory management in Java.
// Garbage Collection is automatic

//  When the object is no longer reachable.
    // example
    // ClassName obj= new ClassName();
    // obj = null;
    // here the reference obj was point to the object of a class but we assigned it as a null value. this is no longer pointing to that object.
    // which makes object unreachable and thus unusable, such objects are automatically available for garbage collection.
    // similarly,
    // char[] arr = {'a','b','c'}
    // String str=new String(arr);
    // str=null;
    // here str is not reachable and unusable.
 // Garbage collection process doesn't happen instantly which means once the objects are ready for garbage collection
 // They must to have to wait for JVM to run the memory cleanup program that performs garbage collection.
 // However we can request to JVM for garbage collection by calling System.gc method.
}
