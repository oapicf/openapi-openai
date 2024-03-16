namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateFineTuneRequestModel
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CreateFineTuneRequest =

  //#region CreateFineTuneRequest


  type CreateFineTuneRequest = {
    TrainingFile : string;
    ValidationFile : string option;
    Model : CreateFineTuneRequestModel;
    NEpochs : int option;
    BatchSize : int option;
    LearningRateMultiplier : decimal option;
    PromptLossWeight : decimal option;
    ComputeClassificationMetrics : bool option;
    ClassificationNClasses : int option;
    ClassificationPositiveClass : string option;
    ClassificationBetas : decimal[];
    Suffix : string option;
  }
  //#endregion
