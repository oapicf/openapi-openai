namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FineTuningJob

module ListPaginatedFineTuningJobsResponse =

  //#region ListPaginatedFineTuningJobsResponse

  //#region enums
  type ObjectEnum = ListEnum of string  
  //#endregion

  type ListPaginatedFineTuningJobsResponse = {
    Data : FineTuningJob[];
    HasMore : bool;
    Object : ObjectEnum;
  }
  //#endregion
