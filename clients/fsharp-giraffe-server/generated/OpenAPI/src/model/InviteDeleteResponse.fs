namespace OpenAPI.Model

open System
open System.Collections.Generic

module InviteDeleteResponse =

  //#region InviteDeleteResponse

  //#region enums
  type ObjectEnum = OrganizationInviteDeletedEnum of string  
  //#endregion

  type InviteDeleteResponse = {
    Object : ObjectEnum;
    Id : string;
    Deleted : bool;
  }
  //#endregion
