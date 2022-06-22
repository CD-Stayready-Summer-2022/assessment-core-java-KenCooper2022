package com.codedifferently.assessment01.part03;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<T>{
    private ArrayList<T> stack;
    public MyStack(){
        stack = new ArrayList();

    }

    public boolean isEmpty() {
       return stack.isEmpty();
    }

    public void push(T i) {
        stack.add(0,i);
    }

    public T pop() throws EmptyStackException {

        if(!stack.isEmpty()) {
            T poppedVal = stack.get(0);
            stack.remove(poppedVal);
            return poppedVal;

        }


        throw new EmptyStackException();


    }

    public T peek() {
        if(!stack.isEmpty()){
            return stack.get(0);
        }
        return null;
    }


    public Integer size(){
        return stack.size();
    }
}
