@isTest
private class OASThreadObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASThreadObject threadObject1 = OASThreadObject.getExample();
        OASThreadObject threadObject2 = threadObject1;
        OASThreadObject threadObject3 = new OASThreadObject();
        OASThreadObject threadObject4 = threadObject3;

        System.assert(threadObject1.equals(threadObject2));
        System.assert(threadObject2.equals(threadObject1));
        System.assert(threadObject1.equals(threadObject1));
        System.assert(threadObject3.equals(threadObject4));
        System.assert(threadObject4.equals(threadObject3));
        System.assert(threadObject3.equals(threadObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASThreadObject threadObject1 = OASThreadObject.getExample();
        OASThreadObject threadObject2 = OASThreadObject.getExample();
        OASThreadObject threadObject3 = new OASThreadObject();
        OASThreadObject threadObject4 = new OASThreadObject();

        System.assert(threadObject1.equals(threadObject2));
        System.assert(threadObject2.equals(threadObject1));
        System.assert(threadObject3.equals(threadObject4));
        System.assert(threadObject4.equals(threadObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASThreadObject threadObject1 = OASThreadObject.getExample();
        OASThreadObject threadObject2 = new OASThreadObject();

        System.assertEquals(false, threadObject1.equals('foo'));
        System.assertEquals(false, threadObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASThreadObject threadObject1 = OASThreadObject.getExample();
        OASThreadObject threadObject2 = new OASThreadObject();
        OASThreadObject threadObject3;

        System.assertEquals(false, threadObject1.equals(threadObject3));
        System.assertEquals(false, threadObject2.equals(threadObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASThreadObject threadObject1 = OASThreadObject.getExample();
        OASThreadObject threadObject2 = new OASThreadObject();

        System.assertEquals(threadObject1.hashCode(), threadObject1.hashCode());
        System.assertEquals(threadObject2.hashCode(), threadObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASThreadObject threadObject1 = OASThreadObject.getExample();
        OASThreadObject threadObject2 = OASThreadObject.getExample();
        OASThreadObject threadObject3 = new OASThreadObject();
        OASThreadObject threadObject4 = new OASThreadObject();

        System.assert(threadObject1.equals(threadObject2));
        System.assert(threadObject3.equals(threadObject4));
        System.assertEquals(threadObject1.hashCode(), threadObject2.hashCode());
        System.assertEquals(threadObject3.hashCode(), threadObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASThreadObject threadObject = new OASThreadObject();
        Map<String, String> x-property-mappings = threadObject.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('toolResources', x-property-mappings.get('tool_resources'));
    }
}
