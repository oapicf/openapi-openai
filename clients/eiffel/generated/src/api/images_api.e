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
	IMAGES_API

inherit

    API_I


feature -- API Access


	create_image (create_image_request: CREATE_IMAGE_REQUEST): detachable IMAGES_RESPONSE
			-- Creates an image given a prompt.
			-- 
			-- 
			-- argument: create_image_request  (required)
			-- 
			-- 
			-- Result IMAGES_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(create_image_request)
			l_path := "/images/generations"


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<"application/json">>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"ApiKeyAuth">>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { IMAGES_RESPONSE } l_response.data ({ IMAGES_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	create_image_edit (image: FILE; prompt: STRING_32; mask: FILE; model: detachable CREATE_IMAGE_EDIT_REQUEST_MODEL; n: INTEGER_32; size: STRING_32; response_format: STRING_32; user: STRING_32): detachable IMAGES_RESPONSE
			-- Creates an edited or extended image given an original image and a prompt.
			-- 
			-- 
			-- argument: image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. (required)
			-- 
			-- argument: prompt A text description of the desired image(s). The maximum length is 1000 characters. (required)
			-- 
			-- argument: mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. (optional, default to null)
			-- 
			-- argument: model  (optional, default to null)
			-- 
			-- argument: n The number of images to generate. Must be between 1 and 10. (optional, default to 1)
			-- 
			-- argument: size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to 1024x1024)
			-- 
			-- argument: response_format The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. (optional, default to url)
			-- 
			-- argument: user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional, default to null)
			-- 
			-- 
			-- Result IMAGES_RESPONSE
		require
			n_is_less_or_equal_than: n <= 10
     		n_is_greater_or_equal_than: n >= 1
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/images/edits"

			if attached image as l_image then
				l_request.add_form(l_image,"image");
			end
			if attached prompt as l_prompt then
				l_request.add_form(l_prompt,"prompt");
			end
			if attached mask as l_mask then
				l_request.add_form(l_mask,"mask");
			end
			if attached model as l_model then
				l_request.add_form(l_model,"model");
			end
			if attached n as l_n then
				l_request.add_form(l_n,"n");
			end
			if attached size as l_size then
				l_request.add_form(l_size,"size");
			end
			if attached response_format as l_response_format then
				l_request.add_form(l_response_format,"response_format");
			end
			if attached user as l_user then
				l_request.add_form(l_user,"user");
			end

			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<"multipart/form-data">>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"ApiKeyAuth">>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { IMAGES_RESPONSE } l_response.data ({ IMAGES_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	create_image_variation (image: FILE; model: detachable CREATE_IMAGE_EDIT_REQUEST_MODEL; n: INTEGER_32; response_format: STRING_32; size: STRING_32; user: STRING_32): detachable IMAGES_RESPONSE
			-- Creates a variation of a given image.
			-- 
			-- 
			-- argument: image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. (required)
			-- 
			-- argument: model  (optional, default to null)
			-- 
			-- argument: n The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported. (optional, default to 1)
			-- 
			-- argument: response_format The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated. (optional, default to url)
			-- 
			-- argument: size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to 1024x1024)
			-- 
			-- argument: user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional, default to null)
			-- 
			-- 
			-- Result IMAGES_RESPONSE
		require
			n_is_less_or_equal_than: n <= 10
     		n_is_greater_or_equal_than: n >= 1
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/images/variations"

			if attached image as l_image then
				l_request.add_form(l_image,"image");
			end
			if attached model as l_model then
				l_request.add_form(l_model,"model");
			end
			if attached n as l_n then
				l_request.add_form(l_n,"n");
			end
			if attached response_format as l_response_format then
				l_request.add_form(l_response_format,"response_format");
			end
			if attached size as l_size then
				l_request.add_form(l_size,"size");
			end
			if attached user as l_user then
				l_request.add_form(l_user,"user");
			end

			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<"multipart/form-data">>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"ApiKeyAuth">>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { IMAGES_RESPONSE } l_response.data ({ IMAGES_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end


end
