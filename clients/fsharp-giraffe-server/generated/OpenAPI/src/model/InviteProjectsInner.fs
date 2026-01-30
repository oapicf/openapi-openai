namespace OpenAPI.Model

open System
open System.Collections.Generic

module InviteProjectsInner =

  //#region InviteProjectsInner

  //#region enums
  type RoleEnum = MemberEnum of string  |  OwnerEnum of string  
  //#endregion

  type Invite_projects_inner = {
    Id : string;
    Role : RoleEnum;
  }
  //#endregion
