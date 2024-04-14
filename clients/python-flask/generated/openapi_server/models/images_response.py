from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.image import Image
from openapi_server import util

from openapi_server.models.image import Image  # noqa: E501

class ImagesResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, created=None, data=None):  # noqa: E501
        """ImagesResponse - a model defined in OpenAPI

        :param created: The created of this ImagesResponse.  # noqa: E501
        :type created: int
        :param data: The data of this ImagesResponse.  # noqa: E501
        :type data: List[Image]
        """
        self.openapi_types = {
            'created': int,
            'data': List[Image]
        }

        self.attribute_map = {
            'created': 'created',
            'data': 'data'
        }

        self._created = created
        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'ImagesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ImagesResponse of this ImagesResponse.  # noqa: E501
        :rtype: ImagesResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def created(self) -> int:
        """Gets the created of this ImagesResponse.


        :return: The created of this ImagesResponse.
        :rtype: int
        """
        return self._created

    @created.setter
    def created(self, created: int):
        """Sets the created of this ImagesResponse.


        :param created: The created of this ImagesResponse.
        :type created: int
        """
        if created is None:
            raise ValueError("Invalid value for `created`, must not be `None`")  # noqa: E501

        self._created = created

    @property
    def data(self) -> List[Image]:
        """Gets the data of this ImagesResponse.


        :return: The data of this ImagesResponse.
        :rtype: List[Image]
        """
        return self._data

    @data.setter
    def data(self, data: List[Image]):
        """Sets the data of this ImagesResponse.


        :param data: The data of this ImagesResponse.
        :type data: List[Image]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
