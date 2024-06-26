# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class AssistantFileObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, object: str=None, created_at: int=None, assistant_id: str=None):
        """AssistantFileObject - a model defined in OpenAPI

        :param id: The id of this AssistantFileObject.
        :param object: The object of this AssistantFileObject.
        :param created_at: The created_at of this AssistantFileObject.
        :param assistant_id: The assistant_id of this AssistantFileObject.
        """
        self.openapi_types = {
            'id': str,
            'object': str,
            'created_at': int,
            'assistant_id': str
        }

        self.attribute_map = {
            'id': 'id',
            'object': 'object',
            'created_at': 'created_at',
            'assistant_id': 'assistant_id'
        }

        self._id = id
        self._object = object
        self._created_at = created_at
        self._assistant_id = assistant_id

    @classmethod
    def from_dict(cls, dikt: dict) -> 'AssistantFileObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The AssistantFileObject of this AssistantFileObject.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this AssistantFileObject.

        The identifier, which can be referenced in API endpoints.

        :return: The id of this AssistantFileObject.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this AssistantFileObject.

        The identifier, which can be referenced in API endpoints.

        :param id: The id of this AssistantFileObject.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")

        self._id = id

    @property
    def object(self):
        """Gets the object of this AssistantFileObject.

        The object type, which is always `assistant.file`.

        :return: The object of this AssistantFileObject.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object):
        """Sets the object of this AssistantFileObject.

        The object type, which is always `assistant.file`.

        :param object: The object of this AssistantFileObject.
        :type object: str
        """
        allowed_values = ["assistant.file"]  # noqa: E501
        if object not in allowed_values:
            raise ValueError(
                "Invalid value for `object` ({0}), must be one of {1}"
                .format(object, allowed_values)
            )

        self._object = object

    @property
    def created_at(self):
        """Gets the created_at of this AssistantFileObject.

        The Unix timestamp (in seconds) for when the assistant file was created.

        :return: The created_at of this AssistantFileObject.
        :rtype: int
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at):
        """Sets the created_at of this AssistantFileObject.

        The Unix timestamp (in seconds) for when the assistant file was created.

        :param created_at: The created_at of this AssistantFileObject.
        :type created_at: int
        """
        if created_at is None:
            raise ValueError("Invalid value for `created_at`, must not be `None`")

        self._created_at = created_at

    @property
    def assistant_id(self):
        """Gets the assistant_id of this AssistantFileObject.

        The assistant ID that the file is attached to.

        :return: The assistant_id of this AssistantFileObject.
        :rtype: str
        """
        return self._assistant_id

    @assistant_id.setter
    def assistant_id(self, assistant_id):
        """Sets the assistant_id of this AssistantFileObject.

        The assistant ID that the file is attached to.

        :param assistant_id: The assistant_id of this AssistantFileObject.
        :type assistant_id: str
        """
        if assistant_id is None:
            raise ValueError("Invalid value for `assistant_id`, must not be `None`")

        self._assistant_id = assistant_id
