from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Error(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, code=None, message=None, param=None, type=None):  # noqa: E501
        """Error - a model defined in OpenAPI

        :param code: The code of this Error.  # noqa: E501
        :type code: str
        :param message: The message of this Error.  # noqa: E501
        :type message: str
        :param param: The param of this Error.  # noqa: E501
        :type param: str
        :param type: The type of this Error.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'code': str,
            'message': str,
            'param': str,
            'type': str
        }

        self.attribute_map = {
            'code': 'code',
            'message': 'message',
            'param': 'param',
            'type': 'type'
        }

        self._code = code
        self._message = message
        self._param = param
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'Error':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Error of this Error.  # noqa: E501
        :rtype: Error
        """
        return util.deserialize_model(dikt, cls)

    @property
    def code(self) -> str:
        """Gets the code of this Error.


        :return: The code of this Error.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code: str):
        """Sets the code of this Error.


        :param code: The code of this Error.
        :type code: str
        """
        if code is None:
            raise ValueError("Invalid value for `code`, must not be `None`")  # noqa: E501

        self._code = code

    @property
    def message(self) -> str:
        """Gets the message of this Error.


        :return: The message of this Error.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message: str):
        """Sets the message of this Error.


        :param message: The message of this Error.
        :type message: str
        """
        if message is None:
            raise ValueError("Invalid value for `message`, must not be `None`")  # noqa: E501

        self._message = message

    @property
    def param(self) -> str:
        """Gets the param of this Error.


        :return: The param of this Error.
        :rtype: str
        """
        return self._param

    @param.setter
    def param(self, param: str):
        """Sets the param of this Error.


        :param param: The param of this Error.
        :type param: str
        """
        if param is None:
            raise ValueError("Invalid value for `param`, must not be `None`")  # noqa: E501

        self._param = param

    @property
    def type(self) -> str:
        """Gets the type of this Error.


        :return: The type of this Error.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this Error.


        :param type: The type of this Error.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type
