@isTest
private class OASProjectUserListResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectUserListResponse projectUserListResponse1 = OASProjectUserListResponse.getExample();
        OASProjectUserListResponse projectUserListResponse2 = projectUserListResponse1;
        OASProjectUserListResponse projectUserListResponse3 = new OASProjectUserListResponse();
        OASProjectUserListResponse projectUserListResponse4 = projectUserListResponse3;

        System.assert(projectUserListResponse1.equals(projectUserListResponse2));
        System.assert(projectUserListResponse2.equals(projectUserListResponse1));
        System.assert(projectUserListResponse1.equals(projectUserListResponse1));
        System.assert(projectUserListResponse3.equals(projectUserListResponse4));
        System.assert(projectUserListResponse4.equals(projectUserListResponse3));
        System.assert(projectUserListResponse3.equals(projectUserListResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectUserListResponse projectUserListResponse1 = OASProjectUserListResponse.getExample();
        OASProjectUserListResponse projectUserListResponse2 = OASProjectUserListResponse.getExample();
        OASProjectUserListResponse projectUserListResponse3 = new OASProjectUserListResponse();
        OASProjectUserListResponse projectUserListResponse4 = new OASProjectUserListResponse();

        System.assert(projectUserListResponse1.equals(projectUserListResponse2));
        System.assert(projectUserListResponse2.equals(projectUserListResponse1));
        System.assert(projectUserListResponse3.equals(projectUserListResponse4));
        System.assert(projectUserListResponse4.equals(projectUserListResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectUserListResponse projectUserListResponse1 = OASProjectUserListResponse.getExample();
        OASProjectUserListResponse projectUserListResponse2 = new OASProjectUserListResponse();

        System.assertEquals(false, projectUserListResponse1.equals('foo'));
        System.assertEquals(false, projectUserListResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectUserListResponse projectUserListResponse1 = OASProjectUserListResponse.getExample();
        OASProjectUserListResponse projectUserListResponse2 = new OASProjectUserListResponse();
        OASProjectUserListResponse projectUserListResponse3;

        System.assertEquals(false, projectUserListResponse1.equals(projectUserListResponse3));
        System.assertEquals(false, projectUserListResponse2.equals(projectUserListResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectUserListResponse projectUserListResponse1 = OASProjectUserListResponse.getExample();
        OASProjectUserListResponse projectUserListResponse2 = new OASProjectUserListResponse();

        System.assertEquals(projectUserListResponse1.hashCode(), projectUserListResponse1.hashCode());
        System.assertEquals(projectUserListResponse2.hashCode(), projectUserListResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectUserListResponse projectUserListResponse1 = OASProjectUserListResponse.getExample();
        OASProjectUserListResponse projectUserListResponse2 = OASProjectUserListResponse.getExample();
        OASProjectUserListResponse projectUserListResponse3 = new OASProjectUserListResponse();
        OASProjectUserListResponse projectUserListResponse4 = new OASProjectUserListResponse();

        System.assert(projectUserListResponse1.equals(projectUserListResponse2));
        System.assert(projectUserListResponse3.equals(projectUserListResponse4));
        System.assertEquals(projectUserListResponse1.hashCode(), projectUserListResponse2.hashCode());
        System.assertEquals(projectUserListResponse3.hashCode(), projectUserListResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectUserListResponse projectUserListResponse = new OASProjectUserListResponse();
        Map<String, String> x-property-mappings = projectUserListResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASProjectUserListResponse projectUserListResponse = new OASProjectUserListResponse();
        System.assertEquals(new List<OASProjectUser>(), projectUserListResponse.data);
        System.assertEquals(null, projectUserListResponse.r_object);
        System.assertEquals(null, projectUserListResponse.firstId);
        System.assertEquals(null, projectUserListResponse.lastId);
        System.assertEquals(null, projectUserListResponse.hasMore);
    }
}
