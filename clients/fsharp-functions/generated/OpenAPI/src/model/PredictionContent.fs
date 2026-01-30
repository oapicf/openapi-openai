namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PredictionContentContent

module PredictionContent =

  //#region PredictionContent

  [<CLIMutable>]
  type PredictionContent = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "content")>]
    Content : PredictionContentContent;
  }

  //#endregion
