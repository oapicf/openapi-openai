namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Invite

module InviteListResponse =

  //#region InviteListResponse

  //#region enums
  type ObjectEnum = ListEnum of string  
  //#endregion

  type InviteListResponse = {
    Object : ObjectEnum;
    Data : Invite[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
