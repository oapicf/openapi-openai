# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.chat_completion_request_message_function_call import ChatCompletionRequestMessageFunctionCall
from openapi_server import util


class ChatCompletionStreamResponseDelta(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, role: str=None, content: str=None, function_call: ChatCompletionRequestMessageFunctionCall=None):
        """ChatCompletionStreamResponseDelta - a model defined in OpenAPI

        :param role: The role of this ChatCompletionStreamResponseDelta.
        :param content: The content of this ChatCompletionStreamResponseDelta.
        :param function_call: The function_call of this ChatCompletionStreamResponseDelta.
        """
        self.openapi_types = {
            'role': str,
            'content': str,
            'function_call': ChatCompletionRequestMessageFunctionCall
        }

        self.attribute_map = {
            'role': 'role',
            'content': 'content',
            'function_call': 'function_call'
        }

        self._role = role
        self._content = content
        self._function_call = function_call

    @classmethod
    def from_dict(cls, dikt: dict) -> 'ChatCompletionStreamResponseDelta':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ChatCompletionStreamResponseDelta of this ChatCompletionStreamResponseDelta.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def role(self):
        """Gets the role of this ChatCompletionStreamResponseDelta.

        The role of the author of this message.

        :return: The role of this ChatCompletionStreamResponseDelta.
        :rtype: str
        """
        return self._role

    @role.setter
    def role(self, role):
        """Sets the role of this ChatCompletionStreamResponseDelta.

        The role of the author of this message.

        :param role: The role of this ChatCompletionStreamResponseDelta.
        :type role: str
        """
        allowed_values = ["system", "user", "assistant", "function"]  # noqa: E501
        if role not in allowed_values:
            raise ValueError(
                "Invalid value for `role` ({0}), must be one of {1}"
                .format(role, allowed_values)
            )

        self._role = role

    @property
    def content(self):
        """Gets the content of this ChatCompletionStreamResponseDelta.

        The contents of the chunk message.

        :return: The content of this ChatCompletionStreamResponseDelta.
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content):
        """Sets the content of this ChatCompletionStreamResponseDelta.

        The contents of the chunk message.

        :param content: The content of this ChatCompletionStreamResponseDelta.
        :type content: str
        """

        self._content = content

    @property
    def function_call(self):
        """Gets the function_call of this ChatCompletionStreamResponseDelta.


        :return: The function_call of this ChatCompletionStreamResponseDelta.
        :rtype: ChatCompletionRequestMessageFunctionCall
        """
        return self._function_call

    @function_call.setter
    def function_call(self, function_call):
        """Sets the function_call of this ChatCompletionStreamResponseDelta.


        :param function_call: The function_call of this ChatCompletionStreamResponseDelta.
        :type function_call: ChatCompletionRequestMessageFunctionCall
        """

        self._function_call = function_call
