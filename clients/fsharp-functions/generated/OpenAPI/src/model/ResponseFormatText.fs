namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ResponseFormatText =

  //#region ResponseFormatText

  [<CLIMutable>]
  type ResponseFormatText = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
