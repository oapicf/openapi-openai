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
from openapi_server.models.run_step_delta_step_details_tool_calls_code_output_image_object_image import RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject(BaseModel):
    """
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
    """ # noqa: E501
    index: StrictInt = Field(description="The index of the output in the outputs array.")
    type: StrictStr = Field(description="Always `image`.")
    image: Optional[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage] = None
    __properties: ClassVar[List[str]] = ["index", "type", "image"]

    @field_validator('type')
    def type_validate_enum(cls, value):
        """Validates the enum"""
        if value not in ('image'):
            raise ValueError("must be one of enum values ('image')")
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
        """Create an instance of RunStepDeltaStepDetailsToolCallsCodeOutputImageObject from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of image
        if self.image:
            _dict['image'] = self.image.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of RunStepDeltaStepDetailsToolCallsCodeOutputImageObject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "index": obj.get("index"),
            "type": obj.get("type"),
            "image": RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.from_dict(obj.get("image")) if obj.get("image") is not None else None
        })
        return _obj


