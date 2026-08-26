package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
 */
public class FineTuneDPOMethodHyperparametersBatchSize   {


    /**
     * Default constructor.
     */
    public FineTuneDPOMethodHyperparametersBatchSize() {
    // JSON-B / Jackson
    }





    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FineTuneDPOMethodHyperparametersBatchSize {\n");
        
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

