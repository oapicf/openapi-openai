package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A log of a user action or configuration change within this organization.
 */
@ApiModel(description="A log of a user action or configuration change within this organization.")

public class AuditLog  {
  
 /**
  * The ID of this log.
  */
  @ApiModelProperty(required = true, value = "The ID of this log.")
  private String id;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AuditLogEventType type;

 /**
  * The Unix timestamp (in seconds) of the event.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of the event.")
  private Integer effectiveAt;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogProject project;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AuditLogActor actor;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogApiKeyCreated apiKeyCreated;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogApiKeyUpdated apiKeyUpdated;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogApiKeyDeleted apiKeyDeleted;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogInviteSent inviteSent;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogInviteAccepted inviteAccepted;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogInviteAccepted inviteDeleted;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogLoginFailed loginFailed;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogLoginFailed logoutFailed;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogOrganizationUpdated organizationUpdated;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogProjectCreated projectCreated;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogProjectUpdated projectUpdated;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogProjectArchived projectArchived;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogRateLimitUpdated rateLimitUpdated;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogRateLimitDeleted rateLimitDeleted;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogServiceAccountCreated serviceAccountCreated;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogServiceAccountUpdated serviceAccountUpdated;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogServiceAccountDeleted serviceAccountDeleted;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogUserAdded userAdded;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogUserUpdated userUpdated;

  @ApiModelProperty(value = "")
  @Valid
  private AuditLogUserDeleted userDeleted;
 /**
  * The ID of this log.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public AuditLog id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public AuditLogEventType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(AuditLogEventType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public AuditLog type(AuditLogEventType type) {
    this.type = type;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) of the event.
  * @return effectiveAt
  */
  @JsonProperty("effective_at")
  @NotNull
  public Integer getEffectiveAt() {
    return effectiveAt;
  }

  /**
   * Sets the <code>effectiveAt</code> property.
   */
 public void setEffectiveAt(Integer effectiveAt) {
    this.effectiveAt = effectiveAt;
  }

  /**
   * Sets the <code>effectiveAt</code> property.
   */
  public AuditLog effectiveAt(Integer effectiveAt) {
    this.effectiveAt = effectiveAt;
    return this;
  }

 /**
  * Get project
  * @return project
  */
  @JsonProperty("project")
  public AuditLogProject getProject() {
    return project;
  }

  /**
   * Sets the <code>project</code> property.
   */
 public void setProject(AuditLogProject project) {
    this.project = project;
  }

  /**
   * Sets the <code>project</code> property.
   */
  public AuditLog project(AuditLogProject project) {
    this.project = project;
    return this;
  }

 /**
  * Get actor
  * @return actor
  */
  @JsonProperty("actor")
  @NotNull
  public AuditLogActor getActor() {
    return actor;
  }

  /**
   * Sets the <code>actor</code> property.
   */
 public void setActor(AuditLogActor actor) {
    this.actor = actor;
  }

  /**
   * Sets the <code>actor</code> property.
   */
  public AuditLog actor(AuditLogActor actor) {
    this.actor = actor;
    return this;
  }

 /**
  * Get apiKeyCreated
  * @return apiKeyCreated
  */
  @JsonProperty("api_key.created")
  public AuditLogApiKeyCreated getApiKeyCreated() {
    return apiKeyCreated;
  }

  /**
   * Sets the <code>apiKeyCreated</code> property.
   */
 public void setApiKeyCreated(AuditLogApiKeyCreated apiKeyCreated) {
    this.apiKeyCreated = apiKeyCreated;
  }

  /**
   * Sets the <code>apiKeyCreated</code> property.
   */
  public AuditLog apiKeyCreated(AuditLogApiKeyCreated apiKeyCreated) {
    this.apiKeyCreated = apiKeyCreated;
    return this;
  }

 /**
  * Get apiKeyUpdated
  * @return apiKeyUpdated
  */
  @JsonProperty("api_key.updated")
  public AuditLogApiKeyUpdated getApiKeyUpdated() {
    return apiKeyUpdated;
  }

