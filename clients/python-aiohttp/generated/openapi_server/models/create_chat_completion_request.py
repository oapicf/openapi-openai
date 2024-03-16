# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.chat_completion_functions import ChatCompletionFunctions
from openapi_server.models.chat_completion_request_message import ChatCompletionRequestMessage
from openapi_server.models.create_chat_completion_request_function_call import CreateChatCompletionRequestFunctionCall
from openapi_server.models.create_chat_completion_request_model import CreateChatCompletionRequestModel
from openapi_server.models.create_chat_completion_request_stop import CreateChatCompletionRequestStop
from openapi_server import util


class CreateChatCompletionRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, model: CreateChatCompletionRequestModel=None, messages: List[ChatCompletionRequestMessage]=None, functions: List[ChatCompletionFunctions]=None, function_call: CreateChatCompletionRequestFunctionCall=None, temperature: float=1, top_p: float=1, n: int=1, stream: bool=False, stop: CreateChatCompletionRequestStop=None, max_tokens: int=None, presence_penalty: float=0, frequency_penalty: float=0, logit_bias: object=None, user: str=None):
        """CreateChatCompletionRequest - a model defined in OpenAPI

        :param model: The model of this CreateChatCompletionRequest.
        :param messages: The messages of this CreateChatCompletionRequest.
        :param functions: The functions of this CreateChatCompletionRequest.
        :param function_call: The function_call of this CreateChatCompletionRequest.
        :param temperature: The temperature of this CreateChatCompletionRequest.
        :param top_p: The top_p of this CreateChatCompletionRequest.
        :param n: The n of this CreateChatCompletionRequest.
        :param stream: The stream of this CreateChatCompletionRequest.
        :param stop: The stop of this CreateChatCompletionRequest.
        :param max_tokens: The max_tokens of this CreateChatCompletionRequest.
        :param presence_penalty: The presence_penalty of this CreateChatCompletionRequest.
        :param frequency_penalty: The frequency_penalty of this CreateChatCompletionRequest.
        :param logit_bias: The logit_bias of this CreateChatCompletionRequest.
        :param user: The user of this CreateChatCompletionRequest.
        """
        self.openapi_types = {
            'model': CreateChatCompletionRequestModel,
            'messages': List[ChatCompletionRequestMessage],
            'functions': List[ChatCompletionFunctions],
            'function_call': CreateChatCompletionRequestFunctionCall,
            'temperature': float,
            'top_p': float,
            'n': int,
            'stream': bool,
            'stop': CreateChatCompletionRequestStop,
            'max_tokens': int,
            'presence_penalty': float,
            'frequency_penalty': float,
            'logit_bias': object,
            'user': str
        }

        self.attribute_map = {
            'model': 'model',
            'messages': 'messages',
            'functions': 'functions',
            'function_call': 'function_call',
            'temperature': 'temperature',
            'top_p': 'top_p',
            'n': 'n',
            'stream': 'stream',
            'stop': 'stop',
            'max_tokens': 'max_tokens',
            'presence_penalty': 'presence_penalty',
            'frequency_penalty': 'frequency_penalty',
            'logit_bias': 'logit_bias',
            'user': 'user'
        }

        self._model = model
        self._messages = messages
        self._functions = functions
        self._function_call = function_call
        self._temperature = temperature
        self._top_p = top_p
        self._n = n
        self._stream = stream
        self._stop = stop
        self._max_tokens = max_tokens
        self._presence_penalty = presence_penalty
        self._frequency_penalty = frequency_penalty
        self._logit_bias = logit_bias
        self._user = user

    @classmethod
    def from_dict(cls, dikt: dict) -> 'CreateChatCompletionRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The CreateChatCompletionRequest of this CreateChatCompletionRequest.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def model(self):
        """Gets the model of this CreateChatCompletionRequest.


        :return: The model of this CreateChatCompletionRequest.
        :rtype: CreateChatCompletionRequestModel
        """
        return self._model

    @model.setter
    def model(self, model):
        """Sets the model of this CreateChatCompletionRequest.


        :param model: The model of this CreateChatCompletionRequest.
        :type model: CreateChatCompletionRequestModel
        """
        if model is None:
            raise ValueError("Invalid value for `model`, must not be `None`")

        self._model = model

    @property
    def messages(self):
        """Gets the messages of this CreateChatCompletionRequest.

        A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).

        :return: The messages of this CreateChatCompletionRequest.
        :rtype: List[ChatCompletionRequestMessage]
        """
        return self._messages

    @messages.setter
    def messages(self, messages):
        """Sets the messages of this CreateChatCompletionRequest.

        A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).

        :param messages: The messages of this CreateChatCompletionRequest.
        :type messages: List[ChatCompletionRequestMessage]
        """
        if messages is None:
            raise ValueError("Invalid value for `messages`, must not be `None`")
        if messages is not None and len(messages) < 1:
            raise ValueError("Invalid value for `messages`, number of items must be greater than or equal to `1`")

        self._messages = messages

    @property
    def functions(self):
        """Gets the functions of this CreateChatCompletionRequest.

        A list of functions the model may generate JSON inputs for.

        :return: The functions of this CreateChatCompletionRequest.
        :rtype: List[ChatCompletionFunctions]
        """
        return self._functions

    @functions.setter
    def functions(self, functions):
        """Sets the functions of this CreateChatCompletionRequest.

        A list of functions the model may generate JSON inputs for.

        :param functions: The functions of this CreateChatCompletionRequest.
        :type functions: List[ChatCompletionFunctions]
        """
        if functions is not None and len(functions) < 1:
            raise ValueError("Invalid value for `functions`, number of items must be greater than or equal to `1`")

        self._functions = functions

    @property
    def function_call(self):
        """Gets the function_call of this CreateChatCompletionRequest.


        :return: The function_call of this CreateChatCompletionRequest.
        :rtype: CreateChatCompletionRequestFunctionCall
        """
        return self._function_call

    @function_call.setter
    def function_call(self, function_call):
        """Sets the function_call of this CreateChatCompletionRequest.


        :param function_call: The function_call of this CreateChatCompletionRequest.
        :type function_call: CreateChatCompletionRequestFunctionCall
        """

        self._function_call = function_call

    @property
    def temperature(self):
        """Gets the temperature of this CreateChatCompletionRequest.

        What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 

        :return: The temperature of this CreateChatCompletionRequest.
        :rtype: float
        """
        return self._temperature

    @temperature.setter
    def temperature(self, temperature):
        """Sets the temperature of this CreateChatCompletionRequest.

        What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 

        :param temperature: The temperature of this CreateChatCompletionRequest.
        :type temperature: float
        """
        if temperature is not None and temperature > 2:
            raise ValueError("Invalid value for `temperature`, must be a value less than or equal to `2`")
        if temperature is not None and temperature < 0:
            raise ValueError("Invalid value for `temperature`, must be a value greater than or equal to `0`")

        self._temperature = temperature

    @property
    def top_p(self):
        """Gets the top_p of this CreateChatCompletionRequest.

        An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 

        :return: The top_p of this CreateChatCompletionRequest.
        :rtype: float
        """
        return self._top_p

    @top_p.setter
    def top_p(self, top_p):
        """Sets the top_p of this CreateChatCompletionRequest.

        An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 

        :param top_p: The top_p of this CreateChatCompletionRequest.
        :type top_p: float
        """
        if top_p is not None and top_p > 1:
            raise ValueError("Invalid value for `top_p`, must be a value less than or equal to `1`")
        if top_p is not None and top_p < 0:
            raise ValueError("Invalid value for `top_p`, must be a value greater than or equal to `0`")

        self._top_p = top_p

    @property
    def n(self):
        """Gets the n of this CreateChatCompletionRequest.

        How many chat completion choices to generate for each input message.

        :return: The n of this CreateChatCompletionRequest.
        :rtype: int
        """
        return self._n

    @n.setter
    def n(self, n):
        """Sets the n of this CreateChatCompletionRequest.

        How many chat completion choices to generate for each input message.

        :param n: The n of this CreateChatCompletionRequest.
        :type n: int
        """
        if n is not None and n > 128:
            raise ValueError("Invalid value for `n`, must be a value less than or equal to `128`")
        if n is not None and n < 1:
            raise ValueError("Invalid value for `n`, must be a value greater than or equal to `1`")

        self._n = n

    @property
    def stream(self):
        """Gets the stream of this CreateChatCompletionRequest.

        If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 

        :return: The stream of this CreateChatCompletionRequest.
        :rtype: bool
        """
        return self._stream

    @stream.setter
    def stream(self, stream):
        """Sets the stream of this CreateChatCompletionRequest.

        If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 

        :param stream: The stream of this CreateChatCompletionRequest.
        :type stream: bool
        """

        self._stream = stream

    @property
    def stop(self):
        """Gets the stop of this CreateChatCompletionRequest.


        :return: The stop of this CreateChatCompletionRequest.
        :rtype: CreateChatCompletionRequestStop
        """
        return self._stop

    @stop.setter
    def stop(self, stop):
        """Sets the stop of this CreateChatCompletionRequest.


        :param stop: The stop of this CreateChatCompletionRequest.
        :type stop: CreateChatCompletionRequestStop
        """

        self._stop = stop

    @property
    def max_tokens(self):
        """Gets the max_tokens of this CreateChatCompletionRequest.

        The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 

        :return: The max_tokens of this CreateChatCompletionRequest.
        :rtype: int
        """
        return self._max_tokens

    @max_tokens.setter
    def max_tokens(self, max_tokens):
        """Sets the max_tokens of this CreateChatCompletionRequest.

        The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 

        :param max_tokens: The max_tokens of this CreateChatCompletionRequest.
        :type max_tokens: int
        """

        self._max_tokens = max_tokens

    @property
    def presence_penalty(self):
        """Gets the presence_penalty of this CreateChatCompletionRequest.

        Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 

        :return: The presence_penalty of this CreateChatCompletionRequest.
        :rtype: float
        """
        return self._presence_penalty

    @presence_penalty.setter
    def presence_penalty(self, presence_penalty):
        """Sets the presence_penalty of this CreateChatCompletionRequest.

        Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 

        :param presence_penalty: The presence_penalty of this CreateChatCompletionRequest.
        :type presence_penalty: float
        """
        if presence_penalty is not None and presence_penalty > 2:
            raise ValueError("Invalid value for `presence_penalty`, must be a value less than or equal to `2`")
        if presence_penalty is not None and presence_penalty < -2:
            raise ValueError("Invalid value for `presence_penalty`, must be a value greater than or equal to `-2`")

        self._presence_penalty = presence_penalty

    @property
    def frequency_penalty(self):
        """Gets the frequency_penalty of this CreateChatCompletionRequest.

        Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 

        :return: The frequency_penalty of this CreateChatCompletionRequest.
        :rtype: float
        """
        return self._frequency_penalty

    @frequency_penalty.setter
    def frequency_penalty(self, frequency_penalty):
        """Sets the frequency_penalty of this CreateChatCompletionRequest.

        Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 

        :param frequency_penalty: The frequency_penalty of this CreateChatCompletionRequest.
        :type frequency_penalty: float
        """
        if frequency_penalty is not None and frequency_penalty > 2:
            raise ValueError("Invalid value for `frequency_penalty`, must be a value less than or equal to `2`")
        if frequency_penalty is not None and frequency_penalty < -2:
            raise ValueError("Invalid value for `frequency_penalty`, must be a value greater than or equal to `-2`")

        self._frequency_penalty = frequency_penalty

    @property
    def logit_bias(self):
        """Gets the logit_bias of this CreateChatCompletionRequest.

        Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 

        :return: The logit_bias of this CreateChatCompletionRequest.
        :rtype: object
        """
        return self._logit_bias

    @logit_bias.setter
    def logit_bias(self, logit_bias):
        """Sets the logit_bias of this CreateChatCompletionRequest.

        Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 

        :param logit_bias: The logit_bias of this CreateChatCompletionRequest.
        :type logit_bias: object
        """

        self._logit_bias = logit_bias

    @property
    def user(self):
        """Gets the user of this CreateChatCompletionRequest.

        A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 

        :return: The user of this CreateChatCompletionRequest.
        :rtype: str
        """
        return self._user

    @user.setter
    def user(self, user):
        """Sets the user of this CreateChatCompletionRequest.

        A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 

        :param user: The user of this CreateChatCompletionRequest.
        :type user: str
        """

        self._user = user