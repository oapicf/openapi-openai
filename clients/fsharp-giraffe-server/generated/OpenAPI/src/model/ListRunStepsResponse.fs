namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepObject

module ListRunStepsResponse =

  //#region ListRunStepsResponse


  type ListRunStepsResponse = {
    Object : string;
    Data : RunStepObject[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
