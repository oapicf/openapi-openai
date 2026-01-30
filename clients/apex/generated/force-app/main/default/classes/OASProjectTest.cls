@isTest
private class OASProjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASProject project1 = OASProject.getExample();
        OASProject project2 = project1;
        OASProject project3 = new OASProject();
        OASProject project4 = project3;

        System.assert(project1.equals(project2));
        System.assert(project2.equals(project1));
        System.assert(project1.equals(project1));
        System.assert(project3.equals(project4));
        System.assert(project4.equals(project3));
        System.assert(project3.equals(project3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProject project1 = OASProject.getExample();
        OASProject project2 = OASProject.getExample();
        OASProject project3 = new OASProject();
        OASProject project4 = new OASProject();

        System.assert(project1.equals(project2));
        System.assert(project2.equals(project1));
        System.assert(project3.equals(project4));
        System.assert(project4.equals(project3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProject project1 = OASProject.getExample();
        OASProject project2 = new OASProject();

        System.assertEquals(false, project1.equals('foo'));
        System.assertEquals(false, project2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProject project1 = OASProject.getExample();
        OASProject project2 = new OASProject();
        OASProject project3;

        System.assertEquals(false, project1.equals(project3));
        System.assertEquals(false, project2.equals(project3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProject project1 = OASProject.getExample();
        OASProject project2 = new OASProject();

        System.assertEquals(project1.hashCode(), project1.hashCode());
        System.assertEquals(project2.hashCode(), project2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProject project1 = OASProject.getExample();
        OASProject project2 = OASProject.getExample();
        OASProject project3 = new OASProject();
        OASProject project4 = new OASProject();

        System.assert(project1.equals(project2));
        System.assert(project3.equals(project4));
        System.assertEquals(project1.hashCode(), project2.hashCode());
        System.assertEquals(project3.hashCode(), project4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProject project = new OASProject();
        Map<String, String> x-property-mappings = project.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('archivedAt', x-property-mappings.get('archived_at'));
    }
}
