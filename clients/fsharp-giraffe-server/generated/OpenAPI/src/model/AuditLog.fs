namespace OpenAPI.Model

open System
open System.Collections.Generic
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


  type AuditLog = {
    Id : string;
    Type : AuditLogEventType;
    EffectiveAt : int;
    Project : AuditLogProject;
    Actor : AuditLogActor;
    ApiKeyCreated : AuditLogApiKeyCreated;
    ApiKeyUpdated : AuditLogApiKeyUpdated;
    ApiKeyDeleted : AuditLogApiKeyDeleted;
    InviteSent : AuditLogInviteSent;
    InviteAccepted : AuditLogInviteAccepted;
    InviteDeleted : AuditLogInviteAccepted;
    LoginFailed : AuditLogLoginFailed;
    LogoutFailed : AuditLogLoginFailed;
    OrganizationUpdated : AuditLogOrganizationUpdated;
    ProjectCreated : AuditLogProjectCreated;
    ProjectUpdated : AuditLogProjectUpdated;
    ProjectArchived : AuditLogProjectArchived;
    RateLimitUpdated : AuditLogRateLimitUpdated;
    RateLimitDeleted : AuditLogRateLimitDeleted;
    ServiceAccountCreated : AuditLogServiceAccountCreated;
    ServiceAccountUpdated : AuditLogServiceAccountUpdated;
    ServiceAccountDeleted : AuditLogServiceAccountDeleted;
    UserAdded : AuditLogUserAdded;
    UserUpdated : AuditLogUserUpdated;
    UserDeleted : AuditLogUserDeleted;
  }
  //#endregion
