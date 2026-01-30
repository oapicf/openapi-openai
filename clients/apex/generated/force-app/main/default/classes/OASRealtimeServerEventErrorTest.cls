@isTest
private class OASRealtimeServerEventErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventError realtimeServerEventError1 = OASRealtimeServerEventError.getExample();
        OASRealtimeServerEventError realtimeServerEventError2 = realtimeServerEventError1;
        OASRealtimeServerEventError realtimeServerEventError3 = new OASRealtimeServerEventError();
        OASRealtimeServerEventError realtimeServerEventError4 = realtimeServerEventError3;

        System.assert(realtimeServerEventError1.equals(realtimeServerEventError2));
        System.assert(realtimeServerEventError2.equals(realtimeServerEventError1));
        System.assert(realtimeServerEventError1.equals(realtimeServerEventError1));
        System.assert(realtimeServerEventError3.equals(realtimeServerEventError4));
        System.assert(realtimeServerEventError4.equals(realtimeServerEventError3));
        System.assert(realtimeServerEventError3.equals(realtimeServerEventError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventError realtimeServerEventError1 = OASRealtimeServerEventError.getExample();
        OASRealtimeServerEventError realtimeServerEventError2 = OASRealtimeServerEventError.getExample();
        OASRealtimeServerEventError realtimeServerEventError3 = new OASRealtimeServerEventError();
        OASRealtimeServerEventError realtimeServerEventError4 = new OASRealtimeServerEventError();

        System.assert(realtimeServerEventError1.equals(realtimeServerEventError2));
        System.assert(realtimeServerEventError2.equals(realtimeServerEventError1));
        System.assert(realtimeServerEventError3.equals(realtimeServerEventError4));
        System.assert(realtimeServerEventError4.equals(realtimeServerEventError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventError realtimeServerEventError1 = OASRealtimeServerEventError.getExample();
        OASRealtimeServerEventError realtimeServerEventError2 = new OASRealtimeServerEventError();

        System.assertEquals(false, realtimeServerEventError1.equals('foo'));
        System.assertEquals(false, realtimeServerEventError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventError realtimeServerEventError1 = OASRealtimeServerEventError.getExample();
        OASRealtimeServerEventError realtimeServerEventError2 = new OASRealtimeServerEventError();
        OASRealtimeServerEventError realtimeServerEventError3;

        System.assertEquals(false, realtimeServerEventError1.equals(realtimeServerEventError3));
        System.assertEquals(false, realtimeServerEventError2.equals(realtimeServerEventError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventError realtimeServerEventError1 = OASRealtimeServerEventError.getExample();
        OASRealtimeServerEventError realtimeServerEventError2 = new OASRealtimeServerEventError();

        System.assertEquals(realtimeServerEventError1.hashCode(), realtimeServerEventError1.hashCode());
        System.assertEquals(realtimeServerEventError2.hashCode(), realtimeServerEventError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventError realtimeServerEventError1 = OASRealtimeServerEventError.getExample();
        OASRealtimeServerEventError realtimeServerEventError2 = OASRealtimeServerEventError.getExample();
        OASRealtimeServerEventError realtimeServerEventError3 = new OASRealtimeServerEventError();
        OASRealtimeServerEventError realtimeServerEventError4 = new OASRealtimeServerEventError();

        System.assert(realtimeServerEventError1.equals(realtimeServerEventError2));
        System.assert(realtimeServerEventError3.equals(realtimeServerEventError4));
        System.assertEquals(realtimeServerEventError1.hashCode(), realtimeServerEventError2.hashCode());
        System.assertEquals(realtimeServerEventError3.hashCode(), realtimeServerEventError4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeServerEventError realtimeServerEventError = new OASRealtimeServerEventError();
        Map<String, String> x-property-mappings = realtimeServerEventError.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
    }
}
