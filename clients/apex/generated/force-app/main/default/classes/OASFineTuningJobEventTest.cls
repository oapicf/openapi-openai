@isTest
private class OASFineTuningJobEventTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuningJobEvent fineTuningJobEvent1 = OASFineTuningJobEvent.getExample();
        OASFineTuningJobEvent fineTuningJobEvent2 = fineTuningJobEvent1;
        OASFineTuningJobEvent fineTuningJobEvent3 = new OASFineTuningJobEvent();
        OASFineTuningJobEvent fineTuningJobEvent4 = fineTuningJobEvent3;

        System.assert(fineTuningJobEvent1.equals(fineTuningJobEvent2));
        System.assert(fineTuningJobEvent2.equals(fineTuningJobEvent1));
        System.assert(fineTuningJobEvent1.equals(fineTuningJobEvent1));
        System.assert(fineTuningJobEvent3.equals(fineTuningJobEvent4));
        System.assert(fineTuningJobEvent4.equals(fineTuningJobEvent3));
        System.assert(fineTuningJobEvent3.equals(fineTuningJobEvent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuningJobEvent fineTuningJobEvent1 = OASFineTuningJobEvent.getExample();
        OASFineTuningJobEvent fineTuningJobEvent2 = OASFineTuningJobEvent.getExample();
        OASFineTuningJobEvent fineTuningJobEvent3 = new OASFineTuningJobEvent();
        OASFineTuningJobEvent fineTuningJobEvent4 = new OASFineTuningJobEvent();

        System.assert(fineTuningJobEvent1.equals(fineTuningJobEvent2));
        System.assert(fineTuningJobEvent2.equals(fineTuningJobEvent1));
        System.assert(fineTuningJobEvent3.equals(fineTuningJobEvent4));
        System.assert(fineTuningJobEvent4.equals(fineTuningJobEvent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuningJobEvent fineTuningJobEvent1 = OASFineTuningJobEvent.getExample();
        OASFineTuningJobEvent fineTuningJobEvent2 = new OASFineTuningJobEvent();

        System.assertEquals(false, fineTuningJobEvent1.equals('foo'));
        System.assertEquals(false, fineTuningJobEvent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuningJobEvent fineTuningJobEvent1 = OASFineTuningJobEvent.getExample();
        OASFineTuningJobEvent fineTuningJobEvent2 = new OASFineTuningJobEvent();
        OASFineTuningJobEvent fineTuningJobEvent3;

        System.assertEquals(false, fineTuningJobEvent1.equals(fineTuningJobEvent3));
        System.assertEquals(false, fineTuningJobEvent2.equals(fineTuningJobEvent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuningJobEvent fineTuningJobEvent1 = OASFineTuningJobEvent.getExample();
        OASFineTuningJobEvent fineTuningJobEvent2 = new OASFineTuningJobEvent();

        System.assertEquals(fineTuningJobEvent1.hashCode(), fineTuningJobEvent1.hashCode());
        System.assertEquals(fineTuningJobEvent2.hashCode(), fineTuningJobEvent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuningJobEvent fineTuningJobEvent1 = OASFineTuningJobEvent.getExample();
        OASFineTuningJobEvent fineTuningJobEvent2 = OASFineTuningJobEvent.getExample();
        OASFineTuningJobEvent fineTuningJobEvent3 = new OASFineTuningJobEvent();
        OASFineTuningJobEvent fineTuningJobEvent4 = new OASFineTuningJobEvent();

        System.assert(fineTuningJobEvent1.equals(fineTuningJobEvent2));
        System.assert(fineTuningJobEvent3.equals(fineTuningJobEvent4));
        System.assertEquals(fineTuningJobEvent1.hashCode(), fineTuningJobEvent2.hashCode());
        System.assertEquals(fineTuningJobEvent3.hashCode(), fineTuningJobEvent4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFineTuningJobEvent fineTuningJobEvent = new OASFineTuningJobEvent();
        Map<String, String> x-property-mappings = fineTuningJobEvent.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
    }
}
