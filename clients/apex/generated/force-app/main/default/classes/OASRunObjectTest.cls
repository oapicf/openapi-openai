@isTest
private class OASRunObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunObject runObject1 = OASRunObject.getExample();
        OASRunObject runObject2 = runObject1;
        OASRunObject runObject3 = new OASRunObject();
        OASRunObject runObject4 = runObject3;

        System.assert(runObject1.equals(runObject2));
        System.assert(runObject2.equals(runObject1));
        System.assert(runObject1.equals(runObject1));
        System.assert(runObject3.equals(runObject4));
        System.assert(runObject4.equals(runObject3));
        System.assert(runObject3.equals(runObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunObject runObject1 = OASRunObject.getExample();
        OASRunObject runObject2 = OASRunObject.getExample();
        OASRunObject runObject3 = new OASRunObject();
        OASRunObject runObject4 = new OASRunObject();

        System.assert(runObject1.equals(runObject2));
        System.assert(runObject2.equals(runObject1));
        System.assert(runObject3.equals(runObject4));
        System.assert(runObject4.equals(runObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunObject runObject1 = OASRunObject.getExample();
        OASRunObject runObject2 = new OASRunObject();

        System.assertEquals(false, runObject1.equals('foo'));
        System.assertEquals(false, runObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunObject runObject1 = OASRunObject.getExample();
        OASRunObject runObject2 = new OASRunObject();
        OASRunObject runObject3;

        System.assertEquals(false, runObject1.equals(runObject3));
        System.assertEquals(false, runObject2.equals(runObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunObject runObject1 = OASRunObject.getExample();
        OASRunObject runObject2 = new OASRunObject();

        System.assertEquals(runObject1.hashCode(), runObject1.hashCode());
        System.assertEquals(runObject2.hashCode(), runObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunObject runObject1 = OASRunObject.getExample();
        OASRunObject runObject2 = OASRunObject.getExample();
        OASRunObject runObject3 = new OASRunObject();
        OASRunObject runObject4 = new OASRunObject();

        System.assert(runObject1.equals(runObject2));
        System.assert(runObject3.equals(runObject4));
        System.assertEquals(runObject1.hashCode(), runObject2.hashCode());
        System.assertEquals(runObject3.hashCode(), runObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunObject runObject = new OASRunObject();
        Map<String, String> x-property-mappings = runObject.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('threadId', x-property-mappings.get('thread_id'));
        System.assertEquals('assistantId', x-property-mappings.get('assistant_id'));
        System.assertEquals('requiredAction', x-property-mappings.get('required_action'));
        System.assertEquals('lastError', x-property-mappings.get('last_error'));
        System.assertEquals('expiresAt', x-property-mappings.get('expires_at'));
        System.assertEquals('startedAt', x-property-mappings.get('started_at'));
        System.assertEquals('cancelledAt', x-property-mappings.get('cancelled_at'));
        System.assertEquals('failedAt', x-property-mappings.get('failed_at'));
        System.assertEquals('completedAt', x-property-mappings.get('completed_at'));
        System.assertEquals('incompleteDetails', x-property-mappings.get('incomplete_details'));
        System.assertEquals('topP', x-property-mappings.get('top_p'));
        System.assertEquals('maxPromptTokens', x-property-mappings.get('max_prompt_tokens'));
        System.assertEquals('maxCompletionTokens', x-property-mappings.get('max_completion_tokens'));
        System.assertEquals('truncationStrategy', x-property-mappings.get('truncation_strategy'));
        System.assertEquals('toolChoice', x-property-mappings.get('tool_choice'));
        System.assertEquals('parallelToolCalls', x-property-mappings.get('parallel_tool_calls'));
        System.assertEquals('responseFormat', x-property-mappings.get('response_format'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRunObject runObject = new OASRunObject();
        System.assertEquals(new List<OASAssistantObjectToolsInner>(), runObject.tools);
        System.assertEquals(true, runObject.parallelToolCalls);
        System.assertEquals(null, runObject.id);
        System.assertEquals(null, runObject.r_object);
        System.assertEquals(null, runObject.createdAt);
        System.assertEquals(null, runObject.threadId);
        System.assertEquals(null, runObject.assistantId);
        System.assertEquals(null, runObject.status);
        System.assertEquals(null, runObject.requiredAction);
        System.assertEquals(null, runObject.lastError);
        System.assertEquals(null, runObject.expiresAt);
        System.assertEquals(null, runObject.startedAt);
        System.assertEquals(null, runObject.cancelledAt);
        System.assertEquals(null, runObject.failedAt);
        System.assertEquals(null, runObject.completedAt);
        System.assertEquals(null, runObject.incompleteDetails);
        System.assertEquals(null, runObject.model);
        System.assertEquals(null, runObject.instructions);
        System.assertEquals(null, runObject.metadata);
        System.assertEquals(null, runObject.usage);
        System.assertEquals(null, runObject.temperature);
        System.assertEquals(null, runObject.topP);
        System.assertEquals(null, runObject.maxPromptTokens);
        System.assertEquals(null, runObject.maxCompletionTokens);
        System.assertEquals(null, runObject.truncationStrategy);
        System.assertEquals(null, runObject.toolChoice);
        System.assertEquals(null, runObject.responseFormat);
    }
}
