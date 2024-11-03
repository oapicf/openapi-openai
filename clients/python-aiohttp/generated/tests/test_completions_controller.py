# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.create_completion_request import CreateCompletionRequest
from openapi_server.models.create_completion_response import CreateCompletionResponse


pytestmark = pytest.mark.asyncio

async def test_create_completion(client):
    """Test case for create_completion

    Creates a completion for the provided prompt and parameters.
    """
    body = {"logit_bias":{"key":1},"seed":-2147483648,"max_tokens":16,"presence_penalty":0.25495066265333133,"echo":False,"suffix":"test.","n":1,"logprobs":2,"top_p":1,"frequency_penalty":0.4109824732281613,"best_of":1,"stop":"\n","stream":False,"temperature":1,"model":"CreateCompletionRequest_model","prompt":"This is a test.","user":"user-1234"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/completions',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

