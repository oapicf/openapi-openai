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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogOrganizationUpdatedChangesRequestedSettings   {
  
  private String threadsUiVisibility;
  private String usageDashboardVisibility;

  /**
   * Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
   */
  public AuditLogOrganizationUpdatedChangesRequestedSettings threadsUiVisibility(String threadsUiVisibility) {
    this.threadsUiVisibility = threadsUiVisibility;
    return this;
  }

  
  @ApiModelProperty(value = "Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.")
  @JsonProperty("threads_ui_visibility")
  public String getThreadsUiVisibility() {
    return threadsUiVisibility;
  }
  public void setThreadsUiVisibility(String threadsUiVisibility) {
    this.threadsUiVisibility = threadsUiVisibility;
  }

  /**
   * Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
   */
  public AuditLogOrganizationUpdatedChangesRequestedSettings usageDashboardVisibility(String usageDashboardVisibility) {
    this.usageDashboardVisibility = usageDashboardVisibility;
    return this;
  }

  
  @ApiModelProperty(value = "Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.")
  @JsonProperty("usage_dashboard_visibility")
  public String getUsageDashboardVisibility() {
    return usageDashboardVisibility;
  }
  public void setUsageDashboardVisibility(String usageDashboardVisibility) {
    this.usageDashboardVisibility = usageDashboardVisibility;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogOrganizationUpdatedChangesRequestedSettings auditLogOrganizationUpdatedChangesRequestedSettings = (AuditLogOrganizationUpdatedChangesRequestedSettings) o;
    return Objects.equals(threadsUiVisibility, auditLogOrganizationUpdatedChangesRequestedSettings.threadsUiVisibility) &&
        Objects.equals(usageDashboardVisibility, auditLogOrganizationUpdatedChangesRequestedSettings.usageDashboardVisibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadsUiVisibility, usageDashboardVisibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogOrganizationUpdatedChangesRequestedSettings {\n");
    
    sb.append("    threadsUiVisibility: ").append(toIndentedString(threadsUiVisibility)).append("\n");
    sb.append("    usageDashboardVisibility: ").append(toIndentedString(usageDashboardVisibility)).append("\n");
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

