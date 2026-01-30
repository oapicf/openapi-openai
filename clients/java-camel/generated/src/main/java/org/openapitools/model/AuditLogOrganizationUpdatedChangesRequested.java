package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AuditLogOrganizationUpdatedChangesRequestedSettings;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The payload used to update the organization settings.
 */

@Schema(name = "AuditLog_organization_updated_changes_requested", description = "The payload used to update the organization settings.")
@JsonTypeName("AuditLog_organization_updated_changes_requested")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogOrganizationUpdatedChangesRequested {

  private String title;

  private String description;

  private String name;

  private AuditLogOrganizationUpdatedChangesRequestedSettings settings;

  public AuditLogOrganizationUpdatedChangesRequested title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The organization title.
   * @return title
   */
  
  @Schema(name = "title", description = "The organization title.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
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
   */
  
  @Schema(name = "description", description = "The organization description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
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
   */
  
  @Schema(name = "name", description = "The organization name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
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
   */
  @Valid 
  @Schema(name = "settings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.title, auditLogOrganizationUpdatedChangesRequested.title) &&
        Objects.equals(this.description, auditLogOrganizationUpdatedChangesRequested.description) &&
        Objects.equals(this.name, auditLogOrganizationUpdatedChangesRequested.name) &&
        Objects.equals(this.settings, auditLogOrganizationUpdatedChangesRequested.settings);
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

