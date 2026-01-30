@isTest
private class OASRealtimeServerEventResponseFunctiTest {
    @isTest
    private static void equalsSameInstance() {
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone1 = OASRealtimeServerEventResponseFuncti.getExample();
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone2 = realtimeServerEventResponseFunctionCallArgumentsDone1;
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone3 = new OASRealtimeServerEventResponseFuncti();
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone4 = realtimeServerEventResponseFunctionCallArgumentsDone3;

        System.assert(realtimeServerEventResponseFunctionCallArgumentsDone1.equals(realtimeServerEventResponseFunctionCallArgumentsDone2));
        System.assert(realtimeServerEventResponseFunctionCallArgumentsDone2.equals(realtimeServerEventResponseFunctionCallArgumentsDone1));
        System.assert(realtimeServerEventResponseFunctionCallArgumentsDone1.equals(realtimeServerEventResponseFunctionCallArgumentsDone1));
        System.assert(realtimeServerEventResponseFunctionCallArgumentsDone3.equals(realtimeServerEventResponseFunctionCallArgumentsDone4));
        System.assert(realtimeServerEventResponseFunctionCallArgumentsDone4.equals(realtimeServerEventResponseFunctionCallArgumentsDone3));
        System.assert(realtimeServerEventResponseFunctionCallArgumentsDone3.equals(realtimeServerEventResponseFunctionCallArgumentsDone3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone1 = OASRealtimeServerEventResponseFuncti.getExample();
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone2 = OASRealtimeServerEventResponseFuncti.getExample();
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone3 = new OASRealtimeServerEventResponseFuncti();
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone4 = new OASRealtimeServerEventResponseFuncti();

        System.assert(realtimeServerEventResponseFunctionCallArgumentsDone1.equals(realtimeServerEventResponseFunctionCallArgumentsDone2));
        System.assert(realtimeServerEventResponseFunctionCallArgumentsDone2.equals(realtimeServerEventResponseFunctionCallArgumentsDone1));
        System.assert(realtimeServerEventResponseFunctionCallArgumentsDone3.equals(realtimeServerEventResponseFunctionCallArgumentsDone4));
        System.assert(realtimeServerEventResponseFunctionCallArgumentsDone4.equals(realtimeServerEventResponseFunctionCallArgumentsDone3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone1 = OASRealtimeServerEventResponseFuncti.getExample();
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone2 = new OASRealtimeServerEventResponseFuncti();

        System.assertEquals(false, realtimeServerEventResponseFunctionCallArgumentsDone1.equals('foo'));
        System.assertEquals(false, realtimeServerEventResponseFunctionCallArgumentsDone2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone1 = OASRealtimeServerEventResponseFuncti.getExample();
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone2 = new OASRealtimeServerEventResponseFuncti();
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone3;

        System.assertEquals(false, realtimeServerEventResponseFunctionCallArgumentsDone1.equals(realtimeServerEventResponseFunctionCallArgumentsDone3));
        System.assertEquals(false, realtimeServerEventResponseFunctionCallArgumentsDone2.equals(realtimeServerEventResponseFunctionCallArgumentsDone3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone1 = OASRealtimeServerEventResponseFuncti.getExample();
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone2 = new OASRealtimeServerEventResponseFuncti();

        System.assertEquals(realtimeServerEventResponseFunctionCallArgumentsDone1.hashCode(), realtimeServerEventResponseFunctionCallArgumentsDone1.hashCode());
        System.assertEquals(realtimeServerEventResponseFunctionCallArgumentsDone2.hashCode(), realtimeServerEventResponseFunctionCallArgumentsDone2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone1 = OASRealtimeServerEventResponseFuncti.getExample();
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone2 = OASRealtimeServerEventResponseFuncti.getExample();
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone3 = new OASRealtimeServerEventResponseFuncti();
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone4 = new OASRealtimeServerEventResponseFuncti();

        System.assert(realtimeServerEventResponseFunctionCallArgumentsDone1.equals(realtimeServerEventResponseFunctionCallArgumentsDone2));
        System.assert(realtimeServerEventResponseFunctionCallArgumentsDone3.equals(realtimeServerEventResponseFunctionCallArgumentsDone4));
        System.assertEquals(realtimeServerEventResponseFunctionCallArgumentsDone1.hashCode(), realtimeServerEventResponseFunctionCallArgumentsDone2.hashCode());
        System.assertEquals(realtimeServerEventResponseFunctionCallArgumentsDone3.hashCode(), realtimeServerEventResponseFunctionCallArgumentsDone4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRealtimeServerEventResponseFuncti realtimeServerEventResponseFunctionCallArgumentsDone = new OASRealtimeServerEventResponseFuncti();
        Map<String, String> x-property-mappings = realtimeServerEventResponseFunctionCallArgumentsDone.getx-property-mappings();
        System.assertEquals('eventId', x-property-mappings.get('event_id'));
        System.assertEquals('responseId', x-property-mappings.get('response_id'));
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('outputIndex', x-property-mappings.get('output_index'));
        System.assertEquals('callId', x-property-mappings.get('call_id'));
    }
}
