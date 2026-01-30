namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdminApiKeyOwner =

  //#region AdminApiKeyOwner

  [<CLIMutable>]
  type AdminApiKeyOwner = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int64;
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
  }

  //#endregion
