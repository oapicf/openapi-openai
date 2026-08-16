

#include "ChatCompletionStreamResponseDelta.h"

using namespace Tiny;

ChatCompletionStreamResponseDelta::ChatCompletionStreamResponseDelta()
{
	content = std::string();
	function_call = ChatCompletionStreamResponseDelta_function_call();
	tool_calls = std::list<ChatCompletionMessageToolCallChunk>();
	role = std::string();
	refusal = std::string();
}

ChatCompletionStreamResponseDelta::ChatCompletionStreamResponseDelta(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionStreamResponseDelta::~ChatCompletionStreamResponseDelta()
{

}

void
ChatCompletionStreamResponseDelta::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *contentKey = "content";

    if(object.has_key(contentKey))
    {
        bourne::json value = object[contentKey];



        jsonToValue(&content, value, "std::string");


    }

    const char *function_callKey = "function_call";

    if(object.has_key(function_callKey))
    {
        bourne::json value = object[function_callKey];




        ChatCompletionStreamResponseDelta_function_call* obj = &function_call;
		obj->fromJson(value.dump());

    }

    const char *tool_callsKey = "tool_calls";

    if(object.has_key(tool_callsKey))
    {
        bourne::json value = object[tool_callsKey];


        std::list<ChatCompletionMessageToolCallChunk> tool_calls_list;
        ChatCompletionMessageToolCallChunk element;
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

    const char *refusalKey = "refusal";

    if(object.has_key(refusalKey))
    {
        bourne::json value = object[refusalKey];



        jsonToValue(&refusal, value, "std::string");


    }


}

bourne::json
ChatCompletionStreamResponseDelta::toJson()
{
    bourne::json object = bourne::json::object();





    object["content"] = getContent();







	object["function_call"] = getFunctionCall().toJson();




    std::list<ChatCompletionMessageToolCallChunk> tool_calls_list = getToolCalls();
    bourne::json tool_calls_arr = bourne::json::array();

    for(auto& var : tool_calls_list)
    {
        ChatCompletionMessageToolCallChunk obj = var;
        tool_calls_arr.append(obj.toJson());
    }
    object["tool_calls"] = tool_calls_arr;







    object["role"] = getRole();






    object["refusal"] = getRefusal();



    return object;

}

std::string
ChatCompletionStreamResponseDelta::getContent()
{
	return content;
}

void
ChatCompletionStreamResponseDelta::setContent(std::string  content)
{
	this->content = content;
}

ChatCompletionStreamResponseDelta_function_call
ChatCompletionStreamResponseDelta::getFunctionCall()
{
	return function_call;
}

void
ChatCompletionStreamResponseDelta::setFunctionCall(ChatCompletionStreamResponseDelta_function_call  function_call)
{
	this->function_call = function_call;
}

std::list<ChatCompletionMessageToolCallChunk>
ChatCompletionStreamResponseDelta::getToolCalls()
{
	return tool_calls;
}

void
ChatCompletionStreamResponseDelta::setToolCalls(std::list <ChatCompletionMessageToolCallChunk> tool_calls)
{
	this->tool_calls = tool_calls;
}

std::string
ChatCompletionStreamResponseDelta::getRole()
{
	return role;
}

void
ChatCompletionStreamResponseDelta::setRole(std::string  role)
{
	this->role = role;
}

std::string
ChatCompletionStreamResponseDelta::getRefusal()
{
	return refusal;
}

void
ChatCompletionStreamResponseDelta::setRefusal(std::string  refusal)
{
	this->refusal = refusal;
}



