# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.chat_completion_named_tool_choice_function import ChatCompletionNamedToolChoiceFunction
from openapi_server import util


class AssistantsApiNamedToolChoice(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type: str=None, function: ChatCompletionNamedToolChoiceFunction=None):
        """AssistantsApiNamedToolChoice - a model defined in OpenAPI

        :param type: The type of this AssistantsApiNamedToolChoice.
        :param function: The function of this AssistantsApiNamedToolChoice.
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
    def from_dict(cls, dikt: dict) -> 'AssistantsApiNamedToolChoice':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The AssistantsApiNamedToolChoice of this AssistantsApiNamedToolChoice.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self):
        """Gets the type of this AssistantsApiNamedToolChoice.

        The type of the tool. If type is `function`, the function name must be set

        :return: The type of this AssistantsApiNamedToolChoice.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this AssistantsApiNamedToolChoice.

        The type of the tool. If type is `function`, the function name must be set

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
    def function(self):
        """Gets the function of this AssistantsApiNamedToolChoice.


        :return: The function of this AssistantsApiNamedToolChoice.
        :rtype: ChatCompletionNamedToolChoiceFunction
        """
        return self._function

    @function.setter
    def function(self, function):
        """Sets the function of this AssistantsApiNamedToolChoice.


        :param function: The function of this AssistantsApiNamedToolChoice.
        :type function: ChatCompletionNamedToolChoiceFunction
        """

        self._function = function