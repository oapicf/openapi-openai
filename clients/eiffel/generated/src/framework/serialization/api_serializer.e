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
	API_SERIALIZER


feature -- Access

	serializer (f: FUNCTION [TUPLE [content_type:READABLE_STRING_8; type:ANY],READABLE_STRING_8]; a_content_type: READABLE_STRING_8; a_type: ANY): STRING_8
			-- Serialize an object of type `a_type' using the content type `a_content_type'.
		do
				-- TODO check if this conversion it's ok.
			Result := f.item ([a_content_type, a_type]).to_string_8
		end
end