@isTest
private class OASRealtimeResponseUsageOutputTokenDTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails1 = OASRealtimeResponseUsageOutputTokenD.getExample();
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails2 = realtimeResponseUsageOutputTokenDetails1;
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails3 = new OASRealtimeResponseUsageOutputTokenD();
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails4 = realtimeResponseUsageOutputTokenDetails3;

        System.assert(realtimeResponseUsageOutputTokenDetails1.equals(realtimeResponseUsageOutputTokenDetails2));
        System.assert(realtimeResponseUsageOutputTokenDetails2.equals(realtimeResponseUsageOutputTokenDetails1));
        System.assert(realtimeResponseUsageOutputTokenDetails1.equals(realtimeResponseUsageOutputTokenDetails1));
        System.assert(realtimeResponseUsageOutputTokenDetails3.equals(realtimeResponseUsageOutputTokenDetails4));
        System.assert(realtimeResponseUsageOutputTokenDetails4.equals(realtimeResponseUsageOutputTokenDetails3));
        System.assert(realtimeResponseUsageOutputTokenDetails3.equals(realtimeResponseUsageOutputTokenDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails1 = OASRealtimeResponseUsageOutputTokenD.getExample();
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails2 = OASRealtimeResponseUsageOutputTokenD.getExample();
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails3 = new OASRealtimeResponseUsageOutputTokenD();
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails4 = new OASRealtimeResponseUsageOutputTokenD();

        System.assert(realtimeResponseUsageOutputTokenDetails1.equals(realtimeResponseUsageOutputTokenDetails2));
        System.assert(realtimeResponseUsageOutputTokenDetails2.equals(realtimeResponseUsageOutputTokenDetails1));
        System.assert(realtimeResponseUsageOutputTokenDetails3.equals(realtimeResponseUsageOutputTokenDetails4));
        System.assert(realtimeResponseUsageOutputTokenDetails4.equals(realtimeResponseUsageOutputTokenDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails1 = OASRealtimeResponseUsageOutputTokenD.getExample();
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails2 = new OASRealtimeResponseUsageOutputTokenD();

        System.assertEquals(false, realtimeResponseUsageOutputTokenDetails1.equals('foo'));
        System.assertEquals(false, realtimeResponseUsageOutputTokenDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails1 = OASRealtimeResponseUsageOutputTokenD.getExample();
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails2 = new OASRealtimeResponseUsageOutputTokenD();
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails3;

        System.assertEquals(false, realtimeResponseUsageOutputTokenDetails1.equals(realtimeResponseUsageOutputTokenDetails3));
        System.assertEquals(false, realtimeResponseUsageOutputTokenDetails2.equals(realtimeResponseUsageOutputTokenDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails1 = OASRealtimeResponseUsageOutputTokenD.getExample();
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails2 = new OASRealtimeResponseUsageOutputTokenD();

        System.assertEquals(realtimeResponseUsageOutputTokenDetails1.hashCode(), realtimeResponseUsageOutputTokenDetails1.hashCode());
        System.assertEquals(realtimeResponseUsageOutputTokenDetails2.hashCode(), realtimeResponseUsageOutputTokenDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails1 = OASRealtimeResponseUsageOutputTokenD.getExample();
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails2 = OASRealtimeResponseUsageOutputTokenD.getExample();
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails3 = new OASRealtimeResponseUsageOutputTokenD();
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails4 = new OASRealtimeResponseUsageOutputTokenD();

        System.assert(realtimeResponseUsageOutputTokenDetails1.equals(realtimeResponseUsageOutputTokenDetails2));
        System.assert(realtimeResponseUsageOutputTokenDetails3.equals(realtimeResponseUsageOutputTokenDetails4));
        System.assertEquals(realtimeResponseUsageOutputTokenDetails1.hashCode(), realtimeResponseUsageOutputTokenDetails2.hashCode());
        System.assertEquals(realtimeResponseUsageOutputTokenDetails3.hashCode(), realtimeResponseUsageOutputTokenDetails4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeResponseUsageOutputTokenD realtimeResponseUsageOutputTokenDetails = new OASRealtimeResponseUsageOutputTokenD();
        Map<String, String> x-property-mappings = realtimeResponseUsageOutputTokenDetails.getx-property-mappings();
        System.assertEquals('textTokens', x-property-mappings.get('text_tokens'));
        System.assertEquals('audioTokens', x-property-mappings.get('audio_tokens'));
    }
}
