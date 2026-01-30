namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProjectServiceAccount
open OpenAPI.Model.ProjectUser

module ProjectApiKeyOwner =

  //#region ProjectApiKeyOwner

  [<CLIMutable>]
  type ProjectApiKeyOwner = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "user")>]
    User : ProjectUser;
    [<JsonProperty(PropertyName = "service_account")>]
    ServiceAccount : ProjectServiceAccount;
  }

  //#endregion
