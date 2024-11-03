@isTest
private class OASRunStepDeltaObjectDeltaStepDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails1 = OASRunStepDeltaObjectDeltaStepDetail.getExample();
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails2 = runStepDeltaObjectDeltaStepDetails1;
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails3 = new OASRunStepDeltaObjectDeltaStepDetail();
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails4 = runStepDeltaObjectDeltaStepDetails3;

        System.assert(runStepDeltaObjectDeltaStepDetails1.equals(runStepDeltaObjectDeltaStepDetails2));
        System.assert(runStepDeltaObjectDeltaStepDetails2.equals(runStepDeltaObjectDeltaStepDetails1));
        System.assert(runStepDeltaObjectDeltaStepDetails1.equals(runStepDeltaObjectDeltaStepDetails1));
        System.assert(runStepDeltaObjectDeltaStepDetails3.equals(runStepDeltaObjectDeltaStepDetails4));
        System.assert(runStepDeltaObjectDeltaStepDetails4.equals(runStepDeltaObjectDeltaStepDetails3));
        System.assert(runStepDeltaObjectDeltaStepDetails3.equals(runStepDeltaObjectDeltaStepDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails1 = OASRunStepDeltaObjectDeltaStepDetail.getExample();
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails2 = OASRunStepDeltaObjectDeltaStepDetail.getExample();
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails3 = new OASRunStepDeltaObjectDeltaStepDetail();
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails4 = new OASRunStepDeltaObjectDeltaStepDetail();

        System.assert(runStepDeltaObjectDeltaStepDetails1.equals(runStepDeltaObjectDeltaStepDetails2));
        System.assert(runStepDeltaObjectDeltaStepDetails2.equals(runStepDeltaObjectDeltaStepDetails1));
        System.assert(runStepDeltaObjectDeltaStepDetails3.equals(runStepDeltaObjectDeltaStepDetails4));
        System.assert(runStepDeltaObjectDeltaStepDetails4.equals(runStepDeltaObjectDeltaStepDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails1 = OASRunStepDeltaObjectDeltaStepDetail.getExample();
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails2 = new OASRunStepDeltaObjectDeltaStepDetail();

        System.assertEquals(false, runStepDeltaObjectDeltaStepDetails1.equals('foo'));
        System.assertEquals(false, runStepDeltaObjectDeltaStepDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails1 = OASRunStepDeltaObjectDeltaStepDetail.getExample();
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails2 = new OASRunStepDeltaObjectDeltaStepDetail();
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails3;

        System.assertEquals(false, runStepDeltaObjectDeltaStepDetails1.equals(runStepDeltaObjectDeltaStepDetails3));
        System.assertEquals(false, runStepDeltaObjectDeltaStepDetails2.equals(runStepDeltaObjectDeltaStepDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails1 = OASRunStepDeltaObjectDeltaStepDetail.getExample();
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails2 = new OASRunStepDeltaObjectDeltaStepDetail();

        System.assertEquals(runStepDeltaObjectDeltaStepDetails1.hashCode(), runStepDeltaObjectDeltaStepDetails1.hashCode());
        System.assertEquals(runStepDeltaObjectDeltaStepDetails2.hashCode(), runStepDeltaObjectDeltaStepDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails1 = OASRunStepDeltaObjectDeltaStepDetail.getExample();
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails2 = OASRunStepDeltaObjectDeltaStepDetail.getExample();
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails3 = new OASRunStepDeltaObjectDeltaStepDetail();
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails4 = new OASRunStepDeltaObjectDeltaStepDetail();

        System.assert(runStepDeltaObjectDeltaStepDetails1.equals(runStepDeltaObjectDeltaStepDetails2));
        System.assert(runStepDeltaObjectDeltaStepDetails3.equals(runStepDeltaObjectDeltaStepDetails4));
        System.assertEquals(runStepDeltaObjectDeltaStepDetails1.hashCode(), runStepDeltaObjectDeltaStepDetails2.hashCode());
        System.assertEquals(runStepDeltaObjectDeltaStepDetails3.hashCode(), runStepDeltaObjectDeltaStepDetails4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails = new OASRunStepDeltaObjectDeltaStepDetail();
        Map<String, String> x-property-mappings = runStepDeltaObjectDeltaStepDetails.getx-property-mappings();
        System.assertEquals('messageCreation', x-property-mappings.get('message_creation'));
        System.assertEquals('toolCalls', x-property-mappings.get('tool_calls'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRunStepDeltaObjectDeltaStepDetail runStepDeltaObjectDeltaStepDetails = new OASRunStepDeltaObjectDeltaStepDetail();
        System.assertEquals(new List<OASRunStepDeltaStepDetailsToolCallsO>(), runStepDeltaObjectDeltaStepDetails.toolCalls);
        System.assertEquals(null, runStepDeltaObjectDeltaStepDetails.type);
        System.assertEquals(null, runStepDeltaObjectDeltaStepDetails.messageCreation);
    }
}
