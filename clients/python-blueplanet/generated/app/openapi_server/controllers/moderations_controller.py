import connexion

from app.openapi_server.models.create_moderation_request import CreateModerationRequest  # noqa: E501
from app.openapi_server.models.create_moderation_response import CreateModerationResponse  # noqa: E501
from openapi_server import util


def create_moderation(body):  # noqa: E501
    """Classifies if text is potentially harmful.

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: CreateModerationResponse
    """
    if connexion.request.is_json:
        body = CreateModerationRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
