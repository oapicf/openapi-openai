@isTest
private class OASProjectApiKeyOwnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectApiKeyOwner projectApiKeyOwner1 = OASProjectApiKeyOwner.getExample();
        OASProjectApiKeyOwner projectApiKeyOwner2 = projectApiKeyOwner1;
        OASProjectApiKeyOwner projectApiKeyOwner3 = new OASProjectApiKeyOwner();
        OASProjectApiKeyOwner projectApiKeyOwner4 = projectApiKeyOwner3;

        System.assert(projectApiKeyOwner1.equals(projectApiKeyOwner2));
        System.assert(projectApiKeyOwner2.equals(projectApiKeyOwner1));
        System.assert(projectApiKeyOwner1.equals(projectApiKeyOwner1));
        System.assert(projectApiKeyOwner3.equals(projectApiKeyOwner4));
        System.assert(projectApiKeyOwner4.equals(projectApiKeyOwner3));
        System.assert(projectApiKeyOwner3.equals(projectApiKeyOwner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectApiKeyOwner projectApiKeyOwner1 = OASProjectApiKeyOwner.getExample();
        OASProjectApiKeyOwner projectApiKeyOwner2 = OASProjectApiKeyOwner.getExample();
        OASProjectApiKeyOwner projectApiKeyOwner3 = new OASProjectApiKeyOwner();
        OASProjectApiKeyOwner projectApiKeyOwner4 = new OASProjectApiKeyOwner();

        System.assert(projectApiKeyOwner1.equals(projectApiKeyOwner2));
        System.assert(projectApiKeyOwner2.equals(projectApiKeyOwner1));
        System.assert(projectApiKeyOwner3.equals(projectApiKeyOwner4));
        System.assert(projectApiKeyOwner4.equals(projectApiKeyOwner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectApiKeyOwner projectApiKeyOwner1 = OASProjectApiKeyOwner.getExample();
        OASProjectApiKeyOwner projectApiKeyOwner2 = new OASProjectApiKeyOwner();

        System.assertEquals(false, projectApiKeyOwner1.equals('foo'));
        System.assertEquals(false, projectApiKeyOwner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectApiKeyOwner projectApiKeyOwner1 = OASProjectApiKeyOwner.getExample();
        OASProjectApiKeyOwner projectApiKeyOwner2 = new OASProjectApiKeyOwner();
        OASProjectApiKeyOwner projectApiKeyOwner3;

        System.assertEquals(false, projectApiKeyOwner1.equals(projectApiKeyOwner3));
        System.assertEquals(false, projectApiKeyOwner2.equals(projectApiKeyOwner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectApiKeyOwner projectApiKeyOwner1 = OASProjectApiKeyOwner.getExample();
        OASProjectApiKeyOwner projectApiKeyOwner2 = new OASProjectApiKeyOwner();

        System.assertEquals(projectApiKeyOwner1.hashCode(), projectApiKeyOwner1.hashCode());
        System.assertEquals(projectApiKeyOwner2.hashCode(), projectApiKeyOwner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectApiKeyOwner projectApiKeyOwner1 = OASProjectApiKeyOwner.getExample();
        OASProjectApiKeyOwner projectApiKeyOwner2 = OASProjectApiKeyOwner.getExample();
        OASProjectApiKeyOwner projectApiKeyOwner3 = new OASProjectApiKeyOwner();
        OASProjectApiKeyOwner projectApiKeyOwner4 = new OASProjectApiKeyOwner();

        System.assert(projectApiKeyOwner1.equals(projectApiKeyOwner2));
        System.assert(projectApiKeyOwner3.equals(projectApiKeyOwner4));
        System.assertEquals(projectApiKeyOwner1.hashCode(), projectApiKeyOwner2.hashCode());
        System.assertEquals(projectApiKeyOwner3.hashCode(), projectApiKeyOwner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectApiKeyOwner projectApiKeyOwner = new OASProjectApiKeyOwner();
        Map<String, String> x-property-mappings = projectApiKeyOwner.getx-property-mappings();
        System.assertEquals('serviceAccount', x-property-mappings.get('service_account'));
    }
}
