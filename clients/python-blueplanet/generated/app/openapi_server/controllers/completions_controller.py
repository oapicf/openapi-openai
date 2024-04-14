import connexion

from app.openapi_server.models.create_completion_request import CreateCompletionRequest  # noqa: E501
from app.openapi_server.models.create_completion_response import CreateCompletionResponse  # noqa: E501
from openapi_server import util


def create_completion(body):  # noqa: E501
    """Creates a completion for the provided prompt and parameters.

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: CreateCompletionResponse
    """
    if connexion.request.is_json:
        body = CreateCompletionRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
