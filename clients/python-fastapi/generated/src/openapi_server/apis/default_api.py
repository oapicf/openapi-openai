# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.default_api_base import BaseDefaultApi
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
from pydantic import StrictInt, StrictStr, field_validator
from typing import Optional
from openapi_server.models.admin_api_key import AdminApiKey
from openapi_server.models.admin_api_keys_create_request import AdminApiKeysCreateRequest
from openapi_server.models.admin_api_keys_delete200_response import AdminApiKeysDelete200Response
from openapi_server.models.api_key_list import ApiKeyList
from openapi_server.security_api import get_token_ApiKeyAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/organization/admin_api_keys",
    responses={
        200: {"model": ApiKeyList, "description": "A list of organization API keys."},
    },
    tags=["default"],
    summary="List organization API keys",
    response_model_by_alias=True,
)
async def admin_api_keys_list(
    after: Optional[StrictStr] = Query(None, description="", alias="after"),
    order: Optional[StrictStr] = Query(asc, description="", alias="order"),
    limit: Optional[StrictInt] = Query(20, description="", alias="limit"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ApiKeyList:
    """Retrieve a paginated list of organization admin API keys."""
    if not BaseDefaultApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseDefaultApi.subclasses[0]().admin_api_keys_list(after, order, limit)


@router.post(
    "/organization/admin_api_keys",
    responses={
        200: {"model": AdminApiKey, "description": "The newly created admin API key."},
    },
    tags=["default"],
    summary="Create an organization admin API key",
    response_model_by_alias=True,
)
async def admin_api_keys_create(
    admin_api_keys_create_request: AdminApiKeysCreateRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> AdminApiKey:
    """Create a new admin-level API key for the organization."""
    if not BaseDefaultApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseDefaultApi.subclasses[0]().admin_api_keys_create(admin_api_keys_create_request)


@router.get(
    "/organization/admin_api_keys/{key_id}",
    responses={
        200: {"model": AdminApiKey, "description": "Details of the requested API key."},
    },
    tags=["default"],
    summary="Retrieve a single organization API key",
    response_model_by_alias=True,
)
async def admin_api_keys_get(
    key_id: StrictStr = Path(..., description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> AdminApiKey:
    """Get details for a specific organization API key by its ID."""
    if not BaseDefaultApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseDefaultApi.subclasses[0]().admin_api_keys_get(key_id)


@router.delete(
    "/organization/admin_api_keys/{key_id}",
    responses={
        200: {"model": AdminApiKeysDelete200Response, "description": "Confirmation that the API key was deleted."},
    },
    tags=["default"],
    summary="Delete an organization admin API key",
    response_model_by_alias=True,
)
async def admin_api_keys_delete(
    key_id: StrictStr = Path(..., description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> AdminApiKeysDelete200Response:
    """Delete the specified admin API key."""
    if not BaseDefaultApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseDefaultApi.subclasses[0]().admin_api_keys_delete(key_id)
