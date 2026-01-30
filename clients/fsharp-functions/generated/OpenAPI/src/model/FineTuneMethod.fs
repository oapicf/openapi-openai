namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FineTuneDPOMethod
open OpenAPI.Model.FineTuneSupervisedMethod

module FineTuneMethod =

  //#region FineTuneMethod

  [<CLIMutable>]
  type FineTuneMethod = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "supervised")>]
    Supervised : FineTuneSupervisedMethod;
    [<JsonProperty(PropertyName = "dpo")>]
    Dpo : FineTuneDPOMethod;
  }

  //#endregion
