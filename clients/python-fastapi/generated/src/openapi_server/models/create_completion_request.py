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




from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing_extensions import Annotated
from openapi_server.models.create_completion_request_model import CreateCompletionRequestModel
from openapi_server.models.create_completion_request_prompt import CreateCompletionRequestPrompt
from openapi_server.models.create_completion_request_stop import CreateCompletionRequestStop
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class CreateCompletionRequest(BaseModel):
    """
    CreateCompletionRequest
    """ # noqa: E501
    model: CreateCompletionRequestModel
    prompt: Optional[CreateCompletionRequestPrompt]
    suffix: Optional[StrictStr] = Field(default=None, description="The suffix that comes after a completion of inserted text.")
    max_tokens: Optional[Annotated[int, Field(strict=True, ge=0)]] = Field(default=16, description="The maximum number of [tokens](/tokenizer) to generate in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. ")
    temperature: Optional[Union[Annotated[float, Field(le=2, strict=True, ge=0)], Annotated[int, Field(le=2, strict=True, ge=0)]]] = Field(default=1, description="What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. ")
    top_p: Optional[Union[Annotated[float, Field(le=1, strict=True, ge=0)], Annotated[int, Field(le=1, strict=True, ge=0)]]] = Field(default=1, description="An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ")
    n: Optional[Annotated[int, Field(le=128, strict=True, ge=1)]] = Field(default=1, description="How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. ")
    stream: Optional[StrictBool] = Field(default=False, description="Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). ")
    logprobs: Optional[Annotated[int, Field(le=5, strict=True, ge=0)]] = Field(default=None, description="Include the log probabilities on the `logprobs` most likely tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. ")
    echo: Optional[StrictBool] = Field(default=False, description="Echo back the prompt in addition to the completion ")
    stop: Optional[CreateCompletionRequestStop] = None
    presence_penalty: Optional[Union[Annotated[float, Field(le=2, strict=True, ge=-2)], Annotated[int, Field(le=2, strict=True, ge=-2)]]] = Field(default=0, description="Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) ")
    frequency_penalty: Optional[Union[Annotated[float, Field(le=2, strict=True, ge=-2)], Annotated[int, Field(le=2, strict=True, ge=-2)]]] = Field(default=0, description="Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) ")
    best_of: Optional[Annotated[int, Field(le=20, strict=True, ge=0)]] = Field(default=1, description="Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. ")
    logit_bias: Optional[Dict[str, Any]] = Field(default=None, description="Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) (which works for both GPT-2 and GPT-3) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated. ")
    user: Optional[StrictStr] = Field(default=None, description="A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
    __properties: ClassVar[List[str]] = ["model", "prompt", "suffix", "max_tokens", "temperature", "top_p", "n", "stream", "logprobs", "echo", "stop", "presence_penalty", "frequency_penalty", "best_of", "logit_bias", "user"]

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
        """Create an instance of CreateCompletionRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of prompt
        if self.prompt:
            _dict['prompt'] = self.prompt.to_dict()
        # override the default output from pydantic by calling `to_dict()` of stop
        if self.stop:
            _dict['stop'] = self.stop.to_dict()
        # set to None if prompt (nullable) is None
        # and model_fields_set contains the field
        if self.prompt is None and "prompt" in self.model_fields_set:
            _dict['prompt'] = None

        # set to None if suffix (nullable) is None
        # and model_fields_set contains the field
        if self.suffix is None and "suffix" in self.model_fields_set:
            _dict['suffix'] = None

        # set to None if max_tokens (nullable) is None
        # and model_fields_set contains the field
        if self.max_tokens is None and "max_tokens" in self.model_fields_set:
            _dict['max_tokens'] = None

        # set to None if temperature (nullable) is None
        # and model_fields_set contains the field
        if self.temperature is None and "temperature" in self.model_fields_set:
            _dict['temperature'] = None

        # set to None if top_p (nullable) is None
        # and model_fields_set contains the field
        if self.top_p is None and "top_p" in self.model_fields_set:
            _dict['top_p'] = None

        # set to None if n (nullable) is None
        # and model_fields_set contains the field
        if self.n is None and "n" in self.model_fields_set:
            _dict['n'] = None

        # set to None if stream (nullable) is None
        # and model_fields_set contains the field
        if self.stream is None and "stream" in self.model_fields_set:
            _dict['stream'] = None

        # set to None if logprobs (nullable) is None
        # and model_fields_set contains the field
        if self.logprobs is None and "logprobs" in self.model_fields_set:
            _dict['logprobs'] = None

        # set to None if echo (nullable) is None
        # and model_fields_set contains the field
        if self.echo is None and "echo" in self.model_fields_set:
            _dict['echo'] = None

        # set to None if stop (nullable) is None
        # and model_fields_set contains the field
        if self.stop is None and "stop" in self.model_fields_set:
            _dict['stop'] = None

        # set to None if presence_penalty (nullable) is None
        # and model_fields_set contains the field
        if self.presence_penalty is None and "presence_penalty" in self.model_fields_set:
            _dict['presence_penalty'] = None

        # set to None if frequency_penalty (nullable) is None
        # and model_fields_set contains the field
        if self.frequency_penalty is None and "frequency_penalty" in self.model_fields_set:
            _dict['frequency_penalty'] = None

        # set to None if best_of (nullable) is None
        # and model_fields_set contains the field
        if self.best_of is None and "best_of" in self.model_fields_set:
            _dict['best_of'] = None

        # set to None if logit_bias (nullable) is None
        # and model_fields_set contains the field
        if self.logit_bias is None and "logit_bias" in self.model_fields_set:
            _dict['logit_bias'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of CreateCompletionRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "model": CreateCompletionRequestModel.from_dict(obj.get("model")) if obj.get("model") is not None else None,
            "prompt": CreateCompletionRequestPrompt.from_dict(obj.get("prompt")) if obj.get("prompt") is not None else None,
            "suffix": obj.get("suffix"),
            "max_tokens": obj.get("max_tokens") if obj.get("max_tokens") is not None else 16,
            "temperature": obj.get("temperature") if obj.get("temperature") is not None else 1,
            "top_p": obj.get("top_p") if obj.get("top_p") is not None else 1,
            "n": obj.get("n") if obj.get("n") is not None else 1,
            "stream": obj.get("stream") if obj.get("stream") is not None else False,
            "logprobs": obj.get("logprobs"),
            "echo": obj.get("echo") if obj.get("echo") is not None else False,
            "stop": CreateCompletionRequestStop.from_dict(obj.get("stop")) if obj.get("stop") is not None else None,
            "presence_penalty": obj.get("presence_penalty") if obj.get("presence_penalty") is not None else 0,
            "frequency_penalty": obj.get("frequency_penalty") if obj.get("frequency_penalty") is not None else 0,
            "best_of": obj.get("best_of") if obj.get("best_of") is not None else 1,
            "logit_bias": obj.get("logit_bias"),
            "user": obj.get("user")
        })
        return _obj

