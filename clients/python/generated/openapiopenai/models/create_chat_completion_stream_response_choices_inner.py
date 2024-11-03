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

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from openapiopenai.models.chat_completion_stream_response_delta import ChatCompletionStreamResponseDelta
from openapiopenai.models.create_chat_completion_response_choices_inner_logprobs import CreateChatCompletionResponseChoicesInnerLogprobs
from typing import Optional, Set
from typing_extensions import Self

class CreateChatCompletionStreamResponseChoicesInner(BaseModel):
    """
    CreateChatCompletionStreamResponseChoicesInner
    """ # noqa: E501
    delta: ChatCompletionStreamResponseDelta
    logprobs: Optional[CreateChatCompletionResponseChoicesInnerLogprobs] = None
    finish_reason: Optional[StrictStr] = Field(description="The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. ")
    index: StrictInt = Field(description="The index of the choice in the list of choices.")
    __properties: ClassVar[List[str]] = ["delta", "logprobs", "finish_reason", "index"]

    @field_validator('finish_reason')
    def finish_reason_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['stop', 'length', 'tool_calls', 'content_filter', 'function_call']):
            raise ValueError("must be one of enum values ('stop', 'length', 'tool_calls', 'content_filter', 'function_call')")
        return value

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
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
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of delta
        if self.delta:
            _dict['delta'] = self.delta.to_dict()
        # override the default output from pydantic by calling `to_dict()` of logprobs
        if self.logprobs:
            _dict['logprobs'] = self.logprobs.to_dict()
        # set to None if logprobs (nullable) is None
        # and model_fields_set contains the field
        if self.logprobs is None and "logprobs" in self.model_fields_set:
            _dict['logprobs'] = None

        # set to None if finish_reason (nullable) is None
        # and model_fields_set contains the field
        if self.finish_reason is None and "finish_reason" in self.model_fields_set:
            _dict['finish_reason'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CreateChatCompletionStreamResponseChoicesInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "delta": ChatCompletionStreamResponseDelta.from_dict(obj["delta"]) if obj.get("delta") is not None else None,
            "logprobs": CreateChatCompletionResponseChoicesInnerLogprobs.from_dict(obj["logprobs"]) if obj.get("logprobs") is not None else None,
            "finish_reason": obj.get("finish_reason"),
            "index": obj.get("index")
        })
        return _obj


