@isTest
private class OASFineTuneTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTune fineTune1 = OASFineTune.getExample();
        OASFineTune fineTune2 = fineTune1;
        OASFineTune fineTune3 = new OASFineTune();
        OASFineTune fineTune4 = fineTune3;

        System.assert(fineTune1.equals(fineTune2));
        System.assert(fineTune2.equals(fineTune1));
        System.assert(fineTune1.equals(fineTune1));
        System.assert(fineTune3.equals(fineTune4));
        System.assert(fineTune4.equals(fineTune3));
        System.assert(fineTune3.equals(fineTune3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTune fineTune1 = OASFineTune.getExample();
        OASFineTune fineTune2 = OASFineTune.getExample();
        OASFineTune fineTune3 = new OASFineTune();
        OASFineTune fineTune4 = new OASFineTune();

        System.assert(fineTune1.equals(fineTune2));
        System.assert(fineTune2.equals(fineTune1));
        System.assert(fineTune3.equals(fineTune4));
        System.assert(fineTune4.equals(fineTune3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTune fineTune1 = OASFineTune.getExample();
        OASFineTune fineTune2 = new OASFineTune();

        System.assertEquals(false, fineTune1.equals('foo'));
        System.assertEquals(false, fineTune2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTune fineTune1 = OASFineTune.getExample();
        OASFineTune fineTune2 = new OASFineTune();
        OASFineTune fineTune3;

        System.assertEquals(false, fineTune1.equals(fineTune3));
        System.assertEquals(false, fineTune2.equals(fineTune3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTune fineTune1 = OASFineTune.getExample();
        OASFineTune fineTune2 = new OASFineTune();

        System.assertEquals(fineTune1.hashCode(), fineTune1.hashCode());
        System.assertEquals(fineTune2.hashCode(), fineTune2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTune fineTune1 = OASFineTune.getExample();
        OASFineTune fineTune2 = OASFineTune.getExample();
        OASFineTune fineTune3 = new OASFineTune();
        OASFineTune fineTune4 = new OASFineTune();

        System.assert(fineTune1.equals(fineTune2));
        System.assert(fineTune3.equals(fineTune4));
        System.assertEquals(fineTune1.hashCode(), fineTune2.hashCode());
        System.assertEquals(fineTune3.hashCode(), fineTune4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFineTune fineTune = new OASFineTune();
        Map<String, String> x-property-mappings = fineTune.getx-property-mappings();
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('updatedAt', x-property-mappings.get('updated_at'));
        System.assertEquals('fineTunedModel', x-property-mappings.get('fine_tuned_model'));
        System.assertEquals('organizationId', x-property-mappings.get('organization_id'));
        System.assertEquals('trainingFiles', x-property-mappings.get('training_files'));
        System.assertEquals('validationFiles', x-property-mappings.get('validation_files'));
        System.assertEquals('resultFiles', x-property-mappings.get('result_files'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFineTune fineTune = new OASFineTune();
        System.assertEquals(new List<OASOpenAIFile>(), fineTune.trainingFiles);
        System.assertEquals(new List<OASOpenAIFile>(), fineTune.validationFiles);
        System.assertEquals(new List<OASOpenAIFile>(), fineTune.resultFiles);
        System.assertEquals(new List<OASFineTuneEvent>(), fineTune.events);
        System.assertEquals(null, fineTune.id);
        System.assertEquals(null, fineTune.r_object);
        System.assertEquals(null, fineTune.createdAt);
        System.assertEquals(null, fineTune.updatedAt);
        System.assertEquals(null, fineTune.model);
        System.assertEquals(null, fineTune.fineTunedModel);
        System.assertEquals(null, fineTune.organizationId);
        System.assertEquals(null, fineTune.status);
        System.assertEquals(null, fineTune.hyperparams);
    }
}
