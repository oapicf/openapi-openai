@isTest
private class OASModifyThreadRequestToolResourcesTest {
    @isTest
    private static void equalsSameInstance() {
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources1 = OASModifyThreadRequestToolResources.getExample();
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources2 = modifyThreadRequestToolResources1;
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources3 = new OASModifyThreadRequestToolResources();
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources4 = modifyThreadRequestToolResources3;

        System.assert(modifyThreadRequestToolResources1.equals(modifyThreadRequestToolResources2));
        System.assert(modifyThreadRequestToolResources2.equals(modifyThreadRequestToolResources1));
        System.assert(modifyThreadRequestToolResources1.equals(modifyThreadRequestToolResources1));
        System.assert(modifyThreadRequestToolResources3.equals(modifyThreadRequestToolResources4));
        System.assert(modifyThreadRequestToolResources4.equals(modifyThreadRequestToolResources3));
        System.assert(modifyThreadRequestToolResources3.equals(modifyThreadRequestToolResources3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources1 = OASModifyThreadRequestToolResources.getExample();
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources2 = OASModifyThreadRequestToolResources.getExample();
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources3 = new OASModifyThreadRequestToolResources();
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources4 = new OASModifyThreadRequestToolResources();

        System.assert(modifyThreadRequestToolResources1.equals(modifyThreadRequestToolResources2));
        System.assert(modifyThreadRequestToolResources2.equals(modifyThreadRequestToolResources1));
        System.assert(modifyThreadRequestToolResources3.equals(modifyThreadRequestToolResources4));
        System.assert(modifyThreadRequestToolResources4.equals(modifyThreadRequestToolResources3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources1 = OASModifyThreadRequestToolResources.getExample();
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources2 = new OASModifyThreadRequestToolResources();

        System.assertEquals(false, modifyThreadRequestToolResources1.equals('foo'));
        System.assertEquals(false, modifyThreadRequestToolResources2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources1 = OASModifyThreadRequestToolResources.getExample();
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources2 = new OASModifyThreadRequestToolResources();
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources3;

        System.assertEquals(false, modifyThreadRequestToolResources1.equals(modifyThreadRequestToolResources3));
        System.assertEquals(false, modifyThreadRequestToolResources2.equals(modifyThreadRequestToolResources3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources1 = OASModifyThreadRequestToolResources.getExample();
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources2 = new OASModifyThreadRequestToolResources();

        System.assertEquals(modifyThreadRequestToolResources1.hashCode(), modifyThreadRequestToolResources1.hashCode());
        System.assertEquals(modifyThreadRequestToolResources2.hashCode(), modifyThreadRequestToolResources2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources1 = OASModifyThreadRequestToolResources.getExample();
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources2 = OASModifyThreadRequestToolResources.getExample();
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources3 = new OASModifyThreadRequestToolResources();
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources4 = new OASModifyThreadRequestToolResources();

        System.assert(modifyThreadRequestToolResources1.equals(modifyThreadRequestToolResources2));
        System.assert(modifyThreadRequestToolResources3.equals(modifyThreadRequestToolResources4));
        System.assertEquals(modifyThreadRequestToolResources1.hashCode(), modifyThreadRequestToolResources2.hashCode());
        System.assertEquals(modifyThreadRequestToolResources3.hashCode(), modifyThreadRequestToolResources4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASModifyThreadRequestToolResources modifyThreadRequestToolResources = new OASModifyThreadRequestToolResources();
        Map<String, String> x-property-mappings = modifyThreadRequestToolResources.getx-property-mappings();
        System.assertEquals('codeInterpreter', x-property-mappings.get('code_interpreter'));
        System.assertEquals('fileSearch', x-property-mappings.get('file_search'));
    }
}
