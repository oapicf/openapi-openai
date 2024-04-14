from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class FineTuningJobError(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, code=None, message=None, param=None):  # noqa: E501
        """FineTuningJobError - a model defined in OpenAPI

        :param code: The code of this FineTuningJobError.  # noqa: E501
        :type code: str
        :param message: The message of this FineTuningJobError.  # noqa: E501
        :type message: str
        :param param: The param of this FineTuningJobError.  # noqa: E501
        :type param: str
        """
        self.openapi_types = {
            'code': str,
            'message': str,
            'param': str
        }

        self.attribute_map = {
            'code': 'code',
            'message': 'message',
            'param': 'param'
        }

        self._code = code
        self._message = message
        self._param = param

    @classmethod
    def from_dict(cls, dikt) -> 'FineTuningJobError':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FineTuningJob_error of this FineTuningJobError.  # noqa: E501
        :rtype: FineTuningJobError
        """
        return util.deserialize_model(dikt, cls)

    @property
    def code(self) -> str:
        """Gets the code of this FineTuningJobError.

        A machine-readable error code.  # noqa: E501

        :return: The code of this FineTuningJobError.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code: str):
        """Sets the code of this FineTuningJobError.

        A machine-readable error code.  # noqa: E501

        :param code: The code of this FineTuningJobError.
        :type code: str
        """
        if code is None:
            raise ValueError("Invalid value for `code`, must not be `None`")  # noqa: E501

        self._code = code

    @property
    def message(self) -> str:
        """Gets the message of this FineTuningJobError.

        A human-readable error message.  # noqa: E501

        :return: The message of this FineTuningJobError.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message: str):
        """Sets the message of this FineTuningJobError.

        A human-readable error message.  # noqa: E501

        :param message: The message of this FineTuningJobError.
        :type message: str
        """
        if message is None:
            raise ValueError("Invalid value for `message`, must not be `None`")  # noqa: E501

        self._message = message

    @property
    def param(self) -> str:
        """Gets the param of this FineTuningJobError.

        The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.  # noqa: E501

        :return: The param of this FineTuningJobError.
        :rtype: str
        """
        return self._param

    @param.setter
    def param(self, param: str):
        """Sets the param of this FineTuningJobError.

        The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.  # noqa: E501

        :param param: The param of this FineTuningJobError.
        :type param: str
        """
        if param is None:
            raise ValueError("Invalid value for `param`, must not be `None`")  # noqa: E501

        self._param = param
