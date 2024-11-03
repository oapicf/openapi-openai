@isTest
private class OASThreadStreamEventTest {
    @isTest
    private static void equalsSameInstance() {
        OASThreadStreamEvent threadStreamEvent1 = OASThreadStreamEvent.getExample();
        OASThreadStreamEvent threadStreamEvent2 = threadStreamEvent1;
        OASThreadStreamEvent threadStreamEvent3 = new OASThreadStreamEvent();
        OASThreadStreamEvent threadStreamEvent4 = threadStreamEvent3;

        System.assert(threadStreamEvent1.equals(threadStreamEvent2));
        System.assert(threadStreamEvent2.equals(threadStreamEvent1));
        System.assert(threadStreamEvent1.equals(threadStreamEvent1));
        System.assert(threadStreamEvent3.equals(threadStreamEvent4));
        System.assert(threadStreamEvent4.equals(threadStreamEvent3));
        System.assert(threadStreamEvent3.equals(threadStreamEvent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASThreadStreamEvent threadStreamEvent1 = OASThreadStreamEvent.getExample();
        OASThreadStreamEvent threadStreamEvent2 = OASThreadStreamEvent.getExample();
        OASThreadStreamEvent threadStreamEvent3 = new OASThreadStreamEvent();
        OASThreadStreamEvent threadStreamEvent4 = new OASThreadStreamEvent();

        System.assert(threadStreamEvent1.equals(threadStreamEvent2));
        System.assert(threadStreamEvent2.equals(threadStreamEvent1));
        System.assert(threadStreamEvent3.equals(threadStreamEvent4));
        System.assert(threadStreamEvent4.equals(threadStreamEvent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASThreadStreamEvent threadStreamEvent1 = OASThreadStreamEvent.getExample();
        OASThreadStreamEvent threadStreamEvent2 = new OASThreadStreamEvent();

        System.assertEquals(false, threadStreamEvent1.equals('foo'));
        System.assertEquals(false, threadStreamEvent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASThreadStreamEvent threadStreamEvent1 = OASThreadStreamEvent.getExample();
        OASThreadStreamEvent threadStreamEvent2 = new OASThreadStreamEvent();
        OASThreadStreamEvent threadStreamEvent3;

        System.assertEquals(false, threadStreamEvent1.equals(threadStreamEvent3));
        System.assertEquals(false, threadStreamEvent2.equals(threadStreamEvent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASThreadStreamEvent threadStreamEvent1 = OASThreadStreamEvent.getExample();
        OASThreadStreamEvent threadStreamEvent2 = new OASThreadStreamEvent();

        System.assertEquals(threadStreamEvent1.hashCode(), threadStreamEvent1.hashCode());
        System.assertEquals(threadStreamEvent2.hashCode(), threadStreamEvent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASThreadStreamEvent threadStreamEvent1 = OASThreadStreamEvent.getExample();
        OASThreadStreamEvent threadStreamEvent2 = OASThreadStreamEvent.getExample();
        OASThreadStreamEvent threadStreamEvent3 = new OASThreadStreamEvent();
        OASThreadStreamEvent threadStreamEvent4 = new OASThreadStreamEvent();

        System.assert(threadStreamEvent1.equals(threadStreamEvent2));
        System.assert(threadStreamEvent3.equals(threadStreamEvent4));
        System.assertEquals(threadStreamEvent1.hashCode(), threadStreamEvent2.hashCode());
        System.assertEquals(threadStreamEvent3.hashCode(), threadStreamEvent4.hashCode());
    }
}
