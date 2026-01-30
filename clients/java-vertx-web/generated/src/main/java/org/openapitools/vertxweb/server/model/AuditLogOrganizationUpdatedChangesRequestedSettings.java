package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditLogOrganizationUpdatedChangesRequestedSettings   {
  
  private String threadsUiVisibility;
  private String usageDashboardVisibility;

  public AuditLogOrganizationUpdatedChangesRequestedSettings () {

  }

  public AuditLogOrganizationUpdatedChangesRequestedSettings (String threadsUiVisibility, String usageDashboardVisibility) {
    this.threadsUiVisibility = threadsUiVisibility;
    this.usageDashboardVisibility = usageDashboardVisibility;
  }

    
  @JsonProperty("threads_ui_visibility")
  public String getThreadsUiVisibility() {
    return threadsUiVisibility;
  }
  public void setThreadsUiVisibility(String threadsUiVisibility) {
    this.threadsUiVisibility = threadsUiVisibility;
  }

    
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
