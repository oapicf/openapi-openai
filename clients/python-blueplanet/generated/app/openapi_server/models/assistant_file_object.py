# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from openapi_server import util


class AssistantFileObject(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, object: str=None, created_at: int=None, assistant_id: str=None):  # noqa: E501
        """AssistantFileObject - a model defined in Swagger

        :param id: The id of this AssistantFileObject.  # noqa: E501
        :type id: str
        :param object: The object of this AssistantFileObject.  # noqa: E501
        :type object: str
        :param created_at: The created_at of this AssistantFileObject.  # noqa: E501
        :type created_at: int
        :param assistant_id: The assistant_id of this AssistantFileObject.  # noqa: E501
        :type assistant_id: str
        """
        self.swagger_types = {
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
    def from_dict(cls, dikt) -> 'AssistantFileObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AssistantFileObject of this AssistantFileObject.  # noqa: E501
        :rtype: AssistantFileObject
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this AssistantFileObject.

        The identifier, which can be referenced in API endpoints.  # noqa: E501

        :return: The id of this AssistantFileObject.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this AssistantFileObject.

        The identifier, which can be referenced in API endpoints.  # noqa: E501

        :param id: The id of this AssistantFileObject.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def object(self) -> str:
        """Gets the object of this AssistantFileObject.

        The object type, which is always `assistant.file`.  # noqa: E501

        :return: The object of this AssistantFileObject.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object: str):
        """Sets the object of this AssistantFileObject.

        The object type, which is always `assistant.file`.  # noqa: E501

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
    def created_at(self) -> int:
        """Gets the created_at of this AssistantFileObject.

        The Unix timestamp (in seconds) for when the assistant file was created.  # noqa: E501

        :return: The created_at of this AssistantFileObject.
        :rtype: int
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: int):
        """Sets the created_at of this AssistantFileObject.

        The Unix timestamp (in seconds) for when the assistant file was created.  # noqa: E501

        :param created_at: The created_at of this AssistantFileObject.
        :type created_at: int
        """
        if created_at is None:
            raise ValueError("Invalid value for `created_at`, must not be `None`")  # noqa: E501

        self._created_at = created_at

    @property
    def assistant_id(self) -> str:
        """Gets the assistant_id of this AssistantFileObject.

        The assistant ID that the file is attached to.  # noqa: E501

        :return: The assistant_id of this AssistantFileObject.
        :rtype: str
        """
        return self._assistant_id

    @assistant_id.setter
    def assistant_id(self, assistant_id: str):
        """Sets the assistant_id of this AssistantFileObject.

        The assistant ID that the file is attached to.  # noqa: E501

        :param assistant_id: The assistant_id of this AssistantFileObject.
        :type assistant_id: str
        """
        if assistant_id is None:
            raise ValueError("Invalid value for `assistant_id`, must not be `None`")  # noqa: E501

        self._assistant_id = assistant_id
