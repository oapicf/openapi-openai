namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FineTuningJobCheckpoint
open OpenAPI.Model.string option

module ListFineTuningJobCheckpointsResponse =

  //#region ListFineTuningJobCheckpointsResponse

  //#region enums
  type ObjectEnum = ListEnum of string  
  //#endregion

  type ListFineTuningJobCheckpointsResponse = {
    Data : FineTuningJobCheckpoint[];
    Object : ObjectEnum;
    FirstId : string option;
    LastId : string option;
    HasMore : bool;
  }
  //#endregion
