namespace OpenAPI

open ModelsApiHandlerParams
open ModelsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ModelsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region DeleteModel
    /// <summary>
    /// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    /// </summary>
   [<FunctionName("DeleteModel")>]
    let DeleteModel
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v1/models/{model}")>]
        req:HttpRequest ) =

      let result = ModelsApiService.DeleteModel ()
      match result with
      | DeleteModelStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListModels
    /// <summary>
    /// Lists the currently available models, and provides basic information about each one such as the owner and availability.
    /// </summary>
   [<FunctionName("ListModels")>]
    let ListModels
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/models")>]
        req:HttpRequest ) =

      let result = ModelsApiService.ListModels ()
      match result with
      | ListModelsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region RetrieveModel
    /// <summary>
    /// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    /// </summary>
   [<FunctionName("RetrieveModel")>]
    let RetrieveModel
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/models/{model}")>]
        req:HttpRequest ) =

      let result = ModelsApiService.RetrieveModel ()
      match result with
      | RetrieveModelStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

