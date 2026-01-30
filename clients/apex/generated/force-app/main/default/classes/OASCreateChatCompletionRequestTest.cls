@isTest
private class OASCreateChatCompletionRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateChatCompletionRequest createChatCompletionRequest1 = OASCreateChatCompletionRequest.getExample();
        OASCreateChatCompletionRequest createChatCompletionRequest2 = createChatCompletionRequest1;
        OASCreateChatCompletionRequest createChatCompletionRequest3 = new OASCreateChatCompletionRequest();
        OASCreateChatCompletionRequest createChatCompletionRequest4 = createChatCompletionRequest3;

        System.assert(createChatCompletionRequest1.equals(createChatCompletionRequest2));
        System.assert(createChatCompletionRequest2.equals(createChatCompletionRequest1));
        System.assert(createChatCompletionRequest1.equals(createChatCompletionRequest1));
        System.assert(createChatCompletionRequest3.equals(createChatCompletionRequest4));
        System.assert(createChatCompletionRequest4.equals(createChatCompletionRequest3));
        System.assert(createChatCompletionRequest3.equals(createChatCompletionRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateChatCompletionRequest createChatCompletionRequest1 = OASCreateChatCompletionRequest.getExample();
        OASCreateChatCompletionRequest createChatCompletionRequest2 = OASCreateChatCompletionRequest.getExample();
        OASCreateChatCompletionRequest createChatCompletionRequest3 = new OASCreateChatCompletionRequest();
        OASCreateChatCompletionRequest createChatCompletionRequest4 = new OASCreateChatCompletionRequest();

        System.assert(createChatCompletionRequest1.equals(createChatCompletionRequest2));
        System.assert(createChatCompletionRequest2.equals(createChatCompletionRequest1));
        System.assert(createChatCompletionRequest3.equals(createChatCompletionRequest4));
        System.assert(createChatCompletionRequest4.equals(createChatCompletionRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateChatCompletionRequest createChatCompletionRequest1 = OASCreateChatCompletionRequest.getExample();
        OASCreateChatCompletionRequest createChatCompletionRequest2 = new OASCreateChatCompletionRequest();

        System.assertEquals(false, createChatCompletionRequest1.equals('foo'));
        System.assertEquals(false, createChatCompletionRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateChatCompletionRequest createChatCompletionRequest1 = OASCreateChatCompletionRequest.getExample();
        OASCreateChatCompletionRequest createChatCompletionRequest2 = new OASCreateChatCompletionRequest();
        OASCreateChatCompletionRequest createChatCompletionRequest3;

        System.assertEquals(false, createChatCompletionRequest1.equals(createChatCompletionRequest3));
        System.assertEquals(false, createChatCompletionRequest2.equals(createChatCompletionRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateChatCompletionRequest createChatCompletionRequest1 = OASCreateChatCompletionRequest.getExample();
        OASCreateChatCompletionRequest createChatCompletionRequest2 = new OASCreateChatCompletionRequest();

        System.assertEquals(createChatCompletionRequest1.hashCode(), createChatCompletionRequest1.hashCode());
        System.assertEquals(createChatCompletionRequest2.hashCode(), createChatCompletionRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateChatCompletionRequest createChatCompletionRequest1 = OASCreateChatCompletionRequest.getExample();
        OASCreateChatCompletionRequest createChatCompletionRequest2 = OASCreateChatCompletionRequest.getExample();
        OASCreateChatCompletionRequest createChatCompletionRequest3 = new OASCreateChatCompletionRequest();
        OASCreateChatCompletionRequest createChatCompletionRequest4 = new OASCreateChatCompletionRequest();

        System.assert(createChatCompletionRequest1.equals(createChatCompletionRequest2));
        System.assert(createChatCompletionRequest3.equals(createChatCompletionRequest4));
        System.assertEquals(createChatCompletionRequest1.hashCode(), createChatCompletionRequest2.hashCode());
        System.assertEquals(createChatCompletionRequest3.hashCode(), createChatCompletionRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateChatCompletionRequest createChatCompletionRequest = new OASCreateChatCompletionRequest();
        Map<String, String> x-property-mappings = createChatCompletionRequest.getx-property-mappings();
        System.assertEquals('reasoningEffort', x-property-mappings.get('reasoning_effort'));
        System.assertEquals('frequencyPenalty', x-property-mappings.get('frequency_penalty'));
        System.assertEquals('logitBias', x-property-mappings.get('logit_bias'));
        System.assertEquals('topLogprobs', x-property-mappings.get('top_logprobs'));
        System.assertEquals('maxTokens', x-property-mappings.get('max_tokens'));
        System.assertEquals('maxCompletionTokens', x-property-mappings.get('max_completion_tokens'));
        System.assertEquals('presencePenalty', x-property-mappings.get('presence_penalty'));
        System.assertEquals('responseFormat', x-property-mappings.get('response_format'));
        System.assertEquals('serviceTier', x-property-mappings.get('service_tier'));
        System.assertEquals('streamOptions', x-property-mappings.get('stream_options'));
        System.assertEquals('topP', x-property-mappings.get('top_p'));
        System.assertEquals('toolChoice', x-property-mappings.get('tool_choice'));
        System.assertEquals('parallelToolCalls', x-property-mappings.get('parallel_tool_calls'));
        System.assertEquals('functionCall', x-property-mappings.get('function_call'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateChatCompletionRequest createChatCompletionRequest = new OASCreateChatCompletionRequest();
        System.assertEquals(new List<OASChatCompletionRequestMessage>(), createChatCompletionRequest.messages);
        System.assertEquals(false, createChatCompletionRequest.store);
        System.assertEquals(ReasoningEffortEnum.MEDIUM, createChatCompletionRequest.reasoningEffort);
        System.assertEquals(new Map<String, String>(), createChatCompletionRequest.metadata);
        System.assertEquals(0, createChatCompletionRequest.frequencyPenalty);
        System.assertEquals(new Map<String, Integer>(), createChatCompletionRequest.logitBias);
        System.assertEquals(false, createChatCompletionRequest.logprobs);
        System.assertEquals(1, createChatCompletionRequest.n);
        System.assertEquals(new List<String>(), createChatCompletionRequest.modalities);
        System.assertEquals(0, createChatCompletionRequest.presencePenalty);
        System.assertEquals(ServiceTierEnum.AUTO, createChatCompletionRequest.serviceTier);
        System.assertEquals(false, createChatCompletionRequest.stream);
        System.assertEquals(1, createChatCompletionRequest.temperature);
        System.assertEquals(1, createChatCompletionRequest.topP);
        System.assertEquals(new List<OASChatCompletionTool>(), createChatCompletionRequest.tools);
        System.assertEquals(true, createChatCompletionRequest.parallelToolCalls);
        System.assertEquals(new List<OASChatCompletionFunctions>(), createChatCompletionRequest.functions);
        System.assertEquals(null, createChatCompletionRequest.model);
        System.assertEquals(null, createChatCompletionRequest.topLogprobs);
        System.assertEquals(null, createChatCompletionRequest.maxTokens);
        System.assertEquals(null, createChatCompletionRequest.maxCompletionTokens);
        System.assertEquals(null, createChatCompletionRequest.prediction);
        System.assertEquals(null, createChatCompletionRequest.audio);
        System.assertEquals(null, createChatCompletionRequest.responseFormat);
        System.assertEquals(null, createChatCompletionRequest.seed);
        System.assertEquals(null, createChatCompletionRequest.stop);
        System.assertEquals(null, createChatCompletionRequest.streamOptions);
        System.assertEquals(null, createChatCompletionRequest.toolChoice);
        System.assertEquals(null, createChatCompletionRequest.user);
        System.assertEquals(null, createChatCompletionRequest.functionCall);
    }
}
