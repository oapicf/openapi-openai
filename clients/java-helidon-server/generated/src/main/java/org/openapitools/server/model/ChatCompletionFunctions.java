package org.openapitools.server.model;

import java.util.HashMap;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ChatCompletionFunctions   {

    private String description;
    private String name;
    private Map<String, Object> parameters = new HashMap<>();

    /**
     * Default constructor.
     */
    public ChatCompletionFunctions() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionFunctions.
     *
     * @param description A description of what the function does, used by the model to choose when and how to call the function.
     * @param name The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
     * @param parameters The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list.
     */
    public ChatCompletionFunctions(
        String description, 
        String name, 
        Map<String, Object> parameters
    ) {
        this.description = description;
        this.name = name;
        this.parameters = parameters;
    }



    /**
     * A description of what the function does, used by the model to choose when and how to call the function.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
     * @return parameters
     */
    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionFunctions {\n");
        
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

