

#include "ChatCompletionRequestMessage.h"

using namespace Tiny;

ChatCompletionRequestMessage::ChatCompletionRequestMessage()
{
	content = std::string();
	role = std::string();
	name = std::string();
	refusal = std::string();
	audio = ChatCompletionRequestAssistantMessage_audio();
	tool_calls = std::list<ChatCompletionMessageToolCall>();
	function_call = ChatCompletionRequestAssistantMessage_function_call();
	tool_call_id = std::string();
}

ChatCompletionRequestMessage::ChatCompletionRequestMessage(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestMessage::~ChatCompletionRequestMessage()
{

}

void
ChatCompletionRequestMessage::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *contentKey = "content";

    if(object.has_key(contentKey))
    {
        bourne::json value = object[contentKey];



        jsonToValue(&content, value, "std::string");


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

    const char *refusalKey = "refusal";

    if(object.has_key(refusalKey))
    {
        bourne::json value = object[refusalKey];



        jsonToValue(&refusal, value, "std::string");


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

    const char *tool_call_idKey = "tool_call_id";

    if(object.has_key(tool_call_idKey))
    {
        bourne::json value = object[tool_call_idKey];



        jsonToValue(&tool_call_id, value, "std::string");


    }


}

bourne::json
ChatCompletionRequestMessage::toJson()
{
    bourne::json object = bourne::json::object();





    object["content"] = getContent();






    object["role"] = getRole();






    object["name"] = getName();






    object["refusal"] = getRefusal();







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





    object["tool_call_id"] = getToolCallId();



    return object;

}

std::string
ChatCompletionRequestMessage::getContent()
{
	return content;
}

void
ChatCompletionRequestMessage::setContent(std::string  content)
{
	this->content = content;
}

std::string
ChatCompletionRequestMessage::getRole()
{
	return role;
}

void
ChatCompletionRequestMessage::setRole(std::string  role)
{
	this->role = role;
}

std::string
ChatCompletionRequestMessage::getName()
{
	return name;
}

void
ChatCompletionRequestMessage::setName(std::string  name)
{
	this->name = name;
}

std::string
ChatCompletionRequestMessage::getRefusal()
{
	return refusal;
}

void
ChatCompletionRequestMessage::setRefusal(std::string  refusal)
{
	this->refusal = refusal;
}

ChatCompletionRequestAssistantMessage_audio
ChatCompletionRequestMessage::getAudio()
{
	return audio;
}

void
ChatCompletionRequestMessage::setAudio(ChatCompletionRequestAssistantMessage_audio  audio)
{
	this->audio = audio;
}

std::list<ChatCompletionMessageToolCall>
ChatCompletionRequestMessage::getToolCalls()
{
	return tool_calls;
}

void
ChatCompletionRequestMessage::setToolCalls(std::list <ChatCompletionMessageToolCall> tool_calls)
{
	this->tool_calls = tool_calls;
}

ChatCompletionRequestAssistantMessage_function_call
ChatCompletionRequestMessage::getFunctionCall()
{
	return function_call;
}

void
ChatCompletionRequestMessage::setFunctionCall(ChatCompletionRequestAssistantMessage_function_call  function_call)
{
	this->function_call = function_call;
}

std::string
ChatCompletionRequestMessage::getToolCallId()
{
	return tool_call_id;
}

void
ChatCompletionRequestMessage::setToolCallId(std::string  tool_call_id)
{
	this->tool_call_id = tool_call_id;
}



