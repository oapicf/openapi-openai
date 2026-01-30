package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogOrganizationUpdatedChangesRequestedSettings;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The payload used to update the organization settings.
 **/
@ApiModel(description = "The payload used to update the organization settings.")
@JsonTypeName("AuditLog_organization_updated_changes_requested")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogOrganizationUpdatedChangesRequested   {
  private String title;
  private String description;
  private String name;
  private AuditLogOrganizationUpdatedChangesRequestedSettings settings;

  public AuditLogOrganizationUpdatedChangesRequested() {
  }

  /**
   * The organization title.
   **/
  public AuditLogOrganizationUpdatedChangesRequested title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "The organization title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The organization description.
   **/
  public AuditLogOrganizationUpdatedChangesRequested description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "The organization description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The organization name.
   **/
  public AuditLogOrganizationUpdatedChangesRequested name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The organization name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public AuditLogOrganizationUpdatedChangesRequested settings(AuditLogOrganizationUpdatedChangesRequestedSettings settings) {
    this.settings = settings;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("settings")
  @Valid public AuditLogOrganizationUpdatedChangesRequestedSettings getSettings() {
    return settings;
  }

  @JsonProperty("settings")
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

