from typing import List, Dict
from aiohttp import web

from openapi_server.models.create_embedding_request import CreateEmbeddingRequest
from openapi_server.models.create_embedding_response import CreateEmbeddingResponse
from openapi_server import util


async def create_embedding(request: web.Request, body) -> web.Response:
    """Creates an embedding vector representing the input text.

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateEmbeddingRequest.from_dict(body)
    return web.Response(status=200)
