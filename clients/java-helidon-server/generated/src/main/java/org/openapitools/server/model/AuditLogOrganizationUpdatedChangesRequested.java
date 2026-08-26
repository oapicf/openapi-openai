package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AuditLogOrganizationUpdatedChangesRequestedSettings;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The payload used to update the organization settings.
 */
public class AuditLogOrganizationUpdatedChangesRequested   {

    private String title;
    private String description;
    private String name;
    private AuditLogOrganizationUpdatedChangesRequestedSettings settings;

    /**
     * Default constructor.
     */
    public AuditLogOrganizationUpdatedChangesRequested() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogOrganizationUpdatedChangesRequested.
     *
     * @param title The organization title.
     * @param description The organization description.
     * @param name The organization name.
     * @param settings settings
     */
    public AuditLogOrganizationUpdatedChangesRequested(
        String title, 
        String description, 
        String name, 
        AuditLogOrganizationUpdatedChangesRequestedSettings settings
    ) {
        this.title = title;
        this.description = description;
        this.name = name;
        this.settings = settings;
    }



    /**
     * The organization title.
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The organization description.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The organization name.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get settings
     * @return settings
     */
    public AuditLogOrganizationUpdatedChangesRequestedSettings getSettings() {
        return settings;
    }

    public void setSettings(AuditLogOrganizationUpdatedChangesRequestedSettings settings) {
        this.settings = settings;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogOrganizationUpdatedChangesRequested {\n");
        
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

