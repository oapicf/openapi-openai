@isTest
private class OASAssistantToolsFunctionTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantToolsFunction assistantToolsFunction1 = OASAssistantToolsFunction.getExample();
        OASAssistantToolsFunction assistantToolsFunction2 = assistantToolsFunction1;
        OASAssistantToolsFunction assistantToolsFunction3 = new OASAssistantToolsFunction();
        OASAssistantToolsFunction assistantToolsFunction4 = assistantToolsFunction3;

        System.assert(assistantToolsFunction1.equals(assistantToolsFunction2));
        System.assert(assistantToolsFunction2.equals(assistantToolsFunction1));
        System.assert(assistantToolsFunction1.equals(assistantToolsFunction1));
        System.assert(assistantToolsFunction3.equals(assistantToolsFunction4));
        System.assert(assistantToolsFunction4.equals(assistantToolsFunction3));
        System.assert(assistantToolsFunction3.equals(assistantToolsFunction3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantToolsFunction assistantToolsFunction1 = OASAssistantToolsFunction.getExample();
        OASAssistantToolsFunction assistantToolsFunction2 = OASAssistantToolsFunction.getExample();
        OASAssistantToolsFunction assistantToolsFunction3 = new OASAssistantToolsFunction();
        OASAssistantToolsFunction assistantToolsFunction4 = new OASAssistantToolsFunction();

        System.assert(assistantToolsFunction1.equals(assistantToolsFunction2));
        System.assert(assistantToolsFunction2.equals(assistantToolsFunction1));
        System.assert(assistantToolsFunction3.equals(assistantToolsFunction4));
        System.assert(assistantToolsFunction4.equals(assistantToolsFunction3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantToolsFunction assistantToolsFunction1 = OASAssistantToolsFunction.getExample();
        OASAssistantToolsFunction assistantToolsFunction2 = new OASAssistantToolsFunction();

        System.assertEquals(false, assistantToolsFunction1.equals('foo'));
        System.assertEquals(false, assistantToolsFunction2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantToolsFunction assistantToolsFunction1 = OASAssistantToolsFunction.getExample();
        OASAssistantToolsFunction assistantToolsFunction2 = new OASAssistantToolsFunction();
        OASAssistantToolsFunction assistantToolsFunction3;

        System.assertEquals(false, assistantToolsFunction1.equals(assistantToolsFunction3));
        System.assertEquals(false, assistantToolsFunction2.equals(assistantToolsFunction3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantToolsFunction assistantToolsFunction1 = OASAssistantToolsFunction.getExample();
        OASAssistantToolsFunction assistantToolsFunction2 = new OASAssistantToolsFunction();

        System.assertEquals(assistantToolsFunction1.hashCode(), assistantToolsFunction1.hashCode());
        System.assertEquals(assistantToolsFunction2.hashCode(), assistantToolsFunction2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantToolsFunction assistantToolsFunction1 = OASAssistantToolsFunction.getExample();
        OASAssistantToolsFunction assistantToolsFunction2 = OASAssistantToolsFunction.getExample();
        OASAssistantToolsFunction assistantToolsFunction3 = new OASAssistantToolsFunction();
        OASAssistantToolsFunction assistantToolsFunction4 = new OASAssistantToolsFunction();

        System.assert(assistantToolsFunction1.equals(assistantToolsFunction2));
        System.assert(assistantToolsFunction3.equals(assistantToolsFunction4));
        System.assertEquals(assistantToolsFunction1.hashCode(), assistantToolsFunction2.hashCode());
        System.assertEquals(assistantToolsFunction3.hashCode(), assistantToolsFunction4.hashCode());
    }
}
