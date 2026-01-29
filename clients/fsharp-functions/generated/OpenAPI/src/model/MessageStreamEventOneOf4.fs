namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageObject

module MessageStreamEventOneOf4 =

  //#region MessageStreamEventOneOf4

  [<CLIMutable>]
  type MessageStreamEventOneOf4 = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : MessageObject;
  }

  //#endregion
