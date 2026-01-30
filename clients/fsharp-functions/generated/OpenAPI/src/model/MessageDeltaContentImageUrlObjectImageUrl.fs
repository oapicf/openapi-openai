namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MessageDeltaContentImageUrlObjectImageUrl =

  //#region MessageDeltaContentImageUrlObjectImageUrl

  [<CLIMutable>]
  type MessageDeltaContentImageUrlObjectImageUrl = {
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "detail")>]
    Detail : string;
  }

  //#endregion
