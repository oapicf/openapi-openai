@isTest
private class OASListModelsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASListModelsResponse listModelsResponse1 = OASListModelsResponse.getExample();
        OASListModelsResponse listModelsResponse2 = listModelsResponse1;
        OASListModelsResponse listModelsResponse3 = new OASListModelsResponse();
        OASListModelsResponse listModelsResponse4 = listModelsResponse3;

        System.assert(listModelsResponse1.equals(listModelsResponse2));
        System.assert(listModelsResponse2.equals(listModelsResponse1));
        System.assert(listModelsResponse1.equals(listModelsResponse1));
        System.assert(listModelsResponse3.equals(listModelsResponse4));
        System.assert(listModelsResponse4.equals(listModelsResponse3));
        System.assert(listModelsResponse3.equals(listModelsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListModelsResponse listModelsResponse1 = OASListModelsResponse.getExample();
        OASListModelsResponse listModelsResponse2 = OASListModelsResponse.getExample();
        OASListModelsResponse listModelsResponse3 = new OASListModelsResponse();
        OASListModelsResponse listModelsResponse4 = new OASListModelsResponse();

        System.assert(listModelsResponse1.equals(listModelsResponse2));
        System.assert(listModelsResponse2.equals(listModelsResponse1));
        System.assert(listModelsResponse3.equals(listModelsResponse4));
        System.assert(listModelsResponse4.equals(listModelsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListModelsResponse listModelsResponse1 = OASListModelsResponse.getExample();
        OASListModelsResponse listModelsResponse2 = new OASListModelsResponse();

        System.assertEquals(false, listModelsResponse1.equals('foo'));
        System.assertEquals(false, listModelsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListModelsResponse listModelsResponse1 = OASListModelsResponse.getExample();
        OASListModelsResponse listModelsResponse2 = new OASListModelsResponse();
        OASListModelsResponse listModelsResponse3;

        System.assertEquals(false, listModelsResponse1.equals(listModelsResponse3));
        System.assertEquals(false, listModelsResponse2.equals(listModelsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListModelsResponse listModelsResponse1 = OASListModelsResponse.getExample();
        OASListModelsResponse listModelsResponse2 = new OASListModelsResponse();

        System.assertEquals(listModelsResponse1.hashCode(), listModelsResponse1.hashCode());
        System.assertEquals(listModelsResponse2.hashCode(), listModelsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListModelsResponse listModelsResponse1 = OASListModelsResponse.getExample();
        OASListModelsResponse listModelsResponse2 = OASListModelsResponse.getExample();
        OASListModelsResponse listModelsResponse3 = new OASListModelsResponse();
        OASListModelsResponse listModelsResponse4 = new OASListModelsResponse();

        System.assert(listModelsResponse1.equals(listModelsResponse2));
        System.assert(listModelsResponse3.equals(listModelsResponse4));
        System.assertEquals(listModelsResponse1.hashCode(), listModelsResponse2.hashCode());
        System.assertEquals(listModelsResponse3.hashCode(), listModelsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListModelsResponse listModelsResponse = new OASListModelsResponse();
        Map<String, String> x-property-mappings = listModelsResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListModelsResponse listModelsResponse = new OASListModelsResponse();
        System.assertEquals(new List<OASModel>(), listModelsResponse.data);
        System.assertEquals(null, listModelsResponse.r_object);
    }
}
