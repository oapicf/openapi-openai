namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FineTuneDPOMethodHyperparametersBatchSize
open OpenAPI.Model.FineTuneDPOMethodHyperparametersLearningRateMultiplier
open OpenAPI.Model.FineTuneDPOMethodHyperparametersNEpochs

module FineTuneSupervisedMethodHyperparameters =

  //#region FineTuneSupervisedMethodHyperparameters


  type FineTuneSupervisedMethod_hyperparameters = {
    BatchSize : FineTuneDPOMethodHyperparametersBatchSize;
    LearningRateMultiplier : FineTuneDPOMethodHyperparametersLearningRateMultiplier;
    NEpochs : FineTuneDPOMethodHyperparametersNEpochs;
  }
  //#endregion
