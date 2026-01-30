@isTest
private class OASProjectUserUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectUserUpdateRequest projectUserUpdateRequest1 = OASProjectUserUpdateRequest.getExample();
        OASProjectUserUpdateRequest projectUserUpdateRequest2 = projectUserUpdateRequest1;
        OASProjectUserUpdateRequest projectUserUpdateRequest3 = new OASProjectUserUpdateRequest();
        OASProjectUserUpdateRequest projectUserUpdateRequest4 = projectUserUpdateRequest3;

        System.assert(projectUserUpdateRequest1.equals(projectUserUpdateRequest2));
        System.assert(projectUserUpdateRequest2.equals(projectUserUpdateRequest1));
        System.assert(projectUserUpdateRequest1.equals(projectUserUpdateRequest1));
        System.assert(projectUserUpdateRequest3.equals(projectUserUpdateRequest4));
        System.assert(projectUserUpdateRequest4.equals(projectUserUpdateRequest3));
        System.assert(projectUserUpdateRequest3.equals(projectUserUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectUserUpdateRequest projectUserUpdateRequest1 = OASProjectUserUpdateRequest.getExample();
        OASProjectUserUpdateRequest projectUserUpdateRequest2 = OASProjectUserUpdateRequest.getExample();
        OASProjectUserUpdateRequest projectUserUpdateRequest3 = new OASProjectUserUpdateRequest();
        OASProjectUserUpdateRequest projectUserUpdateRequest4 = new OASProjectUserUpdateRequest();

        System.assert(projectUserUpdateRequest1.equals(projectUserUpdateRequest2));
        System.assert(projectUserUpdateRequest2.equals(projectUserUpdateRequest1));
        System.assert(projectUserUpdateRequest3.equals(projectUserUpdateRequest4));
        System.assert(projectUserUpdateRequest4.equals(projectUserUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectUserUpdateRequest projectUserUpdateRequest1 = OASProjectUserUpdateRequest.getExample();
        OASProjectUserUpdateRequest projectUserUpdateRequest2 = new OASProjectUserUpdateRequest();

        System.assertEquals(false, projectUserUpdateRequest1.equals('foo'));
        System.assertEquals(false, projectUserUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectUserUpdateRequest projectUserUpdateRequest1 = OASProjectUserUpdateRequest.getExample();
        OASProjectUserUpdateRequest projectUserUpdateRequest2 = new OASProjectUserUpdateRequest();
        OASProjectUserUpdateRequest projectUserUpdateRequest3;

        System.assertEquals(false, projectUserUpdateRequest1.equals(projectUserUpdateRequest3));
        System.assertEquals(false, projectUserUpdateRequest2.equals(projectUserUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectUserUpdateRequest projectUserUpdateRequest1 = OASProjectUserUpdateRequest.getExample();
        OASProjectUserUpdateRequest projectUserUpdateRequest2 = new OASProjectUserUpdateRequest();

        System.assertEquals(projectUserUpdateRequest1.hashCode(), projectUserUpdateRequest1.hashCode());
        System.assertEquals(projectUserUpdateRequest2.hashCode(), projectUserUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectUserUpdateRequest projectUserUpdateRequest1 = OASProjectUserUpdateRequest.getExample();
        OASProjectUserUpdateRequest projectUserUpdateRequest2 = OASProjectUserUpdateRequest.getExample();
        OASProjectUserUpdateRequest projectUserUpdateRequest3 = new OASProjectUserUpdateRequest();
        OASProjectUserUpdateRequest projectUserUpdateRequest4 = new OASProjectUserUpdateRequest();

        System.assert(projectUserUpdateRequest1.equals(projectUserUpdateRequest2));
        System.assert(projectUserUpdateRequest3.equals(projectUserUpdateRequest4));
        System.assertEquals(projectUserUpdateRequest1.hashCode(), projectUserUpdateRequest2.hashCode());
        System.assertEquals(projectUserUpdateRequest3.hashCode(), projectUserUpdateRequest4.hashCode());
    }
}
