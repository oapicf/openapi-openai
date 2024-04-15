# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.run_step_object import RunStepObject
from openapi_server import util


class RunStepStreamEventOneOf6(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, event: str=None, data: RunStepObject=None):
        """RunStepStreamEventOneOf6 - a model defined in OpenAPI

        :param event: The event of this RunStepStreamEventOneOf6.
        :param data: The data of this RunStepStreamEventOneOf6.
        """
        self.openapi_types = {
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
    def from_dict(cls, dikt: dict) -> 'RunStepStreamEventOneOf6':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The RunStepStreamEvent_oneOf_6 of this RunStepStreamEventOneOf6.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def event(self):
        """Gets the event of this RunStepStreamEventOneOf6.


        :return: The event of this RunStepStreamEventOneOf6.
        :rtype: str
        """
        return self._event

    @event.setter
    def event(self, event):
        """Sets the event of this RunStepStreamEventOneOf6.


        :param event: The event of this RunStepStreamEventOneOf6.
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
    def data(self):
        """Gets the data of this RunStepStreamEventOneOf6.


        :return: The data of this RunStepStreamEventOneOf6.
        :rtype: RunStepObject
        """
        return self._data

    @data.setter
    def data(self, data):
        """Sets the data of this RunStepStreamEventOneOf6.


        :param data: The data of this RunStepStreamEventOneOf6.
        :type data: RunStepObject
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")

        self._data = data