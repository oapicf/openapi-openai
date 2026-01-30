@isTest
private class OASCreateCompletionRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateCompletionRequest createCompletionRequest1 = OASCreateCompletionRequest.getExample();
        OASCreateCompletionRequest createCompletionRequest2 = createCompletionRequest1;
        OASCreateCompletionRequest createCompletionRequest3 = new OASCreateCompletionRequest();
        OASCreateCompletionRequest createCompletionRequest4 = createCompletionRequest3;

        System.assert(createCompletionRequest1.equals(createCompletionRequest2));
        System.assert(createCompletionRequest2.equals(createCompletionRequest1));
        System.assert(createCompletionRequest1.equals(createCompletionRequest1));
        System.assert(createCompletionRequest3.equals(createCompletionRequest4));
        System.assert(createCompletionRequest4.equals(createCompletionRequest3));
        System.assert(createCompletionRequest3.equals(createCompletionRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateCompletionRequest createCompletionRequest1 = OASCreateCompletionRequest.getExample();
        OASCreateCompletionRequest createCompletionRequest2 = OASCreateCompletionRequest.getExample();
        OASCreateCompletionRequest createCompletionRequest3 = new OASCreateCompletionRequest();
        OASCreateCompletionRequest createCompletionRequest4 = new OASCreateCompletionRequest();

        System.assert(createCompletionRequest1.equals(createCompletionRequest2));
        System.assert(createCompletionRequest2.equals(createCompletionRequest1));
        System.assert(createCompletionRequest3.equals(createCompletionRequest4));
        System.assert(createCompletionRequest4.equals(createCompletionRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateCompletionRequest createCompletionRequest1 = OASCreateCompletionRequest.getExample();
        OASCreateCompletionRequest createCompletionRequest2 = new OASCreateCompletionRequest();

        System.assertEquals(false, createCompletionRequest1.equals('foo'));
        System.assertEquals(false, createCompletionRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateCompletionRequest createCompletionRequest1 = OASCreateCompletionRequest.getExample();
        OASCreateCompletionRequest createCompletionRequest2 = new OASCreateCompletionRequest();
        OASCreateCompletionRequest createCompletionRequest3;

        System.assertEquals(false, createCompletionRequest1.equals(createCompletionRequest3));
        System.assertEquals(false, createCompletionRequest2.equals(createCompletionRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateCompletionRequest createCompletionRequest1 = OASCreateCompletionRequest.getExample();
        OASCreateCompletionRequest createCompletionRequest2 = new OASCreateCompletionRequest();

        System.assertEquals(createCompletionRequest1.hashCode(), createCompletionRequest1.hashCode());
        System.assertEquals(createCompletionRequest2.hashCode(), createCompletionRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateCompletionRequest createCompletionRequest1 = OASCreateCompletionRequest.getExample();
        OASCreateCompletionRequest createCompletionRequest2 = OASCreateCompletionRequest.getExample();
        OASCreateCompletionRequest createCompletionRequest3 = new OASCreateCompletionRequest();
        OASCreateCompletionRequest createCompletionRequest4 = new OASCreateCompletionRequest();

        System.assert(createCompletionRequest1.equals(createCompletionRequest2));
        System.assert(createCompletionRequest3.equals(createCompletionRequest4));
        System.assertEquals(createCompletionRequest1.hashCode(), createCompletionRequest2.hashCode());
        System.assertEquals(createCompletionRequest3.hashCode(), createCompletionRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateCompletionRequest createCompletionRequest = new OASCreateCompletionRequest();
        Map<String, String> x-property-mappings = createCompletionRequest.getx-property-mappings();
        System.assertEquals('bestOf', x-property-mappings.get('best_of'));
        System.assertEquals('frequencyPenalty', x-property-mappings.get('frequency_penalty'));
        System.assertEquals('logitBias', x-property-mappings.get('logit_bias'));
        System.assertEquals('maxTokens', x-property-mappings.get('max_tokens'));
        System.assertEquals('presencePenalty', x-property-mappings.get('presence_penalty'));
        System.assertEquals('streamOptions', x-property-mappings.get('stream_options'));
        System.assertEquals('topP', x-property-mappings.get('top_p'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateCompletionRequest createCompletionRequest = new OASCreateCompletionRequest();
        System.assertEquals(1, createCompletionRequest.bestOf);
        System.assertEquals(false, createCompletionRequest.echo);
        System.assertEquals(0, createCompletionRequest.frequencyPenalty);
        System.assertEquals(new Map<String, Integer>(), createCompletionRequest.logitBias);
        System.assertEquals(16, createCompletionRequest.maxTokens);
        System.assertEquals(1, createCompletionRequest.n);
        System.assertEquals(0, createCompletionRequest.presencePenalty);
        System.assertEquals(false, createCompletionRequest.stream);
        System.assertEquals(1, createCompletionRequest.temperature);
        System.assertEquals(1, createCompletionRequest.topP);
        System.assertEquals(null, createCompletionRequest.model);
        System.assertEquals(null, createCompletionRequest.prompt);
        System.assertEquals(null, createCompletionRequest.logprobs);
        System.assertEquals(null, createCompletionRequest.seed);
        System.assertEquals(null, createCompletionRequest.stop);
        System.assertEquals(null, createCompletionRequest.streamOptions);
        System.assertEquals(null, createCompletionRequest.suffix);
        System.assertEquals(null, createCompletionRequest.user);
    }
}
