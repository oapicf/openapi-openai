@isTest
private class OASFineTuneSupervisedMethodTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod1 = OASFineTuneSupervisedMethod.getExample();
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod2 = fineTuneSupervisedMethod1;
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod3 = new OASFineTuneSupervisedMethod();
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod4 = fineTuneSupervisedMethod3;

        System.assert(fineTuneSupervisedMethod1.equals(fineTuneSupervisedMethod2));
        System.assert(fineTuneSupervisedMethod2.equals(fineTuneSupervisedMethod1));
        System.assert(fineTuneSupervisedMethod1.equals(fineTuneSupervisedMethod1));
        System.assert(fineTuneSupervisedMethod3.equals(fineTuneSupervisedMethod4));
        System.assert(fineTuneSupervisedMethod4.equals(fineTuneSupervisedMethod3));
        System.assert(fineTuneSupervisedMethod3.equals(fineTuneSupervisedMethod3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod1 = OASFineTuneSupervisedMethod.getExample();
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod2 = OASFineTuneSupervisedMethod.getExample();
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod3 = new OASFineTuneSupervisedMethod();
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod4 = new OASFineTuneSupervisedMethod();

        System.assert(fineTuneSupervisedMethod1.equals(fineTuneSupervisedMethod2));
        System.assert(fineTuneSupervisedMethod2.equals(fineTuneSupervisedMethod1));
        System.assert(fineTuneSupervisedMethod3.equals(fineTuneSupervisedMethod4));
        System.assert(fineTuneSupervisedMethod4.equals(fineTuneSupervisedMethod3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod1 = OASFineTuneSupervisedMethod.getExample();
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod2 = new OASFineTuneSupervisedMethod();

        System.assertEquals(false, fineTuneSupervisedMethod1.equals('foo'));
        System.assertEquals(false, fineTuneSupervisedMethod2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod1 = OASFineTuneSupervisedMethod.getExample();
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod2 = new OASFineTuneSupervisedMethod();
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod3;

        System.assertEquals(false, fineTuneSupervisedMethod1.equals(fineTuneSupervisedMethod3));
        System.assertEquals(false, fineTuneSupervisedMethod2.equals(fineTuneSupervisedMethod3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod1 = OASFineTuneSupervisedMethod.getExample();
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod2 = new OASFineTuneSupervisedMethod();

        System.assertEquals(fineTuneSupervisedMethod1.hashCode(), fineTuneSupervisedMethod1.hashCode());
        System.assertEquals(fineTuneSupervisedMethod2.hashCode(), fineTuneSupervisedMethod2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod1 = OASFineTuneSupervisedMethod.getExample();
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod2 = OASFineTuneSupervisedMethod.getExample();
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod3 = new OASFineTuneSupervisedMethod();
        OASFineTuneSupervisedMethod fineTuneSupervisedMethod4 = new OASFineTuneSupervisedMethod();

        System.assert(fineTuneSupervisedMethod1.equals(fineTuneSupervisedMethod2));
        System.assert(fineTuneSupervisedMethod3.equals(fineTuneSupervisedMethod4));
        System.assertEquals(fineTuneSupervisedMethod1.hashCode(), fineTuneSupervisedMethod2.hashCode());
        System.assertEquals(fineTuneSupervisedMethod3.hashCode(), fineTuneSupervisedMethod4.hashCode());
    }
}
