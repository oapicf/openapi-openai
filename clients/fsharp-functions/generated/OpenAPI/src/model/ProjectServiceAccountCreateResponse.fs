namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProjectServiceAccountApiKey

module ProjectServiceAccountCreateResponse =

  //#region ProjectServiceAccountCreateResponse

  [<CLIMutable>]
  type ProjectServiceAccountCreateResponse = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "api_key")>]
    ApiKey : ProjectServiceAccountApiKey;
  }

  //#endregion
