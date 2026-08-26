package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
 */
public class CreateFineTuningJobRequestHyperparametersLearningRateMultiplier   {


    /**
     * Default constructor.
     */
    public CreateFineTuningJobRequestHyperparametersLearningRateMultiplier() {
    // JSON-B / Jackson
    }





    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFineTuningJobRequestHyperparametersLearningRateMultiplier {\n");
        
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

