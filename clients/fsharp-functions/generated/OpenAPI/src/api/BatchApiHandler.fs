namespace OpenAPI

open BatchApiHandlerParams
open BatchApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module BatchApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region CancelBatch
    /// <summary>
    /// Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
    /// </summary>
   [<FunctionName("CancelBatch")>]
    let CancelBatch
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/batches/{batch_id}/cancel")>]
        req:HttpRequest ) =

      let result = BatchApiService.CancelBatch ()
      match result with
      | CancelBatchStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateBatch
    /// <summary>
    /// Creates and executes a batch from an uploaded file of requests
    /// </summary>
   [<FunctionName("CreateBatch")>]
    let CreateBatch
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/batches")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateBatchBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BatchApiService.CreateBatch bodyParams
      match result with
      | CreateBatchStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListBatches
    /// <summary>
    /// List your organization&#39;s batches.
    /// </summary>
   [<FunctionName("ListBatches")>]
    let ListBatches
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/batches")>]
        req:HttpRequest ) =

      let result = BatchApiService.ListBatches ()
      match result with
      | ListBatchesStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region RetrieveBatch
    /// <summary>
    /// Retrieves a batch.
    /// </summary>
   [<FunctionName("RetrieveBatch")>]
    let RetrieveBatch
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/batches/{batch_id}")>]
        req:HttpRequest ) =

      let result = BatchApiService.RetrieveBatch ()
      match result with
      | RetrieveBatchStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

