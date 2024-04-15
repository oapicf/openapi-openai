# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class AssistantToolsRetrieval(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type: str=None):
        """AssistantToolsRetrieval - a model defined in OpenAPI

        :param type: The type of this AssistantToolsRetrieval.
        """
        self.openapi_types = {
            'type': str
        }

        self.attribute_map = {
            'type': 'type'
        }

        self._type = type

    @classmethod
    def from_dict(cls, dikt: dict) -> 'AssistantToolsRetrieval':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The AssistantToolsRetrieval of this AssistantToolsRetrieval.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self):
        """Gets the type of this AssistantToolsRetrieval.

        The type of tool being defined: `retrieval`

        :return: The type of this AssistantToolsRetrieval.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this AssistantToolsRetrieval.

        The type of tool being defined: `retrieval`

        :param type: The type of this AssistantToolsRetrieval.
        :type type: str
        """
        allowed_values = ["retrieval"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type