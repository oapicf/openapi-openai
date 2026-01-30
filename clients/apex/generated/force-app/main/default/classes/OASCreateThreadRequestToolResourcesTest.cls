@isTest
private class OASCreateThreadRequestToolResourcesTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateThreadRequestToolResources createThreadRequestToolResources1 = OASCreateThreadRequestToolResources.getExample();
        OASCreateThreadRequestToolResources createThreadRequestToolResources2 = createThreadRequestToolResources1;
        OASCreateThreadRequestToolResources createThreadRequestToolResources3 = new OASCreateThreadRequestToolResources();
        OASCreateThreadRequestToolResources createThreadRequestToolResources4 = createThreadRequestToolResources3;

        System.assert(createThreadRequestToolResources1.equals(createThreadRequestToolResources2));
        System.assert(createThreadRequestToolResources2.equals(createThreadRequestToolResources1));
        System.assert(createThreadRequestToolResources1.equals(createThreadRequestToolResources1));
        System.assert(createThreadRequestToolResources3.equals(createThreadRequestToolResources4));
        System.assert(createThreadRequestToolResources4.equals(createThreadRequestToolResources3));
        System.assert(createThreadRequestToolResources3.equals(createThreadRequestToolResources3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateThreadRequestToolResources createThreadRequestToolResources1 = OASCreateThreadRequestToolResources.getExample();
        OASCreateThreadRequestToolResources createThreadRequestToolResources2 = OASCreateThreadRequestToolResources.getExample();
        OASCreateThreadRequestToolResources createThreadRequestToolResources3 = new OASCreateThreadRequestToolResources();
        OASCreateThreadRequestToolResources createThreadRequestToolResources4 = new OASCreateThreadRequestToolResources();

        System.assert(createThreadRequestToolResources1.equals(createThreadRequestToolResources2));
        System.assert(createThreadRequestToolResources2.equals(createThreadRequestToolResources1));
        System.assert(createThreadRequestToolResources3.equals(createThreadRequestToolResources4));
        System.assert(createThreadRequestToolResources4.equals(createThreadRequestToolResources3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateThreadRequestToolResources createThreadRequestToolResources1 = OASCreateThreadRequestToolResources.getExample();
        OASCreateThreadRequestToolResources createThreadRequestToolResources2 = new OASCreateThreadRequestToolResources();

        System.assertEquals(false, createThreadRequestToolResources1.equals('foo'));
        System.assertEquals(false, createThreadRequestToolResources2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateThreadRequestToolResources createThreadRequestToolResources1 = OASCreateThreadRequestToolResources.getExample();
        OASCreateThreadRequestToolResources createThreadRequestToolResources2 = new OASCreateThreadRequestToolResources();
        OASCreateThreadRequestToolResources createThreadRequestToolResources3;

        System.assertEquals(false, createThreadRequestToolResources1.equals(createThreadRequestToolResources3));
        System.assertEquals(false, createThreadRequestToolResources2.equals(createThreadRequestToolResources3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateThreadRequestToolResources createThreadRequestToolResources1 = OASCreateThreadRequestToolResources.getExample();
        OASCreateThreadRequestToolResources createThreadRequestToolResources2 = new OASCreateThreadRequestToolResources();

        System.assertEquals(createThreadRequestToolResources1.hashCode(), createThreadRequestToolResources1.hashCode());
        System.assertEquals(createThreadRequestToolResources2.hashCode(), createThreadRequestToolResources2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateThreadRequestToolResources createThreadRequestToolResources1 = OASCreateThreadRequestToolResources.getExample();
        OASCreateThreadRequestToolResources createThreadRequestToolResources2 = OASCreateThreadRequestToolResources.getExample();
        OASCreateThreadRequestToolResources createThreadRequestToolResources3 = new OASCreateThreadRequestToolResources();
        OASCreateThreadRequestToolResources createThreadRequestToolResources4 = new OASCreateThreadRequestToolResources();

        System.assert(createThreadRequestToolResources1.equals(createThreadRequestToolResources2));
        System.assert(createThreadRequestToolResources3.equals(createThreadRequestToolResources4));
        System.assertEquals(createThreadRequestToolResources1.hashCode(), createThreadRequestToolResources2.hashCode());
        System.assertEquals(createThreadRequestToolResources3.hashCode(), createThreadRequestToolResources4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateThreadRequestToolResources createThreadRequestToolResources = new OASCreateThreadRequestToolResources();
        Map<String, String> x-property-mappings = createThreadRequestToolResources.getx-property-mappings();
        System.assertEquals('codeInterpreter', x-property-mappings.get('code_interpreter'));
        System.assertEquals('fileSearch', x-property-mappings.get('file_search'));
    }
}
