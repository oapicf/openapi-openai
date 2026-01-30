@isTest
private class OASDefaultProjectErrorResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDefaultProjectErrorResponse defaultProjectErrorResponse1 = OASDefaultProjectErrorResponse.getExample();
        OASDefaultProjectErrorResponse defaultProjectErrorResponse2 = defaultProjectErrorResponse1;
        OASDefaultProjectErrorResponse defaultProjectErrorResponse3 = new OASDefaultProjectErrorResponse();
        OASDefaultProjectErrorResponse defaultProjectErrorResponse4 = defaultProjectErrorResponse3;

        System.assert(defaultProjectErrorResponse1.equals(defaultProjectErrorResponse2));
        System.assert(defaultProjectErrorResponse2.equals(defaultProjectErrorResponse1));
        System.assert(defaultProjectErrorResponse1.equals(defaultProjectErrorResponse1));
        System.assert(defaultProjectErrorResponse3.equals(defaultProjectErrorResponse4));
        System.assert(defaultProjectErrorResponse4.equals(defaultProjectErrorResponse3));
        System.assert(defaultProjectErrorResponse3.equals(defaultProjectErrorResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDefaultProjectErrorResponse defaultProjectErrorResponse1 = OASDefaultProjectErrorResponse.getExample();
        OASDefaultProjectErrorResponse defaultProjectErrorResponse2 = OASDefaultProjectErrorResponse.getExample();
        OASDefaultProjectErrorResponse defaultProjectErrorResponse3 = new OASDefaultProjectErrorResponse();
        OASDefaultProjectErrorResponse defaultProjectErrorResponse4 = new OASDefaultProjectErrorResponse();

        System.assert(defaultProjectErrorResponse1.equals(defaultProjectErrorResponse2));
        System.assert(defaultProjectErrorResponse2.equals(defaultProjectErrorResponse1));
        System.assert(defaultProjectErrorResponse3.equals(defaultProjectErrorResponse4));
        System.assert(defaultProjectErrorResponse4.equals(defaultProjectErrorResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDefaultProjectErrorResponse defaultProjectErrorResponse1 = OASDefaultProjectErrorResponse.getExample();
        OASDefaultProjectErrorResponse defaultProjectErrorResponse2 = new OASDefaultProjectErrorResponse();

        System.assertEquals(false, defaultProjectErrorResponse1.equals('foo'));
        System.assertEquals(false, defaultProjectErrorResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDefaultProjectErrorResponse defaultProjectErrorResponse1 = OASDefaultProjectErrorResponse.getExample();
        OASDefaultProjectErrorResponse defaultProjectErrorResponse2 = new OASDefaultProjectErrorResponse();
        OASDefaultProjectErrorResponse defaultProjectErrorResponse3;

        System.assertEquals(false, defaultProjectErrorResponse1.equals(defaultProjectErrorResponse3));
        System.assertEquals(false, defaultProjectErrorResponse2.equals(defaultProjectErrorResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDefaultProjectErrorResponse defaultProjectErrorResponse1 = OASDefaultProjectErrorResponse.getExample();
        OASDefaultProjectErrorResponse defaultProjectErrorResponse2 = new OASDefaultProjectErrorResponse();

        System.assertEquals(defaultProjectErrorResponse1.hashCode(), defaultProjectErrorResponse1.hashCode());
        System.assertEquals(defaultProjectErrorResponse2.hashCode(), defaultProjectErrorResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDefaultProjectErrorResponse defaultProjectErrorResponse1 = OASDefaultProjectErrorResponse.getExample();
        OASDefaultProjectErrorResponse defaultProjectErrorResponse2 = OASDefaultProjectErrorResponse.getExample();
        OASDefaultProjectErrorResponse defaultProjectErrorResponse3 = new OASDefaultProjectErrorResponse();
        OASDefaultProjectErrorResponse defaultProjectErrorResponse4 = new OASDefaultProjectErrorResponse();

        System.assert(defaultProjectErrorResponse1.equals(defaultProjectErrorResponse2));
        System.assert(defaultProjectErrorResponse3.equals(defaultProjectErrorResponse4));
        System.assertEquals(defaultProjectErrorResponse1.hashCode(), defaultProjectErrorResponse2.hashCode());
        System.assertEquals(defaultProjectErrorResponse3.hashCode(), defaultProjectErrorResponse4.hashCode());
    }
}
