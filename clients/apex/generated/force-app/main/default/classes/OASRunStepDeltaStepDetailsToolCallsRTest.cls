@isTest
private class OASRunStepDeltaStepDetailsToolCallsRTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject1 = OASRunStepDeltaStepDetailsToolCallsR.getExample();
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject2 = runStepDeltaStepDetailsToolCallsRetrievalObject1;
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject3 = new OASRunStepDeltaStepDetailsToolCallsR();
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject4 = runStepDeltaStepDetailsToolCallsRetrievalObject3;

        System.assert(runStepDeltaStepDetailsToolCallsRetrievalObject1.equals(runStepDeltaStepDetailsToolCallsRetrievalObject2));
        System.assert(runStepDeltaStepDetailsToolCallsRetrievalObject2.equals(runStepDeltaStepDetailsToolCallsRetrievalObject1));
        System.assert(runStepDeltaStepDetailsToolCallsRetrievalObject1.equals(runStepDeltaStepDetailsToolCallsRetrievalObject1));
        System.assert(runStepDeltaStepDetailsToolCallsRetrievalObject3.equals(runStepDeltaStepDetailsToolCallsRetrievalObject4));
        System.assert(runStepDeltaStepDetailsToolCallsRetrievalObject4.equals(runStepDeltaStepDetailsToolCallsRetrievalObject3));
        System.assert(runStepDeltaStepDetailsToolCallsRetrievalObject3.equals(runStepDeltaStepDetailsToolCallsRetrievalObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject1 = OASRunStepDeltaStepDetailsToolCallsR.getExample();
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject2 = OASRunStepDeltaStepDetailsToolCallsR.getExample();
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject3 = new OASRunStepDeltaStepDetailsToolCallsR();
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject4 = new OASRunStepDeltaStepDetailsToolCallsR();

        System.assert(runStepDeltaStepDetailsToolCallsRetrievalObject1.equals(runStepDeltaStepDetailsToolCallsRetrievalObject2));
        System.assert(runStepDeltaStepDetailsToolCallsRetrievalObject2.equals(runStepDeltaStepDetailsToolCallsRetrievalObject1));
        System.assert(runStepDeltaStepDetailsToolCallsRetrievalObject3.equals(runStepDeltaStepDetailsToolCallsRetrievalObject4));
        System.assert(runStepDeltaStepDetailsToolCallsRetrievalObject4.equals(runStepDeltaStepDetailsToolCallsRetrievalObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject1 = OASRunStepDeltaStepDetailsToolCallsR.getExample();
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject2 = new OASRunStepDeltaStepDetailsToolCallsR();

        System.assertEquals(false, runStepDeltaStepDetailsToolCallsRetrievalObject1.equals('foo'));
        System.assertEquals(false, runStepDeltaStepDetailsToolCallsRetrievalObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject1 = OASRunStepDeltaStepDetailsToolCallsR.getExample();
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject2 = new OASRunStepDeltaStepDetailsToolCallsR();
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject3;

        System.assertEquals(false, runStepDeltaStepDetailsToolCallsRetrievalObject1.equals(runStepDeltaStepDetailsToolCallsRetrievalObject3));
        System.assertEquals(false, runStepDeltaStepDetailsToolCallsRetrievalObject2.equals(runStepDeltaStepDetailsToolCallsRetrievalObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject1 = OASRunStepDeltaStepDetailsToolCallsR.getExample();
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject2 = new OASRunStepDeltaStepDetailsToolCallsR();

        System.assertEquals(runStepDeltaStepDetailsToolCallsRetrievalObject1.hashCode(), runStepDeltaStepDetailsToolCallsRetrievalObject1.hashCode());
        System.assertEquals(runStepDeltaStepDetailsToolCallsRetrievalObject2.hashCode(), runStepDeltaStepDetailsToolCallsRetrievalObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject1 = OASRunStepDeltaStepDetailsToolCallsR.getExample();
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject2 = OASRunStepDeltaStepDetailsToolCallsR.getExample();
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject3 = new OASRunStepDeltaStepDetailsToolCallsR();
        OASRunStepDeltaStepDetailsToolCallsR runStepDeltaStepDetailsToolCallsRetrievalObject4 = new OASRunStepDeltaStepDetailsToolCallsR();

        System.assert(runStepDeltaStepDetailsToolCallsRetrievalObject1.equals(runStepDeltaStepDetailsToolCallsRetrievalObject2));
        System.assert(runStepDeltaStepDetailsToolCallsRetrievalObject3.equals(runStepDeltaStepDetailsToolCallsRetrievalObject4));
        System.assertEquals(runStepDeltaStepDetailsToolCallsRetrievalObject1.hashCode(), runStepDeltaStepDetailsToolCallsRetrievalObject2.hashCode());
        System.assertEquals(runStepDeltaStepDetailsToolCallsRetrievalObject3.hashCode(), runStepDeltaStepDetailsToolCallsRetrievalObject4.hashCode());
    }
}
