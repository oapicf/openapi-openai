@isTest
private class OASAssistantObjectToolResourcesTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantObjectToolResources assistantObjectToolResources1 = OASAssistantObjectToolResources.getExample();
        OASAssistantObjectToolResources assistantObjectToolResources2 = assistantObjectToolResources1;
        OASAssistantObjectToolResources assistantObjectToolResources3 = new OASAssistantObjectToolResources();
        OASAssistantObjectToolResources assistantObjectToolResources4 = assistantObjectToolResources3;

        System.assert(assistantObjectToolResources1.equals(assistantObjectToolResources2));
        System.assert(assistantObjectToolResources2.equals(assistantObjectToolResources1));
        System.assert(assistantObjectToolResources1.equals(assistantObjectToolResources1));
        System.assert(assistantObjectToolResources3.equals(assistantObjectToolResources4));
        System.assert(assistantObjectToolResources4.equals(assistantObjectToolResources3));
        System.assert(assistantObjectToolResources3.equals(assistantObjectToolResources3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantObjectToolResources assistantObjectToolResources1 = OASAssistantObjectToolResources.getExample();
        OASAssistantObjectToolResources assistantObjectToolResources2 = OASAssistantObjectToolResources.getExample();
        OASAssistantObjectToolResources assistantObjectToolResources3 = new OASAssistantObjectToolResources();
        OASAssistantObjectToolResources assistantObjectToolResources4 = new OASAssistantObjectToolResources();

        System.assert(assistantObjectToolResources1.equals(assistantObjectToolResources2));
        System.assert(assistantObjectToolResources2.equals(assistantObjectToolResources1));
        System.assert(assistantObjectToolResources3.equals(assistantObjectToolResources4));
        System.assert(assistantObjectToolResources4.equals(assistantObjectToolResources3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantObjectToolResources assistantObjectToolResources1 = OASAssistantObjectToolResources.getExample();
        OASAssistantObjectToolResources assistantObjectToolResources2 = new OASAssistantObjectToolResources();

        System.assertEquals(false, assistantObjectToolResources1.equals('foo'));
        System.assertEquals(false, assistantObjectToolResources2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantObjectToolResources assistantObjectToolResources1 = OASAssistantObjectToolResources.getExample();
        OASAssistantObjectToolResources assistantObjectToolResources2 = new OASAssistantObjectToolResources();
        OASAssistantObjectToolResources assistantObjectToolResources3;

        System.assertEquals(false, assistantObjectToolResources1.equals(assistantObjectToolResources3));
        System.assertEquals(false, assistantObjectToolResources2.equals(assistantObjectToolResources3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantObjectToolResources assistantObjectToolResources1 = OASAssistantObjectToolResources.getExample();
        OASAssistantObjectToolResources assistantObjectToolResources2 = new OASAssistantObjectToolResources();

        System.assertEquals(assistantObjectToolResources1.hashCode(), assistantObjectToolResources1.hashCode());
        System.assertEquals(assistantObjectToolResources2.hashCode(), assistantObjectToolResources2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantObjectToolResources assistantObjectToolResources1 = OASAssistantObjectToolResources.getExample();
        OASAssistantObjectToolResources assistantObjectToolResources2 = OASAssistantObjectToolResources.getExample();
        OASAssistantObjectToolResources assistantObjectToolResources3 = new OASAssistantObjectToolResources();
        OASAssistantObjectToolResources assistantObjectToolResources4 = new OASAssistantObjectToolResources();

        System.assert(assistantObjectToolResources1.equals(assistantObjectToolResources2));
        System.assert(assistantObjectToolResources3.equals(assistantObjectToolResources4));
        System.assertEquals(assistantObjectToolResources1.hashCode(), assistantObjectToolResources2.hashCode());
        System.assertEquals(assistantObjectToolResources3.hashCode(), assistantObjectToolResources4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAssistantObjectToolResources assistantObjectToolResources = new OASAssistantObjectToolResources();
        Map<String, String> x-property-mappings = assistantObjectToolResources.getx-property-mappings();
        System.assertEquals('codeInterpreter', x-property-mappings.get('code_interpreter'));
        System.assertEquals('fileSearch', x-property-mappings.get('file_search'));
    }
}
