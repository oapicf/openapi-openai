namespace OpenAPI
open InvitesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module InvitesApiServiceInterface =

    //#region Service interface
    type IInvitesApiService =
      abstract member DeleteInvite : unit -> DeleteInviteResult
      abstract member InviteUser : InviteUserBodyParams -> InviteUserResult
      abstract member ListInvites : unit -> ListInvitesResult
      abstract member RetrieveInvite : unit -> RetrieveInviteResult
    //#endregion