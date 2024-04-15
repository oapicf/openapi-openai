# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.thread_object import ThreadObject
from openapi_server.models.thread_stream_event_one_of import ThreadStreamEventOneOf
from openapi_server import util


class ThreadStreamEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, event: str=None, data: ThreadObject=None):
        """ThreadStreamEvent - a model defined in OpenAPI

        :param event: The event of this ThreadStreamEvent.
        :param data: The data of this ThreadStreamEvent.
        """
        self.openapi_types = {
            'event': str,
            'data': ThreadObject
        }

        self.attribute_map = {
            'event': 'event',
            'data': 'data'
        }

        self._event = event
        self._data = data

    @classmethod
    def from_dict(cls, dikt: dict) -> 'ThreadStreamEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ThreadStreamEvent of this ThreadStreamEvent.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def event(self):
        """Gets the event of this ThreadStreamEvent.


        :return: The event of this ThreadStreamEvent.
        :rtype: str
        """
        return self._event

    @event.setter
    def event(self, event):
        """Sets the event of this ThreadStreamEvent.


        :param event: The event of this ThreadStreamEvent.
        :type event: str
        """
        allowed_values = ["thread.created"]  # noqa: E501
        if event not in allowed_values:
            raise ValueError(
                "Invalid value for `event` ({0}), must be one of {1}"
                .format(event, allowed_values)
            )

        self._event = event

    @property
    def data(self):
        """Gets the data of this ThreadStreamEvent.


        :return: The data of this ThreadStreamEvent.
        :rtype: ThreadObject
        """
        return self._data

    @data.setter
    def data(self, data):
        """Sets the data of this ThreadStreamEvent.


        :param data: The data of this ThreadStreamEvent.
        :type data: ThreadObject
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")

        self._data = data