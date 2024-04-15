--[[
  OpenAI API

  The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

  The version of the OpenAPI document: 2.0.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- transcription_word class
local transcription_word = {}
local transcription_word_mt = {
	__name = "transcription_word";
	__index = transcription_word;
}

local function cast_transcription_word(t)
	return setmetatable(t, transcription_word_mt)
end

local function new_transcription_word(word, start, End_)
	return cast_transcription_word({
		["word"] = word;
		["start"] = start;
		["end"] = End_;
	})
end

return {
	cast = cast_transcription_word;
	new = new_transcription_word;
}