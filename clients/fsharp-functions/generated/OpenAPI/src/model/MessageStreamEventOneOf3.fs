namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageObject

module MessageStreamEventOneOf3 =

  //#region MessageStreamEventOneOf3

  [<CLIMutable>]
  type MessageStreamEventOneOf3 = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : MessageObject;
  }

  //#endregion
