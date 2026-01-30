namespace OpenAPI

open UsersApiHandlerParams
open UsersApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module UsersApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region DeleteUser
    /// <summary>
    /// Deletes a user from the organization.
    /// </summary>
   [<FunctionName("DeleteUser")>]
    let DeleteUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v1/organization/users/{user_id}")>]
        req:HttpRequest ) =

      let result = UsersApiService.DeleteUser ()
      match result with
      | DeleteUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListUsers
    /// <summary>
    /// Lists all of the users in the organization.
    /// </summary>
   [<FunctionName("ListUsers")>]
    let ListUsers
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/users")>]
        req:HttpRequest ) =

      let result = UsersApiService.ListUsers ()
      match result with
      | ListUsersStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ModifyUser
    /// <summary>
    /// Modifies a user&#39;s role in the organization.
    /// </summary>
   [<FunctionName("ModifyUser")>]
    let ModifyUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/organization/users/{user_id}")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<ModifyUserBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = UsersApiService.ModifyUser bodyParams
      match result with
      | ModifyUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region RetrieveUser
    /// <summary>
    /// Retrieves a user by their identifier.
    /// </summary>
   [<FunctionName("RetrieveUser")>]
    let RetrieveUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/users/{user_id}")>]
        req:HttpRequest ) =

      let result = UsersApiService.RetrieveUser ()
      match result with
      | RetrieveUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

