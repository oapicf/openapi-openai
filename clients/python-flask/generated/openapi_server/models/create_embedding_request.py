from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.create_embedding_request_input import CreateEmbeddingRequestInput
from openapi_server.models.create_embedding_request_model import CreateEmbeddingRequestModel
from openapi_server import util

from openapi_server.models.create_embedding_request_input import CreateEmbeddingRequestInput  # noqa: E501
from openapi_server.models.create_embedding_request_model import CreateEmbeddingRequestModel  # noqa: E501

class CreateEmbeddingRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, input=None, model=None, encoding_format='float', dimensions=None, user=None):  # noqa: E501
        """CreateEmbeddingRequest - a model defined in OpenAPI

        :param input: The input of this CreateEmbeddingRequest.  # noqa: E501
        :type input: CreateEmbeddingRequestInput
        :param model: The model of this CreateEmbeddingRequest.  # noqa: E501
        :type model: CreateEmbeddingRequestModel
        :param encoding_format: The encoding_format of this CreateEmbeddingRequest.  # noqa: E501
        :type encoding_format: str
        :param dimensions: The dimensions of this CreateEmbeddingRequest.  # noqa: E501
        :type dimensions: int
        :param user: The user of this CreateEmbeddingRequest.  # noqa: E501
        :type user: str
        """
        self.openapi_types = {
            'input': CreateEmbeddingRequestInput,
            'model': CreateEmbeddingRequestModel,
            'encoding_format': str,
            'dimensions': int,
            'user': str
        }

        self.attribute_map = {
            'input': 'input',
            'model': 'model',
            'encoding_format': 'encoding_format',
            'dimensions': 'dimensions',
            'user': 'user'
        }

        self._input = input
        self._model = model
        self._encoding_format = encoding_format
        self._dimensions = dimensions
        self._user = user

    @classmethod
    def from_dict(cls, dikt) -> 'CreateEmbeddingRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateEmbeddingRequest of this CreateEmbeddingRequest.  # noqa: E501
        :rtype: CreateEmbeddingRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def input(self) -> CreateEmbeddingRequestInput:
        """Gets the input of this CreateEmbeddingRequest.


        :return: The input of this CreateEmbeddingRequest.
        :rtype: CreateEmbeddingRequestInput
        """
        return self._input

    @input.setter
    def input(self, input: CreateEmbeddingRequestInput):
        """Sets the input of this CreateEmbeddingRequest.


        :param input: The input of this CreateEmbeddingRequest.
        :type input: CreateEmbeddingRequestInput
        """
        if input is None:
            raise ValueError("Invalid value for `input`, must not be `None`")  # noqa: E501

        self._input = input

    @property
    def model(self) -> CreateEmbeddingRequestModel:
        """Gets the model of this CreateEmbeddingRequest.


        :return: The model of this CreateEmbeddingRequest.
        :rtype: CreateEmbeddingRequestModel
        """
        return self._model

    @model.setter
    def model(self, model: CreateEmbeddingRequestModel):
        """Sets the model of this CreateEmbeddingRequest.


        :param model: The model of this CreateEmbeddingRequest.
        :type model: CreateEmbeddingRequestModel
        """
        if model is None:
            raise ValueError("Invalid value for `model`, must not be `None`")  # noqa: E501

        self._model = model

    @property
    def encoding_format(self) -> str:
        """Gets the encoding_format of this CreateEmbeddingRequest.

        The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).  # noqa: E501

        :return: The encoding_format of this CreateEmbeddingRequest.
        :rtype: str
        """
        return self._encoding_format

    @encoding_format.setter
    def encoding_format(self, encoding_format: str):
        """Sets the encoding_format of this CreateEmbeddingRequest.

        The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).  # noqa: E501

        :param encoding_format: The encoding_format of this CreateEmbeddingRequest.
        :type encoding_format: str
        """
        allowed_values = ["float", "base64"]  # noqa: E501
        if encoding_format not in allowed_values:
            raise ValueError(
                "Invalid value for `encoding_format` ({0}), must be one of {1}"
                .format(encoding_format, allowed_values)
            )

        self._encoding_format = encoding_format

    @property
    def dimensions(self) -> int:
        """Gets the dimensions of this CreateEmbeddingRequest.

        The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.   # noqa: E501

        :return: The dimensions of this CreateEmbeddingRequest.
        :rtype: int
        """
        return self._dimensions

    @dimensions.setter
    def dimensions(self, dimensions: int):
        """Sets the dimensions of this CreateEmbeddingRequest.

        The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.   # noqa: E501

        :param dimensions: The dimensions of this CreateEmbeddingRequest.
        :type dimensions: int
        """
        if dimensions is not None and dimensions < 1:  # noqa: E501
            raise ValueError("Invalid value for `dimensions`, must be a value greater than or equal to `1`")  # noqa: E501

        self._dimensions = dimensions

    @property
    def user(self) -> str:
        """Gets the user of this CreateEmbeddingRequest.

        A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).   # noqa: E501

        :return: The user of this CreateEmbeddingRequest.
        :rtype: str
        """
        return self._user

    @user.setter
    def user(self, user: str):
        """Sets the user of this CreateEmbeddingRequest.

        A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).   # noqa: E501

        :param user: The user of this CreateEmbeddingRequest.
        :type user: str
        """

        self._user = user
