@isTest
private class OASRunStepStreamEventTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepStreamEvent runStepStreamEvent1 = OASRunStepStreamEvent.getExample();
        OASRunStepStreamEvent runStepStreamEvent2 = runStepStreamEvent1;
        OASRunStepStreamEvent runStepStreamEvent3 = new OASRunStepStreamEvent();
        OASRunStepStreamEvent runStepStreamEvent4 = runStepStreamEvent3;

        System.assert(runStepStreamEvent1.equals(runStepStreamEvent2));
        System.assert(runStepStreamEvent2.equals(runStepStreamEvent1));
        System.assert(runStepStreamEvent1.equals(runStepStreamEvent1));
        System.assert(runStepStreamEvent3.equals(runStepStreamEvent4));
        System.assert(runStepStreamEvent4.equals(runStepStreamEvent3));
        System.assert(runStepStreamEvent3.equals(runStepStreamEvent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepStreamEvent runStepStreamEvent1 = OASRunStepStreamEvent.getExample();
        OASRunStepStreamEvent runStepStreamEvent2 = OASRunStepStreamEvent.getExample();
        OASRunStepStreamEvent runStepStreamEvent3 = new OASRunStepStreamEvent();
        OASRunStepStreamEvent runStepStreamEvent4 = new OASRunStepStreamEvent();

        System.assert(runStepStreamEvent1.equals(runStepStreamEvent2));
        System.assert(runStepStreamEvent2.equals(runStepStreamEvent1));
        System.assert(runStepStreamEvent3.equals(runStepStreamEvent4));
        System.assert(runStepStreamEvent4.equals(runStepStreamEvent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepStreamEvent runStepStreamEvent1 = OASRunStepStreamEvent.getExample();
        OASRunStepStreamEvent runStepStreamEvent2 = new OASRunStepStreamEvent();

        System.assertEquals(false, runStepStreamEvent1.equals('foo'));
        System.assertEquals(false, runStepStreamEvent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepStreamEvent runStepStreamEvent1 = OASRunStepStreamEvent.getExample();
        OASRunStepStreamEvent runStepStreamEvent2 = new OASRunStepStreamEvent();
        OASRunStepStreamEvent runStepStreamEvent3;

        System.assertEquals(false, runStepStreamEvent1.equals(runStepStreamEvent3));
        System.assertEquals(false, runStepStreamEvent2.equals(runStepStreamEvent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepStreamEvent runStepStreamEvent1 = OASRunStepStreamEvent.getExample();
        OASRunStepStreamEvent runStepStreamEvent2 = new OASRunStepStreamEvent();

        System.assertEquals(runStepStreamEvent1.hashCode(), runStepStreamEvent1.hashCode());
        System.assertEquals(runStepStreamEvent2.hashCode(), runStepStreamEvent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepStreamEvent runStepStreamEvent1 = OASRunStepStreamEvent.getExample();
        OASRunStepStreamEvent runStepStreamEvent2 = OASRunStepStreamEvent.getExample();
        OASRunStepStreamEvent runStepStreamEvent3 = new OASRunStepStreamEvent();
        OASRunStepStreamEvent runStepStreamEvent4 = new OASRunStepStreamEvent();

        System.assert(runStepStreamEvent1.equals(runStepStreamEvent2));
        System.assert(runStepStreamEvent3.equals(runStepStreamEvent4));
        System.assertEquals(runStepStreamEvent1.hashCode(), runStepStreamEvent2.hashCode());
        System.assertEquals(runStepStreamEvent3.hashCode(), runStepStreamEvent4.hashCode());
    }
}
