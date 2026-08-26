package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import org.openapitools.server.model.ChatCompletionRequestMessageContentPartText;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. 
 */
public class PredictionContentContent   {


    /**
     * Default constructor.
     */
    public PredictionContentContent() {
    // JSON-B / Jackson
    }





    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PredictionContentContent {\n");
        
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

