@isTest
private class OASRunStepObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASRunStepObject runStepObject1 = OASRunStepObject.getExample();
        OASRunStepObject runStepObject2 = runStepObject1;
        OASRunStepObject runStepObject3 = new OASRunStepObject();
        OASRunStepObject runStepObject4 = runStepObject3;

        System.assert(runStepObject1.equals(runStepObject2));
        System.assert(runStepObject2.equals(runStepObject1));
        System.assert(runStepObject1.equals(runStepObject1));
        System.assert(runStepObject3.equals(runStepObject4));
        System.assert(runStepObject4.equals(runStepObject3));
        System.assert(runStepObject3.equals(runStepObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRunStepObject runStepObject1 = OASRunStepObject.getExample();
        OASRunStepObject runStepObject2 = OASRunStepObject.getExample();
        OASRunStepObject runStepObject3 = new OASRunStepObject();
        OASRunStepObject runStepObject4 = new OASRunStepObject();

        System.assert(runStepObject1.equals(runStepObject2));
        System.assert(runStepObject2.equals(runStepObject1));
        System.assert(runStepObject3.equals(runStepObject4));
        System.assert(runStepObject4.equals(runStepObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRunStepObject runStepObject1 = OASRunStepObject.getExample();
        OASRunStepObject runStepObject2 = new OASRunStepObject();

        System.assertEquals(false, runStepObject1.equals('foo'));
        System.assertEquals(false, runStepObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRunStepObject runStepObject1 = OASRunStepObject.getExample();
        OASRunStepObject runStepObject2 = new OASRunStepObject();
        OASRunStepObject runStepObject3;

        System.assertEquals(false, runStepObject1.equals(runStepObject3));
        System.assertEquals(false, runStepObject2.equals(runStepObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRunStepObject runStepObject1 = OASRunStepObject.getExample();
        OASRunStepObject runStepObject2 = new OASRunStepObject();

        System.assertEquals(runStepObject1.hashCode(), runStepObject1.hashCode());
        System.assertEquals(runStepObject2.hashCode(), runStepObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRunStepObject runStepObject1 = OASRunStepObject.getExample();
        OASRunStepObject runStepObject2 = OASRunStepObject.getExample();
        OASRunStepObject runStepObject3 = new OASRunStepObject();
        OASRunStepObject runStepObject4 = new OASRunStepObject();

        System.assert(runStepObject1.equals(runStepObject2));
        System.assert(runStepObject3.equals(runStepObject4));
        System.assertEquals(runStepObject1.hashCode(), runStepObject2.hashCode());
        System.assertEquals(runStepObject3.hashCode(), runStepObject4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRunStepObject runStepObject = new OASRunStepObject();
        Map<String, String> x-property-mappings = runStepObject.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('assistantId', x-property-mappings.get('assistant_id'));
        System.assertEquals('threadId', x-property-mappings.get('thread_id'));
        System.assertEquals('runId', x-property-mappings.get('run_id'));
        System.assertEquals('stepDetails', x-property-mappings.get('step_details'));
        System.assertEquals('lastError', x-property-mappings.get('last_error'));
        System.assertEquals('expiredAt', x-property-mappings.get('expired_at'));
        System.assertEquals('cancelledAt', x-property-mappings.get('cancelled_at'));
        System.assertEquals('failedAt', x-property-mappings.get('failed_at'));
        System.assertEquals('completedAt', x-property-mappings.get('completed_at'));
    }
}
