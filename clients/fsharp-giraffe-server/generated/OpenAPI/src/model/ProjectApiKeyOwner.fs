namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ProjectServiceAccount
open OpenAPI.Model.ProjectUser

module ProjectApiKeyOwner =

  //#region ProjectApiKeyOwner

  //#region enums
  type TypeEnum = UserEnum of string  |  ServiceAccountEnum of string  
  //#endregion

  type ProjectApiKey_owner = {
    Type : TypeEnum;
    User : ProjectUser;
    ServiceAccount : ProjectServiceAccount;
  }
  //#endregion
