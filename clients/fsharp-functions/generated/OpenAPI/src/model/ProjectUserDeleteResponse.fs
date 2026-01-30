namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ProjectUserDeleteResponse =

  //#region ProjectUserDeleteResponse

  [<CLIMutable>]
  type ProjectUserDeleteResponse = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "deleted")>]
    Deleted : bool;
  }

  //#endregion
