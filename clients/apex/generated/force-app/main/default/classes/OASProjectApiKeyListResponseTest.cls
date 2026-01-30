@isTest
private class OASProjectApiKeyListResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectApiKeyListResponse projectApiKeyListResponse1 = OASProjectApiKeyListResponse.getExample();
        OASProjectApiKeyListResponse projectApiKeyListResponse2 = projectApiKeyListResponse1;
        OASProjectApiKeyListResponse projectApiKeyListResponse3 = new OASProjectApiKeyListResponse();
        OASProjectApiKeyListResponse projectApiKeyListResponse4 = projectApiKeyListResponse3;

        System.assert(projectApiKeyListResponse1.equals(projectApiKeyListResponse2));
        System.assert(projectApiKeyListResponse2.equals(projectApiKeyListResponse1));
        System.assert(projectApiKeyListResponse1.equals(projectApiKeyListResponse1));
        System.assert(projectApiKeyListResponse3.equals(projectApiKeyListResponse4));
        System.assert(projectApiKeyListResponse4.equals(projectApiKeyListResponse3));
        System.assert(projectApiKeyListResponse3.equals(projectApiKeyListResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectApiKeyListResponse projectApiKeyListResponse1 = OASProjectApiKeyListResponse.getExample();
        OASProjectApiKeyListResponse projectApiKeyListResponse2 = OASProjectApiKeyListResponse.getExample();
        OASProjectApiKeyListResponse projectApiKeyListResponse3 = new OASProjectApiKeyListResponse();
        OASProjectApiKeyListResponse projectApiKeyListResponse4 = new OASProjectApiKeyListResponse();

        System.assert(projectApiKeyListResponse1.equals(projectApiKeyListResponse2));
        System.assert(projectApiKeyListResponse2.equals(projectApiKeyListResponse1));
        System.assert(projectApiKeyListResponse3.equals(projectApiKeyListResponse4));
        System.assert(projectApiKeyListResponse4.equals(projectApiKeyListResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectApiKeyListResponse projectApiKeyListResponse1 = OASProjectApiKeyListResponse.getExample();
        OASProjectApiKeyListResponse projectApiKeyListResponse2 = new OASProjectApiKeyListResponse();

        System.assertEquals(false, projectApiKeyListResponse1.equals('foo'));
        System.assertEquals(false, projectApiKeyListResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectApiKeyListResponse projectApiKeyListResponse1 = OASProjectApiKeyListResponse.getExample();
        OASProjectApiKeyListResponse projectApiKeyListResponse2 = new OASProjectApiKeyListResponse();
        OASProjectApiKeyListResponse projectApiKeyListResponse3;

        System.assertEquals(false, projectApiKeyListResponse1.equals(projectApiKeyListResponse3));
        System.assertEquals(false, projectApiKeyListResponse2.equals(projectApiKeyListResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectApiKeyListResponse projectApiKeyListResponse1 = OASProjectApiKeyListResponse.getExample();
        OASProjectApiKeyListResponse projectApiKeyListResponse2 = new OASProjectApiKeyListResponse();

        System.assertEquals(projectApiKeyListResponse1.hashCode(), projectApiKeyListResponse1.hashCode());
        System.assertEquals(projectApiKeyListResponse2.hashCode(), projectApiKeyListResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectApiKeyListResponse projectApiKeyListResponse1 = OASProjectApiKeyListResponse.getExample();
        OASProjectApiKeyListResponse projectApiKeyListResponse2 = OASProjectApiKeyListResponse.getExample();
        OASProjectApiKeyListResponse projectApiKeyListResponse3 = new OASProjectApiKeyListResponse();
        OASProjectApiKeyListResponse projectApiKeyListResponse4 = new OASProjectApiKeyListResponse();

        System.assert(projectApiKeyListResponse1.equals(projectApiKeyListResponse2));
        System.assert(projectApiKeyListResponse3.equals(projectApiKeyListResponse4));
        System.assertEquals(projectApiKeyListResponse1.hashCode(), projectApiKeyListResponse2.hashCode());
        System.assertEquals(projectApiKeyListResponse3.hashCode(), projectApiKeyListResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectApiKeyListResponse projectApiKeyListResponse = new OASProjectApiKeyListResponse();
        Map<String, String> x-property-mappings = projectApiKeyListResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASProjectApiKeyListResponse projectApiKeyListResponse = new OASProjectApiKeyListResponse();
        System.assertEquals(new List<OASProjectApiKey>(), projectApiKeyListResponse.data);
        System.assertEquals(null, projectApiKeyListResponse.r_object);
        System.assertEquals(null, projectApiKeyListResponse.firstId);
        System.assertEquals(null, projectApiKeyListResponse.lastId);
        System.assertEquals(null, projectApiKeyListResponse.hasMore);
    }
}
