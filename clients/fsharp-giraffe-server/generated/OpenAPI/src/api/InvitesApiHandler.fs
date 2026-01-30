namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open InvitesApiHandlerParams
open InvitesApiServiceInterface
open InvitesApiServiceImplementation
open OpenAPI.Model.Invite
open OpenAPI.Model.InviteDeleteResponse
open OpenAPI.Model.InviteListResponse
open OpenAPI.Model.InviteRequest

module InvitesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region DeleteInvite
    /// <summary>
    /// Delete an invite. If the invite has already been accepted, it cannot be deleted.
    /// </summary>

    let DeleteInvite (pathParams:DeleteInvitePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : DeleteInviteArgs
          let result = InvitesApiService.DeleteInvite ctx serviceArgs
          return! (match result with
                      | DeleteInviteStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region InviteUser
    /// <summary>
    /// Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
    /// </summary>

    let InviteUser  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<InviteUserBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : InviteUserArgs
          let result = InvitesApiService.InviteUser ctx serviceArgs
          return! (match result with
                      | InviteUserStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ListInvites
    /// <summary>
    /// Returns a list of invites in the organization.
    /// </summary>

    let ListInvites  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ListInvitesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ListInvitesArgs
          let result = InvitesApiService.ListInvites ctx serviceArgs
          return! (match result with
                      | ListInvitesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RetrieveInvite
    /// <summary>
    /// Retrieves an invite.
    /// </summary>

    let RetrieveInvite (pathParams:RetrieveInvitePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RetrieveInviteArgs
          let result = InvitesApiService.RetrieveInvite ctx serviceArgs
          return! (match result with
                      | RetrieveInviteStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

