namespace OpenAPI

open ChatApiHandlerParams
open ChatApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ChatApiHandlers =

    /// <summary>
    /// 
    /// </summary>

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
      let result = ChatApiService.CreateChatCompletion bodyParams
      match result with
      | CreateChatCompletionStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

