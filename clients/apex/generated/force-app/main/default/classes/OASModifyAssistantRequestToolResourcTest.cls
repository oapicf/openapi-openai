@isTest
private class OASModifyAssistantRequestToolResourcTest {
    @isTest
    private static void equalsSameInstance() {
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources1 = OASModifyAssistantRequestToolResourc.getExample();
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources2 = modifyAssistantRequestToolResources1;
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources3 = new OASModifyAssistantRequestToolResourc();
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources4 = modifyAssistantRequestToolResources3;

        System.assert(modifyAssistantRequestToolResources1.equals(modifyAssistantRequestToolResources2));
        System.assert(modifyAssistantRequestToolResources2.equals(modifyAssistantRequestToolResources1));
        System.assert(modifyAssistantRequestToolResources1.equals(modifyAssistantRequestToolResources1));
        System.assert(modifyAssistantRequestToolResources3.equals(modifyAssistantRequestToolResources4));
        System.assert(modifyAssistantRequestToolResources4.equals(modifyAssistantRequestToolResources3));
        System.assert(modifyAssistantRequestToolResources3.equals(modifyAssistantRequestToolResources3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources1 = OASModifyAssistantRequestToolResourc.getExample();
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources2 = OASModifyAssistantRequestToolResourc.getExample();
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources3 = new OASModifyAssistantRequestToolResourc();
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources4 = new OASModifyAssistantRequestToolResourc();

        System.assert(modifyAssistantRequestToolResources1.equals(modifyAssistantRequestToolResources2));
        System.assert(modifyAssistantRequestToolResources2.equals(modifyAssistantRequestToolResources1));
        System.assert(modifyAssistantRequestToolResources3.equals(modifyAssistantRequestToolResources4));
        System.assert(modifyAssistantRequestToolResources4.equals(modifyAssistantRequestToolResources3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources1 = OASModifyAssistantRequestToolResourc.getExample();
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources2 = new OASModifyAssistantRequestToolResourc();

        System.assertEquals(false, modifyAssistantRequestToolResources1.equals('foo'));
        System.assertEquals(false, modifyAssistantRequestToolResources2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources1 = OASModifyAssistantRequestToolResourc.getExample();
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources2 = new OASModifyAssistantRequestToolResourc();
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources3;

        System.assertEquals(false, modifyAssistantRequestToolResources1.equals(modifyAssistantRequestToolResources3));
        System.assertEquals(false, modifyAssistantRequestToolResources2.equals(modifyAssistantRequestToolResources3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources1 = OASModifyAssistantRequestToolResourc.getExample();
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources2 = new OASModifyAssistantRequestToolResourc();

        System.assertEquals(modifyAssistantRequestToolResources1.hashCode(), modifyAssistantRequestToolResources1.hashCode());
        System.assertEquals(modifyAssistantRequestToolResources2.hashCode(), modifyAssistantRequestToolResources2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources1 = OASModifyAssistantRequestToolResourc.getExample();
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources2 = OASModifyAssistantRequestToolResourc.getExample();
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources3 = new OASModifyAssistantRequestToolResourc();
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources4 = new OASModifyAssistantRequestToolResourc();

        System.assert(modifyAssistantRequestToolResources1.equals(modifyAssistantRequestToolResources2));
        System.assert(modifyAssistantRequestToolResources3.equals(modifyAssistantRequestToolResources4));
        System.assertEquals(modifyAssistantRequestToolResources1.hashCode(), modifyAssistantRequestToolResources2.hashCode());
        System.assertEquals(modifyAssistantRequestToolResources3.hashCode(), modifyAssistantRequestToolResources4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASModifyAssistantRequestToolResourc modifyAssistantRequestToolResources = new OASModifyAssistantRequestToolResourc();
        Map<String, String> x-property-mappings = modifyAssistantRequestToolResources.getx-property-mappings();
        System.assertEquals('codeInterpreter', x-property-mappings.get('code_interpreter'));
        System.assertEquals('fileSearch', x-property-mappings.get('file_search'));
    }
}
