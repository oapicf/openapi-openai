from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class DeleteAssistantFileResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, deleted=None, object=None):  # noqa: E501
        """DeleteAssistantFileResponse - a model defined in OpenAPI

        :param id: The id of this DeleteAssistantFileResponse.  # noqa: E501
        :type id: str
        :param deleted: The deleted of this DeleteAssistantFileResponse.  # noqa: E501
        :type deleted: bool
        :param object: The object of this DeleteAssistantFileResponse.  # noqa: E501
        :type object: str
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
    def from_dict(cls, dikt) -> 'DeleteAssistantFileResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DeleteAssistantFileResponse of this DeleteAssistantFileResponse.  # noqa: E501
        :rtype: DeleteAssistantFileResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this DeleteAssistantFileResponse.


        :return: The id of this DeleteAssistantFileResponse.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this DeleteAssistantFileResponse.


        :param id: The id of this DeleteAssistantFileResponse.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def deleted(self) -> bool:
        """Gets the deleted of this DeleteAssistantFileResponse.


        :return: The deleted of this DeleteAssistantFileResponse.
        :rtype: bool
        """
        return self._deleted

    @deleted.setter
    def deleted(self, deleted: bool):
        """Sets the deleted of this DeleteAssistantFileResponse.


        :param deleted: The deleted of this DeleteAssistantFileResponse.
        :type deleted: bool
        """
        if deleted is None:
            raise ValueError("Invalid value for `deleted`, must not be `None`")  # noqa: E501

        self._deleted = deleted

    @property
    def object(self) -> str:
        """Gets the object of this DeleteAssistantFileResponse.


        :return: The object of this DeleteAssistantFileResponse.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object: str):
        """Sets the object of this DeleteAssistantFileResponse.


        :param object: The object of this DeleteAssistantFileResponse.
        :type object: str
        """
        allowed_values = ["assistant.file.deleted"]  # noqa: E501
        if object not in allowed_values:
            raise ValueError(
                "Invalid value for `object` ({0}), must be one of {1}"
                .format(object, allowed_values)
            )

        self._object = object
