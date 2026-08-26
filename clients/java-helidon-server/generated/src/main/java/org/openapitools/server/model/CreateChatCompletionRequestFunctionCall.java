package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ChatCompletionFunctionCallOption;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Deprecated in favor of `tool_choice`.  Controls which (if any) function is called by the model.  `none` means the model will not call a function and instead generates a message.  `auto` means the model can pick between generating a message or calling a function.  Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 
 */
public class CreateChatCompletionRequestFunctionCall   {

    private String name;

    /**
     * Default constructor.
     */
    public CreateChatCompletionRequestFunctionCall() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateChatCompletionRequestFunctionCall.
     *
     * @param name The name of the function to call.
     */
    public CreateChatCompletionRequestFunctionCall(
        String name
    ) {
        this.name = name;
    }



    /**
     * The name of the function to call.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChatCompletionRequestFunctionCall {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

