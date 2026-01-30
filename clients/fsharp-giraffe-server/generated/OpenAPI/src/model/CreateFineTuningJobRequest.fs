namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateFineTuningJobRequestHyperparameters
open OpenAPI.Model.CreateFineTuningJobRequestIntegrationsInner
open OpenAPI.Model.CreateFineTuningJobRequestModel
open OpenAPI.Model.FineTuneMethod
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CreateFineTuningJobRequest =

  //#region CreateFineTuningJobRequest


  type CreateFineTuningJobRequest = {
    Model : CreateFineTuningJobRequestModel;
    TrainingFile : string;
    Hyperparameters : CreateFineTuningJobRequestHyperparameters;
    Suffix : string option;
    ValidationFile : string option;
    Integrations : CreateFineTuningJobRequestIntegrationsInner[];
    Seed : int option;
    Method : FineTuneMethod;
  }
  //#endregion
