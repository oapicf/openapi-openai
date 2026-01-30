@isTest
private class OASProjectListResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectListResponse projectListResponse1 = OASProjectListResponse.getExample();
        OASProjectListResponse projectListResponse2 = projectListResponse1;
        OASProjectListResponse projectListResponse3 = new OASProjectListResponse();
        OASProjectListResponse projectListResponse4 = projectListResponse3;

        System.assert(projectListResponse1.equals(projectListResponse2));
        System.assert(projectListResponse2.equals(projectListResponse1));
        System.assert(projectListResponse1.equals(projectListResponse1));
        System.assert(projectListResponse3.equals(projectListResponse4));
        System.assert(projectListResponse4.equals(projectListResponse3));
        System.assert(projectListResponse3.equals(projectListResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectListResponse projectListResponse1 = OASProjectListResponse.getExample();
        OASProjectListResponse projectListResponse2 = OASProjectListResponse.getExample();
        OASProjectListResponse projectListResponse3 = new OASProjectListResponse();
        OASProjectListResponse projectListResponse4 = new OASProjectListResponse();

        System.assert(projectListResponse1.equals(projectListResponse2));
        System.assert(projectListResponse2.equals(projectListResponse1));
        System.assert(projectListResponse3.equals(projectListResponse4));
        System.assert(projectListResponse4.equals(projectListResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectListResponse projectListResponse1 = OASProjectListResponse.getExample();
        OASProjectListResponse projectListResponse2 = new OASProjectListResponse();

        System.assertEquals(false, projectListResponse1.equals('foo'));
        System.assertEquals(false, projectListResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectListResponse projectListResponse1 = OASProjectListResponse.getExample();
        OASProjectListResponse projectListResponse2 = new OASProjectListResponse();
        OASProjectListResponse projectListResponse3;

        System.assertEquals(false, projectListResponse1.equals(projectListResponse3));
        System.assertEquals(false, projectListResponse2.equals(projectListResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectListResponse projectListResponse1 = OASProjectListResponse.getExample();
        OASProjectListResponse projectListResponse2 = new OASProjectListResponse();

        System.assertEquals(projectListResponse1.hashCode(), projectListResponse1.hashCode());
        System.assertEquals(projectListResponse2.hashCode(), projectListResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectListResponse projectListResponse1 = OASProjectListResponse.getExample();
        OASProjectListResponse projectListResponse2 = OASProjectListResponse.getExample();
        OASProjectListResponse projectListResponse3 = new OASProjectListResponse();
        OASProjectListResponse projectListResponse4 = new OASProjectListResponse();

        System.assert(projectListResponse1.equals(projectListResponse2));
        System.assert(projectListResponse3.equals(projectListResponse4));
        System.assertEquals(projectListResponse1.hashCode(), projectListResponse2.hashCode());
        System.assertEquals(projectListResponse3.hashCode(), projectListResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectListResponse projectListResponse = new OASProjectListResponse();
        Map<String, String> x-property-mappings = projectListResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASProjectListResponse projectListResponse = new OASProjectListResponse();
        System.assertEquals(new List<OASProject>(), projectListResponse.data);
        System.assertEquals(null, projectListResponse.r_object);
        System.assertEquals(null, projectListResponse.firstId);
        System.assertEquals(null, projectListResponse.lastId);
        System.assertEquals(null, projectListResponse.hasMore);
    }
}
