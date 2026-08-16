

#include "ChatCompletionResponseMessage.h"

using namespace Tiny;

ChatCompletionResponseMessage::ChatCompletionResponseMessage()
{
	content = std::string();
	refusal = std::string();
	tool_calls = std::list<ChatCompletionMessageToolCall>();
	role = std::string();
	function_call = ChatCompletionResponseMessage_function_call();
	audio = ChatCompletionResponseMessage_audio();
}

ChatCompletionResponseMessage::ChatCompletionResponseMessage(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionResponseMessage::~ChatCompletionResponseMessage()
{

}

void
ChatCompletionResponseMessage::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *contentKey = "content";

    if(object.has_key(contentKey))
    {
        bourne::json value = object[contentKey];



        jsonToValue(&content, value, "std::string");


    }

    const char *refusalKey = "refusal";

    if(object.has_key(refusalKey))
    {
        bourne::json value = object[refusalKey];



        jsonToValue(&refusal, value, "std::string");


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

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];



        jsonToValue(&role, value, "std::string");


    }

    const char *function_callKey = "function_call";

    if(object.has_key(function_callKey))
    {
        bourne::json value = object[function_callKey];




        ChatCompletionResponseMessage_function_call* obj = &function_call;
		obj->fromJson(value.dump());

    }

    const char *audioKey = "audio";

    if(object.has_key(audioKey))
    {
        bourne::json value = object[audioKey];




        ChatCompletionResponseMessage_audio* obj = &audio;
		obj->fromJson(value.dump());

    }


}

bourne::json
ChatCompletionResponseMessage::toJson()
{
    bourne::json object = bourne::json::object();





    object["content"] = getContent();






    object["refusal"] = getRefusal();





    std::list<ChatCompletionMessageToolCall> tool_calls_list = getToolCalls();
    bourne::json tool_calls_arr = bourne::json::array();

    for(auto& var : tool_calls_list)
    {
        ChatCompletionMessageToolCall obj = var;
        tool_calls_arr.append(obj.toJson());
    }
    object["tool_calls"] = tool_calls_arr;







    object["role"] = getRole();







	object["function_call"] = getFunctionCall().toJson();






	object["audio"] = getAudio().toJson();


    return object;

}

std::string
ChatCompletionResponseMessage::getContent()
{
	return content;
}

void
ChatCompletionResponseMessage::setContent(std::string  content)
{
	this->content = content;
}

std::string
ChatCompletionResponseMessage::getRefusal()
{
	return refusal;
}

void
ChatCompletionResponseMessage::setRefusal(std::string  refusal)
{
	this->refusal = refusal;
}

std::list<ChatCompletionMessageToolCall>
ChatCompletionResponseMessage::getToolCalls()
{
	return tool_calls;
}

void
ChatCompletionResponseMessage::setToolCalls(std::list <ChatCompletionMessageToolCall> tool_calls)
{
	this->tool_calls = tool_calls;
}

std::string
ChatCompletionResponseMessage::getRole()
{
	return role;
}

void
ChatCompletionResponseMessage::setRole(std::string  role)
{
	this->role = role;
}

ChatCompletionResponseMessage_function_call
ChatCompletionResponseMessage::getFunctionCall()
{
	return function_call;
}

void
ChatCompletionResponseMessage::setFunctionCall(ChatCompletionResponseMessage_function_call  function_call)
{
	this->function_call = function_call;
}

ChatCompletionResponseMessage_audio
ChatCompletionResponseMessage::getAudio()
{
	return audio;
}

void
ChatCompletionResponseMessage::setAudio(ChatCompletionResponseMessage_audio  audio)
{
	this->audio = audio;
}



