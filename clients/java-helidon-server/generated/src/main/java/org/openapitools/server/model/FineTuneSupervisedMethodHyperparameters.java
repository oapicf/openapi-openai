package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.FineTuneDPOMethodHyperparametersBatchSize;
import org.openapitools.server.model.FineTuneDPOMethodHyperparametersLearningRateMultiplier;
import org.openapitools.server.model.FineTuneDPOMethodHyperparametersNEpochs;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The hyperparameters used for the fine-tuning job.
 */
public class FineTuneSupervisedMethodHyperparameters   {

    private FineTuneDPOMethodHyperparametersBatchSize batchSize;
    private FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier;
    private FineTuneDPOMethodHyperparametersNEpochs nEpochs;

    /**
     * Default constructor.
     */
    public FineTuneSupervisedMethodHyperparameters() {
    // JSON-B / Jackson
    }

    /**
     * Create FineTuneSupervisedMethodHyperparameters.
     *
     * @param batchSize batchSize
     * @param learningRateMultiplier learningRateMultiplier
     * @param nEpochs nEpochs
     */
    public FineTuneSupervisedMethodHyperparameters(
        FineTuneDPOMethodHyperparametersBatchSize batchSize, 
        FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier, 
        FineTuneDPOMethodHyperparametersNEpochs nEpochs
    ) {
        this.batchSize = batchSize;
        this.learningRateMultiplier = learningRateMultiplier;
        this.nEpochs = nEpochs;
    }



    /**
     * Get batchSize
     * @return batchSize
     */
    public FineTuneDPOMethodHyperparametersBatchSize getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(FineTuneDPOMethodHyperparametersBatchSize batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * Get learningRateMultiplier
     * @return learningRateMultiplier
     */
    public FineTuneDPOMethodHyperparametersLearningRateMultiplier getLearningRateMultiplier() {
        return learningRateMultiplier;
    }

    public void setLearningRateMultiplier(FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier) {
        this.learningRateMultiplier = learningRateMultiplier;
    }

    /**
     * Get nEpochs
     * @return nEpochs
     */
    public FineTuneDPOMethodHyperparametersNEpochs getnEpochs() {
        return nEpochs;
    }

    public void setnEpochs(FineTuneDPOMethodHyperparametersNEpochs nEpochs) {
        this.nEpochs = nEpochs;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FineTuneSupervisedMethodHyperparameters {\n");
        
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

