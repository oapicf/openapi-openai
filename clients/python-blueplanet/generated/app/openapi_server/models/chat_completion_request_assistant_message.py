# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.chat_completion_message_tool_call import ChatCompletionMessageToolCall  # noqa: F401,E501
from app.openapi_server.models.chat_completion_request_assistant_message_function_call import ChatCompletionRequestAssistantMessageFunctionCall  # noqa: F401,E501
from openapi_server import util


class ChatCompletionRequestAssistantMessage(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, content: str=None, role: str=None, name: str=None, tool_calls: List[ChatCompletionMessageToolCall]=None, function_call: ChatCompletionRequestAssistantMessageFunctionCall=None):  # noqa: E501
        """ChatCompletionRequestAssistantMessage - a model defined in Swagger

        :param content: The content of this ChatCompletionRequestAssistantMessage.  # noqa: E501
        :type content: str
        :param role: The role of this ChatCompletionRequestAssistantMessage.  # noqa: E501
        :type role: str
        :param name: The name of this ChatCompletionRequestAssistantMessage.  # noqa: E501
        :type name: str
        :param tool_calls: The tool_calls of this ChatCompletionRequestAssistantMessage.  # noqa: E501
        :type tool_calls: List[ChatCompletionMessageToolCall]
        :param function_call: The function_call of this ChatCompletionRequestAssistantMessage.  # noqa: E501
        :type function_call: ChatCompletionRequestAssistantMessageFunctionCall
        """
        self.swagger_types = {
            'content': str,
            'role': str,
            'name': str,
            'tool_calls': List[ChatCompletionMessageToolCall],
            'function_call': ChatCompletionRequestAssistantMessageFunctionCall
        }

        self.attribute_map = {
            'content': 'content',
            'role': 'role',
            'name': 'name',
            'tool_calls': 'tool_calls',
            'function_call': 'function_call'
        }

        self._content = content
        self._role = role
        self._name = name
        self._tool_calls = tool_calls
        self._function_call = function_call

    @classmethod
    def from_dict(cls, dikt) -> 'ChatCompletionRequestAssistantMessage':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ChatCompletionRequestAssistantMessage of this ChatCompletionRequestAssistantMessage.  # noqa: E501
        :rtype: ChatCompletionRequestAssistantMessage
        """
        return util.deserialize_model(dikt, cls)

    @property
    def content(self) -> str:
        """Gets the content of this ChatCompletionRequestAssistantMessage.

        The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified.   # noqa: E501

        :return: The content of this ChatCompletionRequestAssistantMessage.
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content: str):
        """Sets the content of this ChatCompletionRequestAssistantMessage.

        The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified.   # noqa: E501

        :param content: The content of this ChatCompletionRequestAssistantMessage.
        :type content: str
        """

        self._content = content

    @property
    def role(self) -> str:
        """Gets the role of this ChatCompletionRequestAssistantMessage.

        The role of the messages author, in this case `assistant`.  # noqa: E501

        :return: The role of this ChatCompletionRequestAssistantMessage.
        :rtype: str
        """
        return self._role

    @role.setter
    def role(self, role: str):
        """Sets the role of this ChatCompletionRequestAssistantMessage.

        The role of the messages author, in this case `assistant`.  # noqa: E501

        :param role: The role of this ChatCompletionRequestAssistantMessage.
        :type role: str
        """
        allowed_values = ["assistant"]  # noqa: E501
        if role not in allowed_values:
            raise ValueError(
                "Invalid value for `role` ({0}), must be one of {1}"
                .format(role, allowed_values)
            )

        self._role = role

    @property
    def name(self) -> str:
        """Gets the name of this ChatCompletionRequestAssistantMessage.

        An optional name for the participant. Provides the model information to differentiate between participants of the same role.  # noqa: E501

        :return: The name of this ChatCompletionRequestAssistantMessage.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ChatCompletionRequestAssistantMessage.

        An optional name for the participant. Provides the model information to differentiate between participants of the same role.  # noqa: E501

        :param name: The name of this ChatCompletionRequestAssistantMessage.
        :type name: str
        """

        self._name = name

    @property
    def tool_calls(self) -> List[ChatCompletionMessageToolCall]:
        """Gets the tool_calls of this ChatCompletionRequestAssistantMessage.

        The tool calls generated by the model, such as function calls.  # noqa: E501

        :return: The tool_calls of this ChatCompletionRequestAssistantMessage.
        :rtype: List[ChatCompletionMessageToolCall]
        """
        return self._tool_calls

    @tool_calls.setter
    def tool_calls(self, tool_calls: List[ChatCompletionMessageToolCall]):
        """Sets the tool_calls of this ChatCompletionRequestAssistantMessage.

        The tool calls generated by the model, such as function calls.  # noqa: E501

        :param tool_calls: The tool_calls of this ChatCompletionRequestAssistantMessage.
        :type tool_calls: List[ChatCompletionMessageToolCall]
        """

        self._tool_calls = tool_calls

    @property
    def function_call(self) -> ChatCompletionRequestAssistantMessageFunctionCall:
        """Gets the function_call of this ChatCompletionRequestAssistantMessage.


        :return: The function_call of this ChatCompletionRequestAssistantMessage.
        :rtype: ChatCompletionRequestAssistantMessageFunctionCall
        """
        return self._function_call

    @function_call.setter
    def function_call(self, function_call: ChatCompletionRequestAssistantMessageFunctionCall):
        """Sets the function_call of this ChatCompletionRequestAssistantMessage.


        :param function_call: The function_call of this ChatCompletionRequestAssistantMessage.
        :type function_call: ChatCompletionRequestAssistantMessageFunctionCall
        """

        self._function_call = function_call
