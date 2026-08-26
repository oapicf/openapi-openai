package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
 */
public class FineTuneDPOMethodHyperparametersNEpochs   {


    /**
     * Default constructor.
     */
    public FineTuneDPOMethodHyperparametersNEpochs() {
    // JSON-B / Jackson
    }





    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FineTuneDPOMethodHyperparametersNEpochs {\n");
        
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

