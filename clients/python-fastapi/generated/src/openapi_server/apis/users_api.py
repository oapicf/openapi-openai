# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.users_api_base import BaseUsersApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from pydantic import Field, StrictInt, StrictStr
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.user import User
from openapi_server.models.user_delete_response import UserDeleteResponse
from openapi_server.models.user_list_response import UserListResponse
from openapi_server.models.user_role_update_request import UserRoleUpdateRequest
from openapi_server.security_api import get_token_ApiKeyAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/organization/users",
    responses={
        200: {"model": UserListResponse, "description": "Users listed successfully."},
    },
    tags=["Users"],
    summary="Lists all of the users in the organization.",
    response_model_by_alias=True,
)
async def list_users(
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")] = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> UserListResponse:
    if not BaseUsersApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUsersApi.subclasses[0]().list_users(limit, after)


@router.get(
    "/organization/users/{user_id}",
    responses={
        200: {"model": User, "description": "User retrieved successfully."},
    },
    tags=["Users"],
    summary="Retrieves a user by their identifier.",
    response_model_by_alias=True,
)
async def retrieve_user(
    user_id: Annotated[StrictStr, Field(description="The ID of the user.")] = Path(..., description="The ID of the user."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> User:
    if not BaseUsersApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUsersApi.subclasses[0]().retrieve_user(user_id)


@router.post(
    "/organization/users/{user_id}",
    responses={
        200: {"model": User, "description": "User role updated successfully."},
    },
    tags=["Users"],
    summary="Modifies a user&#39;s role in the organization.",
    response_model_by_alias=True,
)
async def modify_user(
    user_id: Annotated[StrictStr, Field(description="The ID of the user.")] = Path(..., description="The ID of the user."),
    user_role_update_request: Annotated[UserRoleUpdateRequest, Field(description="The new user role to modify. This must be one of `owner` or `member`.")] = Body(None, description="The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> User:
    if not BaseUsersApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUsersApi.subclasses[0]().modify_user(user_id, user_role_update_request)


@router.delete(
    "/organization/users/{user_id}",
    responses={
        200: {"model": UserDeleteResponse, "description": "User deleted successfully."},
    },
    tags=["Users"],
    summary="Deletes a user from the organization.",
    response_model_by_alias=True,
)
async def delete_user(
    user_id: Annotated[StrictStr, Field(description="The ID of the user.")] = Path(..., description="The ID of the user."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> UserDeleteResponse:
    if not BaseUsersApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUsersApi.subclasses[0]().delete_user(user_id)
