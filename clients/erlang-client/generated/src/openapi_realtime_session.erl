-module(openapi_realtime_session).

-export([encode/1]).

-export_type([openapi_realtime_session/0]).

-type openapi_realtime_session() ::
    #{ 'id' => binary(),
       'modalities' => list(),
       'model' => openapi_realtime_session_model:openapi_realtime_session_model(),
       'instructions' => binary(),
       'voice' => binary(),
       'input_audio_format' => binary(),
       'output_audio_format' => binary(),
       'input_audio_transcription' => openapi_realtime_session_input_audio_transcription:openapi_realtime_session_input_audio_transcription(),
       'turn_detection' => openapi_realtime_session_turn_detection:openapi_realtime_session_turn_detection(),
       'tools' => list(),
       'tool_choice' => binary(),
       'temperature' => integer(),
       'max_response_output_tokens' => openapi_realtime_response_create_params_max_response_output_tokens:openapi_realtime_response_create_params_max_response_output_tokens()
     }.

encode(#{ 'id' := Id,
          'modalities' := Modalities,
          'model' := Model,
          'instructions' := Instructions,
          'voice' := Voice,
          'input_audio_format' := InputAudioFormat,
          'output_audio_format' := OutputAudioFormat,
          'input_audio_transcription' := InputAudioTranscription,
          'turn_detection' := TurnDetection,
          'tools' := Tools,
          'tool_choice' := ToolChoice,
          'temperature' := Temperature,
          'max_response_output_tokens' := MaxResponseOutputTokens
        }) ->
    #{ 'id' => Id,
       'modalities' => Modalities,
       'model' => Model,
       'instructions' => Instructions,
       'voice' => Voice,
       'input_audio_format' => InputAudioFormat,
       'output_audio_format' => OutputAudioFormat,
       'input_audio_transcription' => InputAudioTranscription,
       'turn_detection' => TurnDetection,
       'tools' => Tools,
       'tool_choice' => ToolChoice,
       'temperature' => Temperature,
       'max_response_output_tokens' => MaxResponseOutputTokens
     }.
