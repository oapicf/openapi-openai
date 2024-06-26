from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.assistant_object_tools_inner import AssistantObjectToolsInner
from openapi_server import util

from openapi_server.models.assistant_object_tools_inner import AssistantObjectToolsInner  # noqa: E501

class AssistantObject(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, object=None, created_at=None, name=None, description=None, model=None, instructions=None, tools=[], file_ids=[], metadata=None):  # noqa: E501
        """AssistantObject - a model defined in OpenAPI

        :param id: The id of this AssistantObject.  # noqa: E501
        :type id: str
        :param object: The object of this AssistantObject.  # noqa: E501
        :type object: str
        :param created_at: The created_at of this AssistantObject.  # noqa: E501
        :type created_at: int
        :param name: The name of this AssistantObject.  # noqa: E501
        :type name: str
        :param description: The description of this AssistantObject.  # noqa: E501
        :type description: str
        :param model: The model of this AssistantObject.  # noqa: E501
        :type model: str
        :param instructions: The instructions of this AssistantObject.  # noqa: E501
        :type instructions: str
        :param tools: The tools of this AssistantObject.  # noqa: E501
        :type tools: List[AssistantObjectToolsInner]
        :param file_ids: The file_ids of this AssistantObject.  # noqa: E501
        :type file_ids: List[str]
        :param metadata: The metadata of this AssistantObject.  # noqa: E501
        :type metadata: object
        """
        self.openapi_types = {
            'id': str,
            'object': str,
            'created_at': int,
            'name': str,
            'description': str,
            'model': str,
            'instructions': str,
            'tools': List[AssistantObjectToolsInner],
            'file_ids': List[str],
            'metadata': object
        }

        self.attribute_map = {
            'id': 'id',
            'object': 'object',
            'created_at': 'created_at',
            'name': 'name',
            'description': 'description',
            'model': 'model',
            'instructions': 'instructions',
            'tools': 'tools',
            'file_ids': 'file_ids',
            'metadata': 'metadata'
        }

        self._id = id
        self._object = object
        self._created_at = created_at
        self._name = name
        self._description = description
        self._model = model
        self._instructions = instructions
        self._tools = tools
        self._file_ids = file_ids
        self._metadata = metadata

    @classmethod
    def from_dict(cls, dikt) -> 'AssistantObject':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AssistantObject of this AssistantObject.  # noqa: E501
        :rtype: AssistantObject
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this AssistantObject.

        The identifier, which can be referenced in API endpoints.  # noqa: E501

        :return: The id of this AssistantObject.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this AssistantObject.

        The identifier, which can be referenced in API endpoints.  # noqa: E501

        :param id: The id of this AssistantObject.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def object(self) -> str:
        """Gets the object of this AssistantObject.

        The object type, which is always `assistant`.  # noqa: E501

        :return: The object of this AssistantObject.
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object: str):
        """Sets the object of this AssistantObject.

        The object type, which is always `assistant`.  # noqa: E501

        :param object: The object of this AssistantObject.
        :type object: str
        """
        allowed_values = ["assistant"]  # noqa: E501
        if object not in allowed_values:
            raise ValueError(
                "Invalid value for `object` ({0}), must be one of {1}"
                .format(object, allowed_values)
            )

        self._object = object

    @property
    def created_at(self) -> int:
        """Gets the created_at of this AssistantObject.

        The Unix timestamp (in seconds) for when the assistant was created.  # noqa: E501

        :return: The created_at of this AssistantObject.
        :rtype: int
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: int):
        """Sets the created_at of this AssistantObject.

        The Unix timestamp (in seconds) for when the assistant was created.  # noqa: E501

        :param created_at: The created_at of this AssistantObject.
        :type created_at: int
        """
        if created_at is None:
            raise ValueError("Invalid value for `created_at`, must not be `None`")  # noqa: E501

        self._created_at = created_at

    @property
    def name(self) -> str:
        """Gets the name of this AssistantObject.

        The name of the assistant. The maximum length is 256 characters.   # noqa: E501

        :return: The name of this AssistantObject.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this AssistantObject.

        The name of the assistant. The maximum length is 256 characters.   # noqa: E501

        :param name: The name of this AssistantObject.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501
        if name is not None and len(name) > 256:
            raise ValueError("Invalid value for `name`, length must be less than or equal to `256`")  # noqa: E501

        self._name = name

    @property
    def description(self) -> str:
        """Gets the description of this AssistantObject.

        The description of the assistant. The maximum length is 512 characters.   # noqa: E501

        :return: The description of this AssistantObject.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this AssistantObject.

        The description of the assistant. The maximum length is 512 characters.   # noqa: E501

        :param description: The description of this AssistantObject.
        :type description: str
        """
        if description is None:
            raise ValueError("Invalid value for `description`, must not be `None`")  # noqa: E501
        if description is not None and len(description) > 512:
            raise ValueError("Invalid value for `description`, length must be less than or equal to `512`")  # noqa: E501

        self._description = description

    @property
    def model(self) -> str:
        """Gets the model of this AssistantObject.

        ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.   # noqa: E501

        :return: The model of this AssistantObject.
        :rtype: str
        """
        return self._model

    @model.setter
    def model(self, model: str):
        """Sets the model of this AssistantObject.

        ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.   # noqa: E501

        :param model: The model of this AssistantObject.
        :type model: str
        """
        if model is None:
            raise ValueError("Invalid value for `model`, must not be `None`")  # noqa: E501

        self._model = model

    @property
    def instructions(self) -> str:
        """Gets the instructions of this AssistantObject.

        The system instructions that the assistant uses. The maximum length is 256,000 characters.   # noqa: E501

        :return: The instructions of this AssistantObject.
        :rtype: str
        """
        return self._instructions

    @instructions.setter
    def instructions(self, instructions: str):
        """Sets the instructions of this AssistantObject.

        The system instructions that the assistant uses. The maximum length is 256,000 characters.   # noqa: E501

        :param instructions: The instructions of this AssistantObject.
        :type instructions: str
        """
        if instructions is None:
            raise ValueError("Invalid value for `instructions`, must not be `None`")  # noqa: E501
        if instructions is not None and len(instructions) > 256000:
            raise ValueError("Invalid value for `instructions`, length must be less than or equal to `256000`")  # noqa: E501

        self._instructions = instructions

    @property
    def tools(self) -> List[AssistantObjectToolsInner]:
        """Gets the tools of this AssistantObject.

        A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.   # noqa: E501

        :return: The tools of this AssistantObject.
        :rtype: List[AssistantObjectToolsInner]
        """
        return self._tools

    @tools.setter
    def tools(self, tools: List[AssistantObjectToolsInner]):
        """Sets the tools of this AssistantObject.

        A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.   # noqa: E501

        :param tools: The tools of this AssistantObject.
        :type tools: List[AssistantObjectToolsInner]
        """
        if tools is None:
            raise ValueError("Invalid value for `tools`, must not be `None`")  # noqa: E501
        if tools is not None and len(tools) > 128:
            raise ValueError("Invalid value for `tools`, number of items must be less than or equal to `128`")  # noqa: E501

        self._tools = tools

    @property
    def file_ids(self) -> List[str]:
        """Gets the file_ids of this AssistantObject.

        A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.   # noqa: E501

        :return: The file_ids of this AssistantObject.
        :rtype: List[str]
        """
        return self._file_ids

    @file_ids.setter
    def file_ids(self, file_ids: List[str]):
        """Sets the file_ids of this AssistantObject.

        A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.   # noqa: E501

        :param file_ids: The file_ids of this AssistantObject.
        :type file_ids: List[str]
        """
        if file_ids is None:
            raise ValueError("Invalid value for `file_ids`, must not be `None`")  # noqa: E501
        if file_ids is not None and len(file_ids) > 20:
            raise ValueError("Invalid value for `file_ids`, number of items must be less than or equal to `20`")  # noqa: E501

        self._file_ids = file_ids

    @property
    def metadata(self) -> object:
        """Gets the metadata of this AssistantObject.

        Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.   # noqa: E501

        :return: The metadata of this AssistantObject.
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata: object):
        """Sets the metadata of this AssistantObject.

        Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.   # noqa: E501

        :param metadata: The metadata of this AssistantObject.
        :type metadata: object
        """
        if metadata is None:
            raise ValueError("Invalid value for `metadata`, must not be `None`")  # noqa: E501

        self._metadata = metadata
