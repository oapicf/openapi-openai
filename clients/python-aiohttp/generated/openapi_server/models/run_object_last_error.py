# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class RunObjectLastError(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, code: str=None, message: str=None):
        """RunObjectLastError - a model defined in OpenAPI

        :param code: The code of this RunObjectLastError.
        :param message: The message of this RunObjectLastError.
        """
        self.openapi_types = {
            'code': str,
            'message': str
        }

        self.attribute_map = {
            'code': 'code',
            'message': 'message'
        }

        self._code = code
        self._message = message

    @classmethod
    def from_dict(cls, dikt: dict) -> 'RunObjectLastError':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The RunObject_last_error of this RunObjectLastError.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def code(self):
        """Gets the code of this RunObjectLastError.

        One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.

        :return: The code of this RunObjectLastError.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code):
        """Sets the code of this RunObjectLastError.

        One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.

        :param code: The code of this RunObjectLastError.
        :type code: str
        """
        allowed_values = ["server_error", "rate_limit_exceeded", "invalid_prompt"]  # noqa: E501
        if code not in allowed_values:
            raise ValueError(
                "Invalid value for `code` ({0}), must be one of {1}"
                .format(code, allowed_values)
            )

        self._code = code

    @property
    def message(self):
        """Gets the message of this RunObjectLastError.

        A human-readable description of the error.

        :return: The message of this RunObjectLastError.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """Sets the message of this RunObjectLastError.

        A human-readable description of the error.

        :param message: The message of this RunObjectLastError.
        :type message: str
        """
        if message is None:
            raise ValueError("Invalid value for `message`, must not be `None`")

        self._message = message
