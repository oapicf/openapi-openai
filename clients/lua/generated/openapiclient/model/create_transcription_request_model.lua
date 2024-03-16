--[[
  OpenAI API

  APIs for sampling from and fine-tuning language models

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- create_transcription_request_model class
local create_transcription_request_model = {}
local create_transcription_request_model_mt = {
	__name = "create_transcription_request_model";
	__index = create_transcription_request_model;
}

local function cast_create_transcription_request_model(t)
	return setmetatable(t, create_transcription_request_model_mt)
end

local function new_create_transcription_request_model()
	return cast_create_transcription_request_model({
	})
end

return {
	cast = cast_create_transcription_request_model;
	new = new_create_transcription_request_model;
}
