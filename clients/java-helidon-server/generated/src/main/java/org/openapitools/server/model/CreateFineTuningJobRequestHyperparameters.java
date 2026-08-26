package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.CreateFineTuningJobRequestHyperparametersBatchSize;
import org.openapitools.server.model.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;
import org.openapitools.server.model.CreateFineTuningJobRequestHyperparametersNEpochs;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of `method`, and should be passed in under the `method` parameter. 
 */
public class CreateFineTuningJobRequestHyperparameters   {

    private CreateFineTuningJobRequestHyperparametersBatchSize batchSize;
    private CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier;
    private CreateFineTuningJobRequestHyperparametersNEpochs nEpochs;

    /**
     * Default constructor.
     */
    public CreateFineTuningJobRequestHyperparameters() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateFineTuningJobRequestHyperparameters.
     *
     * @param batchSize batchSize
     * @param learningRateMultiplier learningRateMultiplier
     * @param nEpochs nEpochs
     */
    public CreateFineTuningJobRequestHyperparameters(
        CreateFineTuningJobRequestHyperparametersBatchSize batchSize, 
        CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier, 
        CreateFineTuningJobRequestHyperparametersNEpochs nEpochs
    ) {
        this.batchSize = batchSize;
        this.learningRateMultiplier = learningRateMultiplier;
        this.nEpochs = nEpochs;
    }



    /**
     * Get batchSize
     * @return batchSize
     */
    public CreateFineTuningJobRequestHyperparametersBatchSize getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(CreateFineTuningJobRequestHyperparametersBatchSize batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * Get learningRateMultiplier
     * @return learningRateMultiplier
     */
    public CreateFineTuningJobRequestHyperparametersLearningRateMultiplier getLearningRateMultiplier() {
        return learningRateMultiplier;
    }

    public void setLearningRateMultiplier(CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier) {
        this.learningRateMultiplier = learningRateMultiplier;
    }

    /**
     * Get nEpochs
     * @return nEpochs
     */
    public CreateFineTuningJobRequestHyperparametersNEpochs getnEpochs() {
        return nEpochs;
    }

    public void setnEpochs(CreateFineTuningJobRequestHyperparametersNEpochs nEpochs) {
        this.nEpochs = nEpochs;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFineTuningJobRequestHyperparameters {\n");
        
        sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
        sb.append("    learningRateMultiplier: ").append(toIndentedString(learningRateMultiplier)).append("\n");
        sb.append("    nEpochs: ").append(toIndentedString(nEpochs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

