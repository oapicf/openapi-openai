# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.run_step_object import RunStepObject  # noqa: F401,E501
from app.openapi_server.models.run_step_stream_event_one_of import RunStepStreamEventOneOf  # noqa: F401,E501
from app.openapi_server.models.run_step_stream_event_one_of1 import RunStepStreamEventOneOf1  # noqa: F401,E501
from app.openapi_server.models.run_step_stream_event_one_of2 import RunStepStreamEventOneOf2  # noqa: F401,E501
from app.openapi_server.models.run_step_stream_event_one_of3 import RunStepStreamEventOneOf3  # noqa: F401,E501
from app.openapi_server.models.run_step_stream_event_one_of4 import RunStepStreamEventOneOf4  # noqa: F401,E501
from app.openapi_server.models.run_step_stream_event_one_of5 import RunStepStreamEventOneOf5  # noqa: F401,E501
from app.openapi_server.models.run_step_stream_event_one_of6 import RunStepStreamEventOneOf6  # noqa: F401,E501
from openapi_server import util


class RunStepStreamEvent(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, event: str=None, data: RunStepObject=None):  # noqa: E501
        """RunStepStreamEvent - a model defined in Swagger

        :param event: The event of this RunStepStreamEvent.  # noqa: E501
        :type event: str
        :param data: The data of this RunStepStreamEvent.  # noqa: E501
        :type data: RunStepObject
        """
        self.swagger_types = {
            'event': str,
            'data': RunStepObject
        }

        self.attribute_map = {
            'event': 'event',
            'data': 'data'
        }

        self._event = event
        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'RunStepStreamEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RunStepStreamEvent of this RunStepStreamEvent.  # noqa: E501
        :rtype: RunStepStreamEvent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def event(self) -> str:
        """Gets the event of this RunStepStreamEvent.


        :return: The event of this RunStepStreamEvent.
        :rtype: str
        """
        return self._event

    @event.setter
    def event(self, event: str):
        """Sets the event of this RunStepStreamEvent.


        :param event: The event of this RunStepStreamEvent.
        :type event: str
        """
        allowed_values = ["thread.run.step.expired"]  # noqa: E501
        if event not in allowed_values:
            raise ValueError(
                "Invalid value for `event` ({0}), must be one of {1}"
                .format(event, allowed_values)
            )

        self._event = event

    @property
    def data(self) -> RunStepObject:
        """Gets the data of this RunStepStreamEvent.


        :return: The data of this RunStepStreamEvent.
        :rtype: RunStepObject
        """
        return self._data

    @data.setter
    def data(self, data: RunStepObject):
        """Sets the data of this RunStepStreamEvent.


        :param data: The data of this RunStepStreamEvent.
        :type data: RunStepObject
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
