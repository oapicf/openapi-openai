# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class ChatCompletionRequestMessageContentPartText(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type: str=None, text: str=None):
        """ChatCompletionRequestMessageContentPartText - a model defined in OpenAPI

        :param type: The type of this ChatCompletionRequestMessageContentPartText.
        :param text: The text of this ChatCompletionRequestMessageContentPartText.
        """
        self.openapi_types = {
            'type': str,
            'text': str
        }

        self.attribute_map = {
            'type': 'type',
            'text': 'text'
        }

        self._type = type
        self._text = text

    @classmethod
    def from_dict(cls, dikt: dict) -> 'ChatCompletionRequestMessageContentPartText':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ChatCompletionRequestMessageContentPartText of this ChatCompletionRequestMessageContentPartText.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self):
        """Gets the type of this ChatCompletionRequestMessageContentPartText.

        The type of the content part.

        :return: The type of this ChatCompletionRequestMessageContentPartText.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this ChatCompletionRequestMessageContentPartText.

        The type of the content part.

        :param type: The type of this ChatCompletionRequestMessageContentPartText.
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
    def text(self):
        """Gets the text of this ChatCompletionRequestMessageContentPartText.

        The text content.

        :return: The text of this ChatCompletionRequestMessageContentPartText.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text):
        """Sets the text of this ChatCompletionRequestMessageContentPartText.

        The text content.

        :param text: The text of this ChatCompletionRequestMessageContentPartText.
        :type text: str
        """
        if text is None:
            raise ValueError("Invalid value for `text`, must not be `None`")

        self._text = text