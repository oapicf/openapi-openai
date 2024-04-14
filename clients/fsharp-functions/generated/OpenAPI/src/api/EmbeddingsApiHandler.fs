namespace OpenAPI

open EmbeddingsApiHandlerParams
open EmbeddingsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module EmbeddingsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

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
      let result = EmbeddingsApiService.CreateEmbedding bodyParams
      match result with
      | CreateEmbeddingStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

