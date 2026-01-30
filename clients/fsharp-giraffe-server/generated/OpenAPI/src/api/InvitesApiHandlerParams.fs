namespace OpenAPI

open OpenAPI.Model.Invite
open OpenAPI.Model.InviteDeleteResponse
open OpenAPI.Model.InviteListResponse
open OpenAPI.Model.InviteRequest
open System.Collections.Generic
open System

module InvitesApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type DeleteInvitePathParams = {
      inviteId : string ;
    }
    //#endregion


    type DeleteInviteStatusCode200Response = {
      content:InviteDeleteResponse;
      
    }
    type DeleteInviteResult = DeleteInviteStatusCode200 of DeleteInviteStatusCode200Response

    type DeleteInviteArgs = {
      pathParams:DeleteInvitePathParams;
    }

    //#region Body parameters
    [<CLIMutable>]
    type InviteUserBodyParams = InviteRequest
    //#endregion


    type InviteUserStatusCode200Response = {
      content:Invite;
      
    }
    type InviteUserResult = InviteUserStatusCode200 of InviteUserStatusCode200Response

    type InviteUserArgs = {
      bodyParams:InviteUserBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type ListInvitesQueryParams = {
      limit : int option;


      after : string option;

    }
    //#endregion


    type ListInvitesStatusCode200Response = {
      content:InviteListResponse;
      
    }
    type ListInvitesResult = ListInvitesStatusCode200 of ListInvitesStatusCode200Response

    type ListInvitesArgs = {
      queryParams:Result<ListInvitesQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type RetrieveInvitePathParams = {
      inviteId : string ;
    }
    //#endregion


    type RetrieveInviteStatusCode200Response = {
      content:Invite;
      
    }
    type RetrieveInviteResult = RetrieveInviteStatusCode200 of RetrieveInviteStatusCode200Response

    type RetrieveInviteArgs = {
      pathParams:RetrieveInvitePathParams;
    }
