# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictInt, StrictStr
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.create_fine_tuning_job_request import CreateFineTuningJobRequest
from openapi_server.models.fine_tuning_job import FineTuningJob
from openapi_server.models.list_fine_tuning_job_checkpoints_response import ListFineTuningJobCheckpointsResponse
from openapi_server.models.list_fine_tuning_job_events_response import ListFineTuningJobEventsResponse
from openapi_server.models.list_paginated_fine_tuning_jobs_response import ListPaginatedFineTuningJobsResponse
from openapi_server.security_api import get_token_ApiKeyAuth

class BaseFineTuningApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseFineTuningApi.subclasses = BaseFineTuningApi.subclasses + (cls,)
    async def list_paginated_fine_tuning_jobs(
        self,
        after: Annotated[Optional[StrictStr], Field(description="Identifier for the last job from the previous pagination request.")],
        limit: Annotated[Optional[StrictInt], Field(description="Number of fine-tuning jobs to retrieve.")],
    ) -> ListPaginatedFineTuningJobsResponse:
        ...


    async def create_fine_tuning_job(
        self,
        create_fine_tuning_job_request: CreateFineTuningJobRequest,
    ) -> FineTuningJob:
        ...


    async def retrieve_fine_tuning_job(
        self,
        fine_tuning_job_id: Annotated[StrictStr, Field(description="The ID of the fine-tuning job. ")],
    ) -> FineTuningJob:
        ...


    async def cancel_fine_tuning_job(
        self,
        fine_tuning_job_id: Annotated[StrictStr, Field(description="The ID of the fine-tuning job to cancel. ")],
    ) -> FineTuningJob:
        ...


    async def list_fine_tuning_job_checkpoints(
        self,
        fine_tuning_job_id: Annotated[StrictStr, Field(description="The ID of the fine-tuning job to get checkpoints for. ")],
        after: Annotated[Optional[StrictStr], Field(description="Identifier for the last checkpoint ID from the previous pagination request.")],
        limit: Annotated[Optional[StrictInt], Field(description="Number of checkpoints to retrieve.")],
    ) -> ListFineTuningJobCheckpointsResponse:
        ...


    async def list_fine_tuning_events(
        self,
        fine_tuning_job_id: Annotated[StrictStr, Field(description="The ID of the fine-tuning job to get events for. ")],
        after: Annotated[Optional[StrictStr], Field(description="Identifier for the last event from the previous pagination request.")],
        limit: Annotated[Optional[StrictInt], Field(description="Number of events to retrieve.")],
    ) -> ListFineTuningJobEventsResponse:
        ...
