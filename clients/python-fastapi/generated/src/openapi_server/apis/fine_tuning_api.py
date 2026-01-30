# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.fine_tuning_api_base import BaseFineTuningApi
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
from openapi_server.models.create_fine_tuning_job_request import CreateFineTuningJobRequest
from openapi_server.models.fine_tuning_job import FineTuningJob
from openapi_server.models.list_fine_tuning_job_checkpoints_response import ListFineTuningJobCheckpointsResponse
from openapi_server.models.list_fine_tuning_job_events_response import ListFineTuningJobEventsResponse
from openapi_server.models.list_paginated_fine_tuning_jobs_response import ListPaginatedFineTuningJobsResponse
from openapi_server.security_api import get_token_ApiKeyAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/fine_tuning/jobs",
    responses={
        200: {"model": ListPaginatedFineTuningJobsResponse, "description": "OK"},
    },
    tags=["Fine-tuning"],
    summary="List your organization&#39;s fine-tuning jobs ",
    response_model_by_alias=True,
)
async def list_paginated_fine_tuning_jobs(
    after: Annotated[Optional[StrictStr], Field(description="Identifier for the last job from the previous pagination request.")] = Query(None, description="Identifier for the last job from the previous pagination request.", alias="after"),
    limit: Annotated[Optional[StrictInt], Field(description="Number of fine-tuning jobs to retrieve.")] = Query(20, description="Number of fine-tuning jobs to retrieve.", alias="limit"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListPaginatedFineTuningJobsResponse:
    if not BaseFineTuningApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFineTuningApi.subclasses[0]().list_paginated_fine_tuning_jobs(after, limit)


@router.post(
    "/fine_tuning/jobs",
    responses={
        200: {"model": FineTuningJob, "description": "OK"},
    },
    tags=["Fine-tuning"],
    summary="Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ",
    response_model_by_alias=True,
)
async def create_fine_tuning_job(
    create_fine_tuning_job_request: CreateFineTuningJobRequest = Body(None, description=""),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> FineTuningJob:
    if not BaseFineTuningApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFineTuningApi.subclasses[0]().create_fine_tuning_job(create_fine_tuning_job_request)


@router.get(
    "/fine_tuning/jobs/{fine_tuning_job_id}",
    responses={
        200: {"model": FineTuningJob, "description": "OK"},
    },
    tags=["Fine-tuning"],
    summary="Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ",
    response_model_by_alias=True,
)
async def retrieve_fine_tuning_job(
    fine_tuning_job_id: Annotated[StrictStr, Field(description="The ID of the fine-tuning job. ")] = Path(..., description="The ID of the fine-tuning job. "),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> FineTuningJob:
    if not BaseFineTuningApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFineTuningApi.subclasses[0]().retrieve_fine_tuning_job(fine_tuning_job_id)


@router.post(
    "/fine_tuning/jobs/{fine_tuning_job_id}/cancel",
    responses={
        200: {"model": FineTuningJob, "description": "OK"},
    },
    tags=["Fine-tuning"],
    summary="Immediately cancel a fine-tune job. ",
    response_model_by_alias=True,
)
async def cancel_fine_tuning_job(
    fine_tuning_job_id: Annotated[StrictStr, Field(description="The ID of the fine-tuning job to cancel. ")] = Path(..., description="The ID of the fine-tuning job to cancel. "),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> FineTuningJob:
    if not BaseFineTuningApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFineTuningApi.subclasses[0]().cancel_fine_tuning_job(fine_tuning_job_id)


@router.get(
    "/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints",
    responses={
        200: {"model": ListFineTuningJobCheckpointsResponse, "description": "OK"},
    },
    tags=["Fine-tuning"],
    summary="List checkpoints for a fine-tuning job. ",
    response_model_by_alias=True,
)
async def list_fine_tuning_job_checkpoints(
    fine_tuning_job_id: Annotated[StrictStr, Field(description="The ID of the fine-tuning job to get checkpoints for. ")] = Path(..., description="The ID of the fine-tuning job to get checkpoints for. "),
    after: Annotated[Optional[StrictStr], Field(description="Identifier for the last checkpoint ID from the previous pagination request.")] = Query(None, description="Identifier for the last checkpoint ID from the previous pagination request.", alias="after"),
    limit: Annotated[Optional[StrictInt], Field(description="Number of checkpoints to retrieve.")] = Query(10, description="Number of checkpoints to retrieve.", alias="limit"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListFineTuningJobCheckpointsResponse:
    if not BaseFineTuningApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFineTuningApi.subclasses[0]().list_fine_tuning_job_checkpoints(fine_tuning_job_id, after, limit)


@router.get(
    "/fine_tuning/jobs/{fine_tuning_job_id}/events",
    responses={
        200: {"model": ListFineTuningJobEventsResponse, "description": "OK"},
    },
    tags=["Fine-tuning"],
    summary="Get status updates for a fine-tuning job. ",
    response_model_by_alias=True,
)
async def list_fine_tuning_events(
    fine_tuning_job_id: Annotated[StrictStr, Field(description="The ID of the fine-tuning job to get events for. ")] = Path(..., description="The ID of the fine-tuning job to get events for. "),
    after: Annotated[Optional[StrictStr], Field(description="Identifier for the last event from the previous pagination request.")] = Query(None, description="Identifier for the last event from the previous pagination request.", alias="after"),
    limit: Annotated[Optional[StrictInt], Field(description="Number of events to retrieve.")] = Query(20, description="Number of events to retrieve.", alias="limit"),
    token_ApiKeyAuth: TokenModel = Security(
        get_token_ApiKeyAuth
    ),
) -> ListFineTuningJobEventsResponse:
    if not BaseFineTuningApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseFineTuningApi.subclasses[0]().list_fine_tuning_events(fine_tuning_job_id, after, limit)
