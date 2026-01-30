namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.InviteProjectsInner

module Invite =

  //#region Invite

  //#region enums
  type ObjectEnum = OrganizationInviteEnum of string  
  //#endregion
  //#region enums
  type RoleEnum = OwnerEnum of string  |  ReaderEnum of string  
  //#endregion
  //#region enums
  type StatusEnum = AcceptedEnum of string  |  ExpiredEnum of string  |  PendingEnum of string  
  //#endregion

  type Invite = {
    Object : ObjectEnum;
    Id : string;
    Email : string;
    Role : RoleEnum;
    Status : StatusEnum;
    InvitedAt : int;
    ExpiresAt : int;
    AcceptedAt : int;
    Projects : InviteProjectsInner[];
  }
  //#endregion
