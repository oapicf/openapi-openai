@isTest
private class OASProjectRateLimitListResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectRateLimitListResponse projectRateLimitListResponse1 = OASProjectRateLimitListResponse.getExample();
        OASProjectRateLimitListResponse projectRateLimitListResponse2 = projectRateLimitListResponse1;
        OASProjectRateLimitListResponse projectRateLimitListResponse3 = new OASProjectRateLimitListResponse();
        OASProjectRateLimitListResponse projectRateLimitListResponse4 = projectRateLimitListResponse3;

        System.assert(projectRateLimitListResponse1.equals(projectRateLimitListResponse2));
        System.assert(projectRateLimitListResponse2.equals(projectRateLimitListResponse1));
        System.assert(projectRateLimitListResponse1.equals(projectRateLimitListResponse1));
        System.assert(projectRateLimitListResponse3.equals(projectRateLimitListResponse4));
        System.assert(projectRateLimitListResponse4.equals(projectRateLimitListResponse3));
        System.assert(projectRateLimitListResponse3.equals(projectRateLimitListResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectRateLimitListResponse projectRateLimitListResponse1 = OASProjectRateLimitListResponse.getExample();
        OASProjectRateLimitListResponse projectRateLimitListResponse2 = OASProjectRateLimitListResponse.getExample();
        OASProjectRateLimitListResponse projectRateLimitListResponse3 = new OASProjectRateLimitListResponse();
        OASProjectRateLimitListResponse projectRateLimitListResponse4 = new OASProjectRateLimitListResponse();

        System.assert(projectRateLimitListResponse1.equals(projectRateLimitListResponse2));
        System.assert(projectRateLimitListResponse2.equals(projectRateLimitListResponse1));
        System.assert(projectRateLimitListResponse3.equals(projectRateLimitListResponse4));
        System.assert(projectRateLimitListResponse4.equals(projectRateLimitListResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectRateLimitListResponse projectRateLimitListResponse1 = OASProjectRateLimitListResponse.getExample();
        OASProjectRateLimitListResponse projectRateLimitListResponse2 = new OASProjectRateLimitListResponse();

        System.assertEquals(false, projectRateLimitListResponse1.equals('foo'));
        System.assertEquals(false, projectRateLimitListResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectRateLimitListResponse projectRateLimitListResponse1 = OASProjectRateLimitListResponse.getExample();
        OASProjectRateLimitListResponse projectRateLimitListResponse2 = new OASProjectRateLimitListResponse();
        OASProjectRateLimitListResponse projectRateLimitListResponse3;

        System.assertEquals(false, projectRateLimitListResponse1.equals(projectRateLimitListResponse3));
        System.assertEquals(false, projectRateLimitListResponse2.equals(projectRateLimitListResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectRateLimitListResponse projectRateLimitListResponse1 = OASProjectRateLimitListResponse.getExample();
        OASProjectRateLimitListResponse projectRateLimitListResponse2 = new OASProjectRateLimitListResponse();

        System.assertEquals(projectRateLimitListResponse1.hashCode(), projectRateLimitListResponse1.hashCode());
        System.assertEquals(projectRateLimitListResponse2.hashCode(), projectRateLimitListResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectRateLimitListResponse projectRateLimitListResponse1 = OASProjectRateLimitListResponse.getExample();
        OASProjectRateLimitListResponse projectRateLimitListResponse2 = OASProjectRateLimitListResponse.getExample();
        OASProjectRateLimitListResponse projectRateLimitListResponse3 = new OASProjectRateLimitListResponse();
        OASProjectRateLimitListResponse projectRateLimitListResponse4 = new OASProjectRateLimitListResponse();

        System.assert(projectRateLimitListResponse1.equals(projectRateLimitListResponse2));
        System.assert(projectRateLimitListResponse3.equals(projectRateLimitListResponse4));
        System.assertEquals(projectRateLimitListResponse1.hashCode(), projectRateLimitListResponse2.hashCode());
        System.assertEquals(projectRateLimitListResponse3.hashCode(), projectRateLimitListResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectRateLimitListResponse projectRateLimitListResponse = new OASProjectRateLimitListResponse();
        Map<String, String> x-property-mappings = projectRateLimitListResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('firstId', x-property-mappings.get('first_id'));
        System.assertEquals('lastId', x-property-mappings.get('last_id'));
        System.assertEquals('hasMore', x-property-mappings.get('has_more'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASProjectRateLimitListResponse projectRateLimitListResponse = new OASProjectRateLimitListResponse();
        System.assertEquals(new List<OASProjectRateLimit>(), projectRateLimitListResponse.data);
        System.assertEquals(null, projectRateLimitListResponse.r_object);
        System.assertEquals(null, projectRateLimitListResponse.firstId);
        System.assertEquals(null, projectRateLimitListResponse.lastId);
        System.assertEquals(null, projectRateLimitListResponse.hasMore);
    }
}
