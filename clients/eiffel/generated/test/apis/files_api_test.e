note
    description: "API tests for FILES_API"
    date: "$Date$"
    revision: "$Revision$"


class FILES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_create_file
            -- Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
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

    test_download_file
            -- Returns the contents of the specified file.
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
            l_purpose: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.list_files(l_purpose)
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

feature {NONE} -- Implementation

    api: FILES_API
            -- Create an object instance of `FILES_API'.
        once
            create { FILES_API } Result
        end

end
