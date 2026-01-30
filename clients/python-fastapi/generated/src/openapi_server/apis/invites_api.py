# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.invites_api_base import BaseInvitesApi
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
from openapi_server.models.invite import Invite
from openapi_server.models.invite_delete_response import InviteDeleteResponse
from openapi_server.models.invite_list_response import InviteListResponse
from openapi_server.models.invite_request import InviteRequest
from openapi_server.security_api import get_token_ApiKeyAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/organization/invites",
    responses={
        200: {"model": InviteListResponse, "description": "Invites listed successfully."},
    },
    tags=["Invites"],
    summary="Returns a list of invites in the organization.",
    response_model_by_alias=True,
)
async def list_invites(
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")] = Query(20, description="A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", alias="limit"),
    after: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")] = Query(None, description="A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ", alias="after"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> InviteListResponse:
    if not BaseInvitesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseInvitesApi.subclasses[0]().list_invites(limit, after)


@router.post(
    "/organization/invites",
    responses={
        200: {"model": Invite, "description": "User invited successfully."},
    },
    tags=["Invites"],
    summary="Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.",
    response_model_by_alias=True,
)
async def invite_user(
    invite_request: Annotated[InviteRequest, Field(description="The invite request payload.")] = Body(None, description="The invite request payload."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> Invite:
    if not BaseInvitesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseInvitesApi.subclasses[0]().invite_user(invite_request)


@router.get(
    "/organization/invites/{invite_id}",
    responses={
        200: {"model": Invite, "description": "Invite retrieved successfully."},
    },
    tags=["Invites"],
    summary="Retrieves an invite.",
    response_model_by_alias=True,
)
async def retrieve_invite(
    invite_id: Annotated[StrictStr, Field(description="The ID of the invite to retrieve.")] = Path(..., description="The ID of the invite to retrieve."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> Invite:
    if not BaseInvitesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseInvitesApi.subclasses[0]().retrieve_invite(invite_id)


@router.delete(
    "/organization/invites/{invite_id}",
    responses={
        200: {"model": InviteDeleteResponse, "description": "Invite deleted successfully."},
    },
    tags=["Invites"],
    summary="Delete an invite. If the invite has already been accepted, it cannot be deleted.",
    response_model_by_alias=True,
)
async def delete_invite(
    invite_id: Annotated[StrictStr, Field(description="The ID of the invite to delete.")] = Path(..., description="The ID of the invite to delete."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> InviteDeleteResponse:
    if not BaseInvitesApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseInvitesApi.subclasses[0]().delete_invite(invite_id)
