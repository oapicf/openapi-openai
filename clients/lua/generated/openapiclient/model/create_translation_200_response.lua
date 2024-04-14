--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- create_translation_200_response class
local create_translation_200_response = {}
local create_translation_200_response_mt = {
	__name = "create_translation_200_response";
	__index = create_translation_200_response;
}

local function cast_create_translation_200_response(t)
	return setmetatable(t, create_translation_200_response_mt)
end

local function new_create_translation_200_response(text, language, duration, segments)
	return cast_create_translation_200_response({
		["text"] = text;
		["language"] = language;
		["duration"] = duration;
		["segments"] = segments;
	})
end

return {
	cast = cast_create_translation_200_response;
	new = new_create_translation_200_response;
}
