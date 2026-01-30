namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdminApiKeyOwner

module AdminApiKey =

  //#region AdminApiKey

  [<CLIMutable>]
  type AdminApiKey = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "redacted_value")>]
    RedactedValue : string;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int64;
    [<JsonProperty(PropertyName = "owner")>]
    Owner : AdminApiKeyOwner;
  }

  //#endregion
