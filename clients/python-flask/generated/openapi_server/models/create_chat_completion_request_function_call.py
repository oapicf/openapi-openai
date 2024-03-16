from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.create_chat_completion_request_function_call_one_of import CreateChatCompletionRequestFunctionCallOneOf
from openapi_server import util

from openapi_server.models.create_chat_completion_request_function_call_one_of import CreateChatCompletionRequestFunctionCallOneOf  # noqa: E501

class CreateChatCompletionRequestFunctionCall(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None):  # noqa: E501
        """CreateChatCompletionRequestFunctionCall - a model defined in OpenAPI

        :param name: The name of this CreateChatCompletionRequestFunctionCall.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'name': str
        }

        self.attribute_map = {
            'name': 'name'
        }

        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'CreateChatCompletionRequestFunctionCall':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateChatCompletionRequest_function_call of this CreateChatCompletionRequestFunctionCall.  # noqa: E501
        :rtype: CreateChatCompletionRequestFunctionCall
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this CreateChatCompletionRequestFunctionCall.

        The name of the function to call.  # noqa: E501

        :return: The name of this CreateChatCompletionRequestFunctionCall.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this CreateChatCompletionRequestFunctionCall.

        The name of the function to call.  # noqa: E501

        :param name: The name of this CreateChatCompletionRequestFunctionCall.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name