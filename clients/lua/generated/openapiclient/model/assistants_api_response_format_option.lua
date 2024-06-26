--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- assistants_api_response_format_option class
local assistants_api_response_format_option = {}
local assistants_api_response_format_option_mt = {
	__name = "assistants_api_response_format_option";
	__index = assistants_api_response_format_option;
}

local function cast_assistants_api_response_format_option(t)
	return setmetatable(t, assistants_api_response_format_option_mt)
end

local function new_assistants_api_response_format_option(type)
	return cast_assistants_api_response_format_option({
		["type"] = type;
	})
end

return {
	cast = cast_assistants_api_response_format_option;
	new = new_assistants_api_response_format_option;
}
