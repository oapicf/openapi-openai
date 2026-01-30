namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FineTuneDPOMethodHyperparameters

module FineTuneDPOMethod =

  //#region FineTuneDPOMethod

  [<CLIMutable>]
  type FineTuneDPOMethod = {
    [<JsonProperty(PropertyName = "hyperparameters")>]
    Hyperparameters : FineTuneDPOMethodHyperparameters;
  }

  //#endregion
