@isTest
private class OASVectorStoreFileObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASVectorStoreFileObject vectorStoreFileObject1 = OASVectorStoreFileObject.getExample();
        OASVectorStoreFileObject vectorStoreFileObject2 = vectorStoreFileObject1;
        OASVectorStoreFileObject vectorStoreFileObject3 = new OASVectorStoreFileObject();
        OASVectorStoreFileObject vectorStoreFileObject4 = vectorStoreFileObject3;

        System.assert(vectorStoreFileObject1.equals(vectorStoreFileObject2));
        System.assert(vectorStoreFileObject2.equals(vectorStoreFileObject1));
        System.assert(vectorStoreFileObject1.equals(vectorStoreFileObject1));
        System.assert(vectorStoreFileObject3.equals(vectorStoreFileObject4));
        System.assert(vectorStoreFileObject4.equals(vectorStoreFileObject3));
        System.assert(vectorStoreFileObject3.equals(vectorStoreFileObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVectorStoreFileObject vectorStoreFileObject1 = OASVectorStoreFileObject.getExample();
        OASVectorStoreFileObject vectorStoreFileObject2 = OASVectorStoreFileObject.getExample();
        OASVectorStoreFileObject vectorStoreFileObject3 = new OASVectorStoreFileObject();
        OASVectorStoreFileObject vectorStoreFileObject4 = new OASVectorStoreFileObject();

        System.assert(vectorStoreFileObject1.equals(vectorStoreFileObject2));
        System.assert(vectorStoreFileObject2.equals(vectorStoreFileObject1));
        System.assert(vectorStoreFileObject3.equals(vectorStoreFileObject4));
        System.assert(vectorStoreFileObject4.equals(vectorStoreFileObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVectorStoreFileObject vectorStoreFileObject1 = OASVectorStoreFileObject.getExample();
        OASVectorStoreFileObject vectorStoreFileObject2 = new OASVectorStoreFileObject();

        System.assertEquals(false, vectorStoreFileObject1.equals('foo'));
        System.assertEquals(false, vectorStoreFileObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVectorStoreFileObject vectorStoreFileObject1 = OASVectorStoreFileObject.getExample();
        OASVectorStoreFileObject vectorStoreFileObject2 = new OASVectorStoreFileObject();
        OASVectorStoreFileObject vectorStoreFileObject3;

        System.assertEquals(false, vectorStoreFileObject1.equals(vectorStoreFileObject3));
        System.assertEquals(false, vectorStoreFileObject2.equals(vectorStoreFileObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVectorStoreFileObject vectorStoreFileObject1 = OASVectorStoreFileObject.getExample();
        OASVectorStoreFileObject vectorStoreFileObject2 = new OASVectorStoreFileObject();

        System.assertEquals(vectorStoreFileObject1.hashCode(), vectorStoreFileObject1.hashCode());
        System.assertEquals(vectorStoreFileObject2.hashCode(), vectorStoreFileObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVectorStoreFileObject vectorStoreFileObject1 = OASVectorStoreFileObject.getExample();
        OASVectorStoreFileObject vectorStoreFileObject2 = OASVectorStoreFileObject.getExample();
        OASVectorStoreFileObject vectorStoreFileObject3 = new OASVectorStoreFileObject();
        OASVectorStoreFileObject vectorStoreFileObject4 = new OASVectorStoreFileObject();

        System.assert(vectorStoreFileObject1.equals(vectorStoreFileObject2));
        System.assert(vectorStoreFileObject3.equals(vectorStoreFileObject4));
        System.assertEquals(vectorStoreFileObject1.hashCode(), vectorStoreFileObject2.hashCode());
        System.assertEquals(vectorStoreFileObject3.hashCode(), vectorStoreFileObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVectorStoreFileObject vectorStoreFileObject = new OASVectorStoreFileObject();
        Map<String, String> x-property-mappings = vectorStoreFileObject.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('usageBytes', x-property-mappings.get('usage_bytes'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('vectorStoreId', x-property-mappings.get('vector_store_id'));
        System.assertEquals('lastError', x-property-mappings.get('last_error'));
        System.assertEquals('chunkingStrategy', x-property-mappings.get('chunking_strategy'));
    }
}
