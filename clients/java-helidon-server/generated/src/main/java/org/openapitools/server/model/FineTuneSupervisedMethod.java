package org.openapitools.server.model;

import org.openapitools.server.model.FineTuneSupervisedMethodHyperparameters;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Configuration for the supervised fine-tuning method.
 */
public class FineTuneSupervisedMethod   {

    private FineTuneSupervisedMethodHyperparameters hyperparameters;

    /**
     * Default constructor.
     */
    public FineTuneSupervisedMethod() {
    // JSON-B / Jackson
    }

    /**
     * Create FineTuneSupervisedMethod.
     *
     * @param hyperparameters hyperparameters
     */
    public FineTuneSupervisedMethod(
        FineTuneSupervisedMethodHyperparameters hyperparameters
    ) {
        this.hyperparameters = hyperparameters;
    }



    /**
     * Get hyperparameters
     * @return hyperparameters
     */
    public FineTuneSupervisedMethodHyperparameters getHyperparameters() {
        return hyperparameters;
    }

    public void setHyperparameters(FineTuneSupervisedMethodHyperparameters hyperparameters) {
        this.hyperparameters = hyperparameters;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FineTuneSupervisedMethod {\n");
        
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

