note
    description: "API tests for IMAGES_API"
    date: "$Date$"
    revision: "$Revision$"


class IMAGES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


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
            l_model: CREATE_IMAGE_EDIT_REQUEST_MODEL
            l_n: INTEGER_32
            l_size: STRING_32
            l_response_format: STRING_32
            l_user: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_image
            -- l_prompt

            -- l_response := api.create_image_edit(l_image, l_prompt, l_mask, l_model, l_n, l_size, l_response_format, l_user)
            assert ("not_implemented", False)
        end

    test_create_image_variation
            -- Creates a variation of a given image.
            --
            -- 
        local
            l_response: IMAGES_RESPONSE
            l_image: FILE
            l_model: CREATE_IMAGE_EDIT_REQUEST_MODEL
            l_n: INTEGER_32
            l_response_format: STRING_32
            l_size: STRING_32
            l_user: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_image

            -- l_response := api.create_image_variation(l_image, l_model, l_n, l_response_format, l_size, l_user)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: IMAGES_API
            -- Create an object instance of `IMAGES_API'.
        once
            create { IMAGES_API } Result
        end

end
