

#include "FineTuneChatRequestInput_messages_inner.h"

using namespace Tiny;

FineTuneChatRequestInput_messages_inner::FineTuneChatRequestInput_messages_inner()
{
	content = std::string();
	role = std::string();
	name = std::string();
	weight = int(0);
	refusal = std::string();
	audio = ChatCompletionRequestAssistantMessage_audio();
	tool_calls = std::list<ChatCompletionMessageToolCall>();
	function_call = ChatCompletionRequestAssistantMessage_function_call();
	tool_call_id = std::string();
}

FineTuneChatRequestInput_messages_inner::FineTuneChatRequestInput_messages_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuneChatRequestInput_messages_inner::~FineTuneChatRequestInput_messages_inner()
{

}

void
FineTuneChatRequestInput_messages_inner::fromJson(std::string jsonObj)
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

    const char *weightKey = "weight";

    if(object.has_key(weightKey))
    {
        bourne::json value = object[weightKey];



        jsonToValue(&weight, value, "int");


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
FineTuneChatRequestInput_messages_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["content"] = getContent();






    object["role"] = getRole();






    object["name"] = getName();






    object["weight"] = getWeight();






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
FineTuneChatRequestInput_messages_inner::getContent()
{
	return content;
}

void
FineTuneChatRequestInput_messages_inner::setContent(std::string  content)
{
	this->content = content;
}

std::string
FineTuneChatRequestInput_messages_inner::getRole()
{
	return role;
}

void
FineTuneChatRequestInput_messages_inner::setRole(std::string  role)
{
	this->role = role;
}

std::string
FineTuneChatRequestInput_messages_inner::getName()
{
	return name;
}

void
FineTuneChatRequestInput_messages_inner::setName(std::string  name)
{
	this->name = name;
}

int
FineTuneChatRequestInput_messages_inner::getWeight()
{
	return weight;
}

void
FineTuneChatRequestInput_messages_inner::setWeight(int  weight)
{
	this->weight = weight;
}

std::string
FineTuneChatRequestInput_messages_inner::getRefusal()
{
	return refusal;
}

void
FineTuneChatRequestInput_messages_inner::setRefusal(std::string  refusal)
{
	this->refusal = refusal;
}

ChatCompletionRequestAssistantMessage_audio
FineTuneChatRequestInput_messages_inner::getAudio()
{
	return audio;
}

void
FineTuneChatRequestInput_messages_inner::setAudio(ChatCompletionRequestAssistantMessage_audio  audio)
{
	this->audio = audio;
}

std::list<ChatCompletionMessageToolCall>
FineTuneChatRequestInput_messages_inner::getToolCalls()
{
	return tool_calls;
}

void
FineTuneChatRequestInput_messages_inner::setToolCalls(std::list <ChatCompletionMessageToolCall> tool_calls)
{
	this->tool_calls = tool_calls;
}

ChatCompletionRequestAssistantMessage_function_call
FineTuneChatRequestInput_messages_inner::getFunctionCall()
{
	return function_call;
}

void
FineTuneChatRequestInput_messages_inner::setFunctionCall(ChatCompletionRequestAssistantMessage_function_call  function_call)
{
	this->function_call = function_call;
}

std::string
FineTuneChatRequestInput_messages_inner::getToolCallId()
{
	return tool_call_id;
}

void
FineTuneChatRequestInput_messages_inner::setToolCallId(std::string  tool_call_id)
{
	this->tool_call_id = tool_call_id;
}



