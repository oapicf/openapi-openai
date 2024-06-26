--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- create_thread_and_run_request_tools_inner class
local create_thread_and_run_request_tools_inner = {}
local create_thread_and_run_request_tools_inner_mt = {
	__name = "create_thread_and_run_request_tools_inner";
	__index = create_thread_and_run_request_tools_inner;
}

local function cast_create_thread_and_run_request_tools_inner(t)
	return setmetatable(t, create_thread_and_run_request_tools_inner_mt)
end

local function new_create_thread_and_run_request_tools_inner(type, Function_)
	return cast_create_thread_and_run_request_tools_inner({
		["type"] = type;
		["function"] = Function_;
	})
end

return {
	cast = cast_create_thread_and_run_request_tools_inner;
	new = new_create_thread_and_run_request_tools_inner;
}
