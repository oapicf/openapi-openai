from typing import List, Dict
from aiohttp import web

from openapi_server.models.user import User
from openapi_server.models.user_delete_response import UserDeleteResponse
from openapi_server.models.user_list_response import UserListResponse
from openapi_server.models.user_role_update_request import UserRoleUpdateRequest
from openapi_server import util


async def delete_user(request: web.Request, user_id) -> web.Response:
    """Deletes a user from the organization.

    

    :param user_id: The ID of the user.
    :type user_id: str

    """
    return web.Response(status=200)


async def list_users(request: web.Request, limit=None, after=None) -> web.Response:
    """Lists all of the users in the organization.

    

    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str

    """
    return web.Response(status=200)


async def modify_user(request: web.Request, user_id, body) -> web.Response:
    """Modifies a user&#39;s role in the organization.

    

    :param user_id: The ID of the user.
    :type user_id: str
    :param body: The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;.
    :type body: dict | bytes

    """
    body = UserRoleUpdateRequest.from_dict(body)
    return web.Response(status=200)


async def retrieve_user(request: web.Request, user_id) -> web.Response:
    """Retrieves a user by their identifier.

    

    :param user_id: The ID of the user.
    :type user_id: str

    """
    return web.Response(status=200)
