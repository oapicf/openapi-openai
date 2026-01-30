@isTest
private class OASAssistantObjectToolResourcesCodeITest {
    @isTest
    private static void equalsSameInstance() {
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter1 = OASAssistantObjectToolResourcesCodeI.getExample();
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter2 = assistantObjectToolResourcesCodeInterpreter1;
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter3 = new OASAssistantObjectToolResourcesCodeI();
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter4 = assistantObjectToolResourcesCodeInterpreter3;

        System.assert(assistantObjectToolResourcesCodeInterpreter1.equals(assistantObjectToolResourcesCodeInterpreter2));
        System.assert(assistantObjectToolResourcesCodeInterpreter2.equals(assistantObjectToolResourcesCodeInterpreter1));
        System.assert(assistantObjectToolResourcesCodeInterpreter1.equals(assistantObjectToolResourcesCodeInterpreter1));
        System.assert(assistantObjectToolResourcesCodeInterpreter3.equals(assistantObjectToolResourcesCodeInterpreter4));
        System.assert(assistantObjectToolResourcesCodeInterpreter4.equals(assistantObjectToolResourcesCodeInterpreter3));
        System.assert(assistantObjectToolResourcesCodeInterpreter3.equals(assistantObjectToolResourcesCodeInterpreter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter1 = OASAssistantObjectToolResourcesCodeI.getExample();
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter2 = OASAssistantObjectToolResourcesCodeI.getExample();
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter3 = new OASAssistantObjectToolResourcesCodeI();
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter4 = new OASAssistantObjectToolResourcesCodeI();

        System.assert(assistantObjectToolResourcesCodeInterpreter1.equals(assistantObjectToolResourcesCodeInterpreter2));
        System.assert(assistantObjectToolResourcesCodeInterpreter2.equals(assistantObjectToolResourcesCodeInterpreter1));
        System.assert(assistantObjectToolResourcesCodeInterpreter3.equals(assistantObjectToolResourcesCodeInterpreter4));
        System.assert(assistantObjectToolResourcesCodeInterpreter4.equals(assistantObjectToolResourcesCodeInterpreter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter1 = OASAssistantObjectToolResourcesCodeI.getExample();
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter2 = new OASAssistantObjectToolResourcesCodeI();

        System.assertEquals(false, assistantObjectToolResourcesCodeInterpreter1.equals('foo'));
        System.assertEquals(false, assistantObjectToolResourcesCodeInterpreter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter1 = OASAssistantObjectToolResourcesCodeI.getExample();
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter2 = new OASAssistantObjectToolResourcesCodeI();
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter3;

        System.assertEquals(false, assistantObjectToolResourcesCodeInterpreter1.equals(assistantObjectToolResourcesCodeInterpreter3));
        System.assertEquals(false, assistantObjectToolResourcesCodeInterpreter2.equals(assistantObjectToolResourcesCodeInterpreter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter1 = OASAssistantObjectToolResourcesCodeI.getExample();
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter2 = new OASAssistantObjectToolResourcesCodeI();

        System.assertEquals(assistantObjectToolResourcesCodeInterpreter1.hashCode(), assistantObjectToolResourcesCodeInterpreter1.hashCode());
        System.assertEquals(assistantObjectToolResourcesCodeInterpreter2.hashCode(), assistantObjectToolResourcesCodeInterpreter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter1 = OASAssistantObjectToolResourcesCodeI.getExample();
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter2 = OASAssistantObjectToolResourcesCodeI.getExample();
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter3 = new OASAssistantObjectToolResourcesCodeI();
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter4 = new OASAssistantObjectToolResourcesCodeI();

        System.assert(assistantObjectToolResourcesCodeInterpreter1.equals(assistantObjectToolResourcesCodeInterpreter2));
        System.assert(assistantObjectToolResourcesCodeInterpreter3.equals(assistantObjectToolResourcesCodeInterpreter4));
        System.assertEquals(assistantObjectToolResourcesCodeInterpreter1.hashCode(), assistantObjectToolResourcesCodeInterpreter2.hashCode());
        System.assertEquals(assistantObjectToolResourcesCodeInterpreter3.hashCode(), assistantObjectToolResourcesCodeInterpreter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter = new OASAssistantObjectToolResourcesCodeI();
        Map<String, String> x-property-mappings = assistantObjectToolResourcesCodeInterpreter.getx-property-mappings();
        System.assertEquals('fileIds', x-property-mappings.get('file_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAssistantObjectToolResourcesCodeI assistantObjectToolResourcesCodeInterpreter = new OASAssistantObjectToolResourcesCodeI();
        System.assertEquals(new List<String>(), assistantObjectToolResourcesCodeInterpreter.fileIds);
    }
}
