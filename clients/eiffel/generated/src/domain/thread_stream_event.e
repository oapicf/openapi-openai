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
class THREAD_STREAM_EVENT




feature --Access

    event: detachable STRING_32
      
    data: detachable THREAD_OBJECT
      

feature -- Change Element

    set_event (a_name: like event)
        -- Set 'event' with 'a_name'.
      do
        event := a_name
      ensure
        event_set: event = a_name
      end

    set_data (a_name: like data)
        -- Set 'data' with 'a_name'.
      do
        data := a_name
      ensure
        data_set: data = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass THREAD_STREAM_EVENT%N")
        if attached event as l_event then
          Result.append ("%Nevent:")
          Result.append (l_event.out)
          Result.append ("%N")
        end
        if attached data as l_data then
          Result.append ("%Ndata:")
          Result.append (l_data.out)
          Result.append ("%N")
        end
      end
end

