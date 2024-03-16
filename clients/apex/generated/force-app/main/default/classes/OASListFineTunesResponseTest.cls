@isTest
private class OASListFineTunesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASListFineTunesResponse listFineTunesResponse1 = OASListFineTunesResponse.getExample();
        OASListFineTunesResponse listFineTunesResponse2 = listFineTunesResponse1;
        OASListFineTunesResponse listFineTunesResponse3 = new OASListFineTunesResponse();
        OASListFineTunesResponse listFineTunesResponse4 = listFineTunesResponse3;

        System.assert(listFineTunesResponse1.equals(listFineTunesResponse2));
        System.assert(listFineTunesResponse2.equals(listFineTunesResponse1));
        System.assert(listFineTunesResponse1.equals(listFineTunesResponse1));
        System.assert(listFineTunesResponse3.equals(listFineTunesResponse4));
        System.assert(listFineTunesResponse4.equals(listFineTunesResponse3));
        System.assert(listFineTunesResponse3.equals(listFineTunesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASListFineTunesResponse listFineTunesResponse1 = OASListFineTunesResponse.getExample();
        OASListFineTunesResponse listFineTunesResponse2 = OASListFineTunesResponse.getExample();
        OASListFineTunesResponse listFineTunesResponse3 = new OASListFineTunesResponse();
        OASListFineTunesResponse listFineTunesResponse4 = new OASListFineTunesResponse();

        System.assert(listFineTunesResponse1.equals(listFineTunesResponse2));
        System.assert(listFineTunesResponse2.equals(listFineTunesResponse1));
        System.assert(listFineTunesResponse3.equals(listFineTunesResponse4));
        System.assert(listFineTunesResponse4.equals(listFineTunesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASListFineTunesResponse listFineTunesResponse1 = OASListFineTunesResponse.getExample();
        OASListFineTunesResponse listFineTunesResponse2 = new OASListFineTunesResponse();

        System.assertEquals(false, listFineTunesResponse1.equals('foo'));
        System.assertEquals(false, listFineTunesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASListFineTunesResponse listFineTunesResponse1 = OASListFineTunesResponse.getExample();
        OASListFineTunesResponse listFineTunesResponse2 = new OASListFineTunesResponse();
        OASListFineTunesResponse listFineTunesResponse3;

        System.assertEquals(false, listFineTunesResponse1.equals(listFineTunesResponse3));
        System.assertEquals(false, listFineTunesResponse2.equals(listFineTunesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASListFineTunesResponse listFineTunesResponse1 = OASListFineTunesResponse.getExample();
        OASListFineTunesResponse listFineTunesResponse2 = new OASListFineTunesResponse();

        System.assertEquals(listFineTunesResponse1.hashCode(), listFineTunesResponse1.hashCode());
        System.assertEquals(listFineTunesResponse2.hashCode(), listFineTunesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASListFineTunesResponse listFineTunesResponse1 = OASListFineTunesResponse.getExample();
        OASListFineTunesResponse listFineTunesResponse2 = OASListFineTunesResponse.getExample();
        OASListFineTunesResponse listFineTunesResponse3 = new OASListFineTunesResponse();
        OASListFineTunesResponse listFineTunesResponse4 = new OASListFineTunesResponse();

        System.assert(listFineTunesResponse1.equals(listFineTunesResponse2));
        System.assert(listFineTunesResponse3.equals(listFineTunesResponse4));
        System.assertEquals(listFineTunesResponse1.hashCode(), listFineTunesResponse2.hashCode());
        System.assertEquals(listFineTunesResponse3.hashCode(), listFineTunesResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASListFineTunesResponse listFineTunesResponse = new OASListFineTunesResponse();
        Map<String, String> x-property-mappings = listFineTunesResponse.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASListFineTunesResponse listFineTunesResponse = new OASListFineTunesResponse();
        System.assertEquals(new List<OASFineTune>(), listFineTunesResponse.data);
        System.assertEquals(null, listFineTunesResponse.r_object);
    }
}
