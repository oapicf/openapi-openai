@isTest
private class OASVectorStoreFileBatchObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject1 = OASVectorStoreFileBatchObject.getExample();
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject2 = vectorStoreFileBatchObject1;
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject3 = new OASVectorStoreFileBatchObject();
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject4 = vectorStoreFileBatchObject3;

        System.assert(vectorStoreFileBatchObject1.equals(vectorStoreFileBatchObject2));
        System.assert(vectorStoreFileBatchObject2.equals(vectorStoreFileBatchObject1));
        System.assert(vectorStoreFileBatchObject1.equals(vectorStoreFileBatchObject1));
        System.assert(vectorStoreFileBatchObject3.equals(vectorStoreFileBatchObject4));
        System.assert(vectorStoreFileBatchObject4.equals(vectorStoreFileBatchObject3));
        System.assert(vectorStoreFileBatchObject3.equals(vectorStoreFileBatchObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject1 = OASVectorStoreFileBatchObject.getExample();
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject2 = OASVectorStoreFileBatchObject.getExample();
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject3 = new OASVectorStoreFileBatchObject();
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject4 = new OASVectorStoreFileBatchObject();

        System.assert(vectorStoreFileBatchObject1.equals(vectorStoreFileBatchObject2));
        System.assert(vectorStoreFileBatchObject2.equals(vectorStoreFileBatchObject1));
        System.assert(vectorStoreFileBatchObject3.equals(vectorStoreFileBatchObject4));
        System.assert(vectorStoreFileBatchObject4.equals(vectorStoreFileBatchObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject1 = OASVectorStoreFileBatchObject.getExample();
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject2 = new OASVectorStoreFileBatchObject();

        System.assertEquals(false, vectorStoreFileBatchObject1.equals('foo'));
        System.assertEquals(false, vectorStoreFileBatchObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject1 = OASVectorStoreFileBatchObject.getExample();
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject2 = new OASVectorStoreFileBatchObject();
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject3;

        System.assertEquals(false, vectorStoreFileBatchObject1.equals(vectorStoreFileBatchObject3));
        System.assertEquals(false, vectorStoreFileBatchObject2.equals(vectorStoreFileBatchObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject1 = OASVectorStoreFileBatchObject.getExample();
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject2 = new OASVectorStoreFileBatchObject();

        System.assertEquals(vectorStoreFileBatchObject1.hashCode(), vectorStoreFileBatchObject1.hashCode());
        System.assertEquals(vectorStoreFileBatchObject2.hashCode(), vectorStoreFileBatchObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject1 = OASVectorStoreFileBatchObject.getExample();
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject2 = OASVectorStoreFileBatchObject.getExample();
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject3 = new OASVectorStoreFileBatchObject();
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject4 = new OASVectorStoreFileBatchObject();

        System.assert(vectorStoreFileBatchObject1.equals(vectorStoreFileBatchObject2));
        System.assert(vectorStoreFileBatchObject3.equals(vectorStoreFileBatchObject4));
        System.assertEquals(vectorStoreFileBatchObject1.hashCode(), vectorStoreFileBatchObject2.hashCode());
        System.assertEquals(vectorStoreFileBatchObject3.hashCode(), vectorStoreFileBatchObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVectorStoreFileBatchObject vectorStoreFileBatchObject = new OASVectorStoreFileBatchObject();
        Map<String, String> x-property-mappings = vectorStoreFileBatchObject.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('vectorStoreId', x-property-mappings.get('vector_store_id'));
        System.assertEquals('fileCounts', x-property-mappings.get('file_counts'));
    }
}
