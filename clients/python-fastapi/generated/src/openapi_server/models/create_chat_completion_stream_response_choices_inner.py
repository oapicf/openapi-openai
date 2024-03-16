# coding: utf-8

"""
    OpenAI API

    APIs for sampling from and fine-tuning language models

    The version of the OpenAPI document: 2.0.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json




from pydantic import BaseModel, ConfigDict, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from openapi_server.models.chat_completion_stream_response_delta import ChatCompletionStreamResponseDelta
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class CreateChatCompletionStreamResponseChoicesInner(BaseModel):
    """
    CreateChatCompletionStreamResponseChoicesInner
    """ # noqa: E501
    index: Optional[StrictInt] = None
    delta: Optional[ChatCompletionStreamResponseDelta] = None
    finish_reason: Optional[StrictStr] = None
    __properties: ClassVar[List[str]] = ["index", "delta", "finish_reason"]

    @field_validator('finish_reason')
    def finish_reason_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('stop', 'length', 'function_call'):
            raise ValueError("must be one of enum values ('stop', 'length', 'function_call')")
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
        """Create an instance of CreateChatCompletionStreamResponseChoicesInner from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of delta
        if self.delta:
            _dict['delta'] = self.delta.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of CreateChatCompletionStreamResponseChoicesInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "index": obj.get("index"),
            "delta": ChatCompletionStreamResponseDelta.from_dict(obj.get("delta")) if obj.get("delta") is not None else None,
            "finish_reason": obj.get("finish_reason")
        })
        return _obj


