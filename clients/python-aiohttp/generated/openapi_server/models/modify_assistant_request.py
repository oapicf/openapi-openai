# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.assistant_object_tools_inner import AssistantObjectToolsInner
from openapi_server import util


class ModifyAssistantRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, model: str=None, name: str=None, description: str=None, instructions: str=None, tools: List[AssistantObjectToolsInner]=[], file_ids: List[str]=[], metadata: object=None):
        """ModifyAssistantRequest - a model defined in OpenAPI

        :param model: The model of this ModifyAssistantRequest.
        :param name: The name of this ModifyAssistantRequest.
        :param description: The description of this ModifyAssistantRequest.
        :param instructions: The instructions of this ModifyAssistantRequest.
        :param tools: The tools of this ModifyAssistantRequest.
        :param file_ids: The file_ids of this ModifyAssistantRequest.
        :param metadata: The metadata of this ModifyAssistantRequest.
        """
        self.openapi_types = {
            'model': str,
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
    def from_dict(cls, dikt: dict) -> 'ModifyAssistantRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The ModifyAssistantRequest of this ModifyAssistantRequest.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def model(self):
        """Gets the model of this ModifyAssistantRequest.


        :return: The model of this ModifyAssistantRequest.
        :rtype: str
        """
        return self._model

    @model.setter
    def model(self, model):
        """Sets the model of this ModifyAssistantRequest.


        :param model: The model of this ModifyAssistantRequest.
        :type model: str
        """

        self._model = model

    @property
    def name(self):
        """Gets the name of this ModifyAssistantRequest.

        The name of the assistant. The maximum length is 256 characters. 

        :return: The name of this ModifyAssistantRequest.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ModifyAssistantRequest.

        The name of the assistant. The maximum length is 256 characters. 

        :param name: The name of this ModifyAssistantRequest.
        :type name: str
        """
        if name is not None and len(name) > 256:
            raise ValueError("Invalid value for `name`, length must be less than or equal to `256`")

        self._name = name

    @property
    def description(self):
        """Gets the description of this ModifyAssistantRequest.

        The description of the assistant. The maximum length is 512 characters. 

        :return: The description of this ModifyAssistantRequest.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this ModifyAssistantRequest.

        The description of the assistant. The maximum length is 512 characters. 

        :param description: The description of this ModifyAssistantRequest.
        :type description: str
        """
        if description is not None and len(description) > 512:
            raise ValueError("Invalid value for `description`, length must be less than or equal to `512`")

        self._description = description

    @property
    def instructions(self):
        """Gets the instructions of this ModifyAssistantRequest.

        The system instructions that the assistant uses. The maximum length is 256,000 characters. 

        :return: The instructions of this ModifyAssistantRequest.
        :rtype: str
        """
        return self._instructions

    @instructions.setter
    def instructions(self, instructions):
        """Sets the instructions of this ModifyAssistantRequest.

        The system instructions that the assistant uses. The maximum length is 256,000 characters. 

        :param instructions: The instructions of this ModifyAssistantRequest.
        :type instructions: str
        """
        if instructions is not None and len(instructions) > 256000:
            raise ValueError("Invalid value for `instructions`, length must be less than or equal to `256000`")

        self._instructions = instructions

    @property
    def tools(self):
        """Gets the tools of this ModifyAssistantRequest.

        A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 

        :return: The tools of this ModifyAssistantRequest.
        :rtype: List[AssistantObjectToolsInner]
        """
        return self._tools

    @tools.setter
    def tools(self, tools):
        """Sets the tools of this ModifyAssistantRequest.

        A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 

        :param tools: The tools of this ModifyAssistantRequest.
        :type tools: List[AssistantObjectToolsInner]
        """
        if tools is not None and len(tools) > 128:
            raise ValueError("Invalid value for `tools`, number of items must be less than or equal to `128`")

        self._tools = tools

    @property
    def file_ids(self):
        """Gets the file_ids of this ModifyAssistantRequest.

        A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. 

        :return: The file_ids of this ModifyAssistantRequest.
        :rtype: List[str]
        """
        return self._file_ids

    @file_ids.setter
    def file_ids(self, file_ids):
        """Sets the file_ids of this ModifyAssistantRequest.

        A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. 

        :param file_ids: The file_ids of this ModifyAssistantRequest.
        :type file_ids: List[str]
        """
        if file_ids is not None and len(file_ids) > 20:
            raise ValueError("Invalid value for `file_ids`, number of items must be less than or equal to `20`")

        self._file_ids = file_ids

    @property
    def metadata(self):
        """Gets the metadata of this ModifyAssistantRequest.

        Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 

        :return: The metadata of this ModifyAssistantRequest.
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this ModifyAssistantRequest.

        Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 

        :param metadata: The metadata of this ModifyAssistantRequest.
        :type metadata: object
        """

        self._metadata = metadata
