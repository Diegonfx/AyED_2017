package Cursada.TrabajosPracticos.TrabajoPractico_StackClase;

import ua.ayed.stack.Stack;
import ua.ayed.stack.StackAYED;

public class Main {

    public static void main(String[] args) {
        Stack<Character> stack = new StackAYED<>();

        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    public static void exercise1() {

        Integer firstNumber = 1;
        Integer secondNumber = 2;
        Integer thirdNumber = 3;
        Integer fourthNumber = 4;
        Integer fifthNumber = 5;

        Stack<Integer> pileWith5Numbers = new StackAYED<>();
        pileWith5Numbers.push(secondNumber);
        pileWith5Numbers.push(thirdNumber);
        pileWith5Numbers.push(firstNumber);
        pileWith5Numbers.push(fourthNumber);
        pileWith5Numbers.push(fifthNumber);

        for (int i = pileWith5Numbers.size() ; i > 0 ; i--) {
            System.out.println(pileWith5Numbers.peek() + "\n");
            pileWith5Numbers.pop();
        }
    }

    public static void exercise2() {

        boolean loop = true;

        Integer firstNumber = 1;
        Integer secondNumber = 2;
        Integer thirdNumber = 3;
        Integer fourthNumber = 4;
        Integer fifthNumber = 5;

        Stack<Integer> pileWith5Numbers = new StackAYED<>();
        pileWith5Numbers.push(secondNumber);
        pileWith5Numbers.push(thirdNumber);
        pileWith5Numbers.push(firstNumber);
        pileWith5Numbers.push(fourthNumber);
        pileWith5Numbers.push(fifthNumber);

        Stack<Integer> stackExercise2 = new StackAYED<>();
        stackExercise2.push(secondNumber);
        stackExercise2.push(thirdNumber);
        stackExercise2.push(firstNumber);
        stackExercise2.push(fourthNumber);
        stackExercise2.push(fifthNumber);

        while (loop) {
            System.out.println("Welcome to stack menu \n");
            System.out.println("Choose operations please: \n" +
                    "1 - Hacer push de un elemento \n" +
                    "2 - Quitar el ultimo elemento de la pila \n" +
                    "3 - Modificar la pila \n" +
                    "4 - Salir");
            int scanner = Cursada.TrabajosPracticos.TrabajoPractico_StackClase.Scanner.getInt("Ingrese la operacion deseada: ");
            switch (scanner) {
                case 1 :
                    Integer result = Cursada.TrabajosPracticos.TrabajoPractico_StackClase.Scanner.getInt("Ingrese el valor que desea guardar en la lista: ");
                    stackExercise2.push(result);
                case 2 :
                    System.out.println(stackExercise2.peek());
                    stackExercise2.pop();
                case 3 :
                    Stack<Integer> replace = new StackAYED<>();
                    Integer stackPosition = Cursada.TrabajosPracticos.TrabajoPractico_StackClase.Scanner.getInt("Ingrese la posicion a modificar: ");
                    Integer stackValue = Cursada.TrabajosPracticos.TrabajoPractico_StackClase.Scanner.getInt("Ingrese el valor deseado:");

                    for (int i = stackExercise2.size() ; i > 0 ; i--) {
                        System.out.println(stackExercise2.peek() + "\n");
                        replace.push(stackExercise2.peek());
                        stackExercise2.pop();
                        if (i == stackPosition ) {
                            stackExercise2.push(stackValue);
                        }
                    }
                    for (int i = replace.size() ; i > 0 ; i--) {
                        stackExercise2.push(replace.peek());
                        replace.pop();
                    }

                case 4 :
                    loop = false;
                    System.exit(0);
            }
        }
    }

    public static void exercise3() {

        Integer firstNumber = 1;
        Integer secondNumber = 2;
        Integer thirdNumber = 3;
        Integer fourthNumber = 4;
        Integer fifthNumber = 5;

        Stack<Integer> stackExercise3 = new StackAYED<>();
        stackExercise3.push(firstNumber);
        stackExercise3.push(secondNumber);
        stackExercise3.push(thirdNumber);
        stackExercise3.push(fourthNumber);
        stackExercise3.push(fifthNumber);

        int size = stackExercise3.size();
        Stack<Integer> replace = new StackAYED<>();

        for (int i = 0; i < size ; i++) {
            replace.push(stackExercise3.peek());
            stackExercise3.pop();
        }

        for (int i = 0 ; i < size; i++) {
            System.out.println(replace.peek() * 2 + "\n");
            replace.pop();
        }
    }

    private static void exercise4() {
    }
}
