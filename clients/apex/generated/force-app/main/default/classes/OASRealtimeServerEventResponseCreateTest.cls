@isTest
private class OASRealtimeServerEventResponseCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated1 = OASRealtimeServerEventResponseCreate.getExample();
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated2 = realtimeServerEventResponseCreated1;
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated3 = new OASRealtimeServerEventResponseCreate();
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated4 = realtimeServerEventResponseCreated3;

        System.assert(realtimeServerEventResponseCreated1.equals(realtimeServerEventResponseCreated2));
        System.assert(realtimeServerEventResponseCreated2.equals(realtimeServerEventResponseCreated1));
        System.assert(realtimeServerEventResponseCreated1.equals(realtimeServerEventResponseCreated1));
        System.assert(realtimeServerEventResponseCreated3.equals(realtimeServerEventResponseCreated4));
        System.assert(realtimeServerEventResponseCreated4.equals(realtimeServerEventResponseCreated3));
        System.assert(realtimeServerEventResponseCreated3.equals(realtimeServerEventResponseCreated3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated1 = OASRealtimeServerEventResponseCreate.getExample();
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated2 = OASRealtimeServerEventResponseCreate.getExample();
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated3 = new OASRealtimeServerEventResponseCreate();
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated4 = new OASRealtimeServerEventResponseCreate();

        System.assert(realtimeServerEventResponseCreated1.equals(realtimeServerEventResponseCreated2));
        System.assert(realtimeServerEventResponseCreated2.equals(realtimeServerEventResponseCreated1));
        System.assert(realtimeServerEventResponseCreated3.equals(realtimeServerEventResponseCreated4));
        System.assert(realtimeServerEventResponseCreated4.equals(realtimeServerEventResponseCreated3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated1 = OASRealtimeServerEventResponseCreate.getExample();
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated2 = new OASRealtimeServerEventResponseCreate();

        System.assertEquals(false, realtimeServerEventResponseCreated1.equals('foo'));
        System.assertEquals(false, realtimeServerEventResponseCreated2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated1 = OASRealtimeServerEventResponseCreate.getExample();
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated2 = new OASRealtimeServerEventResponseCreate();
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated3;

        System.assertEquals(false, realtimeServerEventResponseCreated1.equals(realtimeServerEventResponseCreated3));
        System.assertEquals(false, realtimeServerEventResponseCreated2.equals(realtimeServerEventResponseCreated3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated1 = OASRealtimeServerEventResponseCreate.getExample();
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated2 = new OASRealtimeServerEventResponseCreate();

        System.assertEquals(realtimeServerEventResponseCreated1.hashCode(), realtimeServerEventResponseCreated1.hashCode());
        System.assertEquals(realtimeServerEventResponseCreated2.hashCode(), realtimeServerEventResponseCreated2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated1 = OASRealtimeServerEventResponseCreate.getExample();
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated2 = OASRealtimeServerEventResponseCreate.getExample();
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated3 = new OASRealtimeServerEventResponseCreate();
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated4 = new OASRealtimeServerEventResponseCreate();

        System.assert(realtimeServerEventResponseCreated1.equals(realtimeServerEventResponseCreated2));
        System.assert(realtimeServerEventResponseCreated3.equals(realtimeServerEventResponseCreated4));
        System.assertEquals(realtimeServerEventResponseCreated1.hashCode(), realtimeServerEventResponseCreated2.hashCode());
        System.assertEquals(realtimeServerEventResponseCreated3.hashCode(), realtimeServerEventResponseCreated4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeServerEventResponseCreate realtimeServerEventResponseCreated = new OASRealtimeServerEventResponseCreate();
        Map<String, String> x-property-mappings = realtimeServerEventResponseCreated.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
    }
}
