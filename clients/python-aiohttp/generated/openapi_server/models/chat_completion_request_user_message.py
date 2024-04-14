# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.chat_completion_request_user_message_content import ChatCompletionRequestUserMessageContent
from openapi_server import util


class ChatCompletionRequestUserMessage(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, content: ChatCompletionRequestUserMessageContent=None, role: str=None, name: str=None):
        """ChatCompletionRequestUserMessage - a model defined in OpenAPI

        :param content: The content of this ChatCompletionRequestUserMessage.
        :param role: The role of this ChatCompletionRequestUserMessage.
        :param name: The name of this ChatCompletionRequestUserMessage.
        """
        self.openapi_types = {
            'content': ChatCompletionRequestUserMessageContent,
            'role': str,
            'name': str
        }

        self.attribute_map = {
            'content': 'content',
            'role': 'role',
            'name': 'name'
        }

        self._content = content
        self._role = role
        self._name = name

    @classmethod
    def from_dict(cls, dikt: dict) -> 'ChatCompletionRequestUserMessage':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ChatCompletionRequestUserMessage of this ChatCompletionRequestUserMessage.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def content(self):
        """Gets the content of this ChatCompletionRequestUserMessage.


        :return: The content of this ChatCompletionRequestUserMessage.
        :rtype: ChatCompletionRequestUserMessageContent
        """
        return self._content

    @content.setter
    def content(self, content):
        """Sets the content of this ChatCompletionRequestUserMessage.


        :param content: The content of this ChatCompletionRequestUserMessage.
        :type content: ChatCompletionRequestUserMessageContent
        """
        if content is None:
            raise ValueError("Invalid value for `content`, must not be `None`")

        self._content = content

    @property
    def role(self):
        """Gets the role of this ChatCompletionRequestUserMessage.

        The role of the messages author, in this case `user`.

        :return: The role of this ChatCompletionRequestUserMessage.
        :rtype: str
        """
        return self._role

    @role.setter
    def role(self, role):
        """Sets the role of this ChatCompletionRequestUserMessage.

        The role of the messages author, in this case `user`.

        :param role: The role of this ChatCompletionRequestUserMessage.
        :type role: str
        """
        allowed_values = ["user"]  # noqa: E501
        if role not in allowed_values:
            raise ValueError(
                "Invalid value for `role` ({0}), must be one of {1}"
                .format(role, allowed_values)
            )

        self._role = role

    @property
    def name(self):
        """Gets the name of this ChatCompletionRequestUserMessage.

        An optional name for the participant. Provides the model information to differentiate between participants of the same role.

        :return: The name of this ChatCompletionRequestUserMessage.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ChatCompletionRequestUserMessage.

        An optional name for the participant. Provides the model information to differentiate between participants of the same role.

        :param name: The name of this ChatCompletionRequestUserMessage.
        :type name: str
        """

        self._name = name
