@isTest
private class OASAssistantsNamedToolChoiceFunctionTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction1 = OASAssistantsNamedToolChoiceFunction.getExample();
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction2 = assistantsNamedToolChoiceFunction1;
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction3 = new OASAssistantsNamedToolChoiceFunction();
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction4 = assistantsNamedToolChoiceFunction3;

        System.assert(assistantsNamedToolChoiceFunction1.equals(assistantsNamedToolChoiceFunction2));
        System.assert(assistantsNamedToolChoiceFunction2.equals(assistantsNamedToolChoiceFunction1));
        System.assert(assistantsNamedToolChoiceFunction1.equals(assistantsNamedToolChoiceFunction1));
        System.assert(assistantsNamedToolChoiceFunction3.equals(assistantsNamedToolChoiceFunction4));
        System.assert(assistantsNamedToolChoiceFunction4.equals(assistantsNamedToolChoiceFunction3));
        System.assert(assistantsNamedToolChoiceFunction3.equals(assistantsNamedToolChoiceFunction3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction1 = OASAssistantsNamedToolChoiceFunction.getExample();
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction2 = OASAssistantsNamedToolChoiceFunction.getExample();
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction3 = new OASAssistantsNamedToolChoiceFunction();
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction4 = new OASAssistantsNamedToolChoiceFunction();

        System.assert(assistantsNamedToolChoiceFunction1.equals(assistantsNamedToolChoiceFunction2));
        System.assert(assistantsNamedToolChoiceFunction2.equals(assistantsNamedToolChoiceFunction1));
        System.assert(assistantsNamedToolChoiceFunction3.equals(assistantsNamedToolChoiceFunction4));
        System.assert(assistantsNamedToolChoiceFunction4.equals(assistantsNamedToolChoiceFunction3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction1 = OASAssistantsNamedToolChoiceFunction.getExample();
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction2 = new OASAssistantsNamedToolChoiceFunction();

        System.assertEquals(false, assistantsNamedToolChoiceFunction1.equals('foo'));
        System.assertEquals(false, assistantsNamedToolChoiceFunction2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction1 = OASAssistantsNamedToolChoiceFunction.getExample();
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction2 = new OASAssistantsNamedToolChoiceFunction();
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction3;

        System.assertEquals(false, assistantsNamedToolChoiceFunction1.equals(assistantsNamedToolChoiceFunction3));
        System.assertEquals(false, assistantsNamedToolChoiceFunction2.equals(assistantsNamedToolChoiceFunction3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction1 = OASAssistantsNamedToolChoiceFunction.getExample();
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction2 = new OASAssistantsNamedToolChoiceFunction();

        System.assertEquals(assistantsNamedToolChoiceFunction1.hashCode(), assistantsNamedToolChoiceFunction1.hashCode());
        System.assertEquals(assistantsNamedToolChoiceFunction2.hashCode(), assistantsNamedToolChoiceFunction2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction1 = OASAssistantsNamedToolChoiceFunction.getExample();
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction2 = OASAssistantsNamedToolChoiceFunction.getExample();
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction3 = new OASAssistantsNamedToolChoiceFunction();
        OASAssistantsNamedToolChoiceFunction assistantsNamedToolChoiceFunction4 = new OASAssistantsNamedToolChoiceFunction();

        System.assert(assistantsNamedToolChoiceFunction1.equals(assistantsNamedToolChoiceFunction2));
        System.assert(assistantsNamedToolChoiceFunction3.equals(assistantsNamedToolChoiceFunction4));
        System.assertEquals(assistantsNamedToolChoiceFunction1.hashCode(), assistantsNamedToolChoiceFunction2.hashCode());
        System.assertEquals(assistantsNamedToolChoiceFunction3.hashCode(), assistantsNamedToolChoiceFunction4.hashCode());
    }
}
