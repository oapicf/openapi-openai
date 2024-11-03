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




from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from openapi_server.models.chat_completion_token_logprob_top_logprobs_inner import ChatCompletionTokenLogprobTopLogprobsInner
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class ChatCompletionTokenLogprob(BaseModel):
    """
    ChatCompletionTokenLogprob
    """ # noqa: E501
    token: StrictStr = Field(description="The token.")
    logprob: Union[StrictFloat, StrictInt] = Field(description="The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.")
    bytes: Optional[List[StrictInt]] = Field(description="A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.")
    top_logprobs: List[ChatCompletionTokenLogprobTopLogprobsInner] = Field(description="List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.")
    __properties: ClassVar[List[str]] = ["token", "logprob", "bytes", "top_logprobs"]

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
        """Create an instance of ChatCompletionTokenLogprob from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in top_logprobs (list)
        _items = []
        if self.top_logprobs:
            for _item in self.top_logprobs:
                if _item:
                    _items.append(_item.to_dict())
            _dict['top_logprobs'] = _items
        # set to None if bytes (nullable) is None
        # and model_fields_set contains the field
        if self.bytes is None and "bytes" in self.model_fields_set:
            _dict['bytes'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of ChatCompletionTokenLogprob from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "token": obj.get("token"),
            "logprob": obj.get("logprob"),
            "bytes": obj.get("bytes"),
            "top_logprobs": [ChatCompletionTokenLogprobTopLogprobsInner.from_dict(_item) for _item in obj.get("top_logprobs")] if obj.get("top_logprobs") is not None else None
        })
        return _obj


