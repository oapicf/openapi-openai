namespace OpenAPI.Model

open System
open System.Collections.Generic

module InviteRequestProjectsInner =

  //#region InviteRequestProjectsInner

  //#region enums
  type RoleEnum = MemberEnum of string  |  OwnerEnum of string  
  //#endregion

  type InviteRequest_projects_inner = {
    Id : string;
    Role : RoleEnum;
  }
  //#endregion
