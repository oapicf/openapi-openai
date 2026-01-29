@isTest
private class OASRunToolCallObjectFunctionTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunToolCallObjectFunction runToolCallObjectFunction1 = OASRunToolCallObjectFunction.getExample();
        OASRunToolCallObjectFunction runToolCallObjectFunction2 = runToolCallObjectFunction1;
        OASRunToolCallObjectFunction runToolCallObjectFunction3 = new OASRunToolCallObjectFunction();
        OASRunToolCallObjectFunction runToolCallObjectFunction4 = runToolCallObjectFunction3;

        System.assert(runToolCallObjectFunction1.equals(runToolCallObjectFunction2));
        System.assert(runToolCallObjectFunction2.equals(runToolCallObjectFunction1));
        System.assert(runToolCallObjectFunction1.equals(runToolCallObjectFunction1));
        System.assert(runToolCallObjectFunction3.equals(runToolCallObjectFunction4));
        System.assert(runToolCallObjectFunction4.equals(runToolCallObjectFunction3));
        System.assert(runToolCallObjectFunction3.equals(runToolCallObjectFunction3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunToolCallObjectFunction runToolCallObjectFunction1 = OASRunToolCallObjectFunction.getExample();
        OASRunToolCallObjectFunction runToolCallObjectFunction2 = OASRunToolCallObjectFunction.getExample();
        OASRunToolCallObjectFunction runToolCallObjectFunction3 = new OASRunToolCallObjectFunction();
        OASRunToolCallObjectFunction runToolCallObjectFunction4 = new OASRunToolCallObjectFunction();

        System.assert(runToolCallObjectFunction1.equals(runToolCallObjectFunction2));
        System.assert(runToolCallObjectFunction2.equals(runToolCallObjectFunction1));
        System.assert(runToolCallObjectFunction3.equals(runToolCallObjectFunction4));
        System.assert(runToolCallObjectFunction4.equals(runToolCallObjectFunction3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunToolCallObjectFunction runToolCallObjectFunction1 = OASRunToolCallObjectFunction.getExample();
        OASRunToolCallObjectFunction runToolCallObjectFunction2 = new OASRunToolCallObjectFunction();

        System.assertEquals(false, runToolCallObjectFunction1.equals('foo'));
        System.assertEquals(false, runToolCallObjectFunction2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunToolCallObjectFunction runToolCallObjectFunction1 = OASRunToolCallObjectFunction.getExample();
        OASRunToolCallObjectFunction runToolCallObjectFunction2 = new OASRunToolCallObjectFunction();
        OASRunToolCallObjectFunction runToolCallObjectFunction3;

        System.assertEquals(false, runToolCallObjectFunction1.equals(runToolCallObjectFunction3));
        System.assertEquals(false, runToolCallObjectFunction2.equals(runToolCallObjectFunction3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunToolCallObjectFunction runToolCallObjectFunction1 = OASRunToolCallObjectFunction.getExample();
        OASRunToolCallObjectFunction runToolCallObjectFunction2 = new OASRunToolCallObjectFunction();

        System.assertEquals(runToolCallObjectFunction1.hashCode(), runToolCallObjectFunction1.hashCode());
        System.assertEquals(runToolCallObjectFunction2.hashCode(), runToolCallObjectFunction2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunToolCallObjectFunction runToolCallObjectFunction1 = OASRunToolCallObjectFunction.getExample();
        OASRunToolCallObjectFunction runToolCallObjectFunction2 = OASRunToolCallObjectFunction.getExample();
        OASRunToolCallObjectFunction runToolCallObjectFunction3 = new OASRunToolCallObjectFunction();
        OASRunToolCallObjectFunction runToolCallObjectFunction4 = new OASRunToolCallObjectFunction();

        System.assert(runToolCallObjectFunction1.equals(runToolCallObjectFunction2));
        System.assert(runToolCallObjectFunction3.equals(runToolCallObjectFunction4));
        System.assertEquals(runToolCallObjectFunction1.hashCode(), runToolCallObjectFunction2.hashCode());
        System.assertEquals(runToolCallObjectFunction3.hashCode(), runToolCallObjectFunction4.hashCode());
    }
}
