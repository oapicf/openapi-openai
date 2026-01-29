@isTest
private class OASRunStepCompletionUsageTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepCompletionUsage runStepCompletionUsage1 = OASRunStepCompletionUsage.getExample();
        OASRunStepCompletionUsage runStepCompletionUsage2 = runStepCompletionUsage1;
        OASRunStepCompletionUsage runStepCompletionUsage3 = new OASRunStepCompletionUsage();
        OASRunStepCompletionUsage runStepCompletionUsage4 = runStepCompletionUsage3;

        System.assert(runStepCompletionUsage1.equals(runStepCompletionUsage2));
        System.assert(runStepCompletionUsage2.equals(runStepCompletionUsage1));
        System.assert(runStepCompletionUsage1.equals(runStepCompletionUsage1));
        System.assert(runStepCompletionUsage3.equals(runStepCompletionUsage4));
        System.assert(runStepCompletionUsage4.equals(runStepCompletionUsage3));
        System.assert(runStepCompletionUsage3.equals(runStepCompletionUsage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepCompletionUsage runStepCompletionUsage1 = OASRunStepCompletionUsage.getExample();
        OASRunStepCompletionUsage runStepCompletionUsage2 = OASRunStepCompletionUsage.getExample();
        OASRunStepCompletionUsage runStepCompletionUsage3 = new OASRunStepCompletionUsage();
        OASRunStepCompletionUsage runStepCompletionUsage4 = new OASRunStepCompletionUsage();

        System.assert(runStepCompletionUsage1.equals(runStepCompletionUsage2));
        System.assert(runStepCompletionUsage2.equals(runStepCompletionUsage1));
        System.assert(runStepCompletionUsage3.equals(runStepCompletionUsage4));
        System.assert(runStepCompletionUsage4.equals(runStepCompletionUsage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepCompletionUsage runStepCompletionUsage1 = OASRunStepCompletionUsage.getExample();
        OASRunStepCompletionUsage runStepCompletionUsage2 = new OASRunStepCompletionUsage();

        System.assertEquals(false, runStepCompletionUsage1.equals('foo'));
        System.assertEquals(false, runStepCompletionUsage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepCompletionUsage runStepCompletionUsage1 = OASRunStepCompletionUsage.getExample();
        OASRunStepCompletionUsage runStepCompletionUsage2 = new OASRunStepCompletionUsage();
        OASRunStepCompletionUsage runStepCompletionUsage3;

        System.assertEquals(false, runStepCompletionUsage1.equals(runStepCompletionUsage3));
        System.assertEquals(false, runStepCompletionUsage2.equals(runStepCompletionUsage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepCompletionUsage runStepCompletionUsage1 = OASRunStepCompletionUsage.getExample();
        OASRunStepCompletionUsage runStepCompletionUsage2 = new OASRunStepCompletionUsage();

        System.assertEquals(runStepCompletionUsage1.hashCode(), runStepCompletionUsage1.hashCode());
        System.assertEquals(runStepCompletionUsage2.hashCode(), runStepCompletionUsage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepCompletionUsage runStepCompletionUsage1 = OASRunStepCompletionUsage.getExample();
        OASRunStepCompletionUsage runStepCompletionUsage2 = OASRunStepCompletionUsage.getExample();
        OASRunStepCompletionUsage runStepCompletionUsage3 = new OASRunStepCompletionUsage();
        OASRunStepCompletionUsage runStepCompletionUsage4 = new OASRunStepCompletionUsage();

        System.assert(runStepCompletionUsage1.equals(runStepCompletionUsage2));
        System.assert(runStepCompletionUsage3.equals(runStepCompletionUsage4));
        System.assertEquals(runStepCompletionUsage1.hashCode(), runStepCompletionUsage2.hashCode());
        System.assertEquals(runStepCompletionUsage3.hashCode(), runStepCompletionUsage4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunStepCompletionUsage runStepCompletionUsage = new OASRunStepCompletionUsage();
        Map<String, String> x-property-mappings = runStepCompletionUsage.getx-property-mappings();
        System.assertEquals('completionTokens', x-property-mappings.get('completion_tokens'));
        System.assertEquals('promptTokens', x-property-mappings.get('prompt_tokens'));
        System.assertEquals('totalTokens', x-property-mappings.get('total_tokens'));
    }
}
