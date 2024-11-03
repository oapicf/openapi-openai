# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.create_moderation_request import CreateModerationRequest
from openapi_server.models.create_moderation_response import CreateModerationResponse


pytestmark = pytest.mark.asyncio

async def test_create_moderation(client):
    """Test case for create_moderation

    Classifies if text is potentially harmful.
    """
    body = {"input":"I want to kill them.","model":"text-moderation-stable"}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/moderations',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

