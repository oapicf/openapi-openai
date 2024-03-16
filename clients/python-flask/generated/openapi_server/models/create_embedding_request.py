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

    def __init__(self, model=None, input=None, user=None):  # noqa: E501
        """CreateEmbeddingRequest - a model defined in OpenAPI

        :param model: The model of this CreateEmbeddingRequest.  # noqa: E501
        :type model: CreateEmbeddingRequestModel
        :param input: The input of this CreateEmbeddingRequest.  # noqa: E501
        :type input: CreateEmbeddingRequestInput
        :param user: The user of this CreateEmbeddingRequest.  # noqa: E501
        :type user: str
        """
        self.openapi_types = {
            'model': CreateEmbeddingRequestModel,
            'input': CreateEmbeddingRequestInput,
            'user': str
        }

        self.attribute_map = {
            'model': 'model',
            'input': 'input',
            'user': 'user'
        }

        self._model = model
        self._input = input
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