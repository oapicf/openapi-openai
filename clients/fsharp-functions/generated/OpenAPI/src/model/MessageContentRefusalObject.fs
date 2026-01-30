namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MessageContentRefusalObject =

  //#region MessageContentRefusalObject

  [<CLIMutable>]
  type MessageContentRefusalObject = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "refusal")>]
    Refusal : string;
  }

  //#endregion