  /**
   * Sets the <code>apiKeyUpdated</code> property.
   */
 public void setApiKeyUpdated(AuditLogApiKeyUpdated apiKeyUpdated) {
    this.apiKeyUpdated = apiKeyUpdated;
  }

  /**
   * Sets the <code>apiKeyUpdated</code> property.
   */
  public AuditLog apiKeyUpdated(AuditLogApiKeyUpdated apiKeyUpdated) {
    this.apiKeyUpdated = apiKeyUpdated;
    return this;
  }

 /**
  * Get apiKeyDeleted
  * @return apiKeyDeleted
  */
  @JsonProperty("api_key.deleted")
  public AuditLogApiKeyDeleted getApiKeyDeleted() {
    return apiKeyDeleted;
  }

  /**
   * Sets the <code>apiKeyDeleted</code> property.
   */
 public void setApiKeyDeleted(AuditLogApiKeyDeleted apiKeyDeleted) {
    this.apiKeyDeleted = apiKeyDeleted;
  }

  /**
   * Sets the <code>apiKeyDeleted</code> property.
   */
  public AuditLog apiKeyDeleted(AuditLogApiKeyDeleted apiKeyDeleted) {
    this.apiKeyDeleted = apiKeyDeleted;
    return this;
  }

 /**
  * Get inviteSent
  * @return inviteSent
  */
  @JsonProperty("invite.sent")
  public AuditLogInviteSent getInviteSent() {
    return inviteSent;
  }

  /**
   * Sets the <code>inviteSent</code> property.
   */
 public void setInviteSent(AuditLogInviteSent inviteSent) {
    this.inviteSent = inviteSent;
  }

  /**
   * Sets the <code>inviteSent</code> property.
   */
  public AuditLog inviteSent(AuditLogInviteSent inviteSent) {
    this.inviteSent = inviteSent;
    return this;
  }

 /**
  * Get inviteAccepted
  * @return inviteAccepted
  */
  @JsonProperty("invite.accepted")
  public AuditLogInviteAccepted getInviteAccepted() {
    return inviteAccepted;
  }

  /**
   * Sets the <code>inviteAccepted</code> property.
   */
 public void setInviteAccepted(AuditLogInviteAccepted inviteAccepted) {
    this.inviteAccepted = inviteAccepted;
  }

  /**
   * Sets the <code>inviteAccepted</code> property.
   */
  public AuditLog inviteAccepted(AuditLogInviteAccepted inviteAccepted) {
    this.inviteAccepted = inviteAccepted;
    return this;
  }

 /**
  * Get inviteDeleted
  * @return inviteDeleted
  */
  @JsonProperty("invite.deleted")
  public AuditLogInviteAccepted getInviteDeleted() {
    return inviteDeleted;
  }

  /**
   * Sets the <code>inviteDeleted</code> property.
   */
 public void setInviteDeleted(AuditLogInviteAccepted inviteDeleted) {
    this.inviteDeleted = inviteDeleted;
  }

  /**
   * Sets the <code>inviteDeleted</code> property.
   */
  public AuditLog inviteDeleted(AuditLogInviteAccepted inviteDeleted) {
    this.inviteDeleted = inviteDeleted;
    return this;
  }

 /**
  * Get loginFailed
  * @return loginFailed
  */
  @JsonProperty("login.failed")
  public AuditLogLoginFailed getLoginFailed() {
    return loginFailed;
  }

  /**
   * Sets the <code>loginFailed</code> property.
   */
 public void setLoginFailed(AuditLogLoginFailed loginFailed) {
    this.loginFailed = loginFailed;
  }

  /**
   * Sets the <code>loginFailed</code> property.
   */
  public AuditLog loginFailed(AuditLogLoginFailed loginFailed) {
    this.loginFailed = loginFailed;
    return this;
  }

 /**
  * Get logoutFailed
  * @return logoutFailed
  */
  @JsonProperty("logout.failed")
  public AuditLogLoginFailed getLogoutFailed() {
    return logoutFailed;
  }

  /**
   * Sets the <code>logoutFailed</code> property.
   */
 public void setLogoutFailed(AuditLogLoginFailed logoutFailed) {
    this.logoutFailed = logoutFailed;
  }

