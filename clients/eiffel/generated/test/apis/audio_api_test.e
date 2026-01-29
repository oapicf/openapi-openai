note
    description: "API tests for AUDIO_API"
    date: "$Date$"
    revision: "$Revision$"


class AUDIO_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_create_speech
            -- Generates audio from the input text.
            --
            -- 
        local
            l_response: FILE
            l_create_speech_request: CREATE_SPEECH_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_speech_request

            -- l_response := api.create_speech(l_create_speech_request)
            assert ("not_implemented", False)
        end

    test_create_transcription
            -- Transcribes audio into the input language.
            --
            -- 
        local
            l_response: CREATE_TRANSCRIPTION_200_RESPONSE
            l_file: FILE
            l_model: CREATE_TRANSCRIPTION_REQUEST_MODEL
            l_language: STRING_32
            l_prompt: STRING_32
            l_response_format: STRING_32
            l_temperature: REAL_32
            l_timestamp_granularities: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
            -- l_file
            -- l_model

            -- l_response := api.create_transcription(l_file, l_model, l_language, l_prompt, l_response_format, l_temperature, l_timestamp_granularities)
            assert ("not_implemented", False)
        end

    test_create_translation
            -- Translates audio into English.
            --
            -- 
        local
            l_response: CREATE_TRANSLATION_200_RESPONSE
            l_file: FILE
            l_model: CREATE_TRANSCRIPTION_REQUEST_MODEL
            l_prompt: STRING_32
            l_response_format: STRING_32
            l_temperature: REAL_32
        do
            -- TODO: Initialize required params.
            -- l_file
            -- l_model

            -- l_response := api.create_translation(l_file, l_model, l_prompt, l_response_format, l_temperature)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: AUDIO_API
            -- Create an object instance of `AUDIO_API'.
        once
            create { AUDIO_API } Result
        end

end
