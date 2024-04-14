@isTest
private class OASSubmitToolOutputsRunRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest1 = OASSubmitToolOutputsRunRequest.getExample();
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest2 = submitToolOutputsRunRequest1;
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest3 = new OASSubmitToolOutputsRunRequest();
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest4 = submitToolOutputsRunRequest3;

        System.assert(submitToolOutputsRunRequest1.equals(submitToolOutputsRunRequest2));
        System.assert(submitToolOutputsRunRequest2.equals(submitToolOutputsRunRequest1));
        System.assert(submitToolOutputsRunRequest1.equals(submitToolOutputsRunRequest1));
        System.assert(submitToolOutputsRunRequest3.equals(submitToolOutputsRunRequest4));
        System.assert(submitToolOutputsRunRequest4.equals(submitToolOutputsRunRequest3));
        System.assert(submitToolOutputsRunRequest3.equals(submitToolOutputsRunRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest1 = OASSubmitToolOutputsRunRequest.getExample();
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest2 = OASSubmitToolOutputsRunRequest.getExample();
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest3 = new OASSubmitToolOutputsRunRequest();
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest4 = new OASSubmitToolOutputsRunRequest();

        System.assert(submitToolOutputsRunRequest1.equals(submitToolOutputsRunRequest2));
        System.assert(submitToolOutputsRunRequest2.equals(submitToolOutputsRunRequest1));
        System.assert(submitToolOutputsRunRequest3.equals(submitToolOutputsRunRequest4));
        System.assert(submitToolOutputsRunRequest4.equals(submitToolOutputsRunRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest1 = OASSubmitToolOutputsRunRequest.getExample();
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest2 = new OASSubmitToolOutputsRunRequest();

        System.assertEquals(false, submitToolOutputsRunRequest1.equals('foo'));
        System.assertEquals(false, submitToolOutputsRunRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest1 = OASSubmitToolOutputsRunRequest.getExample();
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest2 = new OASSubmitToolOutputsRunRequest();
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest3;

        System.assertEquals(false, submitToolOutputsRunRequest1.equals(submitToolOutputsRunRequest3));
        System.assertEquals(false, submitToolOutputsRunRequest2.equals(submitToolOutputsRunRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest1 = OASSubmitToolOutputsRunRequest.getExample();
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest2 = new OASSubmitToolOutputsRunRequest();

        System.assertEquals(submitToolOutputsRunRequest1.hashCode(), submitToolOutputsRunRequest1.hashCode());
        System.assertEquals(submitToolOutputsRunRequest2.hashCode(), submitToolOutputsRunRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest1 = OASSubmitToolOutputsRunRequest.getExample();
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest2 = OASSubmitToolOutputsRunRequest.getExample();
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest3 = new OASSubmitToolOutputsRunRequest();
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest4 = new OASSubmitToolOutputsRunRequest();

        System.assert(submitToolOutputsRunRequest1.equals(submitToolOutputsRunRequest2));
        System.assert(submitToolOutputsRunRequest3.equals(submitToolOutputsRunRequest4));
        System.assertEquals(submitToolOutputsRunRequest1.hashCode(), submitToolOutputsRunRequest2.hashCode());
        System.assertEquals(submitToolOutputsRunRequest3.hashCode(), submitToolOutputsRunRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest = new OASSubmitToolOutputsRunRequest();
        Map<String, String> x-property-mappings = submitToolOutputsRunRequest.getx-property-mappings();
        System.assertEquals('toolOutputs', x-property-mappings.get('tool_outputs'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSubmitToolOutputsRunRequest submitToolOutputsRunRequest = new OASSubmitToolOutputsRunRequest();
        System.assertEquals(new List<OASSubmitToolOutputsRunRequestToolOu>(), submitToolOutputsRunRequest.toolOutputs);
        System.assertEquals(null, submitToolOutputsRunRequest.stream);
    }
}
