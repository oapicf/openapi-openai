@isTest
private class OASMessageStreamEventTest {
    @isTest
    private static void equalsSameInstance() {
        OASMessageStreamEvent messageStreamEvent1 = OASMessageStreamEvent.getExample();
        OASMessageStreamEvent messageStreamEvent2 = messageStreamEvent1;
        OASMessageStreamEvent messageStreamEvent3 = new OASMessageStreamEvent();
        OASMessageStreamEvent messageStreamEvent4 = messageStreamEvent3;

        System.assert(messageStreamEvent1.equals(messageStreamEvent2));
        System.assert(messageStreamEvent2.equals(messageStreamEvent1));
        System.assert(messageStreamEvent1.equals(messageStreamEvent1));
        System.assert(messageStreamEvent3.equals(messageStreamEvent4));
        System.assert(messageStreamEvent4.equals(messageStreamEvent3));
        System.assert(messageStreamEvent3.equals(messageStreamEvent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMessageStreamEvent messageStreamEvent1 = OASMessageStreamEvent.getExample();
        OASMessageStreamEvent messageStreamEvent2 = OASMessageStreamEvent.getExample();
        OASMessageStreamEvent messageStreamEvent3 = new OASMessageStreamEvent();
        OASMessageStreamEvent messageStreamEvent4 = new OASMessageStreamEvent();

        System.assert(messageStreamEvent1.equals(messageStreamEvent2));
        System.assert(messageStreamEvent2.equals(messageStreamEvent1));
        System.assert(messageStreamEvent3.equals(messageStreamEvent4));
        System.assert(messageStreamEvent4.equals(messageStreamEvent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMessageStreamEvent messageStreamEvent1 = OASMessageStreamEvent.getExample();
        OASMessageStreamEvent messageStreamEvent2 = new OASMessageStreamEvent();

        System.assertEquals(false, messageStreamEvent1.equals('foo'));
        System.assertEquals(false, messageStreamEvent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMessageStreamEvent messageStreamEvent1 = OASMessageStreamEvent.getExample();
        OASMessageStreamEvent messageStreamEvent2 = new OASMessageStreamEvent();
        OASMessageStreamEvent messageStreamEvent3;

        System.assertEquals(false, messageStreamEvent1.equals(messageStreamEvent3));
        System.assertEquals(false, messageStreamEvent2.equals(messageStreamEvent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMessageStreamEvent messageStreamEvent1 = OASMessageStreamEvent.getExample();
        OASMessageStreamEvent messageStreamEvent2 = new OASMessageStreamEvent();

        System.assertEquals(messageStreamEvent1.hashCode(), messageStreamEvent1.hashCode());
        System.assertEquals(messageStreamEvent2.hashCode(), messageStreamEvent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMessageStreamEvent messageStreamEvent1 = OASMessageStreamEvent.getExample();
        OASMessageStreamEvent messageStreamEvent2 = OASMessageStreamEvent.getExample();
        OASMessageStreamEvent messageStreamEvent3 = new OASMessageStreamEvent();
        OASMessageStreamEvent messageStreamEvent4 = new OASMessageStreamEvent();

        System.assert(messageStreamEvent1.equals(messageStreamEvent2));
        System.assert(messageStreamEvent3.equals(messageStreamEvent4));
        System.assertEquals(messageStreamEvent1.hashCode(), messageStreamEvent2.hashCode());
        System.assertEquals(messageStreamEvent3.hashCode(), messageStreamEvent4.hashCode());
    }
}
