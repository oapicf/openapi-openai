@isTest
private class OASAssistantToolsRetrievalTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantToolsRetrieval assistantToolsRetrieval1 = OASAssistantToolsRetrieval.getExample();
        OASAssistantToolsRetrieval assistantToolsRetrieval2 = assistantToolsRetrieval1;
        OASAssistantToolsRetrieval assistantToolsRetrieval3 = new OASAssistantToolsRetrieval();
        OASAssistantToolsRetrieval assistantToolsRetrieval4 = assistantToolsRetrieval3;

        System.assert(assistantToolsRetrieval1.equals(assistantToolsRetrieval2));
        System.assert(assistantToolsRetrieval2.equals(assistantToolsRetrieval1));
        System.assert(assistantToolsRetrieval1.equals(assistantToolsRetrieval1));
        System.assert(assistantToolsRetrieval3.equals(assistantToolsRetrieval4));
        System.assert(assistantToolsRetrieval4.equals(assistantToolsRetrieval3));
        System.assert(assistantToolsRetrieval3.equals(assistantToolsRetrieval3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantToolsRetrieval assistantToolsRetrieval1 = OASAssistantToolsRetrieval.getExample();
        OASAssistantToolsRetrieval assistantToolsRetrieval2 = OASAssistantToolsRetrieval.getExample();
        OASAssistantToolsRetrieval assistantToolsRetrieval3 = new OASAssistantToolsRetrieval();
        OASAssistantToolsRetrieval assistantToolsRetrieval4 = new OASAssistantToolsRetrieval();

        System.assert(assistantToolsRetrieval1.equals(assistantToolsRetrieval2));
        System.assert(assistantToolsRetrieval2.equals(assistantToolsRetrieval1));
        System.assert(assistantToolsRetrieval3.equals(assistantToolsRetrieval4));
        System.assert(assistantToolsRetrieval4.equals(assistantToolsRetrieval3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantToolsRetrieval assistantToolsRetrieval1 = OASAssistantToolsRetrieval.getExample();
        OASAssistantToolsRetrieval assistantToolsRetrieval2 = new OASAssistantToolsRetrieval();

        System.assertEquals(false, assistantToolsRetrieval1.equals('foo'));
        System.assertEquals(false, assistantToolsRetrieval2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantToolsRetrieval assistantToolsRetrieval1 = OASAssistantToolsRetrieval.getExample();
        OASAssistantToolsRetrieval assistantToolsRetrieval2 = new OASAssistantToolsRetrieval();
        OASAssistantToolsRetrieval assistantToolsRetrieval3;

        System.assertEquals(false, assistantToolsRetrieval1.equals(assistantToolsRetrieval3));
        System.assertEquals(false, assistantToolsRetrieval2.equals(assistantToolsRetrieval3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantToolsRetrieval assistantToolsRetrieval1 = OASAssistantToolsRetrieval.getExample();
        OASAssistantToolsRetrieval assistantToolsRetrieval2 = new OASAssistantToolsRetrieval();

        System.assertEquals(assistantToolsRetrieval1.hashCode(), assistantToolsRetrieval1.hashCode());
        System.assertEquals(assistantToolsRetrieval2.hashCode(), assistantToolsRetrieval2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantToolsRetrieval assistantToolsRetrieval1 = OASAssistantToolsRetrieval.getExample();
        OASAssistantToolsRetrieval assistantToolsRetrieval2 = OASAssistantToolsRetrieval.getExample();
        OASAssistantToolsRetrieval assistantToolsRetrieval3 = new OASAssistantToolsRetrieval();
        OASAssistantToolsRetrieval assistantToolsRetrieval4 = new OASAssistantToolsRetrieval();

        System.assert(assistantToolsRetrieval1.equals(assistantToolsRetrieval2));
        System.assert(assistantToolsRetrieval3.equals(assistantToolsRetrieval4));
        System.assertEquals(assistantToolsRetrieval1.hashCode(), assistantToolsRetrieval2.hashCode());
        System.assertEquals(assistantToolsRetrieval3.hashCode(), assistantToolsRetrieval4.hashCode());
    }
}
