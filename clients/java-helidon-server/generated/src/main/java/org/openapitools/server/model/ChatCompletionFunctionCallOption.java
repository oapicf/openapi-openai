package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
 */
public class ChatCompletionFunctionCallOption   {

    private String name;

    /**
     * Default constructor.
     */
    public ChatCompletionFunctionCallOption() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionFunctionCallOption.
     *
     * @param name The name of the function to call.
     */
    public ChatCompletionFunctionCallOption(
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
        sb.append("class ChatCompletionFunctionCallOption {\n");
        
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

