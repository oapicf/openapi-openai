@isTest
private class OASRunStepDetailsToolCallsFunctionObTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction1 = OASRunStepDetailsToolCallsFunctionOb.getExample();
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction2 = runStepDetailsToolCallsFunctionObjectFunction1;
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction3 = new OASRunStepDetailsToolCallsFunctionOb();
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction4 = runStepDetailsToolCallsFunctionObjectFunction3;

        System.assert(runStepDetailsToolCallsFunctionObjectFunction1.equals(runStepDetailsToolCallsFunctionObjectFunction2));
        System.assert(runStepDetailsToolCallsFunctionObjectFunction2.equals(runStepDetailsToolCallsFunctionObjectFunction1));
        System.assert(runStepDetailsToolCallsFunctionObjectFunction1.equals(runStepDetailsToolCallsFunctionObjectFunction1));
        System.assert(runStepDetailsToolCallsFunctionObjectFunction3.equals(runStepDetailsToolCallsFunctionObjectFunction4));
        System.assert(runStepDetailsToolCallsFunctionObjectFunction4.equals(runStepDetailsToolCallsFunctionObjectFunction3));
        System.assert(runStepDetailsToolCallsFunctionObjectFunction3.equals(runStepDetailsToolCallsFunctionObjectFunction3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction1 = OASRunStepDetailsToolCallsFunctionOb.getExample();
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction2 = OASRunStepDetailsToolCallsFunctionOb.getExample();
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction3 = new OASRunStepDetailsToolCallsFunctionOb();
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction4 = new OASRunStepDetailsToolCallsFunctionOb();

        System.assert(runStepDetailsToolCallsFunctionObjectFunction1.equals(runStepDetailsToolCallsFunctionObjectFunction2));
        System.assert(runStepDetailsToolCallsFunctionObjectFunction2.equals(runStepDetailsToolCallsFunctionObjectFunction1));
        System.assert(runStepDetailsToolCallsFunctionObjectFunction3.equals(runStepDetailsToolCallsFunctionObjectFunction4));
        System.assert(runStepDetailsToolCallsFunctionObjectFunction4.equals(runStepDetailsToolCallsFunctionObjectFunction3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction1 = OASRunStepDetailsToolCallsFunctionOb.getExample();
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction2 = new OASRunStepDetailsToolCallsFunctionOb();

        System.assertEquals(false, runStepDetailsToolCallsFunctionObjectFunction1.equals('foo'));
        System.assertEquals(false, runStepDetailsToolCallsFunctionObjectFunction2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction1 = OASRunStepDetailsToolCallsFunctionOb.getExample();
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction2 = new OASRunStepDetailsToolCallsFunctionOb();
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction3;

        System.assertEquals(false, runStepDetailsToolCallsFunctionObjectFunction1.equals(runStepDetailsToolCallsFunctionObjectFunction3));
        System.assertEquals(false, runStepDetailsToolCallsFunctionObjectFunction2.equals(runStepDetailsToolCallsFunctionObjectFunction3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction1 = OASRunStepDetailsToolCallsFunctionOb.getExample();
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction2 = new OASRunStepDetailsToolCallsFunctionOb();

        System.assertEquals(runStepDetailsToolCallsFunctionObjectFunction1.hashCode(), runStepDetailsToolCallsFunctionObjectFunction1.hashCode());
        System.assertEquals(runStepDetailsToolCallsFunctionObjectFunction2.hashCode(), runStepDetailsToolCallsFunctionObjectFunction2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction1 = OASRunStepDetailsToolCallsFunctionOb.getExample();
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction2 = OASRunStepDetailsToolCallsFunctionOb.getExample();
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction3 = new OASRunStepDetailsToolCallsFunctionOb();
        OASRunStepDetailsToolCallsFunctionOb runStepDetailsToolCallsFunctionObjectFunction4 = new OASRunStepDetailsToolCallsFunctionOb();

        System.assert(runStepDetailsToolCallsFunctionObjectFunction1.equals(runStepDetailsToolCallsFunctionObjectFunction2));
        System.assert(runStepDetailsToolCallsFunctionObjectFunction3.equals(runStepDetailsToolCallsFunctionObjectFunction4));
        System.assertEquals(runStepDetailsToolCallsFunctionObjectFunction1.hashCode(), runStepDetailsToolCallsFunctionObjectFunction2.hashCode());
        System.assertEquals(runStepDetailsToolCallsFunctionObjectFunction3.hashCode(), runStepDetailsToolCallsFunctionObjectFunction4.hashCode());
    }
}
