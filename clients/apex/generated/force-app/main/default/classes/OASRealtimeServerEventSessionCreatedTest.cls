@isTest
private class OASRealtimeServerEventSessionCreatedTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated1 = OASRealtimeServerEventSessionCreated.getExample();
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated2 = realtimeServerEventSessionCreated1;
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated3 = new OASRealtimeServerEventSessionCreated();
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated4 = realtimeServerEventSessionCreated3;

        System.assert(realtimeServerEventSessionCreated1.equals(realtimeServerEventSessionCreated2));
        System.assert(realtimeServerEventSessionCreated2.equals(realtimeServerEventSessionCreated1));
        System.assert(realtimeServerEventSessionCreated1.equals(realtimeServerEventSessionCreated1));
        System.assert(realtimeServerEventSessionCreated3.equals(realtimeServerEventSessionCreated4));
        System.assert(realtimeServerEventSessionCreated4.equals(realtimeServerEventSessionCreated3));
        System.assert(realtimeServerEventSessionCreated3.equals(realtimeServerEventSessionCreated3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated1 = OASRealtimeServerEventSessionCreated.getExample();
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated2 = OASRealtimeServerEventSessionCreated.getExample();
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated3 = new OASRealtimeServerEventSessionCreated();
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated4 = new OASRealtimeServerEventSessionCreated();

        System.assert(realtimeServerEventSessionCreated1.equals(realtimeServerEventSessionCreated2));
        System.assert(realtimeServerEventSessionCreated2.equals(realtimeServerEventSessionCreated1));
        System.assert(realtimeServerEventSessionCreated3.equals(realtimeServerEventSessionCreated4));
        System.assert(realtimeServerEventSessionCreated4.equals(realtimeServerEventSessionCreated3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated1 = OASRealtimeServerEventSessionCreated.getExample();
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated2 = new OASRealtimeServerEventSessionCreated();

        System.assertEquals(false, realtimeServerEventSessionCreated1.equals('foo'));
        System.assertEquals(false, realtimeServerEventSessionCreated2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated1 = OASRealtimeServerEventSessionCreated.getExample();
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated2 = new OASRealtimeServerEventSessionCreated();
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated3;

        System.assertEquals(false, realtimeServerEventSessionCreated1.equals(realtimeServerEventSessionCreated3));
        System.assertEquals(false, realtimeServerEventSessionCreated2.equals(realtimeServerEventSessionCreated3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated1 = OASRealtimeServerEventSessionCreated.getExample();
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated2 = new OASRealtimeServerEventSessionCreated();

        System.assertEquals(realtimeServerEventSessionCreated1.hashCode(), realtimeServerEventSessionCreated1.hashCode());
        System.assertEquals(realtimeServerEventSessionCreated2.hashCode(), realtimeServerEventSessionCreated2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated1 = OASRealtimeServerEventSessionCreated.getExample();
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated2 = OASRealtimeServerEventSessionCreated.getExample();
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated3 = new OASRealtimeServerEventSessionCreated();
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated4 = new OASRealtimeServerEventSessionCreated();

        System.assert(realtimeServerEventSessionCreated1.equals(realtimeServerEventSessionCreated2));
        System.assert(realtimeServerEventSessionCreated3.equals(realtimeServerEventSessionCreated4));
        System.assertEquals(realtimeServerEventSessionCreated1.hashCode(), realtimeServerEventSessionCreated2.hashCode());
        System.assertEquals(realtimeServerEventSessionCreated3.hashCode(), realtimeServerEventSessionCreated4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeServerEventSessionCreated realtimeServerEventSessionCreated = new OASRealtimeServerEventSessionCreated();
        Map<String, String> x-property-mappings = realtimeServerEventSessionCreated.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
    }
}
