namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageDeltaObject

module MessageStreamEventOneOf2 =

  //#region MessageStreamEventOneOf2

  [<CLIMutable>]
  type MessageStreamEventOneOf2 = {
    [<JsonProperty(PropertyName = "event")>]
    Event : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : MessageDeltaObject;
  }

  //#endregion
