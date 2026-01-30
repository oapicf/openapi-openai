namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ProjectApiKey

module ProjectApiKeyListResponse =

  //#region ProjectApiKeyListResponse

  //#region enums
  type ObjectEnum = ListEnum of string  
  //#endregion

  type ProjectApiKeyListResponse = {
    Object : ObjectEnum;
    Data : ProjectApiKey[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
