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
import json
import pprint
from pydantic import BaseModel, ConfigDict, Field, StrictStr, ValidationError, field_validator
from typing import Any, List, Optional
from openapiopenai.models.create_translation_response_json import CreateTranslationResponseJson
from openapiopenai.models.create_translation_response_verbose_json import CreateTranslationResponseVerboseJson
from pydantic import StrictStr, Field
from typing import Union, List, Optional, Dict
from typing_extensions import Literal, Self

CREATETRANSLATION200RESPONSE_ONE_OF_SCHEMAS = ["CreateTranslationResponseJson", "CreateTranslationResponseVerboseJson"]

class CreateTranslation200Response(BaseModel):
    """
    CreateTranslation200Response
    """
    # data type: CreateTranslationResponseJson
    oneof_schema_1_validator: Optional[CreateTranslationResponseJson] = None
    # data type: CreateTranslationResponseVerboseJson
    oneof_schema_2_validator: Optional[CreateTranslationResponseVerboseJson] = None
    actual_instance: Optional[Union[CreateTranslationResponseJson, CreateTranslationResponseVerboseJson]] = None
    one_of_schemas: List[str] = Field(default=Literal["CreateTranslationResponseJson", "CreateTranslationResponseVerboseJson"])

    model_config = ConfigDict(
        validate_assignment=True,
        protected_namespaces=(),
    )


    def __init__(self, *args, **kwargs) -> None:
        if args:
            if len(args) > 1:
                raise ValueError("If a position argument is used, only 1 is allowed to set `actual_instance`")
            if kwargs:
                raise ValueError("If a position argument is used, keyword arguments cannot be used.")
            super().__init__(actual_instance=args[0])
        else:
            super().__init__(**kwargs)

    @field_validator('actual_instance')
    def actual_instance_must_validate_oneof(cls, v):
        instance = CreateTranslation200Response.model_construct()
        error_messages = []
        match = 0
        # validate data type: CreateTranslationResponseJson
        if not isinstance(v, CreateTranslationResponseJson):
            error_messages.append(f"Error! Input type `{type(v)}` is not `CreateTranslationResponseJson`")
        else:
            match += 1
        # validate data type: CreateTranslationResponseVerboseJson
        if not isinstance(v, CreateTranslationResponseVerboseJson):
            error_messages.append(f"Error! Input type `{type(v)}` is not `CreateTranslationResponseVerboseJson`")
        else:
            match += 1
        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when setting `actual_instance` in CreateTranslation200Response with oneOf schemas: CreateTranslationResponseJson, CreateTranslationResponseVerboseJson. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when setting `actual_instance` in CreateTranslation200Response with oneOf schemas: CreateTranslationResponseJson, CreateTranslationResponseVerboseJson. Details: " + ", ".join(error_messages))
        else:
            return v

    @classmethod
    def from_dict(cls, obj: Union[str, Dict[str, Any]]) -> Self:
        return cls.from_json(json.dumps(obj))

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Returns the object represented by the json string"""
        instance = cls.model_construct()
        error_messages = []
        match = 0

        # deserialize data into CreateTranslationResponseJson
        try:
            instance.actual_instance = CreateTranslationResponseJson.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into CreateTranslationResponseVerboseJson
        try:
            instance.actual_instance = CreateTranslationResponseVerboseJson.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))

        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when deserializing the JSON string into CreateTranslation200Response with oneOf schemas: CreateTranslationResponseJson, CreateTranslationResponseVerboseJson. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when deserializing the JSON string into CreateTranslation200Response with oneOf schemas: CreateTranslationResponseJson, CreateTranslationResponseVerboseJson. Details: " + ", ".join(error_messages))
        else:
            return instance

    def to_json(self) -> str:
        """Returns the JSON representation of the actual instance"""
        if self.actual_instance is None:
            return "null"

        if hasattr(self.actual_instance, "to_json") and callable(self.actual_instance.to_json):
            return self.actual_instance.to_json()
        else:
            return json.dumps(self.actual_instance)

    def to_dict(self) -> Optional[Union[Dict[str, Any], CreateTranslationResponseJson, CreateTranslationResponseVerboseJson]]:
        """Returns the dict representation of the actual instance"""
        if self.actual_instance is None:
            return None

        if hasattr(self.actual_instance, "to_dict") and callable(self.actual_instance.to_dict):
            return self.actual_instance.to_dict()
        else:
            # primitive type
            return self.actual_instance

    def to_str(self) -> str:
        """Returns the string representation of the actual instance"""
        return pprint.pformat(self.model_dump())


