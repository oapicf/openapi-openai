@isTest
private class OASModifyMessageRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASModifyMessageRequest modifyMessageRequest1 = OASModifyMessageRequest.getExample();
        OASModifyMessageRequest modifyMessageRequest2 = modifyMessageRequest1;
        OASModifyMessageRequest modifyMessageRequest3 = new OASModifyMessageRequest();
        OASModifyMessageRequest modifyMessageRequest4 = modifyMessageRequest3;

        System.assert(modifyMessageRequest1.equals(modifyMessageRequest2));
        System.assert(modifyMessageRequest2.equals(modifyMessageRequest1));
        System.assert(modifyMessageRequest1.equals(modifyMessageRequest1));
        System.assert(modifyMessageRequest3.equals(modifyMessageRequest4));
        System.assert(modifyMessageRequest4.equals(modifyMessageRequest3));
        System.assert(modifyMessageRequest3.equals(modifyMessageRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASModifyMessageRequest modifyMessageRequest1 = OASModifyMessageRequest.getExample();
        OASModifyMessageRequest modifyMessageRequest2 = OASModifyMessageRequest.getExample();
        OASModifyMessageRequest modifyMessageRequest3 = new OASModifyMessageRequest();
        OASModifyMessageRequest modifyMessageRequest4 = new OASModifyMessageRequest();

        System.assert(modifyMessageRequest1.equals(modifyMessageRequest2));
        System.assert(modifyMessageRequest2.equals(modifyMessageRequest1));
        System.assert(modifyMessageRequest3.equals(modifyMessageRequest4));
        System.assert(modifyMessageRequest4.equals(modifyMessageRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASModifyMessageRequest modifyMessageRequest1 = OASModifyMessageRequest.getExample();
        OASModifyMessageRequest modifyMessageRequest2 = new OASModifyMessageRequest();

        System.assertEquals(false, modifyMessageRequest1.equals('foo'));
        System.assertEquals(false, modifyMessageRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASModifyMessageRequest modifyMessageRequest1 = OASModifyMessageRequest.getExample();
        OASModifyMessageRequest modifyMessageRequest2 = new OASModifyMessageRequest();
        OASModifyMessageRequest modifyMessageRequest3;

        System.assertEquals(false, modifyMessageRequest1.equals(modifyMessageRequest3));
        System.assertEquals(false, modifyMessageRequest2.equals(modifyMessageRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASModifyMessageRequest modifyMessageRequest1 = OASModifyMessageRequest.getExample();
        OASModifyMessageRequest modifyMessageRequest2 = new OASModifyMessageRequest();

        System.assertEquals(modifyMessageRequest1.hashCode(), modifyMessageRequest1.hashCode());
        System.assertEquals(modifyMessageRequest2.hashCode(), modifyMessageRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASModifyMessageRequest modifyMessageRequest1 = OASModifyMessageRequest.getExample();
        OASModifyMessageRequest modifyMessageRequest2 = OASModifyMessageRequest.getExample();
        OASModifyMessageRequest modifyMessageRequest3 = new OASModifyMessageRequest();
        OASModifyMessageRequest modifyMessageRequest4 = new OASModifyMessageRequest();

        System.assert(modifyMessageRequest1.equals(modifyMessageRequest2));
        System.assert(modifyMessageRequest3.equals(modifyMessageRequest4));
        System.assertEquals(modifyMessageRequest1.hashCode(), modifyMessageRequest2.hashCode());
        System.assertEquals(modifyMessageRequest3.hashCode(), modifyMessageRequest4.hashCode());
    }
}
