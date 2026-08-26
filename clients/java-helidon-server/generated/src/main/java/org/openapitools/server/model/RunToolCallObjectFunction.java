package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The function definition.
 */
public class RunToolCallObjectFunction   {

    private String name;
    private String arguments;

    /**
     * Default constructor.
     */
    public RunToolCallObjectFunction() {
    // JSON-B / Jackson
    }

    /**
     * Create RunToolCallObjectFunction.
     *
     * @param name The name of the function.
     * @param arguments The arguments that the model expects you to pass to the function.
     */
    public RunToolCallObjectFunction(
        String name, 
        String arguments
    ) {
        this.name = name;
        this.arguments = arguments;
    }



    /**
     * The name of the function.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The arguments that the model expects you to pass to the function.
     * @return arguments
     */
    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunToolCallObjectFunction {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

