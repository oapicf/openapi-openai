namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageObject
open OpenAPI.Model.MessageStreamEventOneOf
open OpenAPI.Model.MessageStreamEventOneOf1
open OpenAPI.Model.MessageStreamEventOneOf2
open OpenAPI.Model.MessageStreamEventOneOf3
open OpenAPI.Model.MessageStreamEventOneOf4

module MessageStreamEvent =

  //#region MessageStreamEvent

  [<CLIMutable>]
  type MessageStreamEvent = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : MessageObject;
  }

  //#endregion
