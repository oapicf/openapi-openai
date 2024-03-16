namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FineTuneEvent
open OpenAPI.Model.OpenAIFile
open OpenAPI.Model.string option

module FineTune =

  //#region FineTune

  [<CLIMutable>]
  type FineTune = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "object")>]
    Object : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "updated_at")>]
    UpdatedAt : int;
    [<JsonProperty(PropertyName = "model")>]
    Model : string;
    [<JsonProperty(PropertyName = "fine_tuned_model")>]
    FineTunedModel : string option;
    [<JsonProperty(PropertyName = "organization_id")>]
    OrganizationId : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "hyperparams")>]
    Hyperparams : obj;
    [<JsonProperty(PropertyName = "training_files")>]
    TrainingFiles : OpenAIFile[];
    [<JsonProperty(PropertyName = "validation_files")>]
    ValidationFiles : OpenAIFile[];
    [<JsonProperty(PropertyName = "result_files")>]
    ResultFiles : OpenAIFile[];
    [<JsonProperty(PropertyName = "events")>]
    Events : FineTuneEvent[];
  }

  //#endregion
