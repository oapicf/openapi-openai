@isTest
private class OASOpenAIFileTest {
    @isTest
    private static void equalsSameInstance() {
        OASOpenAIFile openAIFile1 = OASOpenAIFile.getExample();
        OASOpenAIFile openAIFile2 = openAIFile1;
        OASOpenAIFile openAIFile3 = new OASOpenAIFile();
        OASOpenAIFile openAIFile4 = openAIFile3;

        System.assert(openAIFile1.equals(openAIFile2));
        System.assert(openAIFile2.equals(openAIFile1));
        System.assert(openAIFile1.equals(openAIFile1));
        System.assert(openAIFile3.equals(openAIFile4));
        System.assert(openAIFile4.equals(openAIFile3));
        System.assert(openAIFile3.equals(openAIFile3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOpenAIFile openAIFile1 = OASOpenAIFile.getExample();
        OASOpenAIFile openAIFile2 = OASOpenAIFile.getExample();
        OASOpenAIFile openAIFile3 = new OASOpenAIFile();
        OASOpenAIFile openAIFile4 = new OASOpenAIFile();

        System.assert(openAIFile1.equals(openAIFile2));
        System.assert(openAIFile2.equals(openAIFile1));
        System.assert(openAIFile3.equals(openAIFile4));
        System.assert(openAIFile4.equals(openAIFile3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOpenAIFile openAIFile1 = OASOpenAIFile.getExample();
        OASOpenAIFile openAIFile2 = new OASOpenAIFile();

        System.assertEquals(false, openAIFile1.equals('foo'));
        System.assertEquals(false, openAIFile2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOpenAIFile openAIFile1 = OASOpenAIFile.getExample();
        OASOpenAIFile openAIFile2 = new OASOpenAIFile();
        OASOpenAIFile openAIFile3;

        System.assertEquals(false, openAIFile1.equals(openAIFile3));
        System.assertEquals(false, openAIFile2.equals(openAIFile3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOpenAIFile openAIFile1 = OASOpenAIFile.getExample();
        OASOpenAIFile openAIFile2 = new OASOpenAIFile();

        System.assertEquals(openAIFile1.hashCode(), openAIFile1.hashCode());
        System.assertEquals(openAIFile2.hashCode(), openAIFile2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOpenAIFile openAIFile1 = OASOpenAIFile.getExample();
        OASOpenAIFile openAIFile2 = OASOpenAIFile.getExample();
        OASOpenAIFile openAIFile3 = new OASOpenAIFile();
        OASOpenAIFile openAIFile4 = new OASOpenAIFile();

        System.assert(openAIFile1.equals(openAIFile2));
        System.assert(openAIFile3.equals(openAIFile4));
        System.assertEquals(openAIFile1.hashCode(), openAIFile2.hashCode());
        System.assertEquals(openAIFile3.hashCode(), openAIFile4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOpenAIFile openAIFile = new OASOpenAIFile();
        Map<String, String> x-property-mappings = openAIFile.getx-property-mappings();
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('statusDetails', x-property-mappings.get('status_details'));
    }
}
