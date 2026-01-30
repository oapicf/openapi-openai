@isTest
private class OASRealtimeClientEventResponseCancelTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel1 = OASRealtimeClientEventResponseCancel.getExample();
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel2 = realtimeClientEventResponseCancel1;
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel3 = new OASRealtimeClientEventResponseCancel();
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel4 = realtimeClientEventResponseCancel3;

        System.assert(realtimeClientEventResponseCancel1.equals(realtimeClientEventResponseCancel2));
        System.assert(realtimeClientEventResponseCancel2.equals(realtimeClientEventResponseCancel1));
        System.assert(realtimeClientEventResponseCancel1.equals(realtimeClientEventResponseCancel1));
        System.assert(realtimeClientEventResponseCancel3.equals(realtimeClientEventResponseCancel4));
        System.assert(realtimeClientEventResponseCancel4.equals(realtimeClientEventResponseCancel3));
        System.assert(realtimeClientEventResponseCancel3.equals(realtimeClientEventResponseCancel3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel1 = OASRealtimeClientEventResponseCancel.getExample();
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel2 = OASRealtimeClientEventResponseCancel.getExample();
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel3 = new OASRealtimeClientEventResponseCancel();
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel4 = new OASRealtimeClientEventResponseCancel();

        System.assert(realtimeClientEventResponseCancel1.equals(realtimeClientEventResponseCancel2));
        System.assert(realtimeClientEventResponseCancel2.equals(realtimeClientEventResponseCancel1));
        System.assert(realtimeClientEventResponseCancel3.equals(realtimeClientEventResponseCancel4));
        System.assert(realtimeClientEventResponseCancel4.equals(realtimeClientEventResponseCancel3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel1 = OASRealtimeClientEventResponseCancel.getExample();
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel2 = new OASRealtimeClientEventResponseCancel();

        System.assertEquals(false, realtimeClientEventResponseCancel1.equals('foo'));
        System.assertEquals(false, realtimeClientEventResponseCancel2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel1 = OASRealtimeClientEventResponseCancel.getExample();
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel2 = new OASRealtimeClientEventResponseCancel();
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel3;

        System.assertEquals(false, realtimeClientEventResponseCancel1.equals(realtimeClientEventResponseCancel3));
        System.assertEquals(false, realtimeClientEventResponseCancel2.equals(realtimeClientEventResponseCancel3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel1 = OASRealtimeClientEventResponseCancel.getExample();
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel2 = new OASRealtimeClientEventResponseCancel();

        System.assertEquals(realtimeClientEventResponseCancel1.hashCode(), realtimeClientEventResponseCancel1.hashCode());
        System.assertEquals(realtimeClientEventResponseCancel2.hashCode(), realtimeClientEventResponseCancel2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel1 = OASRealtimeClientEventResponseCancel.getExample();
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel2 = OASRealtimeClientEventResponseCancel.getExample();
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel3 = new OASRealtimeClientEventResponseCancel();
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel4 = new OASRealtimeClientEventResponseCancel();

        System.assert(realtimeClientEventResponseCancel1.equals(realtimeClientEventResponseCancel2));
        System.assert(realtimeClientEventResponseCancel3.equals(realtimeClientEventResponseCancel4));
        System.assertEquals(realtimeClientEventResponseCancel1.hashCode(), realtimeClientEventResponseCancel2.hashCode());
        System.assertEquals(realtimeClientEventResponseCancel3.hashCode(), realtimeClientEventResponseCancel4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeClientEventResponseCancel realtimeClientEventResponseCancel = new OASRealtimeClientEventResponseCancel();
        Map<String, String> x-property-mappings = realtimeClientEventResponseCancel.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
        System.assertEquals('responseId', x-property-mappings.get('response_id'));
    }
}
