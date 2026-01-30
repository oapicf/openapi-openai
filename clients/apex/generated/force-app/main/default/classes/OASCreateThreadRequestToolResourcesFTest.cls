@isTest
private class OASCreateThreadRequestToolResourcesFTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch1 = OASCreateThreadRequestToolResourcesF.getExample();
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch2 = createThreadRequestToolResourcesFileSearch1;
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch3 = new OASCreateThreadRequestToolResourcesF();
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch4 = createThreadRequestToolResourcesFileSearch3;

        System.assert(createThreadRequestToolResourcesFileSearch1.equals(createThreadRequestToolResourcesFileSearch2));
        System.assert(createThreadRequestToolResourcesFileSearch2.equals(createThreadRequestToolResourcesFileSearch1));
        System.assert(createThreadRequestToolResourcesFileSearch1.equals(createThreadRequestToolResourcesFileSearch1));
        System.assert(createThreadRequestToolResourcesFileSearch3.equals(createThreadRequestToolResourcesFileSearch4));
        System.assert(createThreadRequestToolResourcesFileSearch4.equals(createThreadRequestToolResourcesFileSearch3));
        System.assert(createThreadRequestToolResourcesFileSearch3.equals(createThreadRequestToolResourcesFileSearch3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch1 = OASCreateThreadRequestToolResourcesF.getExample();
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch2 = OASCreateThreadRequestToolResourcesF.getExample();
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch3 = new OASCreateThreadRequestToolResourcesF();
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch4 = new OASCreateThreadRequestToolResourcesF();

        System.assert(createThreadRequestToolResourcesFileSearch1.equals(createThreadRequestToolResourcesFileSearch2));
        System.assert(createThreadRequestToolResourcesFileSearch2.equals(createThreadRequestToolResourcesFileSearch1));
        System.assert(createThreadRequestToolResourcesFileSearch3.equals(createThreadRequestToolResourcesFileSearch4));
        System.assert(createThreadRequestToolResourcesFileSearch4.equals(createThreadRequestToolResourcesFileSearch3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch1 = OASCreateThreadRequestToolResourcesF.getExample();
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch2 = new OASCreateThreadRequestToolResourcesF();

        System.assertEquals(false, createThreadRequestToolResourcesFileSearch1.equals('foo'));
        System.assertEquals(false, createThreadRequestToolResourcesFileSearch2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch1 = OASCreateThreadRequestToolResourcesF.getExample();
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch2 = new OASCreateThreadRequestToolResourcesF();
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch3;

        System.assertEquals(false, createThreadRequestToolResourcesFileSearch1.equals(createThreadRequestToolResourcesFileSearch3));
        System.assertEquals(false, createThreadRequestToolResourcesFileSearch2.equals(createThreadRequestToolResourcesFileSearch3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch1 = OASCreateThreadRequestToolResourcesF.getExample();
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch2 = new OASCreateThreadRequestToolResourcesF();

        System.assertEquals(createThreadRequestToolResourcesFileSearch1.hashCode(), createThreadRequestToolResourcesFileSearch1.hashCode());
        System.assertEquals(createThreadRequestToolResourcesFileSearch2.hashCode(), createThreadRequestToolResourcesFileSearch2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch1 = OASCreateThreadRequestToolResourcesF.getExample();
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch2 = OASCreateThreadRequestToolResourcesF.getExample();
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch3 = new OASCreateThreadRequestToolResourcesF();
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch4 = new OASCreateThreadRequestToolResourcesF();

        System.assert(createThreadRequestToolResourcesFileSearch1.equals(createThreadRequestToolResourcesFileSearch2));
        System.assert(createThreadRequestToolResourcesFileSearch3.equals(createThreadRequestToolResourcesFileSearch4));
        System.assertEquals(createThreadRequestToolResourcesFileSearch1.hashCode(), createThreadRequestToolResourcesFileSearch2.hashCode());
        System.assertEquals(createThreadRequestToolResourcesFileSearch3.hashCode(), createThreadRequestToolResourcesFileSearch4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch = new OASCreateThreadRequestToolResourcesF();
        Map<String, String> x-property-mappings = createThreadRequestToolResourcesFileSearch.getx-property-mappings();
        System.assertEquals('vectorStoreIds', x-property-mappings.get('vector_store_ids'));
        System.assertEquals('vectorStores', x-property-mappings.get('vector_stores'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateThreadRequestToolResourcesF createThreadRequestToolResourcesFileSearch = new OASCreateThreadRequestToolResourcesF();
        System.assertEquals(new List<String>(), createThreadRequestToolResourcesFileSearch.vectorStoreIds);
        System.assertEquals(new List<OASCreateThreadRequestToolResourcesF>(), createThreadRequestToolResourcesFileSearch.vectorStores);
    }
}
