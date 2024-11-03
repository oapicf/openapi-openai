# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.create_embedding_response_usage import CreateEmbeddingResponseUsage  # noqa: F401,E501
from app.openapi_server.models.embedding import Embedding  # noqa: F401,E501
from openapi_server import util


class CreateEmbeddingResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, data: List[Embedding]=None, model: str=None, object: str=None, usage: CreateEmbeddingResponseUsage=None):  # noqa: E501
        """CreateEmbeddingResponse - a model defined in Swagger

        :param data: The data of this CreateEmbeddingResponse.  # noqa: E501
        :type data: List[Embedding]
        :param model: The model of this CreateEmbeddingResponse.  # noqa: E501
        :type model: str
        :param object: The object of this CreateEmbeddingResponse.  # noqa: E501
        :type object: str
        :param usage: The usage of this CreateEmbeddingResponse.  # noqa: E501
        :type usage: CreateEmbeddingResponseUsage
        """
        self.swagger_types = {
            'data': List[Embedding],
            'model': str,
            'object': str,
            'usage': CreateEmbeddingResponseUsage
        }

        self.attribute_map = {
            'data': 'data',
            'model': 'model',
            'object': 'object',
            'usage': 'usage'
        }

        self._data = data
        self._model = model
        self._object = object
        self._usage = usage

    @classmethod
    def from_dict(cls, dikt) -> 'CreateEmbeddingResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateEmbeddingResponse of this CreateEmbeddingResponse.  # noqa: E501
        :rtype: CreateEmbeddingResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[Embedding]:
        """Gets the data of this CreateEmbeddingResponse.

        The list of embeddings generated by the model.  # noqa: E501

        :return: The data of this CreateEmbeddingResponse.
        :rtype: List[Embedding]
        """
        return self._data

    @data.setter
    def data(self, data: List[Embedding]):
        """Sets the data of this CreateEmbeddingResponse.

        The list of embeddings generated by the model.  # noqa: E501

        :param data: The data of this CreateEmbeddingResponse.
        :type data: List[Embedding]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def model(self) -> str:
        """Gets the model of this CreateEmbeddingResponse.

        The name of the model used to generate the embedding.  # noqa: E501

        :return: The model of this CreateEmbeddingResponse.
        :rtype: str
        """
        return self._model

    @model.setter
    def model(self, model: str):
        """Sets the model of this CreateEmbeddingResponse.

        The name of the model used to generate the embedding.  # noqa: E501

        :param model: The model of this CreateEmbeddingResponse.
        :type model: str
        """
        if model is None:
            raise ValueError("Invalid value for `model`, must not be `None`")  # noqa: E501

        self._model = model

    @property
    def object(self) -> str:
        """Gets the object of this CreateEmbeddingResponse.

        The object type, which is always \"list\".  # noqa: E501

        :return: The object of this CreateEmbeddingResponse.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object: str):
        """Sets the object of this CreateEmbeddingResponse.

        The object type, which is always \"list\".  # noqa: E501

        :param object: The object of this CreateEmbeddingResponse.
        :type object: str
        """
        allowed_values = ["list"]  # noqa: E501
        if object not in allowed_values:
            raise ValueError(
                "Invalid value for `object` ({0}), must be one of {1}"
                .format(object, allowed_values)
            )

        self._object = object

    @property
    def usage(self) -> CreateEmbeddingResponseUsage:
        """Gets the usage of this CreateEmbeddingResponse.


        :return: The usage of this CreateEmbeddingResponse.
        :rtype: CreateEmbeddingResponseUsage
        """
        return self._usage

    @usage.setter
    def usage(self, usage: CreateEmbeddingResponseUsage):
        """Sets the usage of this CreateEmbeddingResponse.


        :param usage: The usage of this CreateEmbeddingResponse.
        :type usage: CreateEmbeddingResponseUsage
        """
        if usage is None:
            raise ValueError("Invalid value for `usage`, must not be `None`")  # noqa: E501

        self._usage = usage
