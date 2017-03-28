package Cursada.Clases.Clase1.SearchSortMerge.Ejemplo1;

/**
 * Created by DiegoMancini on 1/3/17.
 */
public class SeSoMe {

    //Search, Sort, Merge

    public boolean busquedaBin(Comparable a[], Comparable k){
        int min = 0;
        int max = a.length-1;
        int medio = (min+max)/2;
        while(min <= max) {

            if (k.compareTo(a[medio])== 0)
                return true;
            else if (k.compareTo(a[medio]) < 0)
                max = medio-1;
            else
                min = medio +1;
            medio = (min+max)/2;
        }
        return false;


    }

    public void seleccion(int a[]){
        int min;
        int imin;
        for(int i =0; i < a.length-1; i ++){
            min =a[i];
            imin = i;
            for (int j = i+1; j < a.length; j++){
                if (a[j] < min){
                    min = a[j];
                    imin = j;
                }
            }
            a[imin]=a[i];
            a[i]= min;
        }
    }

    public void seleccion(String a[]){
        String min;
        int imin;
        for(int i =0; i < a.length-1; i ++){
            min =a[i];
            imin = i;
            for (int j = i+1; j < a.length; j++){
                if (a[j].compareTo(min) < 0){
                    min = a[j];
                    imin = j;
                }
            }
            a[imin]=a[i];
            a[i]= min;
        }
    }

    public void seleccion(Object a[]){
        Object min;
        int imin;
        for(int i =0; i < a.length-1; i ++){
            min =a[i];
            imin = i;
            for (int j = i+1; j < a.length; j++){
                if (((Comparable) a[j]).compareTo(min) < 0){
                    min = a[j];
                    imin = j;
                }
            }
            a[imin]=a[i];
            a[i]= min;
        }
    }


}
