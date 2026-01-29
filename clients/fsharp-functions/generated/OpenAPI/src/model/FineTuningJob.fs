namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FineTuningJobError
open OpenAPI.Model.FineTuningJobHyperparameters
open OpenAPI.Model.FineTuningJobIntegrationsInner
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module FineTuningJob =

  //#region FineTuningJob

  [<CLIMutable>]
  type FineTuningJob = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "error")>]
    Error : FineTuningJobError;
    [<JsonProperty(PropertyName = "fine_tuned_model")>]
    FineTunedModel : string option;
    [<JsonProperty(PropertyName = "finished_at")>]
    FinishedAt : int option;
    [<JsonProperty(PropertyName = "hyperparameters")>]
    Hyperparameters : FineTuningJobHyperparameters;
    [<JsonProperty(PropertyName = "model")>]
    Model : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "organization_id")>]
    OrganizationId : string;
    [<JsonProperty(PropertyName = "result_files")>]
    ResultFiles : string[];
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "trained_tokens")>]
    TrainedTokens : int option;
    [<JsonProperty(PropertyName = "training_file")>]
    TrainingFile : string;
    [<JsonProperty(PropertyName = "validation_file")>]
    ValidationFile : string option;
    [<JsonProperty(PropertyName = "integrations")>]
    Integrations : FineTuningJobIntegrationsInner[];
    [<JsonProperty(PropertyName = "seed")>]
    Seed : int;
  }

  //#endregion
