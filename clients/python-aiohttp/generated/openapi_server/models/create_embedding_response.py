# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.create_embedding_response_usage import CreateEmbeddingResponseUsage
from openapi_server.models.embedding import Embedding
from openapi_server import util


class CreateEmbeddingResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data: List[Embedding]=None, model: str=None, object: str=None, usage: CreateEmbeddingResponseUsage=None):
        """CreateEmbeddingResponse - a model defined in OpenAPI

        :param data: The data of this CreateEmbeddingResponse.
        :param model: The model of this CreateEmbeddingResponse.
        :param object: The object of this CreateEmbeddingResponse.
        :param usage: The usage of this CreateEmbeddingResponse.
        """
        self.openapi_types = {
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
    def from_dict(cls, dikt: dict) -> 'CreateEmbeddingResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The CreateEmbeddingResponse of this CreateEmbeddingResponse.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self):
        """Gets the data of this CreateEmbeddingResponse.

        The list of embeddings generated by the model.

        :return: The data of this CreateEmbeddingResponse.
        :rtype: List[Embedding]
        """
        return self._data

    @data.setter
    def data(self, data):
        """Sets the data of this CreateEmbeddingResponse.

        The list of embeddings generated by the model.

        :param data: The data of this CreateEmbeddingResponse.
        :type data: List[Embedding]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")

        self._data = data

    @property
    def model(self):
        """Gets the model of this CreateEmbeddingResponse.

        The name of the model used to generate the embedding.

        :return: The model of this CreateEmbeddingResponse.
        :rtype: str
        """
        return self._model

    @model.setter
    def model(self, model):
        """Sets the model of this CreateEmbeddingResponse.

        The name of the model used to generate the embedding.

        :param model: The model of this CreateEmbeddingResponse.
        :type model: str
        """
        if model is None:
            raise ValueError("Invalid value for `model`, must not be `None`")

        self._model = model

    @property
    def object(self):
        """Gets the object of this CreateEmbeddingResponse.

        The object type, which is always \"list\".

        :return: The object of this CreateEmbeddingResponse.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object):
        """Sets the object of this CreateEmbeddingResponse.

        The object type, which is always \"list\".

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
    def usage(self):
        """Gets the usage of this CreateEmbeddingResponse.


        :return: The usage of this CreateEmbeddingResponse.
        :rtype: CreateEmbeddingResponseUsage
        """
        return self._usage

    @usage.setter
    def usage(self, usage):
        """Sets the usage of this CreateEmbeddingResponse.


        :param usage: The usage of this CreateEmbeddingResponse.
        :type usage: CreateEmbeddingResponseUsage
        """
        if usage is None:
            raise ValueError("Invalid value for `usage`, must not be `None`")

        self._usage = usage