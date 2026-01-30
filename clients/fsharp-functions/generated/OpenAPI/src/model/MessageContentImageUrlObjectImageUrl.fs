namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MessageContentImageUrlObjectImageUrl =

  //#region MessageContentImageUrlObjectImageUrl

  [<CLIMutable>]
  type MessageContentImageUrlObjectImageUrl = {
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "detail")>]
    Detail : string;
  }

  //#endregion
