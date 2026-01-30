@isTest
private class OASFineTuneMethodTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuneMethod fineTuneMethod1 = OASFineTuneMethod.getExample();
        OASFineTuneMethod fineTuneMethod2 = fineTuneMethod1;
        OASFineTuneMethod fineTuneMethod3 = new OASFineTuneMethod();
        OASFineTuneMethod fineTuneMethod4 = fineTuneMethod3;

        System.assert(fineTuneMethod1.equals(fineTuneMethod2));
        System.assert(fineTuneMethod2.equals(fineTuneMethod1));
        System.assert(fineTuneMethod1.equals(fineTuneMethod1));
        System.assert(fineTuneMethod3.equals(fineTuneMethod4));
        System.assert(fineTuneMethod4.equals(fineTuneMethod3));
        System.assert(fineTuneMethod3.equals(fineTuneMethod3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuneMethod fineTuneMethod1 = OASFineTuneMethod.getExample();
        OASFineTuneMethod fineTuneMethod2 = OASFineTuneMethod.getExample();
        OASFineTuneMethod fineTuneMethod3 = new OASFineTuneMethod();
        OASFineTuneMethod fineTuneMethod4 = new OASFineTuneMethod();

        System.assert(fineTuneMethod1.equals(fineTuneMethod2));
        System.assert(fineTuneMethod2.equals(fineTuneMethod1));
        System.assert(fineTuneMethod3.equals(fineTuneMethod4));
        System.assert(fineTuneMethod4.equals(fineTuneMethod3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuneMethod fineTuneMethod1 = OASFineTuneMethod.getExample();
        OASFineTuneMethod fineTuneMethod2 = new OASFineTuneMethod();

        System.assertEquals(false, fineTuneMethod1.equals('foo'));
        System.assertEquals(false, fineTuneMethod2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuneMethod fineTuneMethod1 = OASFineTuneMethod.getExample();
        OASFineTuneMethod fineTuneMethod2 = new OASFineTuneMethod();
        OASFineTuneMethod fineTuneMethod3;

        System.assertEquals(false, fineTuneMethod1.equals(fineTuneMethod3));
        System.assertEquals(false, fineTuneMethod2.equals(fineTuneMethod3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuneMethod fineTuneMethod1 = OASFineTuneMethod.getExample();
        OASFineTuneMethod fineTuneMethod2 = new OASFineTuneMethod();

        System.assertEquals(fineTuneMethod1.hashCode(), fineTuneMethod1.hashCode());
        System.assertEquals(fineTuneMethod2.hashCode(), fineTuneMethod2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuneMethod fineTuneMethod1 = OASFineTuneMethod.getExample();
        OASFineTuneMethod fineTuneMethod2 = OASFineTuneMethod.getExample();
        OASFineTuneMethod fineTuneMethod3 = new OASFineTuneMethod();
        OASFineTuneMethod fineTuneMethod4 = new OASFineTuneMethod();

        System.assert(fineTuneMethod1.equals(fineTuneMethod2));
        System.assert(fineTuneMethod3.equals(fineTuneMethod4));
        System.assertEquals(fineTuneMethod1.hashCode(), fineTuneMethod2.hashCode());
        System.assertEquals(fineTuneMethod3.hashCode(), fineTuneMethod4.hashCode());
    }
}
