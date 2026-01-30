namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdminApiKeysDelete200Response =

  //#region AdminApiKeysDelete200Response

  [<CLIMutable>]
  type AdminApiKeysDelete200Response = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "deleted")>]
    Deleted : bool;
  }

  //#endregion
