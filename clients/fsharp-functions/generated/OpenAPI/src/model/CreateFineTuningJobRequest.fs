namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateFineTuningJobRequestHyperparameters
open OpenAPI.Model.CreateFineTuningJobRequestIntegrationsInner
open OpenAPI.Model.CreateFineTuningJobRequestModel
open OpenAPI.Model.FineTuneMethod
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CreateFineTuningJobRequest =

  //#region CreateFineTuningJobRequest

  [<CLIMutable>]
  type CreateFineTuningJobRequest = {
    [<JsonProperty(PropertyName = "model")>]
    Model : CreateFineTuningJobRequestModel;
    [<JsonProperty(PropertyName = "training_file")>]
    TrainingFile : string;
    [<JsonProperty(PropertyName = "hyperparameters")>]
    Hyperparameters : CreateFineTuningJobRequestHyperparameters;
    [<JsonProperty(PropertyName = "suffix")>]
    Suffix : string option;
    [<JsonProperty(PropertyName = "validation_file")>]
    ValidationFile : string option;
    [<JsonProperty(PropertyName = "integrations")>]
    Integrations : CreateFineTuningJobRequestIntegrationsInner[];
    [<JsonProperty(PropertyName = "seed")>]
    Seed : int option;
    [<JsonProperty(PropertyName = "method")>]
    Method : FineTuneMethod;
  }

  //#endregion