  /**
   * Sets the <code>logoutFailed</code> property.
   */
  public AuditLog logoutFailed(AuditLogLoginFailed logoutFailed) {
    this.logoutFailed = logoutFailed;
    return this;
  }

 /**
  * Get organizationUpdated
  * @return organizationUpdated
  */
  @JsonProperty("organization.updated")
  public AuditLogOrganizationUpdated getOrganizationUpdated() {
    return organizationUpdated;
  }

  /**
   * Sets the <code>organizationUpdated</code> property.
   */
 public void setOrganizationUpdated(AuditLogOrganizationUpdated organizationUpdated) {
    this.organizationUpdated = organizationUpdated;
  }

  /**
   * Sets the <code>organizationUpdated</code> property.
   */
  public AuditLog organizationUpdated(AuditLogOrganizationUpdated organizationUpdated) {
    this.organizationUpdated = organizationUpdated;
    return this;
  }

 /**
  * Get projectCreated
  * @return projectCreated
  */
  @JsonProperty("project.created")
  public AuditLogProjectCreated getProjectCreated() {
    return projectCreated;
  }

  /**
   * Sets the <code>projectCreated</code> property.
   */
 public void setProjectCreated(AuditLogProjectCreated projectCreated) {
    this.projectCreated = projectCreated;
  }

  /**
   * Sets the <code>projectCreated</code> property.
   */
  public AuditLog projectCreated(AuditLogProjectCreated projectCreated) {
    this.projectCreated = projectCreated;
    return this;
  }

 /**
  * Get projectUpdated
  * @return projectUpdated
  */
  @JsonProperty("project.updated")
  public AuditLogProjectUpdated getProjectUpdated() {
    return projectUpdated;
  }

  /**
   * Sets the <code>projectUpdated</code> property.
   */
 public void setProjectUpdated(AuditLogProjectUpdated projectUpdated) {
    this.projectUpdated = projectUpdated;
  }

  /**
   * Sets the <code>projectUpdated</code> property.
   */
  public AuditLog projectUpdated(AuditLogProjectUpdated projectUpdated) {
    this.projectUpdated = projectUpdated;
    return this;
  }

 /**
  * Get projectArchived
  * @return projectArchived
  */
  @JsonProperty("project.archived")
  public AuditLogProjectArchived getProjectArchived() {
    return projectArchived;
  }

  /**
   * Sets the <code>projectArchived</code> property.
   */
 public void setProjectArchived(AuditLogProjectArchived projectArchived) {
    this.projectArchived = projectArchived;
  }

  /**
   * Sets the <code>projectArchived</code> property.
   */
  public AuditLog projectArchived(AuditLogProjectArchived projectArchived) {
    this.projectArchived = projectArchived;
    return this;
  }

 /**
  * Get rateLimitUpdated
  * @return rateLimitUpdated
  */
  @JsonProperty("rate_limit.updated")
  public AuditLogRateLimitUpdated getRateLimitUpdated() {
    return rateLimitUpdated;
  }

  /**
   * Sets the <code>rateLimitUpdated</code> property.
   */
 public void setRateLimitUpdated(AuditLogRateLimitUpdated rateLimitUpdated) {
    this.rateLimitUpdated = rateLimitUpdated;
  }

  /**
   * Sets the <code>rateLimitUpdated</code> property.
   */
  public AuditLog rateLimitUpdated(AuditLogRateLimitUpdated rateLimitUpdated) {
    this.rateLimitUpdated = rateLimitUpdated;
    return this;
  }

 /**
  * Get rateLimitDeleted
  * @return rateLimitDeleted
  */
  @JsonProperty("rate_limit.deleted")
  public AuditLogRateLimitDeleted getRateLimitDeleted() {
    return rateLimitDeleted;
  }

  /**
   * Sets the <code>rateLimitDeleted</code> property.
   */
 public void setRateLimitDeleted(AuditLogRateLimitDeleted rateLimitDeleted) {
    this.rateLimitDeleted = rateLimitDeleted;
  }

  /**
   * Sets the <code>rateLimitDeleted</code> property.
   */
  public AuditLog rateLimitDeleted(AuditLogRateLimitDeleted rateLimitDeleted) {
    this.rateLimitDeleted = rateLimitDeleted;
    return this;
  }

