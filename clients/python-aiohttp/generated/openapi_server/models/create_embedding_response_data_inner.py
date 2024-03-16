# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class CreateEmbeddingResponseDataInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, index: int=None, object: str=None, embedding: List[float]=None):
        """CreateEmbeddingResponseDataInner - a model defined in OpenAPI

        :param index: The index of this CreateEmbeddingResponseDataInner.
        :param object: The object of this CreateEmbeddingResponseDataInner.
        :param embedding: The embedding of this CreateEmbeddingResponseDataInner.
        """
        self.openapi_types = {
            'index': int,
            'object': str,
            'embedding': List[float]
        }

        self.attribute_map = {
            'index': 'index',
            'object': 'object',
            'embedding': 'embedding'
        }

        self._index = index
        self._object = object
        self._embedding = embedding

    @classmethod
    def from_dict(cls, dikt: dict) -> 'CreateEmbeddingResponseDataInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The CreateEmbeddingResponse_data_inner of this CreateEmbeddingResponseDataInner.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def index(self):
        """Gets the index of this CreateEmbeddingResponseDataInner.


        :return: The index of this CreateEmbeddingResponseDataInner.
        :rtype: int
        """
        return self._index

    @index.setter
    def index(self, index):
        """Sets the index of this CreateEmbeddingResponseDataInner.


        :param index: The index of this CreateEmbeddingResponseDataInner.
        :type index: int
        """
        if index is None:
            raise ValueError("Invalid value for `index`, must not be `None`")

        self._index = index

    @property
    def object(self):
        """Gets the object of this CreateEmbeddingResponseDataInner.


        :return: The object of this CreateEmbeddingResponseDataInner.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object):
        """Sets the object of this CreateEmbeddingResponseDataInner.


        :param object: The object of this CreateEmbeddingResponseDataInner.
        :type object: str
        """
        if object is None:
            raise ValueError("Invalid value for `object`, must not be `None`")

        self._object = object

    @property
    def embedding(self):
        """Gets the embedding of this CreateEmbeddingResponseDataInner.


        :return: The embedding of this CreateEmbeddingResponseDataInner.
        :rtype: List[float]
        """
        return self._embedding

    @embedding.setter
    def embedding(self, embedding):
        """Sets the embedding of this CreateEmbeddingResponseDataInner.


        :param embedding: The embedding of this CreateEmbeddingResponseDataInner.
        :type embedding: List[float]
        """
        if embedding is None:
            raise ValueError("Invalid value for `embedding`, must not be `None`")

        self._embedding = embedding
