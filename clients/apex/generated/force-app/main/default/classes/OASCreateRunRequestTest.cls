@isTest
private class OASCreateRunRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateRunRequest createRunRequest1 = OASCreateRunRequest.getExample();
        OASCreateRunRequest createRunRequest2 = createRunRequest1;
        OASCreateRunRequest createRunRequest3 = new OASCreateRunRequest();
        OASCreateRunRequest createRunRequest4 = createRunRequest3;

        System.assert(createRunRequest1.equals(createRunRequest2));
        System.assert(createRunRequest2.equals(createRunRequest1));
        System.assert(createRunRequest1.equals(createRunRequest1));
        System.assert(createRunRequest3.equals(createRunRequest4));
        System.assert(createRunRequest4.equals(createRunRequest3));
        System.assert(createRunRequest3.equals(createRunRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateRunRequest createRunRequest1 = OASCreateRunRequest.getExample();
        OASCreateRunRequest createRunRequest2 = OASCreateRunRequest.getExample();
        OASCreateRunRequest createRunRequest3 = new OASCreateRunRequest();
        OASCreateRunRequest createRunRequest4 = new OASCreateRunRequest();

        System.assert(createRunRequest1.equals(createRunRequest2));
        System.assert(createRunRequest2.equals(createRunRequest1));
        System.assert(createRunRequest3.equals(createRunRequest4));
        System.assert(createRunRequest4.equals(createRunRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateRunRequest createRunRequest1 = OASCreateRunRequest.getExample();
        OASCreateRunRequest createRunRequest2 = new OASCreateRunRequest();

        System.assertEquals(false, createRunRequest1.equals('foo'));
        System.assertEquals(false, createRunRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateRunRequest createRunRequest1 = OASCreateRunRequest.getExample();
        OASCreateRunRequest createRunRequest2 = new OASCreateRunRequest();
        OASCreateRunRequest createRunRequest3;

        System.assertEquals(false, createRunRequest1.equals(createRunRequest3));
        System.assertEquals(false, createRunRequest2.equals(createRunRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateRunRequest createRunRequest1 = OASCreateRunRequest.getExample();
        OASCreateRunRequest createRunRequest2 = new OASCreateRunRequest();

        System.assertEquals(createRunRequest1.hashCode(), createRunRequest1.hashCode());
        System.assertEquals(createRunRequest2.hashCode(), createRunRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateRunRequest createRunRequest1 = OASCreateRunRequest.getExample();
        OASCreateRunRequest createRunRequest2 = OASCreateRunRequest.getExample();
        OASCreateRunRequest createRunRequest3 = new OASCreateRunRequest();
        OASCreateRunRequest createRunRequest4 = new OASCreateRunRequest();

        System.assert(createRunRequest1.equals(createRunRequest2));
        System.assert(createRunRequest3.equals(createRunRequest4));
        System.assertEquals(createRunRequest1.hashCode(), createRunRequest2.hashCode());
        System.assertEquals(createRunRequest3.hashCode(), createRunRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateRunRequest createRunRequest = new OASCreateRunRequest();
        Map<String, String> x-property-mappings = createRunRequest.getx-property-mappings();
        System.assertEquals('assistantId', x-property-mappings.get('assistant_id'));
        System.assertEquals('additionalInstructions', x-property-mappings.get('additional_instructions'));
        System.assertEquals('additionalMessages', x-property-mappings.get('additional_messages'));
        System.assertEquals('maxPromptTokens', x-property-mappings.get('max_prompt_tokens'));
        System.assertEquals('maxCompletionTokens', x-property-mappings.get('max_completion_tokens'));
        System.assertEquals('truncationStrategy', x-property-mappings.get('truncation_strategy'));
        System.assertEquals('toolChoice', x-property-mappings.get('tool_choice'));
        System.assertEquals('responseFormat', x-property-mappings.get('response_format'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateRunRequest createRunRequest = new OASCreateRunRequest();
        System.assertEquals(new List<OASCreateMessageRequest>(), createRunRequest.additionalMessages);
        System.assertEquals(new List<OASAssistantObjectToolsInner>(), createRunRequest.tools);
        System.assertEquals(1, createRunRequest.temperature);
        System.assertEquals(null, createRunRequest.assistantId);
        System.assertEquals(null, createRunRequest.model);
        System.assertEquals(null, createRunRequest.instructions);
        System.assertEquals(null, createRunRequest.additionalInstructions);
        System.assertEquals(null, createRunRequest.metadata);
        System.assertEquals(null, createRunRequest.stream);
        System.assertEquals(null, createRunRequest.maxPromptTokens);
        System.assertEquals(null, createRunRequest.maxCompletionTokens);
        System.assertEquals(null, createRunRequest.truncationStrategy);
        System.assertEquals(null, createRunRequest.toolChoice);
        System.assertEquals(null, createRunRequest.responseFormat);
    }
}
