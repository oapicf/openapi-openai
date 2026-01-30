@isTest
private class OASProjectUserDeleteResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectUserDeleteResponse projectUserDeleteResponse1 = OASProjectUserDeleteResponse.getExample();
        OASProjectUserDeleteResponse projectUserDeleteResponse2 = projectUserDeleteResponse1;
        OASProjectUserDeleteResponse projectUserDeleteResponse3 = new OASProjectUserDeleteResponse();
        OASProjectUserDeleteResponse projectUserDeleteResponse4 = projectUserDeleteResponse3;

        System.assert(projectUserDeleteResponse1.equals(projectUserDeleteResponse2));
        System.assert(projectUserDeleteResponse2.equals(projectUserDeleteResponse1));
        System.assert(projectUserDeleteResponse1.equals(projectUserDeleteResponse1));
        System.assert(projectUserDeleteResponse3.equals(projectUserDeleteResponse4));
        System.assert(projectUserDeleteResponse4.equals(projectUserDeleteResponse3));
        System.assert(projectUserDeleteResponse3.equals(projectUserDeleteResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectUserDeleteResponse projectUserDeleteResponse1 = OASProjectUserDeleteResponse.getExample();
        OASProjectUserDeleteResponse projectUserDeleteResponse2 = OASProjectUserDeleteResponse.getExample();
        OASProjectUserDeleteResponse projectUserDeleteResponse3 = new OASProjectUserDeleteResponse();
        OASProjectUserDeleteResponse projectUserDeleteResponse4 = new OASProjectUserDeleteResponse();

        System.assert(projectUserDeleteResponse1.equals(projectUserDeleteResponse2));
        System.assert(projectUserDeleteResponse2.equals(projectUserDeleteResponse1));
        System.assert(projectUserDeleteResponse3.equals(projectUserDeleteResponse4));
        System.assert(projectUserDeleteResponse4.equals(projectUserDeleteResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectUserDeleteResponse projectUserDeleteResponse1 = OASProjectUserDeleteResponse.getExample();
        OASProjectUserDeleteResponse projectUserDeleteResponse2 = new OASProjectUserDeleteResponse();

        System.assertEquals(false, projectUserDeleteResponse1.equals('foo'));
        System.assertEquals(false, projectUserDeleteResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectUserDeleteResponse projectUserDeleteResponse1 = OASProjectUserDeleteResponse.getExample();
        OASProjectUserDeleteResponse projectUserDeleteResponse2 = new OASProjectUserDeleteResponse();
        OASProjectUserDeleteResponse projectUserDeleteResponse3;

        System.assertEquals(false, projectUserDeleteResponse1.equals(projectUserDeleteResponse3));
        System.assertEquals(false, projectUserDeleteResponse2.equals(projectUserDeleteResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectUserDeleteResponse projectUserDeleteResponse1 = OASProjectUserDeleteResponse.getExample();
        OASProjectUserDeleteResponse projectUserDeleteResponse2 = new OASProjectUserDeleteResponse();

        System.assertEquals(projectUserDeleteResponse1.hashCode(), projectUserDeleteResponse1.hashCode());
        System.assertEquals(projectUserDeleteResponse2.hashCode(), projectUserDeleteResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectUserDeleteResponse projectUserDeleteResponse1 = OASProjectUserDeleteResponse.getExample();
        OASProjectUserDeleteResponse projectUserDeleteResponse2 = OASProjectUserDeleteResponse.getExample();
        OASProjectUserDeleteResponse projectUserDeleteResponse3 = new OASProjectUserDeleteResponse();
        OASProjectUserDeleteResponse projectUserDeleteResponse4 = new OASProjectUserDeleteResponse();

        System.assert(projectUserDeleteResponse1.equals(projectUserDeleteResponse2));
        System.assert(projectUserDeleteResponse3.equals(projectUserDeleteResponse4));
        System.assertEquals(projectUserDeleteResponse1.hashCode(), projectUserDeleteResponse2.hashCode());
        System.assertEquals(projectUserDeleteResponse3.hashCode(), projectUserDeleteResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectUserDeleteResponse projectUserDeleteResponse = new OASProjectUserDeleteResponse();
        Map<String, String> x-property-mappings = projectUserDeleteResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
