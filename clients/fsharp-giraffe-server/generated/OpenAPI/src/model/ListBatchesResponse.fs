namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Batch

module ListBatchesResponse =

  //#region ListBatchesResponse

  //#region enums
  type ObjectEnum = ListEnum of string  
  //#endregion

  type ListBatchesResponse = {
    Data : Batch[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
    Object : ObjectEnum;
  }
  //#endregion
