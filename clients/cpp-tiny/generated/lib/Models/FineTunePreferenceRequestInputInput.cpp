

#include "FineTunePreferenceRequestInput_input.h"

using namespace Tiny;

FineTunePreferenceRequestInput_input::FineTunePreferenceRequestInput_input()
{
	messages = std::list<FineTuneChatRequestInput_messages_inner>();
	tools = std::list<ChatCompletionTool>();
	parallel_tool_calls = bool(false);
}

FineTunePreferenceRequestInput_input::FineTunePreferenceRequestInput_input(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTunePreferenceRequestInput_input::~FineTunePreferenceRequestInput_input()
{

}

void
FineTunePreferenceRequestInput_input::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *messagesKey = "messages";

    if(object.has_key(messagesKey))
    {
        bourne::json value = object[messagesKey];


        std::list<FineTuneChatRequestInput_messages_inner> messages_list;
        FineTuneChatRequestInput_messages_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            messages_list.push_back(element);
        }
        messages = messages_list;


    }

    const char *toolsKey = "tools";

    if(object.has_key(toolsKey))
    {
        bourne::json value = object[toolsKey];


        std::list<ChatCompletionTool> tools_list;
        ChatCompletionTool element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tools_list.push_back(element);
        }
        tools = tools_list;


    }

    const char *parallel_tool_callsKey = "parallel_tool_calls";

    if(object.has_key(parallel_tool_callsKey))
    {
        bourne::json value = object[parallel_tool_callsKey];



        jsonToValue(&parallel_tool_calls, value, "bool");


    }


}

bourne::json
FineTunePreferenceRequestInput_input::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<FineTuneChatRequestInput_messages_inner> messages_list = getMessages();
    bourne::json messages_arr = bourne::json::array();

    for(auto& var : messages_list)
    {
        FineTuneChatRequestInput_messages_inner obj = var;
        messages_arr.append(obj.toJson());
    }
    object["messages"] = messages_arr;






    std::list<ChatCompletionTool> tools_list = getTools();
    bourne::json tools_arr = bourne::json::array();

    for(auto& var : tools_list)
    {
        ChatCompletionTool obj = var;
        tools_arr.append(obj.toJson());
    }
    object["tools"] = tools_arr;







    object["parallel_tool_calls"] = isParallelToolCalls();



    return object;

}

std::list<FineTuneChatRequestInput_messages_inner>
FineTunePreferenceRequestInput_input::getMessages()
{
	return messages;
}

void
FineTunePreferenceRequestInput_input::setMessages(std::list <FineTuneChatRequestInput_messages_inner> messages)
{
	this->messages = messages;
}

std::list<ChatCompletionTool>
FineTunePreferenceRequestInput_input::getTools()
{
	return tools;
}

void
FineTunePreferenceRequestInput_input::setTools(std::list <ChatCompletionTool> tools)
{
	this->tools = tools;
}

bool
FineTunePreferenceRequestInput_input::isParallelToolCalls()
{
	return parallel_tool_calls;
}

void
FineTunePreferenceRequestInput_input::setParallelToolCalls(bool  parallel_tool_calls)
{
	this->parallel_tool_calls = parallel_tool_calls;
}



