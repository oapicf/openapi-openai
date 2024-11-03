@isTest
private class OASRunStreamEventTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStreamEvent runStreamEvent1 = OASRunStreamEvent.getExample();
        OASRunStreamEvent runStreamEvent2 = runStreamEvent1;
        OASRunStreamEvent runStreamEvent3 = new OASRunStreamEvent();
        OASRunStreamEvent runStreamEvent4 = runStreamEvent3;

        System.assert(runStreamEvent1.equals(runStreamEvent2));
        System.assert(runStreamEvent2.equals(runStreamEvent1));
        System.assert(runStreamEvent1.equals(runStreamEvent1));
        System.assert(runStreamEvent3.equals(runStreamEvent4));
        System.assert(runStreamEvent4.equals(runStreamEvent3));
        System.assert(runStreamEvent3.equals(runStreamEvent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStreamEvent runStreamEvent1 = OASRunStreamEvent.getExample();
        OASRunStreamEvent runStreamEvent2 = OASRunStreamEvent.getExample();
        OASRunStreamEvent runStreamEvent3 = new OASRunStreamEvent();
        OASRunStreamEvent runStreamEvent4 = new OASRunStreamEvent();

        System.assert(runStreamEvent1.equals(runStreamEvent2));
        System.assert(runStreamEvent2.equals(runStreamEvent1));
        System.assert(runStreamEvent3.equals(runStreamEvent4));
        System.assert(runStreamEvent4.equals(runStreamEvent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStreamEvent runStreamEvent1 = OASRunStreamEvent.getExample();
        OASRunStreamEvent runStreamEvent2 = new OASRunStreamEvent();

        System.assertEquals(false, runStreamEvent1.equals('foo'));
        System.assertEquals(false, runStreamEvent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStreamEvent runStreamEvent1 = OASRunStreamEvent.getExample();
        OASRunStreamEvent runStreamEvent2 = new OASRunStreamEvent();
        OASRunStreamEvent runStreamEvent3;

        System.assertEquals(false, runStreamEvent1.equals(runStreamEvent3));
        System.assertEquals(false, runStreamEvent2.equals(runStreamEvent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStreamEvent runStreamEvent1 = OASRunStreamEvent.getExample();
        OASRunStreamEvent runStreamEvent2 = new OASRunStreamEvent();

        System.assertEquals(runStreamEvent1.hashCode(), runStreamEvent1.hashCode());
        System.assertEquals(runStreamEvent2.hashCode(), runStreamEvent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStreamEvent runStreamEvent1 = OASRunStreamEvent.getExample();
        OASRunStreamEvent runStreamEvent2 = OASRunStreamEvent.getExample();
        OASRunStreamEvent runStreamEvent3 = new OASRunStreamEvent();
        OASRunStreamEvent runStreamEvent4 = new OASRunStreamEvent();

        System.assert(runStreamEvent1.equals(runStreamEvent2));
        System.assert(runStreamEvent3.equals(runStreamEvent4));
        System.assertEquals(runStreamEvent1.hashCode(), runStreamEvent2.hashCode());
        System.assertEquals(runStreamEvent3.hashCode(), runStreamEvent4.hashCode());
    }
}
