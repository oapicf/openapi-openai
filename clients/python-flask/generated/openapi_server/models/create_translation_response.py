from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CreateTranslationResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, text=None):  # noqa: E501
        """CreateTranslationResponse - a model defined in OpenAPI

        :param text: The text of this CreateTranslationResponse.  # noqa: E501
        :type text: str
        """
        self.openapi_types = {
            'text': str
        }

        self.attribute_map = {
            'text': 'text'
        }

        self._text = text

    @classmethod
    def from_dict(cls, dikt) -> 'CreateTranslationResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateTranslationResponse of this CreateTranslationResponse.  # noqa: E501
        :rtype: CreateTranslationResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def text(self) -> str:
        """Gets the text of this CreateTranslationResponse.


        :return: The text of this CreateTranslationResponse.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text: str):
        """Sets the text of this CreateTranslationResponse.


        :param text: The text of this CreateTranslationResponse.
        :type text: str
        """
        if text is None:
            raise ValueError("Invalid value for `text`, must not be `None`")  # noqa: E501

        self._text = text
