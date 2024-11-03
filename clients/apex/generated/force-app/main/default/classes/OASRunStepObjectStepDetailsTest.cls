@isTest
private class OASRunStepObjectStepDetailsTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepObjectStepDetails runStepObjectStepDetails1 = OASRunStepObjectStepDetails.getExample();
        OASRunStepObjectStepDetails runStepObjectStepDetails2 = runStepObjectStepDetails1;
        OASRunStepObjectStepDetails runStepObjectStepDetails3 = new OASRunStepObjectStepDetails();
        OASRunStepObjectStepDetails runStepObjectStepDetails4 = runStepObjectStepDetails3;

        System.assert(runStepObjectStepDetails1.equals(runStepObjectStepDetails2));
        System.assert(runStepObjectStepDetails2.equals(runStepObjectStepDetails1));
        System.assert(runStepObjectStepDetails1.equals(runStepObjectStepDetails1));
        System.assert(runStepObjectStepDetails3.equals(runStepObjectStepDetails4));
        System.assert(runStepObjectStepDetails4.equals(runStepObjectStepDetails3));
        System.assert(runStepObjectStepDetails3.equals(runStepObjectStepDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepObjectStepDetails runStepObjectStepDetails1 = OASRunStepObjectStepDetails.getExample();
        OASRunStepObjectStepDetails runStepObjectStepDetails2 = OASRunStepObjectStepDetails.getExample();
        OASRunStepObjectStepDetails runStepObjectStepDetails3 = new OASRunStepObjectStepDetails();
        OASRunStepObjectStepDetails runStepObjectStepDetails4 = new OASRunStepObjectStepDetails();

        System.assert(runStepObjectStepDetails1.equals(runStepObjectStepDetails2));
        System.assert(runStepObjectStepDetails2.equals(runStepObjectStepDetails1));
        System.assert(runStepObjectStepDetails3.equals(runStepObjectStepDetails4));
        System.assert(runStepObjectStepDetails4.equals(runStepObjectStepDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepObjectStepDetails runStepObjectStepDetails1 = OASRunStepObjectStepDetails.getExample();
        OASRunStepObjectStepDetails runStepObjectStepDetails2 = new OASRunStepObjectStepDetails();

        System.assertEquals(false, runStepObjectStepDetails1.equals('foo'));
        System.assertEquals(false, runStepObjectStepDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepObjectStepDetails runStepObjectStepDetails1 = OASRunStepObjectStepDetails.getExample();
        OASRunStepObjectStepDetails runStepObjectStepDetails2 = new OASRunStepObjectStepDetails();
        OASRunStepObjectStepDetails runStepObjectStepDetails3;

        System.assertEquals(false, runStepObjectStepDetails1.equals(runStepObjectStepDetails3));
        System.assertEquals(false, runStepObjectStepDetails2.equals(runStepObjectStepDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepObjectStepDetails runStepObjectStepDetails1 = OASRunStepObjectStepDetails.getExample();
        OASRunStepObjectStepDetails runStepObjectStepDetails2 = new OASRunStepObjectStepDetails();

        System.assertEquals(runStepObjectStepDetails1.hashCode(), runStepObjectStepDetails1.hashCode());
        System.assertEquals(runStepObjectStepDetails2.hashCode(), runStepObjectStepDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepObjectStepDetails runStepObjectStepDetails1 = OASRunStepObjectStepDetails.getExample();
        OASRunStepObjectStepDetails runStepObjectStepDetails2 = OASRunStepObjectStepDetails.getExample();
        OASRunStepObjectStepDetails runStepObjectStepDetails3 = new OASRunStepObjectStepDetails();
        OASRunStepObjectStepDetails runStepObjectStepDetails4 = new OASRunStepObjectStepDetails();

        System.assert(runStepObjectStepDetails1.equals(runStepObjectStepDetails2));
        System.assert(runStepObjectStepDetails3.equals(runStepObjectStepDetails4));
        System.assertEquals(runStepObjectStepDetails1.hashCode(), runStepObjectStepDetails2.hashCode());
        System.assertEquals(runStepObjectStepDetails3.hashCode(), runStepObjectStepDetails4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunStepObjectStepDetails runStepObjectStepDetails = new OASRunStepObjectStepDetails();
        Map<String, String> x-property-mappings = runStepObjectStepDetails.getx-property-mappings();
        System.assertEquals('messageCreation', x-property-mappings.get('message_creation'));
        System.assertEquals('toolCalls', x-property-mappings.get('tool_calls'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRunStepObjectStepDetails runStepObjectStepDetails = new OASRunStepObjectStepDetails();
        System.assertEquals(new List<OASRunStepDetailsToolCallsObjectTool>(), runStepObjectStepDetails.toolCalls);
        System.assertEquals(null, runStepObjectStepDetails.type);
        System.assertEquals(null, runStepObjectStepDetails.messageCreation);
    }
}
