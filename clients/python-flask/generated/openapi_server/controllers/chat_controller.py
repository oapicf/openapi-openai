import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.create_chat_completion_request import CreateChatCompletionRequest  # noqa: E501
from openapi_server.models.create_chat_completion_response import CreateChatCompletionResponse  # noqa: E501
from openapi_server import util


def create_chat_completion(create_chat_completion_request):  # noqa: E501
    """Creates a model response for the given chat conversation.

     # noqa: E501

    :param create_chat_completion_request: 
    :type create_chat_completion_request: dict | bytes

    :rtype: Union[CreateChatCompletionResponse, Tuple[CreateChatCompletionResponse, int], Tuple[CreateChatCompletionResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_chat_completion_request = CreateChatCompletionRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
