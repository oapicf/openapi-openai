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
class CHAT_COMPLETION_ROLE

feature -- Access

  value: detachable STRING_32
      -- enumerated value.
    note
            option: stable
    attribute
    end

feature -- Enum

 val_system: CHAT_COMPLETION_ROLE
    once
      create Result
      Result.set_value ("system")
    end

 val_user: CHAT_COMPLETION_ROLE
    once
      create Result
      Result.set_value ("user")
    end

 val_assistant: CHAT_COMPLETION_ROLE
    once
      create Result
      Result.set_value ("assistant")
    end

 val_tool: CHAT_COMPLETION_ROLE
    once
      create Result
      Result.set_value ("tool")
    end

 val_function: CHAT_COMPLETION_ROLE
    once
      create Result
      Result.set_value ("function")
    end


feature -- Element Change

  set_value (a_val: like value)
      -- Set `value' with `a_value'.
    do
      value := a_val
    ensure
      value_set: value = a_val
    end


end

