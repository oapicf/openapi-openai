@isTest
private class OASRealtimeClientEventSessionUpdateTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate1 = OASRealtimeClientEventSessionUpdate.getExample();
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate2 = realtimeClientEventSessionUpdate1;
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate3 = new OASRealtimeClientEventSessionUpdate();
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate4 = realtimeClientEventSessionUpdate3;

        System.assert(realtimeClientEventSessionUpdate1.equals(realtimeClientEventSessionUpdate2));
        System.assert(realtimeClientEventSessionUpdate2.equals(realtimeClientEventSessionUpdate1));
        System.assert(realtimeClientEventSessionUpdate1.equals(realtimeClientEventSessionUpdate1));
        System.assert(realtimeClientEventSessionUpdate3.equals(realtimeClientEventSessionUpdate4));
        System.assert(realtimeClientEventSessionUpdate4.equals(realtimeClientEventSessionUpdate3));
        System.assert(realtimeClientEventSessionUpdate3.equals(realtimeClientEventSessionUpdate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate1 = OASRealtimeClientEventSessionUpdate.getExample();
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate2 = OASRealtimeClientEventSessionUpdate.getExample();
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate3 = new OASRealtimeClientEventSessionUpdate();
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate4 = new OASRealtimeClientEventSessionUpdate();

        System.assert(realtimeClientEventSessionUpdate1.equals(realtimeClientEventSessionUpdate2));
        System.assert(realtimeClientEventSessionUpdate2.equals(realtimeClientEventSessionUpdate1));
        System.assert(realtimeClientEventSessionUpdate3.equals(realtimeClientEventSessionUpdate4));
        System.assert(realtimeClientEventSessionUpdate4.equals(realtimeClientEventSessionUpdate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate1 = OASRealtimeClientEventSessionUpdate.getExample();
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate2 = new OASRealtimeClientEventSessionUpdate();

        System.assertEquals(false, realtimeClientEventSessionUpdate1.equals('foo'));
        System.assertEquals(false, realtimeClientEventSessionUpdate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate1 = OASRealtimeClientEventSessionUpdate.getExample();
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate2 = new OASRealtimeClientEventSessionUpdate();
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate3;

        System.assertEquals(false, realtimeClientEventSessionUpdate1.equals(realtimeClientEventSessionUpdate3));
        System.assertEquals(false, realtimeClientEventSessionUpdate2.equals(realtimeClientEventSessionUpdate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate1 = OASRealtimeClientEventSessionUpdate.getExample();
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate2 = new OASRealtimeClientEventSessionUpdate();

        System.assertEquals(realtimeClientEventSessionUpdate1.hashCode(), realtimeClientEventSessionUpdate1.hashCode());
        System.assertEquals(realtimeClientEventSessionUpdate2.hashCode(), realtimeClientEventSessionUpdate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate1 = OASRealtimeClientEventSessionUpdate.getExample();
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate2 = OASRealtimeClientEventSessionUpdate.getExample();
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate3 = new OASRealtimeClientEventSessionUpdate();
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate4 = new OASRealtimeClientEventSessionUpdate();

        System.assert(realtimeClientEventSessionUpdate1.equals(realtimeClientEventSessionUpdate2));
        System.assert(realtimeClientEventSessionUpdate3.equals(realtimeClientEventSessionUpdate4));
        System.assertEquals(realtimeClientEventSessionUpdate1.hashCode(), realtimeClientEventSessionUpdate2.hashCode());
        System.assertEquals(realtimeClientEventSessionUpdate3.hashCode(), realtimeClientEventSessionUpdate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeClientEventSessionUpdate realtimeClientEventSessionUpdate = new OASRealtimeClientEventSessionUpdate();
        Map<String, String> x-property-mappings = realtimeClientEventSessionUpdate.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
    }
}
