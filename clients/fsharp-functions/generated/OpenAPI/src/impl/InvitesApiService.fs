namespace OpenAPI
open OpenAPI.Model.Invite
open OpenAPI.Model.InviteDeleteResponse
open OpenAPI.Model.InviteListResponse
open OpenAPI.Model.InviteRequest
open InvitesApiHandlerParams
open InvitesApiServiceInterface
open System.Collections.Generic
open System

module InvitesApiServiceImplementation =

    //#region Service implementation
    type InvitesApiServiceImpl() =
      interface IInvitesApiService with

        member this.DeleteInvite () =
            let content = "Invite deleted successfully." :> obj :?> InviteDeleteResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeleteInviteStatusCode200 { content = content }

        member this.InviteUser (parameters:InviteUserBodyParams) =
            let content = "User invited successfully." :> obj :?> Invite // this cast is obviously wrong, and is only intended to allow generated project to compile   
            InviteUserStatusCode200 { content = content }

        member this.ListInvites () =
            let content = "Invites listed successfully." :> obj :?> InviteListResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ListInvitesStatusCode200 { content = content }

        member this.RetrieveInvite () =
            let content = "Invite retrieved successfully." :> obj :?> Invite // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RetrieveInviteStatusCode200 { content = content }

      //#endregion

    let InvitesApiService = InvitesApiServiceImpl() :> IInvitesApiService