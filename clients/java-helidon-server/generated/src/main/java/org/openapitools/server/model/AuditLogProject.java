package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The project that the action was scoped to. Absent for actions not scoped to projects.
 */
public class AuditLogProject   {

    private String id;
    private String name;

    /**
     * Default constructor.
     */
    public AuditLogProject() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogProject.
     *
     * @param id The project ID.
     * @param name The project title.
     */
    public AuditLogProject(
        String id, 
        String name
    ) {
        this.id = id;
        this.name = name;
    }



    /**
     * The project ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The project title.
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
        sb.append("class AuditLogProject {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

