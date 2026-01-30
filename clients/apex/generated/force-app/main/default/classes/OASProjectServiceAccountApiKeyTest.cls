@isTest
private class OASProjectServiceAccountApiKeyTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectServiceAccountApiKey projectServiceAccountApiKey1 = OASProjectServiceAccountApiKey.getExample();
        OASProjectServiceAccountApiKey projectServiceAccountApiKey2 = projectServiceAccountApiKey1;
        OASProjectServiceAccountApiKey projectServiceAccountApiKey3 = new OASProjectServiceAccountApiKey();
        OASProjectServiceAccountApiKey projectServiceAccountApiKey4 = projectServiceAccountApiKey3;

        System.assert(projectServiceAccountApiKey1.equals(projectServiceAccountApiKey2));
        System.assert(projectServiceAccountApiKey2.equals(projectServiceAccountApiKey1));
        System.assert(projectServiceAccountApiKey1.equals(projectServiceAccountApiKey1));
        System.assert(projectServiceAccountApiKey3.equals(projectServiceAccountApiKey4));
        System.assert(projectServiceAccountApiKey4.equals(projectServiceAccountApiKey3));
        System.assert(projectServiceAccountApiKey3.equals(projectServiceAccountApiKey3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectServiceAccountApiKey projectServiceAccountApiKey1 = OASProjectServiceAccountApiKey.getExample();
        OASProjectServiceAccountApiKey projectServiceAccountApiKey2 = OASProjectServiceAccountApiKey.getExample();
        OASProjectServiceAccountApiKey projectServiceAccountApiKey3 = new OASProjectServiceAccountApiKey();
        OASProjectServiceAccountApiKey projectServiceAccountApiKey4 = new OASProjectServiceAccountApiKey();

        System.assert(projectServiceAccountApiKey1.equals(projectServiceAccountApiKey2));
        System.assert(projectServiceAccountApiKey2.equals(projectServiceAccountApiKey1));
        System.assert(projectServiceAccountApiKey3.equals(projectServiceAccountApiKey4));
        System.assert(projectServiceAccountApiKey4.equals(projectServiceAccountApiKey3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectServiceAccountApiKey projectServiceAccountApiKey1 = OASProjectServiceAccountApiKey.getExample();
        OASProjectServiceAccountApiKey projectServiceAccountApiKey2 = new OASProjectServiceAccountApiKey();

        System.assertEquals(false, projectServiceAccountApiKey1.equals('foo'));
        System.assertEquals(false, projectServiceAccountApiKey2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectServiceAccountApiKey projectServiceAccountApiKey1 = OASProjectServiceAccountApiKey.getExample();
        OASProjectServiceAccountApiKey projectServiceAccountApiKey2 = new OASProjectServiceAccountApiKey();
        OASProjectServiceAccountApiKey projectServiceAccountApiKey3;

        System.assertEquals(false, projectServiceAccountApiKey1.equals(projectServiceAccountApiKey3));
        System.assertEquals(false, projectServiceAccountApiKey2.equals(projectServiceAccountApiKey3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectServiceAccountApiKey projectServiceAccountApiKey1 = OASProjectServiceAccountApiKey.getExample();
        OASProjectServiceAccountApiKey projectServiceAccountApiKey2 = new OASProjectServiceAccountApiKey();

        System.assertEquals(projectServiceAccountApiKey1.hashCode(), projectServiceAccountApiKey1.hashCode());
        System.assertEquals(projectServiceAccountApiKey2.hashCode(), projectServiceAccountApiKey2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectServiceAccountApiKey projectServiceAccountApiKey1 = OASProjectServiceAccountApiKey.getExample();
        OASProjectServiceAccountApiKey projectServiceAccountApiKey2 = OASProjectServiceAccountApiKey.getExample();
        OASProjectServiceAccountApiKey projectServiceAccountApiKey3 = new OASProjectServiceAccountApiKey();
        OASProjectServiceAccountApiKey projectServiceAccountApiKey4 = new OASProjectServiceAccountApiKey();

        System.assert(projectServiceAccountApiKey1.equals(projectServiceAccountApiKey2));
        System.assert(projectServiceAccountApiKey3.equals(projectServiceAccountApiKey4));
        System.assertEquals(projectServiceAccountApiKey1.hashCode(), projectServiceAccountApiKey2.hashCode());
        System.assertEquals(projectServiceAccountApiKey3.hashCode(), projectServiceAccountApiKey4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectServiceAccountApiKey projectServiceAccountApiKey = new OASProjectServiceAccountApiKey();
        Map<String, String> x-property-mappings = projectServiceAccountApiKey.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
    }
}
