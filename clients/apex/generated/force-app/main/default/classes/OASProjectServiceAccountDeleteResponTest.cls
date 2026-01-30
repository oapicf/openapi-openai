@isTest
private class OASProjectServiceAccountDeleteResponTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse1 = OASProjectServiceAccountDeleteRespon.getExample();
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse2 = projectServiceAccountDeleteResponse1;
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse3 = new OASProjectServiceAccountDeleteRespon();
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse4 = projectServiceAccountDeleteResponse3;

        System.assert(projectServiceAccountDeleteResponse1.equals(projectServiceAccountDeleteResponse2));
        System.assert(projectServiceAccountDeleteResponse2.equals(projectServiceAccountDeleteResponse1));
        System.assert(projectServiceAccountDeleteResponse1.equals(projectServiceAccountDeleteResponse1));
        System.assert(projectServiceAccountDeleteResponse3.equals(projectServiceAccountDeleteResponse4));
        System.assert(projectServiceAccountDeleteResponse4.equals(projectServiceAccountDeleteResponse3));
        System.assert(projectServiceAccountDeleteResponse3.equals(projectServiceAccountDeleteResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse1 = OASProjectServiceAccountDeleteRespon.getExample();
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse2 = OASProjectServiceAccountDeleteRespon.getExample();
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse3 = new OASProjectServiceAccountDeleteRespon();
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse4 = new OASProjectServiceAccountDeleteRespon();

        System.assert(projectServiceAccountDeleteResponse1.equals(projectServiceAccountDeleteResponse2));
        System.assert(projectServiceAccountDeleteResponse2.equals(projectServiceAccountDeleteResponse1));
        System.assert(projectServiceAccountDeleteResponse3.equals(projectServiceAccountDeleteResponse4));
        System.assert(projectServiceAccountDeleteResponse4.equals(projectServiceAccountDeleteResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse1 = OASProjectServiceAccountDeleteRespon.getExample();
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse2 = new OASProjectServiceAccountDeleteRespon();

        System.assertEquals(false, projectServiceAccountDeleteResponse1.equals('foo'));
        System.assertEquals(false, projectServiceAccountDeleteResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse1 = OASProjectServiceAccountDeleteRespon.getExample();
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse2 = new OASProjectServiceAccountDeleteRespon();
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse3;

        System.assertEquals(false, projectServiceAccountDeleteResponse1.equals(projectServiceAccountDeleteResponse3));
        System.assertEquals(false, projectServiceAccountDeleteResponse2.equals(projectServiceAccountDeleteResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse1 = OASProjectServiceAccountDeleteRespon.getExample();
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse2 = new OASProjectServiceAccountDeleteRespon();

        System.assertEquals(projectServiceAccountDeleteResponse1.hashCode(), projectServiceAccountDeleteResponse1.hashCode());
        System.assertEquals(projectServiceAccountDeleteResponse2.hashCode(), projectServiceAccountDeleteResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse1 = OASProjectServiceAccountDeleteRespon.getExample();
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse2 = OASProjectServiceAccountDeleteRespon.getExample();
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse3 = new OASProjectServiceAccountDeleteRespon();
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse4 = new OASProjectServiceAccountDeleteRespon();

        System.assert(projectServiceAccountDeleteResponse1.equals(projectServiceAccountDeleteResponse2));
        System.assert(projectServiceAccountDeleteResponse3.equals(projectServiceAccountDeleteResponse4));
        System.assertEquals(projectServiceAccountDeleteResponse1.hashCode(), projectServiceAccountDeleteResponse2.hashCode());
        System.assertEquals(projectServiceAccountDeleteResponse3.hashCode(), projectServiceAccountDeleteResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectServiceAccountDeleteRespon projectServiceAccountDeleteResponse = new OASProjectServiceAccountDeleteRespon();
        Map<String, String> x-property-mappings = projectServiceAccountDeleteResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }
}
