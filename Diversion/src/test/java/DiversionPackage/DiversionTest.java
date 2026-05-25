package DiversionPackage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class DiversionTest {
    @Nested
    @DisplayName("Generate combinations")
    class GenerateCombinations{
        @Test
        @DisplayName("Should return 0, 1")
        void test1(){
            int input = 1;

            String[] output = Diversion.getAllCombinations(input);

            assertArrayEquals(new String[]{"0", "1"}, output);
        }
        @Test
        @DisplayName("Should return 00, 01, 10, 11")
        void test2(){
            int input = 2;

            String[] output = Diversion.getAllCombinations(input);

            assertArrayEquals(new String[]{"00", "01", "10", "11"}, output);
        }
        @Test
        @DisplayName("Should return 000, 001, 010, 011, 100, 101, 110, 111")
        void test3(){
            int input = 3;

            String[] output = Diversion.getAllCombinations(input);

            assertArrayEquals(new String[]{"000", "001", "010", "011", "100", "101", "110", "111"}, output);
        }
    }
    @Nested
    @DisplayName("Has Two '1' in a row?")
    class Two1InARow{
        @Test
        @DisplayName("Should return false with 0")
        void test1(){
            String input = "0";

            boolean output = Diversion.twoOnesInARow(input);
            assertFalse( output);
        }
        @Test
        @DisplayName("Should return false with 01")
        void test2(){
            String input = "01";

            boolean output = Diversion.twoOnesInARow(input);
            assertFalse(output);
        }
        @Test
        @DisplayName("Should return true with 11")
        void test3(){
            String input = "11";

            boolean output = Diversion.twoOnesInARow(input);
            assertTrue(output);
        }
        @Test
        @DisplayName("Should return false with 101")
        void test4(){
            String input = "101";

            boolean output = Diversion.twoOnesInARow(input);
            assertFalse(output);
        }
    }
    @Nested
    @DisplayName("Total number of generate combination that don,t meet the condition")
    class NumberOfCombinationThatDontMeetCondition{
        @Test
        @DisplayName("Should return 0 with input '0, 1'")
        void test1(){
            String[] input = {"0", "1"};

            int output = Diversion.CountNumberOfCombinationsThatDontMeetCondition(input);
            assertEquals((float) 0, output);
        }
        @Test
        @DisplayName("Should return 0 with input '00, 01, 10, 11'")
        void test2(){
            String[] input = {"00", "01", "10", "11"};

            int output = Diversion.CountNumberOfCombinationsThatDontMeetCondition(input);
            assertEquals((float) 3, output);
        }
        @Test
        @DisplayName("Should return 0 with input '000, 001, 010, 011, 100, 101, 110, 111'")
        void test3(){
            String[] input = {"000", "001", "010", "011", "100", "101", "110", "111"};

            int output = Diversion.CountNumberOfCombinationsThatDontMeetCondition(input);
            assertEquals((float) 5, output);
        }
    }
    @Nested
    @DisplayName("Diversion")
    class DiversionFinalTest{
        @Test
        @DisplayName("should return 5 with the generate combinations of 3")
        void test1(){
            int input = 3;
            int output = Diversion.diversion(input);

            assertEquals((float) 5, output);
        }
        @Test
        @DisplayName("should return 8 with the generate combinations of 4")
        void test2(){
            int input = 4;
            int output = Diversion.diversion(input);

            assertEquals((float) 8, output);
        }
        @Test
        @DisplayName("should return 0 with the generate combinations of 0")
        void test3(){
            int input = 0;
            int output = Diversion.diversion(input);

            assertEquals((float) 0, output);
        }
        @Test
        @DisplayName("should return 0 with the generate combinations of 1")
        void test4(){
            int input = 1;
            int output = Diversion.diversion(input);

            assertEquals((float) 0, output);
        }
        @Test
        @DisplayName("should return 55 with the generate combinations of 8")
        void test5(){
            int input = 8;
            int output = Diversion.diversion(input);

            assertEquals((float) 55, output);
        }
    }


}





