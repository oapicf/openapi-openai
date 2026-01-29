from typing import List, Dict
from aiohttp import web

from openapi_server.models.create_fine_tuning_job_request import CreateFineTuningJobRequest
from openapi_server.models.fine_tuning_job import FineTuningJob
from openapi_server.models.list_fine_tuning_job_checkpoints_response import ListFineTuningJobCheckpointsResponse
from openapi_server.models.list_fine_tuning_job_events_response import ListFineTuningJobEventsResponse
from openapi_server.models.list_paginated_fine_tuning_jobs_response import ListPaginatedFineTuningJobsResponse
from openapi_server import util


async def cancel_fine_tuning_job(request: web.Request, fine_tuning_job_id) -> web.Response:
    """Immediately cancel a fine-tune job. 

    

    :param fine_tuning_job_id: The ID of the fine-tuning job to cancel. 
    :type fine_tuning_job_id: str

    """
    return web.Response(status=200)


async def create_fine_tuning_job(request: web.Request, body) -> web.Response:
    """Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateFineTuningJobRequest.from_dict(body)
    return web.Response(status=200)


async def list_fine_tuning_events(request: web.Request, fine_tuning_job_id, after=None, limit=None) -> web.Response:
    """Get status updates for a fine-tuning job. 

    

    :param fine_tuning_job_id: The ID of the fine-tuning job to get events for. 
    :type fine_tuning_job_id: str
    :param after: Identifier for the last event from the previous pagination request.
    :type after: str
    :param limit: Number of events to retrieve.
    :type limit: int

    """
    return web.Response(status=200)


async def list_fine_tuning_job_checkpoints(request: web.Request, fine_tuning_job_id, after=None, limit=None) -> web.Response:
    """List checkpoints for a fine-tuning job. 

    

    :param fine_tuning_job_id: The ID of the fine-tuning job to get checkpoints for. 
    :type fine_tuning_job_id: str
    :param after: Identifier for the last checkpoint ID from the previous pagination request.
    :type after: str
    :param limit: Number of checkpoints to retrieve.
    :type limit: int

    """
    return web.Response(status=200)


async def list_paginated_fine_tuning_jobs(request: web.Request, after=None, limit=None) -> web.Response:
    """List your organization&#39;s fine-tuning jobs 

    

    :param after: Identifier for the last job from the previous pagination request.
    :type after: str
    :param limit: Number of fine-tuning jobs to retrieve.
    :type limit: int

    """
    return web.Response(status=200)


async def retrieve_fine_tuning_job(request: web.Request, fine_tuning_job_id) -> web.Response:
    """Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

    

    :param fine_tuning_job_id: The ID of the fine-tuning job. 
    :type fine_tuning_job_id: str

    """
    return web.Response(status=200)
