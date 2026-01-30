@isTest
private class OASCompletionUsageTest {
    @isTest
    private static void equalsSameInstance() {
        OASCompletionUsage completionUsage1 = OASCompletionUsage.getExample();
        OASCompletionUsage completionUsage2 = completionUsage1;
        OASCompletionUsage completionUsage3 = new OASCompletionUsage();
        OASCompletionUsage completionUsage4 = completionUsage3;

        System.assert(completionUsage1.equals(completionUsage2));
        System.assert(completionUsage2.equals(completionUsage1));
        System.assert(completionUsage1.equals(completionUsage1));
        System.assert(completionUsage3.equals(completionUsage4));
        System.assert(completionUsage4.equals(completionUsage3));
        System.assert(completionUsage3.equals(completionUsage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCompletionUsage completionUsage1 = OASCompletionUsage.getExample();
        OASCompletionUsage completionUsage2 = OASCompletionUsage.getExample();
        OASCompletionUsage completionUsage3 = new OASCompletionUsage();
        OASCompletionUsage completionUsage4 = new OASCompletionUsage();

        System.assert(completionUsage1.equals(completionUsage2));
        System.assert(completionUsage2.equals(completionUsage1));
        System.assert(completionUsage3.equals(completionUsage4));
        System.assert(completionUsage4.equals(completionUsage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCompletionUsage completionUsage1 = OASCompletionUsage.getExample();
        OASCompletionUsage completionUsage2 = new OASCompletionUsage();

        System.assertEquals(false, completionUsage1.equals('foo'));
        System.assertEquals(false, completionUsage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCompletionUsage completionUsage1 = OASCompletionUsage.getExample();
        OASCompletionUsage completionUsage2 = new OASCompletionUsage();
        OASCompletionUsage completionUsage3;

        System.assertEquals(false, completionUsage1.equals(completionUsage3));
        System.assertEquals(false, completionUsage2.equals(completionUsage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCompletionUsage completionUsage1 = OASCompletionUsage.getExample();
        OASCompletionUsage completionUsage2 = new OASCompletionUsage();

        System.assertEquals(completionUsage1.hashCode(), completionUsage1.hashCode());
        System.assertEquals(completionUsage2.hashCode(), completionUsage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCompletionUsage completionUsage1 = OASCompletionUsage.getExample();
        OASCompletionUsage completionUsage2 = OASCompletionUsage.getExample();
        OASCompletionUsage completionUsage3 = new OASCompletionUsage();
        OASCompletionUsage completionUsage4 = new OASCompletionUsage();

        System.assert(completionUsage1.equals(completionUsage2));
        System.assert(completionUsage3.equals(completionUsage4));
        System.assertEquals(completionUsage1.hashCode(), completionUsage2.hashCode());
        System.assertEquals(completionUsage3.hashCode(), completionUsage4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCompletionUsage completionUsage = new OASCompletionUsage();
        Map<String, String> x-property-mappings = completionUsage.getx-property-mappings();
        System.assertEquals('completionTokens', x-property-mappings.get('completion_tokens'));
        System.assertEquals('promptTokens', x-property-mappings.get('prompt_tokens'));
        System.assertEquals('totalTokens', x-property-mappings.get('total_tokens'));
        System.assertEquals('completionTokensDetails', x-property-mappings.get('completion_tokens_details'));
        System.assertEquals('promptTokensDetails', x-property-mappings.get('prompt_tokens_details'));
    }
}
