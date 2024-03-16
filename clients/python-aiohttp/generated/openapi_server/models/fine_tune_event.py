# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class FineTuneEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, object: str=None, created_at: int=None, level: str=None, message: str=None):
        """FineTuneEvent - a model defined in OpenAPI

        :param object: The object of this FineTuneEvent.
        :param created_at: The created_at of this FineTuneEvent.
        :param level: The level of this FineTuneEvent.
        :param message: The message of this FineTuneEvent.
        """
        self.openapi_types = {
            'object': str,
            'created_at': int,
            'level': str,
            'message': str
        }

        self.attribute_map = {
            'object': 'object',
            'created_at': 'created_at',
            'level': 'level',
            'message': 'message'
        }

        self._object = object
        self._created_at = created_at
        self._level = level
        self._message = message

    @classmethod
    def from_dict(cls, dikt: dict) -> 'FineTuneEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The FineTuneEvent of this FineTuneEvent.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def object(self):
        """Gets the object of this FineTuneEvent.


        :return: The object of this FineTuneEvent.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object):
        """Sets the object of this FineTuneEvent.


        :param object: The object of this FineTuneEvent.
        :type object: str
        """
        if object is None:
            raise ValueError("Invalid value for `object`, must not be `None`")

        self._object = object

    @property
    def created_at(self):
        """Gets the created_at of this FineTuneEvent.


        :return: The created_at of this FineTuneEvent.
        :rtype: int
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at):
        """Sets the created_at of this FineTuneEvent.


        :param created_at: The created_at of this FineTuneEvent.
        :type created_at: int
        """
        if created_at is None:
            raise ValueError("Invalid value for `created_at`, must not be `None`")

        self._created_at = created_at

    @property
    def level(self):
        """Gets the level of this FineTuneEvent.


        :return: The level of this FineTuneEvent.
        :rtype: str
        """
        return self._level

    @level.setter
    def level(self, level):
        """Sets the level of this FineTuneEvent.


        :param level: The level of this FineTuneEvent.
        :type level: str
        """
        if level is None:
            raise ValueError("Invalid value for `level`, must not be `None`")

        self._level = level

    @property
    def message(self):
        """Gets the message of this FineTuneEvent.


        :return: The message of this FineTuneEvent.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """Sets the message of this FineTuneEvent.


        :param message: The message of this FineTuneEvent.
        :type message: str
        """
        if message is None:
            raise ValueError("Invalid value for `message`, must not be `None`")

        self._message = message
