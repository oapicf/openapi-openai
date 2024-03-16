namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateModerationRequestInput
open OpenAPI.Model.CreateModerationRequestModel

module CreateModerationRequest =

  //#region CreateModerationRequest


  type CreateModerationRequest = {
    Input : CreateModerationRequestInput;
    Model : CreateModerationRequestModel;
  }
  //#endregion
