namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunObject

module ListRunsResponse =

  //#region ListRunsResponse


  type ListRunsResponse = {
    Object : string;
    Data : RunObject[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
