@isTest
private class OASRealtimeClientEventResponseCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate1 = OASRealtimeClientEventResponseCreate.getExample();
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate2 = realtimeClientEventResponseCreate1;
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate3 = new OASRealtimeClientEventResponseCreate();
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate4 = realtimeClientEventResponseCreate3;

        System.assert(realtimeClientEventResponseCreate1.equals(realtimeClientEventResponseCreate2));
        System.assert(realtimeClientEventResponseCreate2.equals(realtimeClientEventResponseCreate1));
        System.assert(realtimeClientEventResponseCreate1.equals(realtimeClientEventResponseCreate1));
        System.assert(realtimeClientEventResponseCreate3.equals(realtimeClientEventResponseCreate4));
        System.assert(realtimeClientEventResponseCreate4.equals(realtimeClientEventResponseCreate3));
        System.assert(realtimeClientEventResponseCreate3.equals(realtimeClientEventResponseCreate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate1 = OASRealtimeClientEventResponseCreate.getExample();
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate2 = OASRealtimeClientEventResponseCreate.getExample();
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate3 = new OASRealtimeClientEventResponseCreate();
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate4 = new OASRealtimeClientEventResponseCreate();

        System.assert(realtimeClientEventResponseCreate1.equals(realtimeClientEventResponseCreate2));
        System.assert(realtimeClientEventResponseCreate2.equals(realtimeClientEventResponseCreate1));
        System.assert(realtimeClientEventResponseCreate3.equals(realtimeClientEventResponseCreate4));
        System.assert(realtimeClientEventResponseCreate4.equals(realtimeClientEventResponseCreate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate1 = OASRealtimeClientEventResponseCreate.getExample();
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate2 = new OASRealtimeClientEventResponseCreate();

        System.assertEquals(false, realtimeClientEventResponseCreate1.equals('foo'));
        System.assertEquals(false, realtimeClientEventResponseCreate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate1 = OASRealtimeClientEventResponseCreate.getExample();
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate2 = new OASRealtimeClientEventResponseCreate();
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate3;

        System.assertEquals(false, realtimeClientEventResponseCreate1.equals(realtimeClientEventResponseCreate3));
        System.assertEquals(false, realtimeClientEventResponseCreate2.equals(realtimeClientEventResponseCreate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate1 = OASRealtimeClientEventResponseCreate.getExample();
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate2 = new OASRealtimeClientEventResponseCreate();

        System.assertEquals(realtimeClientEventResponseCreate1.hashCode(), realtimeClientEventResponseCreate1.hashCode());
        System.assertEquals(realtimeClientEventResponseCreate2.hashCode(), realtimeClientEventResponseCreate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate1 = OASRealtimeClientEventResponseCreate.getExample();
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate2 = OASRealtimeClientEventResponseCreate.getExample();
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate3 = new OASRealtimeClientEventResponseCreate();
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate4 = new OASRealtimeClientEventResponseCreate();

        System.assert(realtimeClientEventResponseCreate1.equals(realtimeClientEventResponseCreate2));
        System.assert(realtimeClientEventResponseCreate3.equals(realtimeClientEventResponseCreate4));
        System.assertEquals(realtimeClientEventResponseCreate1.hashCode(), realtimeClientEventResponseCreate2.hashCode());
        System.assertEquals(realtimeClientEventResponseCreate3.hashCode(), realtimeClientEventResponseCreate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeClientEventResponseCreate realtimeClientEventResponseCreate = new OASRealtimeClientEventResponseCreate();
        Map<String, String> x-property-mappings = realtimeClientEventResponseCreate.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
    }
}
