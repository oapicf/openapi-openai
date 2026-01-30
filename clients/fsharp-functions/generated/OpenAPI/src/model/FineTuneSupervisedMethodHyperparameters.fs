namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FineTuneDPOMethodHyperparametersBatchSize
open OpenAPI.Model.FineTuneDPOMethodHyperparametersLearningRateMultiplier
open OpenAPI.Model.FineTuneDPOMethodHyperparametersNEpochs

module FineTuneSupervisedMethodHyperparameters =

  //#region FineTuneSupervisedMethodHyperparameters

  [<CLIMutable>]
  type FineTuneSupervisedMethodHyperparameters = {
    [<JsonProperty(PropertyName = "batch_size")>]
    BatchSize : FineTuneDPOMethodHyperparametersBatchSize;
    [<JsonProperty(PropertyName = "learning_rate_multiplier")>]
    LearningRateMultiplier : FineTuneDPOMethodHyperparametersLearningRateMultiplier;
    [<JsonProperty(PropertyName = "n_epochs")>]
    NEpochs : FineTuneDPOMethodHyperparametersNEpochs;
  }

  //#endregion
