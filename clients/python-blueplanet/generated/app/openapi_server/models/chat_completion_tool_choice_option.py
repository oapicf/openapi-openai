# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.chat_completion_named_tool_choice import ChatCompletionNamedToolChoice  # noqa: F401,E501
from app.openapi_server.models.chat_completion_named_tool_choice_function import ChatCompletionNamedToolChoiceFunction  # noqa: F401,E501
from openapi_server import util


class ChatCompletionToolChoiceOption(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, type: str=None, function: ChatCompletionNamedToolChoiceFunction=None):  # noqa: E501
        """ChatCompletionToolChoiceOption - a model defined in Swagger

        :param type: The type of this ChatCompletionToolChoiceOption.  # noqa: E501
        :type type: str
        :param function: The function of this ChatCompletionToolChoiceOption.  # noqa: E501
        :type function: ChatCompletionNamedToolChoiceFunction
        """
        self.swagger_types = {
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
    def from_dict(cls, dikt) -> 'ChatCompletionToolChoiceOption':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ChatCompletionToolChoiceOption of this ChatCompletionToolChoiceOption.  # noqa: E501
        :rtype: ChatCompletionToolChoiceOption
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> str:
        """Gets the type of this ChatCompletionToolChoiceOption.

        The type of the tool. Currently, only `function` is supported.  # noqa: E501

        :return: The type of this ChatCompletionToolChoiceOption.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this ChatCompletionToolChoiceOption.

        The type of the tool. Currently, only `function` is supported.  # noqa: E501

        :param type: The type of this ChatCompletionToolChoiceOption.
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
    def function(self) -> ChatCompletionNamedToolChoiceFunction:
        """Gets the function of this ChatCompletionToolChoiceOption.


        :return: The function of this ChatCompletionToolChoiceOption.
        :rtype: ChatCompletionNamedToolChoiceFunction
        """
        return self._function

    @function.setter
    def function(self, function: ChatCompletionNamedToolChoiceFunction):
        """Sets the function of this ChatCompletionToolChoiceOption.


        :param function: The function of this ChatCompletionToolChoiceOption.
        :type function: ChatCompletionNamedToolChoiceFunction
        """
        if function is None:
            raise ValueError("Invalid value for `function`, must not be `None`")  # noqa: E501

        self._function = function
