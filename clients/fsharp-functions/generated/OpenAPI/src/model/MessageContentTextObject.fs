namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageContentTextObjectText

module MessageContentTextObject =

  //#region MessageContentTextObject

  [<CLIMutable>]
  type MessageContentTextObject = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : MessageContentTextObjectText;
  }

  //#endregion
