@isTest
private class OASProjectServiceAccountListResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectServiceAccountListResponse projectServiceAccountListResponse1 = OASProjectServiceAccountListResponse.getExample();
        OASProjectServiceAccountListResponse projectServiceAccountListResponse2 = projectServiceAccountListResponse1;
        OASProjectServiceAccountListResponse projectServiceAccountListResponse3 = new OASProjectServiceAccountListResponse();
        OASProjectServiceAccountListResponse projectServiceAccountListResponse4 = projectServiceAccountListResponse3;

        System.assert(projectServiceAccountListResponse1.equals(projectServiceAccountListResponse2));
        System.assert(projectServiceAccountListResponse2.equals(projectServiceAccountListResponse1));
        System.assert(projectServiceAccountListResponse1.equals(projectServiceAccountListResponse1));
        System.assert(projectServiceAccountListResponse3.equals(projectServiceAccountListResponse4));
        System.assert(projectServiceAccountListResponse4.equals(projectServiceAccountListResponse3));
        System.assert(projectServiceAccountListResponse3.equals(projectServiceAccountListResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectServiceAccountListResponse projectServiceAccountListResponse1 = OASProjectServiceAccountListResponse.getExample();
        OASProjectServiceAccountListResponse projectServiceAccountListResponse2 = OASProjectServiceAccountListResponse.getExample();
        OASProjectServiceAccountListResponse projectServiceAccountListResponse3 = new OASProjectServiceAccountListResponse();
        OASProjectServiceAccountListResponse projectServiceAccountListResponse4 = new OASProjectServiceAccountListResponse();

        System.assert(projectServiceAccountListResponse1.equals(projectServiceAccountListResponse2));
        System.assert(projectServiceAccountListResponse2.equals(projectServiceAccountListResponse1));
        System.assert(projectServiceAccountListResponse3.equals(projectServiceAccountListResponse4));
        System.assert(projectServiceAccountListResponse4.equals(projectServiceAccountListResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectServiceAccountListResponse projectServiceAccountListResponse1 = OASProjectServiceAccountListResponse.getExample();
        OASProjectServiceAccountListResponse projectServiceAccountListResponse2 = new OASProjectServiceAccountListResponse();

        System.assertEquals(false, projectServiceAccountListResponse1.equals('foo'));
        System.assertEquals(false, projectServiceAccountListResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectServiceAccountListResponse projectServiceAccountListResponse1 = OASProjectServiceAccountListResponse.getExample();
        OASProjectServiceAccountListResponse projectServiceAccountListResponse2 = new OASProjectServiceAccountListResponse();
        OASProjectServiceAccountListResponse projectServiceAccountListResponse3;

        System.assertEquals(false, projectServiceAccountListResponse1.equals(projectServiceAccountListResponse3));
        System.assertEquals(false, projectServiceAccountListResponse2.equals(projectServiceAccountListResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectServiceAccountListResponse projectServiceAccountListResponse1 = OASProjectServiceAccountListResponse.getExample();
        OASProjectServiceAccountListResponse projectServiceAccountListResponse2 = new OASProjectServiceAccountListResponse();

        System.assertEquals(projectServiceAccountListResponse1.hashCode(), projectServiceAccountListResponse1.hashCode());
        System.assertEquals(projectServiceAccountListResponse2.hashCode(), projectServiceAccountListResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectServiceAccountListResponse projectServiceAccountListResponse1 = OASProjectServiceAccountListResponse.getExample();
        OASProjectServiceAccountListResponse projectServiceAccountListResponse2 = OASProjectServiceAccountListResponse.getExample();
        OASProjectServiceAccountListResponse projectServiceAccountListResponse3 = new OASProjectServiceAccountListResponse();
        OASProjectServiceAccountListResponse projectServiceAccountListResponse4 = new OASProjectServiceAccountListResponse();

        System.assert(projectServiceAccountListResponse1.equals(projectServiceAccountListResponse2));
        System.assert(projectServiceAccountListResponse3.equals(projectServiceAccountListResponse4));
        System.assertEquals(projectServiceAccountListResponse1.hashCode(), projectServiceAccountListResponse2.hashCode());
        System.assertEquals(projectServiceAccountListResponse3.hashCode(), projectServiceAccountListResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectServiceAccountListResponse projectServiceAccountListResponse = new OASProjectServiceAccountListResponse();
        Map<String, String> x-property-mappings = projectServiceAccountListResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASProjectServiceAccountListResponse projectServiceAccountListResponse = new OASProjectServiceAccountListResponse();
        System.assertEquals(new List<OASProjectServiceAccount>(), projectServiceAccountListResponse.data);
        System.assertEquals(null, projectServiceAccountListResponse.r_object);
        System.assertEquals(null, projectServiceAccountListResponse.firstId);
        System.assertEquals(null, projectServiceAccountListResponse.lastId);
        System.assertEquals(null, projectServiceAccountListResponse.hasMore);
    }
}
