package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{213, 54, 91, 187, 2001, 2023}; //[Fizz, Fizz, 91, 187, Fizz, 2023];
        List<Integer> numbers = Arrays.asList(a);
        ArrayList<Integer> b = new ArrayList<>();
                b.add(1);
                b.add(2);
                b.add(4);
                b.add(8);
                b.add(11);
                b.add(13);
                b.add(17);
        System.out.println(new CollectionsExercises().useArrayDeque());
        System.out.println(new CollectionsExercises().useHashMap());
        
        System.out.println(numbers);
        
        System.out.println(numbers);
        
        new CollectionsExercises().useLinkedList();
        new CollectionsExercises().useStack();
       
        new CollectionsExercises().useLinkedList();
    }

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list
        LinkedList<Integer> list = new LinkedList<>();
        int value = 0;
        try {
            list.add(4);
            list.add(5);
            list.add(6);
            list.add(8);
            list.add(2);
            list.add(9);
            list.add(2);
            list.add(2, 4);
            value = list.element(); //gives the head of the list
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Head of list : " + value);
        System.out.println(list);
        return list;
        //throw new RuntimeException("Not implemented");
    }
       

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
        
        
        Stack<Integer> stack = new Stack<Integer>();
        try{
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(9);
        //System.out.println("Stack = " + stack);
        //System.out.println("Stack peek value = " + stack.peek());
        System.out.println("The first element of the"
                + " stack on the screen is: " + stack.firstElement());       
        System.out.println("The last element of the "
                + " stack on the screen is: " + stack.lastElement());
        System.out.println(stack.lastElement());
        System.out.println("Stack pop = " + stack.pop());
        stack.push(4);
        System.out.println("new stack = " + stack);
        }catch(Exception e){
            e.printStackTrace();
        }
        return stack;
        //throw new RuntimeException("Not implemented");
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        //  - add 5, 6, 8, 9 to the the stack
        //  - print the first element of the queue on the screen
        //  - print the last element of the queue on the screen
        //  - invoke the method poll() on the queue and print the result on the screen
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue
        
        ArrayDeque<Integer> array = new ArrayDeque<>();
        try{
        array.add(5);
        array.add(6);
        array.add(8);
        array.add(9);
        System.out.println(array);
        System.out.println(array.getFirst());
        System.out.println(array.getLast());
        System.out.println(array.poll());
        System.out.println(array.element());
        }catch(Exception e){
            e.printStackTrace();
        }
        return array;
        //throw new RuntimeException("Not implemented");
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of keys from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map
        HashMap<Integer, String> map = new HashMap<>();
        try{
        map.put(1, "TypeScript");
        map.put(2, "Kotlin");
        map.put(3, "Python");
        map.put(4, "Java");
        map.put(5, "JavaScript");
        map.put(6, "Rust");
        for(Map.Entry<Integer,String> e : map.entrySet()){
            int key =  e.getKey();
            String value =  e.getValue();
            System.out.println("Key = " + key + ", Value = " + value );
        }
        boolean checkValue = map.containsValue("English");
        String outputValue = checkValue?"Yes it contains the value inputted": "No it does not contain the value inputted";
        System.out.println(checkValue);
        System.out.println(outputValue);

       }catch(Exception e){
        e.printStackTrace();
    }

        return map;
        //throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Collections Exercises";
    }
}
