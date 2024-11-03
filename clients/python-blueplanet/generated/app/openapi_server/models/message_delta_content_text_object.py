# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.message_delta_content_text_object_text import MessageDeltaContentTextObjectText  # noqa: F401,E501
from openapi_server import util


class MessageDeltaContentTextObject(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, index: int=None, type: str=None, text: MessageDeltaContentTextObjectText=None):  # noqa: E501
        """MessageDeltaContentTextObject - a model defined in Swagger

        :param index: The index of this MessageDeltaContentTextObject.  # noqa: E501
        :type index: int
        :param type: The type of this MessageDeltaContentTextObject.  # noqa: E501
        :type type: str
        :param text: The text of this MessageDeltaContentTextObject.  # noqa: E501
        :type text: MessageDeltaContentTextObjectText
        """
        self.swagger_types = {
            'index': int,
            'type': str,
            'text': MessageDeltaContentTextObjectText
        }

        self.attribute_map = {
            'index': 'index',
            'type': 'type',
            'text': 'text'
        }

        self._index = index
        self._type = type
        self._text = text

    @classmethod
    def from_dict(cls, dikt) -> 'MessageDeltaContentTextObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MessageDeltaContentTextObject of this MessageDeltaContentTextObject.  # noqa: E501
        :rtype: MessageDeltaContentTextObject
        """
        return util.deserialize_model(dikt, cls)

    @property
    def index(self) -> int:
        """Gets the index of this MessageDeltaContentTextObject.

        The index of the content part in the message.  # noqa: E501

        :return: The index of this MessageDeltaContentTextObject.
        :rtype: int
        """
        return self._index

    @index.setter
    def index(self, index: int):
        """Sets the index of this MessageDeltaContentTextObject.

        The index of the content part in the message.  # noqa: E501

        :param index: The index of this MessageDeltaContentTextObject.
        :type index: int
        """
        if index is None:
            raise ValueError("Invalid value for `index`, must not be `None`")  # noqa: E501

        self._index = index

    @property
    def type(self) -> str:
        """Gets the type of this MessageDeltaContentTextObject.

        Always `text`.  # noqa: E501

        :return: The type of this MessageDeltaContentTextObject.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this MessageDeltaContentTextObject.

        Always `text`.  # noqa: E501

        :param type: The type of this MessageDeltaContentTextObject.
        :type type: str
        """
        allowed_values = ["text"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def text(self) -> MessageDeltaContentTextObjectText:
        """Gets the text of this MessageDeltaContentTextObject.


        :return: The text of this MessageDeltaContentTextObject.
        :rtype: MessageDeltaContentTextObjectText
        """
        return self._text

    @text.setter
    def text(self, text: MessageDeltaContentTextObjectText):
        """Sets the text of this MessageDeltaContentTextObject.


        :param text: The text of this MessageDeltaContentTextObject.
        :type text: MessageDeltaContentTextObjectText
        """

        self._text = text
