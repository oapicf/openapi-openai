# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.open_ai_file import OpenAIFile  # noqa: F401,E501
from openapi_server import util


class ListFilesResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, data: List[OpenAIFile]=None, object: str=None):  # noqa: E501
        """ListFilesResponse - a model defined in Swagger

        :param data: The data of this ListFilesResponse.  # noqa: E501
        :type data: List[OpenAIFile]
        :param object: The object of this ListFilesResponse.  # noqa: E501
        :type object: str
        """
        self.swagger_types = {
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
    def from_dict(cls, dikt) -> 'ListFilesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListFilesResponse of this ListFilesResponse.  # noqa: E501
        :rtype: ListFilesResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[OpenAIFile]:
        """Gets the data of this ListFilesResponse.


        :return: The data of this ListFilesResponse.
        :rtype: List[OpenAIFile]
        """
        return self._data

    @data.setter
    def data(self, data: List[OpenAIFile]):
        """Sets the data of this ListFilesResponse.


        :param data: The data of this ListFilesResponse.
        :type data: List[OpenAIFile]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def object(self) -> str:
        """Gets the object of this ListFilesResponse.


        :return: The object of this ListFilesResponse.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object: str):
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
