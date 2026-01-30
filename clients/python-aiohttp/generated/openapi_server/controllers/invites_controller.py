from typing import List, Dict
from aiohttp import web

from openapi_server.models.invite import Invite
from openapi_server.models.invite_delete_response import InviteDeleteResponse
from openapi_server.models.invite_list_response import InviteListResponse
from openapi_server.models.invite_request import InviteRequest
from openapi_server import util


async def delete_invite(request: web.Request, invite_id) -> web.Response:
    """Delete an invite. If the invite has already been accepted, it cannot be deleted.

    

    :param invite_id: The ID of the invite to delete.
    :type invite_id: str

    """
    return web.Response(status=200)


async def invite_user(request: web.Request, body) -> web.Response:
    """Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

    

    :param body: The invite request payload.
    :type body: dict | bytes

    """
    body = InviteRequest.from_dict(body)
    return web.Response(status=200)


async def list_invites(request: web.Request, limit=None, after=None) -> web.Response:
    """Returns a list of invites in the organization.

    

    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str

    """
    return web.Response(status=200)


async def retrieve_invite(request: web.Request, invite_id) -> web.Response:
    """Retrieves an invite.

    

    :param invite_id: The ID of the invite to retrieve.
    :type invite_id: str

    """
    return web.Response(status=200)
