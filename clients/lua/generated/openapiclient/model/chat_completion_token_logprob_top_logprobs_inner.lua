--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- chat_completion_token_logprob_top_logprobs_inner class
local chat_completion_token_logprob_top_logprobs_inner = {}
local chat_completion_token_logprob_top_logprobs_inner_mt = {
	__name = "chat_completion_token_logprob_top_logprobs_inner";
	__index = chat_completion_token_logprob_top_logprobs_inner;
}

local function cast_chat_completion_token_logprob_top_logprobs_inner(t)
	return setmetatable(t, chat_completion_token_logprob_top_logprobs_inner_mt)
end

local function new_chat_completion_token_logprob_top_logprobs_inner(token, logprob, bytes)
	return cast_chat_completion_token_logprob_top_logprobs_inner({
		["token"] = token;
		["logprob"] = logprob;
		["bytes"] = bytes;
	})
end

return {
	cast = cast_chat_completion_token_logprob_top_logprobs_inner;
	new = new_chat_completion_token_logprob_top_logprobs_inner;
}