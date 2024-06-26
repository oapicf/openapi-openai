from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.thread_object import ThreadObject
from openapi_server import util

from openapi_server.models.thread_object import ThreadObject  # noqa: E501

class ThreadStreamEventOneOf(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, event=None, data=None):  # noqa: E501
        """ThreadStreamEventOneOf - a model defined in OpenAPI

        :param event: The event of this ThreadStreamEventOneOf.  # noqa: E501
        :type event: str
        :param data: The data of this ThreadStreamEventOneOf.  # noqa: E501
        :type data: ThreadObject
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
    def from_dict(cls, dikt) -> 'ThreadStreamEventOneOf':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ThreadStreamEvent_oneOf of this ThreadStreamEventOneOf.  # noqa: E501
        :rtype: ThreadStreamEventOneOf
        """
        return util.deserialize_model(dikt, cls)

    @property
    def event(self) -> str:
        """Gets the event of this ThreadStreamEventOneOf.


        :return: The event of this ThreadStreamEventOneOf.
        :rtype: str
        """
        return self._event

    @event.setter
    def event(self, event: str):
        """Sets the event of this ThreadStreamEventOneOf.


        :param event: The event of this ThreadStreamEventOneOf.
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
    def data(self) -> ThreadObject:
        """Gets the data of this ThreadStreamEventOneOf.


        :return: The data of this ThreadStreamEventOneOf.
        :rtype: ThreadObject
        """
        return self._data

    @data.setter
    def data(self, data: ThreadObject):
        """Sets the data of this ThreadStreamEventOneOf.


        :param data: The data of this ThreadStreamEventOneOf.
        :type data: ThreadObject
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
