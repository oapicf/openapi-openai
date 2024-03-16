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
from openapi_server.models.fine_tune_event import FineTuneEvent
from openapi_server.models.open_ai_file import OpenAIFile
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class FineTune(BaseModel):
    """
    FineTune
    """ # noqa: E501
    id: StrictStr
    object: StrictStr
    created_at: StrictInt
    updated_at: StrictInt
    model: StrictStr
    fine_tuned_model: Optional[StrictStr]
    organization_id: StrictStr
    status: StrictStr
    hyperparams: Dict[str, Any]
    training_files: List[OpenAIFile]
    validation_files: List[OpenAIFile]
    result_files: List[OpenAIFile]
    events: Optional[List[FineTuneEvent]] = None
    __properties: ClassVar[List[str]] = ["id", "object", "created_at", "updated_at", "model", "fine_tuned_model", "organization_id", "status", "hyperparams", "training_files", "validation_files", "result_files", "events"]

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
        """Create an instance of FineTune from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in training_files (list)
        _items = []
        if self.training_files:
            for _item in self.training_files:
                if _item:
                    _items.append(_item.to_dict())
            _dict['training_files'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in validation_files (list)
        _items = []
        if self.validation_files:
            for _item in self.validation_files:
                if _item:
                    _items.append(_item.to_dict())
            _dict['validation_files'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in result_files (list)
        _items = []
        if self.result_files:
            for _item in self.result_files:
                if _item:
                    _items.append(_item.to_dict())
            _dict['result_files'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in events (list)
        _items = []
        if self.events:
            for _item in self.events:
                if _item:
                    _items.append(_item.to_dict())
            _dict['events'] = _items
        # set to None if fine_tuned_model (nullable) is None
        # and model_fields_set contains the field
        if self.fine_tuned_model is None and "fine_tuned_model" in self.model_fields_set:
            _dict['fine_tuned_model'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of FineTune from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "object": obj.get("object"),
            "created_at": obj.get("created_at"),
            "updated_at": obj.get("updated_at"),
            "model": obj.get("model"),
            "fine_tuned_model": obj.get("fine_tuned_model"),
            "organization_id": obj.get("organization_id"),
            "status": obj.get("status"),
            "hyperparams": obj.get("hyperparams"),
            "training_files": [OpenAIFile.from_dict(_item) for _item in obj.get("training_files")] if obj.get("training_files") is not None else None,
            "validation_files": [OpenAIFile.from_dict(_item) for _item in obj.get("validation_files")] if obj.get("validation_files") is not None else None,
            "result_files": [OpenAIFile.from_dict(_item) for _item in obj.get("result_files")] if obj.get("result_files") is not None else None,
            "events": [FineTuneEvent.from_dict(_item) for _item in obj.get("events")] if obj.get("events") is not None else None
        })
        return _obj

