# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.message_object import MessageObject  # noqa: F401,E501
from app.openapi_server.models.message_stream_event_one_of import MessageStreamEventOneOf  # noqa: F401,E501
from app.openapi_server.models.message_stream_event_one_of1 import MessageStreamEventOneOf1  # noqa: F401,E501
from app.openapi_server.models.message_stream_event_one_of2 import MessageStreamEventOneOf2  # noqa: F401,E501
from app.openapi_server.models.message_stream_event_one_of3 import MessageStreamEventOneOf3  # noqa: F401,E501
from app.openapi_server.models.message_stream_event_one_of4 import MessageStreamEventOneOf4  # noqa: F401,E501
from openapi_server import util


class MessageStreamEvent(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, event: str=None, data: MessageObject=None):  # noqa: E501
        """MessageStreamEvent - a model defined in Swagger

        :param event: The event of this MessageStreamEvent.  # noqa: E501
        :type event: str
        :param data: The data of this MessageStreamEvent.  # noqa: E501
        :type data: MessageObject
        """
        self.swagger_types = {
            'event': str,
            'data': MessageObject
        }

        self.attribute_map = {
            'event': 'event',
            'data': 'data'
        }

        self._event = event
        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'MessageStreamEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MessageStreamEvent of this MessageStreamEvent.  # noqa: E501
        :rtype: MessageStreamEvent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def event(self) -> str:
        """Gets the event of this MessageStreamEvent.


        :return: The event of this MessageStreamEvent.
        :rtype: str
        """
        return self._event

    @event.setter
    def event(self, event: str):
        """Sets the event of this MessageStreamEvent.


        :param event: The event of this MessageStreamEvent.
        :type event: str
        """
        allowed_values = ["thread.message.incomplete"]  # noqa: E501
        if event not in allowed_values:
            raise ValueError(
                "Invalid value for `event` ({0}), must be one of {1}"
                .format(event, allowed_values)
            )

        self._event = event

    @property
    def data(self) -> MessageObject:
        """Gets the data of this MessageStreamEvent.


        :return: The data of this MessageStreamEvent.
        :rtype: MessageObject
        """
        return self._data

    @data.setter
    def data(self, data: MessageObject):
        """Sets the data of this MessageStreamEvent.


        :param data: The data of this MessageStreamEvent.
        :type data: MessageObject
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data