namespace OpenAPI

open OpenAPI.Model.User
open OpenAPI.Model.UserDeleteResponse
open OpenAPI.Model.UserListResponse
open OpenAPI.Model.UserRoleUpdateRequest
open System.Collections.Generic
open System

module UsersApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type DeleteUserPathParams = {
      userId : string ;
    }
    //#endregion


    type DeleteUserStatusCode200Response = {
      content:UserDeleteResponse;
      
    }
    type DeleteUserResult = DeleteUserStatusCode200 of DeleteUserStatusCode200Response

    type DeleteUserArgs = {
      pathParams:DeleteUserPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ListUsersQueryParams = {
      limit : int option;


      after : string option;

    }
    //#endregion


    type ListUsersStatusCode200Response = {
      content:UserListResponse;
      
    }
    type ListUsersResult = ListUsersStatusCode200 of ListUsersStatusCode200Response

    type ListUsersArgs = {
      queryParams:Result<ListUsersQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ModifyUserPathParams = {
      userId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ModifyUserBodyParams = UserRoleUpdateRequest
    //#endregion


    type ModifyUserStatusCode200Response = {
      content:User;
      
    }
    type ModifyUserResult = ModifyUserStatusCode200 of ModifyUserStatusCode200Response

    type ModifyUserArgs = {
      pathParams:ModifyUserPathParams;
      bodyParams:ModifyUserBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type RetrieveUserPathParams = {
      userId : string ;
    }
    //#endregion


    type RetrieveUserStatusCode200Response = {
      content:User;
      
    }
    type RetrieveUserResult = RetrieveUserStatusCode200 of RetrieveUserStatusCode200Response

    type RetrieveUserArgs = {
      pathParams:RetrieveUserPathParams;
    }
