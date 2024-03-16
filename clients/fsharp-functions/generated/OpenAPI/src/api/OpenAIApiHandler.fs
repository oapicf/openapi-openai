namespace OpenAPI

open OpenAIApiHandlerParams
open OpenAIApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module OpenAIApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region CancelFineTune
    /// <summary>
    /// Immediately cancel a fine-tune job. 
    /// </summary>
   [<FunctionName("CancelFineTune")>]
    let CancelFineTune
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/fine-tunes/{fine_tune_id}/cancel")>]
        req:HttpRequest ) =

      let result = OpenAIApiService.CancelFineTune ()
      match result with
      | CancelFineTuneStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateChatCompletion
    /// <summary>
    /// Creates a model response for the given chat conversation.
    /// </summary>
   [<FunctionName("CreateChatCompletion")>]
    let CreateChatCompletion
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/chat/completions")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateChatCompletionBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = OpenAIApiService.CreateChatCompletion bodyParams
      match result with
      | CreateChatCompletionStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateCompletion
    /// <summary>
    /// Creates a completion for the provided prompt and parameters.
    /// </summary>
   [<FunctionName("CreateCompletion")>]
    let CreateCompletion
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/completions")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateCompletionBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = OpenAIApiService.CreateCompletion bodyParams
      match result with
      | CreateCompletionStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateEdit
    /// <summary>
    /// Creates a new edit for the provided input, instruction, and parameters.
    /// </summary>
   [<FunctionName("CreateEdit")>]
    let CreateEdit
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/edits")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateEditBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = OpenAIApiService.CreateEdit bodyParams
      match result with
      | CreateEditStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateEmbedding
    /// <summary>
    /// Creates an embedding vector representing the input text.
    /// </summary>
   [<FunctionName("CreateEmbedding")>]
    let CreateEmbedding
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/embeddings")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateEmbeddingBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = OpenAIApiService.CreateEmbedding bodyParams
      match result with
      | CreateEmbeddingStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateFile
    /// <summary>
    /// Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
    /// </summary>
   [<FunctionName("CreateFile")>]
    let CreateFile
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/files")>]
        req:HttpRequest ) =

      let result = OpenAIApiService.CreateFile ()
      match result with
      | CreateFileStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateFineTune
    /// <summary>
    /// Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    /// </summary>
   [<FunctionName("CreateFineTune")>]
    let CreateFineTune
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/fine-tunes")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateFineTuneBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = OpenAIApiService.CreateFineTune bodyParams
      match result with
      | CreateFineTuneStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateImage
    /// <summary>
    /// Creates an image given a prompt.
    /// </summary>
   [<FunctionName("CreateImage")>]
    let CreateImage
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/images/generations")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateImageBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = OpenAIApiService.CreateImage bodyParams
      match result with
      | CreateImageStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateImageEdit
    /// <summary>
    /// Creates an edited or extended image given an original image and a prompt.
    /// </summary>
   [<FunctionName("CreateImageEdit")>]
    let CreateImageEdit
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/images/edits")>]
        req:HttpRequest ) =

      let result = OpenAIApiService.CreateImageEdit ()
      match result with
      | CreateImageEditStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateImageVariation
    /// <summary>
    /// Creates a variation of a given image.
    /// </summary>
   [<FunctionName("CreateImageVariation")>]
    let CreateImageVariation
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/images/variations")>]
        req:HttpRequest ) =

      let result = OpenAIApiService.CreateImageVariation ()
      match result with
      | CreateImageVariationStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateModeration
    /// <summary>
    /// Classifies if text violates OpenAI&#39;s Content Policy
    /// </summary>
   [<FunctionName("CreateModeration")>]
    let CreateModeration
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/moderations")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateModerationBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = OpenAIApiService.CreateModeration bodyParams
      match result with
      | CreateModerationStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateTranscription
    /// <summary>
    /// Transcribes audio into the input language.
    /// </summary>
   [<FunctionName("CreateTranscription")>]
    let CreateTranscription
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/audio/transcriptions")>]
        req:HttpRequest ) =

      let result = OpenAIApiService.CreateTranscription ()
      match result with
      | CreateTranscriptionStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateTranslation
    /// <summary>
    /// Translates audio into English.
    /// </summary>
   [<FunctionName("CreateTranslation")>]
    let CreateTranslation
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/audio/translations")>]
        req:HttpRequest ) =

      let result = OpenAIApiService.CreateTranslation ()
      match result with
      | CreateTranslationStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region DeleteFile
    /// <summary>
    /// Delete a file.
    /// </summary>
   [<FunctionName("DeleteFile")>]
    let DeleteFile
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v1/files/{file_id}")>]
        req:HttpRequest ) =

      let result = OpenAIApiService.DeleteFile ()
      match result with
      | DeleteFileStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region DeleteModel
    /// <summary>
    /// Delete a fine-tuned model. You must have the Owner role in your organization.
    /// </summary>
   [<FunctionName("DeleteModel")>]
    let DeleteModel
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v1/models/{model}")>]
        req:HttpRequest ) =

      let result = OpenAIApiService.DeleteModel ()
      match result with
      | DeleteModelStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region DownloadFile
    /// <summary>
    /// Returns the contents of the specified file
    /// </summary>
   [<FunctionName("DownloadFile")>]
    let DownloadFile
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/files/{file_id}/content")>]
        req:HttpRequest ) =

      let result = OpenAIApiService.DownloadFile ()
      match result with
      | DownloadFileStatusCode200 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListFiles
    /// <summary>
    /// Returns a list of files that belong to the user&#39;s organization.
    /// </summary>
   [<FunctionName("ListFiles")>]
    let ListFiles
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/files")>]
        req:HttpRequest ) =

      let result = OpenAIApiService.ListFiles ()
      match result with
      | ListFilesStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListFineTuneEvents
    /// <summary>
    /// Get fine-grained status updates for a fine-tune job. 
    /// </summary>
   [<FunctionName("ListFineTuneEvents")>]
    let ListFineTuneEvents
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/fine-tunes/{fine_tune_id}/events")>]
        req:HttpRequest ) =

      let result = OpenAIApiService.ListFineTuneEvents ()
      match result with
      | ListFineTuneEventsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListFineTunes
    /// <summary>
    /// List your organization&#39;s fine-tuning jobs 
    /// </summary>
   [<FunctionName("ListFineTunes")>]
    let ListFineTunes
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/fine-tunes")>]
        req:HttpRequest ) =

      let result = OpenAIApiService.ListFineTunes ()
      match result with
      | ListFineTunesStatusCode200 resolved ->
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

      let result = OpenAIApiService.ListModels ()
      match result with
      | ListModelsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region RetrieveFile
    /// <summary>
    /// Returns information about a specific file.
    /// </summary>
   [<FunctionName("RetrieveFile")>]
    let RetrieveFile
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/files/{file_id}")>]
        req:HttpRequest ) =

      let result = OpenAIApiService.RetrieveFile ()
      match result with
      | RetrieveFileStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region RetrieveFineTune
    /// <summary>
    /// Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    /// </summary>
   [<FunctionName("RetrieveFineTune")>]
    let RetrieveFineTune
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/fine-tunes/{fine_tune_id}")>]
        req:HttpRequest ) =

      let result = OpenAIApiService.RetrieveFineTune ()
      match result with
      | RetrieveFineTuneStatusCode200 resolved ->
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

      let result = OpenAIApiService.RetrieveModel ()
      match result with
      | RetrieveModelStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

