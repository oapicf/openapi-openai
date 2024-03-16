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




from pydantic import BaseModel, ConfigDict, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_server.models.create_completion_response_choices_inner import CreateCompletionResponseChoicesInner
from openapi_server.models.create_completion_response_usage import CreateCompletionResponseUsage
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class CreateCompletionResponse(BaseModel):
    """
    CreateCompletionResponse
    """ # noqa: E501
    id: StrictStr
    object: StrictStr
    created: StrictInt
    model: StrictStr
    choices: List[CreateCompletionResponseChoicesInner]
    usage: Optional[CreateCompletionResponseUsage] = None
    __properties: ClassVar[List[str]] = ["id", "object", "created", "model", "choices", "usage"]

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
        """Create an instance of CreateCompletionResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in choices (list)
        _items = []
        if self.choices:
            for _item in self.choices:
                if _item:
                    _items.append(_item.to_dict())
            _dict['choices'] = _items
        # override the default output from pydantic by calling `to_dict()` of usage
        if self.usage:
            _dict['usage'] = self.usage.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of CreateCompletionResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "object": obj.get("object"),
            "created": obj.get("created"),
            "model": obj.get("model"),
            "choices": [CreateCompletionResponseChoicesInner.from_dict(_item) for _item in obj.get("choices")] if obj.get("choices") is not None else None,
            "usage": CreateCompletionResponseUsage.from_dict(obj.get("usage")) if obj.get("usage") is not None else None
        })
        return _obj

