package tddTasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

    public class HugeIntegerTest {
        private HugeInteger hugeInteger;
        @BeforeEach
        public void startWithThis(){
            hugeInteger = new HugeInteger(40);
        }
        @Test
        public void hugeIntegerExistTest(){
            assertNotNull(hugeInteger);
        }
        @Test
        public void hugeIntegerCanParseTest(){
            hugeInteger.parse("8674839209849376834945678987654321234567");
            int[] result = hugeInteger.getArrayElements();
            assertEquals(8,result[0]);
            assertEquals(6,result[1]);
            assertEquals(7,result[2]);
            assertEquals(4,result[3]);
            assertEquals(5,result[37]);
            assertEquals(6,result[38]);
            assertEquals(7,result[39]);
            assertEquals(40,hugeInteger.getSize());
        }
        @Test
        public void hugeIntegerCanBeConvertedToStringTest(){
            hugeInteger.parse("8674839209849376834945678987654321234567");
            int[] result = hugeInteger.getArrayElements();
            assertEquals(6,result[1]);
            assertEquals(0,result[8]);
            assertEquals(8,result[10]);
            assertEquals(3,result[13]);
            assertEquals(7,result[14]);
            assertEquals(6,result[15]);
            assertEquals(7,result[39]);
            assertEquals("8674839209849376834945678987654321234567",hugeInteger.toString());
        }
        @Test
        public void twoObjectsOfHugeIntegerCanBeAddedTest(){
            HugeInteger hugeInteger1 = new HugeInteger(40);
            hugeInteger1.parse("3674340000000000000000000000000000000000");
            HugeInteger hugeInteger2 = new HugeInteger(40);
            hugeInteger2.parse("1234500000000000000000000000000000000000");
            String result = HugeInteger.add(hugeInteger1,hugeInteger2);
            assertEquals("4908840000000000000000000000000000000000", result);
        }

        @Test
        public void twoObjectsOfHugeIntegerCanBeSubtractedTest(){
            HugeInteger hugeInteger1 = new HugeInteger(40);
            hugeInteger1.parse("31111");
            HugeInteger hugeInteger2 = new HugeInteger(40);
            hugeInteger2.parse("1234");
            String result = HugeInteger.subtract(hugeInteger1,hugeInteger2);
            assertEquals("1877100000000000000000000000000000000000", result);
        }
        @Test
        public void twoObjectsOfHugeIntegersAreEqualTest(){
            HugeInteger hugeInteger1 = new HugeInteger(40);
            hugeInteger1.parse("3111112345609876543210000000000000000021");
            HugeInteger hugeInteger2 = new HugeInteger(40);
            hugeInteger2.parse("3111112345609876543210000000000000000021");
            assertTrue(hugeInteger1.isEqualTo(hugeInteger2));
        }

        @Test
        public void twoObjectsOfHugeIntegersAreNotEqualTest(){
            HugeInteger hugeInteger1 = new HugeInteger(40);
            hugeInteger1.parse("3111112345609876534567000000000000000044");
            HugeInteger hugeInteger2 = new HugeInteger(40);
            hugeInteger2.parse("3111112345609876543709810000000000000071");
            assertTrue(hugeInteger1.isNotEqualTo(hugeInteger2));
        }

        @Test
        public void oneObjectOfHugeIntegerIsGreaterThanTheOtherTest(){
            HugeInteger hugeInteger1 = new HugeInteger(25);
            hugeInteger1.parse("1829364738294338290364782");
            HugeInteger hugeInteger2 = new HugeInteger(36);
            hugeInteger2.parse("311111234560987654370981000000000000");
            assertTrue(hugeInteger2.isGreaterThan(hugeInteger1));
        }

        @Test
        public void oneObjectOfHugeIntegerIsLessThanTheOtherTest(){
            HugeInteger hugeInteger1 = new HugeInteger(21);
            hugeInteger1.parse("143792759087543985746");
            HugeInteger hugeInteger2 = new HugeInteger(38);
            hugeInteger2.parse("21345675463891827364532819847362512192");
            assertTrue(hugeInteger1.isLessThan(hugeInteger2));
        }

        @Test
        public void oneObjectOfHugeIntegerIsGreaterThanOrEqualToTheOtherTest(){
            HugeInteger hugeInteger1 = new HugeInteger(25);
            hugeInteger1.parse("4560983897537898654609765");
            HugeInteger hugeInteger2 = new HugeInteger(36);
            hugeInteger2.parse("311111234560987654370981000000000001");
            assertTrue(hugeInteger2.isGreaterThanOrEqualTo(hugeInteger1));
        }

        @Test
        public void oneObjectOfHugeIntegerIsLessThanOrEqualToTheOtherTest(){
            HugeInteger hugeInteger1 = new HugeInteger(25);
            hugeInteger1.parse("4560983897537898654609765");
            HugeInteger hugeInteger2 = new HugeInteger(36);
            hugeInteger2.parse("311111234560987654370981000000000001");
            assertTrue(hugeInteger1.isLessThanOrEqualTo(hugeInteger2));
        }
    }

