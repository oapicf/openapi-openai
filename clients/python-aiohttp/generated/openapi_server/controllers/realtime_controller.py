from typing import List, Dict
from aiohttp import web

from openapi_server.models.realtime_session_create_request import RealtimeSessionCreateRequest
from openapi_server.models.realtime_session_create_response import RealtimeSessionCreateResponse
from openapi_server import util


async def create_realtime_session(request: web.Request, body) -> web.Response:
    """Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 

    

    :param body: Create an ephemeral API key with the given session configuration.
    :type body: dict | bytes

    """
    body = RealtimeSessionCreateRequest.from_dict(body)
    return web.Response(status=200)
