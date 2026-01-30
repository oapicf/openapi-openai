package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.AuditLogActor;
import org.openapitools.vertxweb.server.model.AuditLogApiKeyCreated;
import org.openapitools.vertxweb.server.model.AuditLogApiKeyDeleted;
import org.openapitools.vertxweb.server.model.AuditLogApiKeyUpdated;
import org.openapitools.vertxweb.server.model.AuditLogEventType;
import org.openapitools.vertxweb.server.model.AuditLogInviteAccepted;
import org.openapitools.vertxweb.server.model.AuditLogInviteSent;
import org.openapitools.vertxweb.server.model.AuditLogLoginFailed;
import org.openapitools.vertxweb.server.model.AuditLogOrganizationUpdated;
import org.openapitools.vertxweb.server.model.AuditLogProject;
import org.openapitools.vertxweb.server.model.AuditLogProjectArchived;
import org.openapitools.vertxweb.server.model.AuditLogProjectCreated;
import org.openapitools.vertxweb.server.model.AuditLogProjectUpdated;
import org.openapitools.vertxweb.server.model.AuditLogRateLimitDeleted;
import org.openapitools.vertxweb.server.model.AuditLogRateLimitUpdated;
import org.openapitools.vertxweb.server.model.AuditLogServiceAccountCreated;
import org.openapitools.vertxweb.server.model.AuditLogServiceAccountDeleted;
import org.openapitools.vertxweb.server.model.AuditLogServiceAccountUpdated;
import org.openapitools.vertxweb.server.model.AuditLogUserAdded;
import org.openapitools.vertxweb.server.model.AuditLogUserDeleted;
import org.openapitools.vertxweb.server.model.AuditLogUserUpdated;

