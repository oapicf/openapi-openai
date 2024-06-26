from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.assistant_file_object import AssistantFileObject
from openapi_server import util

from openapi_server.models.assistant_file_object import AssistantFileObject  # noqa: E501

class ListAssistantFilesResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, object=None, data=None, first_id=None, last_id=None, has_more=None):  # noqa: E501
        """ListAssistantFilesResponse - a model defined in OpenAPI

        :param object: The object of this ListAssistantFilesResponse.  # noqa: E501
        :type object: str
        :param data: The data of this ListAssistantFilesResponse.  # noqa: E501
        :type data: List[AssistantFileObject]
        :param first_id: The first_id of this ListAssistantFilesResponse.  # noqa: E501
        :type first_id: str
        :param last_id: The last_id of this ListAssistantFilesResponse.  # noqa: E501
        :type last_id: str
        :param has_more: The has_more of this ListAssistantFilesResponse.  # noqa: E501
        :type has_more: bool
        """
        self.openapi_types = {
            'object': str,
            'data': List[AssistantFileObject],
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
    def from_dict(cls, dikt) -> 'ListAssistantFilesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListAssistantFilesResponse of this ListAssistantFilesResponse.  # noqa: E501
        :rtype: ListAssistantFilesResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def object(self) -> str:
        """Gets the object of this ListAssistantFilesResponse.


        :return: The object of this ListAssistantFilesResponse.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object: str):
        """Sets the object of this ListAssistantFilesResponse.


        :param object: The object of this ListAssistantFilesResponse.
        :type object: str
        """
        if object is None:
            raise ValueError("Invalid value for `object`, must not be `None`")  # noqa: E501

        self._object = object

    @property
    def data(self) -> List[AssistantFileObject]:
        """Gets the data of this ListAssistantFilesResponse.


        :return: The data of this ListAssistantFilesResponse.
        :rtype: List[AssistantFileObject]
        """
        return self._data

    @data.setter
    def data(self, data: List[AssistantFileObject]):
        """Sets the data of this ListAssistantFilesResponse.


        :param data: The data of this ListAssistantFilesResponse.
        :type data: List[AssistantFileObject]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def first_id(self) -> str:
        """Gets the first_id of this ListAssistantFilesResponse.


        :return: The first_id of this ListAssistantFilesResponse.
        :rtype: str
        """
        return self._first_id

    @first_id.setter
    def first_id(self, first_id: str):
        """Sets the first_id of this ListAssistantFilesResponse.


        :param first_id: The first_id of this ListAssistantFilesResponse.
        :type first_id: str
        """
        if first_id is None:
            raise ValueError("Invalid value for `first_id`, must not be `None`")  # noqa: E501

        self._first_id = first_id

    @property
    def last_id(self) -> str:
        """Gets the last_id of this ListAssistantFilesResponse.


        :return: The last_id of this ListAssistantFilesResponse.
        :rtype: str
        """
        return self._last_id

    @last_id.setter
    def last_id(self, last_id: str):
        """Sets the last_id of this ListAssistantFilesResponse.


        :param last_id: The last_id of this ListAssistantFilesResponse.
        :type last_id: str
        """
        if last_id is None:
            raise ValueError("Invalid value for `last_id`, must not be `None`")  # noqa: E501

        self._last_id = last_id

    @property
    def has_more(self) -> bool:
        """Gets the has_more of this ListAssistantFilesResponse.


        :return: The has_more of this ListAssistantFilesResponse.
        :rtype: bool
        """
        return self._has_more

    @has_more.setter
    def has_more(self, has_more: bool):
        """Sets the has_more of this ListAssistantFilesResponse.


        :param has_more: The has_more of this ListAssistantFilesResponse.
        :type has_more: bool
        """
        if has_more is None:
            raise ValueError("Invalid value for `has_more`, must not be `None`")  # noqa: E501

        self._has_more = has_more
