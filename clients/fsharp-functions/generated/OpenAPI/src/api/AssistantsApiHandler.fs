namespace OpenAPI

open AssistantsApiHandlerParams
open AssistantsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module AssistantsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region CancelRun
    /// <summary>
    /// Cancels a run that is &#x60;in_progress&#x60;.
    /// </summary>
   [<FunctionName("CancelRun")>]
    let CancelRun
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/threads/{thread_id}/runs/{run_id}/cancel")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.CancelRun ()
      match result with
      | CancelRunStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateAssistant
    /// <summary>
    /// Create an assistant with a model and instructions.
    /// </summary>
   [<FunctionName("CreateAssistant")>]
    let CreateAssistant
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/assistants")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateAssistantBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AssistantsApiService.CreateAssistant bodyParams
      match result with
      | CreateAssistantStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateAssistantFile
    /// <summary>
    /// Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
    /// </summary>
   [<FunctionName("CreateAssistantFile")>]
    let CreateAssistantFile
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/assistants/{assistant_id}/files")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateAssistantFileBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AssistantsApiService.CreateAssistantFile bodyParams
      match result with
      | CreateAssistantFileStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateMessage
    /// <summary>
    /// Create a message.
    /// </summary>
   [<FunctionName("CreateMessage")>]
    let CreateMessage
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/threads/{thread_id}/messages")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateMessageBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AssistantsApiService.CreateMessage bodyParams
      match result with
      | CreateMessageStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateRun
    /// <summary>
    /// Create a run.
    /// </summary>
   [<FunctionName("CreateRun")>]
    let CreateRun
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/threads/{thread_id}/runs")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateRunBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AssistantsApiService.CreateRun bodyParams
      match result with
      | CreateRunStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateThread
    /// <summary>
    /// Create a thread.
    /// </summary>
   [<FunctionName("CreateThread")>]
    let CreateThread
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/threads")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateThreadBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AssistantsApiService.CreateThread bodyParams
      match result with
      | CreateThreadStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateThreadAndRun
    /// <summary>
    /// Create a thread and run it in one request.
    /// </summary>
   [<FunctionName("CreateThreadAndRun")>]
    let CreateThreadAndRun
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/threads/runs")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateThreadAndRunBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AssistantsApiService.CreateThreadAndRun bodyParams
      match result with
      | CreateThreadAndRunStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region DeleteAssistant
    /// <summary>
    /// Delete an assistant.
    /// </summary>
   [<FunctionName("DeleteAssistant")>]
    let DeleteAssistant
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v1/assistants/{assistant_id}")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.DeleteAssistant ()
      match result with
      | DeleteAssistantStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region DeleteAssistantFile
    /// <summary>
    /// Delete an assistant file.
    /// </summary>
   [<FunctionName("DeleteAssistantFile")>]
    let DeleteAssistantFile
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v1/assistants/{assistant_id}/files/{file_id}")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.DeleteAssistantFile ()
      match result with
      | DeleteAssistantFileStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region DeleteThread
    /// <summary>
    /// Delete a thread.
    /// </summary>
   [<FunctionName("DeleteThread")>]
    let DeleteThread
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v1/threads/{thread_id}")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.DeleteThread ()
      match result with
      | DeleteThreadStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GetAssistant
    /// <summary>
    /// Retrieves an assistant.
    /// </summary>
   [<FunctionName("GetAssistant")>]
    let GetAssistant
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/assistants/{assistant_id}")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.GetAssistant ()
      match result with
      | GetAssistantStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GetAssistantFile
    /// <summary>
    /// Retrieves an AssistantFile.
    /// </summary>
   [<FunctionName("GetAssistantFile")>]
    let GetAssistantFile
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/assistants/{assistant_id}/files/{file_id}")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.GetAssistantFile ()
      match result with
      | GetAssistantFileStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GetMessage
    /// <summary>
    /// Retrieve a message.
    /// </summary>
   [<FunctionName("GetMessage")>]
    let GetMessage
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/threads/{thread_id}/messages/{message_id}")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.GetMessage ()
      match result with
      | GetMessageStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GetMessageFile
    /// <summary>
    /// Retrieves a message file.
    /// </summary>
   [<FunctionName("GetMessageFile")>]
    let GetMessageFile
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/threads/{thread_id}/messages/{message_id}/files/{file_id}")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.GetMessageFile ()
      match result with
      | GetMessageFileStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GetRun
    /// <summary>
    /// Retrieves a run.
    /// </summary>
   [<FunctionName("GetRun")>]
    let GetRun
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/threads/{thread_id}/runs/{run_id}")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.GetRun ()
      match result with
      | GetRunStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GetRunStep
    /// <summary>
    /// Retrieves a run step.
    /// </summary>
   [<FunctionName("GetRunStep")>]
    let GetRunStep
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.GetRunStep ()
      match result with
      | GetRunStepStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GetThread
    /// <summary>
    /// Retrieves a thread.
    /// </summary>
   [<FunctionName("GetThread")>]
    let GetThread
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/threads/{thread_id}")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.GetThread ()
      match result with
      | GetThreadStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListAssistantFiles
    /// <summary>
    /// Returns a list of assistant files.
    /// </summary>
   [<FunctionName("ListAssistantFiles")>]
    let ListAssistantFiles
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/assistants/{assistant_id}/files")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.ListAssistantFiles ()
      match result with
      | ListAssistantFilesStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListAssistants
    /// <summary>
    /// Returns a list of assistants.
    /// </summary>
   [<FunctionName("ListAssistants")>]
    let ListAssistants
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/assistants")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.ListAssistants ()
      match result with
      | ListAssistantsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListMessageFiles
    /// <summary>
    /// Returns a list of message files.
    /// </summary>
   [<FunctionName("ListMessageFiles")>]
    let ListMessageFiles
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/threads/{thread_id}/messages/{message_id}/files")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.ListMessageFiles ()
      match result with
      | ListMessageFilesStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListMessages
    /// <summary>
    /// Returns a list of messages for a given thread.
    /// </summary>
   [<FunctionName("ListMessages")>]
    let ListMessages
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/threads/{thread_id}/messages")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.ListMessages ()
      match result with
      | ListMessagesStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListRunSteps
    /// <summary>
    /// Returns a list of run steps belonging to a run.
    /// </summary>
   [<FunctionName("ListRunSteps")>]
    let ListRunSteps
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/threads/{thread_id}/runs/{run_id}/steps")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.ListRunSteps ()
      match result with
      | ListRunStepsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListRuns
    /// <summary>
    /// Returns a list of runs belonging to a thread.
    /// </summary>
   [<FunctionName("ListRuns")>]
    let ListRuns
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/threads/{thread_id}/runs")>]
        req:HttpRequest ) =

      let result = AssistantsApiService.ListRuns ()
      match result with
      | ListRunsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ModifyAssistant
    /// <summary>
    /// Modifies an assistant.
    /// </summary>
   [<FunctionName("ModifyAssistant")>]
    let ModifyAssistant
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/assistants/{assistant_id}")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<ModifyAssistantBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AssistantsApiService.ModifyAssistant bodyParams
      match result with
      | ModifyAssistantStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ModifyMessage
    /// <summary>
    /// Modifies a message.
    /// </summary>
   [<FunctionName("ModifyMessage")>]
    let ModifyMessage
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/threads/{thread_id}/messages/{message_id}")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<ModifyMessageBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AssistantsApiService.ModifyMessage bodyParams
      match result with
      | ModifyMessageStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ModifyRun
    /// <summary>
    /// Modifies a run.
    /// </summary>
   [<FunctionName("ModifyRun")>]
    let ModifyRun
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/threads/{thread_id}/runs/{run_id}")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<ModifyRunBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AssistantsApiService.ModifyRun bodyParams
      match result with
      | ModifyRunStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ModifyThread
    /// <summary>
    /// Modifies a thread.
    /// </summary>
   [<FunctionName("ModifyThread")>]
    let ModifyThread
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/threads/{thread_id}")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<ModifyThreadBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AssistantsApiService.ModifyThread bodyParams
      match result with
      | ModifyThreadStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region SubmitToolOuputsToRun
    /// <summary>
    /// When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
    /// </summary>
   [<FunctionName("SubmitToolOuputsToRun")>]
    let SubmitToolOuputsToRun
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<SubmitToolOuputsToRunBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AssistantsApiService.SubmitToolOuputsToRun bodyParams
      match result with
      | SubmitToolOuputsToRunStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

