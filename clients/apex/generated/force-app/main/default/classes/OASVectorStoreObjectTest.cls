@isTest
private class OASVectorStoreObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASVectorStoreObject vectorStoreObject1 = OASVectorStoreObject.getExample();
        OASVectorStoreObject vectorStoreObject2 = vectorStoreObject1;
        OASVectorStoreObject vectorStoreObject3 = new OASVectorStoreObject();
        OASVectorStoreObject vectorStoreObject4 = vectorStoreObject3;

        System.assert(vectorStoreObject1.equals(vectorStoreObject2));
        System.assert(vectorStoreObject2.equals(vectorStoreObject1));
        System.assert(vectorStoreObject1.equals(vectorStoreObject1));
        System.assert(vectorStoreObject3.equals(vectorStoreObject4));
        System.assert(vectorStoreObject4.equals(vectorStoreObject3));
        System.assert(vectorStoreObject3.equals(vectorStoreObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVectorStoreObject vectorStoreObject1 = OASVectorStoreObject.getExample();
        OASVectorStoreObject vectorStoreObject2 = OASVectorStoreObject.getExample();
        OASVectorStoreObject vectorStoreObject3 = new OASVectorStoreObject();
        OASVectorStoreObject vectorStoreObject4 = new OASVectorStoreObject();

        System.assert(vectorStoreObject1.equals(vectorStoreObject2));
        System.assert(vectorStoreObject2.equals(vectorStoreObject1));
        System.assert(vectorStoreObject3.equals(vectorStoreObject4));
        System.assert(vectorStoreObject4.equals(vectorStoreObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVectorStoreObject vectorStoreObject1 = OASVectorStoreObject.getExample();
        OASVectorStoreObject vectorStoreObject2 = new OASVectorStoreObject();

        System.assertEquals(false, vectorStoreObject1.equals('foo'));
        System.assertEquals(false, vectorStoreObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVectorStoreObject vectorStoreObject1 = OASVectorStoreObject.getExample();
        OASVectorStoreObject vectorStoreObject2 = new OASVectorStoreObject();
        OASVectorStoreObject vectorStoreObject3;

        System.assertEquals(false, vectorStoreObject1.equals(vectorStoreObject3));
        System.assertEquals(false, vectorStoreObject2.equals(vectorStoreObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVectorStoreObject vectorStoreObject1 = OASVectorStoreObject.getExample();
        OASVectorStoreObject vectorStoreObject2 = new OASVectorStoreObject();

        System.assertEquals(vectorStoreObject1.hashCode(), vectorStoreObject1.hashCode());
        System.assertEquals(vectorStoreObject2.hashCode(), vectorStoreObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVectorStoreObject vectorStoreObject1 = OASVectorStoreObject.getExample();
        OASVectorStoreObject vectorStoreObject2 = OASVectorStoreObject.getExample();
        OASVectorStoreObject vectorStoreObject3 = new OASVectorStoreObject();
        OASVectorStoreObject vectorStoreObject4 = new OASVectorStoreObject();

        System.assert(vectorStoreObject1.equals(vectorStoreObject2));
        System.assert(vectorStoreObject3.equals(vectorStoreObject4));
        System.assertEquals(vectorStoreObject1.hashCode(), vectorStoreObject2.hashCode());
        System.assertEquals(vectorStoreObject3.hashCode(), vectorStoreObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVectorStoreObject vectorStoreObject = new OASVectorStoreObject();
        Map<String, String> x-property-mappings = vectorStoreObject.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('usageBytes', x-property-mappings.get('usage_bytes'));
        System.assertEquals('fileCounts', x-property-mappings.get('file_counts'));
        System.assertEquals('expiresAfter', x-property-mappings.get('expires_after'));
        System.assertEquals('expiresAt', x-property-mappings.get('expires_at'));
        System.assertEquals('lastActiveAt', x-property-mappings.get('last_active_at'));
    }
}
