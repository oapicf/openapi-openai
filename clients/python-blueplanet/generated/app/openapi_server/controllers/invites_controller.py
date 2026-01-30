import connexion

from app.openapi_server.models.invite import Invite  # noqa: E501
from app.openapi_server.models.invite_delete_response import InviteDeleteResponse  # noqa: E501
from app.openapi_server.models.invite_list_response import InviteListResponse  # noqa: E501
from app.openapi_server.models.invite_request import InviteRequest  # noqa: E501
from openapi_server import util


def delete_invite(invite_id):  # noqa: E501
    """Delete an invite. If the invite has already been accepted, it cannot be deleted.

     # noqa: E501

    :param invite_id: The ID of the invite to delete.
    :type invite_id: str

    :rtype: InviteDeleteResponse
    """
    return 'do some magic!'


def invite_user(body):  # noqa: E501
    """Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

     # noqa: E501

    :param body: The invite request payload.
    :type body: dict | bytes

    :rtype: Invite
    """
    if connexion.request.is_json:
        body = InviteRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def list_invites(limit=None, after=None):  # noqa: E501
    """Returns a list of invites in the organization.

     # noqa: E501

    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str

    :rtype: InviteListResponse
    """
    return 'do some magic!'


def retrieve_invite(invite_id):  # noqa: E501
    """Retrieves an invite.

     # noqa: E501

    :param invite_id: The ID of the invite to retrieve.
    :type invite_id: str

    :rtype: Invite
    """
    return 'do some magic!'
