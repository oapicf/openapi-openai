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

class API_I

    inherit ANY redefine default_create end

feature {NONE} -- Initialization

    default_create
            -- Initialize USER_API with default api_client.
        do
            api_client := (create {CONFIGURATION}).default_api_client
        end

    make (a_client: API_CLIENT)
            -- Initialize USER_API with `api_client' `a_client'.
        do
            api_client := a_client
        end

    api_client: API_CLIENT
            -- Api client.

feature -- Status Report

    last_error: detachable API_ERROR
            -- Last error if any from the API call.

feature -- Error

	reset_error
			-- Reset `last_error' to void.
		do
			last_error := Void
		end


feature -- Serializer

	serializer (a_content_type: STRING; a_object: ANY): STRING
			-- Serializer object `a_object' with content type `a_content_type'.
			-- Return the serialized object or report an error if
			-- the serialization failed (ie, not supported, etc).
		local
			err: DEVELOPER_EXCEPTION
		do
				-- Serialized to be coded by a user.
				-- Add the support content types
			create Result.make_empty
			if a_content_type.is_case_insensitive_equal_general ("application/json") then
				Result := json_serializer (a_object)
			else
					-- Add your new serializer here.
					--! we have two options
					--! raise a developer exception.
					--! media type not supported!!!.
					--! or we create an object instance of API_ERROR.
				create err
				err.set_description ("Content type [" + a_content_type + "] not supported.")
				err.raise
			end
		end

	json_serializer (a_object: ANY): STRING
			-- Convert object `a_object' to JSON represented as STRING.
		local
			l_json: API_JSON_SERIALIZER
		do
			Result := l_json.to_json_string (a_object)
		end

feature -- Deserializer


	deserializer (a_content_type: STRING; a_body: STRING; a_type: TYPE [detachable ANY]): detachable ANY
			-- Deserialize a representation `a_body' with content type `a_content_type'.
			-- Return an object of type target if it's possible.
		local
			err: DEVELOPER_EXCEPTION
		do
			if a_content_type.is_case_insensitive_equal_general ("application/json") then
				Result := json_deserializer (a_body, a_type)
			else
				create err
				err.set_description ("Deserialization is not supported by default you will need to add it by hand.")
				err.raise
			end
		end


	json_deserializer (a_body: STRING; a_type: TYPE [detachable ANY]): detachable ANY
			-- Deserialize body 'a_body' to json to the target type 'a_type'.
		local
			l_json: API_JSON_DESERIALIZER
		do
			Result := l_json.from_json (a_body, a_type)
		end

end