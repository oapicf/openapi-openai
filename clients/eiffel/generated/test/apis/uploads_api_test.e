note
    description: "API tests for UPLOADS_API"
    date: "$Date$"
    revision: "$Revision$"


class UPLOADS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_add_upload_part
            -- Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
            --
            -- 
        local
            l_response: UPLOAD_PART
            l_upload_id: STRING_32
            l_data: FILE
        do
            -- TODO: Initialize required params.
            -- l_upload_id
            -- l_data

            -- l_response := api.add_upload_part(l_upload_id, l_data)
            assert ("not_implemented", False)
        end

    test_cancel_upload
            -- Cancels the Upload. No Parts may be added after an Upload is cancelled. 
            --
            -- 
        local
            l_response: UPLOAD
            l_upload_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_upload_id

            -- l_response := api.cancel_upload(l_upload_id)
            assert ("not_implemented", False)
        end

    test_complete_upload
            -- Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
            --
            -- 
        local
            l_response: UPLOAD
            l_upload_id: STRING_32
            l_complete_upload_request: COMPLETE_UPLOAD_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_upload_id
            -- l_complete_upload_request

            -- l_response := api.complete_upload(l_upload_id, l_complete_upload_request)
            assert ("not_implemented", False)
        end

    test_create_upload
            -- Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
            --
            -- 
        local
            l_response: UPLOAD
            l_create_upload_request: CREATE_UPLOAD_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_upload_request

            -- l_response := api.create_upload(l_create_upload_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: UPLOADS_API
            -- Create an object instance of `UPLOADS_API'.
        once
            create { UPLOADS_API } Result
        end

end
