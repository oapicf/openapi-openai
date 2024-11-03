namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateModerationRequestInput
open OpenAPI.Model.CreateModerationRequestModel

module CreateModerationRequest =

  //#region CreateModerationRequest

  [<CLIMutable>]
  type CreateModerationRequest = {
    [<JsonProperty(PropertyName = "input")>]
    Input : CreateModerationRequestInput;
    [<JsonProperty(PropertyName = "model")>]
    Model : CreateModerationRequestModel;
  }

  //#endregion
