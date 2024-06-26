--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- create_thread_request class
local create_thread_request = {}
local create_thread_request_mt = {
	__name = "create_thread_request";
	__index = create_thread_request;
}

local function cast_create_thread_request(t)
	return setmetatable(t, create_thread_request_mt)
end

local function new_create_thread_request(messages, metadata)
	return cast_create_thread_request({
		["messages"] = messages;
		["metadata"] = metadata;
	})
end

return {
	cast = cast_create_thread_request;
	new = new_create_thread_request;
}
