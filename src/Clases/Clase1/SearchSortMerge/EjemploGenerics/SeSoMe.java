package Clases.Clase1.SearchSortMerge.EjemploGenerics;

/**
 * Created by DiegoMancini on 1/3/17.
 */
public class SeSoMe {

    //Search, Sort, Merge

    @SuppressWarnings("unchecked")
    public <T> boolean busquedaBin(Comparable<T> a[], Comparable<T> k){
        int min = 0;
        int max = a.length-1;
        int medio = (min+max)/2;
        while(min <= max) {

            if (k.compareTo((T) a[medio])== 0)
                return true;
            else if (k.compareTo((T) a[medio]) < 0)
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

    @SuppressWarnings("unchecked")
    public <T> void seleccion(Comparable <T> a[]){
        Comparable<T> min;
        int imin;
        for(int i =0; i < a.length-1; i ++){
            min =a[i];
            imin = i;
            for (int j = i+1; j < a.length; j++){
                if ( ( a[j]).compareTo( (T) min) < 0){
                    min = a[j];
                    imin = j;
                }
            }
            a[imin]=a[i];
            a[i]= min;
        }
    }

}
