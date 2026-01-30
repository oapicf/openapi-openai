@isTest
private class OASRealtimeServerEventErrorErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventErrorError realtimeServerEventErrorError1 = OASRealtimeServerEventErrorError.getExample();
        OASRealtimeServerEventErrorError realtimeServerEventErrorError2 = realtimeServerEventErrorError1;
        OASRealtimeServerEventErrorError realtimeServerEventErrorError3 = new OASRealtimeServerEventErrorError();
        OASRealtimeServerEventErrorError realtimeServerEventErrorError4 = realtimeServerEventErrorError3;

        System.assert(realtimeServerEventErrorError1.equals(realtimeServerEventErrorError2));
        System.assert(realtimeServerEventErrorError2.equals(realtimeServerEventErrorError1));
        System.assert(realtimeServerEventErrorError1.equals(realtimeServerEventErrorError1));
        System.assert(realtimeServerEventErrorError3.equals(realtimeServerEventErrorError4));
        System.assert(realtimeServerEventErrorError4.equals(realtimeServerEventErrorError3));
        System.assert(realtimeServerEventErrorError3.equals(realtimeServerEventErrorError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventErrorError realtimeServerEventErrorError1 = OASRealtimeServerEventErrorError.getExample();
        OASRealtimeServerEventErrorError realtimeServerEventErrorError2 = OASRealtimeServerEventErrorError.getExample();
        OASRealtimeServerEventErrorError realtimeServerEventErrorError3 = new OASRealtimeServerEventErrorError();
        OASRealtimeServerEventErrorError realtimeServerEventErrorError4 = new OASRealtimeServerEventErrorError();

        System.assert(realtimeServerEventErrorError1.equals(realtimeServerEventErrorError2));
        System.assert(realtimeServerEventErrorError2.equals(realtimeServerEventErrorError1));
        System.assert(realtimeServerEventErrorError3.equals(realtimeServerEventErrorError4));
        System.assert(realtimeServerEventErrorError4.equals(realtimeServerEventErrorError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventErrorError realtimeServerEventErrorError1 = OASRealtimeServerEventErrorError.getExample();
        OASRealtimeServerEventErrorError realtimeServerEventErrorError2 = new OASRealtimeServerEventErrorError();

        System.assertEquals(false, realtimeServerEventErrorError1.equals('foo'));
        System.assertEquals(false, realtimeServerEventErrorError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventErrorError realtimeServerEventErrorError1 = OASRealtimeServerEventErrorError.getExample();
        OASRealtimeServerEventErrorError realtimeServerEventErrorError2 = new OASRealtimeServerEventErrorError();
        OASRealtimeServerEventErrorError realtimeServerEventErrorError3;

        System.assertEquals(false, realtimeServerEventErrorError1.equals(realtimeServerEventErrorError3));
        System.assertEquals(false, realtimeServerEventErrorError2.equals(realtimeServerEventErrorError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventErrorError realtimeServerEventErrorError1 = OASRealtimeServerEventErrorError.getExample();
        OASRealtimeServerEventErrorError realtimeServerEventErrorError2 = new OASRealtimeServerEventErrorError();

        System.assertEquals(realtimeServerEventErrorError1.hashCode(), realtimeServerEventErrorError1.hashCode());
        System.assertEquals(realtimeServerEventErrorError2.hashCode(), realtimeServerEventErrorError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventErrorError realtimeServerEventErrorError1 = OASRealtimeServerEventErrorError.getExample();
        OASRealtimeServerEventErrorError realtimeServerEventErrorError2 = OASRealtimeServerEventErrorError.getExample();
        OASRealtimeServerEventErrorError realtimeServerEventErrorError3 = new OASRealtimeServerEventErrorError();
        OASRealtimeServerEventErrorError realtimeServerEventErrorError4 = new OASRealtimeServerEventErrorError();

        System.assert(realtimeServerEventErrorError1.equals(realtimeServerEventErrorError2));
        System.assert(realtimeServerEventErrorError3.equals(realtimeServerEventErrorError4));
        System.assertEquals(realtimeServerEventErrorError1.hashCode(), realtimeServerEventErrorError2.hashCode());
        System.assertEquals(realtimeServerEventErrorError3.hashCode(), realtimeServerEventErrorError4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeServerEventErrorError realtimeServerEventErrorError = new OASRealtimeServerEventErrorError();
        Map<String, String> x-property-mappings = realtimeServerEventErrorError.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
    }
}
