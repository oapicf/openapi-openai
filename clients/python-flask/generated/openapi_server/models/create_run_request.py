from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.assistant_object_tools_inner import AssistantObjectToolsInner
from openapi_server.models.assistants_api_response_format_option import AssistantsApiResponseFormatOption
from openapi_server.models.assistants_api_tool_choice_option import AssistantsApiToolChoiceOption
from openapi_server.models.create_message_request import CreateMessageRequest
from openapi_server.models.create_run_request_model import CreateRunRequestModel
from openapi_server.models.truncation_object import TruncationObject
from openapi_server import util

from openapi_server.models.assistant_object_tools_inner import AssistantObjectToolsInner  # noqa: E501
from openapi_server.models.assistants_api_response_format_option import AssistantsApiResponseFormatOption  # noqa: E501
from openapi_server.models.assistants_api_tool_choice_option import AssistantsApiToolChoiceOption  # noqa: E501
from openapi_server.models.create_message_request import CreateMessageRequest  # noqa: E501
from openapi_server.models.create_run_request_model import CreateRunRequestModel  # noqa: E501
from openapi_server.models.truncation_object import TruncationObject  # noqa: E501

class CreateRunRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, assistant_id=None, model=None, instructions=None, additional_instructions=None, additional_messages=None, tools=None, metadata=None, temperature=1, stream=None, max_prompt_tokens=None, max_completion_tokens=None, truncation_strategy=None, tool_choice=None, response_format=None):  # noqa: E501
        """CreateRunRequest - a model defined in OpenAPI

        :param assistant_id: The assistant_id of this CreateRunRequest.  # noqa: E501
        :type assistant_id: str
        :param model: The model of this CreateRunRequest.  # noqa: E501
        :type model: CreateRunRequestModel
        :param instructions: The instructions of this CreateRunRequest.  # noqa: E501
        :type instructions: str
        :param additional_instructions: The additional_instructions of this CreateRunRequest.  # noqa: E501
        :type additional_instructions: str
        :param additional_messages: The additional_messages of this CreateRunRequest.  # noqa: E501
        :type additional_messages: List[CreateMessageRequest]
        :param tools: The tools of this CreateRunRequest.  # noqa: E501
        :type tools: List[AssistantObjectToolsInner]
        :param metadata: The metadata of this CreateRunRequest.  # noqa: E501
        :type metadata: object
        :param temperature: The temperature of this CreateRunRequest.  # noqa: E501
        :type temperature: float
        :param stream: The stream of this CreateRunRequest.  # noqa: E501
        :type stream: bool
        :param max_prompt_tokens: The max_prompt_tokens of this CreateRunRequest.  # noqa: E501
        :type max_prompt_tokens: int
        :param max_completion_tokens: The max_completion_tokens of this CreateRunRequest.  # noqa: E501
        :type max_completion_tokens: int
        :param truncation_strategy: The truncation_strategy of this CreateRunRequest.  # noqa: E501
        :type truncation_strategy: TruncationObject
        :param tool_choice: The tool_choice of this CreateRunRequest.  # noqa: E501
        :type tool_choice: AssistantsApiToolChoiceOption
        :param response_format: The response_format of this CreateRunRequest.  # noqa: E501
        :type response_format: AssistantsApiResponseFormatOption
        """
        self.openapi_types = {
            'assistant_id': str,
            'model': CreateRunRequestModel,
            'instructions': str,
            'additional_instructions': str,
            'additional_messages': List[CreateMessageRequest],
            'tools': List[AssistantObjectToolsInner],
            'metadata': object,
            'temperature': float,
            'stream': bool,
            'max_prompt_tokens': int,
            'max_completion_tokens': int,
            'truncation_strategy': TruncationObject,
            'tool_choice': AssistantsApiToolChoiceOption,
            'response_format': AssistantsApiResponseFormatOption
        }

        self.attribute_map = {
            'assistant_id': 'assistant_id',
            'model': 'model',
            'instructions': 'instructions',
            'additional_instructions': 'additional_instructions',
            'additional_messages': 'additional_messages',
            'tools': 'tools',
            'metadata': 'metadata',
            'temperature': 'temperature',
            'stream': 'stream',
            'max_prompt_tokens': 'max_prompt_tokens',
            'max_completion_tokens': 'max_completion_tokens',
            'truncation_strategy': 'truncation_strategy',
            'tool_choice': 'tool_choice',
            'response_format': 'response_format'
        }

        self._assistant_id = assistant_id
        self._model = model
        self._instructions = instructions
        self._additional_instructions = additional_instructions
        self._additional_messages = additional_messages
        self._tools = tools
        self._metadata = metadata
        self._temperature = temperature
        self._stream = stream
        self._max_prompt_tokens = max_prompt_tokens
        self._max_completion_tokens = max_completion_tokens
        self._truncation_strategy = truncation_strategy
        self._tool_choice = tool_choice
        self._response_format = response_format

    @classmethod
    def from_dict(cls, dikt) -> 'CreateRunRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateRunRequest of this CreateRunRequest.  # noqa: E501
        :rtype: CreateRunRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def assistant_id(self) -> str:
        """Gets the assistant_id of this CreateRunRequest.

        The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.  # noqa: E501

        :return: The assistant_id of this CreateRunRequest.
        :rtype: str
        """
        return self._assistant_id

    @assistant_id.setter
    def assistant_id(self, assistant_id: str):
        """Sets the assistant_id of this CreateRunRequest.

        The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.  # noqa: E501

        :param assistant_id: The assistant_id of this CreateRunRequest.
        :type assistant_id: str
        """
        if assistant_id is None:
            raise ValueError("Invalid value for `assistant_id`, must not be `None`")  # noqa: E501

        self._assistant_id = assistant_id

    @property
    def model(self) -> CreateRunRequestModel:
        """Gets the model of this CreateRunRequest.


        :return: The model of this CreateRunRequest.
        :rtype: CreateRunRequestModel
        """
        return self._model

    @model.setter
    def model(self, model: CreateRunRequestModel):
        """Sets the model of this CreateRunRequest.


        :param model: The model of this CreateRunRequest.
        :type model: CreateRunRequestModel
        """

        self._model = model

    @property
    def instructions(self) -> str:
        """Gets the instructions of this CreateRunRequest.

        Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.  # noqa: E501

        :return: The instructions of this CreateRunRequest.
        :rtype: str
        """
        return self._instructions

    @instructions.setter
    def instructions(self, instructions: str):
        """Sets the instructions of this CreateRunRequest.

        Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.  # noqa: E501

        :param instructions: The instructions of this CreateRunRequest.
        :type instructions: str
        """

        self._instructions = instructions

    @property
    def additional_instructions(self) -> str:
        """Gets the additional_instructions of this CreateRunRequest.

        Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.  # noqa: E501

        :return: The additional_instructions of this CreateRunRequest.
        :rtype: str
        """
        return self._additional_instructions

    @additional_instructions.setter
    def additional_instructions(self, additional_instructions: str):
        """Sets the additional_instructions of this CreateRunRequest.

        Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.  # noqa: E501

        :param additional_instructions: The additional_instructions of this CreateRunRequest.
        :type additional_instructions: str
        """

        self._additional_instructions = additional_instructions

    @property
    def additional_messages(self) -> List[CreateMessageRequest]:
        """Gets the additional_messages of this CreateRunRequest.

        Adds additional messages to the thread before creating the run.  # noqa: E501

        :return: The additional_messages of this CreateRunRequest.
        :rtype: List[CreateMessageRequest]
        """
        return self._additional_messages

    @additional_messages.setter
    def additional_messages(self, additional_messages: List[CreateMessageRequest]):
        """Sets the additional_messages of this CreateRunRequest.

        Adds additional messages to the thread before creating the run.  # noqa: E501

        :param additional_messages: The additional_messages of this CreateRunRequest.
        :type additional_messages: List[CreateMessageRequest]
        """

        self._additional_messages = additional_messages

    @property
    def tools(self) -> List[AssistantObjectToolsInner]:
        """Gets the tools of this CreateRunRequest.

        Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.  # noqa: E501

        :return: The tools of this CreateRunRequest.
        :rtype: List[AssistantObjectToolsInner]
        """
        return self._tools

    @tools.setter
    def tools(self, tools: List[AssistantObjectToolsInner]):
        """Sets the tools of this CreateRunRequest.

        Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.  # noqa: E501

        :param tools: The tools of this CreateRunRequest.
        :type tools: List[AssistantObjectToolsInner]
        """
        if tools is not None and len(tools) > 20:
            raise ValueError("Invalid value for `tools`, number of items must be less than or equal to `20`")  # noqa: E501

        self._tools = tools

    @property
    def metadata(self) -> object:
        """Gets the metadata of this CreateRunRequest.

        Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.   # noqa: E501

        :return: The metadata of this CreateRunRequest.
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata: object):
        """Sets the metadata of this CreateRunRequest.

        Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.   # noqa: E501

        :param metadata: The metadata of this CreateRunRequest.
        :type metadata: object
        """

        self._metadata = metadata

    @property
    def temperature(self) -> float:
        """Gets the temperature of this CreateRunRequest.

        What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.   # noqa: E501

        :return: The temperature of this CreateRunRequest.
        :rtype: float
        """
        return self._temperature

    @temperature.setter
    def temperature(self, temperature: float):
        """Sets the temperature of this CreateRunRequest.

        What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.   # noqa: E501

        :param temperature: The temperature of this CreateRunRequest.
        :type temperature: float
        """
        if temperature is not None and temperature > 2:  # noqa: E501
            raise ValueError("Invalid value for `temperature`, must be a value less than or equal to `2`")  # noqa: E501
        if temperature is not None and temperature < 0:  # noqa: E501
            raise ValueError("Invalid value for `temperature`, must be a value greater than or equal to `0`")  # noqa: E501

        self._temperature = temperature

    @property
    def stream(self) -> bool:
        """Gets the stream of this CreateRunRequest.

        If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.   # noqa: E501

        :return: The stream of this CreateRunRequest.
        :rtype: bool
        """
        return self._stream

    @stream.setter
    def stream(self, stream: bool):
        """Sets the stream of this CreateRunRequest.

        If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.   # noqa: E501

        :param stream: The stream of this CreateRunRequest.
        :type stream: bool
        """

        self._stream = stream

    @property
    def max_prompt_tokens(self) -> int:
        """Gets the max_prompt_tokens of this CreateRunRequest.

        The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.   # noqa: E501

        :return: The max_prompt_tokens of this CreateRunRequest.
        :rtype: int
        """
        return self._max_prompt_tokens

    @max_prompt_tokens.setter
    def max_prompt_tokens(self, max_prompt_tokens: int):
        """Sets the max_prompt_tokens of this CreateRunRequest.

        The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.   # noqa: E501

        :param max_prompt_tokens: The max_prompt_tokens of this CreateRunRequest.
        :type max_prompt_tokens: int
        """
        if max_prompt_tokens is not None and max_prompt_tokens < 256:  # noqa: E501
            raise ValueError("Invalid value for `max_prompt_tokens`, must be a value greater than or equal to `256`")  # noqa: E501

        self._max_prompt_tokens = max_prompt_tokens

    @property
    def max_completion_tokens(self) -> int:
        """Gets the max_completion_tokens of this CreateRunRequest.

        The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.   # noqa: E501

        :return: The max_completion_tokens of this CreateRunRequest.
        :rtype: int
        """
        return self._max_completion_tokens

    @max_completion_tokens.setter
    def max_completion_tokens(self, max_completion_tokens: int):
        """Sets the max_completion_tokens of this CreateRunRequest.

        The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.   # noqa: E501

        :param max_completion_tokens: The max_completion_tokens of this CreateRunRequest.
        :type max_completion_tokens: int
        """
        if max_completion_tokens is not None and max_completion_tokens < 256:  # noqa: E501
            raise ValueError("Invalid value for `max_completion_tokens`, must be a value greater than or equal to `256`")  # noqa: E501

        self._max_completion_tokens = max_completion_tokens

    @property
    def truncation_strategy(self) -> TruncationObject:
        """Gets the truncation_strategy of this CreateRunRequest.


        :return: The truncation_strategy of this CreateRunRequest.
        :rtype: TruncationObject
        """
        return self._truncation_strategy

    @truncation_strategy.setter
    def truncation_strategy(self, truncation_strategy: TruncationObject):
        """Sets the truncation_strategy of this CreateRunRequest.


        :param truncation_strategy: The truncation_strategy of this CreateRunRequest.
        :type truncation_strategy: TruncationObject
        """

        self._truncation_strategy = truncation_strategy

    @property
    def tool_choice(self) -> AssistantsApiToolChoiceOption:
        """Gets the tool_choice of this CreateRunRequest.


        :return: The tool_choice of this CreateRunRequest.
        :rtype: AssistantsApiToolChoiceOption
        """
        return self._tool_choice

    @tool_choice.setter
    def tool_choice(self, tool_choice: AssistantsApiToolChoiceOption):
        """Sets the tool_choice of this CreateRunRequest.


        :param tool_choice: The tool_choice of this CreateRunRequest.
        :type tool_choice: AssistantsApiToolChoiceOption
        """

        self._tool_choice = tool_choice

    @property
    def response_format(self) -> AssistantsApiResponseFormatOption:
        """Gets the response_format of this CreateRunRequest.


        :return: The response_format of this CreateRunRequest.
        :rtype: AssistantsApiResponseFormatOption
        """
        return self._response_format

    @response_format.setter
    def response_format(self, response_format: AssistantsApiResponseFormatOption):
        """Sets the response_format of this CreateRunRequest.


        :param response_format: The response_format of this CreateRunRequest.
        :type response_format: AssistantsApiResponseFormatOption
        """

        self._response_format = response_format
