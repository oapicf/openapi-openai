namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageDeltaObjectDeltaContentInner

module MessageDeltaObjectDelta =

  //#region MessageDeltaObjectDelta

  [<CLIMutable>]
  type MessageDeltaObjectDelta = {
    [<JsonProperty(PropertyName = "role")>]
    Role : string;
    [<JsonProperty(PropertyName = "content")>]
    Content : MessageDeltaObjectDeltaContentInner[];
  }

  //#endregion
