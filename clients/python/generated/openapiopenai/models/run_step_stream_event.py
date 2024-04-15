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
from openapiopenai.models.run_step_stream_event_one_of import RunStepStreamEventOneOf
from openapiopenai.models.run_step_stream_event_one_of1 import RunStepStreamEventOneOf1
from openapiopenai.models.run_step_stream_event_one_of2 import RunStepStreamEventOneOf2
from openapiopenai.models.run_step_stream_event_one_of3 import RunStepStreamEventOneOf3
from openapiopenai.models.run_step_stream_event_one_of4 import RunStepStreamEventOneOf4
from openapiopenai.models.run_step_stream_event_one_of5 import RunStepStreamEventOneOf5
from openapiopenai.models.run_step_stream_event_one_of6 import RunStepStreamEventOneOf6
from pydantic import StrictStr, Field
from typing import Union, List, Optional, Dict
from typing_extensions import Literal, Self

RUNSTEPSTREAMEVENT_ONE_OF_SCHEMAS = ["RunStepStreamEventOneOf", "RunStepStreamEventOneOf1", "RunStepStreamEventOneOf2", "RunStepStreamEventOneOf3", "RunStepStreamEventOneOf4", "RunStepStreamEventOneOf5", "RunStepStreamEventOneOf6"]

class RunStepStreamEvent(BaseModel):
    """
    RunStepStreamEvent
    """
    # data type: RunStepStreamEventOneOf
    oneof_schema_1_validator: Optional[RunStepStreamEventOneOf] = None
    # data type: RunStepStreamEventOneOf1
    oneof_schema_2_validator: Optional[RunStepStreamEventOneOf1] = None
    # data type: RunStepStreamEventOneOf2
    oneof_schema_3_validator: Optional[RunStepStreamEventOneOf2] = None
    # data type: RunStepStreamEventOneOf3
    oneof_schema_4_validator: Optional[RunStepStreamEventOneOf3] = None
    # data type: RunStepStreamEventOneOf4
    oneof_schema_5_validator: Optional[RunStepStreamEventOneOf4] = None
    # data type: RunStepStreamEventOneOf5
    oneof_schema_6_validator: Optional[RunStepStreamEventOneOf5] = None
    # data type: RunStepStreamEventOneOf6
    oneof_schema_7_validator: Optional[RunStepStreamEventOneOf6] = None
    actual_instance: Optional[Union[RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6]] = None
    one_of_schemas: List[str] = Field(default=Literal["RunStepStreamEventOneOf", "RunStepStreamEventOneOf1", "RunStepStreamEventOneOf2", "RunStepStreamEventOneOf3", "RunStepStreamEventOneOf4", "RunStepStreamEventOneOf5", "RunStepStreamEventOneOf6"])

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
        instance = RunStepStreamEvent.model_construct()
        error_messages = []
        match = 0
        # validate data type: RunStepStreamEventOneOf
        if not isinstance(v, RunStepStreamEventOneOf):
            error_messages.append(f"Error! Input type `{type(v)}` is not `RunStepStreamEventOneOf`")
        else:
            match += 1
        # validate data type: RunStepStreamEventOneOf1
        if not isinstance(v, RunStepStreamEventOneOf1):
            error_messages.append(f"Error! Input type `{type(v)}` is not `RunStepStreamEventOneOf1`")
        else:
            match += 1
        # validate data type: RunStepStreamEventOneOf2
        if not isinstance(v, RunStepStreamEventOneOf2):
            error_messages.append(f"Error! Input type `{type(v)}` is not `RunStepStreamEventOneOf2`")
        else:
            match += 1
        # validate data type: RunStepStreamEventOneOf3
        if not isinstance(v, RunStepStreamEventOneOf3):
            error_messages.append(f"Error! Input type `{type(v)}` is not `RunStepStreamEventOneOf3`")
        else:
            match += 1
        # validate data type: RunStepStreamEventOneOf4
        if not isinstance(v, RunStepStreamEventOneOf4):
            error_messages.append(f"Error! Input type `{type(v)}` is not `RunStepStreamEventOneOf4`")
        else:
            match += 1
        # validate data type: RunStepStreamEventOneOf5
        if not isinstance(v, RunStepStreamEventOneOf5):
            error_messages.append(f"Error! Input type `{type(v)}` is not `RunStepStreamEventOneOf5`")
        else:
            match += 1
        # validate data type: RunStepStreamEventOneOf6
        if not isinstance(v, RunStepStreamEventOneOf6):
            error_messages.append(f"Error! Input type `{type(v)}` is not `RunStepStreamEventOneOf6`")
        else:
            match += 1
        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when setting `actual_instance` in RunStepStreamEvent with oneOf schemas: RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when setting `actual_instance` in RunStepStreamEvent with oneOf schemas: RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6. Details: " + ", ".join(error_messages))
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

        # deserialize data into RunStepStreamEventOneOf
        try:
            instance.actual_instance = RunStepStreamEventOneOf.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into RunStepStreamEventOneOf1
        try:
            instance.actual_instance = RunStepStreamEventOneOf1.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into RunStepStreamEventOneOf2
        try:
            instance.actual_instance = RunStepStreamEventOneOf2.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into RunStepStreamEventOneOf3
        try:
            instance.actual_instance = RunStepStreamEventOneOf3.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into RunStepStreamEventOneOf4
        try:
            instance.actual_instance = RunStepStreamEventOneOf4.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into RunStepStreamEventOneOf5
        try:
            instance.actual_instance = RunStepStreamEventOneOf5.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into RunStepStreamEventOneOf6
        try:
            instance.actual_instance = RunStepStreamEventOneOf6.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))

        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when deserializing the JSON string into RunStepStreamEvent with oneOf schemas: RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when deserializing the JSON string into RunStepStreamEvent with oneOf schemas: RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6. Details: " + ", ".join(error_messages))
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

    def to_dict(self) -> Optional[Union[Dict[str, Any], RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6]]:
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

