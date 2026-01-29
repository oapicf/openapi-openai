namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open AssistantsApiHandlerParams
open AssistantsApiServiceInterface
open AssistantsApiServiceImplementation
open OpenAPI.Model.AssistantFileObject
open OpenAPI.Model.AssistantObject
open OpenAPI.Model.CreateAssistantFileRequest
open OpenAPI.Model.CreateAssistantRequest
open OpenAPI.Model.CreateMessageRequest
open OpenAPI.Model.CreateRunRequest
open OpenAPI.Model.CreateThreadAndRunRequest
open OpenAPI.Model.CreateThreadRequest
open OpenAPI.Model.DeleteAssistantFileResponse
open OpenAPI.Model.DeleteAssistantResponse
open OpenAPI.Model.DeleteThreadResponse
open OpenAPI.Model.ListAssistantFilesResponse
open OpenAPI.Model.ListAssistantsResponse
open OpenAPI.Model.ListMessageFilesResponse
open OpenAPI.Model.ListMessagesResponse
open OpenAPI.Model.ListRunStepsResponse
open OpenAPI.Model.ListRunsResponse
open OpenAPI.Model.MessageFileObject
open OpenAPI.Model.MessageObject
open OpenAPI.Model.ModifyAssistantRequest
open OpenAPI.Model.ModifyMessageRequest
open OpenAPI.Model.ModifyRunRequest
open OpenAPI.Model.ModifyThreadRequest
open OpenAPI.Model.RunObject
open OpenAPI.Model.RunStepObject
open OpenAPI.Model.SubmitToolOutputsRunRequest
open OpenAPI.Model.ThreadObject

module AssistantsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CancelRun
    /// <summary>
    /// Cancels a run that is &#x60;in_progress&#x60;.
    /// </summary>

    let CancelRun (pathParams:CancelRunPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : CancelRunArgs
          let result = AssistantsApiService.CancelRun ctx serviceArgs
          return! (match result with
                      | CancelRunStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateAssistant
    /// <summary>
    /// Create an assistant with a model and instructions.
    /// </summary>

    let CreateAssistant  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateAssistantBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateAssistantArgs
          let result = AssistantsApiService.CreateAssistant ctx serviceArgs
          return! (match result with
                      | CreateAssistantStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateAssistantFile
    /// <summary>
    /// Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
    /// </summary>

    let CreateAssistantFile (pathParams:CreateAssistantFilePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateAssistantFileBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CreateAssistantFileArgs
          let result = AssistantsApiService.CreateAssistantFile ctx serviceArgs
          return! (match result with
                      | CreateAssistantFileStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateMessage
    /// <summary>
    /// Create a message.
    /// </summary>

    let CreateMessage (pathParams:CreateMessagePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateMessageBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CreateMessageArgs
          let result = AssistantsApiService.CreateMessage ctx serviceArgs
          return! (match result with
                      | CreateMessageStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateRun
    /// <summary>
    /// Create a run.
    /// </summary>

    let CreateRun (pathParams:CreateRunPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateRunBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CreateRunArgs
          let result = AssistantsApiService.CreateRun ctx serviceArgs
          return! (match result with
                      | CreateRunStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateThread
    /// <summary>
    /// Create a thread.
    /// </summary>

    let CreateThread  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateThreadBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateThreadArgs
          let result = AssistantsApiService.CreateThread ctx serviceArgs
          return! (match result with
                      | CreateThreadStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateThreadAndRun
    /// <summary>
    /// Create a thread and run it in one request.
    /// </summary>

    let CreateThreadAndRun  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateThreadAndRunBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CreateThreadAndRunArgs
          let result = AssistantsApiService.CreateThreadAndRun ctx serviceArgs
          return! (match result with
                      | CreateThreadAndRunStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteAssistant
    /// <summary>
    /// Delete an assistant.
    /// </summary>

    let DeleteAssistant (pathParams:DeleteAssistantPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteAssistantArgs
          let result = AssistantsApiService.DeleteAssistant ctx serviceArgs
          return! (match result with
                      | DeleteAssistantStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteAssistantFile
    /// <summary>
    /// Delete an assistant file.
    /// </summary>

    let DeleteAssistantFile (pathParams:DeleteAssistantFilePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteAssistantFileArgs
          let result = AssistantsApiService.DeleteAssistantFile ctx serviceArgs
          return! (match result with
                      | DeleteAssistantFileStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteThread
    /// <summary>
    /// Delete a thread.
    /// </summary>

    let DeleteThread (pathParams:DeleteThreadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteThreadArgs
          let result = AssistantsApiService.DeleteThread ctx serviceArgs
          return! (match result with
                      | DeleteThreadStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetAssistant
    /// <summary>
    /// Retrieves an assistant.
    /// </summary>

    let GetAssistant (pathParams:GetAssistantPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetAssistantArgs
          let result = AssistantsApiService.GetAssistant ctx serviceArgs
          return! (match result with
                      | GetAssistantStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetAssistantFile
    /// <summary>
    /// Retrieves an AssistantFile.
    /// </summary>

    let GetAssistantFile (pathParams:GetAssistantFilePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetAssistantFileArgs
          let result = AssistantsApiService.GetAssistantFile ctx serviceArgs
          return! (match result with
                      | GetAssistantFileStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetMessage
    /// <summary>
    /// Retrieve a message.
    /// </summary>

    let GetMessage (pathParams:GetMessagePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetMessageArgs
          let result = AssistantsApiService.GetMessage ctx serviceArgs
          return! (match result with
                      | GetMessageStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetMessageFile
    /// <summary>
    /// Retrieves a message file.
    /// </summary>

    let GetMessageFile (pathParams:GetMessageFilePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetMessageFileArgs
          let result = AssistantsApiService.GetMessageFile ctx serviceArgs
          return! (match result with
                      | GetMessageFileStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetRun
    /// <summary>
    /// Retrieves a run.
    /// </summary>

    let GetRun (pathParams:GetRunPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetRunArgs
          let result = AssistantsApiService.GetRun ctx serviceArgs
          return! (match result with
                      | GetRunStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetRunStep
    /// <summary>
    /// Retrieves a run step.
    /// </summary>

    let GetRunStep (pathParams:GetRunStepPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetRunStepArgs
          let result = AssistantsApiService.GetRunStep ctx serviceArgs
          return! (match result with
                      | GetRunStepStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetThread
    /// <summary>
    /// Retrieves a thread.
    /// </summary>

    let GetThread (pathParams:GetThreadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetThreadArgs
          let result = AssistantsApiService.GetThread ctx serviceArgs
          return! (match result with
                      | GetThreadStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListAssistantFiles
    /// <summary>
    /// Returns a list of assistant files.
    /// </summary>

    let ListAssistantFiles (pathParams:ListAssistantFilesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListAssistantFilesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ListAssistantFilesArgs
          let result = AssistantsApiService.ListAssistantFiles ctx serviceArgs
          return! (match result with
                      | ListAssistantFilesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListAssistants
    /// <summary>
    /// Returns a list of assistants.
    /// </summary>

    let ListAssistants  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListAssistantsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ListAssistantsArgs
          let result = AssistantsApiService.ListAssistants ctx serviceArgs
          return! (match result with
                      | ListAssistantsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListMessageFiles
    /// <summary>
    /// Returns a list of message files.
    /// </summary>

    let ListMessageFiles (pathParams:ListMessageFilesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListMessageFilesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ListMessageFilesArgs
          let result = AssistantsApiService.ListMessageFiles ctx serviceArgs
          return! (match result with
                      | ListMessageFilesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListMessages
    /// <summary>
    /// Returns a list of messages for a given thread.
    /// </summary>

    let ListMessages (pathParams:ListMessagesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListMessagesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ListMessagesArgs
          let result = AssistantsApiService.ListMessages ctx serviceArgs
          return! (match result with
                      | ListMessagesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListRunSteps
    /// <summary>
    /// Returns a list of run steps belonging to a run.
    /// </summary>

    let ListRunSteps (pathParams:ListRunStepsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListRunStepsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ListRunStepsArgs
          let result = AssistantsApiService.ListRunSteps ctx serviceArgs
          return! (match result with
                      | ListRunStepsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListRuns
    /// <summary>
    /// Returns a list of runs belonging to a thread.
    /// </summary>

    let ListRuns (pathParams:ListRunsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListRunsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ListRunsArgs
          let result = AssistantsApiService.ListRuns ctx serviceArgs
          return! (match result with
                      | ListRunsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ModifyAssistant
    /// <summary>
    /// Modifies an assistant.
    /// </summary>

    let ModifyAssistant (pathParams:ModifyAssistantPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ModifyAssistantBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ModifyAssistantArgs
          let result = AssistantsApiService.ModifyAssistant ctx serviceArgs
          return! (match result with
                      | ModifyAssistantStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ModifyMessage
    /// <summary>
    /// Modifies a message.
    /// </summary>

    let ModifyMessage (pathParams:ModifyMessagePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ModifyMessageBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ModifyMessageArgs
          let result = AssistantsApiService.ModifyMessage ctx serviceArgs
          return! (match result with
                      | ModifyMessageStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ModifyRun
    /// <summary>
    /// Modifies a run.
    /// </summary>

    let ModifyRun (pathParams:ModifyRunPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ModifyRunBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ModifyRunArgs
          let result = AssistantsApiService.ModifyRun ctx serviceArgs
          return! (match result with
                      | ModifyRunStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ModifyThread
    /// <summary>
    /// Modifies a thread.
    /// </summary>

    let ModifyThread (pathParams:ModifyThreadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ModifyThreadBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ModifyThreadArgs
          let result = AssistantsApiService.ModifyThread ctx serviceArgs
          return! (match result with
                      | ModifyThreadStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SubmitToolOuputsToRun
    /// <summary>
    /// When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
    /// </summary>

    let SubmitToolOuputsToRun (pathParams:SubmitToolOuputsToRunPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SubmitToolOuputsToRunBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SubmitToolOuputsToRunArgs
          let result = AssistantsApiService.SubmitToolOuputsToRun ctx serviceArgs
          return! (match result with
                      | SubmitToolOuputsToRunStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

