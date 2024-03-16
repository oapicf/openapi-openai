namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Model =

  //#region Model

  [<CLIMutable>]
  type Model = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "created")>]
    Created : int;
    [<JsonProperty(PropertyName = "owned_by")>]
    OwnedBy : string;
  }

  //#endregion
