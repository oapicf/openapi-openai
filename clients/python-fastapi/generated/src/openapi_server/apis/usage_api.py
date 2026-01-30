# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.usage_api_base import BaseUsageApi
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
from pydantic import Field, StrictBool, StrictInt, StrictStr, field_validator
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.usage_response import UsageResponse
from openapi_server.security_api import get_token_ApiKeyAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/organization/costs",
    responses={
        200: {"model": UsageResponse, "description": "Costs data retrieved successfully."},
    },
    tags=["Usage"],
    summary="Get costs details for the organization.",
    response_model_by_alias=True,
)
async def usage_costs(
    start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")] = Query(None, description="Start time (Unix seconds) of the query time range, inclusive.", alias="start_time"),
    end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")] = Query(None, description="End time (Unix seconds) of the query time range, exclusive.", alias="end_time"),
    bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.")] = Query(1d, description="Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;.", alias="bucket_width"),
    project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only costs for these projects.")] = Query(None, description="Return only costs for these projects.", alias="project_ids"),
    group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.")] = Query(None, description="Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them.", alias="group_by"),
    limit: Annotated[Optional[StrictInt], Field(description="A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. ")] = Query(7, description="A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. ", alias="limit"),
    page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")] = Query(None, description="A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.", alias="page"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> UsageResponse:
    if not BaseUsageApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUsageApi.subclasses[0]().usage_costs(start_time, end_time, bucket_width, project_ids, group_by, limit, page)


@router.get(
    "/organization/usage/audio_speeches",
    responses={
        200: {"model": UsageResponse, "description": "Usage data retrieved successfully."},
    },
    tags=["Usage"],
    summary="Get audio speeches usage details for the organization.",
    response_model_by_alias=True,
)
async def usage_audio_speeches(
    start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")] = Query(None, description="Start time (Unix seconds) of the query time range, inclusive.", alias="start_time"),
    end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")] = Query(None, description="End time (Unix seconds) of the query time range, exclusive.", alias="end_time"),
    bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.")] = Query(1d, description="Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.", alias="bucket_width"),
    project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these projects.")] = Query(None, description="Return only usage for these projects.", alias="project_ids"),
    user_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these users.")] = Query(None, description="Return only usage for these users.", alias="user_ids"),
    api_key_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these API keys.")] = Query(None, description="Return only usage for these API keys.", alias="api_key_ids"),
    models: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these models.")] = Query(None, description="Return only usage for these models.", alias="models"),
    group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.")] = Query(None, description="Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.", alias="group_by"),
    limit: Annotated[Optional[StrictInt], Field(description="Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")] = Query(None, description="Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ", alias="limit"),
    page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")] = Query(None, description="A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.", alias="page"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> UsageResponse:
    if not BaseUsageApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUsageApi.subclasses[0]().usage_audio_speeches(start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page)


@router.get(
    "/organization/usage/audio_transcriptions",
    responses={
        200: {"model": UsageResponse, "description": "Usage data retrieved successfully."},
    },
    tags=["Usage"],
    summary="Get audio transcriptions usage details for the organization.",
    response_model_by_alias=True,
)
async def usage_audio_transcriptions(
    start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")] = Query(None, description="Start time (Unix seconds) of the query time range, inclusive.", alias="start_time"),
    end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")] = Query(None, description="End time (Unix seconds) of the query time range, exclusive.", alias="end_time"),
    bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.")] = Query(1d, description="Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.", alias="bucket_width"),
    project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these projects.")] = Query(None, description="Return only usage for these projects.", alias="project_ids"),
    user_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these users.")] = Query(None, description="Return only usage for these users.", alias="user_ids"),
    api_key_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these API keys.")] = Query(None, description="Return only usage for these API keys.", alias="api_key_ids"),
    models: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these models.")] = Query(None, description="Return only usage for these models.", alias="models"),
    group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.")] = Query(None, description="Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.", alias="group_by"),
    limit: Annotated[Optional[StrictInt], Field(description="Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")] = Query(None, description="Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ", alias="limit"),
    page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")] = Query(None, description="A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.", alias="page"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> UsageResponse:
    if not BaseUsageApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUsageApi.subclasses[0]().usage_audio_transcriptions(start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page)


@router.get(
    "/organization/usage/code_interpreter_sessions",
    responses={
        200: {"model": UsageResponse, "description": "Usage data retrieved successfully."},
    },
    tags=["Usage"],
    summary="Get code interpreter sessions usage details for the organization.",
    response_model_by_alias=True,
)
async def usage_code_interpreter_sessions(
    start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")] = Query(None, description="Start time (Unix seconds) of the query time range, inclusive.", alias="start_time"),
    end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")] = Query(None, description="End time (Unix seconds) of the query time range, exclusive.", alias="end_time"),
    bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.")] = Query(1d, description="Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.", alias="bucket_width"),
    project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these projects.")] = Query(None, description="Return only usage for these projects.", alias="project_ids"),
    group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the usage data by the specified fields. Support fields include `project_id`.")] = Query(None, description="Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.", alias="group_by"),
    limit: Annotated[Optional[StrictInt], Field(description="Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")] = Query(None, description="Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ", alias="limit"),
    page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")] = Query(None, description="A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.", alias="page"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> UsageResponse:
    if not BaseUsageApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUsageApi.subclasses[0]().usage_code_interpreter_sessions(start_time, end_time, bucket_width, project_ids, group_by, limit, page)


@router.get(
    "/organization/usage/completions",
    responses={
        200: {"model": UsageResponse, "description": "Usage data retrieved successfully."},
    },
    tags=["Usage"],
    summary="Get completions usage details for the organization.",
    response_model_by_alias=True,
)
async def usage_completions(
    start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")] = Query(None, description="Start time (Unix seconds) of the query time range, inclusive.", alias="start_time"),
    end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")] = Query(None, description="End time (Unix seconds) of the query time range, exclusive.", alias="end_time"),
    bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.")] = Query(1d, description="Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.", alias="bucket_width"),
    project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these projects.")] = Query(None, description="Return only usage for these projects.", alias="project_ids"),
    user_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these users.")] = Query(None, description="Return only usage for these users.", alias="user_ids"),
    api_key_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these API keys.")] = Query(None, description="Return only usage for these API keys.", alias="api_key_ids"),
    models: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these models.")] = Query(None, description="Return only usage for these models.", alias="models"),
    batch: Annotated[Optional[StrictBool], Field(description="If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. ")] = Query(None, description="If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both. ", alias="batch"),
    group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.")] = Query(None, description="Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them.", alias="group_by"),
    limit: Annotated[Optional[StrictInt], Field(description="Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")] = Query(None, description="Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ", alias="limit"),
    page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")] = Query(None, description="A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.", alias="page"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> UsageResponse:
    if not BaseUsageApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUsageApi.subclasses[0]().usage_completions(start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, batch, group_by, limit, page)


@router.get(
    "/organization/usage/embeddings",
    responses={
        200: {"model": UsageResponse, "description": "Usage data retrieved successfully."},
    },
    tags=["Usage"],
    summary="Get embeddings usage details for the organization.",
    response_model_by_alias=True,
)
async def usage_embeddings(
    start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")] = Query(None, description="Start time (Unix seconds) of the query time range, inclusive.", alias="start_time"),
    end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")] = Query(None, description="End time (Unix seconds) of the query time range, exclusive.", alias="end_time"),
    bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.")] = Query(1d, description="Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.", alias="bucket_width"),
    project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these projects.")] = Query(None, description="Return only usage for these projects.", alias="project_ids"),
    user_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these users.")] = Query(None, description="Return only usage for these users.", alias="user_ids"),
    api_key_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these API keys.")] = Query(None, description="Return only usage for these API keys.", alias="api_key_ids"),
    models: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these models.")] = Query(None, description="Return only usage for these models.", alias="models"),
    group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.")] = Query(None, description="Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.", alias="group_by"),
    limit: Annotated[Optional[StrictInt], Field(description="Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")] = Query(None, description="Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ", alias="limit"),
    page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")] = Query(None, description="A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.", alias="page"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> UsageResponse:
    if not BaseUsageApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUsageApi.subclasses[0]().usage_embeddings(start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page)


@router.get(
    "/organization/usage/images",
    responses={
        200: {"model": UsageResponse, "description": "Usage data retrieved successfully."},
    },
    tags=["Usage"],
    summary="Get images usage details for the organization.",
    response_model_by_alias=True,
)
async def usage_images(
    start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")] = Query(None, description="Start time (Unix seconds) of the query time range, inclusive.", alias="start_time"),
    end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")] = Query(None, description="End time (Unix seconds) of the query time range, exclusive.", alias="end_time"),
    bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.")] = Query(1d, description="Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.", alias="bucket_width"),
    sources: Annotated[Optional[List[StrictStr]], Field(description="Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.")] = Query(None, description="Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them.", alias="sources"),
    sizes: Annotated[Optional[List[StrictStr]], Field(description="Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.")] = Query(None, description="Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them.", alias="sizes"),
    project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these projects.")] = Query(None, description="Return only usage for these projects.", alias="project_ids"),
    user_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these users.")] = Query(None, description="Return only usage for these users.", alias="user_ids"),
    api_key_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these API keys.")] = Query(None, description="Return only usage for these API keys.", alias="api_key_ids"),
    models: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these models.")] = Query(None, description="Return only usage for these models.", alias="models"),
    group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.")] = Query(None, description="Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them.", alias="group_by"),
    limit: Annotated[Optional[StrictInt], Field(description="Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")] = Query(None, description="Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ", alias="limit"),
    page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")] = Query(None, description="A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.", alias="page"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> UsageResponse:
    if not BaseUsageApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUsageApi.subclasses[0]().usage_images(start_time, end_time, bucket_width, sources, sizes, project_ids, user_ids, api_key_ids, models, group_by, limit, page)


@router.get(
    "/organization/usage/moderations",
    responses={
        200: {"model": UsageResponse, "description": "Usage data retrieved successfully."},
    },
    tags=["Usage"],
    summary="Get moderations usage details for the organization.",
    response_model_by_alias=True,
)
async def usage_moderations(
    start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")] = Query(None, description="Start time (Unix seconds) of the query time range, inclusive.", alias="start_time"),
    end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")] = Query(None, description="End time (Unix seconds) of the query time range, exclusive.", alias="end_time"),
    bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.")] = Query(1d, description="Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.", alias="bucket_width"),
    project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these projects.")] = Query(None, description="Return only usage for these projects.", alias="project_ids"),
    user_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these users.")] = Query(None, description="Return only usage for these users.", alias="user_ids"),
    api_key_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these API keys.")] = Query(None, description="Return only usage for these API keys.", alias="api_key_ids"),
    models: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these models.")] = Query(None, description="Return only usage for these models.", alias="models"),
    group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.")] = Query(None, description="Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.", alias="group_by"),
    limit: Annotated[Optional[StrictInt], Field(description="Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")] = Query(None, description="Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ", alias="limit"),
    page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")] = Query(None, description="A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.", alias="page"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> UsageResponse:
    if not BaseUsageApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUsageApi.subclasses[0]().usage_moderations(start_time, end_time, bucket_width, project_ids, user_ids, api_key_ids, models, group_by, limit, page)


@router.get(
    "/organization/usage/vector_stores",
    responses={
        200: {"model": UsageResponse, "description": "Usage data retrieved successfully."},
    },
    tags=["Usage"],
    summary="Get vector stores usage details for the organization.",
    response_model_by_alias=True,
)
async def usage_vector_stores(
    start_time: Annotated[StrictInt, Field(description="Start time (Unix seconds) of the query time range, inclusive.")] = Query(None, description="Start time (Unix seconds) of the query time range, inclusive.", alias="start_time"),
    end_time: Annotated[Optional[StrictInt], Field(description="End time (Unix seconds) of the query time range, exclusive.")] = Query(None, description="End time (Unix seconds) of the query time range, exclusive.", alias="end_time"),
    bucket_width: Annotated[Optional[StrictStr], Field(description="Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.")] = Query(1d, description="Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.", alias="bucket_width"),
    project_ids: Annotated[Optional[List[StrictStr]], Field(description="Return only usage for these projects.")] = Query(None, description="Return only usage for these projects.", alias="project_ids"),
    group_by: Annotated[Optional[List[StrictStr]], Field(description="Group the usage data by the specified fields. Support fields include `project_id`.")] = Query(None, description="Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.", alias="group_by"),
    limit: Annotated[Optional[StrictInt], Field(description="Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")] = Query(None, description="Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ", alias="limit"),
    page: Annotated[Optional[StrictStr], Field(description="A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")] = Query(None, description="A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.", alias="page"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> UsageResponse:
    if not BaseUsageApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseUsageApi.subclasses[0]().usage_vector_stores(start_time, end_time, bucket_width, project_ids, group_by, limit, page)
