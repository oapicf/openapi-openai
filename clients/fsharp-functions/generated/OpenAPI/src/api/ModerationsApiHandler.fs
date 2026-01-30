namespace OpenAPI

open ModerationsApiHandlerParams
open ModerationsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ModerationsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region CreateModeration
    /// <summary>
    /// Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
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
      let result = ModerationsApiService.CreateModeration bodyParams
      match result with
      | CreateModerationStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