 /**
  * Get serviceAccountCreated
  * @return serviceAccountCreated
  */
  @JsonProperty("service_account.created")
  public AuditLogServiceAccountCreated getServiceAccountCreated() {
    return serviceAccountCreated;
  }

  /**
   * Sets the <code>serviceAccountCreated</code> property.
   */
 public void setServiceAccountCreated(AuditLogServiceAccountCreated serviceAccountCreated) {
    this.serviceAccountCreated = serviceAccountCreated;
  }

  /**
   * Sets the <code>serviceAccountCreated</code> property.
   */
  public AuditLog serviceAccountCreated(AuditLogServiceAccountCreated serviceAccountCreated) {
    this.serviceAccountCreated = serviceAccountCreated;
    return this;
  }

 /**
  * Get serviceAccountUpdated
  * @return serviceAccountUpdated
  */
  @JsonProperty("service_account.updated")
  public AuditLogServiceAccountUpdated getServiceAccountUpdated() {
    return serviceAccountUpdated;
  }

  /**
   * Sets the <code>serviceAccountUpdated</code> property.
   */
 public void setServiceAccountUpdated(AuditLogServiceAccountUpdated serviceAccountUpdated) {
    this.serviceAccountUpdated = serviceAccountUpdated;
  }

  /**
   * Sets the <code>serviceAccountUpdated</code> property.
   */
  public AuditLog serviceAccountUpdated(AuditLogServiceAccountUpdated serviceAccountUpdated) {
    this.serviceAccountUpdated = serviceAccountUpdated;
    return this;
  }

 /**
  * Get serviceAccountDeleted
  * @return serviceAccountDeleted
  */
  @JsonProperty("service_account.deleted")
  public AuditLogServiceAccountDeleted getServiceAccountDeleted() {
    return serviceAccountDeleted;
  }

  /**
   * Sets the <code>serviceAccountDeleted</code> property.
   */
 public void setServiceAccountDeleted(AuditLogServiceAccountDeleted serviceAccountDeleted) {
    this.serviceAccountDeleted = serviceAccountDeleted;
  }

  /**
   * Sets the <code>serviceAccountDeleted</code> property.
   */
  public AuditLog serviceAccountDeleted(AuditLogServiceAccountDeleted serviceAccountDeleted) {
    this.serviceAccountDeleted = serviceAccountDeleted;
    return this;
  }

 /**
  * Get userAdded
  * @return userAdded
  */
  @JsonProperty("user.added")
  public AuditLogUserAdded getUserAdded() {
    return userAdded;
  }

  /**
   * Sets the <code>userAdded</code> property.
   */
 public void setUserAdded(AuditLogUserAdded userAdded) {
    this.userAdded = userAdded;
  }

  /**
   * Sets the <code>userAdded</code> property.
   */
  public AuditLog userAdded(AuditLogUserAdded userAdded) {
    this.userAdded = userAdded;
    return this;
  }

 /**
  * Get userUpdated
  * @return userUpdated
  */
  @JsonProperty("user.updated")
  public AuditLogUserUpdated getUserUpdated() {
    return userUpdated;
  }

  /**
   * Sets the <code>userUpdated</code> property.
   */
 public void setUserUpdated(AuditLogUserUpdated userUpdated) {
    this.userUpdated = userUpdated;
  }

  /**
   * Sets the <code>userUpdated</code> property.
   */
  public AuditLog userUpdated(AuditLogUserUpdated userUpdated) {
    this.userUpdated = userUpdated;
    return this;
  }

 /**
  * Get userDeleted
  * @return userDeleted
  */
  @JsonProperty("user.deleted")
  public AuditLogUserDeleted getUserDeleted() {
    return userDeleted;
  }

  /**
   * Sets the <code>userDeleted</code> property.
   */
 public void setUserDeleted(AuditLogUserDeleted userDeleted) {
    this.userDeleted = userDeleted;
  }

  /**
   * Sets the <code>userDeleted</code> property.
   */
  public AuditLog userDeleted(AuditLogUserDeleted userDeleted) {
    this.userDeleted = userDeleted;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

