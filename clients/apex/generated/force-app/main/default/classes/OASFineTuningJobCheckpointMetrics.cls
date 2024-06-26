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
 * Metrics at the step number during the fine-tuning job.
 */
public class OASFineTuningJobCheckpointMetrics implements OAS.MappedProperties {
    /**
     * Get step
     * @return step
     */
    public Double step { get; set; }

    /**
     * Get trainLoss
     * @return trainLoss
     */
    public Double trainLoss { get; set; }

    /**
     * Get trainMeanTokenAccuracy
     * @return trainMeanTokenAccuracy
     */
    public Double trainMeanTokenAccuracy { get; set; }

    /**
     * Get validLoss
     * @return validLoss
     */
    public Double validLoss { get; set; }

    /**
     * Get validMeanTokenAccuracy
     * @return validMeanTokenAccuracy
     */
    public Double validMeanTokenAccuracy { get; set; }

    /**
     * Get fullValidLoss
     * @return fullValidLoss
     */
    public Double fullValidLoss { get; set; }

    /**
     * Get fullValidMeanTokenAccuracy
     * @return fullValidMeanTokenAccuracy
     */
    public Double fullValidMeanTokenAccuracy { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'train_loss' => 'trainLoss',
        'train_mean_token_accuracy' => 'trainMeanTokenAccuracy',
        'valid_loss' => 'validLoss',
        'valid_mean_token_accuracy' => 'validMeanTokenAccuracy',
        'full_valid_loss' => 'fullValidLoss',
        'full_valid_mean_token_accuracy' => 'fullValidMeanTokenAccuracy'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'train_loss' => 'trainLoss',
        'train_mean_token_accuracy' => 'trainMeanTokenAccuracy',
        'valid_loss' => 'validLoss',
        'valid_mean_token_accuracy' => 'validMeanTokenAccuracy',
        'full_valid_loss' => 'fullValidLoss',
        'full_valid_mean_token_accuracy' => 'fullValidMeanTokenAccuracy'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'train_loss' => 'trainLoss',
        'train_mean_token_accuracy' => 'trainMeanTokenAccuracy',
        'valid_loss' => 'validLoss',
        'valid_mean_token_accuracy' => 'validMeanTokenAccuracy',
        'full_valid_loss' => 'fullValidLoss',
        'full_valid_mean_token_accuracy' => 'fullValidMeanTokenAccuracy'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'train_loss' => 'trainLoss',
        'train_mean_token_accuracy' => 'trainMeanTokenAccuracy',
        'valid_loss' => 'validLoss',
        'valid_mean_token_accuracy' => 'validMeanTokenAccuracy',
        'full_valid_loss' => 'fullValidLoss',
        'full_valid_mean_token_accuracy' => 'fullValidMeanTokenAccuracy'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'train_loss' => 'trainLoss',
        'train_mean_token_accuracy' => 'trainMeanTokenAccuracy',
        'valid_loss' => 'validLoss',
        'valid_mean_token_accuracy' => 'validMeanTokenAccuracy',
        'full_valid_loss' => 'fullValidLoss',
        'full_valid_mean_token_accuracy' => 'fullValidMeanTokenAccuracy'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'train_loss' => 'trainLoss',
        'train_mean_token_accuracy' => 'trainMeanTokenAccuracy',
        'valid_loss' => 'validLoss',
        'valid_mean_token_accuracy' => 'validMeanTokenAccuracy',
        'full_valid_loss' => 'fullValidLoss',
        'full_valid_mean_token_accuracy' => 'fullValidMeanTokenAccuracy'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASFineTuningJobCheckpointMetrics getExample() {
        OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics = new OASFineTuningJobCheckpointMetrics();
          fineTuningJobCheckpointMetrics.step = 1.3579;
          fineTuningJobCheckpointMetrics.trainLoss = 1.3579;
          fineTuningJobCheckpointMetrics.trainMeanTokenAccuracy = 1.3579;
          fineTuningJobCheckpointMetrics.validLoss = 1.3579;
          fineTuningJobCheckpointMetrics.validMeanTokenAccuracy = 1.3579;
          fineTuningJobCheckpointMetrics.fullValidLoss = 1.3579;
          fineTuningJobCheckpointMetrics.fullValidMeanTokenAccuracy = 1.3579;
        return fineTuningJobCheckpointMetrics;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASFineTuningJobCheckpointMetrics) {           
            OASFineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics = (OASFineTuningJobCheckpointMetrics) obj;
            return this.step == fineTuningJobCheckpointMetrics.step
                && this.trainLoss == fineTuningJobCheckpointMetrics.trainLoss
                && this.trainMeanTokenAccuracy == fineTuningJobCheckpointMetrics.trainMeanTokenAccuracy
                && this.validLoss == fineTuningJobCheckpointMetrics.validLoss
                && this.validMeanTokenAccuracy == fineTuningJobCheckpointMetrics.validMeanTokenAccuracy
                && this.fullValidLoss == fineTuningJobCheckpointMetrics.fullValidLoss
                && this.fullValidMeanTokenAccuracy == fineTuningJobCheckpointMetrics.fullValidMeanTokenAccuracy;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (step == null ? 0 : System.hashCode(step));
        hashCode = (17 * hashCode) + (trainLoss == null ? 0 : System.hashCode(trainLoss));
        hashCode = (17 * hashCode) + (trainMeanTokenAccuracy == null ? 0 : System.hashCode(trainMeanTokenAccuracy));
        hashCode = (17 * hashCode) + (validLoss == null ? 0 : System.hashCode(validLoss));
        hashCode = (17 * hashCode) + (validMeanTokenAccuracy == null ? 0 : System.hashCode(validMeanTokenAccuracy));
        hashCode = (17 * hashCode) + (fullValidLoss == null ? 0 : System.hashCode(fullValidLoss));
        hashCode = (17 * hashCode) + (fullValidMeanTokenAccuracy == null ? 0 : System.hashCode(fullValidMeanTokenAccuracy));
        return hashCode;
    }
}

