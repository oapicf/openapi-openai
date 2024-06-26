# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.chat_completion_named_tool_choice_function import ChatCompletionNamedToolChoiceFunction
from openapi_server import util


class ChatCompletionNamedToolChoice(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type: str=None, function: ChatCompletionNamedToolChoiceFunction=None):
        """ChatCompletionNamedToolChoice - a model defined in OpenAPI

        :param type: The type of this ChatCompletionNamedToolChoice.
        :param function: The function of this ChatCompletionNamedToolChoice.
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
    def from_dict(cls, dikt: dict) -> 'ChatCompletionNamedToolChoice':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ChatCompletionNamedToolChoice of this ChatCompletionNamedToolChoice.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self):
        """Gets the type of this ChatCompletionNamedToolChoice.

        The type of the tool. Currently, only `function` is supported.

        :return: The type of this ChatCompletionNamedToolChoice.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this ChatCompletionNamedToolChoice.

        The type of the tool. Currently, only `function` is supported.

        :param type: The type of this ChatCompletionNamedToolChoice.
        :type type: str
        """
        allowed_values = ["function"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def function(self):
        """Gets the function of this ChatCompletionNamedToolChoice.


        :return: The function of this ChatCompletionNamedToolChoice.
        :rtype: ChatCompletionNamedToolChoiceFunction
        """
        return self._function

    @function.setter
    def function(self, function):
        """Sets the function of this ChatCompletionNamedToolChoice.


        :param function: The function of this ChatCompletionNamedToolChoice.
        :type function: ChatCompletionNamedToolChoiceFunction
        """
        if function is None:
            raise ValueError("Invalid value for `function`, must not be `None`")

        self._function = function
