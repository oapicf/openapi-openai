namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open OpenAIApiHandlerParams
open OpenAIApiServiceInterface
open OpenAIApiServiceImplementation
open OpenAPI.Model.CreateChatCompletionRequest
open OpenAPI.Model.CreateChatCompletionResponse
open OpenAPI.Model.CreateCompletionRequest
open OpenAPI.Model.CreateCompletionResponse
open OpenAPI.Model.CreateEditRequest
open OpenAPI.Model.CreateEditResponse
open OpenAPI.Model.CreateEmbeddingRequest
open OpenAPI.Model.CreateEmbeddingResponse
open OpenAPI.Model.CreateFineTuneRequest
open OpenAPI.Model.CreateImageRequest
open OpenAPI.Model.CreateModerationRequest
open OpenAPI.Model.CreateModerationResponse
open OpenAPI.Model.CreateTranscriptionRequestModel
open OpenAPI.Model.CreateTranscriptionResponse
open OpenAPI.Model.CreateTranslationResponse
open OpenAPI.Model.DeleteFileResponse
open OpenAPI.Model.DeleteModelResponse
open OpenAPI.Model.FineTune
open OpenAPI.Model.ImagesResponse
open OpenAPI.Model.ListFilesResponse
open OpenAPI.Model.ListFineTuneEventsResponse
open OpenAPI.Model.ListFineTunesResponse
open OpenAPI.Model.ListModelsResponse
open OpenAPI.Model.Model
open OpenAPI.Model.OpenAIFile
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module OpenAIApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CancelFineTune
    /// <summary>
    /// Immediately cancel a fine-tune job. 
    /// </summary>

    let CancelFineTune (pathParams:CancelFineTunePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : CancelFineTuneArgs
          let result = OpenAIApiService.CancelFineTune ctx serviceArgs
          return! (match result with
                      | CancelFineTuneStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateChatCompletion
    /// <summary>
    /// Creates a model response for the given chat conversation.
    /// </summary>

    let CreateChatCompletion  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateChatCompletionBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateChatCompletionArgs
          let result = OpenAIApiService.CreateChatCompletion ctx serviceArgs
          return! (match result with
                      | CreateChatCompletionStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateCompletion
    /// <summary>
    /// Creates a completion for the provided prompt and parameters.
    /// </summary>

    let CreateCompletion  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateCompletionBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateCompletionArgs
          let result = OpenAIApiService.CreateCompletion ctx serviceArgs
          return! (match result with
                      | CreateCompletionStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateEdit
    /// <summary>
    /// Creates a new edit for the provided input, instruction, and parameters.
    /// </summary>

    let CreateEdit  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateEditBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateEditArgs
          let result = OpenAIApiService.CreateEdit ctx serviceArgs
          return! (match result with
                      | CreateEditStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateEmbedding
    /// <summary>
    /// Creates an embedding vector representing the input text.
    /// </summary>

    let CreateEmbedding  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateEmbeddingBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateEmbeddingArgs
          let result = OpenAIApiService.CreateEmbedding ctx serviceArgs
          return! (match result with
                      | CreateEmbeddingStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateFile
    /// <summary>
    /// Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
    /// </summary>

    let CreateFile  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! formParams = ctx.TryBindFormAsync<CreateFileFormParams>()
          let serviceArgs = {   formParams=formParams;   } : CreateFileArgs
          let result = OpenAIApiService.CreateFile ctx serviceArgs
          return! (match result with
                      | CreateFileStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateFineTune
    /// <summary>
    /// Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    /// </summary>

    let CreateFineTune  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateFineTuneBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateFineTuneArgs
          let result = OpenAIApiService.CreateFineTune ctx serviceArgs
          return! (match result with
                      | CreateFineTuneStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

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
          let result = OpenAIApiService.CreateImage ctx serviceArgs
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
          let result = OpenAIApiService.CreateImageEdit ctx serviceArgs
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
          let result = OpenAIApiService.CreateImageVariation ctx serviceArgs
          return! (match result with
                      | CreateImageVariationStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateModeration
    /// <summary>
    /// Classifies if text violates OpenAI&#39;s Content Policy
    /// </summary>

    let CreateModeration  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateModerationBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateModerationArgs
          let result = OpenAIApiService.CreateModeration ctx serviceArgs
          return! (match result with
                      | CreateModerationStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateTranscription
    /// <summary>
    /// Transcribes audio into the input language.
    /// </summary>

    let CreateTranscription  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! formParams = ctx.TryBindFormAsync<CreateTranscriptionFormParams>()
          let serviceArgs = {   formParams=formParams;   } : CreateTranscriptionArgs
          let result = OpenAIApiService.CreateTranscription ctx serviceArgs
          return! (match result with
                      | CreateTranscriptionStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateTranslation
    /// <summary>
    /// Translates audio into English.
    /// </summary>

    let CreateTranslation  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! formParams = ctx.TryBindFormAsync<CreateTranslationFormParams>()
          let serviceArgs = {   formParams=formParams;   } : CreateTranslationArgs
          let result = OpenAIApiService.CreateTranslation ctx serviceArgs
          return! (match result with
                      | CreateTranslationStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteFile
    /// <summary>
    /// Delete a file.
    /// </summary>

    let DeleteFile (pathParams:DeleteFilePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteFileArgs
          let result = OpenAIApiService.DeleteFile ctx serviceArgs
          return! (match result with
                      | DeleteFileStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteModel
    /// <summary>
    /// Delete a fine-tuned model. You must have the Owner role in your organization.
    /// </summary>

    let DeleteModel (pathParams:DeleteModelPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteModelArgs
          let result = OpenAIApiService.DeleteModel ctx serviceArgs
          return! (match result with
                      | DeleteModelStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DownloadFile
    /// <summary>
    /// Returns the contents of the specified file
    /// </summary>

    let DownloadFile (pathParams:DownloadFilePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DownloadFileArgs
          let result = OpenAIApiService.DownloadFile ctx serviceArgs
          return! (match result with
                      | DownloadFileStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListFiles
    /// <summary>
    /// Returns a list of files that belong to the user&#39;s organization.
    /// </summary>

    let ListFiles  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = OpenAIApiService.ListFiles ctx 
          return! (match result with
                      | ListFilesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListFineTuneEvents
    /// <summary>
    /// Get fine-grained status updates for a fine-tune job. 
    /// </summary>

    let ListFineTuneEvents (pathParams:ListFineTuneEventsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListFineTuneEventsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ListFineTuneEventsArgs
          let result = OpenAIApiService.ListFineTuneEvents ctx serviceArgs
          return! (match result with
                      | ListFineTuneEventsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListFineTunes
    /// <summary>
    /// List your organization&#39;s fine-tuning jobs 
    /// </summary>

    let ListFineTunes  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = OpenAIApiService.ListFineTunes ctx 
          return! (match result with
                      | ListFineTunesStatusCode200 resolved ->
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
          let result = OpenAIApiService.ListModels ctx 
          return! (match result with
                      | ListModelsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RetrieveFile
    /// <summary>
    /// Returns information about a specific file.
    /// </summary>

    let RetrieveFile (pathParams:RetrieveFilePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RetrieveFileArgs
          let result = OpenAIApiService.RetrieveFile ctx serviceArgs
          return! (match result with
                      | RetrieveFileStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RetrieveFineTune
    /// <summary>
    /// Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    /// </summary>

    let RetrieveFineTune (pathParams:RetrieveFineTunePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RetrieveFineTuneArgs
          let result = OpenAIApiService.RetrieveFineTune ctx serviceArgs
          return! (match result with
                      | RetrieveFineTuneStatusCode200 resolved ->
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
          let result = OpenAIApiService.RetrieveModel ctx serviceArgs
          return! (match result with
                      | RetrieveModelStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

