namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ImagesApiHandlerParams
open ImagesApiServiceInterface
open ImagesApiServiceImplementation
open OpenAPI.Model.CreateImageEditRequestModel
open OpenAPI.Model.CreateImageRequest
open OpenAPI.Model.ImagesResponse
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module ImagesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CreateImage
    /// <summary>
    /// Creates an image given a prompt.
    /// </summary>

    let CreateImage  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateImageBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateImageArgs
          let result = ImagesApiService.CreateImage ctx serviceArgs
          return! (match result with
                      | CreateImageStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateImageEdit
    /// <summary>
    /// Creates an edited or extended image given an original image and a prompt.
    /// </summary>

    let CreateImageEdit  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! formParams = ctx.TryBindFormAsync<CreateImageEditFormParams>()
          let serviceArgs = {   formParams=formParams;   } : CreateImageEditArgs
          let result = ImagesApiService.CreateImageEdit ctx serviceArgs
          return! (match result with
                      | CreateImageEditStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateImageVariation
    /// <summary>
    /// Creates a variation of a given image.
    /// </summary>

    let CreateImageVariation  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! formParams = ctx.TryBindFormAsync<CreateImageVariationFormParams>()
          let serviceArgs = {   formParams=formParams;   } : CreateImageVariationArgs
          let result = ImagesApiService.CreateImageVariation ctx serviceArgs
          return! (match result with
                      | CreateImageVariationStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

