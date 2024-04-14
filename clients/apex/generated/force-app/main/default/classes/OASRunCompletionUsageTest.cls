@isTest
private class OASRunCompletionUsageTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunCompletionUsage runCompletionUsage1 = OASRunCompletionUsage.getExample();
        OASRunCompletionUsage runCompletionUsage2 = runCompletionUsage1;
        OASRunCompletionUsage runCompletionUsage3 = new OASRunCompletionUsage();
        OASRunCompletionUsage runCompletionUsage4 = runCompletionUsage3;

        System.assert(runCompletionUsage1.equals(runCompletionUsage2));
        System.assert(runCompletionUsage2.equals(runCompletionUsage1));
        System.assert(runCompletionUsage1.equals(runCompletionUsage1));
        System.assert(runCompletionUsage3.equals(runCompletionUsage4));
        System.assert(runCompletionUsage4.equals(runCompletionUsage3));
        System.assert(runCompletionUsage3.equals(runCompletionUsage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunCompletionUsage runCompletionUsage1 = OASRunCompletionUsage.getExample();
        OASRunCompletionUsage runCompletionUsage2 = OASRunCompletionUsage.getExample();
        OASRunCompletionUsage runCompletionUsage3 = new OASRunCompletionUsage();
        OASRunCompletionUsage runCompletionUsage4 = new OASRunCompletionUsage();

        System.assert(runCompletionUsage1.equals(runCompletionUsage2));
        System.assert(runCompletionUsage2.equals(runCompletionUsage1));
        System.assert(runCompletionUsage3.equals(runCompletionUsage4));
        System.assert(runCompletionUsage4.equals(runCompletionUsage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunCompletionUsage runCompletionUsage1 = OASRunCompletionUsage.getExample();
        OASRunCompletionUsage runCompletionUsage2 = new OASRunCompletionUsage();

        System.assertEquals(false, runCompletionUsage1.equals('foo'));
        System.assertEquals(false, runCompletionUsage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunCompletionUsage runCompletionUsage1 = OASRunCompletionUsage.getExample();
        OASRunCompletionUsage runCompletionUsage2 = new OASRunCompletionUsage();
        OASRunCompletionUsage runCompletionUsage3;

        System.assertEquals(false, runCompletionUsage1.equals(runCompletionUsage3));
        System.assertEquals(false, runCompletionUsage2.equals(runCompletionUsage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunCompletionUsage runCompletionUsage1 = OASRunCompletionUsage.getExample();
        OASRunCompletionUsage runCompletionUsage2 = new OASRunCompletionUsage();

        System.assertEquals(runCompletionUsage1.hashCode(), runCompletionUsage1.hashCode());
        System.assertEquals(runCompletionUsage2.hashCode(), runCompletionUsage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunCompletionUsage runCompletionUsage1 = OASRunCompletionUsage.getExample();
        OASRunCompletionUsage runCompletionUsage2 = OASRunCompletionUsage.getExample();
        OASRunCompletionUsage runCompletionUsage3 = new OASRunCompletionUsage();
        OASRunCompletionUsage runCompletionUsage4 = new OASRunCompletionUsage();

        System.assert(runCompletionUsage1.equals(runCompletionUsage2));
        System.assert(runCompletionUsage3.equals(runCompletionUsage4));
        System.assertEquals(runCompletionUsage1.hashCode(), runCompletionUsage2.hashCode());
        System.assertEquals(runCompletionUsage3.hashCode(), runCompletionUsage4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunCompletionUsage runCompletionUsage = new OASRunCompletionUsage();
        Map<String, String> x-property-mappings = runCompletionUsage.getx-property-mappings();
        System.assertEquals('completionTokens', x-property-mappings.get('completion_tokens'));
        System.assertEquals('promptTokens', x-property-mappings.get('prompt_tokens'));
        System.assertEquals('totalTokens', x-property-mappings.get('total_tokens'));
    }
}
