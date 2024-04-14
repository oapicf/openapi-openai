@isTest
private class OASRunStepDetailsToolCallsRetrievalOTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject1 = OASRunStepDetailsToolCallsRetrievalO.getExample();
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject2 = runStepDetailsToolCallsRetrievalObject1;
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject3 = new OASRunStepDetailsToolCallsRetrievalO();
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject4 = runStepDetailsToolCallsRetrievalObject3;

        System.assert(runStepDetailsToolCallsRetrievalObject1.equals(runStepDetailsToolCallsRetrievalObject2));
        System.assert(runStepDetailsToolCallsRetrievalObject2.equals(runStepDetailsToolCallsRetrievalObject1));
        System.assert(runStepDetailsToolCallsRetrievalObject1.equals(runStepDetailsToolCallsRetrievalObject1));
        System.assert(runStepDetailsToolCallsRetrievalObject3.equals(runStepDetailsToolCallsRetrievalObject4));
        System.assert(runStepDetailsToolCallsRetrievalObject4.equals(runStepDetailsToolCallsRetrievalObject3));
        System.assert(runStepDetailsToolCallsRetrievalObject3.equals(runStepDetailsToolCallsRetrievalObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject1 = OASRunStepDetailsToolCallsRetrievalO.getExample();
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject2 = OASRunStepDetailsToolCallsRetrievalO.getExample();
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject3 = new OASRunStepDetailsToolCallsRetrievalO();
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject4 = new OASRunStepDetailsToolCallsRetrievalO();

        System.assert(runStepDetailsToolCallsRetrievalObject1.equals(runStepDetailsToolCallsRetrievalObject2));
        System.assert(runStepDetailsToolCallsRetrievalObject2.equals(runStepDetailsToolCallsRetrievalObject1));
        System.assert(runStepDetailsToolCallsRetrievalObject3.equals(runStepDetailsToolCallsRetrievalObject4));
        System.assert(runStepDetailsToolCallsRetrievalObject4.equals(runStepDetailsToolCallsRetrievalObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject1 = OASRunStepDetailsToolCallsRetrievalO.getExample();
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject2 = new OASRunStepDetailsToolCallsRetrievalO();

        System.assertEquals(false, runStepDetailsToolCallsRetrievalObject1.equals('foo'));
        System.assertEquals(false, runStepDetailsToolCallsRetrievalObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject1 = OASRunStepDetailsToolCallsRetrievalO.getExample();
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject2 = new OASRunStepDetailsToolCallsRetrievalO();
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject3;

        System.assertEquals(false, runStepDetailsToolCallsRetrievalObject1.equals(runStepDetailsToolCallsRetrievalObject3));
        System.assertEquals(false, runStepDetailsToolCallsRetrievalObject2.equals(runStepDetailsToolCallsRetrievalObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject1 = OASRunStepDetailsToolCallsRetrievalO.getExample();
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject2 = new OASRunStepDetailsToolCallsRetrievalO();

        System.assertEquals(runStepDetailsToolCallsRetrievalObject1.hashCode(), runStepDetailsToolCallsRetrievalObject1.hashCode());
        System.assertEquals(runStepDetailsToolCallsRetrievalObject2.hashCode(), runStepDetailsToolCallsRetrievalObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject1 = OASRunStepDetailsToolCallsRetrievalO.getExample();
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject2 = OASRunStepDetailsToolCallsRetrievalO.getExample();
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject3 = new OASRunStepDetailsToolCallsRetrievalO();
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject4 = new OASRunStepDetailsToolCallsRetrievalO();

        System.assert(runStepDetailsToolCallsRetrievalObject1.equals(runStepDetailsToolCallsRetrievalObject2));
        System.assert(runStepDetailsToolCallsRetrievalObject3.equals(runStepDetailsToolCallsRetrievalObject4));
        System.assertEquals(runStepDetailsToolCallsRetrievalObject1.hashCode(), runStepDetailsToolCallsRetrievalObject2.hashCode());
        System.assertEquals(runStepDetailsToolCallsRetrievalObject3.hashCode(), runStepDetailsToolCallsRetrievalObject4.hashCode());
    }
}
