@isTest
private class OASProjectUserCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectUserCreateRequest projectUserCreateRequest1 = OASProjectUserCreateRequest.getExample();
        OASProjectUserCreateRequest projectUserCreateRequest2 = projectUserCreateRequest1;
        OASProjectUserCreateRequest projectUserCreateRequest3 = new OASProjectUserCreateRequest();
        OASProjectUserCreateRequest projectUserCreateRequest4 = projectUserCreateRequest3;

        System.assert(projectUserCreateRequest1.equals(projectUserCreateRequest2));
        System.assert(projectUserCreateRequest2.equals(projectUserCreateRequest1));
        System.assert(projectUserCreateRequest1.equals(projectUserCreateRequest1));
        System.assert(projectUserCreateRequest3.equals(projectUserCreateRequest4));
        System.assert(projectUserCreateRequest4.equals(projectUserCreateRequest3));
        System.assert(projectUserCreateRequest3.equals(projectUserCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectUserCreateRequest projectUserCreateRequest1 = OASProjectUserCreateRequest.getExample();
        OASProjectUserCreateRequest projectUserCreateRequest2 = OASProjectUserCreateRequest.getExample();
        OASProjectUserCreateRequest projectUserCreateRequest3 = new OASProjectUserCreateRequest();
        OASProjectUserCreateRequest projectUserCreateRequest4 = new OASProjectUserCreateRequest();

        System.assert(projectUserCreateRequest1.equals(projectUserCreateRequest2));
        System.assert(projectUserCreateRequest2.equals(projectUserCreateRequest1));
        System.assert(projectUserCreateRequest3.equals(projectUserCreateRequest4));
        System.assert(projectUserCreateRequest4.equals(projectUserCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectUserCreateRequest projectUserCreateRequest1 = OASProjectUserCreateRequest.getExample();
        OASProjectUserCreateRequest projectUserCreateRequest2 = new OASProjectUserCreateRequest();

        System.assertEquals(false, projectUserCreateRequest1.equals('foo'));
        System.assertEquals(false, projectUserCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectUserCreateRequest projectUserCreateRequest1 = OASProjectUserCreateRequest.getExample();
        OASProjectUserCreateRequest projectUserCreateRequest2 = new OASProjectUserCreateRequest();
        OASProjectUserCreateRequest projectUserCreateRequest3;

        System.assertEquals(false, projectUserCreateRequest1.equals(projectUserCreateRequest3));
        System.assertEquals(false, projectUserCreateRequest2.equals(projectUserCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectUserCreateRequest projectUserCreateRequest1 = OASProjectUserCreateRequest.getExample();
        OASProjectUserCreateRequest projectUserCreateRequest2 = new OASProjectUserCreateRequest();

        System.assertEquals(projectUserCreateRequest1.hashCode(), projectUserCreateRequest1.hashCode());
        System.assertEquals(projectUserCreateRequest2.hashCode(), projectUserCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectUserCreateRequest projectUserCreateRequest1 = OASProjectUserCreateRequest.getExample();
        OASProjectUserCreateRequest projectUserCreateRequest2 = OASProjectUserCreateRequest.getExample();
        OASProjectUserCreateRequest projectUserCreateRequest3 = new OASProjectUserCreateRequest();
        OASProjectUserCreateRequest projectUserCreateRequest4 = new OASProjectUserCreateRequest();

        System.assert(projectUserCreateRequest1.equals(projectUserCreateRequest2));
        System.assert(projectUserCreateRequest3.equals(projectUserCreateRequest4));
        System.assertEquals(projectUserCreateRequest1.hashCode(), projectUserCreateRequest2.hashCode());
        System.assertEquals(projectUserCreateRequest3.hashCode(), projectUserCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectUserCreateRequest projectUserCreateRequest = new OASProjectUserCreateRequest();
        Map<String, String> x-property-mappings = projectUserCreateRequest.getx-property-mappings();
        System.assertEquals('userId', x-property-mappings.get('user_id'));
    }
}
