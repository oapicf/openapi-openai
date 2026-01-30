namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AuditLogEventType =

  //#region AuditLogEventType

  let ApiKeyCreatedEnum = "api_key.created"
  let ApiKeyUpdatedEnum = "api_key.updated"
  let ApiKeyDeletedEnum = "api_key.deleted"
  let InviteSentEnum = "invite.sent"
  let InviteAcceptedEnum = "invite.accepted"
  let InviteDeletedEnum = "invite.deleted"
  let LoginSucceededEnum = "login.succeeded"
  let LoginFailedEnum = "login.failed"
  let LogoutSucceededEnum = "logout.succeeded"
  let LogoutFailedEnum = "logout.failed"
  let OrganizationUpdatedEnum = "organization.updated"
  let ProjectCreatedEnum = "project.created"
  let ProjectUpdatedEnum = "project.updated"
  let ProjectArchivedEnum = "project.archived"
  let ServiceAccountCreatedEnum = "service_account.created"
  let ServiceAccountUpdatedEnum = "service_account.updated"
  let ServiceAccountDeletedEnum = "service_account.deleted"
  let RateLimitUpdatedEnum = "rate_limit.updated"
  let RateLimitDeletedEnum = "rate_limit.deleted"
  let UserAddedEnum = "user.added"
  let UserUpdatedEnum = "user.updated"
  let UserDeletedEnum = "user.deleted"
  type AuditLogEventType = string

  //#endregion
