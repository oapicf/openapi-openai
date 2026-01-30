namespace OpenAPI

open UsageApiHandlerParams
open UsageApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module UsageApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region UsageAudioSpeeches
    /// <summary>
    /// Get audio speeches usage details for the organization.
    /// </summary>
   [<FunctionName("UsageAudioSpeeches")>]
    let UsageAudioSpeeches
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/usage/audio_speeches")>]
        req:HttpRequest ) =

      let result = UsageApiService.UsageAudioSpeeches ()
      match result with
      | UsageAudioSpeechesStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region UsageAudioTranscriptions
    /// <summary>
    /// Get audio transcriptions usage details for the organization.
    /// </summary>
   [<FunctionName("UsageAudioTranscriptions")>]
    let UsageAudioTranscriptions
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/usage/audio_transcriptions")>]
        req:HttpRequest ) =

      let result = UsageApiService.UsageAudioTranscriptions ()
      match result with
      | UsageAudioTranscriptionsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region UsageCodeInterpreterSessions
    /// <summary>
    /// Get code interpreter sessions usage details for the organization.
    /// </summary>
   [<FunctionName("UsageCodeInterpreterSessions")>]
    let UsageCodeInterpreterSessions
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/usage/code_interpreter_sessions")>]
        req:HttpRequest ) =

      let result = UsageApiService.UsageCodeInterpreterSessions ()
      match result with
      | UsageCodeInterpreterSessionsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region UsageCompletions
    /// <summary>
    /// Get completions usage details for the organization.
    /// </summary>
   [<FunctionName("UsageCompletions")>]
    let UsageCompletions
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/usage/completions")>]
        req:HttpRequest ) =

      let result = UsageApiService.UsageCompletions ()
      match result with
      | UsageCompletionsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region UsageCosts
    /// <summary>
    /// Get costs details for the organization.
    /// </summary>
   [<FunctionName("UsageCosts")>]
    let UsageCosts
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/costs")>]
        req:HttpRequest ) =

      let result = UsageApiService.UsageCosts ()
      match result with
      | UsageCostsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region UsageEmbeddings
    /// <summary>
    /// Get embeddings usage details for the organization.
    /// </summary>
   [<FunctionName("UsageEmbeddings")>]
    let UsageEmbeddings
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/usage/embeddings")>]
        req:HttpRequest ) =

      let result = UsageApiService.UsageEmbeddings ()
      match result with
      | UsageEmbeddingsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region UsageImages
    /// <summary>
    /// Get images usage details for the organization.
    /// </summary>
   [<FunctionName("UsageImages")>]
    let UsageImages
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/usage/images")>]
        req:HttpRequest ) =

      let result = UsageApiService.UsageImages ()
      match result with
      | UsageImagesStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region UsageModerations
    /// <summary>
    /// Get moderations usage details for the organization.
    /// </summary>
   [<FunctionName("UsageModerations")>]
    let UsageModerations
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/usage/moderations")>]
        req:HttpRequest ) =

      let result = UsageApiService.UsageModerations ()
      match result with
      | UsageModerationsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region UsageVectorStores
    /// <summary>
    /// Get vector stores usage details for the organization.
    /// </summary>
   [<FunctionName("UsageVectorStores")>]
    let UsageVectorStores
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/usage/vector_stores")>]
        req:HttpRequest ) =

      let result = UsageApiService.UsageVectorStores ()
      match result with
      | UsageVectorStoresStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

