# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.moderations_api_base import BaseModerationsApi
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
from openapi_server.models.create_moderation_request import CreateModerationRequest
from openapi_server.models.create_moderation_response import CreateModerationResponse
from openapi_server.security_api import get_token_ApiKeyAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/moderations",
    responses={
        200: {"model": CreateModerationResponse, "description": "OK"},
    },
    tags=["Moderations"],
    summary="Classifies if text is potentially harmful.",
    response_model_by_alias=True,
)
async def create_moderation(
    create_moderation_request: CreateModerationRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> CreateModerationResponse:
    if not BaseModerationsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseModerationsApi.subclasses[0]().create_moderation(create_moderation_request)
