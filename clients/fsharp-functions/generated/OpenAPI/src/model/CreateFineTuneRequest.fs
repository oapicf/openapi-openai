namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateFineTuneRequestModel
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CreateFineTuneRequest =

  //#region CreateFineTuneRequest

  [<CLIMutable>]
  type CreateFineTuneRequest = {
    [<JsonProperty(PropertyName = "training_file")>]
    TrainingFile : string;
    [<JsonProperty(PropertyName = "validation_file")>]
    ValidationFile : string option;
    [<JsonProperty(PropertyName = "model")>]
    Model : CreateFineTuneRequestModel;
    [<JsonProperty(PropertyName = "n_epochs")>]
    NEpochs : int option;
    [<JsonProperty(PropertyName = "batch_size")>]
    BatchSize : int option;
    [<JsonProperty(PropertyName = "learning_rate_multiplier")>]
    LearningRateMultiplier : decimal option;
    [<JsonProperty(PropertyName = "prompt_loss_weight")>]
    PromptLossWeight : decimal option;
    [<JsonProperty(PropertyName = "compute_classification_metrics")>]
    ComputeClassificationMetrics : bool option;
    [<JsonProperty(PropertyName = "classification_n_classes")>]
    ClassificationNClasses : int option;
    [<JsonProperty(PropertyName = "classification_positive_class")>]
    ClassificationPositiveClass : string option;
    [<JsonProperty(PropertyName = "classification_betas")>]
    ClassificationBetas : decimal[];
    [<JsonProperty(PropertyName = "suffix")>]
    Suffix : string option;
  }

  //#endregion
