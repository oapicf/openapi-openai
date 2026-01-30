package apimodels;

import apimodels.AuditLogOrganizationUpdatedChangesRequestedSettings;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The payload used to update the organization settings.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AuditLogOrganizationUpdatedChangesRequested   {
  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("settings")
  @Valid

  private AuditLogOrganizationUpdatedChangesRequestedSettings settings;

  public AuditLogOrganizationUpdatedChangesRequested title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The organization title.
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AuditLogOrganizationUpdatedChangesRequested description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The organization description.
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AuditLogOrganizationUpdatedChangesRequested name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The organization name.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuditLogOrganizationUpdatedChangesRequested settings(AuditLogOrganizationUpdatedChangesRequestedSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

