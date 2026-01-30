@isTest
private class OASProjectUserTest {
    @isTest
    private static void equalsSameInstance() {
        OASProjectUser projectUser1 = OASProjectUser.getExample();
        OASProjectUser projectUser2 = projectUser1;
        OASProjectUser projectUser3 = new OASProjectUser();
        OASProjectUser projectUser4 = projectUser3;

        System.assert(projectUser1.equals(projectUser2));
        System.assert(projectUser2.equals(projectUser1));
        System.assert(projectUser1.equals(projectUser1));
        System.assert(projectUser3.equals(projectUser4));
        System.assert(projectUser4.equals(projectUser3));
        System.assert(projectUser3.equals(projectUser3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProjectUser projectUser1 = OASProjectUser.getExample();
        OASProjectUser projectUser2 = OASProjectUser.getExample();
        OASProjectUser projectUser3 = new OASProjectUser();
        OASProjectUser projectUser4 = new OASProjectUser();

        System.assert(projectUser1.equals(projectUser2));
        System.assert(projectUser2.equals(projectUser1));
        System.assert(projectUser3.equals(projectUser4));
        System.assert(projectUser4.equals(projectUser3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProjectUser projectUser1 = OASProjectUser.getExample();
        OASProjectUser projectUser2 = new OASProjectUser();

        System.assertEquals(false, projectUser1.equals('foo'));
        System.assertEquals(false, projectUser2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProjectUser projectUser1 = OASProjectUser.getExample();
        OASProjectUser projectUser2 = new OASProjectUser();
        OASProjectUser projectUser3;

        System.assertEquals(false, projectUser1.equals(projectUser3));
        System.assertEquals(false, projectUser2.equals(projectUser3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProjectUser projectUser1 = OASProjectUser.getExample();
        OASProjectUser projectUser2 = new OASProjectUser();

        System.assertEquals(projectUser1.hashCode(), projectUser1.hashCode());
        System.assertEquals(projectUser2.hashCode(), projectUser2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProjectUser projectUser1 = OASProjectUser.getExample();
        OASProjectUser projectUser2 = OASProjectUser.getExample();
        OASProjectUser projectUser3 = new OASProjectUser();
        OASProjectUser projectUser4 = new OASProjectUser();

        System.assert(projectUser1.equals(projectUser2));
        System.assert(projectUser3.equals(projectUser4));
        System.assertEquals(projectUser1.hashCode(), projectUser2.hashCode());
        System.assertEquals(projectUser3.hashCode(), projectUser4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProjectUser projectUser = new OASProjectUser();
        Map<String, String> x-property-mappings = projectUser.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('addedAt', x-property-mappings.get('added_at'));
    }
}
