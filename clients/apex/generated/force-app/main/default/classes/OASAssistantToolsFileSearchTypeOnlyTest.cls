@isTest
private class OASAssistantToolsFileSearchTypeOnlyTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly1 = OASAssistantToolsFileSearchTypeOnly.getExample();
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly2 = assistantToolsFileSearchTypeOnly1;
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly3 = new OASAssistantToolsFileSearchTypeOnly();
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly4 = assistantToolsFileSearchTypeOnly3;

        System.assert(assistantToolsFileSearchTypeOnly1.equals(assistantToolsFileSearchTypeOnly2));
        System.assert(assistantToolsFileSearchTypeOnly2.equals(assistantToolsFileSearchTypeOnly1));
        System.assert(assistantToolsFileSearchTypeOnly1.equals(assistantToolsFileSearchTypeOnly1));
        System.assert(assistantToolsFileSearchTypeOnly3.equals(assistantToolsFileSearchTypeOnly4));
        System.assert(assistantToolsFileSearchTypeOnly4.equals(assistantToolsFileSearchTypeOnly3));
        System.assert(assistantToolsFileSearchTypeOnly3.equals(assistantToolsFileSearchTypeOnly3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly1 = OASAssistantToolsFileSearchTypeOnly.getExample();
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly2 = OASAssistantToolsFileSearchTypeOnly.getExample();
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly3 = new OASAssistantToolsFileSearchTypeOnly();
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly4 = new OASAssistantToolsFileSearchTypeOnly();

        System.assert(assistantToolsFileSearchTypeOnly1.equals(assistantToolsFileSearchTypeOnly2));
        System.assert(assistantToolsFileSearchTypeOnly2.equals(assistantToolsFileSearchTypeOnly1));
        System.assert(assistantToolsFileSearchTypeOnly3.equals(assistantToolsFileSearchTypeOnly4));
        System.assert(assistantToolsFileSearchTypeOnly4.equals(assistantToolsFileSearchTypeOnly3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly1 = OASAssistantToolsFileSearchTypeOnly.getExample();
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly2 = new OASAssistantToolsFileSearchTypeOnly();

        System.assertEquals(false, assistantToolsFileSearchTypeOnly1.equals('foo'));
        System.assertEquals(false, assistantToolsFileSearchTypeOnly2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly1 = OASAssistantToolsFileSearchTypeOnly.getExample();
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly2 = new OASAssistantToolsFileSearchTypeOnly();
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly3;

        System.assertEquals(false, assistantToolsFileSearchTypeOnly1.equals(assistantToolsFileSearchTypeOnly3));
        System.assertEquals(false, assistantToolsFileSearchTypeOnly2.equals(assistantToolsFileSearchTypeOnly3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly1 = OASAssistantToolsFileSearchTypeOnly.getExample();
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly2 = new OASAssistantToolsFileSearchTypeOnly();

        System.assertEquals(assistantToolsFileSearchTypeOnly1.hashCode(), assistantToolsFileSearchTypeOnly1.hashCode());
        System.assertEquals(assistantToolsFileSearchTypeOnly2.hashCode(), assistantToolsFileSearchTypeOnly2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly1 = OASAssistantToolsFileSearchTypeOnly.getExample();
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly2 = OASAssistantToolsFileSearchTypeOnly.getExample();
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly3 = new OASAssistantToolsFileSearchTypeOnly();
        OASAssistantToolsFileSearchTypeOnly assistantToolsFileSearchTypeOnly4 = new OASAssistantToolsFileSearchTypeOnly();

        System.assert(assistantToolsFileSearchTypeOnly1.equals(assistantToolsFileSearchTypeOnly2));
        System.assert(assistantToolsFileSearchTypeOnly3.equals(assistantToolsFileSearchTypeOnly4));
        System.assertEquals(assistantToolsFileSearchTypeOnly1.hashCode(), assistantToolsFileSearchTypeOnly2.hashCode());
        System.assertEquals(assistantToolsFileSearchTypeOnly3.hashCode(), assistantToolsFileSearchTypeOnly4.hashCode());
    }
}
