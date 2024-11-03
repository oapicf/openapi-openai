from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.run_step_object import RunStepObject
from openapi_server import util

from openapi_server.models.run_step_object import RunStepObject  # noqa: E501

class ListRunStepsResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, object=None, data=None, first_id=None, last_id=None, has_more=None):  # noqa: E501
        """ListRunStepsResponse - a model defined in OpenAPI

        :param object: The object of this ListRunStepsResponse.  # noqa: E501
        :type object: str
        :param data: The data of this ListRunStepsResponse.  # noqa: E501
        :type data: List[RunStepObject]
        :param first_id: The first_id of this ListRunStepsResponse.  # noqa: E501
        :type first_id: str
        :param last_id: The last_id of this ListRunStepsResponse.  # noqa: E501
        :type last_id: str
        :param has_more: The has_more of this ListRunStepsResponse.  # noqa: E501
        :type has_more: bool
        """
        self.openapi_types = {
            'object': str,
            'data': List[RunStepObject],
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
    def from_dict(cls, dikt) -> 'ListRunStepsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListRunStepsResponse of this ListRunStepsResponse.  # noqa: E501
        :rtype: ListRunStepsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def object(self) -> str:
        """Gets the object of this ListRunStepsResponse.


        :return: The object of this ListRunStepsResponse.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object: str):
        """Sets the object of this ListRunStepsResponse.


        :param object: The object of this ListRunStepsResponse.
        :type object: str
        """
        if object is None:
            raise ValueError("Invalid value for `object`, must not be `None`")  # noqa: E501

        self._object = object

    @property
    def data(self) -> List[RunStepObject]:
        """Gets the data of this ListRunStepsResponse.


        :return: The data of this ListRunStepsResponse.
        :rtype: List[RunStepObject]
        """
        return self._data

    @data.setter
    def data(self, data: List[RunStepObject]):
        """Sets the data of this ListRunStepsResponse.


        :param data: The data of this ListRunStepsResponse.
        :type data: List[RunStepObject]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def first_id(self) -> str:
        """Gets the first_id of this ListRunStepsResponse.


        :return: The first_id of this ListRunStepsResponse.
        :rtype: str
        """
        return self._first_id

    @first_id.setter
    def first_id(self, first_id: str):
        """Sets the first_id of this ListRunStepsResponse.


        :param first_id: The first_id of this ListRunStepsResponse.
        :type first_id: str
        """
        if first_id is None:
            raise ValueError("Invalid value for `first_id`, must not be `None`")  # noqa: E501

        self._first_id = first_id

    @property
    def last_id(self) -> str:
        """Gets the last_id of this ListRunStepsResponse.


        :return: The last_id of this ListRunStepsResponse.
        :rtype: str
        """
        return self._last_id

    @last_id.setter
    def last_id(self, last_id: str):
        """Sets the last_id of this ListRunStepsResponse.


        :param last_id: The last_id of this ListRunStepsResponse.
        :type last_id: str
        """
        if last_id is None:
            raise ValueError("Invalid value for `last_id`, must not be `None`")  # noqa: E501

        self._last_id = last_id

    @property
    def has_more(self) -> bool:
        """Gets the has_more of this ListRunStepsResponse.


        :return: The has_more of this ListRunStepsResponse.
        :rtype: bool
        """
        return self._has_more

    @has_more.setter
    def has_more(self, has_more: bool):
        """Sets the has_more of this ListRunStepsResponse.


        :param has_more: The has_more of this ListRunStepsResponse.
        :type has_more: bool
        """
        if has_more is None:
            raise ValueError("Invalid value for `has_more`, must not be `None`")  # noqa: E501

        self._has_more = has_more
