namespace OpenAPI.Model

open System
open System.Collections.Generic

module UserDeleteResponse =

  //#region UserDeleteResponse

  //#region enums
  type ObjectEnum = OrganizationUserDeletedEnum of string  
  //#endregion

  type UserDeleteResponse = {
    Object : ObjectEnum;
    Id : string;
    Deleted : bool;
  }
  //#endregion
