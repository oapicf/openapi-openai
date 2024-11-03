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
from openapiopenai.models.run_step_details_tool_calls_code_object import RunStepDetailsToolCallsCodeObject
from openapiopenai.models.run_step_details_tool_calls_function_object import RunStepDetailsToolCallsFunctionObject
from openapiopenai.models.run_step_details_tool_calls_retrieval_object import RunStepDetailsToolCallsRetrievalObject
from pydantic import StrictStr, Field
from typing import Union, List, Set, Optional, Dict
from typing_extensions import Literal, Self

RUNSTEPDETAILSTOOLCALLSOBJECTTOOLCALLSINNER_ONE_OF_SCHEMAS = ["RunStepDetailsToolCallsCodeObject", "RunStepDetailsToolCallsFunctionObject", "RunStepDetailsToolCallsRetrievalObject"]

class RunStepDetailsToolCallsObjectToolCallsInner(BaseModel):
    """
    RunStepDetailsToolCallsObjectToolCallsInner
    """
    # data type: RunStepDetailsToolCallsCodeObject
    oneof_schema_1_validator: Optional[RunStepDetailsToolCallsCodeObject] = None
    # data type: RunStepDetailsToolCallsRetrievalObject
    oneof_schema_2_validator: Optional[RunStepDetailsToolCallsRetrievalObject] = None
    # data type: RunStepDetailsToolCallsFunctionObject
    oneof_schema_3_validator: Optional[RunStepDetailsToolCallsFunctionObject] = None
    actual_instance: Optional[Union[RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFunctionObject, RunStepDetailsToolCallsRetrievalObject]] = None
    one_of_schemas: Set[str] = { "RunStepDetailsToolCallsCodeObject", "RunStepDetailsToolCallsFunctionObject", "RunStepDetailsToolCallsRetrievalObject" }

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
        instance = RunStepDetailsToolCallsObjectToolCallsInner.model_construct()
        error_messages = []
        match = 0
        # validate data type: RunStepDetailsToolCallsCodeObject
        if not isinstance(v, RunStepDetailsToolCallsCodeObject):
            error_messages.append(f"Error! Input type `{type(v)}` is not `RunStepDetailsToolCallsCodeObject`")
        else:
            match += 1
        # validate data type: RunStepDetailsToolCallsRetrievalObject
        if not isinstance(v, RunStepDetailsToolCallsRetrievalObject):
            error_messages.append(f"Error! Input type `{type(v)}` is not `RunStepDetailsToolCallsRetrievalObject`")
        else:
            match += 1
        # validate data type: RunStepDetailsToolCallsFunctionObject
        if not isinstance(v, RunStepDetailsToolCallsFunctionObject):
            error_messages.append(f"Error! Input type `{type(v)}` is not `RunStepDetailsToolCallsFunctionObject`")
        else:
            match += 1
        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when setting `actual_instance` in RunStepDetailsToolCallsObjectToolCallsInner with oneOf schemas: RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFunctionObject, RunStepDetailsToolCallsRetrievalObject. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when setting `actual_instance` in RunStepDetailsToolCallsObjectToolCallsInner with oneOf schemas: RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFunctionObject, RunStepDetailsToolCallsRetrievalObject. Details: " + ", ".join(error_messages))
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

        # deserialize data into RunStepDetailsToolCallsCodeObject
        try:
            instance.actual_instance = RunStepDetailsToolCallsCodeObject.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into RunStepDetailsToolCallsRetrievalObject
        try:
            instance.actual_instance = RunStepDetailsToolCallsRetrievalObject.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into RunStepDetailsToolCallsFunctionObject
        try:
            instance.actual_instance = RunStepDetailsToolCallsFunctionObject.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))

        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when deserializing the JSON string into RunStepDetailsToolCallsObjectToolCallsInner with oneOf schemas: RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFunctionObject, RunStepDetailsToolCallsRetrievalObject. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when deserializing the JSON string into RunStepDetailsToolCallsObjectToolCallsInner with oneOf schemas: RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFunctionObject, RunStepDetailsToolCallsRetrievalObject. Details: " + ", ".join(error_messages))
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

    def to_dict(self) -> Optional[Union[Dict[str, Any], RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFunctionObject, RunStepDetailsToolCallsRetrievalObject]]:
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


