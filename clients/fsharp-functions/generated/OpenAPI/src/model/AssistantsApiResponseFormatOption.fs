namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssistantsApiResponseFormat

module AssistantsApiResponseFormatOption =

  //#region AssistantsApiResponseFormatOption

  [<CLIMutable>]
  type AssistantsApiResponseFormatOption = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
