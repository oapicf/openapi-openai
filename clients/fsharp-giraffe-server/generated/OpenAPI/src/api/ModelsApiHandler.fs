namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ModelsApiHandlerParams
open ModelsApiServiceInterface
open ModelsApiServiceImplementation
open OpenAPI.Model.DeleteModelResponse
open OpenAPI.Model.ListModelsResponse
open OpenAPI.Model.Model

module ModelsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region DeleteModel
    /// <summary>
    /// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    /// </summary>

    let DeleteModel (pathParams:DeleteModelPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteModelArgs
          let result = ModelsApiService.DeleteModel ctx serviceArgs
          return! (match result with
                      | DeleteModelStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListModels
    /// <summary>
    /// Lists the currently available models, and provides basic information about each one such as the owner and availability.
    /// </summary>

    let ListModels  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = ModelsApiService.ListModels ctx 
          return! (match result with
                      | ListModelsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RetrieveModel
    /// <summary>
    /// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    /// </summary>

    let RetrieveModel (pathParams:RetrieveModelPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RetrieveModelArgs
          let result = ModelsApiService.RetrieveModel ctx serviceArgs
          return! (match result with
                      | RetrieveModelStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

