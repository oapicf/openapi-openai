from typing import List, Dict
from aiohttp import web

from openapi_server.models.create_completion_request import CreateCompletionRequest
from openapi_server.models.create_completion_response import CreateCompletionResponse
from openapi_server import util


async def create_completion(request: web.Request, body) -> web.Response:
    """Creates a completion for the provided prompt and parameters.

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateCompletionRequest.from_dict(body)
    return web.Response(status=200)
