# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.realtime_api_base import BaseRealtimeApi
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
from pydantic import Field
from typing_extensions import Annotated
from openapi_server.models.realtime_session_create_request import RealtimeSessionCreateRequest
from openapi_server.models.realtime_session_create_response import RealtimeSessionCreateResponse
from openapi_server.security_api import get_token_ApiKeyAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/realtime/sessions",
    responses={
        200: {"model": RealtimeSessionCreateResponse, "description": "Session created successfully."},
    },
    tags=["Realtime"],
    summary="Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. ",
    response_model_by_alias=True,
)
async def create_realtime_session(
    realtime_session_create_request: Annotated[RealtimeSessionCreateRequest, Field(description="Create an ephemeral API key with the given session configuration.")] = Body(None, description="Create an ephemeral API key with the given session configuration."),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> RealtimeSessionCreateResponse:
    if not BaseRealtimeApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseRealtimeApi.subclasses[0]().create_realtime_session(realtime_session_create_request)
