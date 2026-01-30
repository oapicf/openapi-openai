namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ModerationsApiHandlerParams
open ModerationsApiServiceInterface
open ModerationsApiServiceImplementation
open OpenAPI.Model.CreateModerationRequest
open OpenAPI.Model.CreateModerationResponse

module ModerationsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CreateModeration
    /// <summary>
    /// Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
    /// </summary>

    let CreateModeration  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateModerationBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateModerationArgs
          let result = ModerationsApiService.CreateModeration ctx serviceArgs
          return! (match result with
                      | CreateModerationStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

