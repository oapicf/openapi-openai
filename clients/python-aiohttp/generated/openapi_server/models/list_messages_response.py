# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.message_object import MessageObject
from openapi_server import util


class ListMessagesResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, object: str=None, data: List[MessageObject]=None, first_id: str=None, last_id: str=None, has_more: bool=None):
        """ListMessagesResponse - a model defined in OpenAPI

        :param object: The object of this ListMessagesResponse.
        :param data: The data of this ListMessagesResponse.
        :param first_id: The first_id of this ListMessagesResponse.
        :param last_id: The last_id of this ListMessagesResponse.
        :param has_more: The has_more of this ListMessagesResponse.
        """
        self.openapi_types = {
            'object': str,
            'data': List[MessageObject],
            'first_id': str,
            'last_id': str,
            'has_more': bool
        }

        self.attribute_map = {
            'object': 'object',
            'data': 'data',
            'first_id': 'first_id',
            'last_id': 'last_id',
            'has_more': 'has_more'
        }

        self._object = object
        self._data = data
        self._first_id = first_id
        self._last_id = last_id
        self._has_more = has_more

    @classmethod
    def from_dict(cls, dikt: dict) -> 'ListMessagesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ListMessagesResponse of this ListMessagesResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def object(self):
        """Gets the object of this ListMessagesResponse.


        :return: The object of this ListMessagesResponse.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object):
        """Sets the object of this ListMessagesResponse.


        :param object: The object of this ListMessagesResponse.
        :type object: str
        """
        if object is None:
            raise ValueError("Invalid value for `object`, must not be `None`")

        self._object = object

    @property
    def data(self):
        """Gets the data of this ListMessagesResponse.


        :return: The data of this ListMessagesResponse.
        :rtype: List[MessageObject]
        """
        return self._data

    @data.setter
    def data(self, data):
        """Sets the data of this ListMessagesResponse.


        :param data: The data of this ListMessagesResponse.
        :type data: List[MessageObject]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")

        self._data = data

    @property
    def first_id(self):
        """Gets the first_id of this ListMessagesResponse.


        :return: The first_id of this ListMessagesResponse.
        :rtype: str
        """
        return self._first_id

    @first_id.setter
    def first_id(self, first_id):
        """Sets the first_id of this ListMessagesResponse.


        :param first_id: The first_id of this ListMessagesResponse.
        :type first_id: str
        """
        if first_id is None:
            raise ValueError("Invalid value for `first_id`, must not be `None`")

        self._first_id = first_id

    @property
    def last_id(self):
        """Gets the last_id of this ListMessagesResponse.


        :return: The last_id of this ListMessagesResponse.
        :rtype: str
        """
        return self._last_id

    @last_id.setter
    def last_id(self, last_id):
        """Sets the last_id of this ListMessagesResponse.


        :param last_id: The last_id of this ListMessagesResponse.
        :type last_id: str
        """
        if last_id is None:
            raise ValueError("Invalid value for `last_id`, must not be `None`")

        self._last_id = last_id

    @property
    def has_more(self):
        """Gets the has_more of this ListMessagesResponse.


        :return: The has_more of this ListMessagesResponse.
        :rtype: bool
        """
        return self._has_more

    @has_more.setter
    def has_more(self, has_more):
        """Sets the has_more of this ListMessagesResponse.


        :param has_more: The has_more of this ListMessagesResponse.
        :type has_more: bool
        """
        if has_more is None:
            raise ValueError("Invalid value for `has_more`, must not be `None`")

        self._has_more = has_more
