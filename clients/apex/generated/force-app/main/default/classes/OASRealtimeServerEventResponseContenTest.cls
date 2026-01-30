@isTest
private class OASRealtimeServerEventResponseContenTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart1 = OASRealtimeServerEventResponseConten.getExample();
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart2 = realtimeServerEventResponseContentPartDonePart1;
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart3 = new OASRealtimeServerEventResponseConten();
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart4 = realtimeServerEventResponseContentPartDonePart3;

        System.assert(realtimeServerEventResponseContentPartDonePart1.equals(realtimeServerEventResponseContentPartDonePart2));
        System.assert(realtimeServerEventResponseContentPartDonePart2.equals(realtimeServerEventResponseContentPartDonePart1));
        System.assert(realtimeServerEventResponseContentPartDonePart1.equals(realtimeServerEventResponseContentPartDonePart1));
        System.assert(realtimeServerEventResponseContentPartDonePart3.equals(realtimeServerEventResponseContentPartDonePart4));
        System.assert(realtimeServerEventResponseContentPartDonePart4.equals(realtimeServerEventResponseContentPartDonePart3));
        System.assert(realtimeServerEventResponseContentPartDonePart3.equals(realtimeServerEventResponseContentPartDonePart3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart1 = OASRealtimeServerEventResponseConten.getExample();
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart2 = OASRealtimeServerEventResponseConten.getExample();
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart3 = new OASRealtimeServerEventResponseConten();
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart4 = new OASRealtimeServerEventResponseConten();

        System.assert(realtimeServerEventResponseContentPartDonePart1.equals(realtimeServerEventResponseContentPartDonePart2));
        System.assert(realtimeServerEventResponseContentPartDonePart2.equals(realtimeServerEventResponseContentPartDonePart1));
        System.assert(realtimeServerEventResponseContentPartDonePart3.equals(realtimeServerEventResponseContentPartDonePart4));
        System.assert(realtimeServerEventResponseContentPartDonePart4.equals(realtimeServerEventResponseContentPartDonePart3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart1 = OASRealtimeServerEventResponseConten.getExample();
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart2 = new OASRealtimeServerEventResponseConten();

        System.assertEquals(false, realtimeServerEventResponseContentPartDonePart1.equals('foo'));
        System.assertEquals(false, realtimeServerEventResponseContentPartDonePart2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart1 = OASRealtimeServerEventResponseConten.getExample();
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart2 = new OASRealtimeServerEventResponseConten();
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart3;

        System.assertEquals(false, realtimeServerEventResponseContentPartDonePart1.equals(realtimeServerEventResponseContentPartDonePart3));
        System.assertEquals(false, realtimeServerEventResponseContentPartDonePart2.equals(realtimeServerEventResponseContentPartDonePart3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart1 = OASRealtimeServerEventResponseConten.getExample();
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart2 = new OASRealtimeServerEventResponseConten();

        System.assertEquals(realtimeServerEventResponseContentPartDonePart1.hashCode(), realtimeServerEventResponseContentPartDonePart1.hashCode());
        System.assertEquals(realtimeServerEventResponseContentPartDonePart2.hashCode(), realtimeServerEventResponseContentPartDonePart2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart1 = OASRealtimeServerEventResponseConten.getExample();
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart2 = OASRealtimeServerEventResponseConten.getExample();
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart3 = new OASRealtimeServerEventResponseConten();
        OASRealtimeServerEventResponseConten realtimeServerEventResponseContentPartDonePart4 = new OASRealtimeServerEventResponseConten();

        System.assert(realtimeServerEventResponseContentPartDonePart1.equals(realtimeServerEventResponseContentPartDonePart2));
        System.assert(realtimeServerEventResponseContentPartDonePart3.equals(realtimeServerEventResponseContentPartDonePart4));
        System.assertEquals(realtimeServerEventResponseContentPartDonePart1.hashCode(), realtimeServerEventResponseContentPartDonePart2.hashCode());
        System.assertEquals(realtimeServerEventResponseContentPartDonePart3.hashCode(), realtimeServerEventResponseContentPartDonePart4.hashCode());
    }
}
