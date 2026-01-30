package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AuditLogActor;
import org.openapitools.model.AuditLogApiKeyCreated;
import org.openapitools.model.AuditLogApiKeyDeleted;
import org.openapitools.model.AuditLogApiKeyUpdated;
import org.openapitools.model.AuditLogEventType;
import org.openapitools.model.AuditLogInviteAccepted;
import org.openapitools.model.AuditLogInviteSent;
import org.openapitools.model.AuditLogLoginFailed;
import org.openapitools.model.AuditLogOrganizationUpdated;
import org.openapitools.model.AuditLogProject;
import org.openapitools.model.AuditLogProjectArchived;
import org.openapitools.model.AuditLogProjectCreated;
import org.openapitools.model.AuditLogProjectUpdated;
import org.openapitools.model.AuditLogRateLimitDeleted;
import org.openapitools.model.AuditLogRateLimitUpdated;
import org.openapitools.model.AuditLogServiceAccountCreated;
import org.openapitools.model.AuditLogServiceAccountDeleted;
import org.openapitools.model.AuditLogServiceAccountUpdated;
import org.openapitools.model.AuditLogUserAdded;
import org.openapitools.model.AuditLogUserDeleted;
import org.openapitools.model.AuditLogUserUpdated;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A log of a user action or configuration change within this organization.
 */

@Schema(name = "AuditLog", description = "A log of a user action or configuration change within this organization.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLog {

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

  public AuditLog() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AuditLog(String id, AuditLogEventType type, Integer effectiveAt, AuditLogActor actor) {
    this.id = id;
    this.type = type;
    this.effectiveAt = effectiveAt;
    this.actor = actor;
  }

  public AuditLog id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of this log.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "The ID of this log.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
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
   */
  @NotNull 
  @Schema(name = "effective_at", description = "The Unix timestamp (in seconds) of the event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effective_at")
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
   */
  @Valid 
  @Schema(name = "project", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project")
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
   */
  @NotNull @Valid 
  @Schema(name = "actor", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("actor")
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
   */
  @Valid 
  @Schema(name = "api_key.created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("api_key.created")
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
   */
  @Valid 
  @Schema(name = "api_key.updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("api_key.updated")
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
   */
  @Valid 
  @Schema(name = "api_key.deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("api_key.deleted")
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
   */
  @Valid 
  @Schema(name = "invite.sent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite.sent")
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
   */
  @Valid 
  @Schema(name = "invite.accepted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite.accepted")
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
   */
  @Valid 
  @Schema(name = "invite.deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invite.deleted")
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
   */
  @Valid 
  @Schema(name = "login.failed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("login.failed")
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
   */
  @Valid 
  @Schema(name = "logout.failed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logout.failed")
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
   */
  @Valid 
  @Schema(name = "organization.updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organization.updated")
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
   */
  @Valid 
  @Schema(name = "project.created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project.created")
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
   */
  @Valid 
  @Schema(name = "project.updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project.updated")
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
   */
  @Valid 
  @Schema(name = "project.archived", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project.archived")
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
   */
  @Valid 
  @Schema(name = "rate_limit.updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rate_limit.updated")
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
   */
  @Valid 
  @Schema(name = "rate_limit.deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rate_limit.deleted")
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
   */
  @Valid 
  @Schema(name = "service_account.created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_account.created")
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
   */
  @Valid 
  @Schema(name = "service_account.updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_account.updated")
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
   */
  @Valid 
  @Schema(name = "service_account.deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_account.deleted")
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
   */
  @Valid 
  @Schema(name = "user.added", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.added")
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
   */
  @Valid 
  @Schema(name = "user.updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.updated")
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
   */
  @Valid 
  @Schema(name = "user.deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.id, auditLog.id) &&
        Objects.equals(this.type, auditLog.type) &&
        Objects.equals(this.effectiveAt, auditLog.effectiveAt) &&
        Objects.equals(this.project, auditLog.project) &&
        Objects.equals(this.actor, auditLog.actor) &&
        Objects.equals(this.apiKeyCreated, auditLog.apiKeyCreated) &&
        Objects.equals(this.apiKeyUpdated, auditLog.apiKeyUpdated) &&
        Objects.equals(this.apiKeyDeleted, auditLog.apiKeyDeleted) &&
        Objects.equals(this.inviteSent, auditLog.inviteSent) &&
        Objects.equals(this.inviteAccepted, auditLog.inviteAccepted) &&
        Objects.equals(this.inviteDeleted, auditLog.inviteDeleted) &&
        Objects.equals(this.loginFailed, auditLog.loginFailed) &&
        Objects.equals(this.logoutFailed, auditLog.logoutFailed) &&
        Objects.equals(this.organizationUpdated, auditLog.organizationUpdated) &&
        Objects.equals(this.projectCreated, auditLog.projectCreated) &&
        Objects.equals(this.projectUpdated, auditLog.projectUpdated) &&
        Objects.equals(this.projectArchived, auditLog.projectArchived) &&
        Objects.equals(this.rateLimitUpdated, auditLog.rateLimitUpdated) &&
        Objects.equals(this.rateLimitDeleted, auditLog.rateLimitDeleted) &&
        Objects.equals(this.serviceAccountCreated, auditLog.serviceAccountCreated) &&
        Objects.equals(this.serviceAccountUpdated, auditLog.serviceAccountUpdated) &&
        Objects.equals(this.serviceAccountDeleted, auditLog.serviceAccountDeleted) &&
        Objects.equals(this.userAdded, auditLog.userAdded) &&
        Objects.equals(this.userUpdated, auditLog.userUpdated) &&
        Objects.equals(this.userDeleted, auditLog.userDeleted);
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

