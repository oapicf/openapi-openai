# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.create_fine_tuning_job_request import CreateFineTuningJobRequest
from openapi_server.models.fine_tuning_job import FineTuningJob
from openapi_server.models.list_fine_tuning_job_checkpoints_response import ListFineTuningJobCheckpointsResponse
from openapi_server.models.list_fine_tuning_job_events_response import ListFineTuningJobEventsResponse
from openapi_server.models.list_paginated_fine_tuning_jobs_response import ListPaginatedFineTuningJobsResponse


pytestmark = pytest.mark.asyncio

async def test_cancel_fine_tuning_job(client):
    """Test case for cancel_fine_tuning_job

    Immediately cancel a fine-tune job. 
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel'.format(fine_tuning_job_id='ft-AF1WoRqd3aJAHsqc9NY7iL8F'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_fine_tuning_job(client):
    """Test case for create_fine_tuning_job

    Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    """
    body = {"training_file":"file-abc123","seed":42,"method":{"supervised":{"hyperparameters":{"batch_size":"auto","n_epochs":"auto","learning_rate_multiplier":"auto"}},"dpo":{"hyperparameters":{"beta":"auto"}},"type":"supervised"},"validation_file":"file-abc123","hyperparameters":{"batch_size":"auto","n_epochs":"auto","learning_rate_multiplier":"auto"},"model":"gpt-4o-mini","suffix":"suffix","integrations":[{"wandb":{"name":"name","project":"my-wandb-project","entity":"entity","tags":["custom-tag","custom-tag"]},"type":"wandb"},{"wandb":{"name":"name","project":"my-wandb-project","entity":"entity","tags":["custom-tag","custom-tag"]},"type":"wandb"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/fine_tuning/jobs',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_fine_tuning_events(client):
    """Test case for list_fine_tuning_events

    Get status updates for a fine-tuning job. 
    """
    params = [('after', 'after_example'),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/fine_tuning/jobs/{fine_tuning_job_id}/events'.format(fine_tuning_job_id='ft-AF1WoRqd3aJAHsqc9NY7iL8F'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_fine_tuning_job_checkpoints(client):
    """Test case for list_fine_tuning_job_checkpoints

    List checkpoints for a fine-tuning job. 
    """
    params = [('after', 'after_example'),
                    ('limit', 10)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints'.format(fine_tuning_job_id='ft-AF1WoRqd3aJAHsqc9NY7iL8F'),
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_paginated_fine_tuning_jobs(client):
    """Test case for list_paginated_fine_tuning_jobs

    List your organization's fine-tuning jobs 
    """
    params = [('after', 'after_example'),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/fine_tuning/jobs',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_retrieve_fine_tuning_job(client):
    """Test case for retrieve_fine_tuning_job

    Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/fine_tuning/jobs/{fine_tuning_job_id}'.format(fine_tuning_job_id='ft-AF1WoRqd3aJAHsqc9NY7iL8F'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

