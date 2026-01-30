namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ProjectServiceAccountApiKey =

  //#region ProjectServiceAccountApiKey

  [<CLIMutable>]
  type ProjectServiceAccountApiKey = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
