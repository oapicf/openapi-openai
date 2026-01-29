from typing import List, Dict
from aiohttp import web

from openapi_server.models.create_chat_completion_request import CreateChatCompletionRequest
from openapi_server.models.create_chat_completion_response import CreateChatCompletionResponse
from openapi_server import util


async def create_chat_completion(request: web.Request, body) -> web.Response:
    """Creates a model response for the given chat conversation.

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateChatCompletionRequest.from_dict(body)
    return web.Response(status=200)
