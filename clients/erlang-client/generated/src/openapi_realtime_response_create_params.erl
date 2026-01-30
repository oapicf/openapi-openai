-module(openapi_realtime_response_create_params).

-export([encode/1]).

-export_type([openapi_realtime_response_create_params/0]).

-type openapi_realtime_response_create_params() ::
    #{ 'modalities' => list(),
       'instructions' => binary(),
       'voice' => binary(),
       'output_audio_format' => binary(),
       'tools' => list(),
       'tool_choice' => binary(),
       'temperature' => integer(),
       'max_response_output_tokens' => openapi_realtime_response_create_params_max_response_output_tokens:openapi_realtime_response_create_params_max_response_output_tokens(),
       'conversation' => openapi_realtime_response_create_params_conversation:openapi_realtime_response_create_params_conversation(),
       'metadata' => maps:map(),
       'input' => list()
     }.

encode(#{ 'modalities' := Modalities,
          'instructions' := Instructions,
          'voice' := Voice,
          'output_audio_format' := OutputAudioFormat,
          'tools' := Tools,
          'tool_choice' := ToolChoice,
          'temperature' := Temperature,
          'max_response_output_tokens' := MaxResponseOutputTokens,
          'conversation' := Conversation,
          'metadata' := Metadata,
          'input' := Input
        }) ->
    #{ 'modalities' => Modalities,
       'instructions' => Instructions,
       'voice' => Voice,
       'output_audio_format' => OutputAudioFormat,
       'tools' => Tools,
       'tool_choice' => ToolChoice,
       'temperature' => Temperature,
       'max_response_output_tokens' => MaxResponseOutputTokens,
       'conversation' => Conversation,
       'metadata' => Metadata,
       'input' => Input
     }.
