@isTest
private class OASProjectServiceAccountTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectServiceAccount projectServiceAccount1 = OASProjectServiceAccount.getExample();
        OASProjectServiceAccount projectServiceAccount2 = projectServiceAccount1;
        OASProjectServiceAccount projectServiceAccount3 = new OASProjectServiceAccount();
        OASProjectServiceAccount projectServiceAccount4 = projectServiceAccount3;

        System.assert(projectServiceAccount1.equals(projectServiceAccount2));
        System.assert(projectServiceAccount2.equals(projectServiceAccount1));
        System.assert(projectServiceAccount1.equals(projectServiceAccount1));
        System.assert(projectServiceAccount3.equals(projectServiceAccount4));
        System.assert(projectServiceAccount4.equals(projectServiceAccount3));
        System.assert(projectServiceAccount3.equals(projectServiceAccount3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectServiceAccount projectServiceAccount1 = OASProjectServiceAccount.getExample();
        OASProjectServiceAccount projectServiceAccount2 = OASProjectServiceAccount.getExample();
        OASProjectServiceAccount projectServiceAccount3 = new OASProjectServiceAccount();
        OASProjectServiceAccount projectServiceAccount4 = new OASProjectServiceAccount();

        System.assert(projectServiceAccount1.equals(projectServiceAccount2));
        System.assert(projectServiceAccount2.equals(projectServiceAccount1));
        System.assert(projectServiceAccount3.equals(projectServiceAccount4));
        System.assert(projectServiceAccount4.equals(projectServiceAccount3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectServiceAccount projectServiceAccount1 = OASProjectServiceAccount.getExample();
        OASProjectServiceAccount projectServiceAccount2 = new OASProjectServiceAccount();

        System.assertEquals(false, projectServiceAccount1.equals('foo'));
        System.assertEquals(false, projectServiceAccount2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectServiceAccount projectServiceAccount1 = OASProjectServiceAccount.getExample();
        OASProjectServiceAccount projectServiceAccount2 = new OASProjectServiceAccount();
        OASProjectServiceAccount projectServiceAccount3;

        System.assertEquals(false, projectServiceAccount1.equals(projectServiceAccount3));
        System.assertEquals(false, projectServiceAccount2.equals(projectServiceAccount3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectServiceAccount projectServiceAccount1 = OASProjectServiceAccount.getExample();
        OASProjectServiceAccount projectServiceAccount2 = new OASProjectServiceAccount();

        System.assertEquals(projectServiceAccount1.hashCode(), projectServiceAccount1.hashCode());
        System.assertEquals(projectServiceAccount2.hashCode(), projectServiceAccount2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectServiceAccount projectServiceAccount1 = OASProjectServiceAccount.getExample();
        OASProjectServiceAccount projectServiceAccount2 = OASProjectServiceAccount.getExample();
        OASProjectServiceAccount projectServiceAccount3 = new OASProjectServiceAccount();
        OASProjectServiceAccount projectServiceAccount4 = new OASProjectServiceAccount();

        System.assert(projectServiceAccount1.equals(projectServiceAccount2));
        System.assert(projectServiceAccount3.equals(projectServiceAccount4));
        System.assertEquals(projectServiceAccount1.hashCode(), projectServiceAccount2.hashCode());
        System.assertEquals(projectServiceAccount3.hashCode(), projectServiceAccount4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectServiceAccount projectServiceAccount = new OASProjectServiceAccount();
        Map<String, String> x-property-mappings = projectServiceAccount.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
    }
}
