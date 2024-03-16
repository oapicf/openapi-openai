note
    description: "API tests for OPENAI_API"
    date: "$Date$"
    revision: "$Revision$"


class OPENAI_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_cancel_fine_tune
            -- Immediately cancel a fine-tune job. 
            --
            -- 
        local
            l_response: FINE_TUNE
            l_fine_tune_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_fine_tune_id

            -- l_response := api.cancel_fine_tune(l_fine_tune_id)
            assert ("not_implemented", False)
        end

    test_create_chat_completion
            -- Creates a model response for the given chat conversation.
            --
            -- 
        local
            l_response: CREATE_CHAT_COMPLETION_RESPONSE
            l_create_chat_completion_request: CREATE_CHAT_COMPLETION_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_chat_completion_request

            -- l_response := api.create_chat_completion(l_create_chat_completion_request)
            assert ("not_implemented", False)
        end

    test_create_completion
            -- Creates a completion for the provided prompt and parameters.
            --
            -- 
        local
            l_response: CREATE_COMPLETION_RESPONSE
            l_create_completion_request: CREATE_COMPLETION_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_completion_request

            -- l_response := api.create_completion(l_create_completion_request)
            assert ("not_implemented", False)
        end

    test_create_edit
            -- Creates a new edit for the provided input, instruction, and parameters.
            --
            -- 
        local
            l_response: CREATE_EDIT_RESPONSE
            l_create_edit_request: CREATE_EDIT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_edit_request

            -- l_response := api.create_edit(l_create_edit_request)
            assert ("not_implemented", False)
        end

    test_create_embedding
            -- Creates an embedding vector representing the input text.
            --
            -- 
        local
            l_response: CREATE_EMBEDDING_RESPONSE
            l_create_embedding_request: CREATE_EMBEDDING_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_embedding_request

            -- l_response := api.create_embedding(l_create_embedding_request)
            assert ("not_implemented", False)
        end

    test_create_file
            -- Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
            --
            -- 
        local
            l_response: OPEN_AI_FILE
            l_file: FILE
            l_purpose: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_file
            -- l_purpose

            -- l_response := api.create_file(l_file, l_purpose)
            assert ("not_implemented", False)
        end

    test_create_fine_tune
            -- Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
            --
            -- 
        local
            l_response: FINE_TUNE
            l_create_fine_tune_request: CREATE_FINE_TUNE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_fine_tune_request

            -- l_response := api.create_fine_tune(l_create_fine_tune_request)
            assert ("not_implemented", False)
        end

    test_create_image
            -- Creates an image given a prompt.
            --
            -- 
        local
            l_response: IMAGES_RESPONSE
            l_create_image_request: CREATE_IMAGE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_image_request

            -- l_response := api.create_image(l_create_image_request)
            assert ("not_implemented", False)
        end

    test_create_image_edit
            -- Creates an edited or extended image given an original image and a prompt.
            --
            -- 
        local
            l_response: IMAGES_RESPONSE
            l_image: FILE
            l_prompt: STRING_32
            l_mask: FILE
            l_n: INTEGER_32
            l_size: STRING_32
            l_response_format: STRING_32
            l_user: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_image
            -- l_prompt

            -- l_response := api.create_image_edit(l_image, l_prompt, l_mask, l_n, l_size, l_response_format, l_user)
            assert ("not_implemented", False)
        end

    test_create_image_variation
            -- Creates a variation of a given image.
            --
            -- 
        local
            l_response: IMAGES_RESPONSE
            l_image: FILE
            l_n: INTEGER_32
            l_size: STRING_32
            l_response_format: STRING_32
            l_user: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_image

            -- l_response := api.create_image_variation(l_image, l_n, l_size, l_response_format, l_user)
            assert ("not_implemented", False)
        end

    test_create_moderation
            -- Classifies if text violates OpenAI&#39;s Content Policy
            --
            -- 
        local
            l_response: CREATE_MODERATION_RESPONSE
            l_create_moderation_request: CREATE_MODERATION_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_moderation_request

            -- l_response := api.create_moderation(l_create_moderation_request)
            assert ("not_implemented", False)
        end

    test_create_transcription
            -- Transcribes audio into the input language.
            --
            -- 
        local
            l_response: CREATE_TRANSCRIPTION_RESPONSE
            l_file: FILE
            l_model: CREATE_TRANSCRIPTION_REQUEST_MODEL
            l_prompt: STRING_32
            l_response_format: STRING_32
            l_temperature: REAL_32
            l_language: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_file
            -- l_model

            -- l_response := api.create_transcription(l_file, l_model, l_prompt, l_response_format, l_temperature, l_language)
            assert ("not_implemented", False)
        end

    test_create_translation
            -- Translates audio into English.
            --
            -- 
        local
            l_response: CREATE_TRANSLATION_RESPONSE
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

    test_delete_file
            -- Delete a file.
            --
            -- 
        local
            l_response: DELETE_FILE_RESPONSE
            l_file_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_file_id

            -- l_response := api.delete_file(l_file_id)
            assert ("not_implemented", False)
        end

    test_delete_model
            -- Delete a fine-tuned model. You must have the Owner role in your organization.
            --
            -- 
        local
            l_response: DELETE_MODEL_RESPONSE
            l_model: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_model

            -- l_response := api.delete_model(l_model)
            assert ("not_implemented", False)
        end

    test_download_file
            -- Returns the contents of the specified file
            --
            -- 
        local
            l_response: STRING_32
            l_file_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_file_id

            -- l_response := api.download_file(l_file_id)
            assert ("not_implemented", False)
        end

    test_list_files
            -- Returns a list of files that belong to the user&#39;s organization.
            --
            -- 
        local
            l_response: LIST_FILES_RESPONSE
        do
            -- TODO: Initialize required params.

            -- l_response := api.list_files
            assert ("not_implemented", False)
        end

    test_list_fine_tune_events
            -- Get fine-grained status updates for a fine-tune job. 
            --
            -- 
        local
            l_response: LIST_FINE_TUNE_EVENTS_RESPONSE
            l_fine_tune_id: STRING_32
            l_stream: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_fine_tune_id

            -- l_response := api.list_fine_tune_events(l_fine_tune_id, l_stream)
            assert ("not_implemented", False)
        end

    test_list_fine_tunes
            -- List your organization&#39;s fine-tuning jobs 
            --
            -- 
        local
            l_response: LIST_FINE_TUNES_RESPONSE
        do
            -- TODO: Initialize required params.

            -- l_response := api.list_fine_tunes
            assert ("not_implemented", False)
        end

    test_list_models
            -- Lists the currently available models, and provides basic information about each one such as the owner and availability.
            --
            -- 
        local
            l_response: LIST_MODELS_RESPONSE
        do
            -- TODO: Initialize required params.

            -- l_response := api.list_models
            assert ("not_implemented", False)
        end

    test_retrieve_file
            -- Returns information about a specific file.
            --
            -- 
        local
            l_response: OPEN_AI_FILE
            l_file_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_file_id

            -- l_response := api.retrieve_file(l_file_id)
            assert ("not_implemented", False)
        end

    test_retrieve_fine_tune
            -- Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
            --
            -- 
        local
            l_response: FINE_TUNE
            l_fine_tune_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_fine_tune_id

            -- l_response := api.retrieve_fine_tune(l_fine_tune_id)
            assert ("not_implemented", False)
        end

    test_retrieve_model
            -- Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
            --
            -- 
        local
            l_response: MODEL
            l_model: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_model

            -- l_response := api.retrieve_model(l_model)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: OPENAI_API
            -- Create an object instance of `OPENAI_API'.
        once
            create { OPENAI_API } Result
        end

end
