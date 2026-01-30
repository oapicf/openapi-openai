package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AuditLogOrganizationUpdatedChangesRequestedSettings;

/**
 * The payload used to update the organization settings.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditLogOrganizationUpdatedChangesRequested   {
  
  private String title;
  private String description;
  private String name;
  private AuditLogOrganizationUpdatedChangesRequestedSettings settings;

  public AuditLogOrganizationUpdatedChangesRequested () {

  }

  public AuditLogOrganizationUpdatedChangesRequested (String title, String description, String name, AuditLogOrganizationUpdatedChangesRequestedSettings settings) {
    this.title = title;
    this.description = description;
    this.name = name;
    this.settings = settings;
  }

    
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("settings")
  public AuditLogOrganizationUpdatedChangesRequestedSettings getSettings() {
    return settings;
  }
  public void setSettings(AuditLogOrganizationUpdatedChangesRequestedSettings settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogOrganizationUpdatedChangesRequested auditLogOrganizationUpdatedChangesRequested = (AuditLogOrganizationUpdatedChangesRequested) o;
    return Objects.equals(title, auditLogOrganizationUpdatedChangesRequested.title) &&
        Objects.equals(description, auditLogOrganizationUpdatedChangesRequested.description) &&
        Objects.equals(name, auditLogOrganizationUpdatedChangesRequested.name) &&
        Objects.equals(settings, auditLogOrganizationUpdatedChangesRequested.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, name, settings);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
