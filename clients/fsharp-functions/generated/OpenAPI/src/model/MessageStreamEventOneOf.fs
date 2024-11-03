namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageObject

module MessageStreamEventOneOf =

  //#region MessageStreamEventOneOf

  [<CLIMutable>]
  type MessageStreamEventOneOf = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : MessageObject;
  }

  //#endregion
