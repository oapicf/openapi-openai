namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FineTuneDPOMethodHyperparametersBatchSize
open OpenAPI.Model.FineTuneDPOMethodHyperparametersBeta
open OpenAPI.Model.FineTuneDPOMethodHyperparametersLearningRateMultiplier
open OpenAPI.Model.FineTuneDPOMethodHyperparametersNEpochs

module FineTuneDPOMethodHyperparameters =

  //#region FineTuneDPOMethodHyperparameters


  type FineTuneDPOMethod_hyperparameters = {
    Beta : FineTuneDPOMethodHyperparametersBeta;
    BatchSize : FineTuneDPOMethodHyperparametersBatchSize;
    LearningRateMultiplier : FineTuneDPOMethodHyperparametersLearningRateMultiplier;
    NEpochs : FineTuneDPOMethodHyperparametersNEpochs;
  }
  //#endregion
