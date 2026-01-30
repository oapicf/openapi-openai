@isTest
private class OASRealtimeResponseUsageInputTokenDeTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails1 = OASRealtimeResponseUsageInputTokenDe.getExample();
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails2 = realtimeResponseUsageInputTokenDetails1;
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails3 = new OASRealtimeResponseUsageInputTokenDe();
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails4 = realtimeResponseUsageInputTokenDetails3;

        System.assert(realtimeResponseUsageInputTokenDetails1.equals(realtimeResponseUsageInputTokenDetails2));
        System.assert(realtimeResponseUsageInputTokenDetails2.equals(realtimeResponseUsageInputTokenDetails1));
        System.assert(realtimeResponseUsageInputTokenDetails1.equals(realtimeResponseUsageInputTokenDetails1));
        System.assert(realtimeResponseUsageInputTokenDetails3.equals(realtimeResponseUsageInputTokenDetails4));
        System.assert(realtimeResponseUsageInputTokenDetails4.equals(realtimeResponseUsageInputTokenDetails3));
        System.assert(realtimeResponseUsageInputTokenDetails3.equals(realtimeResponseUsageInputTokenDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails1 = OASRealtimeResponseUsageInputTokenDe.getExample();
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails2 = OASRealtimeResponseUsageInputTokenDe.getExample();
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails3 = new OASRealtimeResponseUsageInputTokenDe();
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails4 = new OASRealtimeResponseUsageInputTokenDe();

        System.assert(realtimeResponseUsageInputTokenDetails1.equals(realtimeResponseUsageInputTokenDetails2));
        System.assert(realtimeResponseUsageInputTokenDetails2.equals(realtimeResponseUsageInputTokenDetails1));
        System.assert(realtimeResponseUsageInputTokenDetails3.equals(realtimeResponseUsageInputTokenDetails4));
        System.assert(realtimeResponseUsageInputTokenDetails4.equals(realtimeResponseUsageInputTokenDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails1 = OASRealtimeResponseUsageInputTokenDe.getExample();
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails2 = new OASRealtimeResponseUsageInputTokenDe();

        System.assertEquals(false, realtimeResponseUsageInputTokenDetails1.equals('foo'));
        System.assertEquals(false, realtimeResponseUsageInputTokenDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails1 = OASRealtimeResponseUsageInputTokenDe.getExample();
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails2 = new OASRealtimeResponseUsageInputTokenDe();
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails3;

        System.assertEquals(false, realtimeResponseUsageInputTokenDetails1.equals(realtimeResponseUsageInputTokenDetails3));
        System.assertEquals(false, realtimeResponseUsageInputTokenDetails2.equals(realtimeResponseUsageInputTokenDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails1 = OASRealtimeResponseUsageInputTokenDe.getExample();
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails2 = new OASRealtimeResponseUsageInputTokenDe();

        System.assertEquals(realtimeResponseUsageInputTokenDetails1.hashCode(), realtimeResponseUsageInputTokenDetails1.hashCode());
        System.assertEquals(realtimeResponseUsageInputTokenDetails2.hashCode(), realtimeResponseUsageInputTokenDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails1 = OASRealtimeResponseUsageInputTokenDe.getExample();
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails2 = OASRealtimeResponseUsageInputTokenDe.getExample();
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails3 = new OASRealtimeResponseUsageInputTokenDe();
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails4 = new OASRealtimeResponseUsageInputTokenDe();

        System.assert(realtimeResponseUsageInputTokenDetails1.equals(realtimeResponseUsageInputTokenDetails2));
        System.assert(realtimeResponseUsageInputTokenDetails3.equals(realtimeResponseUsageInputTokenDetails4));
        System.assertEquals(realtimeResponseUsageInputTokenDetails1.hashCode(), realtimeResponseUsageInputTokenDetails2.hashCode());
        System.assertEquals(realtimeResponseUsageInputTokenDetails3.hashCode(), realtimeResponseUsageInputTokenDetails4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeResponseUsageInputTokenDe realtimeResponseUsageInputTokenDetails = new OASRealtimeResponseUsageInputTokenDe();
        Map<String, String> x-property-mappings = realtimeResponseUsageInputTokenDetails.getx-property-mappings();
        System.assertEquals('cachedTokens', x-property-mappings.get('cached_tokens'));
        System.assertEquals('textTokens', x-property-mappings.get('text_tokens'));
        System.assertEquals('audioTokens', x-property-mappings.get('audio_tokens'));
    }
}
