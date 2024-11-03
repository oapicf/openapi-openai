@isTest
private class OASErrorEventTest {
    @isTest
    private static void equalsSameInstance() {
        OASErrorEvent errorEvent1 = OASErrorEvent.getExample();
        OASErrorEvent errorEvent2 = errorEvent1;
        OASErrorEvent errorEvent3 = new OASErrorEvent();
        OASErrorEvent errorEvent4 = errorEvent3;

        System.assert(errorEvent1.equals(errorEvent2));
        System.assert(errorEvent2.equals(errorEvent1));
        System.assert(errorEvent1.equals(errorEvent1));
        System.assert(errorEvent3.equals(errorEvent4));
        System.assert(errorEvent4.equals(errorEvent3));
        System.assert(errorEvent3.equals(errorEvent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASErrorEvent errorEvent1 = OASErrorEvent.getExample();
        OASErrorEvent errorEvent2 = OASErrorEvent.getExample();
        OASErrorEvent errorEvent3 = new OASErrorEvent();
        OASErrorEvent errorEvent4 = new OASErrorEvent();

        System.assert(errorEvent1.equals(errorEvent2));
        System.assert(errorEvent2.equals(errorEvent1));
        System.assert(errorEvent3.equals(errorEvent4));
        System.assert(errorEvent4.equals(errorEvent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASErrorEvent errorEvent1 = OASErrorEvent.getExample();
        OASErrorEvent errorEvent2 = new OASErrorEvent();

        System.assertEquals(false, errorEvent1.equals('foo'));
        System.assertEquals(false, errorEvent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASErrorEvent errorEvent1 = OASErrorEvent.getExample();
        OASErrorEvent errorEvent2 = new OASErrorEvent();
        OASErrorEvent errorEvent3;

        System.assertEquals(false, errorEvent1.equals(errorEvent3));
        System.assertEquals(false, errorEvent2.equals(errorEvent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASErrorEvent errorEvent1 = OASErrorEvent.getExample();
        OASErrorEvent errorEvent2 = new OASErrorEvent();

        System.assertEquals(errorEvent1.hashCode(), errorEvent1.hashCode());
        System.assertEquals(errorEvent2.hashCode(), errorEvent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASErrorEvent errorEvent1 = OASErrorEvent.getExample();
        OASErrorEvent errorEvent2 = OASErrorEvent.getExample();
        OASErrorEvent errorEvent3 = new OASErrorEvent();
        OASErrorEvent errorEvent4 = new OASErrorEvent();

        System.assert(errorEvent1.equals(errorEvent2));
        System.assert(errorEvent3.equals(errorEvent4));
        System.assertEquals(errorEvent1.hashCode(), errorEvent2.hashCode());
        System.assertEquals(errorEvent3.hashCode(), errorEvent4.hashCode());
    }
}
