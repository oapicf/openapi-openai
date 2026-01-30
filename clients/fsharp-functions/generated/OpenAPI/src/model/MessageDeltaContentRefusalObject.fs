namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MessageDeltaContentRefusalObject =

  //#region MessageDeltaContentRefusalObject

  [<CLIMutable>]
  type MessageDeltaContentRefusalObject = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "refusal")>]
    Refusal : string;
  }

  //#endregion
