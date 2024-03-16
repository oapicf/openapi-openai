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




from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_server.models.create_embedding_request_input import CreateEmbeddingRequestInput
from openapi_server.models.create_embedding_request_model import CreateEmbeddingRequestModel
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class CreateEmbeddingRequest(BaseModel):
    """
    CreateEmbeddingRequest
    """ # noqa: E501
    model: CreateEmbeddingRequestModel
    input: CreateEmbeddingRequestInput
    user: Optional[StrictStr] = Field(default=None, description="A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
    __properties: ClassVar[List[str]] = ["model", "input", "user"]

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
        """Create an instance of CreateEmbeddingRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of model
        if self.model:
            _dict['model'] = self.model.to_dict()
        # override the default output from pydantic by calling `to_dict()` of input
        if self.input:
            _dict['input'] = self.input.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of CreateEmbeddingRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "model": CreateEmbeddingRequestModel.from_dict(obj.get("model")) if obj.get("model") is not None else None,
            "input": CreateEmbeddingRequestInput.from_dict(obj.get("input")) if obj.get("input") is not None else None,
            "user": obj.get("user")
        })
        return _obj


