from typing import List, Dict
from aiohttp import web

from openapi_server.models.create_moderation_request import CreateModerationRequest
from openapi_server.models.create_moderation_response import CreateModerationResponse
from openapi_server import util


async def create_moderation(request: web.Request, body) -> web.Response:
    """Classifies if text is potentially harmful.

    

    :param body: 
    :type body: dict | bytes

    """
    body = CreateModerationRequest.from_dict(body)
    return web.Response(status=200)
