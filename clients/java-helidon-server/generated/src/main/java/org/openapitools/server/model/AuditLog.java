package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AuditLogActor;
import org.openapitools.server.model.AuditLogApiKeyCreated;
import org.openapitools.server.model.AuditLogApiKeyDeleted;
import org.openapitools.server.model.AuditLogApiKeyUpdated;
import org.openapitools.server.model.AuditLogEventType;
import org.openapitools.server.model.AuditLogInviteAccepted;
import org.openapitools.server.model.AuditLogInviteSent;
import org.openapitools.server.model.AuditLogLoginFailed;
import org.openapitools.server.model.AuditLogOrganizationUpdated;
import org.openapitools.server.model.AuditLogProject;
import org.openapitools.server.model.AuditLogProjectArchived;
import org.openapitools.server.model.AuditLogProjectCreated;
import org.openapitools.server.model.AuditLogProjectUpdated;
import org.openapitools.server.model.AuditLogRateLimitDeleted;
import org.openapitools.server.model.AuditLogRateLimitUpdated;
import org.openapitools.server.model.AuditLogServiceAccountCreated;
import org.openapitools.server.model.AuditLogServiceAccountDeleted;
import org.openapitools.server.model.AuditLogServiceAccountUpdated;
import org.openapitools.server.model.AuditLogUserAdded;
import org.openapitools.server.model.AuditLogUserDeleted;
import org.openapitools.server.model.AuditLogUserUpdated;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A log of a user action or configuration change within this organization.
 */
public class AuditLog   {

    private String id;
    private AuditLogEventType type;
    private Integer effectiveAt;
    private AuditLogProject project;
    private AuditLogActor actor;
    private AuditLogApiKeyCreated apiKeyCreated;
    private AuditLogApiKeyUpdated apiKeyUpdated;
    private AuditLogApiKeyDeleted apiKeyDeleted;
    private AuditLogInviteSent inviteSent;
    private AuditLogInviteAccepted inviteAccepted;
    private AuditLogInviteAccepted inviteDeleted;
    private AuditLogLoginFailed loginFailed;
    private AuditLogLoginFailed logoutFailed;
    private AuditLogOrganizationUpdated organizationUpdated;
    private AuditLogProjectCreated projectCreated;
    private AuditLogProjectUpdated projectUpdated;
    private AuditLogProjectArchived projectArchived;
    private AuditLogRateLimitUpdated rateLimitUpdated;
    private AuditLogRateLimitDeleted rateLimitDeleted;
    private AuditLogServiceAccountCreated serviceAccountCreated;
    private AuditLogServiceAccountUpdated serviceAccountUpdated;
    private AuditLogServiceAccountDeleted serviceAccountDeleted;
    private AuditLogUserAdded userAdded;
    private AuditLogUserUpdated userUpdated;
    private AuditLogUserDeleted userDeleted;

