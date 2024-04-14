namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MessageDeltaContentTextObjectTextAnnotationsInner

module MessageDeltaContentTextObjectText =

  //#region MessageDeltaContentTextObjectText

  [<CLIMutable>]
  type MessageDeltaContentTextObjectText = {
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
    [<JsonProperty(PropertyName = "annotations")>]
    Annotations : MessageDeltaContentTextObjectTextAnnotationsInner[];
  }

  //#endregion
