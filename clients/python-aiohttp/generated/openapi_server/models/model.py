# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class Model(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, created: int=None, object: str=None, owned_by: str=None):
        """Model - a model defined in OpenAPI

        :param id: The id of this Model.
        :param created: The created of this Model.
        :param object: The object of this Model.
        :param owned_by: The owned_by of this Model.
        """
        self.openapi_types = {
            'id': str,
            'created': int,
            'object': str,
            'owned_by': str
        }

        self.attribute_map = {
            'id': 'id',
            'created': 'created',
            'object': 'object',
            'owned_by': 'owned_by'
        }

        self._id = id
        self._created = created
        self._object = object
        self._owned_by = owned_by

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Model':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Model of this Model.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this Model.

        The model identifier, which can be referenced in the API endpoints.

        :return: The id of this Model.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Model.

        The model identifier, which can be referenced in the API endpoints.

        :param id: The id of this Model.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")

        self._id = id

    @property
    def created(self):
        """Gets the created of this Model.

        The Unix timestamp (in seconds) when the model was created.

        :return: The created of this Model.
        :rtype: int
        """
        return self._created

    @created.setter
    def created(self, created):
        """Sets the created of this Model.

        The Unix timestamp (in seconds) when the model was created.

        :param created: The created of this Model.
        :type created: int
        """
        if created is None:
            raise ValueError("Invalid value for `created`, must not be `None`")

        self._created = created

    @property
    def object(self):
        """Gets the object of this Model.

        The object type, which is always \"model\".

        :return: The object of this Model.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object):
        """Sets the object of this Model.

        The object type, which is always \"model\".

        :param object: The object of this Model.
        :type object: str
        """
        allowed_values = ["model"]  # noqa: E501
        if object not in allowed_values:
            raise ValueError(
                "Invalid value for `object` ({0}), must be one of {1}"
                .format(object, allowed_values)
            )

        self._object = object

    @property
    def owned_by(self):
        """Gets the owned_by of this Model.

        The organization that owns the model.

        :return: The owned_by of this Model.
        :rtype: str
        """
        return self._owned_by

    @owned_by.setter
    def owned_by(self, owned_by):
        """Sets the owned_by of this Model.

        The organization that owns the model.

        :param owned_by: The owned_by of this Model.
        :type owned_by: str
        """
        if owned_by is None:
            raise ValueError("Invalid value for `owned_by`, must not be `None`")

        self._owned_by = owned_by
