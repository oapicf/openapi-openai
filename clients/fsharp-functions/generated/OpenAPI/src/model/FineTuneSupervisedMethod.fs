namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FineTuneSupervisedMethodHyperparameters

module FineTuneSupervisedMethod =

  //#region FineTuneSupervisedMethod

  [<CLIMutable>]
  type FineTuneSupervisedMethod = {
    [<JsonProperty(PropertyName = "hyperparameters")>]
    Hyperparameters : FineTuneSupervisedMethodHyperparameters;
  }

  //#endregion
