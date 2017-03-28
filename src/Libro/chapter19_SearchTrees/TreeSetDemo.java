package Libro.chapter19_SearchTrees;

import java.util.Iterator;

import Libro.weiss.util.Collection;
import Libro.weiss.util.Set;
import Libro.weiss.util.SortedSet;
import Libro.weiss.util.TreeSet;
import Libro.weiss.util.Collections;

public class TreeSetDemo
{
    public static void printCollection( Collection<String> c )
    {
        for( String str : c )
            System.out.println( str );
    }
    
    public static void main( String [ ] args )
    {
        Set<String> s = new TreeSet<String>( Collections.reverseOrder( ) );
        s.add( "joe" );
        s.add( "bob" );
        s.add( "hal" );
        printCollection( s );    // Figure 6.8
    }
}