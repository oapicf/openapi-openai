namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open FineTuningApiHandlerParams
open FineTuningApiServiceInterface
open FineTuningApiServiceImplementation
open OpenAPI.Model.CreateFineTuningJobRequest
open OpenAPI.Model.FineTuningJob
open OpenAPI.Model.ListFineTuningJobCheckpointsResponse
open OpenAPI.Model.ListFineTuningJobEventsResponse
open OpenAPI.Model.ListPaginatedFineTuningJobsResponse

module FineTuningApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CancelFineTuningJob
    /// <summary>
    /// Immediately cancel a fine-tune job. 
    /// </summary>

    let CancelFineTuningJob (pathParams:CancelFineTuningJobPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : CancelFineTuningJobArgs
          let result = FineTuningApiService.CancelFineTuningJob ctx serviceArgs
          return! (match result with
                      | CancelFineTuningJobStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateFineTuningJob
    /// <summary>
    /// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    /// </summary>

    let CreateFineTuningJob  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateFineTuningJobBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateFineTuningJobArgs
          let result = FineTuningApiService.CreateFineTuningJob ctx serviceArgs
          return! (match result with
                      | CreateFineTuningJobStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListFineTuningEvents
    /// <summary>
    /// Get status updates for a fine-tuning job. 
    /// </summary>

    let ListFineTuningEvents (pathParams:ListFineTuningEventsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListFineTuningEventsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ListFineTuningEventsArgs
          let result = FineTuningApiService.ListFineTuningEvents ctx serviceArgs
          return! (match result with
                      | ListFineTuningEventsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListFineTuningJobCheckpoints
    /// <summary>
    /// List checkpoints for a fine-tuning job. 
    /// </summary>

    let ListFineTuningJobCheckpoints (pathParams:ListFineTuningJobCheckpointsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListFineTuningJobCheckpointsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ListFineTuningJobCheckpointsArgs
          let result = FineTuningApiService.ListFineTuningJobCheckpoints ctx serviceArgs
          return! (match result with
                      | ListFineTuningJobCheckpointsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListPaginatedFineTuningJobs
    /// <summary>
    /// List your organization&#39;s fine-tuning jobs 
    /// </summary>

    let ListPaginatedFineTuningJobs  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListPaginatedFineTuningJobsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ListPaginatedFineTuningJobsArgs
          let result = FineTuningApiService.ListPaginatedFineTuningJobs ctx serviceArgs
          return! (match result with
                      | ListPaginatedFineTuningJobsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RetrieveFineTuningJob
    /// <summary>
    /// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    /// </summary>

    let RetrieveFineTuningJob (pathParams:RetrieveFineTuningJobPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RetrieveFineTuningJobArgs
          let result = FineTuningApiService.RetrieveFineTuningJob ctx serviceArgs
          return! (match result with
                      | RetrieveFineTuningJobStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

