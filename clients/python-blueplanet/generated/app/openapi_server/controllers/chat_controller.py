import connexion

from app.openapi_server.models.create_chat_completion_request import CreateChatCompletionRequest  # noqa: E501
from app.openapi_server.models.create_chat_completion_response import CreateChatCompletionResponse  # noqa: E501
from openapi_server import util


def create_chat_completion(body):  # noqa: E501
    """Creates a model response for the given chat conversation.

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: CreateChatCompletionResponse
    """
    if connexion.request.is_json:
        body = CreateChatCompletionRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
