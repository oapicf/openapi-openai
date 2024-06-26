# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from openapi_server import util


class ChatCompletionRequestSystemMessage(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, content: str=None, role: str=None, name: str=None):  # noqa: E501
        """ChatCompletionRequestSystemMessage - a model defined in Swagger

        :param content: The content of this ChatCompletionRequestSystemMessage.  # noqa: E501
        :type content: str
        :param role: The role of this ChatCompletionRequestSystemMessage.  # noqa: E501
        :type role: str
        :param name: The name of this ChatCompletionRequestSystemMessage.  # noqa: E501
        :type name: str
        """
        self.swagger_types = {
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
    def from_dict(cls, dikt) -> 'ChatCompletionRequestSystemMessage':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ChatCompletionRequestSystemMessage of this ChatCompletionRequestSystemMessage.  # noqa: E501
        :rtype: ChatCompletionRequestSystemMessage
        """
        return util.deserialize_model(dikt, cls)

    @property
    def content(self) -> str:
        """Gets the content of this ChatCompletionRequestSystemMessage.

        The contents of the system message.  # noqa: E501

        :return: The content of this ChatCompletionRequestSystemMessage.
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content: str):
        """Sets the content of this ChatCompletionRequestSystemMessage.

        The contents of the system message.  # noqa: E501

        :param content: The content of this ChatCompletionRequestSystemMessage.
        :type content: str
        """
        if content is None:
            raise ValueError("Invalid value for `content`, must not be `None`")  # noqa: E501

        self._content = content

    @property
    def role(self) -> str:
        """Gets the role of this ChatCompletionRequestSystemMessage.

        The role of the messages author, in this case `system`.  # noqa: E501

        :return: The role of this ChatCompletionRequestSystemMessage.
        :rtype: str
        """
        return self._role

    @role.setter
    def role(self, role: str):
        """Sets the role of this ChatCompletionRequestSystemMessage.

        The role of the messages author, in this case `system`.  # noqa: E501

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
    def name(self) -> str:
        """Gets the name of this ChatCompletionRequestSystemMessage.

        An optional name for the participant. Provides the model information to differentiate between participants of the same role.  # noqa: E501

        :return: The name of this ChatCompletionRequestSystemMessage.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ChatCompletionRequestSystemMessage.

        An optional name for the participant. Provides the model information to differentiate between participants of the same role.  # noqa: E501

        :param name: The name of this ChatCompletionRequestSystemMessage.
        :type name: str
        """

        self._name = name
