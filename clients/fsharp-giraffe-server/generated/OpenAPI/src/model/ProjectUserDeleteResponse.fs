namespace OpenAPI.Model

open System
open System.Collections.Generic

module ProjectUserDeleteResponse =

  //#region ProjectUserDeleteResponse

  //#region enums
  type ObjectEnum = OrganizationProjectUserDeletedEnum of string  
  //#endregion

  type ProjectUserDeleteResponse = {
    Object : ObjectEnum;
    Id : string;
    Deleted : bool;
  }
  //#endregion
