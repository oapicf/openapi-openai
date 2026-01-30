@isTest
private class OASRealtimeResponseStatusDetailsErroTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError1 = OASRealtimeResponseStatusDetailsErro.getExample();
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError2 = realtimeResponseStatusDetailsError1;
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError3 = new OASRealtimeResponseStatusDetailsErro();
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError4 = realtimeResponseStatusDetailsError3;

        System.assert(realtimeResponseStatusDetailsError1.equals(realtimeResponseStatusDetailsError2));
        System.assert(realtimeResponseStatusDetailsError2.equals(realtimeResponseStatusDetailsError1));
        System.assert(realtimeResponseStatusDetailsError1.equals(realtimeResponseStatusDetailsError1));
        System.assert(realtimeResponseStatusDetailsError3.equals(realtimeResponseStatusDetailsError4));
        System.assert(realtimeResponseStatusDetailsError4.equals(realtimeResponseStatusDetailsError3));
        System.assert(realtimeResponseStatusDetailsError3.equals(realtimeResponseStatusDetailsError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError1 = OASRealtimeResponseStatusDetailsErro.getExample();
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError2 = OASRealtimeResponseStatusDetailsErro.getExample();
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError3 = new OASRealtimeResponseStatusDetailsErro();
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError4 = new OASRealtimeResponseStatusDetailsErro();

        System.assert(realtimeResponseStatusDetailsError1.equals(realtimeResponseStatusDetailsError2));
        System.assert(realtimeResponseStatusDetailsError2.equals(realtimeResponseStatusDetailsError1));
        System.assert(realtimeResponseStatusDetailsError3.equals(realtimeResponseStatusDetailsError4));
        System.assert(realtimeResponseStatusDetailsError4.equals(realtimeResponseStatusDetailsError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError1 = OASRealtimeResponseStatusDetailsErro.getExample();
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError2 = new OASRealtimeResponseStatusDetailsErro();

        System.assertEquals(false, realtimeResponseStatusDetailsError1.equals('foo'));
        System.assertEquals(false, realtimeResponseStatusDetailsError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError1 = OASRealtimeResponseStatusDetailsErro.getExample();
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError2 = new OASRealtimeResponseStatusDetailsErro();
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError3;

        System.assertEquals(false, realtimeResponseStatusDetailsError1.equals(realtimeResponseStatusDetailsError3));
        System.assertEquals(false, realtimeResponseStatusDetailsError2.equals(realtimeResponseStatusDetailsError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError1 = OASRealtimeResponseStatusDetailsErro.getExample();
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError2 = new OASRealtimeResponseStatusDetailsErro();

        System.assertEquals(realtimeResponseStatusDetailsError1.hashCode(), realtimeResponseStatusDetailsError1.hashCode());
        System.assertEquals(realtimeResponseStatusDetailsError2.hashCode(), realtimeResponseStatusDetailsError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError1 = OASRealtimeResponseStatusDetailsErro.getExample();
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError2 = OASRealtimeResponseStatusDetailsErro.getExample();
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError3 = new OASRealtimeResponseStatusDetailsErro();
        OASRealtimeResponseStatusDetailsErro realtimeResponseStatusDetailsError4 = new OASRealtimeResponseStatusDetailsErro();

        System.assert(realtimeResponseStatusDetailsError1.equals(realtimeResponseStatusDetailsError2));
        System.assert(realtimeResponseStatusDetailsError3.equals(realtimeResponseStatusDetailsError4));
        System.assertEquals(realtimeResponseStatusDetailsError1.hashCode(), realtimeResponseStatusDetailsError2.hashCode());
        System.assertEquals(realtimeResponseStatusDetailsError3.hashCode(), realtimeResponseStatusDetailsError4.hashCode());
    }
}