    /**
     * Default constructor.
     */
    public AuditLog() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLog.
     *
     * @param id The ID of this log.
     * @param type type
     * @param effectiveAt The Unix timestamp (in seconds) of the event.
     * @param project project
     * @param actor actor
     * @param apiKeyCreated apiKeyCreated
     * @param apiKeyUpdated apiKeyUpdated
     * @param apiKeyDeleted apiKeyDeleted
     * @param inviteSent inviteSent
     * @param inviteAccepted inviteAccepted
     * @param inviteDeleted inviteDeleted
     * @param loginFailed loginFailed
     * @param logoutFailed logoutFailed
     * @param organizationUpdated organizationUpdated
     * @param projectCreated projectCreated
     * @param projectUpdated projectUpdated
     * @param projectArchived projectArchived
     * @param rateLimitUpdated rateLimitUpdated
     * @param rateLimitDeleted rateLimitDeleted
     * @param serviceAccountCreated serviceAccountCreated
     * @param serviceAccountUpdated serviceAccountUpdated
     * @param serviceAccountDeleted serviceAccountDeleted
     * @param userAdded userAdded
     * @param userUpdated userUpdated
     * @param userDeleted userDeleted
     */
    public AuditLog(
        String id, 
        AuditLogEventType type, 
        Integer effectiveAt, 
        AuditLogProject project, 
        AuditLogActor actor, 
        AuditLogApiKeyCreated apiKeyCreated, 
        AuditLogApiKeyUpdated apiKeyUpdated, 
        AuditLogApiKeyDeleted apiKeyDeleted, 
        AuditLogInviteSent inviteSent, 
        AuditLogInviteAccepted inviteAccepted, 
        AuditLogInviteAccepted inviteDeleted, 
        AuditLogLoginFailed loginFailed, 
        AuditLogLoginFailed logoutFailed, 
        AuditLogOrganizationUpdated organizationUpdated, 
        AuditLogProjectCreated projectCreated, 
        AuditLogProjectUpdated projectUpdated, 
        AuditLogProjectArchived projectArchived, 
        AuditLogRateLimitUpdated rateLimitUpdated, 
        AuditLogRateLimitDeleted rateLimitDeleted, 
        AuditLogServiceAccountCreated serviceAccountCreated, 
        AuditLogServiceAccountUpdated serviceAccountUpdated, 
        AuditLogServiceAccountDeleted serviceAccountDeleted, 
        AuditLogUserAdded userAdded, 
        AuditLogUserUpdated userUpdated, 
        AuditLogUserDeleted userDeleted
    ) {
        this.id = id;
        this.type = type;
        this.effectiveAt = effectiveAt;
        this.project = project;
        this.actor = actor;
        this.apiKeyCreated = apiKeyCreated;
        this.apiKeyUpdated = apiKeyUpdated;
        this.apiKeyDeleted = apiKeyDeleted;
        this.inviteSent = inviteSent;
        this.inviteAccepted = inviteAccepted;
        this.inviteDeleted = inviteDeleted;
        this.loginFailed = loginFailed;
        this.logoutFailed = logoutFailed;
        this.organizationUpdated = organizationUpdated;
        this.projectCreated = projectCreated;
        this.projectUpdated = projectUpdated;
        this.projectArchived = projectArchived;
        this.rateLimitUpdated = rateLimitUpdated;
        this.rateLimitDeleted = rateLimitDeleted;
        this.serviceAccountCreated = serviceAccountCreated;
        this.serviceAccountUpdated = serviceAccountUpdated;
        this.serviceAccountDeleted = serviceAccountDeleted;
        this.userAdded = userAdded;
        this.userUpdated = userUpdated;
        this.userDeleted = userDeleted;
    }



    /**
     * The ID of this log.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get type
     * @return type
     */
    public AuditLogEventType getType() {
        return type;
    }

    public void setType(AuditLogEventType type) {
        this.type = type;
    }

    /**
     * The Unix timestamp (in seconds) of the event.
     * @return effectiveAt
     */
    public Integer getEffectiveAt() {
        return effectiveAt;
    }

    public void setEffectiveAt(Integer effectiveAt) {
        this.effectiveAt = effectiveAt;
    }

    /**
     * Get project
     * @return project
     */
    public AuditLogProject getProject() {
        return project;
    }

    public void setProject(AuditLogProject project) {
        this.project = project;
    }

    /**
     * Get actor
     * @return actor
     */
    public AuditLogActor getActor() {
        return actor;
    }

    public void setActor(AuditLogActor actor) {
        this.actor = actor;
    }

    /**
     * Get apiKeyCreated
     * @return apiKeyCreated
     */
    public AuditLogApiKeyCreated getApiKeyCreated() {
        return apiKeyCreated;
    }

    public void setApiKeyCreated(AuditLogApiKeyCreated apiKeyCreated) {
        this.apiKeyCreated = apiKeyCreated;
    }

    /**
     * Get apiKeyUpdated
     * @return apiKeyUpdated
     */
    public AuditLogApiKeyUpdated getApiKeyUpdated() {
        return apiKeyUpdated;
    }

