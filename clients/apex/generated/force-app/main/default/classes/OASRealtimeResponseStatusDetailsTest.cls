@isTest
private class OASRealtimeResponseStatusDetailsTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails1 = OASRealtimeResponseStatusDetails.getExample();
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails2 = realtimeResponseStatusDetails1;
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails3 = new OASRealtimeResponseStatusDetails();
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails4 = realtimeResponseStatusDetails3;

        System.assert(realtimeResponseStatusDetails1.equals(realtimeResponseStatusDetails2));
        System.assert(realtimeResponseStatusDetails2.equals(realtimeResponseStatusDetails1));
        System.assert(realtimeResponseStatusDetails1.equals(realtimeResponseStatusDetails1));
        System.assert(realtimeResponseStatusDetails3.equals(realtimeResponseStatusDetails4));
        System.assert(realtimeResponseStatusDetails4.equals(realtimeResponseStatusDetails3));
        System.assert(realtimeResponseStatusDetails3.equals(realtimeResponseStatusDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails1 = OASRealtimeResponseStatusDetails.getExample();
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails2 = OASRealtimeResponseStatusDetails.getExample();
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails3 = new OASRealtimeResponseStatusDetails();
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails4 = new OASRealtimeResponseStatusDetails();

        System.assert(realtimeResponseStatusDetails1.equals(realtimeResponseStatusDetails2));
        System.assert(realtimeResponseStatusDetails2.equals(realtimeResponseStatusDetails1));
        System.assert(realtimeResponseStatusDetails3.equals(realtimeResponseStatusDetails4));
        System.assert(realtimeResponseStatusDetails4.equals(realtimeResponseStatusDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails1 = OASRealtimeResponseStatusDetails.getExample();
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails2 = new OASRealtimeResponseStatusDetails();

        System.assertEquals(false, realtimeResponseStatusDetails1.equals('foo'));
        System.assertEquals(false, realtimeResponseStatusDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails1 = OASRealtimeResponseStatusDetails.getExample();
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails2 = new OASRealtimeResponseStatusDetails();
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails3;

        System.assertEquals(false, realtimeResponseStatusDetails1.equals(realtimeResponseStatusDetails3));
        System.assertEquals(false, realtimeResponseStatusDetails2.equals(realtimeResponseStatusDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails1 = OASRealtimeResponseStatusDetails.getExample();
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails2 = new OASRealtimeResponseStatusDetails();

        System.assertEquals(realtimeResponseStatusDetails1.hashCode(), realtimeResponseStatusDetails1.hashCode());
        System.assertEquals(realtimeResponseStatusDetails2.hashCode(), realtimeResponseStatusDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails1 = OASRealtimeResponseStatusDetails.getExample();
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails2 = OASRealtimeResponseStatusDetails.getExample();
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails3 = new OASRealtimeResponseStatusDetails();
        OASRealtimeResponseStatusDetails realtimeResponseStatusDetails4 = new OASRealtimeResponseStatusDetails();

        System.assert(realtimeResponseStatusDetails1.equals(realtimeResponseStatusDetails2));
        System.assert(realtimeResponseStatusDetails3.equals(realtimeResponseStatusDetails4));
        System.assertEquals(realtimeResponseStatusDetails1.hashCode(), realtimeResponseStatusDetails2.hashCode());
        System.assertEquals(realtimeResponseStatusDetails3.hashCode(), realtimeResponseStatusDetails4.hashCode());
    }
}
