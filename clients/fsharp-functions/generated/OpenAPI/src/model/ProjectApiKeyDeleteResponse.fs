namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ProjectApiKeyDeleteResponse =

  //#region ProjectApiKeyDeleteResponse

  [<CLIMutable>]
  type ProjectApiKeyDeleteResponse = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "deleted")>]
    Deleted : bool;
  }

  //#endregion
