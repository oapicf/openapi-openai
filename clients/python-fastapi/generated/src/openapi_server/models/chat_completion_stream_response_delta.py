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




from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from openapi_server.models.chat_completion_message_tool_call_chunk import ChatCompletionMessageToolCallChunk
from openapi_server.models.chat_completion_stream_response_delta_function_call import ChatCompletionStreamResponseDeltaFunctionCall
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class ChatCompletionStreamResponseDelta(BaseModel):
    """
    A chat completion delta generated by streamed model responses.
    """ # noqa: E501
    content: Optional[StrictStr] = Field(default=None, description="The contents of the chunk message.")
    function_call: Optional[ChatCompletionStreamResponseDeltaFunctionCall] = None
    tool_calls: Optional[List[ChatCompletionMessageToolCallChunk]] = None
    role: Optional[StrictStr] = Field(default=None, description="The role of the author of this message.")
    __properties: ClassVar[List[str]] = ["content", "function_call", "tool_calls", "role"]

    @field_validator('role')
    def role_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('system', 'user', 'assistant', 'tool'):
            raise ValueError("must be one of enum values ('system', 'user', 'assistant', 'tool')")
        return value

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
        """Create an instance of ChatCompletionStreamResponseDelta from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of function_call
        if self.function_call:
            _dict['function_call'] = self.function_call.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in tool_calls (list)
        _items = []
        if self.tool_calls:
            for _item in self.tool_calls:
                if _item:
                    _items.append(_item.to_dict())
            _dict['tool_calls'] = _items
        # set to None if content (nullable) is None
        # and model_fields_set contains the field
        if self.content is None and "content" in self.model_fields_set:
            _dict['content'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of ChatCompletionStreamResponseDelta from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "content": obj.get("content"),
            "function_call": ChatCompletionStreamResponseDeltaFunctionCall.from_dict(obj.get("function_call")) if obj.get("function_call") is not None else None,
            "tool_calls": [ChatCompletionMessageToolCallChunk.from_dict(_item) for _item in obj.get("tool_calls")] if obj.get("tool_calls") is not None else None,
            "role": obj.get("role")
        })
        return _obj


