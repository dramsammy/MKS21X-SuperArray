public class Driver{
  public static void main(String[] args) {
    System.out.println("----------------- Testing Initialization -----------------");
    SuperArray x = new SuperArray(); //Initialized new SuperArray without values
    System.out.println(x); // should return [] from having nothing inside
    System.out.println(x.size()); // should return size - 0
    System.out.println(x.isEmpty()); // should return true
    System.out.println(x.set(5, "this shouldn't work")); // Error - index out of range
    System.out.println("----------------- Testing Add -----------------");
    System.out.println(x.add("String1")); //Adding first element -- Should return true
    System.out.println(x); // should return [String1]
    System.out.println(x.size()); // should return size - 1
    System.out.println("----------------- Testing Loops -----------------");
    for (int i = 9; i != 0; i--){
      x.add("loop");
    }
    System.out.println(x); // should return [String1, loop, loop, loop, loop, loop, loop, loop, loop, loop]
    System.out.println(x.isEmpty()); // should return false
    System.out.println(x.get(0)); // should return String1
    System.out.println(x.get(100)); // Should return Error - Index is out of range
    for (int i = 0; i < 10; i++){
      x.set(i, "new"); // should return [new, new, new, new, new, new, new, new, new, new]
    }
    System.out.println(x);
    System.out.println(x.size()); // should return size - 10
    System.out.println("----------------- Testing Debug Methods -----------------");
    x.clear(); //Empties SuperArray
    System.out.println(x.toStringDebug()); //should return [null, null, null, null, null, null, null, null, null, null]
    System.out.println("----------------- Testing More than one instances -----------------");
    SuperArray y = new SuperArray();
    for (int i = 10; i != 0; i--){
      y.add("loop");
    }
    System.out.println(x); // should return []
    System.out.println(y); // should return loop ten times
    System.out.println("----------------- Testing Resize -----------------");
    x.clear();
    for (int i = 10; i != 0; i--){
      x.add("loop");
    }
    x.add("Resized");
    System.out.println(x); // Should print 11 values
    for (int i = 10; i != 0; i--){
      x.add("loop Resized");
    }
    System.out.println(x); // Should print 21 values
    System.out.println(x.size()); // Should be 21
    x.clear();
    x.add("Testing if Add still works");
    System.out.println(x); // should return 1 value
    System.out.println(x.size()); // Should be 1
    x.clear();
    System.out.println("----------------- Testing Phase 3 Methods -----------------");
    x.add("a");
    x.add("b");
    x.add("c");
    System.out.println(x);
    System.out.println(x.contains("c")); // Should return true
    x.add("c");
    System.out.println(x.indexOf("c")); // Should be 2
    System.out.println(x.lastindexOf("c")); // Should be 3
    System.out.println(x.size()); // Should be 4
    System.out.println(x.indexOf("d")); // Should be -1
    System.out.println(x.lastindexOf("d")); // Should be -1
    x.clear();
    x.add("1");
    x.add("2");
    x.add("3");
    x.add(2, "4");
    x.add(100, "error"); //System.out.println("Error - Index is out of range
    System.out.println(x);  // Should result in [1,2,4,3]
    x.remove(0);
    x.remove(1);
    System.out.println(x); // Should result in [2,3]
    System.out.println(x.size()); // Should result in 2
    x.remove(1);
    System.out.println(x); // Should result in [2]
    x.remove(0);
    System.out.println(x); // Should result in []
    x.clear();
    x.add("Test");
    x.add("Remove me!");
    x.add("Test");
    System.out.println(x); // Should result in [Test, Remove me!, Test]
    x.remove("Remove me!");
    x.remove(4); // Error - Index is out of range
    System.out.println(x); // Should result in [Test, Test]
    System.out.println(x.size()); // Should be 2
    x.remove(0);
    x.remove(0);

    System.out.println(x); // Should result in []
  }
}