    public void setApiKeyUpdated(AuditLogApiKeyUpdated apiKeyUpdated) {
        this.apiKeyUpdated = apiKeyUpdated;
    }

    /**
     * Get apiKeyDeleted
     * @return apiKeyDeleted
     */
    public AuditLogApiKeyDeleted getApiKeyDeleted() {
        return apiKeyDeleted;
    }

    public void setApiKeyDeleted(AuditLogApiKeyDeleted apiKeyDeleted) {
        this.apiKeyDeleted = apiKeyDeleted;
    }

    /**
     * Get inviteSent
     * @return inviteSent
     */
    public AuditLogInviteSent getInviteSent() {
        return inviteSent;
    }

    public void setInviteSent(AuditLogInviteSent inviteSent) {
        this.inviteSent = inviteSent;
    }

    /**
     * Get inviteAccepted
     * @return inviteAccepted
     */
    public AuditLogInviteAccepted getInviteAccepted() {
        return inviteAccepted;
    }

    public void setInviteAccepted(AuditLogInviteAccepted inviteAccepted) {
        this.inviteAccepted = inviteAccepted;
    }

    /**
     * Get inviteDeleted
     * @return inviteDeleted
     */
    public AuditLogInviteAccepted getInviteDeleted() {
        return inviteDeleted;
    }

    public void setInviteDeleted(AuditLogInviteAccepted inviteDeleted) {
        this.inviteDeleted = inviteDeleted;
    }

    /**
     * Get loginFailed
     * @return loginFailed
     */
    public AuditLogLoginFailed getLoginFailed() {
        return loginFailed;
    }

    public void setLoginFailed(AuditLogLoginFailed loginFailed) {
        this.loginFailed = loginFailed;
    }

    /**
     * Get logoutFailed
     * @return logoutFailed
     */
    public AuditLogLoginFailed getLogoutFailed() {
        return logoutFailed;
    }

    public void setLogoutFailed(AuditLogLoginFailed logoutFailed) {
        this.logoutFailed = logoutFailed;
    }

    /**
     * Get organizationUpdated
     * @return organizationUpdated
     */
    public AuditLogOrganizationUpdated getOrganizationUpdated() {
        return organizationUpdated;
    }

    public void setOrganizationUpdated(AuditLogOrganizationUpdated organizationUpdated) {
        this.organizationUpdated = organizationUpdated;
    }

    /**
     * Get projectCreated
     * @return projectCreated
     */
    public AuditLogProjectCreated getProjectCreated() {
        return projectCreated;
    }

    public void setProjectCreated(AuditLogProjectCreated projectCreated) {
        this.projectCreated = projectCreated;
    }

    /**
     * Get projectUpdated
     * @return projectUpdated
     */
    public AuditLogProjectUpdated getProjectUpdated() {
        return projectUpdated;
    }

    public void setProjectUpdated(AuditLogProjectUpdated projectUpdated) {
        this.projectUpdated = projectUpdated;
    }

    /**
     * Get projectArchived
     * @return projectArchived
     */
    public AuditLogProjectArchived getProjectArchived() {
        return projectArchived;
    }

    public void setProjectArchived(AuditLogProjectArchived projectArchived) {
        this.projectArchived = projectArchived;
    }

    /**
     * Get rateLimitUpdated
     * @return rateLimitUpdated
     */
    public AuditLogRateLimitUpdated getRateLimitUpdated() {
        return rateLimitUpdated;
    }

    public void setRateLimitUpdated(AuditLogRateLimitUpdated rateLimitUpdated) {
        this.rateLimitUpdated = rateLimitUpdated;
    }

    /**
     * Get rateLimitDeleted
     * @return rateLimitDeleted
     */
    public AuditLogRateLimitDeleted getRateLimitDeleted() {
        return rateLimitDeleted;
    }

    public void setRateLimitDeleted(AuditLogRateLimitDeleted rateLimitDeleted) {
        this.rateLimitDeleted = rateLimitDeleted;
    }

    /**
     * Get serviceAccountCreated
     * @return serviceAccountCreated
     */
    public AuditLogServiceAccountCreated getServiceAccountCreated() {
        return serviceAccountCreated;
    }

