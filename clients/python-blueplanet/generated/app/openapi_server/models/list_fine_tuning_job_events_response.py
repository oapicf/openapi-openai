# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.fine_tuning_job_event import FineTuningJobEvent  # noqa: F401,E501
from openapi_server import util


class ListFineTuningJobEventsResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, data: List[FineTuningJobEvent]=None, object: str=None):  # noqa: E501
        """ListFineTuningJobEventsResponse - a model defined in Swagger

        :param data: The data of this ListFineTuningJobEventsResponse.  # noqa: E501
        :type data: List[FineTuningJobEvent]
        :param object: The object of this ListFineTuningJobEventsResponse.  # noqa: E501
        :type object: str
        """
        self.swagger_types = {
            'data': List[FineTuningJobEvent],
            'object': str
        }

        self.attribute_map = {
            'data': 'data',
            'object': 'object'
        }

        self._data = data
        self._object = object

    @classmethod
    def from_dict(cls, dikt) -> 'ListFineTuningJobEventsResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListFineTuningJobEventsResponse of this ListFineTuningJobEventsResponse.  # noqa: E501
        :rtype: ListFineTuningJobEventsResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[FineTuningJobEvent]:
        """Gets the data of this ListFineTuningJobEventsResponse.


        :return: The data of this ListFineTuningJobEventsResponse.
        :rtype: List[FineTuningJobEvent]
        """
        return self._data

    @data.setter
    def data(self, data: List[FineTuningJobEvent]):
        """Sets the data of this ListFineTuningJobEventsResponse.


        :param data: The data of this ListFineTuningJobEventsResponse.
        :type data: List[FineTuningJobEvent]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def object(self) -> str:
        """Gets the object of this ListFineTuningJobEventsResponse.


        :return: The object of this ListFineTuningJobEventsResponse.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object: str):
        """Sets the object of this ListFineTuningJobEventsResponse.


        :param object: The object of this ListFineTuningJobEventsResponse.
        :type object: str
        """
        allowed_values = ["list"]  # noqa: E501
        if object not in allowed_values:
            raise ValueError(
                "Invalid value for `object` ({0}), must be one of {1}"
                .format(object, allowed_values)
            )

        self._object = object
