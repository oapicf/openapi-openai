namespace OpenAPI
open FineTuningApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module FineTuningApiServiceInterface =

    //#region Service interface
    type IFineTuningApiService =
      abstract member CancelFineTuningJob:HttpContext -> CancelFineTuningJobArgs->CancelFineTuningJobResult
      abstract member CreateFineTuningJob:HttpContext -> CreateFineTuningJobArgs->CreateFineTuningJobResult
      abstract member ListFineTuningEvents:HttpContext -> ListFineTuningEventsArgs->ListFineTuningEventsResult
      abstract member ListFineTuningJobCheckpoints:HttpContext -> ListFineTuningJobCheckpointsArgs->ListFineTuningJobCheckpointsResult
      abstract member ListPaginatedFineTuningJobs:HttpContext -> ListPaginatedFineTuningJobsArgs->ListPaginatedFineTuningJobsResult
      abstract member RetrieveFineTuningJob:HttpContext -> RetrieveFineTuningJobArgs->RetrieveFineTuningJobResult
    //#endregion