    public void setServiceAccountCreated(AuditLogServiceAccountCreated serviceAccountCreated) {
        this.serviceAccountCreated = serviceAccountCreated;
    }

    /**
     * Get serviceAccountUpdated
     * @return serviceAccountUpdated
     */
    public AuditLogServiceAccountUpdated getServiceAccountUpdated() {
        return serviceAccountUpdated;
    }

    public void setServiceAccountUpdated(AuditLogServiceAccountUpdated serviceAccountUpdated) {
        this.serviceAccountUpdated = serviceAccountUpdated;
    }

    /**
     * Get serviceAccountDeleted
     * @return serviceAccountDeleted
     */
    public AuditLogServiceAccountDeleted getServiceAccountDeleted() {
        return serviceAccountDeleted;
    }

    public void setServiceAccountDeleted(AuditLogServiceAccountDeleted serviceAccountDeleted) {
        this.serviceAccountDeleted = serviceAccountDeleted;
    }

    /**
     * Get userAdded
     * @return userAdded
     */
    public AuditLogUserAdded getUserAdded() {
        return userAdded;
    }

    public void setUserAdded(AuditLogUserAdded userAdded) {
        this.userAdded = userAdded;
    }

    /**
     * Get userUpdated
     * @return userUpdated
     */
    public AuditLogUserUpdated getUserUpdated() {
        return userUpdated;
    }

    public void setUserUpdated(AuditLogUserUpdated userUpdated) {
        this.userUpdated = userUpdated;
    }

    /**
     * Get userDeleted
     * @return userDeleted
     */
    public AuditLogUserDeleted getUserDeleted() {
        return userDeleted;
    }

    public void setUserDeleted(AuditLogUserDeleted userDeleted) {
        this.userDeleted = userDeleted;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLog {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    effectiveAt: ").append(toIndentedString(effectiveAt)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
        sb.append("    apiKeyCreated: ").append(toIndentedString(apiKeyCreated)).append("\n");
        sb.append("    apiKeyUpdated: ").append(toIndentedString(apiKeyUpdated)).append("\n");
        sb.append("    apiKeyDeleted: ").append(toIndentedString(apiKeyDeleted)).append("\n");
        sb.append("    inviteSent: ").append(toIndentedString(inviteSent)).append("\n");
        sb.append("    inviteAccepted: ").append(toIndentedString(inviteAccepted)).append("\n");
        sb.append("    inviteDeleted: ").append(toIndentedString(inviteDeleted)).append("\n");
        sb.append("    loginFailed: ").append(toIndentedString(loginFailed)).append("\n");
        sb.append("    logoutFailed: ").append(toIndentedString(logoutFailed)).append("\n");
        sb.append("    organizationUpdated: ").append(toIndentedString(organizationUpdated)).append("\n");
        sb.append("    projectCreated: ").append(toIndentedString(projectCreated)).append("\n");
        sb.append("    projectUpdated: ").append(toIndentedString(projectUpdated)).append("\n");
        sb.append("    projectArchived: ").append(toIndentedString(projectArchived)).append("\n");
        sb.append("    rateLimitUpdated: ").append(toIndentedString(rateLimitUpdated)).append("\n");
        sb.append("    rateLimitDeleted: ").append(toIndentedString(rateLimitDeleted)).append("\n");
        sb.append("    serviceAccountCreated: ").append(toIndentedString(serviceAccountCreated)).append("\n");
        sb.append("    serviceAccountUpdated: ").append(toIndentedString(serviceAccountUpdated)).append("\n");
        sb.append("    serviceAccountDeleted: ").append(toIndentedString(serviceAccountDeleted)).append("\n");
        sb.append("    userAdded: ").append(toIndentedString(userAdded)).append("\n");
        sb.append("    userUpdated: ").append(toIndentedString(userUpdated)).append("\n");
        sb.append("    userDeleted: ").append(toIndentedString(userDeleted)).append("\n");
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

