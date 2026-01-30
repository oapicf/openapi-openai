# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.delete_model_response import DeleteModelResponse
from openapi_server.models.list_models_response import ListModelsResponse
from openapi_server.models.model import Model


pytestmark = pytest.mark.asyncio

async def test_delete_model(client):
    """Test case for delete_model

    Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='DELETE',
        path='/v1/models/{model}'.format(model='ft:gpt-4o-mini:acemeco:suffix:abc123'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_list_models(client):
    """Test case for list_models

    Lists the currently available models, and provides basic information about each one such as the owner and availability.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/models',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_retrieve_model(client):
    """Test case for retrieve_model

    Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='GET',
        path='/v1/models/{model}'.format(model='gpt-4o-mini'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

