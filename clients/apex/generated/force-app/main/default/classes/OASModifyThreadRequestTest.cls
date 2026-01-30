@isTest
private class OASModifyThreadRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASModifyThreadRequest modifyThreadRequest1 = OASModifyThreadRequest.getExample();
        OASModifyThreadRequest modifyThreadRequest2 = modifyThreadRequest1;
        OASModifyThreadRequest modifyThreadRequest3 = new OASModifyThreadRequest();
        OASModifyThreadRequest modifyThreadRequest4 = modifyThreadRequest3;

        System.assert(modifyThreadRequest1.equals(modifyThreadRequest2));
        System.assert(modifyThreadRequest2.equals(modifyThreadRequest1));
        System.assert(modifyThreadRequest1.equals(modifyThreadRequest1));
        System.assert(modifyThreadRequest3.equals(modifyThreadRequest4));
        System.assert(modifyThreadRequest4.equals(modifyThreadRequest3));
        System.assert(modifyThreadRequest3.equals(modifyThreadRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASModifyThreadRequest modifyThreadRequest1 = OASModifyThreadRequest.getExample();
        OASModifyThreadRequest modifyThreadRequest2 = OASModifyThreadRequest.getExample();
        OASModifyThreadRequest modifyThreadRequest3 = new OASModifyThreadRequest();
        OASModifyThreadRequest modifyThreadRequest4 = new OASModifyThreadRequest();

        System.assert(modifyThreadRequest1.equals(modifyThreadRequest2));
        System.assert(modifyThreadRequest2.equals(modifyThreadRequest1));
        System.assert(modifyThreadRequest3.equals(modifyThreadRequest4));
        System.assert(modifyThreadRequest4.equals(modifyThreadRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASModifyThreadRequest modifyThreadRequest1 = OASModifyThreadRequest.getExample();
        OASModifyThreadRequest modifyThreadRequest2 = new OASModifyThreadRequest();

        System.assertEquals(false, modifyThreadRequest1.equals('foo'));
        System.assertEquals(false, modifyThreadRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASModifyThreadRequest modifyThreadRequest1 = OASModifyThreadRequest.getExample();
        OASModifyThreadRequest modifyThreadRequest2 = new OASModifyThreadRequest();
        OASModifyThreadRequest modifyThreadRequest3;

        System.assertEquals(false, modifyThreadRequest1.equals(modifyThreadRequest3));
        System.assertEquals(false, modifyThreadRequest2.equals(modifyThreadRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASModifyThreadRequest modifyThreadRequest1 = OASModifyThreadRequest.getExample();
        OASModifyThreadRequest modifyThreadRequest2 = new OASModifyThreadRequest();

        System.assertEquals(modifyThreadRequest1.hashCode(), modifyThreadRequest1.hashCode());
        System.assertEquals(modifyThreadRequest2.hashCode(), modifyThreadRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASModifyThreadRequest modifyThreadRequest1 = OASModifyThreadRequest.getExample();
        OASModifyThreadRequest modifyThreadRequest2 = OASModifyThreadRequest.getExample();
        OASModifyThreadRequest modifyThreadRequest3 = new OASModifyThreadRequest();
        OASModifyThreadRequest modifyThreadRequest4 = new OASModifyThreadRequest();

        System.assert(modifyThreadRequest1.equals(modifyThreadRequest2));
        System.assert(modifyThreadRequest3.equals(modifyThreadRequest4));
        System.assertEquals(modifyThreadRequest1.hashCode(), modifyThreadRequest2.hashCode());
        System.assertEquals(modifyThreadRequest3.hashCode(), modifyThreadRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASModifyThreadRequest modifyThreadRequest = new OASModifyThreadRequest();
        Map<String, String> x-property-mappings = modifyThreadRequest.getx-property-mappings();
        System.assertEquals('toolResources', x-property-mappings.get('tool_resources'));
    }
}
