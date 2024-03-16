@isTest
private class OASFineTuneEventTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuneEvent fineTuneEvent1 = OASFineTuneEvent.getExample();
        OASFineTuneEvent fineTuneEvent2 = fineTuneEvent1;
        OASFineTuneEvent fineTuneEvent3 = new OASFineTuneEvent();
        OASFineTuneEvent fineTuneEvent4 = fineTuneEvent3;

        System.assert(fineTuneEvent1.equals(fineTuneEvent2));
        System.assert(fineTuneEvent2.equals(fineTuneEvent1));
        System.assert(fineTuneEvent1.equals(fineTuneEvent1));
        System.assert(fineTuneEvent3.equals(fineTuneEvent4));
        System.assert(fineTuneEvent4.equals(fineTuneEvent3));
        System.assert(fineTuneEvent3.equals(fineTuneEvent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuneEvent fineTuneEvent1 = OASFineTuneEvent.getExample();
        OASFineTuneEvent fineTuneEvent2 = OASFineTuneEvent.getExample();
        OASFineTuneEvent fineTuneEvent3 = new OASFineTuneEvent();
        OASFineTuneEvent fineTuneEvent4 = new OASFineTuneEvent();

        System.assert(fineTuneEvent1.equals(fineTuneEvent2));
        System.assert(fineTuneEvent2.equals(fineTuneEvent1));
        System.assert(fineTuneEvent3.equals(fineTuneEvent4));
        System.assert(fineTuneEvent4.equals(fineTuneEvent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuneEvent fineTuneEvent1 = OASFineTuneEvent.getExample();
        OASFineTuneEvent fineTuneEvent2 = new OASFineTuneEvent();

        System.assertEquals(false, fineTuneEvent1.equals('foo'));
        System.assertEquals(false, fineTuneEvent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuneEvent fineTuneEvent1 = OASFineTuneEvent.getExample();
        OASFineTuneEvent fineTuneEvent2 = new OASFineTuneEvent();
        OASFineTuneEvent fineTuneEvent3;

        System.assertEquals(false, fineTuneEvent1.equals(fineTuneEvent3));
        System.assertEquals(false, fineTuneEvent2.equals(fineTuneEvent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuneEvent fineTuneEvent1 = OASFineTuneEvent.getExample();
        OASFineTuneEvent fineTuneEvent2 = new OASFineTuneEvent();

        System.assertEquals(fineTuneEvent1.hashCode(), fineTuneEvent1.hashCode());
        System.assertEquals(fineTuneEvent2.hashCode(), fineTuneEvent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuneEvent fineTuneEvent1 = OASFineTuneEvent.getExample();
        OASFineTuneEvent fineTuneEvent2 = OASFineTuneEvent.getExample();
        OASFineTuneEvent fineTuneEvent3 = new OASFineTuneEvent();
        OASFineTuneEvent fineTuneEvent4 = new OASFineTuneEvent();

        System.assert(fineTuneEvent1.equals(fineTuneEvent2));
        System.assert(fineTuneEvent3.equals(fineTuneEvent4));
        System.assertEquals(fineTuneEvent1.hashCode(), fineTuneEvent2.hashCode());
        System.assertEquals(fineTuneEvent3.hashCode(), fineTuneEvent4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFineTuneEvent fineTuneEvent = new OASFineTuneEvent();
        Map<String, String> x-property-mappings = fineTuneEvent.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
    }
}
