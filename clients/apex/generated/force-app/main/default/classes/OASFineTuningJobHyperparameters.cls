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
 * The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
 */
public class OASFineTuningJobHyperparameters implements OAS.MappedProperties {
    /**
     * Get nEpochs
     * @return nEpochs
     */
    public OASFineTuningJobHyperparametersNEpoc nEpochs { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'n_epochs' => 'nEpochs'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASFineTuningJobHyperparameters getExample() {
        OASFineTuningJobHyperparameters fineTuningJobHyperparameters = new OASFineTuningJobHyperparameters();
          fineTuningJobHyperparameters.nEpochs = OASFineTuningJobHyperparametersNEpoc.getExample();
        return fineTuningJobHyperparameters;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASFineTuningJobHyperparameters) {           
            OASFineTuningJobHyperparameters fineTuningJobHyperparameters = (OASFineTuningJobHyperparameters) obj;
            return this.nEpochs == fineTuningJobHyperparameters.nEpochs;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (nEpochs == null ? 0 : System.hashCode(nEpochs));
        return hashCode;
    }
}
