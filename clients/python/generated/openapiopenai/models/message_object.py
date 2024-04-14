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
from typing_extensions import Annotated
from openapiopenai.models.message_object_content_inner import MessageObjectContentInner
from openapiopenai.models.message_object_incomplete_details import MessageObjectIncompleteDetails
from typing import Optional, Set
from typing_extensions import Self

class MessageObject(BaseModel):
    """
    Represents a message within a [thread](/docs/api-reference/threads).
    """ # noqa: E501
    id: StrictStr = Field(description="The identifier, which can be referenced in API endpoints.")
    object: StrictStr = Field(description="The object type, which is always `thread.message`.")
    created_at: StrictInt = Field(description="The Unix timestamp (in seconds) for when the message was created.")
    thread_id: StrictStr = Field(description="The [thread](/docs/api-reference/threads) ID that this message belongs to.")
    status: StrictStr = Field(description="The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.")
    incomplete_details: Optional[MessageObjectIncompleteDetails]
    completed_at: Optional[StrictInt] = Field(description="The Unix timestamp (in seconds) for when the message was completed.")
    incomplete_at: Optional[StrictInt] = Field(description="The Unix timestamp (in seconds) for when the message was marked as incomplete.")
    role: StrictStr = Field(description="The entity that produced the message. One of `user` or `assistant`.")
    content: List[MessageObjectContentInner] = Field(description="The content of the message in array of text and/or images.")
    assistant_id: Optional[StrictStr] = Field(description="If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.")
    run_id: Optional[StrictStr] = Field(description="The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.")
    file_ids: Annotated[List[StrictStr], Field(max_length=10)] = Field(description="A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.")
    metadata: Optional[Dict[str, Any]] = Field(description="Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
    __properties: ClassVar[List[str]] = ["id", "object", "created_at", "thread_id", "status", "incomplete_details", "completed_at", "incomplete_at", "role", "content", "assistant_id", "run_id", "file_ids", "metadata"]

    @field_validator('object')
    def object_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['thread.message']):
            raise ValueError("must be one of enum values ('thread.message')")
        return value

    @field_validator('status')
    def status_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['in_progress', 'incomplete', 'completed']):
            raise ValueError("must be one of enum values ('in_progress', 'incomplete', 'completed')")
        return value

    @field_validator('role')
    def role_validate_enum(cls, value):
        """Validates the enum"""
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
        """Create an instance of MessageObject from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of incomplete_details
        if self.incomplete_details:
            _dict['incomplete_details'] = self.incomplete_details.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in content (list)
        _items = []
        if self.content:
            for _item in self.content:
                if _item:
                    _items.append(_item.to_dict())
            _dict['content'] = _items
        # set to None if incomplete_details (nullable) is None
        # and model_fields_set contains the field
        if self.incomplete_details is None and "incomplete_details" in self.model_fields_set:
            _dict['incomplete_details'] = None

        # set to None if completed_at (nullable) is None
        # and model_fields_set contains the field
        if self.completed_at is None and "completed_at" in self.model_fields_set:
            _dict['completed_at'] = None

        # set to None if incomplete_at (nullable) is None
        # and model_fields_set contains the field
        if self.incomplete_at is None and "incomplete_at" in self.model_fields_set:
            _dict['incomplete_at'] = None

        # set to None if assistant_id (nullable) is None
        # and model_fields_set contains the field
        if self.assistant_id is None and "assistant_id" in self.model_fields_set:
            _dict['assistant_id'] = None

        # set to None if run_id (nullable) is None
        # and model_fields_set contains the field
        if self.run_id is None and "run_id" in self.model_fields_set:
            _dict['run_id'] = None

        # set to None if metadata (nullable) is None
        # and model_fields_set contains the field
        if self.metadata is None and "metadata" in self.model_fields_set:
            _dict['metadata'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of MessageObject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "object": obj.get("object"),
            "created_at": obj.get("created_at"),
            "thread_id": obj.get("thread_id"),
            "status": obj.get("status"),
            "incomplete_details": MessageObjectIncompleteDetails.from_dict(obj["incomplete_details"]) if obj.get("incomplete_details") is not None else None,
            "completed_at": obj.get("completed_at"),
            "incomplete_at": obj.get("incomplete_at"),
            "role": obj.get("role"),
            "content": [MessageObjectContentInner.from_dict(_item) for _item in obj["content"]] if obj.get("content") is not None else None,
            "assistant_id": obj.get("assistant_id"),
            "run_id": obj.get("run_id"),
            "file_ids": obj.get("file_ids"),
            "metadata": obj.get("metadata")
        })
        return _obj


