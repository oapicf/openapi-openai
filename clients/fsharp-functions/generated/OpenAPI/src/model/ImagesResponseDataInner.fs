namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ImagesResponseDataInner =

  //#region ImagesResponseDataInner

  [<CLIMutable>]
  type ImagesResponseDataInner = {
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "b64_json")>]
    B64Json : string;
  }

  //#endregion
