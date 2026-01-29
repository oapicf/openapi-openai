@isTest
private class OASCreateThreadAndRunRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateThreadAndRunRequest createThreadAndRunRequest1 = OASCreateThreadAndRunRequest.getExample();
        OASCreateThreadAndRunRequest createThreadAndRunRequest2 = createThreadAndRunRequest1;
        OASCreateThreadAndRunRequest createThreadAndRunRequest3 = new OASCreateThreadAndRunRequest();
        OASCreateThreadAndRunRequest createThreadAndRunRequest4 = createThreadAndRunRequest3;

        System.assert(createThreadAndRunRequest1.equals(createThreadAndRunRequest2));
        System.assert(createThreadAndRunRequest2.equals(createThreadAndRunRequest1));
        System.assert(createThreadAndRunRequest1.equals(createThreadAndRunRequest1));
        System.assert(createThreadAndRunRequest3.equals(createThreadAndRunRequest4));
        System.assert(createThreadAndRunRequest4.equals(createThreadAndRunRequest3));
        System.assert(createThreadAndRunRequest3.equals(createThreadAndRunRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateThreadAndRunRequest createThreadAndRunRequest1 = OASCreateThreadAndRunRequest.getExample();
        OASCreateThreadAndRunRequest createThreadAndRunRequest2 = OASCreateThreadAndRunRequest.getExample();
        OASCreateThreadAndRunRequest createThreadAndRunRequest3 = new OASCreateThreadAndRunRequest();
        OASCreateThreadAndRunRequest createThreadAndRunRequest4 = new OASCreateThreadAndRunRequest();

        System.assert(createThreadAndRunRequest1.equals(createThreadAndRunRequest2));
        System.assert(createThreadAndRunRequest2.equals(createThreadAndRunRequest1));
        System.assert(createThreadAndRunRequest3.equals(createThreadAndRunRequest4));
        System.assert(createThreadAndRunRequest4.equals(createThreadAndRunRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateThreadAndRunRequest createThreadAndRunRequest1 = OASCreateThreadAndRunRequest.getExample();
        OASCreateThreadAndRunRequest createThreadAndRunRequest2 = new OASCreateThreadAndRunRequest();

        System.assertEquals(false, createThreadAndRunRequest1.equals('foo'));
        System.assertEquals(false, createThreadAndRunRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateThreadAndRunRequest createThreadAndRunRequest1 = OASCreateThreadAndRunRequest.getExample();
        OASCreateThreadAndRunRequest createThreadAndRunRequest2 = new OASCreateThreadAndRunRequest();
        OASCreateThreadAndRunRequest createThreadAndRunRequest3;

        System.assertEquals(false, createThreadAndRunRequest1.equals(createThreadAndRunRequest3));
        System.assertEquals(false, createThreadAndRunRequest2.equals(createThreadAndRunRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateThreadAndRunRequest createThreadAndRunRequest1 = OASCreateThreadAndRunRequest.getExample();
        OASCreateThreadAndRunRequest createThreadAndRunRequest2 = new OASCreateThreadAndRunRequest();

        System.assertEquals(createThreadAndRunRequest1.hashCode(), createThreadAndRunRequest1.hashCode());
        System.assertEquals(createThreadAndRunRequest2.hashCode(), createThreadAndRunRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateThreadAndRunRequest createThreadAndRunRequest1 = OASCreateThreadAndRunRequest.getExample();
        OASCreateThreadAndRunRequest createThreadAndRunRequest2 = OASCreateThreadAndRunRequest.getExample();
        OASCreateThreadAndRunRequest createThreadAndRunRequest3 = new OASCreateThreadAndRunRequest();
        OASCreateThreadAndRunRequest createThreadAndRunRequest4 = new OASCreateThreadAndRunRequest();

        System.assert(createThreadAndRunRequest1.equals(createThreadAndRunRequest2));
        System.assert(createThreadAndRunRequest3.equals(createThreadAndRunRequest4));
        System.assertEquals(createThreadAndRunRequest1.hashCode(), createThreadAndRunRequest2.hashCode());
        System.assertEquals(createThreadAndRunRequest3.hashCode(), createThreadAndRunRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateThreadAndRunRequest createThreadAndRunRequest = new OASCreateThreadAndRunRequest();
        Map<String, String> x-property-mappings = createThreadAndRunRequest.getx-property-mappings();
        System.assertEquals('assistantId', x-property-mappings.get('assistant_id'));
        System.assertEquals('maxPromptTokens', x-property-mappings.get('max_prompt_tokens'));
        System.assertEquals('maxCompletionTokens', x-property-mappings.get('max_completion_tokens'));
        System.assertEquals('truncationStrategy', x-property-mappings.get('truncation_strategy'));
        System.assertEquals('toolChoice', x-property-mappings.get('tool_choice'));
        System.assertEquals('responseFormat', x-property-mappings.get('response_format'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateThreadAndRunRequest createThreadAndRunRequest = new OASCreateThreadAndRunRequest();
        System.assertEquals(new List<OASCreateThreadAndRunRequestToolsInn>(), createThreadAndRunRequest.tools);
        System.assertEquals(1, createThreadAndRunRequest.temperature);
        System.assertEquals(null, createThreadAndRunRequest.assistantId);
        System.assertEquals(null, createThreadAndRunRequest.thread);
        System.assertEquals(null, createThreadAndRunRequest.model);
        System.assertEquals(null, createThreadAndRunRequest.instructions);
        System.assertEquals(null, createThreadAndRunRequest.metadata);
        System.assertEquals(null, createThreadAndRunRequest.stream);
        System.assertEquals(null, createThreadAndRunRequest.maxPromptTokens);
        System.assertEquals(null, createThreadAndRunRequest.maxCompletionTokens);
        System.assertEquals(null, createThreadAndRunRequest.truncationStrategy);
        System.assertEquals(null, createThreadAndRunRequest.toolChoice);
        System.assertEquals(null, createThreadAndRunRequest.responseFormat);
    }
}
