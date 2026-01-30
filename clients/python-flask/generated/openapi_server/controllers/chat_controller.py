import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.create_chat_completion_request import CreateChatCompletionRequest  # noqa: E501
from openapi_server.models.create_chat_completion_response import CreateChatCompletionResponse  # noqa: E501
from openapi_server import util


def create_chat_completion(body):  # noqa: E501
    """Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 

     # noqa: E501

    :param create_chat_completion_request: 
    :type create_chat_completion_request: dict | bytes

    :rtype: Union[CreateChatCompletionResponse, Tuple[CreateChatCompletionResponse, int], Tuple[CreateChatCompletionResponse, int, Dict[str, str]]
    """
    create_chat_completion_request = body
    if connexion.request.is_json:
        create_chat_completion_request = CreateChatCompletionRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
