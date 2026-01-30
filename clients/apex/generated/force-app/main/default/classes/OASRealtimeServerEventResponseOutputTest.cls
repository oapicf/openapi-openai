@isTest
private class OASRealtimeServerEventResponseOutputTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone1 = OASRealtimeServerEventResponseOutput.getExample();
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone2 = realtimeServerEventResponseOutputItemDone1;
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone3 = new OASRealtimeServerEventResponseOutput();
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone4 = realtimeServerEventResponseOutputItemDone3;

        System.assert(realtimeServerEventResponseOutputItemDone1.equals(realtimeServerEventResponseOutputItemDone2));
        System.assert(realtimeServerEventResponseOutputItemDone2.equals(realtimeServerEventResponseOutputItemDone1));
        System.assert(realtimeServerEventResponseOutputItemDone1.equals(realtimeServerEventResponseOutputItemDone1));
        System.assert(realtimeServerEventResponseOutputItemDone3.equals(realtimeServerEventResponseOutputItemDone4));
        System.assert(realtimeServerEventResponseOutputItemDone4.equals(realtimeServerEventResponseOutputItemDone3));
        System.assert(realtimeServerEventResponseOutputItemDone3.equals(realtimeServerEventResponseOutputItemDone3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone1 = OASRealtimeServerEventResponseOutput.getExample();
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone2 = OASRealtimeServerEventResponseOutput.getExample();
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone3 = new OASRealtimeServerEventResponseOutput();
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone4 = new OASRealtimeServerEventResponseOutput();

        System.assert(realtimeServerEventResponseOutputItemDone1.equals(realtimeServerEventResponseOutputItemDone2));
        System.assert(realtimeServerEventResponseOutputItemDone2.equals(realtimeServerEventResponseOutputItemDone1));
        System.assert(realtimeServerEventResponseOutputItemDone3.equals(realtimeServerEventResponseOutputItemDone4));
        System.assert(realtimeServerEventResponseOutputItemDone4.equals(realtimeServerEventResponseOutputItemDone3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone1 = OASRealtimeServerEventResponseOutput.getExample();
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone2 = new OASRealtimeServerEventResponseOutput();

        System.assertEquals(false, realtimeServerEventResponseOutputItemDone1.equals('foo'));
        System.assertEquals(false, realtimeServerEventResponseOutputItemDone2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone1 = OASRealtimeServerEventResponseOutput.getExample();
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone2 = new OASRealtimeServerEventResponseOutput();
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone3;

        System.assertEquals(false, realtimeServerEventResponseOutputItemDone1.equals(realtimeServerEventResponseOutputItemDone3));
        System.assertEquals(false, realtimeServerEventResponseOutputItemDone2.equals(realtimeServerEventResponseOutputItemDone3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone1 = OASRealtimeServerEventResponseOutput.getExample();
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone2 = new OASRealtimeServerEventResponseOutput();

        System.assertEquals(realtimeServerEventResponseOutputItemDone1.hashCode(), realtimeServerEventResponseOutputItemDone1.hashCode());
        System.assertEquals(realtimeServerEventResponseOutputItemDone2.hashCode(), realtimeServerEventResponseOutputItemDone2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone1 = OASRealtimeServerEventResponseOutput.getExample();
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone2 = OASRealtimeServerEventResponseOutput.getExample();
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone3 = new OASRealtimeServerEventResponseOutput();
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone4 = new OASRealtimeServerEventResponseOutput();

        System.assert(realtimeServerEventResponseOutputItemDone1.equals(realtimeServerEventResponseOutputItemDone2));
        System.assert(realtimeServerEventResponseOutputItemDone3.equals(realtimeServerEventResponseOutputItemDone4));
        System.assertEquals(realtimeServerEventResponseOutputItemDone1.hashCode(), realtimeServerEventResponseOutputItemDone2.hashCode());
        System.assertEquals(realtimeServerEventResponseOutputItemDone3.hashCode(), realtimeServerEventResponseOutputItemDone4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeServerEventResponseOutput realtimeServerEventResponseOutputItemDone = new OASRealtimeServerEventResponseOutput();
        Map<String, String> x-property-mappings = realtimeServerEventResponseOutputItemDone.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
        System.assertEquals('responseId', x-property-mappings.get('response_id'));
        System.assertEquals('outputIndex', x-property-mappings.get('output_index'));
    }
}
