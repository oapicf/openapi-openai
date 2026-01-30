namespace OpenAPI
open InvitesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module InvitesApiServiceInterface =

    //#region Service interface
    type IInvitesApiService =
      abstract member DeleteInvite:HttpContext -> DeleteInviteArgs->DeleteInviteResult
      abstract member InviteUser:HttpContext -> InviteUserArgs->InviteUserResult
      abstract member ListInvites:HttpContext -> ListInvitesArgs->ListInvitesResult
      abstract member RetrieveInvite:HttpContext -> RetrieveInviteArgs->RetrieveInviteResult
    //#endregion