@isTest
private class OASRealtimeResponseUsageTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeResponseUsage realtimeResponseUsage1 = OASRealtimeResponseUsage.getExample();
        OASRealtimeResponseUsage realtimeResponseUsage2 = realtimeResponseUsage1;
        OASRealtimeResponseUsage realtimeResponseUsage3 = new OASRealtimeResponseUsage();
        OASRealtimeResponseUsage realtimeResponseUsage4 = realtimeResponseUsage3;

        System.assert(realtimeResponseUsage1.equals(realtimeResponseUsage2));
        System.assert(realtimeResponseUsage2.equals(realtimeResponseUsage1));
        System.assert(realtimeResponseUsage1.equals(realtimeResponseUsage1));
        System.assert(realtimeResponseUsage3.equals(realtimeResponseUsage4));
        System.assert(realtimeResponseUsage4.equals(realtimeResponseUsage3));
        System.assert(realtimeResponseUsage3.equals(realtimeResponseUsage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeResponseUsage realtimeResponseUsage1 = OASRealtimeResponseUsage.getExample();
        OASRealtimeResponseUsage realtimeResponseUsage2 = OASRealtimeResponseUsage.getExample();
        OASRealtimeResponseUsage realtimeResponseUsage3 = new OASRealtimeResponseUsage();
        OASRealtimeResponseUsage realtimeResponseUsage4 = new OASRealtimeResponseUsage();

        System.assert(realtimeResponseUsage1.equals(realtimeResponseUsage2));
        System.assert(realtimeResponseUsage2.equals(realtimeResponseUsage1));
        System.assert(realtimeResponseUsage3.equals(realtimeResponseUsage4));
        System.assert(realtimeResponseUsage4.equals(realtimeResponseUsage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeResponseUsage realtimeResponseUsage1 = OASRealtimeResponseUsage.getExample();
        OASRealtimeResponseUsage realtimeResponseUsage2 = new OASRealtimeResponseUsage();

        System.assertEquals(false, realtimeResponseUsage1.equals('foo'));
        System.assertEquals(false, realtimeResponseUsage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeResponseUsage realtimeResponseUsage1 = OASRealtimeResponseUsage.getExample();
        OASRealtimeResponseUsage realtimeResponseUsage2 = new OASRealtimeResponseUsage();
        OASRealtimeResponseUsage realtimeResponseUsage3;

        System.assertEquals(false, realtimeResponseUsage1.equals(realtimeResponseUsage3));
        System.assertEquals(false, realtimeResponseUsage2.equals(realtimeResponseUsage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeResponseUsage realtimeResponseUsage1 = OASRealtimeResponseUsage.getExample();
        OASRealtimeResponseUsage realtimeResponseUsage2 = new OASRealtimeResponseUsage();

        System.assertEquals(realtimeResponseUsage1.hashCode(), realtimeResponseUsage1.hashCode());
        System.assertEquals(realtimeResponseUsage2.hashCode(), realtimeResponseUsage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeResponseUsage realtimeResponseUsage1 = OASRealtimeResponseUsage.getExample();
        OASRealtimeResponseUsage realtimeResponseUsage2 = OASRealtimeResponseUsage.getExample();
        OASRealtimeResponseUsage realtimeResponseUsage3 = new OASRealtimeResponseUsage();
        OASRealtimeResponseUsage realtimeResponseUsage4 = new OASRealtimeResponseUsage();

        System.assert(realtimeResponseUsage1.equals(realtimeResponseUsage2));
        System.assert(realtimeResponseUsage3.equals(realtimeResponseUsage4));
        System.assertEquals(realtimeResponseUsage1.hashCode(), realtimeResponseUsage2.hashCode());
        System.assertEquals(realtimeResponseUsage3.hashCode(), realtimeResponseUsage4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeResponseUsage realtimeResponseUsage = new OASRealtimeResponseUsage();
        Map<String, String> x-property-mappings = realtimeResponseUsage.getx-property-mappings();
        System.assertEquals('totalTokens', x-property-mappings.get('total_tokens'));
        System.assertEquals('inputTokens', x-property-mappings.get('input_tokens'));
        System.assertEquals('outputTokens', x-property-mappings.get('output_tokens'));
        System.assertEquals('inputTokenDetails', x-property-mappings.get('input_token_details'));
        System.assertEquals('outputTokenDetails', x-property-mappings.get('output_token_details'));
    }
}
