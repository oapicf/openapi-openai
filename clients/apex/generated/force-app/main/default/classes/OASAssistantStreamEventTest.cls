@isTest
private class OASAssistantStreamEventTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantStreamEvent assistantStreamEvent1 = OASAssistantStreamEvent.getExample();
        OASAssistantStreamEvent assistantStreamEvent2 = assistantStreamEvent1;
        OASAssistantStreamEvent assistantStreamEvent3 = new OASAssistantStreamEvent();
        OASAssistantStreamEvent assistantStreamEvent4 = assistantStreamEvent3;

        System.assert(assistantStreamEvent1.equals(assistantStreamEvent2));
        System.assert(assistantStreamEvent2.equals(assistantStreamEvent1));
        System.assert(assistantStreamEvent1.equals(assistantStreamEvent1));
        System.assert(assistantStreamEvent3.equals(assistantStreamEvent4));
        System.assert(assistantStreamEvent4.equals(assistantStreamEvent3));
        System.assert(assistantStreamEvent3.equals(assistantStreamEvent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantStreamEvent assistantStreamEvent1 = OASAssistantStreamEvent.getExample();
        OASAssistantStreamEvent assistantStreamEvent2 = OASAssistantStreamEvent.getExample();
        OASAssistantStreamEvent assistantStreamEvent3 = new OASAssistantStreamEvent();
        OASAssistantStreamEvent assistantStreamEvent4 = new OASAssistantStreamEvent();

        System.assert(assistantStreamEvent1.equals(assistantStreamEvent2));
        System.assert(assistantStreamEvent2.equals(assistantStreamEvent1));
        System.assert(assistantStreamEvent3.equals(assistantStreamEvent4));
        System.assert(assistantStreamEvent4.equals(assistantStreamEvent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantStreamEvent assistantStreamEvent1 = OASAssistantStreamEvent.getExample();
        OASAssistantStreamEvent assistantStreamEvent2 = new OASAssistantStreamEvent();

        System.assertEquals(false, assistantStreamEvent1.equals('foo'));
        System.assertEquals(false, assistantStreamEvent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantStreamEvent assistantStreamEvent1 = OASAssistantStreamEvent.getExample();
        OASAssistantStreamEvent assistantStreamEvent2 = new OASAssistantStreamEvent();
        OASAssistantStreamEvent assistantStreamEvent3;

        System.assertEquals(false, assistantStreamEvent1.equals(assistantStreamEvent3));
        System.assertEquals(false, assistantStreamEvent2.equals(assistantStreamEvent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantStreamEvent assistantStreamEvent1 = OASAssistantStreamEvent.getExample();
        OASAssistantStreamEvent assistantStreamEvent2 = new OASAssistantStreamEvent();

        System.assertEquals(assistantStreamEvent1.hashCode(), assistantStreamEvent1.hashCode());
        System.assertEquals(assistantStreamEvent2.hashCode(), assistantStreamEvent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantStreamEvent assistantStreamEvent1 = OASAssistantStreamEvent.getExample();
        OASAssistantStreamEvent assistantStreamEvent2 = OASAssistantStreamEvent.getExample();
        OASAssistantStreamEvent assistantStreamEvent3 = new OASAssistantStreamEvent();
        OASAssistantStreamEvent assistantStreamEvent4 = new OASAssistantStreamEvent();

        System.assert(assistantStreamEvent1.equals(assistantStreamEvent2));
        System.assert(assistantStreamEvent3.equals(assistantStreamEvent4));
        System.assertEquals(assistantStreamEvent1.hashCode(), assistantStreamEvent2.hashCode());
        System.assertEquals(assistantStreamEvent3.hashCode(), assistantStreamEvent4.hashCode());
    }
}
