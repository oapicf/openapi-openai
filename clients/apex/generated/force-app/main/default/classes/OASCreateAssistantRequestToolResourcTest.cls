@isTest
private class OASCreateAssistantRequestToolResourcTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources1 = OASCreateAssistantRequestToolResourc.getExample();
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources2 = createAssistantRequestToolResources1;
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources3 = new OASCreateAssistantRequestToolResourc();
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources4 = createAssistantRequestToolResources3;

        System.assert(createAssistantRequestToolResources1.equals(createAssistantRequestToolResources2));
        System.assert(createAssistantRequestToolResources2.equals(createAssistantRequestToolResources1));
        System.assert(createAssistantRequestToolResources1.equals(createAssistantRequestToolResources1));
        System.assert(createAssistantRequestToolResources3.equals(createAssistantRequestToolResources4));
        System.assert(createAssistantRequestToolResources4.equals(createAssistantRequestToolResources3));
        System.assert(createAssistantRequestToolResources3.equals(createAssistantRequestToolResources3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources1 = OASCreateAssistantRequestToolResourc.getExample();
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources2 = OASCreateAssistantRequestToolResourc.getExample();
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources3 = new OASCreateAssistantRequestToolResourc();
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources4 = new OASCreateAssistantRequestToolResourc();

        System.assert(createAssistantRequestToolResources1.equals(createAssistantRequestToolResources2));
        System.assert(createAssistantRequestToolResources2.equals(createAssistantRequestToolResources1));
        System.assert(createAssistantRequestToolResources3.equals(createAssistantRequestToolResources4));
        System.assert(createAssistantRequestToolResources4.equals(createAssistantRequestToolResources3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources1 = OASCreateAssistantRequestToolResourc.getExample();
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources2 = new OASCreateAssistantRequestToolResourc();

        System.assertEquals(false, createAssistantRequestToolResources1.equals('foo'));
        System.assertEquals(false, createAssistantRequestToolResources2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources1 = OASCreateAssistantRequestToolResourc.getExample();
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources2 = new OASCreateAssistantRequestToolResourc();
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources3;

        System.assertEquals(false, createAssistantRequestToolResources1.equals(createAssistantRequestToolResources3));
        System.assertEquals(false, createAssistantRequestToolResources2.equals(createAssistantRequestToolResources3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources1 = OASCreateAssistantRequestToolResourc.getExample();
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources2 = new OASCreateAssistantRequestToolResourc();

        System.assertEquals(createAssistantRequestToolResources1.hashCode(), createAssistantRequestToolResources1.hashCode());
        System.assertEquals(createAssistantRequestToolResources2.hashCode(), createAssistantRequestToolResources2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources1 = OASCreateAssistantRequestToolResourc.getExample();
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources2 = OASCreateAssistantRequestToolResourc.getExample();
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources3 = new OASCreateAssistantRequestToolResourc();
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources4 = new OASCreateAssistantRequestToolResourc();

        System.assert(createAssistantRequestToolResources1.equals(createAssistantRequestToolResources2));
        System.assert(createAssistantRequestToolResources3.equals(createAssistantRequestToolResources4));
        System.assertEquals(createAssistantRequestToolResources1.hashCode(), createAssistantRequestToolResources2.hashCode());
        System.assertEquals(createAssistantRequestToolResources3.hashCode(), createAssistantRequestToolResources4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateAssistantRequestToolResourc createAssistantRequestToolResources = new OASCreateAssistantRequestToolResourc();
        Map<String, String> x-property-mappings = createAssistantRequestToolResources.getx-property-mappings();
        System.assertEquals('codeInterpreter', x-property-mappings.get('code_interpreter'));
        System.assertEquals('fileSearch', x-property-mappings.get('file_search'));
    }
}
