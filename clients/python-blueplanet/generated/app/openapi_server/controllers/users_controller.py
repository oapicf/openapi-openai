import connexion

from app.openapi_server.models.user import User  # noqa: E501
from app.openapi_server.models.user_delete_response import UserDeleteResponse  # noqa: E501
from app.openapi_server.models.user_list_response import UserListResponse  # noqa: E501
from app.openapi_server.models.user_role_update_request import UserRoleUpdateRequest  # noqa: E501
from openapi_server import util


def delete_user(user_id):  # noqa: E501
    """Deletes a user from the organization.

     # noqa: E501

    :param user_id: The ID of the user.
    :type user_id: str

    :rtype: UserDeleteResponse
    """
    return 'do some magic!'


def list_users(limit=None, after=None):  # noqa: E501
    """Lists all of the users in the organization.

     # noqa: E501

    :param limit: A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    :type limit: int
    :param after: A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    :type after: str

    :rtype: UserListResponse
    """
    return 'do some magic!'


def modify_user(user_id, body):  # noqa: E501
    """Modifies a user&#39;s role in the organization.

     # noqa: E501

    :param user_id: The ID of the user.
    :type user_id: str
    :param body: The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;.
    :type body: dict | bytes

    :rtype: User
    """
    if connexion.request.is_json:
        body = UserRoleUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def retrieve_user(user_id):  # noqa: E501
    """Retrieves a user by their identifier.

     # noqa: E501

    :param user_id: The ID of the user.
    :type user_id: str

    :rtype: User
    """
    return 'do some magic!'
