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

from pydantic import BaseModel, ConfigDict, Field, StrictBool
from typing import Any, ClassVar, Dict, List
from typing import Optional, Set
from typing_extensions import Self

class CreateModerationResponseResultsInnerCategories(BaseModel):
    """
    A list of the categories, and whether they are flagged or not.
    """ # noqa: E501
    hate: StrictBool = Field(description="Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.")
    hate_threatening: StrictBool = Field(description="Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.", alias="hate/threatening")
    harassment: StrictBool = Field(description="Content that expresses, incites, or promotes harassing language towards any target.")
    harassment_threatening: StrictBool = Field(description="Harassment content that also includes violence or serious harm towards any target.", alias="harassment/threatening")
    self_harm: StrictBool = Field(description="Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.", alias="self-harm")
    self_harm_intent: StrictBool = Field(description="Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.", alias="self-harm/intent")
    self_harm_instructions: StrictBool = Field(description="Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.", alias="self-harm/instructions")
    sexual: StrictBool = Field(description="Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).")
    sexual_minors: StrictBool = Field(description="Sexual content that includes an individual who is under 18 years old.", alias="sexual/minors")
    violence: StrictBool = Field(description="Content that depicts death, violence, or physical injury.")
    violence_graphic: StrictBool = Field(description="Content that depicts death, violence, or physical injury in graphic detail.", alias="violence/graphic")
    __properties: ClassVar[List[str]] = ["hate", "hate/threatening", "harassment", "harassment/threatening", "self-harm", "self-harm/intent", "self-harm/instructions", "sexual", "sexual/minors", "violence", "violence/graphic"]

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
        """Create an instance of CreateModerationResponseResultsInnerCategories from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CreateModerationResponseResultsInnerCategories from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "hate": obj.get("hate"),
            "hate/threatening": obj.get("hate/threatening"),
            "harassment": obj.get("harassment"),
            "harassment/threatening": obj.get("harassment/threatening"),
            "self-harm": obj.get("self-harm"),
            "self-harm/intent": obj.get("self-harm/intent"),
            "self-harm/instructions": obj.get("self-harm/instructions"),
            "sexual": obj.get("sexual"),
            "sexual/minors": obj.get("sexual/minors"),
            "violence": obj.get("violence"),
            "violence/graphic": obj.get("violence/graphic")
        })
        return _obj


