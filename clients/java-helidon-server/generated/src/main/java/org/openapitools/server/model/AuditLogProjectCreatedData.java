package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The payload used to create the project.
 */
public class AuditLogProjectCreatedData   {

    private String name;
    private String title;

    /**
     * Default constructor.
     */
    public AuditLogProjectCreatedData() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogProjectCreatedData.
     *
     * @param name The project name.
     * @param title The title of the project as seen on the dashboard.
     */
    public AuditLogProjectCreatedData(
        String name, 
        String title
    ) {
        this.name = name;
        this.title = title;
    }



    /**
     * The project name.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The title of the project as seen on the dashboard.
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogProjectCreatedData {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

