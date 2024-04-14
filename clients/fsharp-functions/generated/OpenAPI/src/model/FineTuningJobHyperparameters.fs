namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FineTuningJobHyperparametersNEpochs

module FineTuningJobHyperparameters =

  //#region FineTuningJobHyperparameters

  [<CLIMutable>]
  type FineTuningJobHyperparameters = {
    [<JsonProperty(PropertyName = "n_epochs")>]
    NEpochs : FineTuningJobHyperparametersNEpochs;
  }

  //#endregion
