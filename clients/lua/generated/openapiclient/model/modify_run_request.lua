--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- modify_run_request class
local modify_run_request = {}
local modify_run_request_mt = {
	__name = "modify_run_request";
	__index = modify_run_request;
}

local function cast_modify_run_request(t)
	return setmetatable(t, modify_run_request_mt)
end

local function new_modify_run_request(metadata)
	return cast_modify_run_request({
		["metadata"] = metadata;
	})
end

return {
	cast = cast_modify_run_request;
	new = new_modify_run_request;
}
