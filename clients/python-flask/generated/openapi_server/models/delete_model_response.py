from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class DeleteModelResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, object=None, deleted=None):  # noqa: E501
        """DeleteModelResponse - a model defined in OpenAPI

        :param id: The id of this DeleteModelResponse.  # noqa: E501
        :type id: str
        :param object: The object of this DeleteModelResponse.  # noqa: E501
        :type object: str
        :param deleted: The deleted of this DeleteModelResponse.  # noqa: E501
        :type deleted: bool
        """
        self.openapi_types = {
            'id': str,
            'object': str,
            'deleted': bool
        }

        self.attribute_map = {
            'id': 'id',
            'object': 'object',
            'deleted': 'deleted'
        }

        self._id = id
        self._object = object
        self._deleted = deleted

    @classmethod
    def from_dict(cls, dikt) -> 'DeleteModelResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DeleteModelResponse of this DeleteModelResponse.  # noqa: E501
        :rtype: DeleteModelResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this DeleteModelResponse.


        :return: The id of this DeleteModelResponse.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this DeleteModelResponse.


        :param id: The id of this DeleteModelResponse.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def object(self) -> str:
        """Gets the object of this DeleteModelResponse.


        :return: The object of this DeleteModelResponse.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object: str):
        """Sets the object of this DeleteModelResponse.


        :param object: The object of this DeleteModelResponse.
        :type object: str
        """
        if object is None:
            raise ValueError("Invalid value for `object`, must not be `None`")  # noqa: E501

        self._object = object

    @property
    def deleted(self) -> bool:
        """Gets the deleted of this DeleteModelResponse.


        :return: The deleted of this DeleteModelResponse.
        :rtype: bool
        """
        return self._deleted

    @deleted.setter
    def deleted(self, deleted: bool):
        """Sets the deleted of this DeleteModelResponse.


        :param deleted: The deleted of this DeleteModelResponse.
        :type deleted: bool
        """
        if deleted is None:
            raise ValueError("Invalid value for `deleted`, must not be `None`")  # noqa: E501

        self._deleted = deleted
