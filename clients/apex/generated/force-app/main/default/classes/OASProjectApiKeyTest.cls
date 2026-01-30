@isTest
private class OASProjectApiKeyTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectApiKey projectApiKey1 = OASProjectApiKey.getExample();
        OASProjectApiKey projectApiKey2 = projectApiKey1;
        OASProjectApiKey projectApiKey3 = new OASProjectApiKey();
        OASProjectApiKey projectApiKey4 = projectApiKey3;

        System.assert(projectApiKey1.equals(projectApiKey2));
        System.assert(projectApiKey2.equals(projectApiKey1));
        System.assert(projectApiKey1.equals(projectApiKey1));
        System.assert(projectApiKey3.equals(projectApiKey4));
        System.assert(projectApiKey4.equals(projectApiKey3));
        System.assert(projectApiKey3.equals(projectApiKey3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectApiKey projectApiKey1 = OASProjectApiKey.getExample();
        OASProjectApiKey projectApiKey2 = OASProjectApiKey.getExample();
        OASProjectApiKey projectApiKey3 = new OASProjectApiKey();
        OASProjectApiKey projectApiKey4 = new OASProjectApiKey();

        System.assert(projectApiKey1.equals(projectApiKey2));
        System.assert(projectApiKey2.equals(projectApiKey1));
        System.assert(projectApiKey3.equals(projectApiKey4));
        System.assert(projectApiKey4.equals(projectApiKey3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectApiKey projectApiKey1 = OASProjectApiKey.getExample();
        OASProjectApiKey projectApiKey2 = new OASProjectApiKey();

        System.assertEquals(false, projectApiKey1.equals('foo'));
        System.assertEquals(false, projectApiKey2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectApiKey projectApiKey1 = OASProjectApiKey.getExample();
        OASProjectApiKey projectApiKey2 = new OASProjectApiKey();
        OASProjectApiKey projectApiKey3;

        System.assertEquals(false, projectApiKey1.equals(projectApiKey3));
        System.assertEquals(false, projectApiKey2.equals(projectApiKey3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectApiKey projectApiKey1 = OASProjectApiKey.getExample();
        OASProjectApiKey projectApiKey2 = new OASProjectApiKey();

        System.assertEquals(projectApiKey1.hashCode(), projectApiKey1.hashCode());
        System.assertEquals(projectApiKey2.hashCode(), projectApiKey2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectApiKey projectApiKey1 = OASProjectApiKey.getExample();
        OASProjectApiKey projectApiKey2 = OASProjectApiKey.getExample();
        OASProjectApiKey projectApiKey3 = new OASProjectApiKey();
        OASProjectApiKey projectApiKey4 = new OASProjectApiKey();

        System.assert(projectApiKey1.equals(projectApiKey2));
        System.assert(projectApiKey3.equals(projectApiKey4));
        System.assertEquals(projectApiKey1.hashCode(), projectApiKey2.hashCode());
        System.assertEquals(projectApiKey3.hashCode(), projectApiKey4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectApiKey projectApiKey = new OASProjectApiKey();
        Map<String, String> x-property-mappings = projectApiKey.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('redactedValue', x-property-mappings.get('redacted_value'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
    }
}
