@isTest
private class OASFineTuningJobTest {
    @isTest
    private static void equalsSameInstance() {
        OASFineTuningJob fineTuningJob1 = OASFineTuningJob.getExample();
        OASFineTuningJob fineTuningJob2 = fineTuningJob1;
        OASFineTuningJob fineTuningJob3 = new OASFineTuningJob();
        OASFineTuningJob fineTuningJob4 = fineTuningJob3;

        System.assert(fineTuningJob1.equals(fineTuningJob2));
        System.assert(fineTuningJob2.equals(fineTuningJob1));
        System.assert(fineTuningJob1.equals(fineTuningJob1));
        System.assert(fineTuningJob3.equals(fineTuningJob4));
        System.assert(fineTuningJob4.equals(fineTuningJob3));
        System.assert(fineTuningJob3.equals(fineTuningJob3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFineTuningJob fineTuningJob1 = OASFineTuningJob.getExample();
        OASFineTuningJob fineTuningJob2 = OASFineTuningJob.getExample();
        OASFineTuningJob fineTuningJob3 = new OASFineTuningJob();
        OASFineTuningJob fineTuningJob4 = new OASFineTuningJob();

        System.assert(fineTuningJob1.equals(fineTuningJob2));
        System.assert(fineTuningJob2.equals(fineTuningJob1));
        System.assert(fineTuningJob3.equals(fineTuningJob4));
        System.assert(fineTuningJob4.equals(fineTuningJob3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFineTuningJob fineTuningJob1 = OASFineTuningJob.getExample();
        OASFineTuningJob fineTuningJob2 = new OASFineTuningJob();

        System.assertEquals(false, fineTuningJob1.equals('foo'));
        System.assertEquals(false, fineTuningJob2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFineTuningJob fineTuningJob1 = OASFineTuningJob.getExample();
        OASFineTuningJob fineTuningJob2 = new OASFineTuningJob();
        OASFineTuningJob fineTuningJob3;

        System.assertEquals(false, fineTuningJob1.equals(fineTuningJob3));
        System.assertEquals(false, fineTuningJob2.equals(fineTuningJob3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFineTuningJob fineTuningJob1 = OASFineTuningJob.getExample();
        OASFineTuningJob fineTuningJob2 = new OASFineTuningJob();

        System.assertEquals(fineTuningJob1.hashCode(), fineTuningJob1.hashCode());
        System.assertEquals(fineTuningJob2.hashCode(), fineTuningJob2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFineTuningJob fineTuningJob1 = OASFineTuningJob.getExample();
        OASFineTuningJob fineTuningJob2 = OASFineTuningJob.getExample();
        OASFineTuningJob fineTuningJob3 = new OASFineTuningJob();
        OASFineTuningJob fineTuningJob4 = new OASFineTuningJob();

        System.assert(fineTuningJob1.equals(fineTuningJob2));
        System.assert(fineTuningJob3.equals(fineTuningJob4));
        System.assertEquals(fineTuningJob1.hashCode(), fineTuningJob2.hashCode());
        System.assertEquals(fineTuningJob3.hashCode(), fineTuningJob4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFineTuningJob fineTuningJob = new OASFineTuningJob();
        Map<String, String> x-property-mappings = fineTuningJob.getx-property-mappings();
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('fineTunedModel', x-property-mappings.get('fine_tuned_model'));
        System.assertEquals('finishedAt', x-property-mappings.get('finished_at'));
        System.assertEquals('r_object', x-property-mappings.get('object'));
        System.assertEquals('organizationId', x-property-mappings.get('organization_id'));
        System.assertEquals('resultFiles', x-property-mappings.get('result_files'));
        System.assertEquals('trainedTokens', x-property-mappings.get('trained_tokens'));
        System.assertEquals('trainingFile', x-property-mappings.get('training_file'));
        System.assertEquals('validationFile', x-property-mappings.get('validation_file'));
        System.assertEquals('estimatedFinish', x-property-mappings.get('estimated_finish'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFineTuningJob fineTuningJob = new OASFineTuningJob();
        System.assertEquals(new List<String>(), fineTuningJob.resultFiles);
        System.assertEquals(new List<OASFineTuningJobIntegrationsInner>(), fineTuningJob.integrations);
        System.assertEquals(null, fineTuningJob.id);
        System.assertEquals(null, fineTuningJob.createdAt);
        System.assertEquals(null, fineTuningJob.error);
        System.assertEquals(null, fineTuningJob.fineTunedModel);
        System.assertEquals(null, fineTuningJob.finishedAt);
        System.assertEquals(null, fineTuningJob.hyperparameters);
        System.assertEquals(null, fineTuningJob.model);
        System.assertEquals(null, fineTuningJob.r_object);
        System.assertEquals(null, fineTuningJob.organizationId);
        System.assertEquals(null, fineTuningJob.status);
        System.assertEquals(null, fineTuningJob.trainedTokens);
        System.assertEquals(null, fineTuningJob.trainingFile);
        System.assertEquals(null, fineTuningJob.validationFile);
        System.assertEquals(null, fineTuningJob.seed);
        System.assertEquals(null, fineTuningJob.estimatedFinish);
        System.assertEquals(null, fineTuningJob.method);
    }
}
