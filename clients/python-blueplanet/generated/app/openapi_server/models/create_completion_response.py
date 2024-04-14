# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.completion_usage import CompletionUsage  # noqa: F401,E501
from app.openapi_server.models.create_completion_response_choices_inner import CreateCompletionResponseChoicesInner  # noqa: F401,E501
from openapi_server import util


class CreateCompletionResponse(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, choices: List[CreateCompletionResponseChoicesInner]=None, created: int=None, model: str=None, system_fingerprint: str=None, object: str=None, usage: CompletionUsage=None):  # noqa: E501
        """CreateCompletionResponse - a model defined in Swagger

        :param id: The id of this CreateCompletionResponse.  # noqa: E501
        :type id: str
        :param choices: The choices of this CreateCompletionResponse.  # noqa: E501
        :type choices: List[CreateCompletionResponseChoicesInner]
        :param created: The created of this CreateCompletionResponse.  # noqa: E501
        :type created: int
        :param model: The model of this CreateCompletionResponse.  # noqa: E501
        :type model: str
        :param system_fingerprint: The system_fingerprint of this CreateCompletionResponse.  # noqa: E501
        :type system_fingerprint: str
        :param object: The object of this CreateCompletionResponse.  # noqa: E501
        :type object: str
        :param usage: The usage of this CreateCompletionResponse.  # noqa: E501
        :type usage: CompletionUsage
        """
        self.swagger_types = {
            'id': str,
            'choices': List[CreateCompletionResponseChoicesInner],
            'created': int,
            'model': str,
            'system_fingerprint': str,
            'object': str,
            'usage': CompletionUsage
        }

        self.attribute_map = {
            'id': 'id',
            'choices': 'choices',
            'created': 'created',
            'model': 'model',
            'system_fingerprint': 'system_fingerprint',
            'object': 'object',
            'usage': 'usage'
        }

        self._id = id
        self._choices = choices
        self._created = created
        self._model = model
        self._system_fingerprint = system_fingerprint
        self._object = object
        self._usage = usage

    @classmethod
    def from_dict(cls, dikt) -> 'CreateCompletionResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateCompletionResponse of this CreateCompletionResponse.  # noqa: E501
        :rtype: CreateCompletionResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this CreateCompletionResponse.

        A unique identifier for the completion.  # noqa: E501

        :return: The id of this CreateCompletionResponse.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this CreateCompletionResponse.

        A unique identifier for the completion.  # noqa: E501

        :param id: The id of this CreateCompletionResponse.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def choices(self) -> List[CreateCompletionResponseChoicesInner]:
        """Gets the choices of this CreateCompletionResponse.

        The list of completion choices the model generated for the input prompt.  # noqa: E501

        :return: The choices of this CreateCompletionResponse.
        :rtype: List[CreateCompletionResponseChoicesInner]
        """
        return self._choices

    @choices.setter
    def choices(self, choices: List[CreateCompletionResponseChoicesInner]):
        """Sets the choices of this CreateCompletionResponse.

        The list of completion choices the model generated for the input prompt.  # noqa: E501

        :param choices: The choices of this CreateCompletionResponse.
        :type choices: List[CreateCompletionResponseChoicesInner]
        """
        if choices is None:
            raise ValueError("Invalid value for `choices`, must not be `None`")  # noqa: E501

        self._choices = choices

    @property
    def created(self) -> int:
        """Gets the created of this CreateCompletionResponse.

        The Unix timestamp (in seconds) of when the completion was created.  # noqa: E501

        :return: The created of this CreateCompletionResponse.
        :rtype: int
        """
        return self._created

    @created.setter
    def created(self, created: int):
        """Sets the created of this CreateCompletionResponse.

        The Unix timestamp (in seconds) of when the completion was created.  # noqa: E501

        :param created: The created of this CreateCompletionResponse.
        :type created: int
        """
        if created is None:
            raise ValueError("Invalid value for `created`, must not be `None`")  # noqa: E501

        self._created = created

    @property
    def model(self) -> str:
        """Gets the model of this CreateCompletionResponse.

        The model used for completion.  # noqa: E501

        :return: The model of this CreateCompletionResponse.
        :rtype: str
        """
        return self._model

    @model.setter
    def model(self, model: str):
        """Sets the model of this CreateCompletionResponse.

        The model used for completion.  # noqa: E501

        :param model: The model of this CreateCompletionResponse.
        :type model: str
        """
        if model is None:
            raise ValueError("Invalid value for `model`, must not be `None`")  # noqa: E501

        self._model = model

    @property
    def system_fingerprint(self) -> str:
        """Gets the system_fingerprint of this CreateCompletionResponse.

        This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.   # noqa: E501

        :return: The system_fingerprint of this CreateCompletionResponse.
        :rtype: str
        """
        return self._system_fingerprint

    @system_fingerprint.setter
    def system_fingerprint(self, system_fingerprint: str):
        """Sets the system_fingerprint of this CreateCompletionResponse.

        This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.   # noqa: E501

        :param system_fingerprint: The system_fingerprint of this CreateCompletionResponse.
        :type system_fingerprint: str
        """

        self._system_fingerprint = system_fingerprint

    @property
    def object(self) -> str:
        """Gets the object of this CreateCompletionResponse.

        The object type, which is always \"text_completion\"  # noqa: E501

        :return: The object of this CreateCompletionResponse.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object: str):
        """Sets the object of this CreateCompletionResponse.

        The object type, which is always \"text_completion\"  # noqa: E501

        :param object: The object of this CreateCompletionResponse.
        :type object: str
        """
        allowed_values = ["text_completion"]  # noqa: E501
        if object not in allowed_values:
            raise ValueError(
                "Invalid value for `object` ({0}), must be one of {1}"
                .format(object, allowed_values)
            )

        self._object = object

    @property
    def usage(self) -> CompletionUsage:
        """Gets the usage of this CreateCompletionResponse.


        :return: The usage of this CreateCompletionResponse.
        :rtype: CompletionUsage
        """
        return self._usage

    @usage.setter
    def usage(self, usage: CompletionUsage):
        """Sets the usage of this CreateCompletionResponse.


        :param usage: The usage of this CreateCompletionResponse.
        :type usage: CompletionUsage
        """

        self._usage = usage
