# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.batch import Batch
from openapi_server.models.create_batch_request import CreateBatchRequest
from openapi_server.models.list_batches_response import ListBatchesResponse


pytestmark = pytest.mark.asyncio

async def test_cancel_batch(client):
    """Test case for cancel_batch

    Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/batches/{batch_id}/cancel'.format(batch_id='batch_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_create_batch(client):
    """Test case for create_batch

    Creates and executes a batch from an uploaded file of requests
    """
    body = openapi_server.CreateBatchRequest()
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/batches',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_batches(client):
    """Test case for list_batches

    List your organization's batches.
    """
    params = [('after', 'after_example'),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/batches',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_retrieve_batch(client):
    """Test case for retrieve_batch

    Retrieves a batch.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/batches/{batch_id}'.format(batch_id='batch_id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

