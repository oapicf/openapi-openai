namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UserDeleteResponse =

  //#region UserDeleteResponse

  [<CLIMutable>]
  type UserDeleteResponse = {
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "deleted")>]
    Deleted : bool;
  }

  //#endregion
