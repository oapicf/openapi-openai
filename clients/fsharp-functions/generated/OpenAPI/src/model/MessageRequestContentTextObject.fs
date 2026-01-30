namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MessageRequestContentTextObject =

  //#region MessageRequestContentTextObject

  [<CLIMutable>]
  type MessageRequestContentTextObject = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
  }

  //#endregion
