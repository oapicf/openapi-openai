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
class CREATE_EMBEDDING_REQUEST




feature --Access

    input: detachable CREATE_EMBEDDING_REQUEST_INPUT
      
    model: detachable CREATE_EMBEDDING_REQUEST_MODEL
      
    encoding_format: detachable STRING_32
      -- The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
    dimensions: INTEGER_32
      -- The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
    user: detachable STRING_32
      -- A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 

feature -- Change Element

    set_input (a_name: like input)
        -- Set 'input' with 'a_name'.
      do
        input := a_name
      ensure
        input_set: input = a_name
      end

    set_model (a_name: like model)
        -- Set 'model' with 'a_name'.
      do
        model := a_name
      ensure
        model_set: model = a_name
      end

    set_encoding_format (a_name: like encoding_format)
        -- Set 'encoding_format' with 'a_name'.
      do
        encoding_format := a_name
      ensure
        encoding_format_set: encoding_format = a_name
      end

    set_dimensions (a_name: like dimensions)
        -- Set 'dimensions' with 'a_name'.
      do
        dimensions := a_name
      ensure
        dimensions_set: dimensions = a_name
      end

    set_user (a_name: like user)
        -- Set 'user' with 'a_name'.
      do
        user := a_name
      ensure
        user_set: user = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CREATE_EMBEDDING_REQUEST%N")
        if attached input as l_input then
          Result.append ("%Ninput:")
          Result.append (l_input.out)
          Result.append ("%N")
        end
        if attached model as l_model then
          Result.append ("%Nmodel:")
          Result.append (l_model.out)
          Result.append ("%N")
        end
        if attached encoding_format as l_encoding_format then
          Result.append ("%Nencoding_format:")
          Result.append (l_encoding_format.out)
          Result.append ("%N")
        end
        if attached dimensions as l_dimensions then
          Result.append ("%Ndimensions:")
          Result.append (l_dimensions.out)
          Result.append ("%N")
        end
        if attached user as l_user then
          Result.append ("%Nuser:")
          Result.append (l_user.out)
          Result.append ("%N")
        end
      end
end
