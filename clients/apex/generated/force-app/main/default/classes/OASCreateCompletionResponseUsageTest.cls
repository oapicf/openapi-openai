@isTest
private class OASCreateCompletionResponseUsageTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateCompletionResponseUsage createCompletionResponseUsage1 = OASCreateCompletionResponseUsage.getExample();
        OASCreateCompletionResponseUsage createCompletionResponseUsage2 = createCompletionResponseUsage1;
        OASCreateCompletionResponseUsage createCompletionResponseUsage3 = new OASCreateCompletionResponseUsage();
        OASCreateCompletionResponseUsage createCompletionResponseUsage4 = createCompletionResponseUsage3;

        System.assert(createCompletionResponseUsage1.equals(createCompletionResponseUsage2));
        System.assert(createCompletionResponseUsage2.equals(createCompletionResponseUsage1));
        System.assert(createCompletionResponseUsage1.equals(createCompletionResponseUsage1));
        System.assert(createCompletionResponseUsage3.equals(createCompletionResponseUsage4));
        System.assert(createCompletionResponseUsage4.equals(createCompletionResponseUsage3));
        System.assert(createCompletionResponseUsage3.equals(createCompletionResponseUsage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateCompletionResponseUsage createCompletionResponseUsage1 = OASCreateCompletionResponseUsage.getExample();
        OASCreateCompletionResponseUsage createCompletionResponseUsage2 = OASCreateCompletionResponseUsage.getExample();
        OASCreateCompletionResponseUsage createCompletionResponseUsage3 = new OASCreateCompletionResponseUsage();
        OASCreateCompletionResponseUsage createCompletionResponseUsage4 = new OASCreateCompletionResponseUsage();

        System.assert(createCompletionResponseUsage1.equals(createCompletionResponseUsage2));
        System.assert(createCompletionResponseUsage2.equals(createCompletionResponseUsage1));
        System.assert(createCompletionResponseUsage3.equals(createCompletionResponseUsage4));
        System.assert(createCompletionResponseUsage4.equals(createCompletionResponseUsage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateCompletionResponseUsage createCompletionResponseUsage1 = OASCreateCompletionResponseUsage.getExample();
        OASCreateCompletionResponseUsage createCompletionResponseUsage2 = new OASCreateCompletionResponseUsage();

        System.assertEquals(false, createCompletionResponseUsage1.equals('foo'));
        System.assertEquals(false, createCompletionResponseUsage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateCompletionResponseUsage createCompletionResponseUsage1 = OASCreateCompletionResponseUsage.getExample();
        OASCreateCompletionResponseUsage createCompletionResponseUsage2 = new OASCreateCompletionResponseUsage();
        OASCreateCompletionResponseUsage createCompletionResponseUsage3;

        System.assertEquals(false, createCompletionResponseUsage1.equals(createCompletionResponseUsage3));
        System.assertEquals(false, createCompletionResponseUsage2.equals(createCompletionResponseUsage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateCompletionResponseUsage createCompletionResponseUsage1 = OASCreateCompletionResponseUsage.getExample();
        OASCreateCompletionResponseUsage createCompletionResponseUsage2 = new OASCreateCompletionResponseUsage();

        System.assertEquals(createCompletionResponseUsage1.hashCode(), createCompletionResponseUsage1.hashCode());
        System.assertEquals(createCompletionResponseUsage2.hashCode(), createCompletionResponseUsage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateCompletionResponseUsage createCompletionResponseUsage1 = OASCreateCompletionResponseUsage.getExample();
        OASCreateCompletionResponseUsage createCompletionResponseUsage2 = OASCreateCompletionResponseUsage.getExample();
        OASCreateCompletionResponseUsage createCompletionResponseUsage3 = new OASCreateCompletionResponseUsage();
        OASCreateCompletionResponseUsage createCompletionResponseUsage4 = new OASCreateCompletionResponseUsage();

        System.assert(createCompletionResponseUsage1.equals(createCompletionResponseUsage2));
        System.assert(createCompletionResponseUsage3.equals(createCompletionResponseUsage4));
        System.assertEquals(createCompletionResponseUsage1.hashCode(), createCompletionResponseUsage2.hashCode());
        System.assertEquals(createCompletionResponseUsage3.hashCode(), createCompletionResponseUsage4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateCompletionResponseUsage createCompletionResponseUsage = new OASCreateCompletionResponseUsage();
        Map<String, String> x-property-mappings = createCompletionResponseUsage.getx-property-mappings();
        System.assertEquals('promptTokens', x-property-mappings.get('prompt_tokens'));
        System.assertEquals('completionTokens', x-property-mappings.get('completion_tokens'));
        System.assertEquals('totalTokens', x-property-mappings.get('total_tokens'));
    }
}
