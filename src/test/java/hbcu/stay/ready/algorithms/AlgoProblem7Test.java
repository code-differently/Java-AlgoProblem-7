package hbcu.stay.ready.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgoProblem7Test {

    @Test
    public void testOne(){
        AlgoProblem7 algoProblem7 = new AlgoProblem7();

        int expected = 3;
        int actual = algoProblem7.countingSmiles("(:l(:cy:)");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        AlgoProblem7 algoProblem7 = new AlgoProblem7();

        int expected = 0;
        int actual = algoProblem7.countingSmiles("|::P:P:P:P):");

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testThree(){
        AlgoProblem7 algoProblem7 = new AlgoProblem7();

        int expected = 10;
        int actual = algoProblem7.countingSmiles(":):D:D:):PO:|:)::P:P:D:):P):):O:O:O:|:O::P:DO::):PO:|:|:):)::P:))::):D|::P:P)::)");

        Assertions.assertEquals(expected,actual);
    }



}
