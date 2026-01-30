namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FineTuneMethod
open OpenAPI.Model.FineTuningJobError
open OpenAPI.Model.FineTuningJobHyperparameters
open OpenAPI.Model.FineTuningJobIntegrationsInner
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module FineTuningJob =

  //#region FineTuningJob

  //#region enums
  type ObjectEnum = FineTuningJobEnum of string  
  //#endregion
  //#region enums
  type StatusEnum = ValidatingFilesEnum of string  |  QueuedEnum of string  |  RunningEnum of string  |  SucceededEnum of string  |  FailedEnum of string  |  CancelledEnum of string  
  //#endregion

  type FineTuningJob = {
    Id : string;
    CreatedAt : int;
    Error : FineTuningJobError;
    FineTunedModel : string option;
    FinishedAt : int option;
    Hyperparameters : FineTuningJobHyperparameters;
    Model : string;
    Object : ObjectEnum;
    OrganizationId : string;
    ResultFiles : string[];
    Status : StatusEnum;
    TrainedTokens : int option;
    TrainingFile : string;
    ValidationFile : string option;
    Integrations : FineTuningJobIntegrationsInner[];
    Seed : int;
    EstimatedFinish : int option;
    Method : FineTuneMethod;
  }
  //#endregion
