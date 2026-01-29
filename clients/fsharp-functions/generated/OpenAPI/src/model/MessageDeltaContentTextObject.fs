namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageDeltaContentTextObjectText

module MessageDeltaContentTextObject =

  //#region MessageDeltaContentTextObject

  [<CLIMutable>]
  type MessageDeltaContentTextObject = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : MessageDeltaContentTextObjectText;
  }

  //#endregion
