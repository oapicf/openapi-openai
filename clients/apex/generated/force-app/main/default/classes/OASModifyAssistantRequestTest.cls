@isTest
private class OASModifyAssistantRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASModifyAssistantRequest modifyAssistantRequest1 = OASModifyAssistantRequest.getExample();
        OASModifyAssistantRequest modifyAssistantRequest2 = modifyAssistantRequest1;
        OASModifyAssistantRequest modifyAssistantRequest3 = new OASModifyAssistantRequest();
        OASModifyAssistantRequest modifyAssistantRequest4 = modifyAssistantRequest3;

        System.assert(modifyAssistantRequest1.equals(modifyAssistantRequest2));
        System.assert(modifyAssistantRequest2.equals(modifyAssistantRequest1));
        System.assert(modifyAssistantRequest1.equals(modifyAssistantRequest1));
        System.assert(modifyAssistantRequest3.equals(modifyAssistantRequest4));
        System.assert(modifyAssistantRequest4.equals(modifyAssistantRequest3));
        System.assert(modifyAssistantRequest3.equals(modifyAssistantRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASModifyAssistantRequest modifyAssistantRequest1 = OASModifyAssistantRequest.getExample();
        OASModifyAssistantRequest modifyAssistantRequest2 = OASModifyAssistantRequest.getExample();
        OASModifyAssistantRequest modifyAssistantRequest3 = new OASModifyAssistantRequest();
        OASModifyAssistantRequest modifyAssistantRequest4 = new OASModifyAssistantRequest();

        System.assert(modifyAssistantRequest1.equals(modifyAssistantRequest2));
        System.assert(modifyAssistantRequest2.equals(modifyAssistantRequest1));
        System.assert(modifyAssistantRequest3.equals(modifyAssistantRequest4));
        System.assert(modifyAssistantRequest4.equals(modifyAssistantRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASModifyAssistantRequest modifyAssistantRequest1 = OASModifyAssistantRequest.getExample();
        OASModifyAssistantRequest modifyAssistantRequest2 = new OASModifyAssistantRequest();

        System.assertEquals(false, modifyAssistantRequest1.equals('foo'));
        System.assertEquals(false, modifyAssistantRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASModifyAssistantRequest modifyAssistantRequest1 = OASModifyAssistantRequest.getExample();
        OASModifyAssistantRequest modifyAssistantRequest2 = new OASModifyAssistantRequest();
        OASModifyAssistantRequest modifyAssistantRequest3;

        System.assertEquals(false, modifyAssistantRequest1.equals(modifyAssistantRequest3));
        System.assertEquals(false, modifyAssistantRequest2.equals(modifyAssistantRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASModifyAssistantRequest modifyAssistantRequest1 = OASModifyAssistantRequest.getExample();
        OASModifyAssistantRequest modifyAssistantRequest2 = new OASModifyAssistantRequest();

        System.assertEquals(modifyAssistantRequest1.hashCode(), modifyAssistantRequest1.hashCode());
        System.assertEquals(modifyAssistantRequest2.hashCode(), modifyAssistantRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASModifyAssistantRequest modifyAssistantRequest1 = OASModifyAssistantRequest.getExample();
        OASModifyAssistantRequest modifyAssistantRequest2 = OASModifyAssistantRequest.getExample();
        OASModifyAssistantRequest modifyAssistantRequest3 = new OASModifyAssistantRequest();
        OASModifyAssistantRequest modifyAssistantRequest4 = new OASModifyAssistantRequest();

        System.assert(modifyAssistantRequest1.equals(modifyAssistantRequest2));
        System.assert(modifyAssistantRequest3.equals(modifyAssistantRequest4));
        System.assertEquals(modifyAssistantRequest1.hashCode(), modifyAssistantRequest2.hashCode());
        System.assertEquals(modifyAssistantRequest3.hashCode(), modifyAssistantRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASModifyAssistantRequest modifyAssistantRequest = new OASModifyAssistantRequest();
        Map<String, String> x-property-mappings = modifyAssistantRequest.getx-property-mappings();
        System.assertEquals('toolResources', x-property-mappings.get('tool_resources'));
        System.assertEquals('topP', x-property-mappings.get('top_p'));
        System.assertEquals('responseFormat', x-property-mappings.get('response_format'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASModifyAssistantRequest modifyAssistantRequest = new OASModifyAssistantRequest();
        System.assertEquals(new List<OASAssistantObjectToolsInner>(), modifyAssistantRequest.tools);
        System.assertEquals(1, modifyAssistantRequest.temperature);
        System.assertEquals(1, modifyAssistantRequest.topP);
        System.assertEquals(null, modifyAssistantRequest.model);
        System.assertEquals(null, modifyAssistantRequest.name);
        System.assertEquals(null, modifyAssistantRequest.description);
        System.assertEquals(null, modifyAssistantRequest.instructions);
        System.assertEquals(null, modifyAssistantRequest.toolResources);
        System.assertEquals(null, modifyAssistantRequest.metadata);
        System.assertEquals(null, modifyAssistantRequest.responseFormat);
    }
}
