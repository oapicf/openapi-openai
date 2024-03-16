@isTest
private class OASListFilesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASListFilesResponse listFilesResponse1 = OASListFilesResponse.getExample();
        OASListFilesResponse listFilesResponse2 = listFilesResponse1;
        OASListFilesResponse listFilesResponse3 = new OASListFilesResponse();
        OASListFilesResponse listFilesResponse4 = listFilesResponse3;

        System.assert(listFilesResponse1.equals(listFilesResponse2));
        System.assert(listFilesResponse2.equals(listFilesResponse1));
        System.assert(listFilesResponse1.equals(listFilesResponse1));
        System.assert(listFilesResponse3.equals(listFilesResponse4));
        System.assert(listFilesResponse4.equals(listFilesResponse3));
        System.assert(listFilesResponse3.equals(listFilesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListFilesResponse listFilesResponse1 = OASListFilesResponse.getExample();
        OASListFilesResponse listFilesResponse2 = OASListFilesResponse.getExample();
        OASListFilesResponse listFilesResponse3 = new OASListFilesResponse();
        OASListFilesResponse listFilesResponse4 = new OASListFilesResponse();

        System.assert(listFilesResponse1.equals(listFilesResponse2));
        System.assert(listFilesResponse2.equals(listFilesResponse1));
        System.assert(listFilesResponse3.equals(listFilesResponse4));
        System.assert(listFilesResponse4.equals(listFilesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListFilesResponse listFilesResponse1 = OASListFilesResponse.getExample();
        OASListFilesResponse listFilesResponse2 = new OASListFilesResponse();

        System.assertEquals(false, listFilesResponse1.equals('foo'));
        System.assertEquals(false, listFilesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListFilesResponse listFilesResponse1 = OASListFilesResponse.getExample();
        OASListFilesResponse listFilesResponse2 = new OASListFilesResponse();
        OASListFilesResponse listFilesResponse3;

        System.assertEquals(false, listFilesResponse1.equals(listFilesResponse3));
        System.assertEquals(false, listFilesResponse2.equals(listFilesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListFilesResponse listFilesResponse1 = OASListFilesResponse.getExample();
        OASListFilesResponse listFilesResponse2 = new OASListFilesResponse();

        System.assertEquals(listFilesResponse1.hashCode(), listFilesResponse1.hashCode());
        System.assertEquals(listFilesResponse2.hashCode(), listFilesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListFilesResponse listFilesResponse1 = OASListFilesResponse.getExample();
        OASListFilesResponse listFilesResponse2 = OASListFilesResponse.getExample();
        OASListFilesResponse listFilesResponse3 = new OASListFilesResponse();
        OASListFilesResponse listFilesResponse4 = new OASListFilesResponse();

        System.assert(listFilesResponse1.equals(listFilesResponse2));
        System.assert(listFilesResponse3.equals(listFilesResponse4));
        System.assertEquals(listFilesResponse1.hashCode(), listFilesResponse2.hashCode());
        System.assertEquals(listFilesResponse3.hashCode(), listFilesResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListFilesResponse listFilesResponse = new OASListFilesResponse();
        Map<String, String> x-property-mappings = listFilesResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListFilesResponse listFilesResponse = new OASListFilesResponse();
        System.assertEquals(new List<OASOpenAIFile>(), listFilesResponse.data);
        System.assertEquals(null, listFilesResponse.r_object);
    }
}
