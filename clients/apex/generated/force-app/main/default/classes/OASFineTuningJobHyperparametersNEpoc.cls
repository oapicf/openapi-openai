/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset.\n&quot;auto&quot; decides the optimal number of epochs based on the size of the dataset. If setting the number manually, we support any number between 1 and 50 epochs.
 */
public class OASFineTuningJobHyperparametersNEpoc {
    public static OASFineTuningJobHyperparametersNEpoc getExample() {
        OASFineTuningJobHyperparametersNEpoc fineTuningJobHyperparametersNEpochs = new OASFineTuningJobHyperparametersNEpoc();
        return fineTuningJobHyperparametersNEpochs;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASFineTuningJobHyperparametersNEpoc) {           
                return true;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        return hashCode;
    }
}
