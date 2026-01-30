namespace OpenAPI.Model

open System
open System.Collections.Generic

module ProjectApiKeyDeleteResponse =

  //#region ProjectApiKeyDeleteResponse

  //#region enums
  type ObjectEnum = OrganizationProjectApiKeyDeletedEnum of string  
  //#endregion

  type ProjectApiKeyDeleteResponse = {
    Object : ObjectEnum;
    Id : string;
    Deleted : bool;
  }
  //#endregion
