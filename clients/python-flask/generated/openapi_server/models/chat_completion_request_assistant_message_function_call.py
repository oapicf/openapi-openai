from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ChatCompletionRequestAssistantMessageFunctionCall(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, arguments=None, name=None):  # noqa: E501
        """ChatCompletionRequestAssistantMessageFunctionCall - a model defined in OpenAPI

        :param arguments: The arguments of this ChatCompletionRequestAssistantMessageFunctionCall.  # noqa: E501
        :type arguments: str
        :param name: The name of this ChatCompletionRequestAssistantMessageFunctionCall.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'arguments': str,
            'name': str
        }

        self.attribute_map = {
            'arguments': 'arguments',
            'name': 'name'
        }

        self._arguments = arguments
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'ChatCompletionRequestAssistantMessageFunctionCall':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ChatCompletionRequestAssistantMessage_function_call of this ChatCompletionRequestAssistantMessageFunctionCall.  # noqa: E501
        :rtype: ChatCompletionRequestAssistantMessageFunctionCall
        """
        return util.deserialize_model(dikt, cls)

    @property
    def arguments(self) -> str:
        """Gets the arguments of this ChatCompletionRequestAssistantMessageFunctionCall.

        The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.  # noqa: E501

        :return: The arguments of this ChatCompletionRequestAssistantMessageFunctionCall.
        :rtype: str
        """
        return self._arguments

    @arguments.setter
    def arguments(self, arguments: str):
        """Sets the arguments of this ChatCompletionRequestAssistantMessageFunctionCall.

        The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.  # noqa: E501

        :param arguments: The arguments of this ChatCompletionRequestAssistantMessageFunctionCall.
        :type arguments: str
        """
        if arguments is None:
            raise ValueError("Invalid value for `arguments`, must not be `None`")  # noqa: E501

        self._arguments = arguments

    @property
    def name(self) -> str:
        """Gets the name of this ChatCompletionRequestAssistantMessageFunctionCall.

        The name of the function to call.  # noqa: E501

        :return: The name of this ChatCompletionRequestAssistantMessageFunctionCall.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ChatCompletionRequestAssistantMessageFunctionCall.

        The name of the function to call.  # noqa: E501

        :param name: The name of this ChatCompletionRequestAssistantMessageFunctionCall.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name
