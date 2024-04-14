@isTest
private class OASAssistantFileObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantFileObject assistantFileObject1 = OASAssistantFileObject.getExample();
        OASAssistantFileObject assistantFileObject2 = assistantFileObject1;
        OASAssistantFileObject assistantFileObject3 = new OASAssistantFileObject();
        OASAssistantFileObject assistantFileObject4 = assistantFileObject3;

        System.assert(assistantFileObject1.equals(assistantFileObject2));
        System.assert(assistantFileObject2.equals(assistantFileObject1));
        System.assert(assistantFileObject1.equals(assistantFileObject1));
        System.assert(assistantFileObject3.equals(assistantFileObject4));
        System.assert(assistantFileObject4.equals(assistantFileObject3));
        System.assert(assistantFileObject3.equals(assistantFileObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantFileObject assistantFileObject1 = OASAssistantFileObject.getExample();
        OASAssistantFileObject assistantFileObject2 = OASAssistantFileObject.getExample();
        OASAssistantFileObject assistantFileObject3 = new OASAssistantFileObject();
        OASAssistantFileObject assistantFileObject4 = new OASAssistantFileObject();

        System.assert(assistantFileObject1.equals(assistantFileObject2));
        System.assert(assistantFileObject2.equals(assistantFileObject1));
        System.assert(assistantFileObject3.equals(assistantFileObject4));
        System.assert(assistantFileObject4.equals(assistantFileObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantFileObject assistantFileObject1 = OASAssistantFileObject.getExample();
        OASAssistantFileObject assistantFileObject2 = new OASAssistantFileObject();

        System.assertEquals(false, assistantFileObject1.equals('foo'));
        System.assertEquals(false, assistantFileObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantFileObject assistantFileObject1 = OASAssistantFileObject.getExample();
        OASAssistantFileObject assistantFileObject2 = new OASAssistantFileObject();
        OASAssistantFileObject assistantFileObject3;

        System.assertEquals(false, assistantFileObject1.equals(assistantFileObject3));
        System.assertEquals(false, assistantFileObject2.equals(assistantFileObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantFileObject assistantFileObject1 = OASAssistantFileObject.getExample();
        OASAssistantFileObject assistantFileObject2 = new OASAssistantFileObject();

        System.assertEquals(assistantFileObject1.hashCode(), assistantFileObject1.hashCode());
        System.assertEquals(assistantFileObject2.hashCode(), assistantFileObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantFileObject assistantFileObject1 = OASAssistantFileObject.getExample();
        OASAssistantFileObject assistantFileObject2 = OASAssistantFileObject.getExample();
        OASAssistantFileObject assistantFileObject3 = new OASAssistantFileObject();
        OASAssistantFileObject assistantFileObject4 = new OASAssistantFileObject();

        System.assert(assistantFileObject1.equals(assistantFileObject2));
        System.assert(assistantFileObject3.equals(assistantFileObject4));
        System.assertEquals(assistantFileObject1.hashCode(), assistantFileObject2.hashCode());
        System.assertEquals(assistantFileObject3.hashCode(), assistantFileObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAssistantFileObject assistantFileObject = new OASAssistantFileObject();
        Map<String, String> x-property-mappings = assistantFileObject.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('assistantId', x-property-mappings.get('assistant_id'));
    }
}
