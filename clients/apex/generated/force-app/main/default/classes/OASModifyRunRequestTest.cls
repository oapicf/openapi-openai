@isTest
private class OASModifyRunRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASModifyRunRequest modifyRunRequest1 = OASModifyRunRequest.getExample();
        OASModifyRunRequest modifyRunRequest2 = modifyRunRequest1;
        OASModifyRunRequest modifyRunRequest3 = new OASModifyRunRequest();
        OASModifyRunRequest modifyRunRequest4 = modifyRunRequest3;

        System.assert(modifyRunRequest1.equals(modifyRunRequest2));
        System.assert(modifyRunRequest2.equals(modifyRunRequest1));
        System.assert(modifyRunRequest1.equals(modifyRunRequest1));
        System.assert(modifyRunRequest3.equals(modifyRunRequest4));
        System.assert(modifyRunRequest4.equals(modifyRunRequest3));
        System.assert(modifyRunRequest3.equals(modifyRunRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASModifyRunRequest modifyRunRequest1 = OASModifyRunRequest.getExample();
        OASModifyRunRequest modifyRunRequest2 = OASModifyRunRequest.getExample();
        OASModifyRunRequest modifyRunRequest3 = new OASModifyRunRequest();
        OASModifyRunRequest modifyRunRequest4 = new OASModifyRunRequest();

        System.assert(modifyRunRequest1.equals(modifyRunRequest2));
        System.assert(modifyRunRequest2.equals(modifyRunRequest1));
        System.assert(modifyRunRequest3.equals(modifyRunRequest4));
        System.assert(modifyRunRequest4.equals(modifyRunRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASModifyRunRequest modifyRunRequest1 = OASModifyRunRequest.getExample();
        OASModifyRunRequest modifyRunRequest2 = new OASModifyRunRequest();

        System.assertEquals(false, modifyRunRequest1.equals('foo'));
        System.assertEquals(false, modifyRunRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASModifyRunRequest modifyRunRequest1 = OASModifyRunRequest.getExample();
        OASModifyRunRequest modifyRunRequest2 = new OASModifyRunRequest();
        OASModifyRunRequest modifyRunRequest3;

        System.assertEquals(false, modifyRunRequest1.equals(modifyRunRequest3));
        System.assertEquals(false, modifyRunRequest2.equals(modifyRunRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASModifyRunRequest modifyRunRequest1 = OASModifyRunRequest.getExample();
        OASModifyRunRequest modifyRunRequest2 = new OASModifyRunRequest();

        System.assertEquals(modifyRunRequest1.hashCode(), modifyRunRequest1.hashCode());
        System.assertEquals(modifyRunRequest2.hashCode(), modifyRunRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASModifyRunRequest modifyRunRequest1 = OASModifyRunRequest.getExample();
        OASModifyRunRequest modifyRunRequest2 = OASModifyRunRequest.getExample();
        OASModifyRunRequest modifyRunRequest3 = new OASModifyRunRequest();
        OASModifyRunRequest modifyRunRequest4 = new OASModifyRunRequest();

        System.assert(modifyRunRequest1.equals(modifyRunRequest2));
        System.assert(modifyRunRequest3.equals(modifyRunRequest4));
        System.assertEquals(modifyRunRequest1.hashCode(), modifyRunRequest2.hashCode());
        System.assertEquals(modifyRunRequest3.hashCode(), modifyRunRequest4.hashCode());
    }
}
