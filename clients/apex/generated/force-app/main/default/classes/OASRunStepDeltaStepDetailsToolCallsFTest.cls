@isTest
private class OASRunStepDeltaStepDetailsToolCallsFTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction1 = OASRunStepDeltaStepDetailsToolCallsF.getExample();
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction2 = runStepDeltaStepDetailsToolCallsFunctionObjectFunction1;
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction3 = new OASRunStepDeltaStepDetailsToolCallsF();
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction4 = runStepDeltaStepDetailsToolCallsFunctionObjectFunction3;

        System.assert(runStepDeltaStepDetailsToolCallsFunctionObjectFunction1.equals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction2));
        System.assert(runStepDeltaStepDetailsToolCallsFunctionObjectFunction2.equals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction1));
        System.assert(runStepDeltaStepDetailsToolCallsFunctionObjectFunction1.equals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction1));
        System.assert(runStepDeltaStepDetailsToolCallsFunctionObjectFunction3.equals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction4));
        System.assert(runStepDeltaStepDetailsToolCallsFunctionObjectFunction4.equals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction3));
        System.assert(runStepDeltaStepDetailsToolCallsFunctionObjectFunction3.equals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction1 = OASRunStepDeltaStepDetailsToolCallsF.getExample();
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction2 = OASRunStepDeltaStepDetailsToolCallsF.getExample();
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction3 = new OASRunStepDeltaStepDetailsToolCallsF();
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction4 = new OASRunStepDeltaStepDetailsToolCallsF();

        System.assert(runStepDeltaStepDetailsToolCallsFunctionObjectFunction1.equals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction2));
        System.assert(runStepDeltaStepDetailsToolCallsFunctionObjectFunction2.equals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction1));
        System.assert(runStepDeltaStepDetailsToolCallsFunctionObjectFunction3.equals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction4));
        System.assert(runStepDeltaStepDetailsToolCallsFunctionObjectFunction4.equals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction1 = OASRunStepDeltaStepDetailsToolCallsF.getExample();
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction2 = new OASRunStepDeltaStepDetailsToolCallsF();

        System.assertEquals(false, runStepDeltaStepDetailsToolCallsFunctionObjectFunction1.equals('foo'));
        System.assertEquals(false, runStepDeltaStepDetailsToolCallsFunctionObjectFunction2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction1 = OASRunStepDeltaStepDetailsToolCallsF.getExample();
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction2 = new OASRunStepDeltaStepDetailsToolCallsF();
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction3;

        System.assertEquals(false, runStepDeltaStepDetailsToolCallsFunctionObjectFunction1.equals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction3));
        System.assertEquals(false, runStepDeltaStepDetailsToolCallsFunctionObjectFunction2.equals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction1 = OASRunStepDeltaStepDetailsToolCallsF.getExample();
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction2 = new OASRunStepDeltaStepDetailsToolCallsF();

        System.assertEquals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction1.hashCode(), runStepDeltaStepDetailsToolCallsFunctionObjectFunction1.hashCode());
        System.assertEquals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction2.hashCode(), runStepDeltaStepDetailsToolCallsFunctionObjectFunction2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction1 = OASRunStepDeltaStepDetailsToolCallsF.getExample();
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction2 = OASRunStepDeltaStepDetailsToolCallsF.getExample();
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction3 = new OASRunStepDeltaStepDetailsToolCallsF();
        OASRunStepDeltaStepDetailsToolCallsF runStepDeltaStepDetailsToolCallsFunctionObjectFunction4 = new OASRunStepDeltaStepDetailsToolCallsF();

        System.assert(runStepDeltaStepDetailsToolCallsFunctionObjectFunction1.equals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction2));
        System.assert(runStepDeltaStepDetailsToolCallsFunctionObjectFunction3.equals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction4));
        System.assertEquals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction1.hashCode(), runStepDeltaStepDetailsToolCallsFunctionObjectFunction2.hashCode());
        System.assertEquals(runStepDeltaStepDetailsToolCallsFunctionObjectFunction3.hashCode(), runStepDeltaStepDetailsToolCallsFunctionObjectFunction4.hashCode());
    }
}
