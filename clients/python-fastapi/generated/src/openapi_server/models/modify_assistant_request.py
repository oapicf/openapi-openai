# coding: utf-8

"""
    OpenAI API

    The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

    The version of the OpenAPI document: 2.0.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json




from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from openapi_server.models.assistant_object_tools_inner import AssistantObjectToolsInner
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class ModifyAssistantRequest(BaseModel):
    """
    ModifyAssistantRequest
    """ # noqa: E501
    model: Optional[StrictStr] = None
    name: Optional[Annotated[str, Field(strict=True, max_length=256)]] = Field(default=None, description="The name of the assistant. The maximum length is 256 characters. ")
    description: Optional[Annotated[str, Field(strict=True, max_length=512)]] = Field(default=None, description="The description of the assistant. The maximum length is 512 characters. ")
    instructions: Optional[Annotated[str, Field(strict=True, max_length=256000)]] = Field(default=None, description="The system instructions that the assistant uses. The maximum length is 256,000 characters. ")
    tools: Optional[Annotated[List[AssistantObjectToolsInner], Field(max_length=128)]] = Field(default=None, description="A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. ")
    file_ids: Optional[Annotated[List[StrictStr], Field(max_length=20)]] = Field(default=None, description="A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. ")
    metadata: Optional[Dict[str, Any]] = Field(default=None, description="Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
    __properties: ClassVar[List[str]] = ["model", "name", "description", "instructions", "tools", "file_ids", "metadata"]

    model_config = {
        "populate_by_name": True,
        "validate_assignment": True,
        "protected_namespaces": (),
    }


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of ModifyAssistantRequest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        _dict = self.model_dump(
            by_alias=True,
            exclude={
            },
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in tools (list)
        _items = []
        if self.tools:
            for _item in self.tools:
                if _item:
                    _items.append(_item.to_dict())
            _dict['tools'] = _items
        # set to None if name (nullable) is None
        # and model_fields_set contains the field
        if self.name is None and "name" in self.model_fields_set:
            _dict['name'] = None

        # set to None if description (nullable) is None
        # and model_fields_set contains the field
        if self.description is None and "description" in self.model_fields_set:
            _dict['description'] = None

        # set to None if instructions (nullable) is None
        # and model_fields_set contains the field
        if self.instructions is None and "instructions" in self.model_fields_set:
            _dict['instructions'] = None

        # set to None if metadata (nullable) is None
        # and model_fields_set contains the field
        if self.metadata is None and "metadata" in self.model_fields_set:
            _dict['metadata'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of ModifyAssistantRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "model": obj.get("model"),
            "name": obj.get("name"),
            "description": obj.get("description"),
            "instructions": obj.get("instructions"),
            "tools": [AssistantObjectToolsInner.from_dict(_item) for _item in obj.get("tools")] if obj.get("tools") is not None else None,
            "file_ids": obj.get("file_ids"),
            "metadata": obj.get("metadata")
        })
        return _obj


