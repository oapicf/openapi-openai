package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The payload used to update the project.
 */
public class AuditLogProjectUpdatedChangesRequested   {

    private String title;

    /**
     * Default constructor.
     */
    public AuditLogProjectUpdatedChangesRequested() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogProjectUpdatedChangesRequested.
     *
     * @param title The title of the project as seen on the dashboard.
     */
    public AuditLogProjectUpdatedChangesRequested(
        String title
    ) {
        this.title = title;
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
        sb.append("class AuditLogProjectUpdatedChangesRequested {\n");
        
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

