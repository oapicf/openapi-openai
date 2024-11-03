from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.chat_completion_named_tool_choice_function import ChatCompletionNamedToolChoiceFunction
from openapi_server import util

from openapi_server.models.chat_completion_named_tool_choice_function import ChatCompletionNamedToolChoiceFunction  # noqa: E501

class AssistantsApiNamedToolChoice(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type=None, function=None):  # noqa: E501
        """AssistantsApiNamedToolChoice - a model defined in OpenAPI

        :param type: The type of this AssistantsApiNamedToolChoice.  # noqa: E501
        :type type: str
        :param function: The function of this AssistantsApiNamedToolChoice.  # noqa: E501
        :type function: ChatCompletionNamedToolChoiceFunction
        """
        self.openapi_types = {
            'type': str,
            'function': ChatCompletionNamedToolChoiceFunction
        }

        self.attribute_map = {
            'type': 'type',
            'function': 'function'
        }

        self._type = type
        self._function = function

    @classmethod
    def from_dict(cls, dikt) -> 'AssistantsApiNamedToolChoice':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AssistantsApiNamedToolChoice of this AssistantsApiNamedToolChoice.  # noqa: E501
        :rtype: AssistantsApiNamedToolChoice
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> str:
        """Gets the type of this AssistantsApiNamedToolChoice.

        The type of the tool. If type is `function`, the function name must be set  # noqa: E501

        :return: The type of this AssistantsApiNamedToolChoice.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this AssistantsApiNamedToolChoice.

        The type of the tool. If type is `function`, the function name must be set  # noqa: E501

        :param type: The type of this AssistantsApiNamedToolChoice.
        :type type: str
        """
        allowed_values = ["function", "code_interpreter", "retrieval"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def function(self) -> ChatCompletionNamedToolChoiceFunction:
        """Gets the function of this AssistantsApiNamedToolChoice.


        :return: The function of this AssistantsApiNamedToolChoice.
        :rtype: ChatCompletionNamedToolChoiceFunction
        """
        return self._function

    @function.setter
    def function(self, function: ChatCompletionNamedToolChoiceFunction):
        """Sets the function of this AssistantsApiNamedToolChoice.


        :param function: The function of this AssistantsApiNamedToolChoice.
        :type function: ChatCompletionNamedToolChoiceFunction
        """

        self._function = function
