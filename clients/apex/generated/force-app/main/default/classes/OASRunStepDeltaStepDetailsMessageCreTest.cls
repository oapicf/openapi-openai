@isTest
private class OASRunStepDeltaStepDetailsMessageCreTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation1 = OASRunStepDeltaStepDetailsMessageCre.getExample();
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation2 = runStepDeltaStepDetailsMessageCreationObjectMessageCreation1;
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation3 = new OASRunStepDeltaStepDetailsMessageCre();
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation4 = runStepDeltaStepDetailsMessageCreationObjectMessageCreation3;

        System.assert(runStepDeltaStepDetailsMessageCreationObjectMessageCreation1.equals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation2));
        System.assert(runStepDeltaStepDetailsMessageCreationObjectMessageCreation2.equals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation1));
        System.assert(runStepDeltaStepDetailsMessageCreationObjectMessageCreation1.equals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation1));
        System.assert(runStepDeltaStepDetailsMessageCreationObjectMessageCreation3.equals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation4));
        System.assert(runStepDeltaStepDetailsMessageCreationObjectMessageCreation4.equals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation3));
        System.assert(runStepDeltaStepDetailsMessageCreationObjectMessageCreation3.equals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation1 = OASRunStepDeltaStepDetailsMessageCre.getExample();
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation2 = OASRunStepDeltaStepDetailsMessageCre.getExample();
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation3 = new OASRunStepDeltaStepDetailsMessageCre();
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation4 = new OASRunStepDeltaStepDetailsMessageCre();

        System.assert(runStepDeltaStepDetailsMessageCreationObjectMessageCreation1.equals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation2));
        System.assert(runStepDeltaStepDetailsMessageCreationObjectMessageCreation2.equals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation1));
        System.assert(runStepDeltaStepDetailsMessageCreationObjectMessageCreation3.equals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation4));
        System.assert(runStepDeltaStepDetailsMessageCreationObjectMessageCreation4.equals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation1 = OASRunStepDeltaStepDetailsMessageCre.getExample();
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation2 = new OASRunStepDeltaStepDetailsMessageCre();

        System.assertEquals(false, runStepDeltaStepDetailsMessageCreationObjectMessageCreation1.equals('foo'));
        System.assertEquals(false, runStepDeltaStepDetailsMessageCreationObjectMessageCreation2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation1 = OASRunStepDeltaStepDetailsMessageCre.getExample();
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation2 = new OASRunStepDeltaStepDetailsMessageCre();
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation3;

        System.assertEquals(false, runStepDeltaStepDetailsMessageCreationObjectMessageCreation1.equals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation3));
        System.assertEquals(false, runStepDeltaStepDetailsMessageCreationObjectMessageCreation2.equals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation1 = OASRunStepDeltaStepDetailsMessageCre.getExample();
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation2 = new OASRunStepDeltaStepDetailsMessageCre();

        System.assertEquals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation1.hashCode(), runStepDeltaStepDetailsMessageCreationObjectMessageCreation1.hashCode());
        System.assertEquals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation2.hashCode(), runStepDeltaStepDetailsMessageCreationObjectMessageCreation2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation1 = OASRunStepDeltaStepDetailsMessageCre.getExample();
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation2 = OASRunStepDeltaStepDetailsMessageCre.getExample();
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation3 = new OASRunStepDeltaStepDetailsMessageCre();
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation4 = new OASRunStepDeltaStepDetailsMessageCre();

        System.assert(runStepDeltaStepDetailsMessageCreationObjectMessageCreation1.equals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation2));
        System.assert(runStepDeltaStepDetailsMessageCreationObjectMessageCreation3.equals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation4));
        System.assertEquals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation1.hashCode(), runStepDeltaStepDetailsMessageCreationObjectMessageCreation2.hashCode());
        System.assertEquals(runStepDeltaStepDetailsMessageCreationObjectMessageCreation3.hashCode(), runStepDeltaStepDetailsMessageCreationObjectMessageCreation4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunStepDeltaStepDetailsMessageCre runStepDeltaStepDetailsMessageCreationObjectMessageCreation = new OASRunStepDeltaStepDetailsMessageCre();
        Map<String, String> x-property-mappings = runStepDeltaStepDetailsMessageCreationObjectMessageCreation.getx-property-mappings();
        System.assertEquals('messageId', x-property-mappings.get('message_id'));
    }
}
