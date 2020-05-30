import com.pkg.Alg;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileConSundaramTests extends TestCase {

    Alg a;

    @Before
    public void setUp() throws Exception{
        a = new Alg();
        assertNotNull(a);
    }

    //TC-1
    @Test
    public void test23() {
        try {
            a.fileConstructorSundaram(4200000);

            String result = Files.readString(Paths.get("primesEratosthenes.txt"));
            String test = Files.readString(Paths.get("testEratosthenes.txt"));

            Scanner ss = new Scanner(result);

            Scanner ts = new Scanner(test);

            String t, e;
            t = ss.nextLine();
            e = ts.nextLine();

            Assert.assertEquals(t, e);

            while(ss.hasNext()){
                t = ts.nextLine();
                e = ss.nextLine();
                if(e.charAt(0) == ' ') {
                    Assert.assertEquals(t, e);
                } else {
                    Assert.assertNotNull(e);
                }
            }

            Assert.assertFalse(ss.hasNext());

        } catch (Exception e) {
            fail("x");
        }
    }

    @Test
    public void test26() {
        try {
            a.fileConstructorSundaram(0);

            String result = Files.readString(Paths.get("primesEratosthenes.txt"));

            Scanner ss = new Scanner(result);
            ss.useDelimiter("\n");

            String l0 = ss.next();
            String l00 = ss.next();

            Assert.assertNotNull(l0);
            Assert.assertNotNull("", l00);
            Assert.assertFalse(ss.hasNext());

        } catch (Exception e) {
            fail("x");
        }
    }

    @Test
    public void test27() {
        try {
            a.fileConstructorSundaram(-1);

            String result = Files.readString(Paths.get("primesEratosthenes.txt"));

            Scanner ss = new Scanner(result);
            ss.useDelimiter("\n");

            String l0 = ss.next();
            String l00 = ss.next();

            Assert.assertNotNull(l0);
            Assert.assertNotNull("", l00);
            Assert.assertFalse(ss.hasNext());

        } catch (Exception e) {
            fail("x");
        }
    }

    @Test
    public void test28() {
        try {
            a.fileConstructorSundaram(1);

            String result = Files.readString(Paths.get("primesEratosthenes.txt"));

            Scanner ss = new Scanner(result);
            ss.useDelimiter("\n");

            String l0 = ss.next();
            String l00 = ss.next();

            Assert.assertNotNull(l0);
            Assert.assertNotNull("", l00);
            Assert.assertFalse(ss.hasNext());

        } catch (Exception e) {
            fail("x");
        }
    }

    /*@Test
    public void test29() {
        try {
            a.fileConstructorSundaram("string");

            String result = Files.readString(Paths.get("primesEratosthenes.txt"));

            Scanner ss = new Scanner(result);
            ss.useDelimiter("\n");

            String l0 = ss.next();
            String l00 = ss.next();

            Assert.assertNotNull(l0);
            Assert.assertNotNull("", l00);
            Assert.assertFalse(ss.hasNext());

        } catch (Exception e) {
            fail("x");
        }
    }
*/
 /*   @Test
    public void test30() {
        try {
            a.fileConstructorSundaram(42.0);

            String result = Files.readString(Paths.get("primesEratosthenes.txt"));

            Scanner ss = new Scanner(result);
            ss.useDelimiter("\n");

            String l0 = ss.next();
            String l00 = ss.next();

            Assert.assertNotNull(l0);
            Assert.assertNotNull("", l00);
            Assert.assertFalse(ss.hasNext());

        } catch (Exception e) {
            fail("x");
        }
    }*/
/*
    @Test
    public void test31() {
        try {
            a.fileConstructorSundaram(null);

            String result = Files.readString(Paths.get("primesEratosthenes.txt"));

            Scanner ss = new Scanner(result);
            ss.useDelimiter("\n");

            String l0 = ss.next();
            String l00 = ss.next();

            Assert.assertNotNull(l0);
            Assert.assertNotNull("", l00);
            Assert.assertFalse(ss.hasNext());

        } catch (Exception e) {
            fail("x");
        }
    }
*/
    @Test
    public void test32() {
        try {
            a.fileConstructorSundaram(1000);

            String result = Files.readString(Paths.get("primesSundaram.txt"));

            Scanner ss = new Scanner(result);
            ss.useDelimiter("\n");

            String l0 = ss.next();
            String l1 = ss.next();
            String l2 = ss.next();
            String l3 = ss.next();
            String l4 = ss.next();
            String l5 = ss.next();
            String l6 = ss.next();
            String l7 = ss.next();
            String l8 = ss.next();
            String l9 = ss.next();
            String l10 = ss.next();
            String l11 = ss.next();
            String l12 = ss.next();
            String l13 = ss.next();
            String l14 = ss.next();
            String l15 = ss.next();
            String l16 = ss.next();
            String l00 = ss.next();

            String eq1 = " 2 3 5 7 11 13 17 19 23 29 31";
            String eq2 = " 37 41 43 47 53 59 61 67 71 73 79";
            String eq3 = " 83 89 97 101 103 107 109 113 127 131 137";
            String eq4 = " 139 149 151 157 163 167 173 179 181 191 193";
            String eq5 = " 197 199 211 223 227 229 233 239 241 251 257";
            String eq6 = " 263 269 271 277 281 283 293 307 311 313 317";
            String eq7 = " 331 337 347 349 353 359 367 373 379 383 389";
            String eq8 = " 397 401 409 419 421 431 433 439 443 449 457";
            String eq9 = " 461 463 467 479 487 491 499 503 509 521 523";
            String eq10 = " 541 547 557 563 569 571 577 587 593 599 601";
            String eq11 = " 607 613 617 619 631 641 643 647 653 659 661";
            String eq12 = " 673 677 683 691 701 709 719 727 733 739 743";
            String eq13 = " 751 757 761 769 773 787 797 809 811 821 823";
            String eq14 = " 827 829 839 853 857 859 863 877 881 883 887";
            String eq15 = " 907 911 919 929 937 941 947 953 967 971 977";
            String eq16 = " 983 991 997";

            Assert.assertNotNull(l0);
            Assert.assertEquals(l1, eq1);
            Assert.assertEquals(l2, eq2);
            Assert.assertEquals(l3, eq3);
            Assert.assertEquals(l4, eq4);
            Assert.assertEquals(l5, eq5);
            Assert.assertEquals(l6, eq6);
            Assert.assertEquals(l7, eq7);
            Assert.assertEquals(l8, eq8);
            Assert.assertEquals(l9, eq9);
            Assert.assertEquals(l10, eq10);
            Assert.assertEquals(l11, eq11);
            Assert.assertEquals(l12, eq12);
            Assert.assertEquals(l13, eq13);
            Assert.assertEquals(l14, eq14);
            Assert.assertEquals(l15, eq15);
            Assert.assertEquals(l16, eq16);
            Assert.assertNotNull("", l00);

            Assert.assertFalse(ss.hasNext());

        } catch (Exception e) {
            fail("x");
        }
    }

    @Test
    public void test33() {
        try {
            a.fileConstructorSundaram(-1000);

            String result = Files.readString(Paths.get("primesEratosthenes.txt"));

            Scanner ss = new Scanner(result);
            ss.useDelimiter("\n");

            String l0 = ss.next();
            String l00 = ss.next();

            Assert.assertNotNull(l0);
            Assert.assertNotNull("", l00);
            Assert.assertFalse(ss.hasNext());

        } catch (Exception e) {
            fail("x");
        }
    }

    @After
    public void tearDown() throws Exception{
        a = null;
        assertNull(a);
    }
}