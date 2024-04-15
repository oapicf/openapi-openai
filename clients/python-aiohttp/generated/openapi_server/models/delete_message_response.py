# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class DeleteMessageResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, deleted: bool=None, object: str=None):
        """DeleteMessageResponse - a model defined in OpenAPI

        :param id: The id of this DeleteMessageResponse.
        :param deleted: The deleted of this DeleteMessageResponse.
        :param object: The object of this DeleteMessageResponse.
        """
        self.openapi_types = {
            'id': str,
            'deleted': bool,
            'object': str
        }

        self.attribute_map = {
            'id': 'id',
            'deleted': 'deleted',
            'object': 'object'
        }

        self._id = id
        self._deleted = deleted
        self._object = object

    @classmethod
    def from_dict(cls, dikt: dict) -> 'DeleteMessageResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The DeleteMessageResponse of this DeleteMessageResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this DeleteMessageResponse.


        :return: The id of this DeleteMessageResponse.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this DeleteMessageResponse.


        :param id: The id of this DeleteMessageResponse.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")

        self._id = id

    @property
    def deleted(self):
        """Gets the deleted of this DeleteMessageResponse.


        :return: The deleted of this DeleteMessageResponse.
        :rtype: bool
        """
        return self._deleted

    @deleted.setter
    def deleted(self, deleted):
        """Sets the deleted of this DeleteMessageResponse.


        :param deleted: The deleted of this DeleteMessageResponse.
        :type deleted: bool
        """
        if deleted is None:
            raise ValueError("Invalid value for `deleted`, must not be `None`")

        self._deleted = deleted

    @property
    def object(self):
        """Gets the object of this DeleteMessageResponse.


        :return: The object of this DeleteMessageResponse.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object):
        """Sets the object of this DeleteMessageResponse.


        :param object: The object of this DeleteMessageResponse.
        :type object: str
        """
        allowed_values = ["thread.message.deleted"]  # noqa: E501
        if object not in allowed_values:
            raise ValueError(
                "Invalid value for `object` ({0}), must be one of {1}"
                .format(object, allowed_values)
            )

        self._object = object