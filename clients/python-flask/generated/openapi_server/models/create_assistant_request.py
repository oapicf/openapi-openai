from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.assistant_object_tools_inner import AssistantObjectToolsInner
from openapi_server.models.create_assistant_request_model import CreateAssistantRequestModel
from openapi_server import util

from openapi_server.models.assistant_object_tools_inner import AssistantObjectToolsInner  # noqa: E501
from openapi_server.models.create_assistant_request_model import CreateAssistantRequestModel  # noqa: E501

class CreateAssistantRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, model=None, name=None, description=None, instructions=None, tools=[], file_ids=[], metadata=None):  # noqa: E501
        """CreateAssistantRequest - a model defined in OpenAPI

        :param model: The model of this CreateAssistantRequest.  # noqa: E501
        :type model: CreateAssistantRequestModel
        :param name: The name of this CreateAssistantRequest.  # noqa: E501
        :type name: str
        :param description: The description of this CreateAssistantRequest.  # noqa: E501
        :type description: str
        :param instructions: The instructions of this CreateAssistantRequest.  # noqa: E501
        :type instructions: str
        :param tools: The tools of this CreateAssistantRequest.  # noqa: E501
        :type tools: List[AssistantObjectToolsInner]
        :param file_ids: The file_ids of this CreateAssistantRequest.  # noqa: E501
        :type file_ids: List[str]
        :param metadata: The metadata of this CreateAssistantRequest.  # noqa: E501
        :type metadata: object
        """
        self.openapi_types = {
            'model': CreateAssistantRequestModel,
            'name': str,
            'description': str,
            'instructions': str,
            'tools': List[AssistantObjectToolsInner],
            'file_ids': List[str],
            'metadata': object
        }

        self.attribute_map = {
            'model': 'model',
            'name': 'name',
            'description': 'description',
            'instructions': 'instructions',
            'tools': 'tools',
            'file_ids': 'file_ids',
            'metadata': 'metadata'
        }

        self._model = model
        self._name = name
        self._description = description
        self._instructions = instructions
        self._tools = tools
        self._file_ids = file_ids
        self._metadata = metadata

    @classmethod
    def from_dict(cls, dikt) -> 'CreateAssistantRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateAssistantRequest of this CreateAssistantRequest.  # noqa: E501
        :rtype: CreateAssistantRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def model(self) -> CreateAssistantRequestModel:
        """Gets the model of this CreateAssistantRequest.


        :return: The model of this CreateAssistantRequest.
        :rtype: CreateAssistantRequestModel
        """
        return self._model

    @model.setter
    def model(self, model: CreateAssistantRequestModel):
        """Sets the model of this CreateAssistantRequest.


        :param model: The model of this CreateAssistantRequest.
        :type model: CreateAssistantRequestModel
        """
        if model is None:
            raise ValueError("Invalid value for `model`, must not be `None`")  # noqa: E501

        self._model = model

    @property
    def name(self) -> str:
        """Gets the name of this CreateAssistantRequest.

        The name of the assistant. The maximum length is 256 characters.   # noqa: E501

        :return: The name of this CreateAssistantRequest.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this CreateAssistantRequest.

        The name of the assistant. The maximum length is 256 characters.   # noqa: E501

        :param name: The name of this CreateAssistantRequest.
        :type name: str
        """
        if name is not None and len(name) > 256:
            raise ValueError("Invalid value for `name`, length must be less than or equal to `256`")  # noqa: E501

        self._name = name

    @property
    def description(self) -> str:
        """Gets the description of this CreateAssistantRequest.

        The description of the assistant. The maximum length is 512 characters.   # noqa: E501

        :return: The description of this CreateAssistantRequest.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this CreateAssistantRequest.

        The description of the assistant. The maximum length is 512 characters.   # noqa: E501

        :param description: The description of this CreateAssistantRequest.
        :type description: str
        """
        if description is not None and len(description) > 512:
            raise ValueError("Invalid value for `description`, length must be less than or equal to `512`")  # noqa: E501

        self._description = description

    @property
    def instructions(self) -> str:
        """Gets the instructions of this CreateAssistantRequest.

        The system instructions that the assistant uses. The maximum length is 256,000 characters.   # noqa: E501

        :return: The instructions of this CreateAssistantRequest.
        :rtype: str
        """
        return self._instructions

    @instructions.setter
    def instructions(self, instructions: str):
        """Sets the instructions of this CreateAssistantRequest.

        The system instructions that the assistant uses. The maximum length is 256,000 characters.   # noqa: E501

        :param instructions: The instructions of this CreateAssistantRequest.
        :type instructions: str
        """
        if instructions is not None and len(instructions) > 256000:
            raise ValueError("Invalid value for `instructions`, length must be less than or equal to `256000`")  # noqa: E501

        self._instructions = instructions

    @property
    def tools(self) -> List[AssistantObjectToolsInner]:
        """Gets the tools of this CreateAssistantRequest.

        A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.   # noqa: E501

        :return: The tools of this CreateAssistantRequest.
        :rtype: List[AssistantObjectToolsInner]
        """
        return self._tools

    @tools.setter
    def tools(self, tools: List[AssistantObjectToolsInner]):
        """Sets the tools of this CreateAssistantRequest.

        A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.   # noqa: E501

        :param tools: The tools of this CreateAssistantRequest.
        :type tools: List[AssistantObjectToolsInner]
        """
        if tools is not None and len(tools) > 128:
            raise ValueError("Invalid value for `tools`, number of items must be less than or equal to `128`")  # noqa: E501

        self._tools = tools

    @property
    def file_ids(self) -> List[str]:
        """Gets the file_ids of this CreateAssistantRequest.

        A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.   # noqa: E501

        :return: The file_ids of this CreateAssistantRequest.
        :rtype: List[str]
        """
        return self._file_ids

    @file_ids.setter
    def file_ids(self, file_ids: List[str]):
        """Sets the file_ids of this CreateAssistantRequest.

        A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.   # noqa: E501

        :param file_ids: The file_ids of this CreateAssistantRequest.
        :type file_ids: List[str]
        """
        if file_ids is not None and len(file_ids) > 20:
            raise ValueError("Invalid value for `file_ids`, number of items must be less than or equal to `20`")  # noqa: E501

        self._file_ids = file_ids

    @property
    def metadata(self) -> object:
        """Gets the metadata of this CreateAssistantRequest.

        Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.   # noqa: E501

        :return: The metadata of this CreateAssistantRequest.
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata: object):
        """Sets the metadata of this CreateAssistantRequest.

        Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.   # noqa: E501

        :param metadata: The metadata of this CreateAssistantRequest.
        :type metadata: object
        """

        self._metadata = metadata
