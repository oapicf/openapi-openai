from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class MessageFileObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, object=None, created_at=None, message_id=None):  # noqa: E501
        """MessageFileObject - a model defined in OpenAPI

        :param id: The id of this MessageFileObject.  # noqa: E501
        :type id: str
        :param object: The object of this MessageFileObject.  # noqa: E501
        :type object: str
        :param created_at: The created_at of this MessageFileObject.  # noqa: E501
        :type created_at: int
        :param message_id: The message_id of this MessageFileObject.  # noqa: E501
        :type message_id: str
        """
        self.openapi_types = {
            'id': str,
            'object': str,
            'created_at': int,
            'message_id': str
        }

        self.attribute_map = {
            'id': 'id',
            'object': 'object',
            'created_at': 'created_at',
            'message_id': 'message_id'
        }

        self._id = id
        self._object = object
        self._created_at = created_at
        self._message_id = message_id

    @classmethod
    def from_dict(cls, dikt) -> 'MessageFileObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MessageFileObject of this MessageFileObject.  # noqa: E501
        :rtype: MessageFileObject
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this MessageFileObject.

        The identifier, which can be referenced in API endpoints.  # noqa: E501

        :return: The id of this MessageFileObject.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this MessageFileObject.

        The identifier, which can be referenced in API endpoints.  # noqa: E501

        :param id: The id of this MessageFileObject.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def object(self) -> str:
        """Gets the object of this MessageFileObject.

        The object type, which is always `thread.message.file`.  # noqa: E501

        :return: The object of this MessageFileObject.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object: str):
        """Sets the object of this MessageFileObject.

        The object type, which is always `thread.message.file`.  # noqa: E501

        :param object: The object of this MessageFileObject.
        :type object: str
        """
        allowed_values = ["thread.message.file"]  # noqa: E501
        if object not in allowed_values:
            raise ValueError(
                "Invalid value for `object` ({0}), must be one of {1}"
                .format(object, allowed_values)
            )

        self._object = object

    @property
    def created_at(self) -> int:
        """Gets the created_at of this MessageFileObject.

        The Unix timestamp (in seconds) for when the message file was created.  # noqa: E501

        :return: The created_at of this MessageFileObject.
        :rtype: int
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: int):
        """Sets the created_at of this MessageFileObject.

        The Unix timestamp (in seconds) for when the message file was created.  # noqa: E501

        :param created_at: The created_at of this MessageFileObject.
        :type created_at: int
        """
        if created_at is None:
            raise ValueError("Invalid value for `created_at`, must not be `None`")  # noqa: E501

        self._created_at = created_at

    @property
    def message_id(self) -> str:
        """Gets the message_id of this MessageFileObject.

        The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.  # noqa: E501

        :return: The message_id of this MessageFileObject.
        :rtype: str
        """
        return self._message_id

    @message_id.setter
    def message_id(self, message_id: str):
        """Sets the message_id of this MessageFileObject.

        The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.  # noqa: E501

        :param message_id: The message_id of this MessageFileObject.
        :type message_id: str
        """
        if message_id is None:
            raise ValueError("Invalid value for `message_id`, must not be `None`")  # noqa: E501

        self._message_id = message_id