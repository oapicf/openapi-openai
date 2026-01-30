namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuditLogActor
open OpenAPI.Model.AuditLogApiKeyCreated
open OpenAPI.Model.AuditLogApiKeyDeleted
open OpenAPI.Model.AuditLogApiKeyUpdated
open OpenAPI.Model.AuditLogEventType
open OpenAPI.Model.AuditLogInviteAccepted
open OpenAPI.Model.AuditLogInviteSent
open OpenAPI.Model.AuditLogLoginFailed
open OpenAPI.Model.AuditLogOrganizationUpdated
open OpenAPI.Model.AuditLogProject
open OpenAPI.Model.AuditLogProjectArchived
open OpenAPI.Model.AuditLogProjectCreated
open OpenAPI.Model.AuditLogProjectUpdated
open OpenAPI.Model.AuditLogRateLimitDeleted
open OpenAPI.Model.AuditLogRateLimitUpdated
open OpenAPI.Model.AuditLogServiceAccountCreated
open OpenAPI.Model.AuditLogServiceAccountDeleted
open OpenAPI.Model.AuditLogServiceAccountUpdated
open OpenAPI.Model.AuditLogUserAdded
open OpenAPI.Model.AuditLogUserDeleted
open OpenAPI.Model.AuditLogUserUpdated

module AuditLog =

  //#region AuditLog

  [<CLIMutable>]
  type AuditLog = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : AuditLogEventType;
    [<JsonProperty(PropertyName = "effective_at")>]
    EffectiveAt : int;
    [<JsonProperty(PropertyName = "project")>]
    Project : AuditLogProject;
    [<JsonProperty(PropertyName = "actor")>]
    Actor : AuditLogActor;
    [<JsonProperty(PropertyName = "api_key.created")>]
    ApiKeyCreated : AuditLogApiKeyCreated;
    [<JsonProperty(PropertyName = "api_key.updated")>]
    ApiKeyUpdated : AuditLogApiKeyUpdated;
    [<JsonProperty(PropertyName = "api_key.deleted")>]
    ApiKeyDeleted : AuditLogApiKeyDeleted;
    [<JsonProperty(PropertyName = "invite.sent")>]
    InviteSent : AuditLogInviteSent;
    [<JsonProperty(PropertyName = "invite.accepted")>]
    InviteAccepted : AuditLogInviteAccepted;
    [<JsonProperty(PropertyName = "invite.deleted")>]
    InviteDeleted : AuditLogInviteAccepted;
    [<JsonProperty(PropertyName = "login.failed")>]
    LoginFailed : AuditLogLoginFailed;
    [<JsonProperty(PropertyName = "logout.failed")>]
    LogoutFailed : AuditLogLoginFailed;
    [<JsonProperty(PropertyName = "organization.updated")>]
    OrganizationUpdated : AuditLogOrganizationUpdated;
    [<JsonProperty(PropertyName = "project.created")>]
    ProjectCreated : AuditLogProjectCreated;
    [<JsonProperty(PropertyName = "project.updated")>]
    ProjectUpdated : AuditLogProjectUpdated;
    [<JsonProperty(PropertyName = "project.archived")>]
    ProjectArchived : AuditLogProjectArchived;
    [<JsonProperty(PropertyName = "rate_limit.updated")>]
    RateLimitUpdated : AuditLogRateLimitUpdated;
    [<JsonProperty(PropertyName = "rate_limit.deleted")>]
    RateLimitDeleted : AuditLogRateLimitDeleted;
    [<JsonProperty(PropertyName = "service_account.created")>]
    ServiceAccountCreated : AuditLogServiceAccountCreated;
    [<JsonProperty(PropertyName = "service_account.updated")>]
    ServiceAccountUpdated : AuditLogServiceAccountUpdated;
    [<JsonProperty(PropertyName = "service_account.deleted")>]
    ServiceAccountDeleted : AuditLogServiceAccountDeleted;
    [<JsonProperty(PropertyName = "user.added")>]
    UserAdded : AuditLogUserAdded;
    [<JsonProperty(PropertyName = "user.updated")>]
    UserUpdated : AuditLogUserUpdated;
    [<JsonProperty(PropertyName = "user.deleted")>]
    UserDeleted : AuditLogUserDeleted;
  }

  //#endregion
