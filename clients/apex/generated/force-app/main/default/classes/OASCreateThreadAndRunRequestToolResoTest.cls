@isTest
private class OASCreateThreadAndRunRequestToolResoTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources1 = OASCreateThreadAndRunRequestToolReso.getExample();
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources2 = createThreadAndRunRequestToolResources1;
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources3 = new OASCreateThreadAndRunRequestToolReso();
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources4 = createThreadAndRunRequestToolResources3;

        System.assert(createThreadAndRunRequestToolResources1.equals(createThreadAndRunRequestToolResources2));
        System.assert(createThreadAndRunRequestToolResources2.equals(createThreadAndRunRequestToolResources1));
        System.assert(createThreadAndRunRequestToolResources1.equals(createThreadAndRunRequestToolResources1));
        System.assert(createThreadAndRunRequestToolResources3.equals(createThreadAndRunRequestToolResources4));
        System.assert(createThreadAndRunRequestToolResources4.equals(createThreadAndRunRequestToolResources3));
        System.assert(createThreadAndRunRequestToolResources3.equals(createThreadAndRunRequestToolResources3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources1 = OASCreateThreadAndRunRequestToolReso.getExample();
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources2 = OASCreateThreadAndRunRequestToolReso.getExample();
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources3 = new OASCreateThreadAndRunRequestToolReso();
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources4 = new OASCreateThreadAndRunRequestToolReso();

        System.assert(createThreadAndRunRequestToolResources1.equals(createThreadAndRunRequestToolResources2));
        System.assert(createThreadAndRunRequestToolResources2.equals(createThreadAndRunRequestToolResources1));
        System.assert(createThreadAndRunRequestToolResources3.equals(createThreadAndRunRequestToolResources4));
        System.assert(createThreadAndRunRequestToolResources4.equals(createThreadAndRunRequestToolResources3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources1 = OASCreateThreadAndRunRequestToolReso.getExample();
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources2 = new OASCreateThreadAndRunRequestToolReso();

        System.assertEquals(false, createThreadAndRunRequestToolResources1.equals('foo'));
        System.assertEquals(false, createThreadAndRunRequestToolResources2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources1 = OASCreateThreadAndRunRequestToolReso.getExample();
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources2 = new OASCreateThreadAndRunRequestToolReso();
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources3;

        System.assertEquals(false, createThreadAndRunRequestToolResources1.equals(createThreadAndRunRequestToolResources3));
        System.assertEquals(false, createThreadAndRunRequestToolResources2.equals(createThreadAndRunRequestToolResources3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources1 = OASCreateThreadAndRunRequestToolReso.getExample();
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources2 = new OASCreateThreadAndRunRequestToolReso();

        System.assertEquals(createThreadAndRunRequestToolResources1.hashCode(), createThreadAndRunRequestToolResources1.hashCode());
        System.assertEquals(createThreadAndRunRequestToolResources2.hashCode(), createThreadAndRunRequestToolResources2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources1 = OASCreateThreadAndRunRequestToolReso.getExample();
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources2 = OASCreateThreadAndRunRequestToolReso.getExample();
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources3 = new OASCreateThreadAndRunRequestToolReso();
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources4 = new OASCreateThreadAndRunRequestToolReso();

        System.assert(createThreadAndRunRequestToolResources1.equals(createThreadAndRunRequestToolResources2));
        System.assert(createThreadAndRunRequestToolResources3.equals(createThreadAndRunRequestToolResources4));
        System.assertEquals(createThreadAndRunRequestToolResources1.hashCode(), createThreadAndRunRequestToolResources2.hashCode());
        System.assertEquals(createThreadAndRunRequestToolResources3.hashCode(), createThreadAndRunRequestToolResources4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateThreadAndRunRequestToolReso createThreadAndRunRequestToolResources = new OASCreateThreadAndRunRequestToolReso();
        Map<String, String> x-property-mappings = createThreadAndRunRequestToolResources.getx-property-mappings();
        System.assertEquals('codeInterpreter', x-property-mappings.get('code_interpreter'));
        System.assertEquals('fileSearch', x-property-mappings.get('file_search'));
    }
}
