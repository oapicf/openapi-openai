@isTest
private class OASRunStepDetailsMessageCreationObjeTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation1 = OASRunStepDetailsMessageCreationObje.getExample();
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation2 = runStepDetailsMessageCreationObjectMessageCreation1;
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation3 = new OASRunStepDetailsMessageCreationObje();
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation4 = runStepDetailsMessageCreationObjectMessageCreation3;

        System.assert(runStepDetailsMessageCreationObjectMessageCreation1.equals(runStepDetailsMessageCreationObjectMessageCreation2));
        System.assert(runStepDetailsMessageCreationObjectMessageCreation2.equals(runStepDetailsMessageCreationObjectMessageCreation1));
        System.assert(runStepDetailsMessageCreationObjectMessageCreation1.equals(runStepDetailsMessageCreationObjectMessageCreation1));
        System.assert(runStepDetailsMessageCreationObjectMessageCreation3.equals(runStepDetailsMessageCreationObjectMessageCreation4));
        System.assert(runStepDetailsMessageCreationObjectMessageCreation4.equals(runStepDetailsMessageCreationObjectMessageCreation3));
        System.assert(runStepDetailsMessageCreationObjectMessageCreation3.equals(runStepDetailsMessageCreationObjectMessageCreation3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation1 = OASRunStepDetailsMessageCreationObje.getExample();
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation2 = OASRunStepDetailsMessageCreationObje.getExample();
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation3 = new OASRunStepDetailsMessageCreationObje();
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation4 = new OASRunStepDetailsMessageCreationObje();

        System.assert(runStepDetailsMessageCreationObjectMessageCreation1.equals(runStepDetailsMessageCreationObjectMessageCreation2));
        System.assert(runStepDetailsMessageCreationObjectMessageCreation2.equals(runStepDetailsMessageCreationObjectMessageCreation1));
        System.assert(runStepDetailsMessageCreationObjectMessageCreation3.equals(runStepDetailsMessageCreationObjectMessageCreation4));
        System.assert(runStepDetailsMessageCreationObjectMessageCreation4.equals(runStepDetailsMessageCreationObjectMessageCreation3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation1 = OASRunStepDetailsMessageCreationObje.getExample();
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation2 = new OASRunStepDetailsMessageCreationObje();

        System.assertEquals(false, runStepDetailsMessageCreationObjectMessageCreation1.equals('foo'));
        System.assertEquals(false, runStepDetailsMessageCreationObjectMessageCreation2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation1 = OASRunStepDetailsMessageCreationObje.getExample();
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation2 = new OASRunStepDetailsMessageCreationObje();
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation3;

        System.assertEquals(false, runStepDetailsMessageCreationObjectMessageCreation1.equals(runStepDetailsMessageCreationObjectMessageCreation3));
        System.assertEquals(false, runStepDetailsMessageCreationObjectMessageCreation2.equals(runStepDetailsMessageCreationObjectMessageCreation3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation1 = OASRunStepDetailsMessageCreationObje.getExample();
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation2 = new OASRunStepDetailsMessageCreationObje();

        System.assertEquals(runStepDetailsMessageCreationObjectMessageCreation1.hashCode(), runStepDetailsMessageCreationObjectMessageCreation1.hashCode());
        System.assertEquals(runStepDetailsMessageCreationObjectMessageCreation2.hashCode(), runStepDetailsMessageCreationObjectMessageCreation2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation1 = OASRunStepDetailsMessageCreationObje.getExample();
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation2 = OASRunStepDetailsMessageCreationObje.getExample();
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation3 = new OASRunStepDetailsMessageCreationObje();
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation4 = new OASRunStepDetailsMessageCreationObje();

        System.assert(runStepDetailsMessageCreationObjectMessageCreation1.equals(runStepDetailsMessageCreationObjectMessageCreation2));
        System.assert(runStepDetailsMessageCreationObjectMessageCreation3.equals(runStepDetailsMessageCreationObjectMessageCreation4));
        System.assertEquals(runStepDetailsMessageCreationObjectMessageCreation1.hashCode(), runStepDetailsMessageCreationObjectMessageCreation2.hashCode());
        System.assertEquals(runStepDetailsMessageCreationObjectMessageCreation3.hashCode(), runStepDetailsMessageCreationObjectMessageCreation4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunStepDetailsMessageCreationObje runStepDetailsMessageCreationObjectMessageCreation = new OASRunStepDetailsMessageCreationObje();
        Map<String, String> x-property-mappings = runStepDetailsMessageCreationObjectMessageCreation.getx-property-mappings();
        System.assertEquals('messageId', x-property-mappings.get('message_id'));
    }
}
