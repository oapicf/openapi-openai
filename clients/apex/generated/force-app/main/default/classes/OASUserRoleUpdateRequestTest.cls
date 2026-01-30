@isTest
private class OASUserRoleUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserRoleUpdateRequest userRoleUpdateRequest1 = OASUserRoleUpdateRequest.getExample();
        OASUserRoleUpdateRequest userRoleUpdateRequest2 = userRoleUpdateRequest1;
        OASUserRoleUpdateRequest userRoleUpdateRequest3 = new OASUserRoleUpdateRequest();
        OASUserRoleUpdateRequest userRoleUpdateRequest4 = userRoleUpdateRequest3;

        System.assert(userRoleUpdateRequest1.equals(userRoleUpdateRequest2));
        System.assert(userRoleUpdateRequest2.equals(userRoleUpdateRequest1));
        System.assert(userRoleUpdateRequest1.equals(userRoleUpdateRequest1));
        System.assert(userRoleUpdateRequest3.equals(userRoleUpdateRequest4));
        System.assert(userRoleUpdateRequest4.equals(userRoleUpdateRequest3));
        System.assert(userRoleUpdateRequest3.equals(userRoleUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserRoleUpdateRequest userRoleUpdateRequest1 = OASUserRoleUpdateRequest.getExample();
        OASUserRoleUpdateRequest userRoleUpdateRequest2 = OASUserRoleUpdateRequest.getExample();
        OASUserRoleUpdateRequest userRoleUpdateRequest3 = new OASUserRoleUpdateRequest();
        OASUserRoleUpdateRequest userRoleUpdateRequest4 = new OASUserRoleUpdateRequest();

        System.assert(userRoleUpdateRequest1.equals(userRoleUpdateRequest2));
        System.assert(userRoleUpdateRequest2.equals(userRoleUpdateRequest1));
        System.assert(userRoleUpdateRequest3.equals(userRoleUpdateRequest4));
        System.assert(userRoleUpdateRequest4.equals(userRoleUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserRoleUpdateRequest userRoleUpdateRequest1 = OASUserRoleUpdateRequest.getExample();
        OASUserRoleUpdateRequest userRoleUpdateRequest2 = new OASUserRoleUpdateRequest();

        System.assertEquals(false, userRoleUpdateRequest1.equals('foo'));
        System.assertEquals(false, userRoleUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserRoleUpdateRequest userRoleUpdateRequest1 = OASUserRoleUpdateRequest.getExample();
        OASUserRoleUpdateRequest userRoleUpdateRequest2 = new OASUserRoleUpdateRequest();
        OASUserRoleUpdateRequest userRoleUpdateRequest3;

        System.assertEquals(false, userRoleUpdateRequest1.equals(userRoleUpdateRequest3));
        System.assertEquals(false, userRoleUpdateRequest2.equals(userRoleUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserRoleUpdateRequest userRoleUpdateRequest1 = OASUserRoleUpdateRequest.getExample();
        OASUserRoleUpdateRequest userRoleUpdateRequest2 = new OASUserRoleUpdateRequest();

        System.assertEquals(userRoleUpdateRequest1.hashCode(), userRoleUpdateRequest1.hashCode());
        System.assertEquals(userRoleUpdateRequest2.hashCode(), userRoleUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserRoleUpdateRequest userRoleUpdateRequest1 = OASUserRoleUpdateRequest.getExample();
        OASUserRoleUpdateRequest userRoleUpdateRequest2 = OASUserRoleUpdateRequest.getExample();
        OASUserRoleUpdateRequest userRoleUpdateRequest3 = new OASUserRoleUpdateRequest();
        OASUserRoleUpdateRequest userRoleUpdateRequest4 = new OASUserRoleUpdateRequest();

        System.assert(userRoleUpdateRequest1.equals(userRoleUpdateRequest2));
        System.assert(userRoleUpdateRequest3.equals(userRoleUpdateRequest4));
        System.assertEquals(userRoleUpdateRequest1.hashCode(), userRoleUpdateRequest2.hashCode());
        System.assertEquals(userRoleUpdateRequest3.hashCode(), userRoleUpdateRequest4.hashCode());
    }
}
