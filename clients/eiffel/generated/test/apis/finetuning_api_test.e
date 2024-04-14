note
    description: "API tests for FINETUNING_API"
    date: "$Date$"
    revision: "$Revision$"


class FINETUNING_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_cancel_fine_tuning_job
            -- Immediately cancel a fine-tune job. 
            --
            -- 
        local
            l_response: FINE_TUNING_JOB
            l_fine_tuning_job_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_fine_tuning_job_id

            -- l_response := api.cancel_fine_tuning_job(l_fine_tuning_job_id)
            assert ("not_implemented", False)
        end

    test_create_fine_tuning_job
            -- Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
            --
            -- 
        local
            l_response: FINE_TUNING_JOB
            l_create_fine_tuning_job_request: CREATE_FINE_TUNING_JOB_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_fine_tuning_job_request

            -- l_response := api.create_fine_tuning_job(l_create_fine_tuning_job_request)
            assert ("not_implemented", False)
        end

    test_list_fine_tuning_events
            -- Get status updates for a fine-tuning job. 
            --
            -- 
        local
            l_response: LIST_FINE_TUNING_JOB_EVENTS_RESPONSE
            l_fine_tuning_job_id: STRING_32
            l_after: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_fine_tuning_job_id

            -- l_response := api.list_fine_tuning_events(l_fine_tuning_job_id, l_after, l_limit)
            assert ("not_implemented", False)
        end

    test_list_fine_tuning_job_checkpoints
            -- List checkpoints for a fine-tuning job. 
            --
            -- 
        local
            l_response: LIST_FINE_TUNING_JOB_CHECKPOINTS_RESPONSE
            l_fine_tuning_job_id: STRING_32
            l_after: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_fine_tuning_job_id

            -- l_response := api.list_fine_tuning_job_checkpoints(l_fine_tuning_job_id, l_after, l_limit)
            assert ("not_implemented", False)
        end

    test_list_paginated_fine_tuning_jobs
            -- List your organization&#39;s fine-tuning jobs 
            --
            -- 
        local
            l_response: LIST_PAGINATED_FINE_TUNING_JOBS_RESPONSE
            l_after: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.list_paginated_fine_tuning_jobs(l_after, l_limit)
            assert ("not_implemented", False)
        end

    test_retrieve_fine_tuning_job
            -- Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
            --
            -- 
        local
            l_response: FINE_TUNING_JOB
            l_fine_tuning_job_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_fine_tuning_job_id

            -- l_response := api.retrieve_fine_tuning_job(l_fine_tuning_job_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: FINETUNING_API
            -- Create an object instance of `FINETUNING_API'.
        once
            create { FINETUNING_API } Result
        end

end
