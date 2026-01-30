@isTest
private class OASCompletionUsageCompletionTokensDeTest {
    @isTest
    private static void equalsSameInstance() {
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails1 = OASCompletionUsageCompletionTokensDe.getExample();
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails2 = completionUsageCompletionTokensDetails1;
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails3 = new OASCompletionUsageCompletionTokensDe();
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails4 = completionUsageCompletionTokensDetails3;

        System.assert(completionUsageCompletionTokensDetails1.equals(completionUsageCompletionTokensDetails2));
        System.assert(completionUsageCompletionTokensDetails2.equals(completionUsageCompletionTokensDetails1));
        System.assert(completionUsageCompletionTokensDetails1.equals(completionUsageCompletionTokensDetails1));
        System.assert(completionUsageCompletionTokensDetails3.equals(completionUsageCompletionTokensDetails4));
        System.assert(completionUsageCompletionTokensDetails4.equals(completionUsageCompletionTokensDetails3));
        System.assert(completionUsageCompletionTokensDetails3.equals(completionUsageCompletionTokensDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails1 = OASCompletionUsageCompletionTokensDe.getExample();
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails2 = OASCompletionUsageCompletionTokensDe.getExample();
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails3 = new OASCompletionUsageCompletionTokensDe();
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails4 = new OASCompletionUsageCompletionTokensDe();

        System.assert(completionUsageCompletionTokensDetails1.equals(completionUsageCompletionTokensDetails2));
        System.assert(completionUsageCompletionTokensDetails2.equals(completionUsageCompletionTokensDetails1));
        System.assert(completionUsageCompletionTokensDetails3.equals(completionUsageCompletionTokensDetails4));
        System.assert(completionUsageCompletionTokensDetails4.equals(completionUsageCompletionTokensDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails1 = OASCompletionUsageCompletionTokensDe.getExample();
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails2 = new OASCompletionUsageCompletionTokensDe();

        System.assertEquals(false, completionUsageCompletionTokensDetails1.equals('foo'));
        System.assertEquals(false, completionUsageCompletionTokensDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails1 = OASCompletionUsageCompletionTokensDe.getExample();
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails2 = new OASCompletionUsageCompletionTokensDe();
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails3;

        System.assertEquals(false, completionUsageCompletionTokensDetails1.equals(completionUsageCompletionTokensDetails3));
        System.assertEquals(false, completionUsageCompletionTokensDetails2.equals(completionUsageCompletionTokensDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails1 = OASCompletionUsageCompletionTokensDe.getExample();
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails2 = new OASCompletionUsageCompletionTokensDe();

        System.assertEquals(completionUsageCompletionTokensDetails1.hashCode(), completionUsageCompletionTokensDetails1.hashCode());
        System.assertEquals(completionUsageCompletionTokensDetails2.hashCode(), completionUsageCompletionTokensDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails1 = OASCompletionUsageCompletionTokensDe.getExample();
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails2 = OASCompletionUsageCompletionTokensDe.getExample();
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails3 = new OASCompletionUsageCompletionTokensDe();
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails4 = new OASCompletionUsageCompletionTokensDe();

        System.assert(completionUsageCompletionTokensDetails1.equals(completionUsageCompletionTokensDetails2));
        System.assert(completionUsageCompletionTokensDetails3.equals(completionUsageCompletionTokensDetails4));
        System.assertEquals(completionUsageCompletionTokensDetails1.hashCode(), completionUsageCompletionTokensDetails2.hashCode());
        System.assertEquals(completionUsageCompletionTokensDetails3.hashCode(), completionUsageCompletionTokensDetails4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCompletionUsageCompletionTokensDe completionUsageCompletionTokensDetails = new OASCompletionUsageCompletionTokensDe();
        Map<String, String> x-property-mappings = completionUsageCompletionTokensDetails.getx-property-mappings();
        System.assertEquals('acceptedPredictionTokens', x-property-mappings.get('accepted_prediction_tokens'));
        System.assertEquals('audioTokens', x-property-mappings.get('audio_tokens'));
        System.assertEquals('reasoningTokens', x-property-mappings.get('reasoning_tokens'));
        System.assertEquals('rejectedPredictionTokens', x-property-mappings.get('rejected_prediction_tokens'));
    }
}
