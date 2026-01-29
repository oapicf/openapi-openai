namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ThreadObject

module ListThreadsResponse =

  //#region ListThreadsResponse


  type ListThreadsResponse = {
    Object : string;
    Data : ThreadObject[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
