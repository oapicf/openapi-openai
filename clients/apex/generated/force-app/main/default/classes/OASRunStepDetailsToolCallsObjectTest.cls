@isTest
private class OASRunStepDetailsToolCallsObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject1 = OASRunStepDetailsToolCallsObject.getExample();
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject2 = runStepDetailsToolCallsObject1;
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject3 = new OASRunStepDetailsToolCallsObject();
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject4 = runStepDetailsToolCallsObject3;

        System.assert(runStepDetailsToolCallsObject1.equals(runStepDetailsToolCallsObject2));
        System.assert(runStepDetailsToolCallsObject2.equals(runStepDetailsToolCallsObject1));
        System.assert(runStepDetailsToolCallsObject1.equals(runStepDetailsToolCallsObject1));
        System.assert(runStepDetailsToolCallsObject3.equals(runStepDetailsToolCallsObject4));
        System.assert(runStepDetailsToolCallsObject4.equals(runStepDetailsToolCallsObject3));
        System.assert(runStepDetailsToolCallsObject3.equals(runStepDetailsToolCallsObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject1 = OASRunStepDetailsToolCallsObject.getExample();
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject2 = OASRunStepDetailsToolCallsObject.getExample();
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject3 = new OASRunStepDetailsToolCallsObject();
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject4 = new OASRunStepDetailsToolCallsObject();

        System.assert(runStepDetailsToolCallsObject1.equals(runStepDetailsToolCallsObject2));
        System.assert(runStepDetailsToolCallsObject2.equals(runStepDetailsToolCallsObject1));
        System.assert(runStepDetailsToolCallsObject3.equals(runStepDetailsToolCallsObject4));
        System.assert(runStepDetailsToolCallsObject4.equals(runStepDetailsToolCallsObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject1 = OASRunStepDetailsToolCallsObject.getExample();
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject2 = new OASRunStepDetailsToolCallsObject();

        System.assertEquals(false, runStepDetailsToolCallsObject1.equals('foo'));
        System.assertEquals(false, runStepDetailsToolCallsObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject1 = OASRunStepDetailsToolCallsObject.getExample();
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject2 = new OASRunStepDetailsToolCallsObject();
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject3;

        System.assertEquals(false, runStepDetailsToolCallsObject1.equals(runStepDetailsToolCallsObject3));
        System.assertEquals(false, runStepDetailsToolCallsObject2.equals(runStepDetailsToolCallsObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject1 = OASRunStepDetailsToolCallsObject.getExample();
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject2 = new OASRunStepDetailsToolCallsObject();

        System.assertEquals(runStepDetailsToolCallsObject1.hashCode(), runStepDetailsToolCallsObject1.hashCode());
        System.assertEquals(runStepDetailsToolCallsObject2.hashCode(), runStepDetailsToolCallsObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject1 = OASRunStepDetailsToolCallsObject.getExample();
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject2 = OASRunStepDetailsToolCallsObject.getExample();
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject3 = new OASRunStepDetailsToolCallsObject();
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject4 = new OASRunStepDetailsToolCallsObject();

        System.assert(runStepDetailsToolCallsObject1.equals(runStepDetailsToolCallsObject2));
        System.assert(runStepDetailsToolCallsObject3.equals(runStepDetailsToolCallsObject4));
        System.assertEquals(runStepDetailsToolCallsObject1.hashCode(), runStepDetailsToolCallsObject2.hashCode());
        System.assertEquals(runStepDetailsToolCallsObject3.hashCode(), runStepDetailsToolCallsObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject = new OASRunStepDetailsToolCallsObject();
        Map<String, String> x-property-mappings = runStepDetailsToolCallsObject.getx-property-mappings();
        System.assertEquals('toolCalls', x-property-mappings.get('tool_calls'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRunStepDetailsToolCallsObject runStepDetailsToolCallsObject = new OASRunStepDetailsToolCallsObject();
        System.assertEquals(new List<OASRunStepDetailsToolCallsObjectTool>(), runStepDetailsToolCallsObject.toolCalls);
        System.assertEquals(null, runStepDetailsToolCallsObject.type);
    }
}
