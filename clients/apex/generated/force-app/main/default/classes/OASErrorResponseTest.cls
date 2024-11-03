@isTest
private class OASErrorResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASErrorResponse errorResponse1 = OASErrorResponse.getExample();
        OASErrorResponse errorResponse2 = errorResponse1;
        OASErrorResponse errorResponse3 = new OASErrorResponse();
        OASErrorResponse errorResponse4 = errorResponse3;

        System.assert(errorResponse1.equals(errorResponse2));
        System.assert(errorResponse2.equals(errorResponse1));
        System.assert(errorResponse1.equals(errorResponse1));
        System.assert(errorResponse3.equals(errorResponse4));
        System.assert(errorResponse4.equals(errorResponse3));
        System.assert(errorResponse3.equals(errorResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASErrorResponse errorResponse1 = OASErrorResponse.getExample();
        OASErrorResponse errorResponse2 = OASErrorResponse.getExample();
        OASErrorResponse errorResponse3 = new OASErrorResponse();
        OASErrorResponse errorResponse4 = new OASErrorResponse();

        System.assert(errorResponse1.equals(errorResponse2));
        System.assert(errorResponse2.equals(errorResponse1));
        System.assert(errorResponse3.equals(errorResponse4));
        System.assert(errorResponse4.equals(errorResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASErrorResponse errorResponse1 = OASErrorResponse.getExample();
        OASErrorResponse errorResponse2 = new OASErrorResponse();

        System.assertEquals(false, errorResponse1.equals('foo'));
        System.assertEquals(false, errorResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASErrorResponse errorResponse1 = OASErrorResponse.getExample();
        OASErrorResponse errorResponse2 = new OASErrorResponse();
        OASErrorResponse errorResponse3;

        System.assertEquals(false, errorResponse1.equals(errorResponse3));
        System.assertEquals(false, errorResponse2.equals(errorResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASErrorResponse errorResponse1 = OASErrorResponse.getExample();
        OASErrorResponse errorResponse2 = new OASErrorResponse();

        System.assertEquals(errorResponse1.hashCode(), errorResponse1.hashCode());
        System.assertEquals(errorResponse2.hashCode(), errorResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASErrorResponse errorResponse1 = OASErrorResponse.getExample();
        OASErrorResponse errorResponse2 = OASErrorResponse.getExample();
        OASErrorResponse errorResponse3 = new OASErrorResponse();
        OASErrorResponse errorResponse4 = new OASErrorResponse();

        System.assert(errorResponse1.equals(errorResponse2));
        System.assert(errorResponse3.equals(errorResponse4));
        System.assertEquals(errorResponse1.hashCode(), errorResponse2.hashCode());
        System.assertEquals(errorResponse3.hashCode(), errorResponse4.hashCode());
    }
}
