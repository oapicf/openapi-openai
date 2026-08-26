package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ProjectUpdateRequest   {

    private String name;

    /**
     * Default constructor.
     */
    public ProjectUpdateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create ProjectUpdateRequest.
     *
     * @param name The updated name of the project, this name appears in reports.
     */
    public ProjectUpdateRequest(
        String name
    ) {
        this.name = name;
    }



    /**
     * The updated name of the project, this name appears in reports.
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
        sb.append("class ProjectUpdateRequest {\n");
        
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

