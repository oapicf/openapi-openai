@isTest
private class OASDoneEventTest {
    @isTest
    private static void equalsSameInstance() {
        OASDoneEvent doneEvent1 = OASDoneEvent.getExample();
        OASDoneEvent doneEvent2 = doneEvent1;
        OASDoneEvent doneEvent3 = new OASDoneEvent();
        OASDoneEvent doneEvent4 = doneEvent3;

        System.assert(doneEvent1.equals(doneEvent2));
        System.assert(doneEvent2.equals(doneEvent1));
        System.assert(doneEvent1.equals(doneEvent1));
        System.assert(doneEvent3.equals(doneEvent4));
        System.assert(doneEvent4.equals(doneEvent3));
        System.assert(doneEvent3.equals(doneEvent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDoneEvent doneEvent1 = OASDoneEvent.getExample();
        OASDoneEvent doneEvent2 = OASDoneEvent.getExample();
        OASDoneEvent doneEvent3 = new OASDoneEvent();
        OASDoneEvent doneEvent4 = new OASDoneEvent();

        System.assert(doneEvent1.equals(doneEvent2));
        System.assert(doneEvent2.equals(doneEvent1));
        System.assert(doneEvent3.equals(doneEvent4));
        System.assert(doneEvent4.equals(doneEvent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDoneEvent doneEvent1 = OASDoneEvent.getExample();
        OASDoneEvent doneEvent2 = new OASDoneEvent();

        System.assertEquals(false, doneEvent1.equals('foo'));
        System.assertEquals(false, doneEvent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDoneEvent doneEvent1 = OASDoneEvent.getExample();
        OASDoneEvent doneEvent2 = new OASDoneEvent();
        OASDoneEvent doneEvent3;

        System.assertEquals(false, doneEvent1.equals(doneEvent3));
        System.assertEquals(false, doneEvent2.equals(doneEvent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDoneEvent doneEvent1 = OASDoneEvent.getExample();
        OASDoneEvent doneEvent2 = new OASDoneEvent();

        System.assertEquals(doneEvent1.hashCode(), doneEvent1.hashCode());
        System.assertEquals(doneEvent2.hashCode(), doneEvent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDoneEvent doneEvent1 = OASDoneEvent.getExample();
        OASDoneEvent doneEvent2 = OASDoneEvent.getExample();
        OASDoneEvent doneEvent3 = new OASDoneEvent();
        OASDoneEvent doneEvent4 = new OASDoneEvent();

        System.assert(doneEvent1.equals(doneEvent2));
        System.assert(doneEvent3.equals(doneEvent4));
        System.assertEquals(doneEvent1.hashCode(), doneEvent2.hashCode());
        System.assertEquals(doneEvent3.hashCode(), doneEvent4.hashCode());
    }
}
