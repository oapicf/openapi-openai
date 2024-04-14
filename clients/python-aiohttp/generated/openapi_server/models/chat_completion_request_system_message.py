# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class ChatCompletionRequestSystemMessage(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, content: str=None, role: str=None, name: str=None):
        """ChatCompletionRequestSystemMessage - a model defined in OpenAPI

        :param content: The content of this ChatCompletionRequestSystemMessage.
        :param role: The role of this ChatCompletionRequestSystemMessage.
        :param name: The name of this ChatCompletionRequestSystemMessage.
        """
        self.openapi_types = {
            'content': str,
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
    def from_dict(cls, dikt: dict) -> 'ChatCompletionRequestSystemMessage':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ChatCompletionRequestSystemMessage of this ChatCompletionRequestSystemMessage.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def content(self):
        """Gets the content of this ChatCompletionRequestSystemMessage.

        The contents of the system message.

        :return: The content of this ChatCompletionRequestSystemMessage.
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content):
        """Sets the content of this ChatCompletionRequestSystemMessage.

        The contents of the system message.

        :param content: The content of this ChatCompletionRequestSystemMessage.
        :type content: str
        """
        if content is None:
            raise ValueError("Invalid value for `content`, must not be `None`")

        self._content = content

    @property
    def role(self):
        """Gets the role of this ChatCompletionRequestSystemMessage.

        The role of the messages author, in this case `system`.

        :return: The role of this ChatCompletionRequestSystemMessage.
        :rtype: str
        """
        return self._role

    @role.setter
    def role(self, role):
        """Sets the role of this ChatCompletionRequestSystemMessage.

        The role of the messages author, in this case `system`.

        :param role: The role of this ChatCompletionRequestSystemMessage.
        :type role: str
        """
        allowed_values = ["system"]  # noqa: E501
        if role not in allowed_values:
            raise ValueError(
                "Invalid value for `role` ({0}), must be one of {1}"
                .format(role, allowed_values)
            )

        self._role = role

    @property
    def name(self):
        """Gets the name of this ChatCompletionRequestSystemMessage.

        An optional name for the participant. Provides the model information to differentiate between participants of the same role.

        :return: The name of this ChatCompletionRequestSystemMessage.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ChatCompletionRequestSystemMessage.

        An optional name for the participant. Provides the model information to differentiate between participants of the same role.

        :param name: The name of this ChatCompletionRequestSystemMessage.
        :type name: str
        """

        self._name = name
