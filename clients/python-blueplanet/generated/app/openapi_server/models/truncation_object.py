# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from openapi_server import util


class TruncationObject(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, type: str=None, last_messages: int=None):  # noqa: E501
        """TruncationObject - a model defined in Swagger

        :param type: The type of this TruncationObject.  # noqa: E501
        :type type: str
        :param last_messages: The last_messages of this TruncationObject.  # noqa: E501
        :type last_messages: int
        """
        self.swagger_types = {
            'type': str,
            'last_messages': int
        }

        self.attribute_map = {
            'type': 'type',
            'last_messages': 'last_messages'
        }

        self._type = type
        self._last_messages = last_messages

    @classmethod
    def from_dict(cls, dikt) -> 'TruncationObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TruncationObject of this TruncationObject.  # noqa: E501
        :rtype: TruncationObject
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> str:
        """Gets the type of this TruncationObject.

        The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.  # noqa: E501

        :return: The type of this TruncationObject.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this TruncationObject.

        The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.  # noqa: E501

        :param type: The type of this TruncationObject.
        :type type: str
        """
        allowed_values = ["auto", "last_messages"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def last_messages(self) -> int:
        """Gets the last_messages of this TruncationObject.

        The number of most recent messages from the thread when constructing the context for the run.  # noqa: E501

        :return: The last_messages of this TruncationObject.
        :rtype: int
        """
        return self._last_messages

    @last_messages.setter
    def last_messages(self, last_messages: int):
        """Sets the last_messages of this TruncationObject.

        The number of most recent messages from the thread when constructing the context for the run.  # noqa: E501

        :param last_messages: The last_messages of this TruncationObject.
        :type last_messages: int
        """
        if last_messages is not None and last_messages < 1:  # noqa: E501
            raise ValueError("Invalid value for `last_messages`, must be a value greater than or equal to `1`")  # noqa: E501

        self._last_messages = last_messages