/**
 * A log of a user action or configuration change within this organization.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public AuditLog () {

  }

  public AuditLog (String id, AuditLogEventType type, Integer effectiveAt, AuditLogProject project, AuditLogActor actor, AuditLogApiKeyCreated apiKeyCreated, AuditLogApiKeyUpdated apiKeyUpdated, AuditLogApiKeyDeleted apiKeyDeleted, AuditLogInviteSent inviteSent, AuditLogInviteAccepted inviteAccepted, AuditLogInviteAccepted inviteDeleted, AuditLogLoginFailed loginFailed, AuditLogLoginFailed logoutFailed, AuditLogOrganizationUpdated organizationUpdated, AuditLogProjectCreated projectCreated, AuditLogProjectUpdated projectUpdated, AuditLogProjectArchived projectArchived, AuditLogRateLimitUpdated rateLimitUpdated, AuditLogRateLimitDeleted rateLimitDeleted, AuditLogServiceAccountCreated serviceAccountCreated, AuditLogServiceAccountUpdated serviceAccountUpdated, AuditLogServiceAccountDeleted serviceAccountDeleted, AuditLogUserAdded userAdded, AuditLogUserUpdated userUpdated, AuditLogUserDeleted userDeleted) {
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

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("type")
  public AuditLogEventType getType() {
    return type;
  }
  public void setType(AuditLogEventType type) {
    this.type = type;
  }

    
  @JsonProperty("effective_at")
  public Integer getEffectiveAt() {
    return effectiveAt;
  }
  public void setEffectiveAt(Integer effectiveAt) {
    this.effectiveAt = effectiveAt;
  }

    
  @JsonProperty("project")
  public AuditLogProject getProject() {
    return project;
  }
  public void setProject(AuditLogProject project) {
    this.project = project;
  }

    
  @JsonProperty("actor")
  public AuditLogActor getActor() {
    return actor;
  }
  public void setActor(AuditLogActor actor) {
    this.actor = actor;
  }

    
  @JsonProperty("api_key.created")
  public AuditLogApiKeyCreated getApiKeyCreated() {
    return apiKeyCreated;
  }
  public void setApiKeyCreated(AuditLogApiKeyCreated apiKeyCreated) {
    this.apiKeyCreated = apiKeyCreated;
  }

    
  @JsonProperty("api_key.updated")
  public AuditLogApiKeyUpdated getApiKeyUpdated() {
    return apiKeyUpdated;
  }
  public void setApiKeyUpdated(AuditLogApiKeyUpdated apiKeyUpdated) {
    this.apiKeyUpdated = apiKeyUpdated;
  }

    
  @JsonProperty("api_key.deleted")
  public AuditLogApiKeyDeleted getApiKeyDeleted() {
    return apiKeyDeleted;
  }
  public void setApiKeyDeleted(AuditLogApiKeyDeleted apiKeyDeleted) {
    this.apiKeyDeleted = apiKeyDeleted;
  }

    
  @JsonProperty("invite.sent")
  public AuditLogInviteSent getInviteSent() {
    return inviteSent;
  }
  public void setInviteSent(AuditLogInviteSent inviteSent) {
    this.inviteSent = inviteSent;
  }

    
  @JsonProperty("invite.accepted")
  public AuditLogInviteAccepted getInviteAccepted() {
    return inviteAccepted;
  }
  public void setInviteAccepted(AuditLogInviteAccepted inviteAccepted) {
    this.inviteAccepted = inviteAccepted;
  }

    
  @JsonProperty("invite.deleted")
  public AuditLogInviteAccepted getInviteDeleted() {
    return inviteDeleted;
  }
  public void setInviteDeleted(AuditLogInviteAccepted inviteDeleted) {
    this.inviteDeleted = inviteDeleted;
  }

    
  @JsonProperty("login.failed")
  public AuditLogLoginFailed getLoginFailed() {
    return loginFailed;
  }
  public void setLoginFailed(AuditLogLoginFailed loginFailed) {
    this.loginFailed = loginFailed;
  }

    
  @JsonProperty("logout.failed")
  public AuditLogLoginFailed getLogoutFailed() {
    return logoutFailed;
  }
  public void setLogoutFailed(AuditLogLoginFailed logoutFailed) {
    this.logoutFailed = logoutFailed;
  }

    
  @JsonProperty("organization.updated")
  public AuditLogOrganizationUpdated getOrganizationUpdated() {
    return organizationUpdated;
  }
  public void setOrganizationUpdated(AuditLogOrganizationUpdated organizationUpdated) {
    this.organizationUpdated = organizationUpdated;
  }

    
  @JsonProperty("project.created")
  public AuditLogProjectCreated getProjectCreated() {
    return projectCreated;
  }
  public void setProjectCreated(AuditLogProjectCreated projectCreated) {
    this.projectCreated = projectCreated;
  }

    
  @JsonProperty("project.updated")
  public AuditLogProjectUpdated getProjectUpdated() {
    return projectUpdated;
  }
  public void setProjectUpdated(AuditLogProjectUpdated projectUpdated) {
    this.projectUpdated = projectUpdated;
  }

    
  @JsonProperty("project.archived")
  public AuditLogProjectArchived getProjectArchived() {
    return projectArchived;
  }
  public void setProjectArchived(AuditLogProjectArchived projectArchived) {
    this.projectArchived = projectArchived;
  }

    
  @JsonProperty("rate_limit.updated")
  public AuditLogRateLimitUpdated getRateLimitUpdated() {
    return rateLimitUpdated;
  }
  public void setRateLimitUpdated(AuditLogRateLimitUpdated rateLimitUpdated) {
    this.rateLimitUpdated = rateLimitUpdated;
  }

    
  @JsonProperty("rate_limit.deleted")
  public AuditLogRateLimitDeleted getRateLimitDeleted() {
    return rateLimitDeleted;
  }
  public void setRateLimitDeleted(AuditLogRateLimitDeleted rateLimitDeleted) {
    this.rateLimitDeleted = rateLimitDeleted;
  }

    
  @JsonProperty("service_account.created")
  public AuditLogServiceAccountCreated getServiceAccountCreated() {
    return serviceAccountCreated;
  }
  public void setServiceAccountCreated(AuditLogServiceAccountCreated serviceAccountCreated) {
    this.serviceAccountCreated = serviceAccountCreated;
  }

    
  @JsonProperty("service_account.updated")
  public AuditLogServiceAccountUpdated getServiceAccountUpdated() {
    return serviceAccountUpdated;
  }
  public void setServiceAccountUpdated(AuditLogServiceAccountUpdated serviceAccountUpdated) {
    this.serviceAccountUpdated = serviceAccountUpdated;
  }

    
  @JsonProperty("service_account.deleted")
  public AuditLogServiceAccountDeleted getServiceAccountDeleted() {
    return serviceAccountDeleted;
  }
  public void setServiceAccountDeleted(AuditLogServiceAccountDeleted serviceAccountDeleted) {
    this.serviceAccountDeleted = serviceAccountDeleted;
  }

    
  @JsonProperty("user.added")
  public AuditLogUserAdded getUserAdded() {
    return userAdded;
  }
  public void setUserAdded(AuditLogUserAdded userAdded) {
    this.userAdded = userAdded;
  }

    
  @JsonProperty("user.updated")
  public AuditLogUserUpdated getUserUpdated() {
    return userUpdated;
  }
  public void setUserUpdated(AuditLogUserUpdated userUpdated) {
    this.userUpdated = userUpdated;
  }

    
  @JsonProperty("user.deleted")
  public AuditLogUserDeleted getUserDeleted() {
    return userDeleted;
  }
  public void setUserDeleted(AuditLogUserDeleted userDeleted) {
    this.userDeleted = userDeleted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLog auditLog = (AuditLog) o;
    return Objects.equals(id, auditLog.id) &&
        Objects.equals(type, auditLog.type) &&
        Objects.equals(effectiveAt, auditLog.effectiveAt) &&
        Objects.equals(project, auditLog.project) &&
        Objects.equals(actor, auditLog.actor) &&
        Objects.equals(apiKeyCreated, auditLog.apiKeyCreated) &&
        Objects.equals(apiKeyUpdated, auditLog.apiKeyUpdated) &&
        Objects.equals(apiKeyDeleted, auditLog.apiKeyDeleted) &&
        Objects.equals(inviteSent, auditLog.inviteSent) &&
        Objects.equals(inviteAccepted, auditLog.inviteAccepted) &&
        Objects.equals(inviteDeleted, auditLog.inviteDeleted) &&
        Objects.equals(loginFailed, auditLog.loginFailed) &&
        Objects.equals(logoutFailed, auditLog.logoutFailed) &&
        Objects.equals(organizationUpdated, auditLog.organizationUpdated) &&
        Objects.equals(projectCreated, auditLog.projectCreated) &&
        Objects.equals(projectUpdated, auditLog.projectUpdated) &&
        Objects.equals(projectArchived, auditLog.projectArchived) &&
        Objects.equals(rateLimitUpdated, auditLog.rateLimitUpdated) &&
        Objects.equals(rateLimitDeleted, auditLog.rateLimitDeleted) &&
        Objects.equals(serviceAccountCreated, auditLog.serviceAccountCreated) &&
        Objects.equals(serviceAccountUpdated, auditLog.serviceAccountUpdated) &&
        Objects.equals(serviceAccountDeleted, auditLog.serviceAccountDeleted) &&
        Objects.equals(userAdded, auditLog.userAdded) &&
        Objects.equals(userUpdated, auditLog.userUpdated) &&
        Objects.equals(userDeleted, auditLog.userDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, effectiveAt, project, actor, apiKeyCreated, apiKeyUpdated, apiKeyDeleted, inviteSent, inviteAccepted, inviteDeleted, loginFailed, logoutFailed, organizationUpdated, projectCreated, projectUpdated, projectArchived, rateLimitUpdated, rateLimitDeleted, serviceAccountCreated, serviceAccountUpdated, serviceAccountDeleted, userAdded, userUpdated, userDeleted);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
