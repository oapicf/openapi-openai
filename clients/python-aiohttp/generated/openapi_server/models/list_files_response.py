# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.open_ai_file import OpenAIFile
from openapi_server import util


class ListFilesResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data: List[OpenAIFile]=None, object: str=None):
        """ListFilesResponse - a model defined in OpenAPI

        :param data: The data of this ListFilesResponse.
        :param object: The object of this ListFilesResponse.
        """
        self.openapi_types = {
            'data': List[OpenAIFile],
            'object': str
        }

        self.attribute_map = {
            'data': 'data',
            'object': 'object'
        }

        self._data = data
        self._object = object

    @classmethod
    def from_dict(cls, dikt: dict) -> 'ListFilesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ListFilesResponse of this ListFilesResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self):
        """Gets the data of this ListFilesResponse.


        :return: The data of this ListFilesResponse.
        :rtype: List[OpenAIFile]
        """
        return self._data

    @data.setter
    def data(self, data):
        """Sets the data of this ListFilesResponse.


        :param data: The data of this ListFilesResponse.
        :type data: List[OpenAIFile]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")

        self._data = data

    @property
    def object(self):
        """Gets the object of this ListFilesResponse.


        :return: The object of this ListFilesResponse.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object):
        """Sets the object of this ListFilesResponse.


        :param object: The object of this ListFilesResponse.
        :type object: str
        """
        allowed_values = ["list"]  # noqa: E501
        if object not in allowed_values:
            raise ValueError(
                "Invalid value for `object` ({0}), must be one of {1}"
                .format(object, allowed_values)
            )

        self._object = object