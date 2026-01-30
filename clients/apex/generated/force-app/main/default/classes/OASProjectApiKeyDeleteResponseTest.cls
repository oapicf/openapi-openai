@isTest
private class OASProjectApiKeyDeleteResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse1 = OASProjectApiKeyDeleteResponse.getExample();
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse2 = projectApiKeyDeleteResponse1;
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse3 = new OASProjectApiKeyDeleteResponse();
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse4 = projectApiKeyDeleteResponse3;

        System.assert(projectApiKeyDeleteResponse1.equals(projectApiKeyDeleteResponse2));
        System.assert(projectApiKeyDeleteResponse2.equals(projectApiKeyDeleteResponse1));
        System.assert(projectApiKeyDeleteResponse1.equals(projectApiKeyDeleteResponse1));
        System.assert(projectApiKeyDeleteResponse3.equals(projectApiKeyDeleteResponse4));
        System.assert(projectApiKeyDeleteResponse4.equals(projectApiKeyDeleteResponse3));
        System.assert(projectApiKeyDeleteResponse3.equals(projectApiKeyDeleteResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse1 = OASProjectApiKeyDeleteResponse.getExample();
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse2 = OASProjectApiKeyDeleteResponse.getExample();
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse3 = new OASProjectApiKeyDeleteResponse();
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse4 = new OASProjectApiKeyDeleteResponse();

        System.assert(projectApiKeyDeleteResponse1.equals(projectApiKeyDeleteResponse2));
        System.assert(projectApiKeyDeleteResponse2.equals(projectApiKeyDeleteResponse1));
        System.assert(projectApiKeyDeleteResponse3.equals(projectApiKeyDeleteResponse4));
        System.assert(projectApiKeyDeleteResponse4.equals(projectApiKeyDeleteResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse1 = OASProjectApiKeyDeleteResponse.getExample();
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse2 = new OASProjectApiKeyDeleteResponse();

        System.assertEquals(false, projectApiKeyDeleteResponse1.equals('foo'));
        System.assertEquals(false, projectApiKeyDeleteResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse1 = OASProjectApiKeyDeleteResponse.getExample();
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse2 = new OASProjectApiKeyDeleteResponse();
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse3;

        System.assertEquals(false, projectApiKeyDeleteResponse1.equals(projectApiKeyDeleteResponse3));
        System.assertEquals(false, projectApiKeyDeleteResponse2.equals(projectApiKeyDeleteResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse1 = OASProjectApiKeyDeleteResponse.getExample();
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse2 = new OASProjectApiKeyDeleteResponse();

        System.assertEquals(projectApiKeyDeleteResponse1.hashCode(), projectApiKeyDeleteResponse1.hashCode());
        System.assertEquals(projectApiKeyDeleteResponse2.hashCode(), projectApiKeyDeleteResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse1 = OASProjectApiKeyDeleteResponse.getExample();
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse2 = OASProjectApiKeyDeleteResponse.getExample();
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse3 = new OASProjectApiKeyDeleteResponse();
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse4 = new OASProjectApiKeyDeleteResponse();

        System.assert(projectApiKeyDeleteResponse1.equals(projectApiKeyDeleteResponse2));
        System.assert(projectApiKeyDeleteResponse3.equals(projectApiKeyDeleteResponse4));
        System.assertEquals(projectApiKeyDeleteResponse1.hashCode(), projectApiKeyDeleteResponse2.hashCode());
        System.assertEquals(projectApiKeyDeleteResponse3.hashCode(), projectApiKeyDeleteResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectApiKeyDeleteResponse projectApiKeyDeleteResponse = new OASProjectApiKeyDeleteResponse();
        Map<String, String> x-property-mappings = projectApiKeyDeleteResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
