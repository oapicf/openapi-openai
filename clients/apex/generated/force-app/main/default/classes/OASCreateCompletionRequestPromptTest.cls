@isTest
private class OASCreateCompletionRequestPromptTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt1 = OASCreateCompletionRequestPrompt.getExample();
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt2 = createCompletionRequestPrompt1;
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt3 = new OASCreateCompletionRequestPrompt();
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt4 = createCompletionRequestPrompt3;

        System.assert(createCompletionRequestPrompt1.equals(createCompletionRequestPrompt2));
        System.assert(createCompletionRequestPrompt2.equals(createCompletionRequestPrompt1));
        System.assert(createCompletionRequestPrompt1.equals(createCompletionRequestPrompt1));
        System.assert(createCompletionRequestPrompt3.equals(createCompletionRequestPrompt4));
        System.assert(createCompletionRequestPrompt4.equals(createCompletionRequestPrompt3));
        System.assert(createCompletionRequestPrompt3.equals(createCompletionRequestPrompt3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt1 = OASCreateCompletionRequestPrompt.getExample();
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt2 = OASCreateCompletionRequestPrompt.getExample();
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt3 = new OASCreateCompletionRequestPrompt();
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt4 = new OASCreateCompletionRequestPrompt();

        System.assert(createCompletionRequestPrompt1.equals(createCompletionRequestPrompt2));
        System.assert(createCompletionRequestPrompt2.equals(createCompletionRequestPrompt1));
        System.assert(createCompletionRequestPrompt3.equals(createCompletionRequestPrompt4));
        System.assert(createCompletionRequestPrompt4.equals(createCompletionRequestPrompt3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt1 = OASCreateCompletionRequestPrompt.getExample();
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt2 = new OASCreateCompletionRequestPrompt();

        System.assertEquals(false, createCompletionRequestPrompt1.equals('foo'));
        System.assertEquals(false, createCompletionRequestPrompt2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt1 = OASCreateCompletionRequestPrompt.getExample();
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt2 = new OASCreateCompletionRequestPrompt();
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt3;

        System.assertEquals(false, createCompletionRequestPrompt1.equals(createCompletionRequestPrompt3));
        System.assertEquals(false, createCompletionRequestPrompt2.equals(createCompletionRequestPrompt3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt1 = OASCreateCompletionRequestPrompt.getExample();
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt2 = new OASCreateCompletionRequestPrompt();

        System.assertEquals(createCompletionRequestPrompt1.hashCode(), createCompletionRequestPrompt1.hashCode());
        System.assertEquals(createCompletionRequestPrompt2.hashCode(), createCompletionRequestPrompt2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt1 = OASCreateCompletionRequestPrompt.getExample();
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt2 = OASCreateCompletionRequestPrompt.getExample();
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt3 = new OASCreateCompletionRequestPrompt();
        OASCreateCompletionRequestPrompt createCompletionRequestPrompt4 = new OASCreateCompletionRequestPrompt();

        System.assert(createCompletionRequestPrompt1.equals(createCompletionRequestPrompt2));
        System.assert(createCompletionRequestPrompt3.equals(createCompletionRequestPrompt4));
        System.assertEquals(createCompletionRequestPrompt1.hashCode(), createCompletionRequestPrompt2.hashCode());
        System.assertEquals(createCompletionRequestPrompt3.hashCode(), createCompletionRequestPrompt4.hashCode());
    }
}
