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
class CREATE_MODERATION_REQUEST




feature --Access

    input: detachable CREATE_MODERATION_REQUEST_INPUT
      
    model: detachable CREATE_MODERATION_REQUEST_MODEL
      

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


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CREATE_MODERATION_REQUEST%N")
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
      end
end

