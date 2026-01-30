/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogOrganizationUpdatedChangesRequestedSettings;



/**
 * The payload used to update the organization settings.
 */

@ApiModel(description = "The payload used to update the organization settings.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogOrganizationUpdatedChangesRequested   {
  
  private String title;
  private String description;
  private String name;
  private AuditLogOrganizationUpdatedChangesRequestedSettings settings;

  /**
   * The organization title.
   */
  public AuditLogOrganizationUpdatedChangesRequested title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "The organization title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The organization description.
   */
  public AuditLogOrganizationUpdatedChangesRequested description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "The organization description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The organization name.
   */
  public AuditLogOrganizationUpdatedChangesRequested name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The organization name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   */
  public AuditLogOrganizationUpdatedChangesRequested settings(AuditLogOrganizationUpdatedChangesRequestedSettings settings) {
    this.settings = settings;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

