package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdminApiKeysCreateRequest   {

    private String name;

    /**
     * Default constructor.
     */
    public AdminApiKeysCreateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create AdminApiKeysCreateRequest.
     *
     * @param name name
     */
    public AdminApiKeysCreateRequest(
        String name
    ) {
        this.name = name;
    }



    /**
     * Get name
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
        sb.append("class AdminApiKeysCreateRequest {\n");
        
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

