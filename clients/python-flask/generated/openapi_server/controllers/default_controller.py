import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.admin_api_key import AdminApiKey  # noqa: E501
from openapi_server.models.admin_api_keys_create_request import AdminApiKeysCreateRequest  # noqa: E501
from openapi_server.models.admin_api_keys_delete200_response import AdminApiKeysDelete200Response  # noqa: E501
from openapi_server.models.api_key_list import ApiKeyList  # noqa: E501
from openapi_server import util


def admin_api_keys_create(body):  # noqa: E501
    """Create an organization admin API key

    Create a new admin-level API key for the organization. # noqa: E501

    :param admin_api_keys_create_request: 
    :type admin_api_keys_create_request: dict | bytes

    :rtype: Union[AdminApiKey, Tuple[AdminApiKey, int], Tuple[AdminApiKey, int, Dict[str, str]]
    """
    admin_api_keys_create_request = body
    if connexion.request.is_json:
        admin_api_keys_create_request = AdminApiKeysCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def admin_api_keys_delete(key_id):  # noqa: E501
    """Delete an organization admin API key

    Delete the specified admin API key. # noqa: E501

    :param key_id: 
    :type key_id: str

    :rtype: Union[AdminApiKeysDelete200Response, Tuple[AdminApiKeysDelete200Response, int], Tuple[AdminApiKeysDelete200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def admin_api_keys_get(key_id):  # noqa: E501
    """Retrieve a single organization API key

    Get details for a specific organization API key by its ID. # noqa: E501

    :param key_id: 
    :type key_id: str

    :rtype: Union[AdminApiKey, Tuple[AdminApiKey, int], Tuple[AdminApiKey, int, Dict[str, str]]
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

    :rtype: Union[ApiKeyList, Tuple[ApiKeyList, int], Tuple[ApiKeyList, int, Dict[str, str]]
    """
    return 'do some magic!'
