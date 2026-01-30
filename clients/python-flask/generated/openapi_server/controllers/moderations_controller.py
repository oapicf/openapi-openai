import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.create_moderation_request import CreateModerationRequest  # noqa: E501
from openapi_server.models.create_moderation_response import CreateModerationResponse  # noqa: E501
from openapi_server import util


def create_moderation(body):  # noqa: E501
    """Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 

     # noqa: E501

    :param create_moderation_request: 
    :type create_moderation_request: dict | bytes

    :rtype: Union[CreateModerationResponse, Tuple[CreateModerationResponse, int], Tuple[CreateModerationResponse, int, Dict[str, str]]
    """
    create_moderation_request = body
    if connexion.request.is_json:
        create_moderation_request = CreateModerationRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
