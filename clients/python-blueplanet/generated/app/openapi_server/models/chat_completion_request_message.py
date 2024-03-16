# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.chat_completion_request_message_function_call import ChatCompletionRequestMessageFunctionCall  # noqa: F401,E501
from openapi_server import util


class ChatCompletionRequestMessage(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, role: str=None, content: str=None, name: str=None, function_call: ChatCompletionRequestMessageFunctionCall=None):  # noqa: E501
        """ChatCompletionRequestMessage - a model defined in Swagger

        :param role: The role of this ChatCompletionRequestMessage.  # noqa: E501
        :type role: str
        :param content: The content of this ChatCompletionRequestMessage.  # noqa: E501
        :type content: str
        :param name: The name of this ChatCompletionRequestMessage.  # noqa: E501
        :type name: str
        :param function_call: The function_call of this ChatCompletionRequestMessage.  # noqa: E501
        :type function_call: ChatCompletionRequestMessageFunctionCall
        """
        self.swagger_types = {
            'role': str,
            'content': str,
            'name': str,
            'function_call': ChatCompletionRequestMessageFunctionCall
        }

        self.attribute_map = {
            'role': 'role',
            'content': 'content',
            'name': 'name',
            'function_call': 'function_call'
        }

        self._role = role
        self._content = content
        self._name = name
        self._function_call = function_call

    @classmethod
    def from_dict(cls, dikt) -> 'ChatCompletionRequestMessage':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ChatCompletionRequestMessage of this ChatCompletionRequestMessage.  # noqa: E501
        :rtype: ChatCompletionRequestMessage
        """
        return util.deserialize_model(dikt, cls)

    @property
    def role(self) -> str:
        """Gets the role of this ChatCompletionRequestMessage.

        The role of the messages author. One of `system`, `user`, `assistant`, or `function`.  # noqa: E501

        :return: The role of this ChatCompletionRequestMessage.
        :rtype: str
        """
        return self._role

    @role.setter
    def role(self, role: str):
        """Sets the role of this ChatCompletionRequestMessage.

        The role of the messages author. One of `system`, `user`, `assistant`, or `function`.  # noqa: E501

        :param role: The role of this ChatCompletionRequestMessage.
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
    def content(self) -> str:
        """Gets the content of this ChatCompletionRequestMessage.

        The contents of the message. `content` is required for all messages except assistant messages with function calls.  # noqa: E501

        :return: The content of this ChatCompletionRequestMessage.
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content: str):
        """Sets the content of this ChatCompletionRequestMessage.

        The contents of the message. `content` is required for all messages except assistant messages with function calls.  # noqa: E501

        :param content: The content of this ChatCompletionRequestMessage.
        :type content: str
        """

        self._content = content

    @property
    def name(self) -> str:
        """Gets the name of this ChatCompletionRequestMessage.

        The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.  # noqa: E501

        :return: The name of this ChatCompletionRequestMessage.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ChatCompletionRequestMessage.

        The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.  # noqa: E501

        :param name: The name of this ChatCompletionRequestMessage.
        :type name: str
        """

        self._name = name

    @property
    def function_call(self) -> ChatCompletionRequestMessageFunctionCall:
        """Gets the function_call of this ChatCompletionRequestMessage.


        :return: The function_call of this ChatCompletionRequestMessage.
        :rtype: ChatCompletionRequestMessageFunctionCall
        """
        return self._function_call

    @function_call.setter
    def function_call(self, function_call: ChatCompletionRequestMessageFunctionCall):
        """Sets the function_call of this ChatCompletionRequestMessage.


        :param function_call: The function_call of this ChatCompletionRequestMessage.
        :type function_call: ChatCompletionRequestMessageFunctionCall
        """

        self._function_call = function_call