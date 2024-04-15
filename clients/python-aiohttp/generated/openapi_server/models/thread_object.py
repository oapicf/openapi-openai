# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class ThreadObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, object: str=None, created_at: int=None, metadata: object=None):
        """ThreadObject - a model defined in OpenAPI

        :param id: The id of this ThreadObject.
        :param object: The object of this ThreadObject.
        :param created_at: The created_at of this ThreadObject.
        :param metadata: The metadata of this ThreadObject.
        """
        self.openapi_types = {
            'id': str,
            'object': str,
            'created_at': int,
            'metadata': object
        }

        self.attribute_map = {
            'id': 'id',
            'object': 'object',
            'created_at': 'created_at',
            'metadata': 'metadata'
        }

        self._id = id
        self._object = object
        self._created_at = created_at
        self._metadata = metadata

    @classmethod
    def from_dict(cls, dikt: dict) -> 'ThreadObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ThreadObject of this ThreadObject.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this ThreadObject.

        The identifier, which can be referenced in API endpoints.

        :return: The id of this ThreadObject.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ThreadObject.

        The identifier, which can be referenced in API endpoints.

        :param id: The id of this ThreadObject.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")

        self._id = id

    @property
    def object(self):
        """Gets the object of this ThreadObject.

        The object type, which is always `thread`.

        :return: The object of this ThreadObject.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object):
        """Sets the object of this ThreadObject.

        The object type, which is always `thread`.

        :param object: The object of this ThreadObject.
        :type object: str
        """
        allowed_values = ["thread"]  # noqa: E501
        if object not in allowed_values:
            raise ValueError(
                "Invalid value for `object` ({0}), must be one of {1}"
                .format(object, allowed_values)
            )

        self._object = object

    @property
    def created_at(self):
        """Gets the created_at of this ThreadObject.

        The Unix timestamp (in seconds) for when the thread was created.

        :return: The created_at of this ThreadObject.
        :rtype: int
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at):
        """Sets the created_at of this ThreadObject.

        The Unix timestamp (in seconds) for when the thread was created.

        :param created_at: The created_at of this ThreadObject.
        :type created_at: int
        """
        if created_at is None:
            raise ValueError("Invalid value for `created_at`, must not be `None`")

        self._created_at = created_at

    @property
    def metadata(self):
        """Gets the metadata of this ThreadObject.

        Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 

        :return: The metadata of this ThreadObject.
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this ThreadObject.

        Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 

        :param metadata: The metadata of this ThreadObject.
        :type metadata: object
        """
        if metadata is None:
            raise ValueError("Invalid value for `metadata`, must not be `None`")

        self._metadata = metadata