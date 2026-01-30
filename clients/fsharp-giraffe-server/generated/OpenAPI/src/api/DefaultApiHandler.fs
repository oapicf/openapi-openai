namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open DefaultApiServiceImplementation
open OpenAPI.Model.AdminApiKey
open OpenAPI.Model.AdminApiKeysCreateRequest
open OpenAPI.Model.AdminApiKeysDelete200Response
open OpenAPI.Model.ApiKeyList
open OpenAPI.Model.string option

module DefaultApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AdminApiKeysCreate
    /// <summary>
    /// Create an organization admin API key
    /// </summary>

    let AdminApiKeysCreate  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdminApiKeysCreateBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : AdminApiKeysCreateArgs
          let result = DefaultApiService.AdminApiKeysCreate ctx serviceArgs
          return! (match result with
                      | AdminApiKeysCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdminApiKeysDelete
    /// <summary>
    /// Delete an organization admin API key
    /// </summary>

    let AdminApiKeysDelete (pathParams:AdminApiKeysDeletePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : AdminApiKeysDeleteArgs
          let result = DefaultApiService.AdminApiKeysDelete ctx serviceArgs
          return! (match result with
                      | AdminApiKeysDeleteStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdminApiKeysGet
    /// <summary>
    /// Retrieve a single organization API key
    /// </summary>

    let AdminApiKeysGet (pathParams:AdminApiKeysGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : AdminApiKeysGetArgs
          let result = DefaultApiService.AdminApiKeysGet ctx serviceArgs
          return! (match result with
                      | AdminApiKeysGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdminApiKeysList
    /// <summary>
    /// List organization API keys
    /// </summary>

    let AdminApiKeysList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdminApiKeysListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : AdminApiKeysListArgs
          let result = DefaultApiService.AdminApiKeysList ctx serviceArgs
          return! (match result with
                      | AdminApiKeysListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

