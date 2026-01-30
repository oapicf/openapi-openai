@isTest
private class OASFineTuneDPOMethodTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuneDPOMethod fineTuneDPOMethod1 = OASFineTuneDPOMethod.getExample();
        OASFineTuneDPOMethod fineTuneDPOMethod2 = fineTuneDPOMethod1;
        OASFineTuneDPOMethod fineTuneDPOMethod3 = new OASFineTuneDPOMethod();
        OASFineTuneDPOMethod fineTuneDPOMethod4 = fineTuneDPOMethod3;

        System.assert(fineTuneDPOMethod1.equals(fineTuneDPOMethod2));
        System.assert(fineTuneDPOMethod2.equals(fineTuneDPOMethod1));
        System.assert(fineTuneDPOMethod1.equals(fineTuneDPOMethod1));
        System.assert(fineTuneDPOMethod3.equals(fineTuneDPOMethod4));
        System.assert(fineTuneDPOMethod4.equals(fineTuneDPOMethod3));
        System.assert(fineTuneDPOMethod3.equals(fineTuneDPOMethod3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuneDPOMethod fineTuneDPOMethod1 = OASFineTuneDPOMethod.getExample();
        OASFineTuneDPOMethod fineTuneDPOMethod2 = OASFineTuneDPOMethod.getExample();
        OASFineTuneDPOMethod fineTuneDPOMethod3 = new OASFineTuneDPOMethod();
        OASFineTuneDPOMethod fineTuneDPOMethod4 = new OASFineTuneDPOMethod();

        System.assert(fineTuneDPOMethod1.equals(fineTuneDPOMethod2));
        System.assert(fineTuneDPOMethod2.equals(fineTuneDPOMethod1));
        System.assert(fineTuneDPOMethod3.equals(fineTuneDPOMethod4));
        System.assert(fineTuneDPOMethod4.equals(fineTuneDPOMethod3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuneDPOMethod fineTuneDPOMethod1 = OASFineTuneDPOMethod.getExample();
        OASFineTuneDPOMethod fineTuneDPOMethod2 = new OASFineTuneDPOMethod();

        System.assertEquals(false, fineTuneDPOMethod1.equals('foo'));
        System.assertEquals(false, fineTuneDPOMethod2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuneDPOMethod fineTuneDPOMethod1 = OASFineTuneDPOMethod.getExample();
        OASFineTuneDPOMethod fineTuneDPOMethod2 = new OASFineTuneDPOMethod();
        OASFineTuneDPOMethod fineTuneDPOMethod3;

        System.assertEquals(false, fineTuneDPOMethod1.equals(fineTuneDPOMethod3));
        System.assertEquals(false, fineTuneDPOMethod2.equals(fineTuneDPOMethod3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuneDPOMethod fineTuneDPOMethod1 = OASFineTuneDPOMethod.getExample();
        OASFineTuneDPOMethod fineTuneDPOMethod2 = new OASFineTuneDPOMethod();

        System.assertEquals(fineTuneDPOMethod1.hashCode(), fineTuneDPOMethod1.hashCode());
        System.assertEquals(fineTuneDPOMethod2.hashCode(), fineTuneDPOMethod2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuneDPOMethod fineTuneDPOMethod1 = OASFineTuneDPOMethod.getExample();
        OASFineTuneDPOMethod fineTuneDPOMethod2 = OASFineTuneDPOMethod.getExample();
        OASFineTuneDPOMethod fineTuneDPOMethod3 = new OASFineTuneDPOMethod();
        OASFineTuneDPOMethod fineTuneDPOMethod4 = new OASFineTuneDPOMethod();

        System.assert(fineTuneDPOMethod1.equals(fineTuneDPOMethod2));
        System.assert(fineTuneDPOMethod3.equals(fineTuneDPOMethod4));
        System.assertEquals(fineTuneDPOMethod1.hashCode(), fineTuneDPOMethod2.hashCode());
        System.assertEquals(fineTuneDPOMethod3.hashCode(), fineTuneDPOMethod4.hashCode());
    }
}
