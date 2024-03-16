# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.create_chat_completion_response_choices_inner import CreateChatCompletionResponseChoicesInner  # noqa: F401,E501
from app.openapi_server.models.create_completion_response_usage import CreateCompletionResponseUsage  # noqa: F401,E501
from openapi_server import util


class CreateChatCompletionResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, object: str=None, created: int=None, model: str=None, choices: List[CreateChatCompletionResponseChoicesInner]=None, usage: CreateCompletionResponseUsage=None):  # noqa: E501
        """CreateChatCompletionResponse - a model defined in Swagger

        :param id: The id of this CreateChatCompletionResponse.  # noqa: E501
        :type id: str
        :param object: The object of this CreateChatCompletionResponse.  # noqa: E501
        :type object: str
        :param created: The created of this CreateChatCompletionResponse.  # noqa: E501
        :type created: int
        :param model: The model of this CreateChatCompletionResponse.  # noqa: E501
        :type model: str
        :param choices: The choices of this CreateChatCompletionResponse.  # noqa: E501
        :type choices: List[CreateChatCompletionResponseChoicesInner]
        :param usage: The usage of this CreateChatCompletionResponse.  # noqa: E501
        :type usage: CreateCompletionResponseUsage
        """
        self.swagger_types = {
            'id': str,
            'object': str,
            'created': int,
            'model': str,
            'choices': List[CreateChatCompletionResponseChoicesInner],
            'usage': CreateCompletionResponseUsage
        }

        self.attribute_map = {
            'id': 'id',
            'object': 'object',
            'created': 'created',
            'model': 'model',
            'choices': 'choices',
            'usage': 'usage'
        }

        self._id = id
        self._object = object
        self._created = created
        self._model = model
        self._choices = choices
        self._usage = usage

    @classmethod
    def from_dict(cls, dikt) -> 'CreateChatCompletionResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateChatCompletionResponse of this CreateChatCompletionResponse.  # noqa: E501
        :rtype: CreateChatCompletionResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this CreateChatCompletionResponse.


        :return: The id of this CreateChatCompletionResponse.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this CreateChatCompletionResponse.


        :param id: The id of this CreateChatCompletionResponse.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def object(self) -> str:
        """Gets the object of this CreateChatCompletionResponse.


        :return: The object of this CreateChatCompletionResponse.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object: str):
        """Sets the object of this CreateChatCompletionResponse.


        :param object: The object of this CreateChatCompletionResponse.
        :type object: str
        """
        if object is None:
            raise ValueError("Invalid value for `object`, must not be `None`")  # noqa: E501

        self._object = object

    @property
    def created(self) -> int:
        """Gets the created of this CreateChatCompletionResponse.


        :return: The created of this CreateChatCompletionResponse.
        :rtype: int
        """
        return self._created

    @created.setter
    def created(self, created: int):
        """Sets the created of this CreateChatCompletionResponse.


        :param created: The created of this CreateChatCompletionResponse.
        :type created: int
        """
        if created is None:
            raise ValueError("Invalid value for `created`, must not be `None`")  # noqa: E501

        self._created = created

    @property
    def model(self) -> str:
        """Gets the model of this CreateChatCompletionResponse.


        :return: The model of this CreateChatCompletionResponse.
        :rtype: str
        """
        return self._model

    @model.setter
    def model(self, model: str):
        """Sets the model of this CreateChatCompletionResponse.


        :param model: The model of this CreateChatCompletionResponse.
        :type model: str
        """
        if model is None:
            raise ValueError("Invalid value for `model`, must not be `None`")  # noqa: E501

        self._model = model

    @property
    def choices(self) -> List[CreateChatCompletionResponseChoicesInner]:
        """Gets the choices of this CreateChatCompletionResponse.


        :return: The choices of this CreateChatCompletionResponse.
        :rtype: List[CreateChatCompletionResponseChoicesInner]
        """
        return self._choices

    @choices.setter
    def choices(self, choices: List[CreateChatCompletionResponseChoicesInner]):
        """Sets the choices of this CreateChatCompletionResponse.


        :param choices: The choices of this CreateChatCompletionResponse.
        :type choices: List[CreateChatCompletionResponseChoicesInner]
        """
        if choices is None:
            raise ValueError("Invalid value for `choices`, must not be `None`")  # noqa: E501

        self._choices = choices

    @property
    def usage(self) -> CreateCompletionResponseUsage:
        """Gets the usage of this CreateChatCompletionResponse.


        :return: The usage of this CreateChatCompletionResponse.
        :rtype: CreateCompletionResponseUsage
        """
        return self._usage

    @usage.setter
    def usage(self, usage: CreateCompletionResponseUsage):
        """Sets the usage of this CreateChatCompletionResponse.


        :param usage: The usage of this CreateChatCompletionResponse.
        :type usage: CreateCompletionResponseUsage
        """

        self._usage = usage
