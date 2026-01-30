@isTest
private class OASRealtimeServerEventResponseDoneTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone1 = OASRealtimeServerEventResponseDone.getExample();
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone2 = realtimeServerEventResponseDone1;
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone3 = new OASRealtimeServerEventResponseDone();
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone4 = realtimeServerEventResponseDone3;

        System.assert(realtimeServerEventResponseDone1.equals(realtimeServerEventResponseDone2));
        System.assert(realtimeServerEventResponseDone2.equals(realtimeServerEventResponseDone1));
        System.assert(realtimeServerEventResponseDone1.equals(realtimeServerEventResponseDone1));
        System.assert(realtimeServerEventResponseDone3.equals(realtimeServerEventResponseDone4));
        System.assert(realtimeServerEventResponseDone4.equals(realtimeServerEventResponseDone3));
        System.assert(realtimeServerEventResponseDone3.equals(realtimeServerEventResponseDone3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone1 = OASRealtimeServerEventResponseDone.getExample();
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone2 = OASRealtimeServerEventResponseDone.getExample();
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone3 = new OASRealtimeServerEventResponseDone();
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone4 = new OASRealtimeServerEventResponseDone();

        System.assert(realtimeServerEventResponseDone1.equals(realtimeServerEventResponseDone2));
        System.assert(realtimeServerEventResponseDone2.equals(realtimeServerEventResponseDone1));
        System.assert(realtimeServerEventResponseDone3.equals(realtimeServerEventResponseDone4));
        System.assert(realtimeServerEventResponseDone4.equals(realtimeServerEventResponseDone3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone1 = OASRealtimeServerEventResponseDone.getExample();
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone2 = new OASRealtimeServerEventResponseDone();

        System.assertEquals(false, realtimeServerEventResponseDone1.equals('foo'));
        System.assertEquals(false, realtimeServerEventResponseDone2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone1 = OASRealtimeServerEventResponseDone.getExample();
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone2 = new OASRealtimeServerEventResponseDone();
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone3;

        System.assertEquals(false, realtimeServerEventResponseDone1.equals(realtimeServerEventResponseDone3));
        System.assertEquals(false, realtimeServerEventResponseDone2.equals(realtimeServerEventResponseDone3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone1 = OASRealtimeServerEventResponseDone.getExample();
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone2 = new OASRealtimeServerEventResponseDone();

        System.assertEquals(realtimeServerEventResponseDone1.hashCode(), realtimeServerEventResponseDone1.hashCode());
        System.assertEquals(realtimeServerEventResponseDone2.hashCode(), realtimeServerEventResponseDone2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone1 = OASRealtimeServerEventResponseDone.getExample();
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone2 = OASRealtimeServerEventResponseDone.getExample();
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone3 = new OASRealtimeServerEventResponseDone();
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone4 = new OASRealtimeServerEventResponseDone();

        System.assert(realtimeServerEventResponseDone1.equals(realtimeServerEventResponseDone2));
        System.assert(realtimeServerEventResponseDone3.equals(realtimeServerEventResponseDone4));
        System.assertEquals(realtimeServerEventResponseDone1.hashCode(), realtimeServerEventResponseDone2.hashCode());
        System.assertEquals(realtimeServerEventResponseDone3.hashCode(), realtimeServerEventResponseDone4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeServerEventResponseDone realtimeServerEventResponseDone = new OASRealtimeServerEventResponseDone();
        Map<String, String> x-property-mappings = realtimeServerEventResponseDone.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
    }
}
