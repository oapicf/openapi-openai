@isTest
private class OASAssistantObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantObject assistantObject1 = OASAssistantObject.getExample();
        OASAssistantObject assistantObject2 = assistantObject1;
        OASAssistantObject assistantObject3 = new OASAssistantObject();
        OASAssistantObject assistantObject4 = assistantObject3;

        System.assert(assistantObject1.equals(assistantObject2));
        System.assert(assistantObject2.equals(assistantObject1));
        System.assert(assistantObject1.equals(assistantObject1));
        System.assert(assistantObject3.equals(assistantObject4));
        System.assert(assistantObject4.equals(assistantObject3));
        System.assert(assistantObject3.equals(assistantObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantObject assistantObject1 = OASAssistantObject.getExample();
        OASAssistantObject assistantObject2 = OASAssistantObject.getExample();
        OASAssistantObject assistantObject3 = new OASAssistantObject();
        OASAssistantObject assistantObject4 = new OASAssistantObject();

        System.assert(assistantObject1.equals(assistantObject2));
        System.assert(assistantObject2.equals(assistantObject1));
        System.assert(assistantObject3.equals(assistantObject4));
        System.assert(assistantObject4.equals(assistantObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantObject assistantObject1 = OASAssistantObject.getExample();
        OASAssistantObject assistantObject2 = new OASAssistantObject();

        System.assertEquals(false, assistantObject1.equals('foo'));
        System.assertEquals(false, assistantObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantObject assistantObject1 = OASAssistantObject.getExample();
        OASAssistantObject assistantObject2 = new OASAssistantObject();
        OASAssistantObject assistantObject3;

        System.assertEquals(false, assistantObject1.equals(assistantObject3));
        System.assertEquals(false, assistantObject2.equals(assistantObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantObject assistantObject1 = OASAssistantObject.getExample();
        OASAssistantObject assistantObject2 = new OASAssistantObject();

        System.assertEquals(assistantObject1.hashCode(), assistantObject1.hashCode());
        System.assertEquals(assistantObject2.hashCode(), assistantObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantObject assistantObject1 = OASAssistantObject.getExample();
        OASAssistantObject assistantObject2 = OASAssistantObject.getExample();
        OASAssistantObject assistantObject3 = new OASAssistantObject();
        OASAssistantObject assistantObject4 = new OASAssistantObject();

        System.assert(assistantObject1.equals(assistantObject2));
        System.assert(assistantObject3.equals(assistantObject4));
        System.assertEquals(assistantObject1.hashCode(), assistantObject2.hashCode());
        System.assertEquals(assistantObject3.hashCode(), assistantObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAssistantObject assistantObject = new OASAssistantObject();
        Map<String, String> x-property-mappings = assistantObject.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('toolResources', x-property-mappings.get('tool_resources'));
        System.assertEquals('topP', x-property-mappings.get('top_p'));
        System.assertEquals('responseFormat', x-property-mappings.get('response_format'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAssistantObject assistantObject = new OASAssistantObject();
        System.assertEquals(new List<OASAssistantObjectToolsInner>(), assistantObject.tools);
        System.assertEquals(1, assistantObject.temperature);
        System.assertEquals(1, assistantObject.topP);
        System.assertEquals(null, assistantObject.id);
        System.assertEquals(null, assistantObject.r_object);
        System.assertEquals(null, assistantObject.createdAt);
        System.assertEquals(null, assistantObject.name);
        System.assertEquals(null, assistantObject.description);
        System.assertEquals(null, assistantObject.model);
        System.assertEquals(null, assistantObject.instructions);
        System.assertEquals(null, assistantObject.toolResources);
        System.assertEquals(null, assistantObject.metadata);
        System.assertEquals(null, assistantObject.responseFormat);
    }
}
