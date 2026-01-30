package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AuditLogOrganizationUpdatedChangesRequestedSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AuditLogOrganizationUpdatedChangesRequestedSettings   {
  @JsonProperty("threads_ui_visibility")
  
  private String threadsUiVisibility;

  @JsonProperty("usage_dashboard_visibility")
  
  private String usageDashboardVisibility;

  public AuditLogOrganizationUpdatedChangesRequestedSettings threadsUiVisibility(String threadsUiVisibility) {
    this.threadsUiVisibility = threadsUiVisibility;
    return this;
  }

   /**
   * Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
   * @return threadsUiVisibility
  **/
  public String getThreadsUiVisibility() {
    return threadsUiVisibility;
  }

  public void setThreadsUiVisibility(String threadsUiVisibility) {
    this.threadsUiVisibility = threadsUiVisibility;
  }

  public AuditLogOrganizationUpdatedChangesRequestedSettings usageDashboardVisibility(String usageDashboardVisibility) {
    this.usageDashboardVisibility = usageDashboardVisibility;
    return this;
  }

   /**
   * Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
   * @return usageDashboardVisibility
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

