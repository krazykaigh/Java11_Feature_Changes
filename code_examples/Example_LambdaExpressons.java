// Non Runnable Code

// Here’s how we have implemented the four main functional interfaces using anonymous classes:

Function ourFunc = new Function(){
    public Double apply(Integer i){
        return i * 10.0;
    }
};
System.out.println(ourFunc.apply(1));       //prints: 10.0
Consumer consumer = new Consumer() {
    public void accept(String s) {
        System.out.println("The " + s + " is consumed.");
    }
};
consumer.accept("Hello!"); //prints: The Hello! is consumed.
Supplier supplier = new Supplier() {
    public String get() {
        String res = "Success";
        //Do something and return result—Success or Error.
        return res;
    }
};
System.out.println(supplier.get());      //prints: Success
Predicate pred = new Predicate() {
    public boolean test(Double num) {
       System.out.println("Test if " + num + " is smaller than 20");
       return num 

 //And here’s how they look with lambda expressions:

       Function ourFunc = i -> i * 10.0;
System.out.println(ourFunc.apply(1)); //prints: 10.0

Consumer consumer = 
            s -> System.out.println("The " + s + " is consumed.");
consumer.accept("Hello!");       //prints: The Hello! is consumed.

Supplier supplier = () - > {
        String res = "Success";
        //Do something and return result—Success or Error.
        return res;
    };
System.out.println(supplier.get());  //prints: Success

Predicate pred = num -> {
   System.out.println("Test if " + num + " is smaller than 20");
   return num 

// The examples of specialized functional interfaces we have presented are as follows:

IntFunction ifunc = new IntFunction() {
    public String apply(int i) {
        return String.valueOf(i * 10);
    }
};
System.out.println(ifunc.apply(1));   //prints: 10
BiFunction bifunc =
        new BiFunction() {
            public Double apply(String s, Integer i) {
                return (s.length() * 10d) / i;
            }
        };

System.out.println(bifunc.apply("abc",2));     //prints: 15.0
BinaryOperator binfunc = new BinaryOperator(){
    public Integer apply(Integer i, Integer j) {
        return i >= j ? i : j;
    }
};
System.out.println(binfunc.apply(1,2));  //prints: 2
IntBinaryOperator intBiFunc = new IntBinaryOperator(){
    public int applyAsInt(int i, int j) {
        return i >= j ? i : j;
    }
};
System.out.println(intBiFunc.applyAsInt(1,2)); //prints: 2

// And here’s how they look with lambda expressions:

IntFunction ifunc = i -> String.valueOf(i * 10);
System.out.println(ifunc.apply(1));             //prints: 10

BiFunction bifunc = (s,i) -> (s.length() * 10d) / i;
System.out.println(bifunc.apply("abc",2));      //prints: 15.0

BinaryOperator binfunc = (i,j) -> i >= j ? i : j;
System.out.println(binfunc.apply(1,2));         //prints: 2

IntBinaryOperator intBiFunc = (i,j) -> i >= j ? i : j;
System.out.println(intBiFunc.applyAsInt(1,2));  //prints: 2