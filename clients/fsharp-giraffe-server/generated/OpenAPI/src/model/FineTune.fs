namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FineTuneEvent
open OpenAPI.Model.OpenAIFile
open OpenAPI.Model.string option

module FineTune =

  //#region FineTune


  type FineTune = {
    Id : string;
    Object : string;
    CreatedAt : int;
    UpdatedAt : int;
    Model : string;
    FineTunedModel : string option;
    OrganizationId : string;
    Status : string;
    Hyperparams : obj;
    TrainingFiles : OpenAIFile[];
    ValidationFiles : OpenAIFile[];
    ResultFiles : OpenAIFile[];
    Events : FineTuneEvent[];
  }
  //#endregion
