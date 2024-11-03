from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.run_step_object import RunStepObject
from openapi_server import util

from openapi_server.models.run_step_object import RunStepObject  # noqa: E501

class RunStepStreamEventOneOf1(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, event=None, data=None):  # noqa: E501
        """RunStepStreamEventOneOf1 - a model defined in OpenAPI

        :param event: The event of this RunStepStreamEventOneOf1.  # noqa: E501
        :type event: str
        :param data: The data of this RunStepStreamEventOneOf1.  # noqa: E501
        :type data: RunStepObject
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
    def from_dict(cls, dikt) -> 'RunStepStreamEventOneOf1':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RunStepStreamEvent_oneOf_1 of this RunStepStreamEventOneOf1.  # noqa: E501
        :rtype: RunStepStreamEventOneOf1
        """
        return util.deserialize_model(dikt, cls)

    @property
    def event(self) -> str:
        """Gets the event of this RunStepStreamEventOneOf1.


        :return: The event of this RunStepStreamEventOneOf1.
        :rtype: str
        """
        return self._event

    @event.setter
    def event(self, event: str):
        """Sets the event of this RunStepStreamEventOneOf1.


        :param event: The event of this RunStepStreamEventOneOf1.
        :type event: str
        """
        allowed_values = ["thread.run.step.in_progress"]  # noqa: E501
        if event not in allowed_values:
            raise ValueError(
                "Invalid value for `event` ({0}), must be one of {1}"
                .format(event, allowed_values)
            )

        self._event = event

    @property
    def data(self) -> RunStepObject:
        """Gets the data of this RunStepStreamEventOneOf1.


        :return: The data of this RunStepStreamEventOneOf1.
        :rtype: RunStepObject
        """
        return self._data

    @data.setter
    def data(self, data: RunStepObject):
        """Sets the data of this RunStepStreamEventOneOf1.


        :param data: The data of this RunStepStreamEventOneOf1.
        :type data: RunStepObject
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
