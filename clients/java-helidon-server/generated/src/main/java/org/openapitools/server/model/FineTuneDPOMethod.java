package org.openapitools.server.model;

import org.openapitools.server.model.FineTuneDPOMethodHyperparameters;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Configuration for the DPO fine-tuning method.
 */
public class FineTuneDPOMethod   {

    private FineTuneDPOMethodHyperparameters hyperparameters;

    /**
     * Default constructor.
     */
    public FineTuneDPOMethod() {
    // JSON-B / Jackson
    }

    /**
     * Create FineTuneDPOMethod.
     *
     * @param hyperparameters hyperparameters
     */
    public FineTuneDPOMethod(
        FineTuneDPOMethodHyperparameters hyperparameters
    ) {
        this.hyperparameters = hyperparameters;
    }



    /**
     * Get hyperparameters
     * @return hyperparameters
     */
    public FineTuneDPOMethodHyperparameters getHyperparameters() {
        return hyperparameters;
    }

    public void setHyperparameters(FineTuneDPOMethodHyperparameters hyperparameters) {
        this.hyperparameters = hyperparameters;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FineTuneDPOMethod {\n");
        
        sb.append("    hyperparameters: ").append(toIndentedString(hyperparameters)).append("\n");
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

