namespace OpenAPI

open CompletionsApiHandlerParams
open CompletionsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module CompletionsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

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
      let result = CompletionsApiService.CreateCompletion bodyParams
      match result with
      | CreateCompletionStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

