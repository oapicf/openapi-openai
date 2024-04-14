namespace OpenAPI
open FineTuningApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module FineTuningApiServiceInterface =

    //#region Service interface
    type IFineTuningApiService =
      abstract member CancelFineTuningJob : unit -> CancelFineTuningJobResult
      abstract member CreateFineTuningJob : CreateFineTuningJobBodyParams -> CreateFineTuningJobResult
      abstract member ListFineTuningEvents : unit -> ListFineTuningEventsResult
      abstract member ListFineTuningJobCheckpoints : unit -> ListFineTuningJobCheckpointsResult
      abstract member ListPaginatedFineTuningJobs : unit -> ListPaginatedFineTuningJobsResult
      abstract member RetrieveFineTuningJob : unit -> RetrieveFineTuningJobResult
    //#endregion