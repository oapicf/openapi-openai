namespace OpenAPI
open OpenAPI.Model.CreateFineTuningJobRequest
open OpenAPI.Model.FineTuningJob
open OpenAPI.Model.ListFineTuningJobCheckpointsResponse
open OpenAPI.Model.ListFineTuningJobEventsResponse
open OpenAPI.Model.ListPaginatedFineTuningJobsResponse
open FineTuningApiHandlerParams
open FineTuningApiServiceInterface
open System.Collections.Generic
open System

module FineTuningApiServiceImplementation =

    //#region Service implementation
    type FineTuningApiServiceImpl() =
      interface IFineTuningApiService with

        member this.CancelFineTuningJob () =
            let content = "OK" :> obj :?> FineTuningJob // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CancelFineTuningJobStatusCode200 { content = content }

        member this.CreateFineTuningJob (parameters:CreateFineTuningJobBodyParams) =
            let content = "OK" :> obj :?> FineTuningJob // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateFineTuningJobStatusCode200 { content = content }

        member this.ListFineTuningEvents () =
            let content = "OK" :> obj :?> ListFineTuningJobEventsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListFineTuningEventsStatusCode200 { content = content }

        member this.ListFineTuningJobCheckpoints () =
            let content = "OK" :> obj :?> ListFineTuningJobCheckpointsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListFineTuningJobCheckpointsStatusCode200 { content = content }

        member this.ListPaginatedFineTuningJobs () =
            let content = "OK" :> obj :?> ListPaginatedFineTuningJobsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListPaginatedFineTuningJobsStatusCode200 { content = content }

        member this.RetrieveFineTuningJob () =
            let content = "OK" :> obj :?> FineTuningJob // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveFineTuningJobStatusCode200 { content = content }

      //#endregion

    let FineTuningApiService = FineTuningApiServiceImpl() :> IFineTuningApiService