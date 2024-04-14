namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageObject

module MessageStreamEventOneOf1 =

  //#region MessageStreamEventOneOf1

  [<CLIMutable>]
  type MessageStreamEventOneOf1 = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : MessageObject;
  }

  //#endregion
