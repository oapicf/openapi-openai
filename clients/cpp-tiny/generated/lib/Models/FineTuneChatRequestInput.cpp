

#include "FineTuneChatRequestInput.h"

using namespace Tiny;

FineTuneChatRequestInput::FineTuneChatRequestInput()
{
	messages = std::list<FineTuneChatRequestInput_messages_inner>();
	tools = std::list<ChatCompletionTool>();
	parallel_tool_calls = bool(false);
	functions = std::list<ChatCompletionFunctions>();
}

FineTuneChatRequestInput::FineTuneChatRequestInput(std::string jsonString)
{
	this->fromJson(jsonString);
}

FineTuneChatRequestInput::~FineTuneChatRequestInput()
{

}

void
FineTuneChatRequestInput::fromJson(std::string jsonObj)
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

    const char *functionsKey = "functions";

    if(object.has_key(functionsKey))
    {
        bourne::json value = object[functionsKey];


        std::list<ChatCompletionFunctions> functions_list;
        ChatCompletionFunctions element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            functions_list.push_back(element);
        }
        functions = functions_list;


    }


}

bourne::json
FineTuneChatRequestInput::toJson()
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





    std::list<ChatCompletionFunctions> functions_list = getFunctions();
    bourne::json functions_arr = bourne::json::array();

    for(auto& var : functions_list)
    {
        ChatCompletionFunctions obj = var;
        functions_arr.append(obj.toJson());
    }
    object["functions"] = functions_arr;




    return object;

}

std::list<FineTuneChatRequestInput_messages_inner>
FineTuneChatRequestInput::getMessages()
{
	return messages;
}

void
FineTuneChatRequestInput::setMessages(std::list <FineTuneChatRequestInput_messages_inner> messages)
{
	this->messages = messages;
}

std::list<ChatCompletionTool>
FineTuneChatRequestInput::getTools()
{
	return tools;
}

void
FineTuneChatRequestInput::setTools(std::list <ChatCompletionTool> tools)
{
	this->tools = tools;
}

bool
FineTuneChatRequestInput::isParallelToolCalls()
{
	return parallel_tool_calls;
}

void
FineTuneChatRequestInput::setParallelToolCalls(bool  parallel_tool_calls)
{
	this->parallel_tool_calls = parallel_tool_calls;
}

std::list<ChatCompletionFunctions>
FineTuneChatRequestInput::getFunctions()
{
	return functions;
}

void
FineTuneChatRequestInput::setFunctions(std::list <ChatCompletionFunctions> functions)
{
	this->functions = functions;
}



