@isTest
private class OASRealtimeServerEventSessionUpdatedTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated1 = OASRealtimeServerEventSessionUpdated.getExample();
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated2 = realtimeServerEventSessionUpdated1;
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated3 = new OASRealtimeServerEventSessionUpdated();
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated4 = realtimeServerEventSessionUpdated3;

        System.assert(realtimeServerEventSessionUpdated1.equals(realtimeServerEventSessionUpdated2));
        System.assert(realtimeServerEventSessionUpdated2.equals(realtimeServerEventSessionUpdated1));
        System.assert(realtimeServerEventSessionUpdated1.equals(realtimeServerEventSessionUpdated1));
        System.assert(realtimeServerEventSessionUpdated3.equals(realtimeServerEventSessionUpdated4));
        System.assert(realtimeServerEventSessionUpdated4.equals(realtimeServerEventSessionUpdated3));
        System.assert(realtimeServerEventSessionUpdated3.equals(realtimeServerEventSessionUpdated3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated1 = OASRealtimeServerEventSessionUpdated.getExample();
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated2 = OASRealtimeServerEventSessionUpdated.getExample();
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated3 = new OASRealtimeServerEventSessionUpdated();
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated4 = new OASRealtimeServerEventSessionUpdated();

        System.assert(realtimeServerEventSessionUpdated1.equals(realtimeServerEventSessionUpdated2));
        System.assert(realtimeServerEventSessionUpdated2.equals(realtimeServerEventSessionUpdated1));
        System.assert(realtimeServerEventSessionUpdated3.equals(realtimeServerEventSessionUpdated4));
        System.assert(realtimeServerEventSessionUpdated4.equals(realtimeServerEventSessionUpdated3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated1 = OASRealtimeServerEventSessionUpdated.getExample();
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated2 = new OASRealtimeServerEventSessionUpdated();

        System.assertEquals(false, realtimeServerEventSessionUpdated1.equals('foo'));
        System.assertEquals(false, realtimeServerEventSessionUpdated2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated1 = OASRealtimeServerEventSessionUpdated.getExample();
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated2 = new OASRealtimeServerEventSessionUpdated();
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated3;

        System.assertEquals(false, realtimeServerEventSessionUpdated1.equals(realtimeServerEventSessionUpdated3));
        System.assertEquals(false, realtimeServerEventSessionUpdated2.equals(realtimeServerEventSessionUpdated3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated1 = OASRealtimeServerEventSessionUpdated.getExample();
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated2 = new OASRealtimeServerEventSessionUpdated();

        System.assertEquals(realtimeServerEventSessionUpdated1.hashCode(), realtimeServerEventSessionUpdated1.hashCode());
        System.assertEquals(realtimeServerEventSessionUpdated2.hashCode(), realtimeServerEventSessionUpdated2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated1 = OASRealtimeServerEventSessionUpdated.getExample();
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated2 = OASRealtimeServerEventSessionUpdated.getExample();
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated3 = new OASRealtimeServerEventSessionUpdated();
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated4 = new OASRealtimeServerEventSessionUpdated();

        System.assert(realtimeServerEventSessionUpdated1.equals(realtimeServerEventSessionUpdated2));
        System.assert(realtimeServerEventSessionUpdated3.equals(realtimeServerEventSessionUpdated4));
        System.assertEquals(realtimeServerEventSessionUpdated1.hashCode(), realtimeServerEventSessionUpdated2.hashCode());
        System.assertEquals(realtimeServerEventSessionUpdated3.hashCode(), realtimeServerEventSessionUpdated4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeServerEventSessionUpdated realtimeServerEventSessionUpdated = new OASRealtimeServerEventSessionUpdated();
        Map<String, String> x-property-mappings = realtimeServerEventSessionUpdated.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
    }
}
