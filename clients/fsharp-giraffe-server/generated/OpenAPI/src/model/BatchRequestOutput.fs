namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchRequestOutputError
open OpenAPI.Model.BatchRequestOutputResponse

module BatchRequestOutput =

  //#region BatchRequestOutput


  type BatchRequestOutput = {
    Id : string;
    CustomId : string;
    Response : BatchRequestOutputResponse;
    Error : BatchRequestOutputError;
  }
  //#endregion
