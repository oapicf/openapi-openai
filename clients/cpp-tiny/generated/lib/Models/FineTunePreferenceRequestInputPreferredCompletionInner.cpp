

#include "FineTunePreferenceRequestInput_preferred_completion_inner.h"

using namespace Tiny;

FineTunePreferenceRequestInput_preferred_completion_inner::FineTunePreferenceRequestInput_preferred_completion_inner()
{
	content = ChatCompletionRequestAssistantMessage_content();
	refusal = std::string();
	role = std::string();
	name = std::string();
	audio = ChatCompletionRequestAssistantMessage_audio();
	tool_calls = std::list<ChatCompletionMessageToolCall>();
	function_call = ChatCompletionRequestAssistantMessage_function_call();
}

FineTunePreferenceRequestInput_preferred_completion_inner::FineTunePreferenceRequestInput_preferred_completion_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTunePreferenceRequestInput_preferred_completion_inner::~FineTunePreferenceRequestInput_preferred_completion_inner()
{

}

void
FineTunePreferenceRequestInput_preferred_completion_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *contentKey = "content";

    if(object.has_key(contentKey))
    {
        bourne::json value = object[contentKey];




        ChatCompletionRequestAssistantMessage_content* obj = &content;
		obj->fromJson(value.dump());

    }

    const char *refusalKey = "refusal";

    if(object.has_key(refusalKey))
    {
        bourne::json value = object[refusalKey];



        jsonToValue(&refusal, value, "std::string");


    }

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];



        jsonToValue(&role, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *audioKey = "audio";

    if(object.has_key(audioKey))
    {
        bourne::json value = object[audioKey];




        ChatCompletionRequestAssistantMessage_audio* obj = &audio;
		obj->fromJson(value.dump());

    }

    const char *tool_callsKey = "tool_calls";

    if(object.has_key(tool_callsKey))
    {
        bourne::json value = object[tool_callsKey];


        std::list<ChatCompletionMessageToolCall> tool_calls_list;
        ChatCompletionMessageToolCall element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tool_calls_list.push_back(element);
        }
        tool_calls = tool_calls_list;


    }

    const char *function_callKey = "function_call";

    if(object.has_key(function_callKey))
    {
        bourne::json value = object[function_callKey];




        ChatCompletionRequestAssistantMessage_function_call* obj = &function_call;
		obj->fromJson(value.dump());

    }


}

bourne::json
FineTunePreferenceRequestInput_preferred_completion_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["content"] = getContent().toJson();





    object["refusal"] = getRefusal();






    object["role"] = getRole();






    object["name"] = getName();







	object["audio"] = getAudio().toJson();




    std::list<ChatCompletionMessageToolCall> tool_calls_list = getToolCalls();
    bourne::json tool_calls_arr = bourne::json::array();

    for(auto& var : tool_calls_list)
    {
        ChatCompletionMessageToolCall obj = var;
        tool_calls_arr.append(obj.toJson());
    }
    object["tool_calls"] = tool_calls_arr;








	object["function_call"] = getFunctionCall().toJson();


    return object;

}

ChatCompletionRequestAssistantMessage_content
FineTunePreferenceRequestInput_preferred_completion_inner::getContent()
{
	return content;
}

void
FineTunePreferenceRequestInput_preferred_completion_inner::setContent(ChatCompletionRequestAssistantMessage_content  content)
{
	this->content = content;
}

std::string
FineTunePreferenceRequestInput_preferred_completion_inner::getRefusal()
{
	return refusal;
}

void
FineTunePreferenceRequestInput_preferred_completion_inner::setRefusal(std::string  refusal)
{
	this->refusal = refusal;
}

std::string
FineTunePreferenceRequestInput_preferred_completion_inner::getRole()
{
	return role;
}

void
FineTunePreferenceRequestInput_preferred_completion_inner::setRole(std::string  role)
{
	this->role = role;
}

std::string
FineTunePreferenceRequestInput_preferred_completion_inner::getName()
{
	return name;
}

void
FineTunePreferenceRequestInput_preferred_completion_inner::setName(std::string  name)
{
	this->name = name;
}

ChatCompletionRequestAssistantMessage_audio
FineTunePreferenceRequestInput_preferred_completion_inner::getAudio()
{
	return audio;
}

void
FineTunePreferenceRequestInput_preferred_completion_inner::setAudio(ChatCompletionRequestAssistantMessage_audio  audio)
{
	this->audio = audio;
}

std::list<ChatCompletionMessageToolCall>
FineTunePreferenceRequestInput_preferred_completion_inner::getToolCalls()
{
	return tool_calls;
}

void
FineTunePreferenceRequestInput_preferred_completion_inner::setToolCalls(std::list <ChatCompletionMessageToolCall> tool_calls)
{
	this->tool_calls = tool_calls;
}

ChatCompletionRequestAssistantMessage_function_call
FineTunePreferenceRequestInput_preferred_completion_inner::getFunctionCall()
{
	return function_call;
}

void
FineTunePreferenceRequestInput_preferred_completion_inner::setFunctionCall(ChatCompletionRequestAssistantMessage_function_call  function_call)
{
	this->function_call = function_call;
}



