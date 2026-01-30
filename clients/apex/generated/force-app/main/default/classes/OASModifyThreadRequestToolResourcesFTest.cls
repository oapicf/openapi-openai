@isTest
private class OASModifyThreadRequestToolResourcesFTest {
    @isTest
    private static void equalsSameInstance() {
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch1 = OASModifyThreadRequestToolResourcesF.getExample();
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch2 = modifyThreadRequestToolResourcesFileSearch1;
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch3 = new OASModifyThreadRequestToolResourcesF();
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch4 = modifyThreadRequestToolResourcesFileSearch3;

        System.assert(modifyThreadRequestToolResourcesFileSearch1.equals(modifyThreadRequestToolResourcesFileSearch2));
        System.assert(modifyThreadRequestToolResourcesFileSearch2.equals(modifyThreadRequestToolResourcesFileSearch1));
        System.assert(modifyThreadRequestToolResourcesFileSearch1.equals(modifyThreadRequestToolResourcesFileSearch1));
        System.assert(modifyThreadRequestToolResourcesFileSearch3.equals(modifyThreadRequestToolResourcesFileSearch4));
        System.assert(modifyThreadRequestToolResourcesFileSearch4.equals(modifyThreadRequestToolResourcesFileSearch3));
        System.assert(modifyThreadRequestToolResourcesFileSearch3.equals(modifyThreadRequestToolResourcesFileSearch3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch1 = OASModifyThreadRequestToolResourcesF.getExample();
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch2 = OASModifyThreadRequestToolResourcesF.getExample();
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch3 = new OASModifyThreadRequestToolResourcesF();
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch4 = new OASModifyThreadRequestToolResourcesF();

        System.assert(modifyThreadRequestToolResourcesFileSearch1.equals(modifyThreadRequestToolResourcesFileSearch2));
        System.assert(modifyThreadRequestToolResourcesFileSearch2.equals(modifyThreadRequestToolResourcesFileSearch1));
        System.assert(modifyThreadRequestToolResourcesFileSearch3.equals(modifyThreadRequestToolResourcesFileSearch4));
        System.assert(modifyThreadRequestToolResourcesFileSearch4.equals(modifyThreadRequestToolResourcesFileSearch3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch1 = OASModifyThreadRequestToolResourcesF.getExample();
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch2 = new OASModifyThreadRequestToolResourcesF();

        System.assertEquals(false, modifyThreadRequestToolResourcesFileSearch1.equals('foo'));
        System.assertEquals(false, modifyThreadRequestToolResourcesFileSearch2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch1 = OASModifyThreadRequestToolResourcesF.getExample();
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch2 = new OASModifyThreadRequestToolResourcesF();
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch3;

        System.assertEquals(false, modifyThreadRequestToolResourcesFileSearch1.equals(modifyThreadRequestToolResourcesFileSearch3));
        System.assertEquals(false, modifyThreadRequestToolResourcesFileSearch2.equals(modifyThreadRequestToolResourcesFileSearch3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch1 = OASModifyThreadRequestToolResourcesF.getExample();
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch2 = new OASModifyThreadRequestToolResourcesF();

        System.assertEquals(modifyThreadRequestToolResourcesFileSearch1.hashCode(), modifyThreadRequestToolResourcesFileSearch1.hashCode());
        System.assertEquals(modifyThreadRequestToolResourcesFileSearch2.hashCode(), modifyThreadRequestToolResourcesFileSearch2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch1 = OASModifyThreadRequestToolResourcesF.getExample();
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch2 = OASModifyThreadRequestToolResourcesF.getExample();
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch3 = new OASModifyThreadRequestToolResourcesF();
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch4 = new OASModifyThreadRequestToolResourcesF();

        System.assert(modifyThreadRequestToolResourcesFileSearch1.equals(modifyThreadRequestToolResourcesFileSearch2));
        System.assert(modifyThreadRequestToolResourcesFileSearch3.equals(modifyThreadRequestToolResourcesFileSearch4));
        System.assertEquals(modifyThreadRequestToolResourcesFileSearch1.hashCode(), modifyThreadRequestToolResourcesFileSearch2.hashCode());
        System.assertEquals(modifyThreadRequestToolResourcesFileSearch3.hashCode(), modifyThreadRequestToolResourcesFileSearch4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch = new OASModifyThreadRequestToolResourcesF();
        Map<String, String> x-property-mappings = modifyThreadRequestToolResourcesFileSearch.getx-property-mappings();
        System.assertEquals('vectorStoreIds', x-property-mappings.get('vector_store_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASModifyThreadRequestToolResourcesF modifyThreadRequestToolResourcesFileSearch = new OASModifyThreadRequestToolResourcesF();
        System.assertEquals(new List<String>(), modifyThreadRequestToolResourcesFileSearch.vectorStoreIds);
    }
}
