namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AssistantsApiResponseFormat =

  //#region AssistantsApiResponseFormat

  [<CLIMutable>]
  type AssistantsApiResponseFormat = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
