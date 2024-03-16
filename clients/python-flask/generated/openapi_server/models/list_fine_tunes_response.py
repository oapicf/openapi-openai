from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.fine_tune import FineTune
from openapi_server import util

from openapi_server.models.fine_tune import FineTune  # noqa: E501

class ListFineTunesResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, object=None, data=None):  # noqa: E501
        """ListFineTunesResponse - a model defined in OpenAPI

        :param object: The object of this ListFineTunesResponse.  # noqa: E501
        :type object: str
        :param data: The data of this ListFineTunesResponse.  # noqa: E501
        :type data: List[FineTune]
        """
        self.openapi_types = {
            'object': str,
            'data': List[FineTune]
        }

        self.attribute_map = {
            'object': 'object',
            'data': 'data'
        }

        self._object = object
        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'ListFineTunesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListFineTunesResponse of this ListFineTunesResponse.  # noqa: E501
        :rtype: ListFineTunesResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def object(self) -> str:
        """Gets the object of this ListFineTunesResponse.


        :return: The object of this ListFineTunesResponse.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object: str):
        """Sets the object of this ListFineTunesResponse.


        :param object: The object of this ListFineTunesResponse.
        :type object: str
        """
        if object is None:
            raise ValueError("Invalid value for `object`, must not be `None`")  # noqa: E501

        self._object = object

    @property
    def data(self) -> List[FineTune]:
        """Gets the data of this ListFineTunesResponse.


        :return: The data of this ListFineTunesResponse.
        :rtype: List[FineTune]
        """
        return self._data

    @data.setter
    def data(self, data: List[FineTune]):
        """Sets the data of this ListFineTunesResponse.


        :param data: The data of this ListFineTunesResponse.
        :type data: List[FineTune]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
