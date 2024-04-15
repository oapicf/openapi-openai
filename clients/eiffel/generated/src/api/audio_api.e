note
 description:"[
		OpenAI API
 		The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
  		The version of the OpenAPI document: 2.0.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"

class
	AUDIO_API

inherit

    API_I


feature -- API Access


	create_speech (create_speech_request: CREATE_SPEECH_REQUEST): detachable FILE
			-- Generates audio from the input text.
			-- 
			-- 
			-- argument: create_speech_request  (required)
			-- 
			-- 
			-- Result FILE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(create_speech_request)
			l_path := "/audio/speech"


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/octet-stream">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<"application/json">>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"ApiKeyAuth">>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { FILE } l_response.data ({ FILE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	create_transcription (file: FILE; model: CREATE_TRANSCRIPTION_REQUEST_MODEL; language: STRING_32; prompt: STRING_32; response_format: STRING_32; temperature: REAL_32; timestamp_granularities: detachable LIST [STRING_32]): detachable CREATE_TRANSCRIPTION_200_RESPONSE
			-- Transcribes audio into the input language.
			-- 
			-- 
			-- argument: file The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  (required)
			-- 
			-- argument: model  (required)
			-- 
			-- argument: language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional, default to null)
			-- 
			-- argument: prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional, default to null)
			-- 
			-- argument: response_format The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  (optional, default to json)
			-- 
			-- argument: temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
			-- 
			-- argument: timestamp_granularities The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  (optional, default to null)
			-- 
			-- 
			-- Result CREATE_TRANSCRIPTION_200_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/audio/transcriptions"

			if attached file as l_file then
				l_request.add_form(l_file,"file");
			end
			if attached model as l_model then
				l_request.add_form(l_model,"model");
			end
			if attached language as l_language then
				l_request.add_form(l_language,"language");
			end
			if attached prompt as l_prompt then
				l_request.add_form(l_prompt,"prompt");
			end
			if attached response_format as l_response_format then
				l_request.add_form(l_response_format,"response_format");
			end
			if attached temperature as l_temperature then
				l_request.add_form(l_temperature,"temperature");
			end
			if attached timestamp_granularities as l_timestamp_granularities then
				l_request.add_form(l_timestamp_granularities,"timestamp_granularities[]");
			end

			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<"multipart/form-data">>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"ApiKeyAuth">>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { CREATE_TRANSCRIPTION_200_RESPONSE } l_response.data ({ CREATE_TRANSCRIPTION_200_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	create_translation (file: FILE; model: CREATE_TRANSCRIPTION_REQUEST_MODEL; prompt: STRING_32; response_format: STRING_32; temperature: REAL_32): detachable CREATE_TRANSLATION_200_RESPONSE
			-- Translates audio into English.
			-- 
			-- 
			-- argument: file The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  (required)
			-- 
			-- argument: model  (required)
			-- 
			-- argument: prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional, default to null)
			-- 
			-- argument: response_format The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  (optional, default to json)
			-- 
			-- argument: temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
			-- 
			-- 
			-- Result CREATE_TRANSLATION_200_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/audio/translations"

			if attached file as l_file then
				l_request.add_form(l_file,"file");
			end
			if attached model as l_model then
				l_request.add_form(l_model,"model");
			end
			if attached prompt as l_prompt then
				l_request.add_form(l_prompt,"prompt");
			end
			if attached response_format as l_response_format then
				l_request.add_form(l_response_format,"response_format");
			end
			if attached temperature as l_temperature then
				l_request.add_form(l_temperature,"temperature");
			end

			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<"multipart/form-data">>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"ApiKeyAuth">>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { CREATE_TRANSLATION_200_RESPONSE } l_response.data ({ CREATE_TRANSLATION_200_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end


end