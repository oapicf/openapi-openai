namespace OpenAPI

open InvitesApiHandlerParams
open InvitesApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module InvitesApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region DeleteInvite
    /// <summary>
    /// Delete an invite. If the invite has already been accepted, it cannot be deleted.
    /// </summary>
   [<FunctionName("DeleteInvite")>]
    let DeleteInvite
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v1/organization/invites/{invite_id}")>]
        req:HttpRequest ) =

      let result = InvitesApiService.DeleteInvite ()
      match result with
      | DeleteInviteStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region InviteUser
    /// <summary>
    /// Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
    /// </summary>
   [<FunctionName("InviteUser")>]
    let InviteUser
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/organization/invites")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<InviteUserBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = InvitesApiService.InviteUser bodyParams
      match result with
      | InviteUserStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListInvites
    /// <summary>
    /// Returns a list of invites in the organization.
    /// </summary>
   [<FunctionName("ListInvites")>]
    let ListInvites
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/invites")>]
        req:HttpRequest ) =

      let result = InvitesApiService.ListInvites ()
      match result with
      | ListInvitesStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region RetrieveInvite
    /// <summary>
    /// Retrieves an invite.
    /// </summary>
   [<FunctionName("RetrieveInvite")>]
    let RetrieveInvite
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/organization/invites/{invite_id}")>]
        req:HttpRequest ) =

      let result = InvitesApiService.RetrieveInvite ()
      match result with
      | RetrieveInviteStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

