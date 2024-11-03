# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from openapi_server import util


class DeleteAssistantResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, deleted: bool=None, object: str=None):  # noqa: E501
        """DeleteAssistantResponse - a model defined in Swagger

        :param id: The id of this DeleteAssistantResponse.  # noqa: E501
        :type id: str
        :param deleted: The deleted of this DeleteAssistantResponse.  # noqa: E501
        :type deleted: bool
        :param object: The object of this DeleteAssistantResponse.  # noqa: E501
        :type object: str
        """
        self.swagger_types = {
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
    def from_dict(cls, dikt) -> 'DeleteAssistantResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DeleteAssistantResponse of this DeleteAssistantResponse.  # noqa: E501
        :rtype: DeleteAssistantResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this DeleteAssistantResponse.


        :return: The id of this DeleteAssistantResponse.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this DeleteAssistantResponse.


        :param id: The id of this DeleteAssistantResponse.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def deleted(self) -> bool:
        """Gets the deleted of this DeleteAssistantResponse.


        :return: The deleted of this DeleteAssistantResponse.
        :rtype: bool
        """
        return self._deleted

    @deleted.setter
    def deleted(self, deleted: bool):
        """Sets the deleted of this DeleteAssistantResponse.


        :param deleted: The deleted of this DeleteAssistantResponse.
        :type deleted: bool
        """
        if deleted is None:
            raise ValueError("Invalid value for `deleted`, must not be `None`")  # noqa: E501

        self._deleted = deleted

    @property
    def object(self) -> str:
        """Gets the object of this DeleteAssistantResponse.


        :return: The object of this DeleteAssistantResponse.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object: str):
        """Sets the object of this DeleteAssistantResponse.


        :param object: The object of this DeleteAssistantResponse.
        :type object: str
        """
        allowed_values = ["assistant.deleted"]  # noqa: E501
        if object not in allowed_values:
            raise ValueError(
                "Invalid value for `object` ({0}), must be one of {1}"
                .format(object, allowed_values)
            )

        self._object = object
