namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.int option

module TruncationObject =

  //#region TruncationObject

  [<CLIMutable>]
  type TruncationObject = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "last_messages")>]
    LastMessages : int option;
  }

  //#endregion
