package apimodels;

import apimodels.AuditLogActor;
import apimodels.AuditLogApiKeyCreated;
import apimodels.AuditLogApiKeyDeleted;
import apimodels.AuditLogApiKeyUpdated;
import apimodels.AuditLogEventType;
import apimodels.AuditLogInviteAccepted;
import apimodels.AuditLogInviteSent;
import apimodels.AuditLogLoginFailed;
import apimodels.AuditLogOrganizationUpdated;
import apimodels.AuditLogProject;
import apimodels.AuditLogProjectArchived;
import apimodels.AuditLogProjectCreated;
import apimodels.AuditLogProjectUpdated;
import apimodels.AuditLogRateLimitDeleted;
import apimodels.AuditLogRateLimitUpdated;
import apimodels.AuditLogServiceAccountCreated;
import apimodels.AuditLogServiceAccountDeleted;
import apimodels.AuditLogServiceAccountUpdated;
import apimodels.AuditLogUserAdded;
import apimodels.AuditLogUserDeleted;
import apimodels.AuditLogUserUpdated;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A log of a user action or configuration change within this organization.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AuditLog   {
  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("type")
  @NotNull
@Valid

  private AuditLogEventType type;

  @JsonProperty("effective_at")
  @NotNull

  private Integer effectiveAt;

  @JsonProperty("project")
  @Valid

  private AuditLogProject project;

  @JsonProperty("actor")
  @NotNull
@Valid

  private AuditLogActor actor;

  @JsonProperty("api_key.created")
  @Valid

  private AuditLogApiKeyCreated apiKeyCreated;

  @JsonProperty("api_key.updated")
  @Valid

  private AuditLogApiKeyUpdated apiKeyUpdated;

  @JsonProperty("api_key.deleted")
  @Valid

  private AuditLogApiKeyDeleted apiKeyDeleted;

  @JsonProperty("invite.sent")
  @Valid

  private AuditLogInviteSent inviteSent;

  @JsonProperty("invite.accepted")
  @Valid

  private AuditLogInviteAccepted inviteAccepted;

  @JsonProperty("invite.deleted")
  @Valid

  private AuditLogInviteAccepted inviteDeleted;

  @JsonProperty("login.failed")
  @Valid

  private AuditLogLoginFailed loginFailed;

  @JsonProperty("logout.failed")
  @Valid

  private AuditLogLoginFailed logoutFailed;

  @JsonProperty("organization.updated")
  @Valid

  private AuditLogOrganizationUpdated organizationUpdated;

  @JsonProperty("project.created")
  @Valid

  private AuditLogProjectCreated projectCreated;

  @JsonProperty("project.updated")
  @Valid

  private AuditLogProjectUpdated projectUpdated;

  @JsonProperty("project.archived")
  @Valid

  private AuditLogProjectArchived projectArchived;

  @JsonProperty("rate_limit.updated")
  @Valid

  private AuditLogRateLimitUpdated rateLimitUpdated;

  @JsonProperty("rate_limit.deleted")
  @Valid

  private AuditLogRateLimitDeleted rateLimitDeleted;

  @JsonProperty("service_account.created")
  @Valid

  private AuditLogServiceAccountCreated serviceAccountCreated;

  @JsonProperty("service_account.updated")
  @Valid

  private AuditLogServiceAccountUpdated serviceAccountUpdated;

  @JsonProperty("service_account.deleted")
  @Valid

  private AuditLogServiceAccountDeleted serviceAccountDeleted;

  @JsonProperty("user.added")
  @Valid

  private AuditLogUserAdded userAdded;

  @JsonProperty("user.updated")
  @Valid

  private AuditLogUserUpdated userUpdated;

  @JsonProperty("user.deleted")
  @Valid

  private AuditLogUserDeleted userDeleted;

  public AuditLog id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of this log.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditLog type(AuditLogEventType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public AuditLogEventType getType() {
    return type;
  }

  public void setType(AuditLogEventType type) {
    this.type = type;
  }

  public AuditLog effectiveAt(Integer effectiveAt) {
    this.effectiveAt = effectiveAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) of the event.
   * @return effectiveAt
  **/
  public Integer getEffectiveAt() {
    return effectiveAt;
  }

  public void setEffectiveAt(Integer effectiveAt) {
    this.effectiveAt = effectiveAt;
  }

  public AuditLog project(AuditLogProject project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  public AuditLogProject getProject() {
    return project;
  }

  public void setProject(AuditLogProject project) {
    this.project = project;
  }

  public AuditLog actor(AuditLogActor actor) {
    this.actor = actor;
    return this;
  }

   /**
   * Get actor
   * @return actor
  **/
  public AuditLogActor getActor() {
    return actor;
  }

  public void setActor(AuditLogActor actor) {
    this.actor = actor;
  }

  public AuditLog apiKeyCreated(AuditLogApiKeyCreated apiKeyCreated) {
    this.apiKeyCreated = apiKeyCreated;
    return this;
  }

   /**
   * Get apiKeyCreated
   * @return apiKeyCreated
  **/
  public AuditLogApiKeyCreated getApiKeyCreated() {
    return apiKeyCreated;
  }

  public void setApiKeyCreated(AuditLogApiKeyCreated apiKeyCreated) {
    this.apiKeyCreated = apiKeyCreated;
  }

  public AuditLog apiKeyUpdated(AuditLogApiKeyUpdated apiKeyUpdated) {
    this.apiKeyUpdated = apiKeyUpdated;
    return this;
  }

   /**
   * Get apiKeyUpdated
   * @return apiKeyUpdated
  **/
  public AuditLogApiKeyUpdated getApiKeyUpdated() {
    return apiKeyUpdated;
  }

  public void setApiKeyUpdated(AuditLogApiKeyUpdated apiKeyUpdated) {
    this.apiKeyUpdated = apiKeyUpdated;
  }

  public AuditLog apiKeyDeleted(AuditLogApiKeyDeleted apiKeyDeleted) {
    this.apiKeyDeleted = apiKeyDeleted;
    return this;
  }

   /**
   * Get apiKeyDeleted
   * @return apiKeyDeleted
  **/
  public AuditLogApiKeyDeleted getApiKeyDeleted() {
    return apiKeyDeleted;
  }

  public void setApiKeyDeleted(AuditLogApiKeyDeleted apiKeyDeleted) {
    this.apiKeyDeleted = apiKeyDeleted;
  }

  public AuditLog inviteSent(AuditLogInviteSent inviteSent) {
    this.inviteSent = inviteSent;
    return this;
  }

   /**
   * Get inviteSent
   * @return inviteSent
  **/
  public AuditLogInviteSent getInviteSent() {
    return inviteSent;
  }

  public void setInviteSent(AuditLogInviteSent inviteSent) {
    this.inviteSent = inviteSent;
  }

  public AuditLog inviteAccepted(AuditLogInviteAccepted inviteAccepted) {
    this.inviteAccepted = inviteAccepted;
    return this;
  }

   /**
   * Get inviteAccepted
   * @return inviteAccepted
  **/
  public AuditLogInviteAccepted getInviteAccepted() {
    return inviteAccepted;
  }

  public void setInviteAccepted(AuditLogInviteAccepted inviteAccepted) {
    this.inviteAccepted = inviteAccepted;
  }

  public AuditLog inviteDeleted(AuditLogInviteAccepted inviteDeleted) {
    this.inviteDeleted = inviteDeleted;
    return this;
  }

   /**
   * Get inviteDeleted
   * @return inviteDeleted
  **/
  public AuditLogInviteAccepted getInviteDeleted() {
    return inviteDeleted;
  }

  public void setInviteDeleted(AuditLogInviteAccepted inviteDeleted) {
    this.inviteDeleted = inviteDeleted;
  }

  public AuditLog loginFailed(AuditLogLoginFailed loginFailed) {
    this.loginFailed = loginFailed;
    return this;
  }

   /**
   * Get loginFailed
   * @return loginFailed
  **/
  public AuditLogLoginFailed getLoginFailed() {
    return loginFailed;
  }

  public void setLoginFailed(AuditLogLoginFailed loginFailed) {
    this.loginFailed = loginFailed;
  }

  public AuditLog logoutFailed(AuditLogLoginFailed logoutFailed) {
    this.logoutFailed = logoutFailed;
    return this;
  }

   /**
   * Get logoutFailed
   * @return logoutFailed
  **/
  public AuditLogLoginFailed getLogoutFailed() {
    return logoutFailed;
  }

  public void setLogoutFailed(AuditLogLoginFailed logoutFailed) {
    this.logoutFailed = logoutFailed;
  }

  public AuditLog organizationUpdated(AuditLogOrganizationUpdated organizationUpdated) {
    this.organizationUpdated = organizationUpdated;
    return this;
  }

   /**
   * Get organizationUpdated
   * @return organizationUpdated
  **/
  public AuditLogOrganizationUpdated getOrganizationUpdated() {
    return organizationUpdated;
  }

  public void setOrganizationUpdated(AuditLogOrganizationUpdated organizationUpdated) {
    this.organizationUpdated = organizationUpdated;
  }

  public AuditLog projectCreated(AuditLogProjectCreated projectCreated) {
    this.projectCreated = projectCreated;
    return this;
  }

   /**
   * Get projectCreated
   * @return projectCreated
  **/
  public AuditLogProjectCreated getProjectCreated() {
    return projectCreated;
  }

  public void setProjectCreated(AuditLogProjectCreated projectCreated) {
    this.projectCreated = projectCreated;
  }

  public AuditLog projectUpdated(AuditLogProjectUpdated projectUpdated) {
    this.projectUpdated = projectUpdated;
    return this;
  }

   /**
   * Get projectUpdated
   * @return projectUpdated
  **/
  public AuditLogProjectUpdated getProjectUpdated() {
    return projectUpdated;
  }

  public void setProjectUpdated(AuditLogProjectUpdated projectUpdated) {
    this.projectUpdated = projectUpdated;
  }

  public AuditLog projectArchived(AuditLogProjectArchived projectArchived) {
    this.projectArchived = projectArchived;
    return this;
  }

   /**
   * Get projectArchived
   * @return projectArchived
  **/
  public AuditLogProjectArchived getProjectArchived() {
    return projectArchived;
  }

  public void setProjectArchived(AuditLogProjectArchived projectArchived) {
    this.projectArchived = projectArchived;
  }

  public AuditLog rateLimitUpdated(AuditLogRateLimitUpdated rateLimitUpdated) {
    this.rateLimitUpdated = rateLimitUpdated;
    return this;
  }

   /**
   * Get rateLimitUpdated
   * @return rateLimitUpdated
  **/
  public AuditLogRateLimitUpdated getRateLimitUpdated() {
    return rateLimitUpdated;
  }

  public void setRateLimitUpdated(AuditLogRateLimitUpdated rateLimitUpdated) {
    this.rateLimitUpdated = rateLimitUpdated;
  }

  public AuditLog rateLimitDeleted(AuditLogRateLimitDeleted rateLimitDeleted) {
    this.rateLimitDeleted = rateLimitDeleted;
    return this;
  }

   /**
   * Get rateLimitDeleted
   * @return rateLimitDeleted
  **/
  public AuditLogRateLimitDeleted getRateLimitDeleted() {
    return rateLimitDeleted;
  }

  public void setRateLimitDeleted(AuditLogRateLimitDeleted rateLimitDeleted) {
    this.rateLimitDeleted = rateLimitDeleted;
  }

  public AuditLog serviceAccountCreated(AuditLogServiceAccountCreated serviceAccountCreated) {
    this.serviceAccountCreated = serviceAccountCreated;
    return this;
  }

   /**
   * Get serviceAccountCreated
   * @return serviceAccountCreated
  **/
  public AuditLogServiceAccountCreated getServiceAccountCreated() {
    return serviceAccountCreated;
  }

  public void setServiceAccountCreated(AuditLogServiceAccountCreated serviceAccountCreated) {
    this.serviceAccountCreated = serviceAccountCreated;
  }

  public AuditLog serviceAccountUpdated(AuditLogServiceAccountUpdated serviceAccountUpdated) {
    this.serviceAccountUpdated = serviceAccountUpdated;
    return this;
  }

   /**
   * Get serviceAccountUpdated
   * @return serviceAccountUpdated
  **/
  public AuditLogServiceAccountUpdated getServiceAccountUpdated() {
    return serviceAccountUpdated;
  }

  public void setServiceAccountUpdated(AuditLogServiceAccountUpdated serviceAccountUpdated) {
    this.serviceAccountUpdated = serviceAccountUpdated;
  }

  public AuditLog serviceAccountDeleted(AuditLogServiceAccountDeleted serviceAccountDeleted) {
    this.serviceAccountDeleted = serviceAccountDeleted;
    return this;
  }

   /**
   * Get serviceAccountDeleted
   * @return serviceAccountDeleted
  **/
  public AuditLogServiceAccountDeleted getServiceAccountDeleted() {
    return serviceAccountDeleted;
  }

  public void setServiceAccountDeleted(AuditLogServiceAccountDeleted serviceAccountDeleted) {
    this.serviceAccountDeleted = serviceAccountDeleted;
  }

  public AuditLog userAdded(AuditLogUserAdded userAdded) {
    this.userAdded = userAdded;
    return this;
  }

   /**
   * Get userAdded
   * @return userAdded
  **/
  public AuditLogUserAdded getUserAdded() {
    return userAdded;
  }

  public void setUserAdded(AuditLogUserAdded userAdded) {
    this.userAdded = userAdded;
  }

  public AuditLog userUpdated(AuditLogUserUpdated userUpdated) {
    this.userUpdated = userUpdated;
    return this;
  }

   /**
   * Get userUpdated
   * @return userUpdated
  **/
  public AuditLogUserUpdated getUserUpdated() {
    return userUpdated;
  }

  public void setUserUpdated(AuditLogUserUpdated userUpdated) {
    this.userUpdated = userUpdated;
  }

  public AuditLog userDeleted(AuditLogUserDeleted userDeleted) {
    this.userDeleted = userDeleted;
    return this;
  }

   /**
   * Get userDeleted
   * @return userDeleted
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

