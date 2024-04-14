@isTest
private class OASTruncationObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASTruncationObject truncationObject1 = OASTruncationObject.getExample();
        OASTruncationObject truncationObject2 = truncationObject1;
        OASTruncationObject truncationObject3 = new OASTruncationObject();
        OASTruncationObject truncationObject4 = truncationObject3;

        System.assert(truncationObject1.equals(truncationObject2));
        System.assert(truncationObject2.equals(truncationObject1));
        System.assert(truncationObject1.equals(truncationObject1));
        System.assert(truncationObject3.equals(truncationObject4));
        System.assert(truncationObject4.equals(truncationObject3));
        System.assert(truncationObject3.equals(truncationObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTruncationObject truncationObject1 = OASTruncationObject.getExample();
        OASTruncationObject truncationObject2 = OASTruncationObject.getExample();
        OASTruncationObject truncationObject3 = new OASTruncationObject();
        OASTruncationObject truncationObject4 = new OASTruncationObject();

        System.assert(truncationObject1.equals(truncationObject2));
        System.assert(truncationObject2.equals(truncationObject1));
        System.assert(truncationObject3.equals(truncationObject4));
        System.assert(truncationObject4.equals(truncationObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTruncationObject truncationObject1 = OASTruncationObject.getExample();
        OASTruncationObject truncationObject2 = new OASTruncationObject();

        System.assertEquals(false, truncationObject1.equals('foo'));
        System.assertEquals(false, truncationObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTruncationObject truncationObject1 = OASTruncationObject.getExample();
        OASTruncationObject truncationObject2 = new OASTruncationObject();
        OASTruncationObject truncationObject3;

        System.assertEquals(false, truncationObject1.equals(truncationObject3));
        System.assertEquals(false, truncationObject2.equals(truncationObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTruncationObject truncationObject1 = OASTruncationObject.getExample();
        OASTruncationObject truncationObject2 = new OASTruncationObject();

        System.assertEquals(truncationObject1.hashCode(), truncationObject1.hashCode());
        System.assertEquals(truncationObject2.hashCode(), truncationObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTruncationObject truncationObject1 = OASTruncationObject.getExample();
        OASTruncationObject truncationObject2 = OASTruncationObject.getExample();
        OASTruncationObject truncationObject3 = new OASTruncationObject();
        OASTruncationObject truncationObject4 = new OASTruncationObject();

        System.assert(truncationObject1.equals(truncationObject2));
        System.assert(truncationObject3.equals(truncationObject4));
        System.assertEquals(truncationObject1.hashCode(), truncationObject2.hashCode());
        System.assertEquals(truncationObject3.hashCode(), truncationObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTruncationObject truncationObject = new OASTruncationObject();
        Map<String, String> x-property-mappings = truncationObject.getx-property-mappings();
        System.assertEquals('lastMessages', x-property-mappings.get('last_messages'));
    }
}
