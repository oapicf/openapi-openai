@isTest
private class OASRunToolCallObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunToolCallObject runToolCallObject1 = OASRunToolCallObject.getExample();
        OASRunToolCallObject runToolCallObject2 = runToolCallObject1;
        OASRunToolCallObject runToolCallObject3 = new OASRunToolCallObject();
        OASRunToolCallObject runToolCallObject4 = runToolCallObject3;

        System.assert(runToolCallObject1.equals(runToolCallObject2));
        System.assert(runToolCallObject2.equals(runToolCallObject1));
        System.assert(runToolCallObject1.equals(runToolCallObject1));
        System.assert(runToolCallObject3.equals(runToolCallObject4));
        System.assert(runToolCallObject4.equals(runToolCallObject3));
        System.assert(runToolCallObject3.equals(runToolCallObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunToolCallObject runToolCallObject1 = OASRunToolCallObject.getExample();
        OASRunToolCallObject runToolCallObject2 = OASRunToolCallObject.getExample();
        OASRunToolCallObject runToolCallObject3 = new OASRunToolCallObject();
        OASRunToolCallObject runToolCallObject4 = new OASRunToolCallObject();

        System.assert(runToolCallObject1.equals(runToolCallObject2));
        System.assert(runToolCallObject2.equals(runToolCallObject1));
        System.assert(runToolCallObject3.equals(runToolCallObject4));
        System.assert(runToolCallObject4.equals(runToolCallObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunToolCallObject runToolCallObject1 = OASRunToolCallObject.getExample();
        OASRunToolCallObject runToolCallObject2 = new OASRunToolCallObject();

        System.assertEquals(false, runToolCallObject1.equals('foo'));
        System.assertEquals(false, runToolCallObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunToolCallObject runToolCallObject1 = OASRunToolCallObject.getExample();
        OASRunToolCallObject runToolCallObject2 = new OASRunToolCallObject();
        OASRunToolCallObject runToolCallObject3;

        System.assertEquals(false, runToolCallObject1.equals(runToolCallObject3));
        System.assertEquals(false, runToolCallObject2.equals(runToolCallObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunToolCallObject runToolCallObject1 = OASRunToolCallObject.getExample();
        OASRunToolCallObject runToolCallObject2 = new OASRunToolCallObject();

        System.assertEquals(runToolCallObject1.hashCode(), runToolCallObject1.hashCode());
        System.assertEquals(runToolCallObject2.hashCode(), runToolCallObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunToolCallObject runToolCallObject1 = OASRunToolCallObject.getExample();
        OASRunToolCallObject runToolCallObject2 = OASRunToolCallObject.getExample();
        OASRunToolCallObject runToolCallObject3 = new OASRunToolCallObject();
        OASRunToolCallObject runToolCallObject4 = new OASRunToolCallObject();

        System.assert(runToolCallObject1.equals(runToolCallObject2));
        System.assert(runToolCallObject3.equals(runToolCallObject4));
        System.assertEquals(runToolCallObject1.hashCode(), runToolCallObject2.hashCode());
        System.assertEquals(runToolCallObject3.hashCode(), runToolCallObject4.hashCode());
    }
}
