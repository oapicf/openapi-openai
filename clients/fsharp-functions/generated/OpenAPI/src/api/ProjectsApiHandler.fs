namespace OpenAPI

open ProjectsApiHandlerParams
open ProjectsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ProjectsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region ArchiveProject
    /// <summary>
    /// Archives a project in the organization. Archived projects cannot be used or updated.
    /// </summary>
   [<FunctionName("ArchiveProject")>]
    let ArchiveProject
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/organization/projects/{project_id}/archive")>]
        req:HttpRequest ) =

      let result = ProjectsApiService.ArchiveProject ()
      match result with
      | ArchiveProjectStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateProject
    /// <summary>
    /// Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
    /// </summary>
   [<FunctionName("CreateProject")>]
    let CreateProject
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/organization/projects")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateProjectBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = ProjectsApiService.CreateProject bodyParams
      match result with
      | CreateProjectStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateProjectServiceAccount
    /// <summary>
    /// Creates a new service account in the project. This also returns an unredacted API key for the service account.
    /// </summary>
   [<FunctionName("CreateProjectServiceAccount")>]
    let CreateProjectServiceAccount
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/organization/projects/{project_id}/service_accounts")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateProjectServiceAccountBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = ProjectsApiService.CreateProjectServiceAccount bodyParams
      match result with
      | CreateProjectServiceAccountStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | CreateProjectServiceAccountStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))

    //#region CreateProjectUser
    /// <summary>
    /// Adds a user to the project. Users must already be members of the organization to be added to a project.
    /// </summary>
   [<FunctionName("CreateProjectUser")>]
    let CreateProjectUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/organization/projects/{project_id}/users")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateProjectUserBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = ProjectsApiService.CreateProjectUser bodyParams
      match result with
      | CreateProjectUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | CreateProjectUserStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))

    //#region DeleteProjectApiKey
    /// <summary>
    /// Deletes an API key from the project.
    /// </summary>
   [<FunctionName("DeleteProjectApiKey")>]
    let DeleteProjectApiKey
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v1/organization/projects/{project_id}/api_keys/{key_id}")>]
        req:HttpRequest ) =

      let result = ProjectsApiService.DeleteProjectApiKey ()
      match result with
      | DeleteProjectApiKeyStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | DeleteProjectApiKeyStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))

    //#region DeleteProjectServiceAccount
    /// <summary>
    /// Deletes a service account from the project.
    /// </summary>
   [<FunctionName("DeleteProjectServiceAccount")>]
    let DeleteProjectServiceAccount
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v1/organization/projects/{project_id}/service_accounts/{service_account_id}")>]
        req:HttpRequest ) =

      let result = ProjectsApiService.DeleteProjectServiceAccount ()
      match result with
      | DeleteProjectServiceAccountStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region DeleteProjectUser
    /// <summary>
    /// Deletes a user from the project.
    /// </summary>
   [<FunctionName("DeleteProjectUser")>]
    let DeleteProjectUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v1/organization/projects/{project_id}/users/{user_id}")>]
        req:HttpRequest ) =

      let result = ProjectsApiService.DeleteProjectUser ()
      match result with
      | DeleteProjectUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | DeleteProjectUserStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))

    //#region ListProjectApiKeys
    /// <summary>
    /// Returns a list of API keys in the project.
    /// </summary>
   [<FunctionName("ListProjectApiKeys")>]
    let ListProjectApiKeys
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/projects/{project_id}/api_keys")>]
        req:HttpRequest ) =

      let result = ProjectsApiService.ListProjectApiKeys ()
      match result with
      | ListProjectApiKeysStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListProjectRateLimits
    /// <summary>
    /// Returns the rate limits per model for a project.
    /// </summary>
   [<FunctionName("ListProjectRateLimits")>]
    let ListProjectRateLimits
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/projects/{project_id}/rate_limits")>]
        req:HttpRequest ) =

      let result = ProjectsApiService.ListProjectRateLimits ()
      match result with
      | ListProjectRateLimitsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListProjectServiceAccounts
    /// <summary>
    /// Returns a list of service accounts in the project.
    /// </summary>
   [<FunctionName("ListProjectServiceAccounts")>]
    let ListProjectServiceAccounts
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/projects/{project_id}/service_accounts")>]
        req:HttpRequest ) =

      let result = ProjectsApiService.ListProjectServiceAccounts ()
      match result with
      | ListProjectServiceAccountsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | ListProjectServiceAccountsStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))

    //#region ListProjectUsers
    /// <summary>
    /// Returns a list of users in the project.
    /// </summary>
   [<FunctionName("ListProjectUsers")>]
    let ListProjectUsers
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/projects/{project_id}/users")>]
        req:HttpRequest ) =

      let result = ProjectsApiService.ListProjectUsers ()
      match result with
      | ListProjectUsersStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | ListProjectUsersStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))

    //#region ListProjects
    /// <summary>
    /// Returns a list of projects.
    /// </summary>
   [<FunctionName("ListProjects")>]
    let ListProjects
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/projects")>]
        req:HttpRequest ) =

      let result = ProjectsApiService.ListProjects ()
      match result with
      | ListProjectsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ModifyProject
    /// <summary>
    /// Modifies a project in the organization.
    /// </summary>
   [<FunctionName("ModifyProject")>]
    let ModifyProject
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/organization/projects/{project_id}")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<ModifyProjectBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = ProjectsApiService.ModifyProject bodyParams
      match result with
      | ModifyProjectStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | ModifyProjectStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))

    //#region ModifyProjectUser
    /// <summary>
    /// Modifies a user&#39;s role in the project.
    /// </summary>
   [<FunctionName("ModifyProjectUser")>]
    let ModifyProjectUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/organization/projects/{project_id}/users/{user_id}")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<ModifyProjectUserBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = ProjectsApiService.ModifyProjectUser bodyParams
      match result with
      | ModifyProjectUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | ModifyProjectUserStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))

    //#region RetrieveProject
    /// <summary>
    /// Retrieves a project.
    /// </summary>
   [<FunctionName("RetrieveProject")>]
    let RetrieveProject
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/projects/{project_id}")>]
        req:HttpRequest ) =

      let result = ProjectsApiService.RetrieveProject ()
      match result with
      | RetrieveProjectStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region RetrieveProjectApiKey
    /// <summary>
    /// Retrieves an API key in the project.
    /// </summary>
   [<FunctionName("RetrieveProjectApiKey")>]
    let RetrieveProjectApiKey
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/projects/{project_id}/api_keys/{key_id}")>]
        req:HttpRequest ) =

      let result = ProjectsApiService.RetrieveProjectApiKey ()
      match result with
      | RetrieveProjectApiKeyStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region RetrieveProjectServiceAccount
    /// <summary>
    /// Retrieves a service account in the project.
    /// </summary>
   [<FunctionName("RetrieveProjectServiceAccount")>]
    let RetrieveProjectServiceAccount
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/projects/{project_id}/service_accounts/{service_account_id}")>]
        req:HttpRequest ) =

      let result = ProjectsApiService.RetrieveProjectServiceAccount ()
      match result with
      | RetrieveProjectServiceAccountStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region RetrieveProjectUser
    /// <summary>
    /// Retrieves a user in the project.
    /// </summary>
   [<FunctionName("RetrieveProjectUser")>]
    let RetrieveProjectUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/projects/{project_id}/users/{user_id}")>]
        req:HttpRequest ) =

      let result = ProjectsApiService.RetrieveProjectUser ()
      match result with
      | RetrieveProjectUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region UpdateProjectRateLimits
    /// <summary>
    /// Updates a project rate limit.
    /// </summary>
   [<FunctionName("UpdateProjectRateLimits")>]
    let UpdateProjectRateLimits
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/organization/projects/{project_id}/rate_limits/{rate_limit_id}")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<UpdateProjectRateLimitsBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = ProjectsApiService.UpdateProjectRateLimits bodyParams
      match result with
      | UpdateProjectRateLimitsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | UpdateProjectRateLimitsStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))

