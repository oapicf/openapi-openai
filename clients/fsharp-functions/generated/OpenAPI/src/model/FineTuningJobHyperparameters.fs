namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateFineTuningJobRequestHyperparametersBatchSize
open OpenAPI.Model.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
open OpenAPI.Model.CreateFineTuningJobRequestHyperparametersNEpochs

module FineTuningJobHyperparameters =

  //#region FineTuningJobHyperparameters

  [<CLIMutable>]
  type FineTuningJobHyperparameters = {
    [<JsonProperty(PropertyName = "batch_size")>]
    BatchSize : CreateFineTuningJobRequestHyperparametersBatchSize;
    [<JsonProperty(PropertyName = "learning_rate_multiplier")>]
    LearningRateMultiplier : CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;
    [<JsonProperty(PropertyName = "n_epochs")>]
    NEpochs : CreateFineTuningJobRequestHyperparametersNEpochs;
  }

  //#endregion
