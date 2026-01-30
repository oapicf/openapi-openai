namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ResponseFormatJsonObject =

  //#region ResponseFormatJsonObject

  [<CLIMutable>]
  type ResponseFormatJsonObject = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
