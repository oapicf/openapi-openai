from typing import List, Dict
from aiohttp import web

from openapi_server.models.admin_api_key import AdminApiKey
from openapi_server.models.admin_api_keys_create_request import AdminApiKeysCreateRequest
from openapi_server.models.admin_api_keys_delete200_response import AdminApiKeysDelete200Response
from openapi_server.models.api_key_list import ApiKeyList
from openapi_server import util


async def admin_api_keys_create(request: web.Request, body) -> web.Response:
    """Create an organization admin API key

    Create a new admin-level API key for the organization.

    :param body: 
    :type body: dict | bytes

    """
    body = AdminApiKeysCreateRequest.from_dict(body)
    return web.Response(status=200)


async def admin_api_keys_delete(request: web.Request, key_id) -> web.Response:
    """Delete an organization admin API key

    Delete the specified admin API key.

    :param key_id: 
    :type key_id: str

    """
    return web.Response(status=200)


async def admin_api_keys_get(request: web.Request, key_id) -> web.Response:
    """Retrieve a single organization API key

    Get details for a specific organization API key by its ID.

    :param key_id: 
    :type key_id: str

    """
    return web.Response(status=200)


async def admin_api_keys_list(request: web.Request, after=None, order=None, limit=None) -> web.Response:
    """List organization API keys

    Retrieve a paginated list of organization admin API keys.

    :param after: 
    :type after: str
    :param order: 
    :type order: str
    :param limit: 
    :type limit: int

    """
    return web.Response(status=200)
