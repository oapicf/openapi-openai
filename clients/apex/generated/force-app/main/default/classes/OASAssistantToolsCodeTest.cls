@isTest
private class OASAssistantToolsCodeTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantToolsCode assistantToolsCode1 = OASAssistantToolsCode.getExample();
        OASAssistantToolsCode assistantToolsCode2 = assistantToolsCode1;
        OASAssistantToolsCode assistantToolsCode3 = new OASAssistantToolsCode();
        OASAssistantToolsCode assistantToolsCode4 = assistantToolsCode3;

        System.assert(assistantToolsCode1.equals(assistantToolsCode2));
        System.assert(assistantToolsCode2.equals(assistantToolsCode1));
        System.assert(assistantToolsCode1.equals(assistantToolsCode1));
        System.assert(assistantToolsCode3.equals(assistantToolsCode4));
        System.assert(assistantToolsCode4.equals(assistantToolsCode3));
        System.assert(assistantToolsCode3.equals(assistantToolsCode3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantToolsCode assistantToolsCode1 = OASAssistantToolsCode.getExample();
        OASAssistantToolsCode assistantToolsCode2 = OASAssistantToolsCode.getExample();
        OASAssistantToolsCode assistantToolsCode3 = new OASAssistantToolsCode();
        OASAssistantToolsCode assistantToolsCode4 = new OASAssistantToolsCode();

        System.assert(assistantToolsCode1.equals(assistantToolsCode2));
        System.assert(assistantToolsCode2.equals(assistantToolsCode1));
        System.assert(assistantToolsCode3.equals(assistantToolsCode4));
        System.assert(assistantToolsCode4.equals(assistantToolsCode3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantToolsCode assistantToolsCode1 = OASAssistantToolsCode.getExample();
        OASAssistantToolsCode assistantToolsCode2 = new OASAssistantToolsCode();

        System.assertEquals(false, assistantToolsCode1.equals('foo'));
        System.assertEquals(false, assistantToolsCode2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantToolsCode assistantToolsCode1 = OASAssistantToolsCode.getExample();
        OASAssistantToolsCode assistantToolsCode2 = new OASAssistantToolsCode();
        OASAssistantToolsCode assistantToolsCode3;

        System.assertEquals(false, assistantToolsCode1.equals(assistantToolsCode3));
        System.assertEquals(false, assistantToolsCode2.equals(assistantToolsCode3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantToolsCode assistantToolsCode1 = OASAssistantToolsCode.getExample();
        OASAssistantToolsCode assistantToolsCode2 = new OASAssistantToolsCode();

        System.assertEquals(assistantToolsCode1.hashCode(), assistantToolsCode1.hashCode());
        System.assertEquals(assistantToolsCode2.hashCode(), assistantToolsCode2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantToolsCode assistantToolsCode1 = OASAssistantToolsCode.getExample();
        OASAssistantToolsCode assistantToolsCode2 = OASAssistantToolsCode.getExample();
        OASAssistantToolsCode assistantToolsCode3 = new OASAssistantToolsCode();
        OASAssistantToolsCode assistantToolsCode4 = new OASAssistantToolsCode();

        System.assert(assistantToolsCode1.equals(assistantToolsCode2));
        System.assert(assistantToolsCode3.equals(assistantToolsCode4));
        System.assertEquals(assistantToolsCode1.hashCode(), assistantToolsCode2.hashCode());
        System.assertEquals(assistantToolsCode3.hashCode(), assistantToolsCode4.hashCode());
    }
}
