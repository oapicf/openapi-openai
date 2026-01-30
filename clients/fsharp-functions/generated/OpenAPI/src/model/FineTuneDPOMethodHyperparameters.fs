namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FineTuneDPOMethodHyperparametersBatchSize
open OpenAPI.Model.FineTuneDPOMethodHyperparametersBeta
open OpenAPI.Model.FineTuneDPOMethodHyperparametersLearningRateMultiplier
open OpenAPI.Model.FineTuneDPOMethodHyperparametersNEpochs

module FineTuneDPOMethodHyperparameters =

  //#region FineTuneDPOMethodHyperparameters

  [<CLIMutable>]
  type FineTuneDPOMethodHyperparameters = {
    [<JsonProperty(PropertyName = "beta")>]
    Beta : FineTuneDPOMethodHyperparametersBeta;
    [<JsonProperty(PropertyName = "batch_size")>]
    BatchSize : FineTuneDPOMethodHyperparametersBatchSize;
    [<JsonProperty(PropertyName = "learning_rate_multiplier")>]
    LearningRateMultiplier : FineTuneDPOMethodHyperparametersLearningRateMultiplier;
    [<JsonProperty(PropertyName = "n_epochs")>]
    NEpochs : FineTuneDPOMethodHyperparametersNEpochs;
  }

  //#endregion
