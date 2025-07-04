package org.example;

public class StaticClass {

    private static int TOTAL_COUNTER = 0;
    private int instanceCounter = 0;

    public static void main(String[] args) {
        StaticClass[] staticClass = new StaticClass[3];
        for (int i = 0; i < staticClass.length; i++) {
            staticClass[i] = new StaticClass();
            staticClass[i].incrementInstanceCount();
            StaticClass.incrementTotalCount();
            System.out.println(staticClass[i]);
        }
    }
    public static void incrementTotalCount(){
        TOTAL_COUNTER++;
    }

    public void incrementInstanceCount(){
        instanceCounter++;
    }

    @Override
    public String toString() {
        return "StaticClass{" +
                "totalCounter=" + instanceCounter +
                " static " + StaticClass.TOTAL_COUNTER;
    }
}
