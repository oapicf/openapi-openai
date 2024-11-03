namespace OpenAPI

open FineTuningApiHandlerParams
open FineTuningApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module FineTuningApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region CancelFineTuningJob
    /// <summary>
    /// Immediately cancel a fine-tune job. 
    /// </summary>
   [<FunctionName("CancelFineTuningJob")>]
    let CancelFineTuningJob
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel")>]
        req:HttpRequest ) =

      let result = FineTuningApiService.CancelFineTuningJob ()
      match result with
      | CancelFineTuningJobStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateFineTuningJob
    /// <summary>
    /// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    /// </summary>
   [<FunctionName("CreateFineTuningJob")>]
    let CreateFineTuningJob
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/fine_tuning/jobs")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateFineTuningJobBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = FineTuningApiService.CreateFineTuningJob bodyParams
      match result with
      | CreateFineTuningJobStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListFineTuningEvents
    /// <summary>
    /// Get status updates for a fine-tuning job. 
    /// </summary>
   [<FunctionName("ListFineTuningEvents")>]
    let ListFineTuningEvents
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/fine_tuning/jobs/{fine_tuning_job_id}/events")>]
        req:HttpRequest ) =

      let result = FineTuningApiService.ListFineTuningEvents ()
      match result with
      | ListFineTuningEventsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListFineTuningJobCheckpoints
    /// <summary>
    /// List checkpoints for a fine-tuning job. 
    /// </summary>
   [<FunctionName("ListFineTuningJobCheckpoints")>]
    let ListFineTuningJobCheckpoints
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints")>]
        req:HttpRequest ) =

      let result = FineTuningApiService.ListFineTuningJobCheckpoints ()
      match result with
      | ListFineTuningJobCheckpointsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListPaginatedFineTuningJobs
    /// <summary>
    /// List your organization&#39;s fine-tuning jobs 
    /// </summary>
   [<FunctionName("ListPaginatedFineTuningJobs")>]
    let ListPaginatedFineTuningJobs
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/fine_tuning/jobs")>]
        req:HttpRequest ) =

      let result = FineTuningApiService.ListPaginatedFineTuningJobs ()
      match result with
      | ListPaginatedFineTuningJobsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region RetrieveFineTuningJob
    /// <summary>
    /// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    /// </summary>
   [<FunctionName("RetrieveFineTuningJob")>]
    let RetrieveFineTuningJob
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/fine_tuning/jobs/{fine_tuning_job_id}")>]
        req:HttpRequest ) =

      let result = FineTuningApiService.RetrieveFineTuningJob ()
      match result with
      | RetrieveFineTuningJobStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

