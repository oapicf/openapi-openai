--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- create_transcription_response_json class
local create_transcription_response_json = {}
local create_transcription_response_json_mt = {
	__name = "create_transcription_response_json";
	__index = create_transcription_response_json;
}

local function cast_create_transcription_response_json(t)
	return setmetatable(t, create_transcription_response_json_mt)
end

local function new_create_transcription_response_json(text)
	return cast_create_transcription_response_json({
		["text"] = text;
	})
end

return {
	cast = cast_create_transcription_response_json;
	new = new_create_transcription_response_json;
}
