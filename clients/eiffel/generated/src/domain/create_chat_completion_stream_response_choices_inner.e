note
 description:"[
		OpenAI API
 		APIs for sampling from and fine-tuning language models
  		The version of the OpenAPI document: 2.0.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class CREATE_CHAT_COMPLETION_STREAM_RESPONSE_CHOICES_INNER




feature --Access

    index: INTEGER_32
      
    delta: detachable CHAT_COMPLETION_STREAM_RESPONSE_DELTA
      
    finish_reason: detachable STRING_32
      

feature -- Change Element

    set_index (a_name: like index)
        -- Set 'index' with 'a_name'.
      do
        index := a_name
      ensure
        index_set: index = a_name
      end

    set_delta (a_name: like delta)
        -- Set 'delta' with 'a_name'.
      do
        delta := a_name
      ensure
        delta_set: delta = a_name
      end

    set_finish_reason (a_name: like finish_reason)
        -- Set 'finish_reason' with 'a_name'.
      do
        finish_reason := a_name
      ensure
        finish_reason_set: finish_reason = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CREATE_CHAT_COMPLETION_STREAM_RESPONSE_CHOICES_INNER%N")
        if attached index as l_index then
          Result.append ("%Nindex:")
          Result.append (l_index.out)
          Result.append ("%N")
        end
        if attached delta as l_delta then
          Result.append ("%Ndelta:")
          Result.append (l_delta.out)
          Result.append ("%N")
        end
        if attached finish_reason as l_finish_reason then
          Result.append ("%Nfinish_reason:")
          Result.append (l_finish_reason.out)
          Result.append ("%N")
        end
      end
end

