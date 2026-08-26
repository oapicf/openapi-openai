package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AuditLogOrganizationUpdatedChangesRequestedSettings   {

    private String threadsUiVisibility;
    private String usageDashboardVisibility;

    /**
     * Default constructor.
     */
    public AuditLogOrganizationUpdatedChangesRequestedSettings() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogOrganizationUpdatedChangesRequestedSettings.
     *
     * @param threadsUiVisibility Visibility of the threads page which shows messages created with the Assistants API and Playground. One of &#x60;ANY_ROLE&#x60;, &#x60;OWNERS&#x60;, or &#x60;NONE&#x60;.
     * @param usageDashboardVisibility Visibility of the usage dashboard which shows activity and costs for your organization. One of &#x60;ANY_ROLE&#x60; or &#x60;OWNERS&#x60;.
     */
    public AuditLogOrganizationUpdatedChangesRequestedSettings(
        String threadsUiVisibility, 
        String usageDashboardVisibility
    ) {
        this.threadsUiVisibility = threadsUiVisibility;
        this.usageDashboardVisibility = usageDashboardVisibility;
    }



    /**
     * Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
     * @return threadsUiVisibility
     */
    public String getThreadsUiVisibility() {
        return threadsUiVisibility;
    }

    public void setThreadsUiVisibility(String threadsUiVisibility) {
        this.threadsUiVisibility = threadsUiVisibility;
    }

    /**
     * Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
     * @return usageDashboardVisibility
     */
    public String getUsageDashboardVisibility() {
        return usageDashboardVisibility;
    }

    public void setUsageDashboardVisibility(String usageDashboardVisibility) {
        this.usageDashboardVisibility = usageDashboardVisibility;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

