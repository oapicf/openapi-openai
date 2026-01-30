@isTest
private class OASProjectServiceAccountCreateResponTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse1 = OASProjectServiceAccountCreateRespon.getExample();
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse2 = projectServiceAccountCreateResponse1;
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse3 = new OASProjectServiceAccountCreateRespon();
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse4 = projectServiceAccountCreateResponse3;

        System.assert(projectServiceAccountCreateResponse1.equals(projectServiceAccountCreateResponse2));
        System.assert(projectServiceAccountCreateResponse2.equals(projectServiceAccountCreateResponse1));
        System.assert(projectServiceAccountCreateResponse1.equals(projectServiceAccountCreateResponse1));
        System.assert(projectServiceAccountCreateResponse3.equals(projectServiceAccountCreateResponse4));
        System.assert(projectServiceAccountCreateResponse4.equals(projectServiceAccountCreateResponse3));
        System.assert(projectServiceAccountCreateResponse3.equals(projectServiceAccountCreateResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse1 = OASProjectServiceAccountCreateRespon.getExample();
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse2 = OASProjectServiceAccountCreateRespon.getExample();
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse3 = new OASProjectServiceAccountCreateRespon();
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse4 = new OASProjectServiceAccountCreateRespon();

        System.assert(projectServiceAccountCreateResponse1.equals(projectServiceAccountCreateResponse2));
        System.assert(projectServiceAccountCreateResponse2.equals(projectServiceAccountCreateResponse1));
        System.assert(projectServiceAccountCreateResponse3.equals(projectServiceAccountCreateResponse4));
        System.assert(projectServiceAccountCreateResponse4.equals(projectServiceAccountCreateResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse1 = OASProjectServiceAccountCreateRespon.getExample();
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse2 = new OASProjectServiceAccountCreateRespon();

        System.assertEquals(false, projectServiceAccountCreateResponse1.equals('foo'));
        System.assertEquals(false, projectServiceAccountCreateResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse1 = OASProjectServiceAccountCreateRespon.getExample();
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse2 = new OASProjectServiceAccountCreateRespon();
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse3;

        System.assertEquals(false, projectServiceAccountCreateResponse1.equals(projectServiceAccountCreateResponse3));
        System.assertEquals(false, projectServiceAccountCreateResponse2.equals(projectServiceAccountCreateResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse1 = OASProjectServiceAccountCreateRespon.getExample();
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse2 = new OASProjectServiceAccountCreateRespon();

        System.assertEquals(projectServiceAccountCreateResponse1.hashCode(), projectServiceAccountCreateResponse1.hashCode());
        System.assertEquals(projectServiceAccountCreateResponse2.hashCode(), projectServiceAccountCreateResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse1 = OASProjectServiceAccountCreateRespon.getExample();
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse2 = OASProjectServiceAccountCreateRespon.getExample();
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse3 = new OASProjectServiceAccountCreateRespon();
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse4 = new OASProjectServiceAccountCreateRespon();

        System.assert(projectServiceAccountCreateResponse1.equals(projectServiceAccountCreateResponse2));
        System.assert(projectServiceAccountCreateResponse3.equals(projectServiceAccountCreateResponse4));
        System.assertEquals(projectServiceAccountCreateResponse1.hashCode(), projectServiceAccountCreateResponse2.hashCode());
        System.assertEquals(projectServiceAccountCreateResponse3.hashCode(), projectServiceAccountCreateResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectServiceAccountCreateRespon projectServiceAccountCreateResponse = new OASProjectServiceAccountCreateRespon();
        Map<String, String> x-property-mappings = projectServiceAccountCreateResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('apiKey', x-property-mappings.get('api_key'));
    }
}
