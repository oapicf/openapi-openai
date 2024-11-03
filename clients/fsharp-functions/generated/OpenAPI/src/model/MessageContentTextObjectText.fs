namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageContentTextObjectTextAnnotationsInner

module MessageContentTextObjectText =

  //#region MessageContentTextObjectText

  [<CLIMutable>]
  type MessageContentTextObjectText = {
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
    [<JsonProperty(PropertyName = "annotations")>]
    Annotations : MessageContentTextObjectTextAnnotationsInner[];
  }

  //#endregion
