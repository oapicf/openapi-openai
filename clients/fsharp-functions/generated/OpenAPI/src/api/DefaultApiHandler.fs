namespace OpenAPI

open DefaultApiHandlerParams
open DefaultApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module DefaultApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region AdminApiKeysCreate
    /// <summary>
    /// Create an organization admin API key
    /// </summary>
   [<FunctionName("AdminApiKeysCreate")>]
    let AdminApiKeysCreate
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/organization/admin_api_keys")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<AdminApiKeysCreateBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = DefaultApiService.AdminApiKeysCreate bodyParams
      match result with
      | AdminApiKeysCreateStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region AdminApiKeysDelete
    /// <summary>
    /// Delete an organization admin API key
    /// </summary>
   [<FunctionName("AdminApiKeysDelete")>]
    let AdminApiKeysDelete
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v1/organization/admin_api_keys/{key_id}")>]
        req:HttpRequest ) =

      let result = DefaultApiService.AdminApiKeysDelete ()
      match result with
      | AdminApiKeysDeleteStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region AdminApiKeysGet
    /// <summary>
    /// Retrieve a single organization API key
    /// </summary>
   [<FunctionName("AdminApiKeysGet")>]
    let AdminApiKeysGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/admin_api_keys/{key_id}")>]
        req:HttpRequest ) =

      let result = DefaultApiService.AdminApiKeysGet ()
      match result with
      | AdminApiKeysGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region AdminApiKeysList
    /// <summary>
    /// List organization API keys
    /// </summary>
   [<FunctionName("AdminApiKeysList")>]
    let AdminApiKeysList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/admin_api_keys")>]
        req:HttpRequest ) =

      let result = DefaultApiService.AdminApiKeysList ()
      match result with
      | AdminApiKeysListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

