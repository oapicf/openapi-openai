package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

/**
 * A log of a user action or configuration change within this organization.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "A log of a user action or configuration change within this organization.")
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
   * The ID of this log.
   **/
  public AuditLog id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of this log.")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public AuditLog type(AuditLogEventType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull
  public AuditLogEventType getType() {
    return type;
  }
  public void setType(AuditLogEventType type) {
    this.type = type;
  }


  /**
   * The Unix timestamp (in seconds) of the event.
   **/
  public AuditLog effectiveAt(Integer effectiveAt) {
    this.effectiveAt = effectiveAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of the event.")
  @JsonProperty("effective_at")
  @NotNull
  public Integer getEffectiveAt() {
    return effectiveAt;
  }
  public void setEffectiveAt(Integer effectiveAt) {
    this.effectiveAt = effectiveAt;
  }


  /**
   **/
  public AuditLog project(AuditLogProject project) {
    this.project = project;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("project")
  public AuditLogProject getProject() {
    return project;
  }
  public void setProject(AuditLogProject project) {
    this.project = project;
  }


  /**
   **/
  public AuditLog actor(AuditLogActor actor) {
    this.actor = actor;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("actor")
  @NotNull
  public AuditLogActor getActor() {
    return actor;
  }
  public void setActor(AuditLogActor actor) {
    this.actor = actor;
  }


  /**
   **/
  public AuditLog apiKeyCreated(AuditLogApiKeyCreated apiKeyCreated) {
    this.apiKeyCreated = apiKeyCreated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("api_key.created")
  public AuditLogApiKeyCreated getApiKeyCreated() {
    return apiKeyCreated;
  }
  public void setApiKeyCreated(AuditLogApiKeyCreated apiKeyCreated) {
    this.apiKeyCreated = apiKeyCreated;
  }


  /**
   **/
  public AuditLog apiKeyUpdated(AuditLogApiKeyUpdated apiKeyUpdated) {
    this.apiKeyUpdated = apiKeyUpdated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("api_key.updated")
  public AuditLogApiKeyUpdated getApiKeyUpdated() {
    return apiKeyUpdated;
  }
  public void setApiKeyUpdated(AuditLogApiKeyUpdated apiKeyUpdated) {
    this.apiKeyUpdated = apiKeyUpdated;
  }


  /**
   **/
  public AuditLog apiKeyDeleted(AuditLogApiKeyDeleted apiKeyDeleted) {
    this.apiKeyDeleted = apiKeyDeleted;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("api_key.deleted")
  public AuditLogApiKeyDeleted getApiKeyDeleted() {
    return apiKeyDeleted;
  }
  public void setApiKeyDeleted(AuditLogApiKeyDeleted apiKeyDeleted) {
    this.apiKeyDeleted = apiKeyDeleted;
  }


  /**
   **/
  public AuditLog inviteSent(AuditLogInviteSent inviteSent) {
    this.inviteSent = inviteSent;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("invite.sent")
  public AuditLogInviteSent getInviteSent() {
    return inviteSent;
  }
  public void setInviteSent(AuditLogInviteSent inviteSent) {
    this.inviteSent = inviteSent;
  }


  /**
   **/
  public AuditLog inviteAccepted(AuditLogInviteAccepted inviteAccepted) {
    this.inviteAccepted = inviteAccepted;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("invite.accepted")
  public AuditLogInviteAccepted getInviteAccepted() {
    return inviteAccepted;
  }
  public void setInviteAccepted(AuditLogInviteAccepted inviteAccepted) {
    this.inviteAccepted = inviteAccepted;
  }


  /**
   **/
  public AuditLog inviteDeleted(AuditLogInviteAccepted inviteDeleted) {
    this.inviteDeleted = inviteDeleted;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("invite.deleted")
  public AuditLogInviteAccepted getInviteDeleted() {
    return inviteDeleted;
  }
  public void setInviteDeleted(AuditLogInviteAccepted inviteDeleted) {
    this.inviteDeleted = inviteDeleted;
  }


  /**
   **/
  public AuditLog loginFailed(AuditLogLoginFailed loginFailed) {
    this.loginFailed = loginFailed;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("login.failed")
  public AuditLogLoginFailed getLoginFailed() {
    return loginFailed;
  }
  public void setLoginFailed(AuditLogLoginFailed loginFailed) {
    this.loginFailed = loginFailed;
  }


  /**
   **/
  public AuditLog logoutFailed(AuditLogLoginFailed logoutFailed) {
    this.logoutFailed = logoutFailed;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("logout.failed")
  public AuditLogLoginFailed getLogoutFailed() {
    return logoutFailed;
  }
  public void setLogoutFailed(AuditLogLoginFailed logoutFailed) {
    this.logoutFailed = logoutFailed;
  }


  /**
   **/
  public AuditLog organizationUpdated(AuditLogOrganizationUpdated organizationUpdated) {
    this.organizationUpdated = organizationUpdated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("organization.updated")
  public AuditLogOrganizationUpdated getOrganizationUpdated() {
    return organizationUpdated;
  }
  public void setOrganizationUpdated(AuditLogOrganizationUpdated organizationUpdated) {
    this.organizationUpdated = organizationUpdated;
  }


  /**
   **/
  public AuditLog projectCreated(AuditLogProjectCreated projectCreated) {
    this.projectCreated = projectCreated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("project.created")
  public AuditLogProjectCreated getProjectCreated() {
    return projectCreated;
  }
  public void setProjectCreated(AuditLogProjectCreated projectCreated) {
    this.projectCreated = projectCreated;
  }


  /**
   **/
  public AuditLog projectUpdated(AuditLogProjectUpdated projectUpdated) {
    this.projectUpdated = projectUpdated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("project.updated")
  public AuditLogProjectUpdated getProjectUpdated() {
    return projectUpdated;
  }
  public void setProjectUpdated(AuditLogProjectUpdated projectUpdated) {
    this.projectUpdated = projectUpdated;
  }


  /**
   **/
  public AuditLog projectArchived(AuditLogProjectArchived projectArchived) {
    this.projectArchived = projectArchived;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("project.archived")
  public AuditLogProjectArchived getProjectArchived() {
    return projectArchived;
  }
  public void setProjectArchived(AuditLogProjectArchived projectArchived) {
    this.projectArchived = projectArchived;
  }


  /**
   **/
  public AuditLog rateLimitUpdated(AuditLogRateLimitUpdated rateLimitUpdated) {
    this.rateLimitUpdated = rateLimitUpdated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rate_limit.updated")
  public AuditLogRateLimitUpdated getRateLimitUpdated() {
    return rateLimitUpdated;
  }
  public void setRateLimitUpdated(AuditLogRateLimitUpdated rateLimitUpdated) {
    this.rateLimitUpdated = rateLimitUpdated;
  }


  /**
   **/
  public AuditLog rateLimitDeleted(AuditLogRateLimitDeleted rateLimitDeleted) {
    this.rateLimitDeleted = rateLimitDeleted;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("rate_limit.deleted")
  public AuditLogRateLimitDeleted getRateLimitDeleted() {
    return rateLimitDeleted;
  }
  public void setRateLimitDeleted(AuditLogRateLimitDeleted rateLimitDeleted) {
    this.rateLimitDeleted = rateLimitDeleted;
  }


  /**
   **/
  public AuditLog serviceAccountCreated(AuditLogServiceAccountCreated serviceAccountCreated) {
    this.serviceAccountCreated = serviceAccountCreated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service_account.created")
  public AuditLogServiceAccountCreated getServiceAccountCreated() {
    return serviceAccountCreated;
  }
  public void setServiceAccountCreated(AuditLogServiceAccountCreated serviceAccountCreated) {
    this.serviceAccountCreated = serviceAccountCreated;
  }


  /**
   **/
  public AuditLog serviceAccountUpdated(AuditLogServiceAccountUpdated serviceAccountUpdated) {
    this.serviceAccountUpdated = serviceAccountUpdated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service_account.updated")
  public AuditLogServiceAccountUpdated getServiceAccountUpdated() {
    return serviceAccountUpdated;
  }
  public void setServiceAccountUpdated(AuditLogServiceAccountUpdated serviceAccountUpdated) {
    this.serviceAccountUpdated = serviceAccountUpdated;
  }


  /**
   **/
  public AuditLog serviceAccountDeleted(AuditLogServiceAccountDeleted serviceAccountDeleted) {
    this.serviceAccountDeleted = serviceAccountDeleted;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service_account.deleted")
  public AuditLogServiceAccountDeleted getServiceAccountDeleted() {
    return serviceAccountDeleted;
  }
  public void setServiceAccountDeleted(AuditLogServiceAccountDeleted serviceAccountDeleted) {
    this.serviceAccountDeleted = serviceAccountDeleted;
  }


  /**
   **/
  public AuditLog userAdded(AuditLogUserAdded userAdded) {
    this.userAdded = userAdded;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.added")
  public AuditLogUserAdded getUserAdded() {
    return userAdded;
  }
  public void setUserAdded(AuditLogUserAdded userAdded) {
    this.userAdded = userAdded;
  }


  /**
   **/
  public AuditLog userUpdated(AuditLogUserUpdated userUpdated) {
    this.userUpdated = userUpdated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.updated")
  public AuditLogUserUpdated getUserUpdated() {
    return userUpdated;
  }
  public void setUserUpdated(AuditLogUserUpdated userUpdated) {
    this.userUpdated = userUpdated;
  }


  /**
   **/
  public AuditLog userDeleted(AuditLogUserDeleted userDeleted) {
    this.userDeleted = userDeleted;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

