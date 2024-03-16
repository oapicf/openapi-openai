namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateEditRequestModel
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CreateEditRequest =

  //#region CreateEditRequest

  [<CLIMutable>]
  type CreateEditRequest = {
    [<JsonProperty(PropertyName = "model")>]
    Model : CreateEditRequestModel;
    [<JsonProperty(PropertyName = "input")>]
    Input : string option;
    [<JsonProperty(PropertyName = "instruction")>]
    Instruction : string;
    [<JsonProperty(PropertyName = "n")>]
    N : int option;
    [<JsonProperty(PropertyName = "temperature")>]
    Temperature : decimal option;
    [<JsonProperty(PropertyName = "top_p")>]
    TopP : decimal option;
  }

  //#endregion
