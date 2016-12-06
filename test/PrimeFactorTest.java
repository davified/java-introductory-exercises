/*
9. Prime Factors Exercise
Write a method generate(int n) that given an integer N will return a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order. For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.
*/

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/* Created by davified on 6/12/16. */
public class PrimeFactorTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void isPrimeTestPositive() throws Exception {
        PrimeFactor p = new PrimeFactor();
        assertEquals(true, p.isPrime(3));
    }

    @Test
    public void isPrimeTestNegative() throws Exception {
        PrimeFactor p = new PrimeFactor();
        assertEquals(false, p.isPrime(4));
    }

    @Test
    public void TestFor30() throws Exception {
        PrimeFactor p = new PrimeFactor();

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);

        assertEquals(expected, p.generate(30));
    }

    @Test
    public void TestFor51() throws Exception {
        PrimeFactor p = new PrimeFactor();

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(17);

        assertEquals(expected, p.generate(51));
    }
}