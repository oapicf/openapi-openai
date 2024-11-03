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
from typing_extensions import Annotated
from openapiopenai.models.message_delta_object_delta_content_inner import MessageDeltaObjectDeltaContentInner
from typing import Optional, Set
from typing_extensions import Self

class MessageDeltaObjectDelta(BaseModel):
    """
    The delta containing the fields that have changed on the Message.
    """ # noqa: E501
    role: Optional[StrictStr] = Field(default=None, description="The entity that produced the message. One of `user` or `assistant`.")
    content: Optional[List[MessageDeltaObjectDeltaContentInner]] = Field(default=None, description="The content of the message in array of text and/or images.")
    file_ids: Optional[Annotated[List[StrictStr], Field(max_length=10)]] = Field(default=None, description="A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.")
    __properties: ClassVar[List[str]] = ["role", "content", "file_ids"]

    @field_validator('role')
    def role_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['user', 'assistant']):
            raise ValueError("must be one of enum values ('user', 'assistant')")
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
        """Create an instance of MessageDeltaObjectDelta from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in content (list)
        _items = []
        if self.content:
            for _item_content in self.content:
                if _item_content:
                    _items.append(_item_content.to_dict())
            _dict['content'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of MessageDeltaObjectDelta from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "role": obj.get("role"),
            "content": [MessageDeltaObjectDeltaContentInner.from_dict(_item) for _item in obj["content"]] if obj.get("content") is not None else None,
            "file_ids": obj.get("file_ids")
        })
        return _obj


