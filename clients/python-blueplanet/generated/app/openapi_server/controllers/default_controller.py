import connexion

from app.openapi_server.models.admin_api_key import AdminApiKey  # noqa: E501
from app.openapi_server.models.admin_api_keys_create_request import AdminApiKeysCreateRequest  # noqa: E501
from app.openapi_server.models.admin_api_keys_delete200_response import AdminApiKeysDelete200Response  # noqa: E501
from app.openapi_server.models.api_key_list import ApiKeyList  # noqa: E501
from openapi_server import util


def admin_api_keys_create(body):  # noqa: E501
    """Create an organization admin API key

    Create a new admin-level API key for the organization. # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: AdminApiKey
    """
    if connexion.request.is_json:
        body = AdminApiKeysCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def admin_api_keys_delete(key_id):  # noqa: E501
    """Delete an organization admin API key

    Delete the specified admin API key. # noqa: E501

    :param key_id: 
    :type key_id: str

    :rtype: AdminApiKeysDelete200Response
    """
    return 'do some magic!'


def admin_api_keys_get(key_id):  # noqa: E501
    """Retrieve a single organization API key

    Get details for a specific organization API key by its ID. # noqa: E501

    :param key_id: 
    :type key_id: str

    :rtype: AdminApiKey
    """
    return 'do some magic!'


def admin_api_keys_list(after=None, order=None, limit=None):  # noqa: E501
    """List organization API keys

    Retrieve a paginated list of organization admin API keys. # noqa: E501

    :param after: 
    :type after: str
    :param order: 
    :type order: str
    :param limit: 
    :type limit: int

    :rtype: ApiKeyList
    """
    return 'do some magic!'
