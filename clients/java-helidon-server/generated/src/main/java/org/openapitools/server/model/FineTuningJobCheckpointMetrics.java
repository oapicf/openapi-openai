package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Metrics at the step number during the fine-tuning job.
 */
public class FineTuningJobCheckpointMetrics   {

    private BigDecimal step;
    private BigDecimal trainLoss;
    private BigDecimal trainMeanTokenAccuracy;
    private BigDecimal validLoss;
    private BigDecimal validMeanTokenAccuracy;
    private BigDecimal fullValidLoss;
    private BigDecimal fullValidMeanTokenAccuracy;

    /**
     * Default constructor.
     */
    public FineTuningJobCheckpointMetrics() {
    // JSON-B / Jackson
    }

    /**
     * Create FineTuningJobCheckpointMetrics.
     *
     * @param step step
     * @param trainLoss trainLoss
     * @param trainMeanTokenAccuracy trainMeanTokenAccuracy
     * @param validLoss validLoss
     * @param validMeanTokenAccuracy validMeanTokenAccuracy
     * @param fullValidLoss fullValidLoss
     * @param fullValidMeanTokenAccuracy fullValidMeanTokenAccuracy
     */
    public FineTuningJobCheckpointMetrics(
        BigDecimal step, 
        BigDecimal trainLoss, 
        BigDecimal trainMeanTokenAccuracy, 
        BigDecimal validLoss, 
        BigDecimal validMeanTokenAccuracy, 
        BigDecimal fullValidLoss, 
        BigDecimal fullValidMeanTokenAccuracy
    ) {
        this.step = step;
        this.trainLoss = trainLoss;
        this.trainMeanTokenAccuracy = trainMeanTokenAccuracy;
        this.validLoss = validLoss;
        this.validMeanTokenAccuracy = validMeanTokenAccuracy;
        this.fullValidLoss = fullValidLoss;
        this.fullValidMeanTokenAccuracy = fullValidMeanTokenAccuracy;
    }



    /**
     * Get step
     * @return step
     */
    public BigDecimal getStep() {
        return step;
    }

    public void setStep(BigDecimal step) {
        this.step = step;
    }

    /**
     * Get trainLoss
     * @return trainLoss
     */
    public BigDecimal getTrainLoss() {
        return trainLoss;
    }

    public void setTrainLoss(BigDecimal trainLoss) {
        this.trainLoss = trainLoss;
    }

    /**
     * Get trainMeanTokenAccuracy
     * @return trainMeanTokenAccuracy
     */
    public BigDecimal getTrainMeanTokenAccuracy() {
        return trainMeanTokenAccuracy;
    }

    public void setTrainMeanTokenAccuracy(BigDecimal trainMeanTokenAccuracy) {
        this.trainMeanTokenAccuracy = trainMeanTokenAccuracy;
    }

    /**
     * Get validLoss
     * @return validLoss
     */
    public BigDecimal getValidLoss() {
        return validLoss;
    }

    public void setValidLoss(BigDecimal validLoss) {
        this.validLoss = validLoss;
    }

    /**
     * Get validMeanTokenAccuracy
     * @return validMeanTokenAccuracy
     */
    public BigDecimal getValidMeanTokenAccuracy() {
        return validMeanTokenAccuracy;
    }

    public void setValidMeanTokenAccuracy(BigDecimal validMeanTokenAccuracy) {
        this.validMeanTokenAccuracy = validMeanTokenAccuracy;
    }

    /**
     * Get fullValidLoss
     * @return fullValidLoss
     */
    public BigDecimal getFullValidLoss() {
        return fullValidLoss;
    }

    public void setFullValidLoss(BigDecimal fullValidLoss) {
        this.fullValidLoss = fullValidLoss;
    }

    /**
     * Get fullValidMeanTokenAccuracy
     * @return fullValidMeanTokenAccuracy
     */
    public BigDecimal getFullValidMeanTokenAccuracy() {
        return fullValidMeanTokenAccuracy;
    }

    public void setFullValidMeanTokenAccuracy(BigDecimal fullValidMeanTokenAccuracy) {
        this.fullValidMeanTokenAccuracy = fullValidMeanTokenAccuracy;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FineTuningJobCheckpointMetrics {\n");
        
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    trainLoss: ").append(toIndentedString(trainLoss)).append("\n");
        sb.append("    trainMeanTokenAccuracy: ").append(toIndentedString(trainMeanTokenAccuracy)).append("\n");
        sb.append("    validLoss: ").append(toIndentedString(validLoss)).append("\n");
        sb.append("    validMeanTokenAccuracy: ").append(toIndentedString(validMeanTokenAccuracy)).append("\n");
        sb.append("    fullValidLoss: ").append(toIndentedString(fullValidLoss)).append("\n");
        sb.append("    fullValidMeanTokenAccuracy: ").append(toIndentedString(fullValidMeanTokenAccuracy)).append("\n");
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

