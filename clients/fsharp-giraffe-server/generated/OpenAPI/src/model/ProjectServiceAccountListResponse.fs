namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ProjectServiceAccount

module ProjectServiceAccountListResponse =

  //#region ProjectServiceAccountListResponse

  //#region enums
  type ObjectEnum = ListEnum of string  
  //#endregion

  type ProjectServiceAccountListResponse = {
    Object : ObjectEnum;
    Data : ProjectServiceAccount[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
