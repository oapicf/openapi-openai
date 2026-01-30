namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.InviteRequestProjectsInner

module InviteRequest =

  //#region InviteRequest

  //#region enums
  type RoleEnum = ReaderEnum of string  |  OwnerEnum of string  
  //#endregion

  type InviteRequest = {
    Email : string;
    Role : RoleEnum;
    Projects : InviteRequestProjectsInner[];
  }
  //#endregion
