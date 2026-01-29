namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageDeltaObjectDelta

module MessageDeltaObject =

  //#region MessageDeltaObject

  [<CLIMutable>]
  type MessageDeltaObject = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "delta")>]
    Delta : MessageDeltaObjectDelta;
  }

  //#endregion
