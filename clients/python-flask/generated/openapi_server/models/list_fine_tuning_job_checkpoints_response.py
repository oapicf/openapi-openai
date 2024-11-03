from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.fine_tuning_job_checkpoint import FineTuningJobCheckpoint
from openapi_server import util

from openapi_server.models.fine_tuning_job_checkpoint import FineTuningJobCheckpoint  # noqa: E501

class ListFineTuningJobCheckpointsResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, object=None, first_id=None, last_id=None, has_more=None):  # noqa: E501
        """ListFineTuningJobCheckpointsResponse - a model defined in OpenAPI

        :param data: The data of this ListFineTuningJobCheckpointsResponse.  # noqa: E501
        :type data: List[FineTuningJobCheckpoint]
        :param object: The object of this ListFineTuningJobCheckpointsResponse.  # noqa: E501
        :type object: str
        :param first_id: The first_id of this ListFineTuningJobCheckpointsResponse.  # noqa: E501
        :type first_id: str
        :param last_id: The last_id of this ListFineTuningJobCheckpointsResponse.  # noqa: E501
        :type last_id: str
        :param has_more: The has_more of this ListFineTuningJobCheckpointsResponse.  # noqa: E501
        :type has_more: bool
        """
        self.openapi_types = {
            'data': List[FineTuningJobCheckpoint],
            'object': str,
            'first_id': str,
            'last_id': str,
            'has_more': bool
        }

        self.attribute_map = {
            'data': 'data',
            'object': 'object',
            'first_id': 'first_id',
            'last_id': 'last_id',
            'has_more': 'has_more'
        }

        self._data = data
        self._object = object
        self._first_id = first_id
        self._last_id = last_id
        self._has_more = has_more

    @classmethod
    def from_dict(cls, dikt) -> 'ListFineTuningJobCheckpointsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListFineTuningJobCheckpointsResponse of this ListFineTuningJobCheckpointsResponse.  # noqa: E501
        :rtype: ListFineTuningJobCheckpointsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[FineTuningJobCheckpoint]:
        """Gets the data of this ListFineTuningJobCheckpointsResponse.


        :return: The data of this ListFineTuningJobCheckpointsResponse.
        :rtype: List[FineTuningJobCheckpoint]
        """
        return self._data

    @data.setter
    def data(self, data: List[FineTuningJobCheckpoint]):
        """Sets the data of this ListFineTuningJobCheckpointsResponse.


        :param data: The data of this ListFineTuningJobCheckpointsResponse.
        :type data: List[FineTuningJobCheckpoint]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def object(self) -> str:
        """Gets the object of this ListFineTuningJobCheckpointsResponse.


        :return: The object of this ListFineTuningJobCheckpointsResponse.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object: str):
        """Sets the object of this ListFineTuningJobCheckpointsResponse.


        :param object: The object of this ListFineTuningJobCheckpointsResponse.
        :type object: str
        """
        allowed_values = ["list"]  # noqa: E501
        if object not in allowed_values:
            raise ValueError(
                "Invalid value for `object` ({0}), must be one of {1}"
                .format(object, allowed_values)
            )

        self._object = object

    @property
    def first_id(self) -> str:
        """Gets the first_id of this ListFineTuningJobCheckpointsResponse.


        :return: The first_id of this ListFineTuningJobCheckpointsResponse.
        :rtype: str
        """
        return self._first_id

    @first_id.setter
    def first_id(self, first_id: str):
        """Sets the first_id of this ListFineTuningJobCheckpointsResponse.


        :param first_id: The first_id of this ListFineTuningJobCheckpointsResponse.
        :type first_id: str
        """

        self._first_id = first_id

    @property
    def last_id(self) -> str:
        """Gets the last_id of this ListFineTuningJobCheckpointsResponse.


        :return: The last_id of this ListFineTuningJobCheckpointsResponse.
        :rtype: str
        """
        return self._last_id

    @last_id.setter
    def last_id(self, last_id: str):
        """Sets the last_id of this ListFineTuningJobCheckpointsResponse.


        :param last_id: The last_id of this ListFineTuningJobCheckpointsResponse.
        :type last_id: str
        """

        self._last_id = last_id

    @property
    def has_more(self) -> bool:
        """Gets the has_more of this ListFineTuningJobCheckpointsResponse.


        :return: The has_more of this ListFineTuningJobCheckpointsResponse.
        :rtype: bool
        """
        return self._has_more

    @has_more.setter
    def has_more(self, has_more: bool):
        """Sets the has_more of this ListFineTuningJobCheckpointsResponse.


        :param has_more: The has_more of this ListFineTuningJobCheckpointsResponse.
        :type has_more: bool
        """
        if has_more is None:
            raise ValueError("Invalid value for `has_more`, must not be `None`")  # noqa: E501

        self._has_more = has_more
