@isTest
private class OASAssistantObjectToolsInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantObjectToolsInner assistantObjectToolsInner1 = OASAssistantObjectToolsInner.getExample();
        OASAssistantObjectToolsInner assistantObjectToolsInner2 = assistantObjectToolsInner1;
        OASAssistantObjectToolsInner assistantObjectToolsInner3 = new OASAssistantObjectToolsInner();
        OASAssistantObjectToolsInner assistantObjectToolsInner4 = assistantObjectToolsInner3;

        System.assert(assistantObjectToolsInner1.equals(assistantObjectToolsInner2));
        System.assert(assistantObjectToolsInner2.equals(assistantObjectToolsInner1));
        System.assert(assistantObjectToolsInner1.equals(assistantObjectToolsInner1));
        System.assert(assistantObjectToolsInner3.equals(assistantObjectToolsInner4));
        System.assert(assistantObjectToolsInner4.equals(assistantObjectToolsInner3));
        System.assert(assistantObjectToolsInner3.equals(assistantObjectToolsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantObjectToolsInner assistantObjectToolsInner1 = OASAssistantObjectToolsInner.getExample();
        OASAssistantObjectToolsInner assistantObjectToolsInner2 = OASAssistantObjectToolsInner.getExample();
        OASAssistantObjectToolsInner assistantObjectToolsInner3 = new OASAssistantObjectToolsInner();
        OASAssistantObjectToolsInner assistantObjectToolsInner4 = new OASAssistantObjectToolsInner();

        System.assert(assistantObjectToolsInner1.equals(assistantObjectToolsInner2));
        System.assert(assistantObjectToolsInner2.equals(assistantObjectToolsInner1));
        System.assert(assistantObjectToolsInner3.equals(assistantObjectToolsInner4));
        System.assert(assistantObjectToolsInner4.equals(assistantObjectToolsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantObjectToolsInner assistantObjectToolsInner1 = OASAssistantObjectToolsInner.getExample();
        OASAssistantObjectToolsInner assistantObjectToolsInner2 = new OASAssistantObjectToolsInner();

        System.assertEquals(false, assistantObjectToolsInner1.equals('foo'));
        System.assertEquals(false, assistantObjectToolsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantObjectToolsInner assistantObjectToolsInner1 = OASAssistantObjectToolsInner.getExample();
        OASAssistantObjectToolsInner assistantObjectToolsInner2 = new OASAssistantObjectToolsInner();
        OASAssistantObjectToolsInner assistantObjectToolsInner3;

        System.assertEquals(false, assistantObjectToolsInner1.equals(assistantObjectToolsInner3));
        System.assertEquals(false, assistantObjectToolsInner2.equals(assistantObjectToolsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantObjectToolsInner assistantObjectToolsInner1 = OASAssistantObjectToolsInner.getExample();
        OASAssistantObjectToolsInner assistantObjectToolsInner2 = new OASAssistantObjectToolsInner();

        System.assertEquals(assistantObjectToolsInner1.hashCode(), assistantObjectToolsInner1.hashCode());
        System.assertEquals(assistantObjectToolsInner2.hashCode(), assistantObjectToolsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantObjectToolsInner assistantObjectToolsInner1 = OASAssistantObjectToolsInner.getExample();
        OASAssistantObjectToolsInner assistantObjectToolsInner2 = OASAssistantObjectToolsInner.getExample();
        OASAssistantObjectToolsInner assistantObjectToolsInner3 = new OASAssistantObjectToolsInner();
        OASAssistantObjectToolsInner assistantObjectToolsInner4 = new OASAssistantObjectToolsInner();

        System.assert(assistantObjectToolsInner1.equals(assistantObjectToolsInner2));
        System.assert(assistantObjectToolsInner3.equals(assistantObjectToolsInner4));
        System.assertEquals(assistantObjectToolsInner1.hashCode(), assistantObjectToolsInner2.hashCode());
        System.assertEquals(assistantObjectToolsInner3.hashCode(), assistantObjectToolsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAssistantObjectToolsInner assistantObjectToolsInner = new OASAssistantObjectToolsInner();
        Map<String, String> x-property-mappings = assistantObjectToolsInner.getx-property-mappings();
        System.assertEquals('fileSearch', x-property-mappings.get('file_search'));
    }
}
