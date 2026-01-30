namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProjectApiKeyOwner

module ProjectApiKey =

  //#region ProjectApiKey

  [<CLIMutable>]
  type ProjectApiKey = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "redacted_value")>]
    RedactedValue : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "owner")>]
    Owner : ProjectApiKeyOwner;
  }

  //#endregion
