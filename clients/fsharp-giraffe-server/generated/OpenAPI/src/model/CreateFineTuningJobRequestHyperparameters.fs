namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateFineTuningJobRequestHyperparametersBatchSize
open OpenAPI.Model.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
open OpenAPI.Model.CreateFineTuningJobRequestHyperparametersNEpochs

module CreateFineTuningJobRequestHyperparameters =

  //#region CreateFineTuningJobRequestHyperparameters


  type CreateFineTuningJobRequest_hyperparameters = {
    BatchSize : CreateFineTuningJobRequestHyperparametersBatchSize;
    LearningRateMultiplier : CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;
    NEpochs : CreateFineTuningJobRequestHyperparametersNEpochs;
  }
  //#endregion
