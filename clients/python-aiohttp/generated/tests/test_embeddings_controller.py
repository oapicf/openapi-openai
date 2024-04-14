# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.create_embedding_request import CreateEmbeddingRequest
from openapi_server.models.create_embedding_response import CreateEmbeddingResponse


pytestmark = pytest.mark.asyncio

async def test_create_embedding(client):
    """Test case for create_embedding

    Creates an embedding vector representing the input text.
    """
    body = {"input":"The quick brown fox jumped over the lazy dog","encoding_format":"float","model":"text-embedding-3-small","user":"user-1234","dimensions":1}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/v1/embeddings',
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

