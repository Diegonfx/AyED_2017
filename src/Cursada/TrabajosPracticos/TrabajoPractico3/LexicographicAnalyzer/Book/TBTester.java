package Cursada.TrabajosPracticos.TrabajoPractico3.LexicographicAnalyzer.Book;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by DiegoMancini on 25/3/17.
 */
public class TBTester {

    public static void main(String[] args) {
        Balance p;

        if (args.length == 0) {
            p = new Balance(new InputStreamReader(System.in));
            if (p.checkBalance() == 0) {
                System.out.println("No errors!");
            } return;
        }
        for (int i = 0 ; i < args.length ; i++) {
            FileReader f = null;
            try {
                f = new FileReader(args[i]);
                System.out.println(args[i] + ": ");
                p = new Balance(f);
                if (p.checkBalance() == 0) {
                    System.out.println("... no errors!");
                }
            } catch (IOException e) {
                System.err.println(e + args[i]);
            } finally {
                try{
                    if (f != null) {
                        f.close();
                    }
                } catch (IOException e) {

                }
            }
        }
    }

}
