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
        System.assertEquals('functionCall', x-property-mappings.get('function_call'));
        System.assertEquals('topP', x-property-mappings.get('top_p'));
        System.assertEquals('maxTokens', x-property-mappings.get('max_tokens'));
        System.assertEquals('presencePenalty', x-property-mappings.get('presence_penalty'));
        System.assertEquals('frequencyPenalty', x-property-mappings.get('frequency_penalty'));
        System.assertEquals('logitBias', x-property-mappings.get('logit_bias'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateChatCompletionRequest createChatCompletionRequest = new OASCreateChatCompletionRequest();
        System.assertEquals(new List<OASChatCompletionRequestMessage>(), createChatCompletionRequest.messages);
        System.assertEquals(new List<OASChatCompletionFunctions>(), createChatCompletionRequest.functions);
        System.assertEquals(1, createChatCompletionRequest.temperature);
        System.assertEquals(1, createChatCompletionRequest.topP);
        System.assertEquals(1, createChatCompletionRequest.n);
        System.assertEquals(false, createChatCompletionRequest.stream);
        System.assertEquals(0, createChatCompletionRequest.presencePenalty);
        System.assertEquals(0, createChatCompletionRequest.frequencyPenalty);
        System.assertEquals(null, createChatCompletionRequest.model);
        System.assertEquals(null, createChatCompletionRequest.functionCall);
        System.assertEquals(null, createChatCompletionRequest.stop);
        System.assertEquals(null, createChatCompletionRequest.maxTokens);
        System.assertEquals(null, createChatCompletionRequest.logitBias);
        System.assertEquals(null, createChatCompletionRequest.user);
    }
}
