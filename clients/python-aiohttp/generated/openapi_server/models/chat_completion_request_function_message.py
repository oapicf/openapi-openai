# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class ChatCompletionRequestFunctionMessage(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, role: str=None, content: str=None, name: str=None):
        """ChatCompletionRequestFunctionMessage - a model defined in OpenAPI

        :param role: The role of this ChatCompletionRequestFunctionMessage.
        :param content: The content of this ChatCompletionRequestFunctionMessage.
        :param name: The name of this ChatCompletionRequestFunctionMessage.
        """
        self.openapi_types = {
            'role': str,
            'content': str,
            'name': str
        }

        self.attribute_map = {
            'role': 'role',
            'content': 'content',
            'name': 'name'
        }

        self._role = role
        self._content = content
        self._name = name

    @classmethod
    def from_dict(cls, dikt: dict) -> 'ChatCompletionRequestFunctionMessage':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ChatCompletionRequestFunctionMessage of this ChatCompletionRequestFunctionMessage.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def role(self):
        """Gets the role of this ChatCompletionRequestFunctionMessage.

        The role of the messages author, in this case `function`.

        :return: The role of this ChatCompletionRequestFunctionMessage.
        :rtype: str
        """
        return self._role

    @role.setter
    def role(self, role):
        """Sets the role of this ChatCompletionRequestFunctionMessage.

        The role of the messages author, in this case `function`.

        :param role: The role of this ChatCompletionRequestFunctionMessage.
        :type role: str
        """
        allowed_values = ["function"]  # noqa: E501
        if role not in allowed_values:
            raise ValueError(
                "Invalid value for `role` ({0}), must be one of {1}"
                .format(role, allowed_values)
            )

        self._role = role

    @property
    def content(self):
        """Gets the content of this ChatCompletionRequestFunctionMessage.

        The contents of the function message.

        :return: The content of this ChatCompletionRequestFunctionMessage.
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content):
        """Sets the content of this ChatCompletionRequestFunctionMessage.

        The contents of the function message.

        :param content: The content of this ChatCompletionRequestFunctionMessage.
        :type content: str
        """
        if content is None:
            raise ValueError("Invalid value for `content`, must not be `None`")

        self._content = content

    @property
    def name(self):
        """Gets the name of this ChatCompletionRequestFunctionMessage.

        The name of the function to call.

        :return: The name of this ChatCompletionRequestFunctionMessage.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ChatCompletionRequestFunctionMessage.

        The name of the function to call.

        :param name: The name of this ChatCompletionRequestFunctionMessage.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")

        self._name = name
