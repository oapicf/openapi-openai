note
    description: "API tests for USAGE_API"
    date: "$Date$"
    revision: "$Revision$"


class USAGE_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_usage_audio_speeches
            -- Get audio speeches usage details for the organization.
            --
            -- 
        local
            l_response: USAGE_RESPONSE
            l_start_time: INTEGER_32
            l_end_time: INTEGER_32
            l_bucket_width: STRING_32
            l_project_ids: LIST [STRING_32]
            l_user_ids: LIST [STRING_32]
            l_api_key_ids: LIST [STRING_32]
            l_models: LIST [STRING_32]
            l_group_by: LIST [STRING_32]
            l_limit: INTEGER_32
            l_page: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_start_time

            -- l_response := api.usage_audio_speeches(l_start_time, l_end_time, l_bucket_width, l_project_ids, l_user_ids, l_api_key_ids, l_models, l_group_by, l_limit, l_page)
            assert ("not_implemented", False)
        end

    test_usage_audio_transcriptions
            -- Get audio transcriptions usage details for the organization.
            --
            -- 
        local
            l_response: USAGE_RESPONSE
            l_start_time: INTEGER_32
            l_end_time: INTEGER_32
            l_bucket_width: STRING_32
            l_project_ids: LIST [STRING_32]
            l_user_ids: LIST [STRING_32]
            l_api_key_ids: LIST [STRING_32]
            l_models: LIST [STRING_32]
            l_group_by: LIST [STRING_32]
            l_limit: INTEGER_32
            l_page: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_start_time

            -- l_response := api.usage_audio_transcriptions(l_start_time, l_end_time, l_bucket_width, l_project_ids, l_user_ids, l_api_key_ids, l_models, l_group_by, l_limit, l_page)
            assert ("not_implemented", False)
        end

    test_usage_code_interpreter_sessions
            -- Get code interpreter sessions usage details for the organization.
            --
            -- 
        local
            l_response: USAGE_RESPONSE
            l_start_time: INTEGER_32
            l_end_time: INTEGER_32
            l_bucket_width: STRING_32
            l_project_ids: LIST [STRING_32]
            l_group_by: LIST [STRING_32]
            l_limit: INTEGER_32
            l_page: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_start_time

            -- l_response := api.usage_code_interpreter_sessions(l_start_time, l_end_time, l_bucket_width, l_project_ids, l_group_by, l_limit, l_page)
            assert ("not_implemented", False)
        end

    test_usage_completions
            -- Get completions usage details for the organization.
            --
            -- 
        local
            l_response: USAGE_RESPONSE
            l_start_time: INTEGER_32
            l_end_time: INTEGER_32
            l_bucket_width: STRING_32
            l_project_ids: LIST [STRING_32]
            l_user_ids: LIST [STRING_32]
            l_api_key_ids: LIST [STRING_32]
            l_models: LIST [STRING_32]
            l_batch: BOOLEAN
            l_group_by: LIST [STRING_32]
            l_limit: INTEGER_32
            l_page: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_start_time

            -- l_response := api.usage_completions(l_start_time, l_end_time, l_bucket_width, l_project_ids, l_user_ids, l_api_key_ids, l_models, l_batch, l_group_by, l_limit, l_page)
            assert ("not_implemented", False)
        end

    test_usage_costs
            -- Get costs details for the organization.
            --
            -- 
        local
            l_response: USAGE_RESPONSE
            l_start_time: INTEGER_32
            l_end_time: INTEGER_32
            l_bucket_width: STRING_32
            l_project_ids: LIST [STRING_32]
            l_group_by: LIST [STRING_32]
            l_limit: INTEGER_32
            l_page: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_start_time

            -- l_response := api.usage_costs(l_start_time, l_end_time, l_bucket_width, l_project_ids, l_group_by, l_limit, l_page)
            assert ("not_implemented", False)
        end

    test_usage_embeddings
            -- Get embeddings usage details for the organization.
            --
            -- 
        local
            l_response: USAGE_RESPONSE
            l_start_time: INTEGER_32
            l_end_time: INTEGER_32
            l_bucket_width: STRING_32
            l_project_ids: LIST [STRING_32]
            l_user_ids: LIST [STRING_32]
            l_api_key_ids: LIST [STRING_32]
            l_models: LIST [STRING_32]
            l_group_by: LIST [STRING_32]
            l_limit: INTEGER_32
            l_page: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_start_time

            -- l_response := api.usage_embeddings(l_start_time, l_end_time, l_bucket_width, l_project_ids, l_user_ids, l_api_key_ids, l_models, l_group_by, l_limit, l_page)
            assert ("not_implemented", False)
        end

    test_usage_images
            -- Get images usage details for the organization.
            --
            -- 
        local
            l_response: USAGE_RESPONSE
            l_start_time: INTEGER_32
            l_end_time: INTEGER_32
            l_bucket_width: STRING_32
            l_sources: LIST [STRING_32]
            l_sizes: LIST [STRING_32]
            l_project_ids: LIST [STRING_32]
            l_user_ids: LIST [STRING_32]
            l_api_key_ids: LIST [STRING_32]
            l_models: LIST [STRING_32]
            l_group_by: LIST [STRING_32]
            l_limit: INTEGER_32
            l_page: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_start_time

            -- l_response := api.usage_images(l_start_time, l_end_time, l_bucket_width, l_sources, l_sizes, l_project_ids, l_user_ids, l_api_key_ids, l_models, l_group_by, l_limit, l_page)
            assert ("not_implemented", False)
        end

    test_usage_moderations
            -- Get moderations usage details for the organization.
            --
            -- 
        local
            l_response: USAGE_RESPONSE
            l_start_time: INTEGER_32
            l_end_time: INTEGER_32
            l_bucket_width: STRING_32
            l_project_ids: LIST [STRING_32]
            l_user_ids: LIST [STRING_32]
            l_api_key_ids: LIST [STRING_32]
            l_models: LIST [STRING_32]
            l_group_by: LIST [STRING_32]
            l_limit: INTEGER_32
            l_page: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_start_time

            -- l_response := api.usage_moderations(l_start_time, l_end_time, l_bucket_width, l_project_ids, l_user_ids, l_api_key_ids, l_models, l_group_by, l_limit, l_page)
            assert ("not_implemented", False)
        end

    test_usage_vector_stores
            -- Get vector stores usage details for the organization.
            --
            -- 
        local
            l_response: USAGE_RESPONSE
            l_start_time: INTEGER_32
            l_end_time: INTEGER_32
            l_bucket_width: STRING_32
            l_project_ids: LIST [STRING_32]
            l_group_by: LIST [STRING_32]
            l_limit: INTEGER_32
            l_page: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_start_time

            -- l_response := api.usage_vector_stores(l_start_time, l_end_time, l_bucket_width, l_project_ids, l_group_by, l_limit, l_page)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: USAGE_API
            -- Create an object instance of `USAGE_API'.
        once
            create { USAGE_API } Result
        end

end
