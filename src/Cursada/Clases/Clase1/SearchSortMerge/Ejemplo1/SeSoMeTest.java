package Cursada.Clases.Clase1.SearchSortMerge.Ejemplo1;

/**
 * Created by DiegoMancini on 1/3/17.
 */
public class SeSoMeTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Colectivo b[] = new Colectivo[5];

        b[0] =new Colectivo(59, 12, 45, true);
        b[1] =new Colectivo(59, 52, 35, false);
        b[2] =new Colectivo(81, 60, 48, true);
        b[3] =new Colectivo(95, 15, 38, true);
        b[4] =new Colectivo(95, 24, 40, true);

        Colectivo k1 = new Colectivo(59, 52);
        Colectivo k2 = new Colectivo(59, 23);

        System.out.println((new SeSoMe().busquedaBin(b, k1)));
        System.out.println((new SeSoMe().busquedaBin(b, k2)));

        int b1[] = new int[5];
        b1[0]=3;
        b1[1]=8;
        b1[2]=1;
        b1[3]=9;
        b1[4]=5;

        (new SeSoMe()).seleccion(b1);
        for(int i =0; i < b1.length ; i ++)
            System.out.println(b1[i]);

        String str[] = new String [5];
        str[0]= "manzana";
        str[1]= "banana";
        str[2]= "pera";
        str[3]= "durazno";
        str[4]= "anana";

        (new SeSoMe()).seleccion(str);
        for(int i =0; i < str.length ; i ++)
            System.out.println(str[i]);
    }

}
