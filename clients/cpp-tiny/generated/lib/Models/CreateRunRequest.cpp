

#include "CreateRunRequest.h"

using namespace Tiny;

CreateRunRequest::CreateRunRequest()
{
	assistant_id = std::string();
	model = CreateRunRequest_model();
	instructions = std::string();
	additional_instructions = std::string();
	additional_messages = std::list<CreateMessageRequest>();
	tools = std::list<AssistantObject_tools_inner>();
	metadata = null;
	temperature = float(0);
	top_p = float(0);
	stream = bool(false);
	max_prompt_tokens = int(0);
	max_completion_tokens = int(0);
	truncation_strategy = TruncationObject();
	tool_choice = AssistantsApiToolChoiceOption();
	parallel_tool_calls = bool(false);
	response_format = AssistantsApiResponseFormatOption();
}

CreateRunRequest::CreateRunRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateRunRequest::~CreateRunRequest()
{

}

void
CreateRunRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *assistant_idKey = "assistant_id";

    if(object.has_key(assistant_idKey))
    {
        bourne::json value = object[assistant_idKey];



        jsonToValue(&assistant_id, value, "std::string");


    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];




        CreateRunRequest_model* obj = &model;
		obj->fromJson(value.dump());

    }

    const char *instructionsKey = "instructions";

    if(object.has_key(instructionsKey))
    {
        bourne::json value = object[instructionsKey];



        jsonToValue(&instructions, value, "std::string");


    }

    const char *additional_instructionsKey = "additional_instructions";

    if(object.has_key(additional_instructionsKey))
    {
        bourne::json value = object[additional_instructionsKey];



        jsonToValue(&additional_instructions, value, "std::string");


    }

    const char *additional_messagesKey = "additional_messages";

    if(object.has_key(additional_messagesKey))
    {
        bourne::json value = object[additional_messagesKey];


        std::list<CreateMessageRequest> additional_messages_list;
        CreateMessageRequest element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            additional_messages_list.push_back(element);
        }
        additional_messages = additional_messages_list;


    }

    const char *toolsKey = "tools";

    if(object.has_key(toolsKey))
    {
        bourne::json value = object[toolsKey];


        std::list<AssistantObject_tools_inner> tools_list;
        AssistantObject_tools_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tools_list.push_back(element);
        }
        tools = tools_list;


    }

    const char *metadataKey = "metadata";

    if(object.has_key(metadataKey))
    {
        bourne::json value = object[metadataKey];




        Object* obj = &metadata;
		obj->fromJson(value.dump());

    }

    const char *temperatureKey = "temperature";

    if(object.has_key(temperatureKey))
    {
        bourne::json value = object[temperatureKey];



        jsonToValue(&temperature, value, "long");


    }

    const char *top_pKey = "top_p";

    if(object.has_key(top_pKey))
    {
        bourne::json value = object[top_pKey];



        jsonToValue(&top_p, value, "long");


    }

    const char *streamKey = "stream";

    if(object.has_key(streamKey))
    {
        bourne::json value = object[streamKey];



        jsonToValue(&stream, value, "bool");


    }

    const char *max_prompt_tokensKey = "max_prompt_tokens";

    if(object.has_key(max_prompt_tokensKey))
    {
        bourne::json value = object[max_prompt_tokensKey];



        jsonToValue(&max_prompt_tokens, value, "int");


    }

    const char *max_completion_tokensKey = "max_completion_tokens";

    if(object.has_key(max_completion_tokensKey))
    {
        bourne::json value = object[max_completion_tokensKey];



        jsonToValue(&max_completion_tokens, value, "int");


    }

    const char *truncation_strategyKey = "truncation_strategy";

    if(object.has_key(truncation_strategyKey))
    {
        bourne::json value = object[truncation_strategyKey];




        TruncationObject* obj = &truncation_strategy;
		obj->fromJson(value.dump());

    }

    const char *tool_choiceKey = "tool_choice";

    if(object.has_key(tool_choiceKey))
    {
        bourne::json value = object[tool_choiceKey];




        AssistantsApiToolChoiceOption* obj = &tool_choice;
		obj->fromJson(value.dump());

    }

    const char *parallel_tool_callsKey = "parallel_tool_calls";

    if(object.has_key(parallel_tool_callsKey))
    {
        bourne::json value = object[parallel_tool_callsKey];



        jsonToValue(&parallel_tool_calls, value, "bool");


    }

    const char *response_formatKey = "response_format";

    if(object.has_key(response_formatKey))
    {
        bourne::json value = object[response_formatKey];




        AssistantsApiResponseFormatOption* obj = &response_format;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateRunRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["assistant_id"] = getAssistantId();







	object["model"] = getModel().toJson();





    object["instructions"] = getInstructions();






    object["additional_instructions"] = getAdditionalInstructions();





    std::list<CreateMessageRequest> additional_messages_list = getAdditionalMessages();
    bourne::json additional_messages_arr = bourne::json::array();

    for(auto& var : additional_messages_list)
    {
        CreateMessageRequest obj = var;
        additional_messages_arr.append(obj.toJson());
    }
    object["additional_messages"] = additional_messages_arr;






    std::list<AssistantObject_tools_inner> tools_list = getTools();
    bourne::json tools_arr = bourne::json::array();

    for(auto& var : tools_list)
    {
        AssistantObject_tools_inner obj = var;
        tools_arr.append(obj.toJson());
    }
    object["tools"] = tools_arr;








	object["metadata"] = getMetadata().toJson();





    object["temperature"] = getTemperature();






    object["top_p"] = getTopP();






    object["stream"] = isStream();






    object["max_prompt_tokens"] = getMaxPromptTokens();






    object["max_completion_tokens"] = getMaxCompletionTokens();







	object["truncation_strategy"] = getTruncationStrategy().toJson();






	object["tool_choice"] = getToolChoice().toJson();





    object["parallel_tool_calls"] = isParallelToolCalls();







	object["response_format"] = getResponseFormat().toJson();


    return object;

}

std::string
CreateRunRequest::getAssistantId()
{
	return assistant_id;
}

void
CreateRunRequest::setAssistantId(std::string  assistant_id)
{
	this->assistant_id = assistant_id;
}

CreateRunRequest_model
CreateRunRequest::getModel()
{
	return model;
}

void
CreateRunRequest::setModel(CreateRunRequest_model  model)
{
	this->model = model;
}

std::string
CreateRunRequest::getInstructions()
{
	return instructions;
}

void
CreateRunRequest::setInstructions(std::string  instructions)
{
	this->instructions = instructions;
}

std::string
CreateRunRequest::getAdditionalInstructions()
{
	return additional_instructions;
}

void
CreateRunRequest::setAdditionalInstructions(std::string  additional_instructions)
{
	this->additional_instructions = additional_instructions;
}

std::list<CreateMessageRequest>
CreateRunRequest::getAdditionalMessages()
{
	return additional_messages;
}

void
CreateRunRequest::setAdditionalMessages(std::list <CreateMessageRequest> additional_messages)
{
	this->additional_messages = additional_messages;
}

std::list<AssistantObject_tools_inner>
CreateRunRequest::getTools()
{
	return tools;
}

void
CreateRunRequest::setTools(std::list <AssistantObject_tools_inner> tools)
{
	this->tools = tools;
}

Object
CreateRunRequest::getMetadata()
{
	return metadata;
}

void
CreateRunRequest::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}

long
CreateRunRequest::getTemperature()
{
	return temperature;
}

void
CreateRunRequest::setTemperature(long  temperature)
{
	this->temperature = temperature;
}

long
CreateRunRequest::getTopP()
{
	return top_p;
}

void
CreateRunRequest::setTopP(long  top_p)
{
	this->top_p = top_p;
}

bool
CreateRunRequest::isStream()
{
	return stream;
}

void
CreateRunRequest::setStream(bool  stream)
{
	this->stream = stream;
}

int
CreateRunRequest::getMaxPromptTokens()
{
	return max_prompt_tokens;
}

void
CreateRunRequest::setMaxPromptTokens(int  max_prompt_tokens)
{
	this->max_prompt_tokens = max_prompt_tokens;
}

int
CreateRunRequest::getMaxCompletionTokens()
{
	return max_completion_tokens;
}

void
CreateRunRequest::setMaxCompletionTokens(int  max_completion_tokens)
{
	this->max_completion_tokens = max_completion_tokens;
}

TruncationObject
CreateRunRequest::getTruncationStrategy()
{
	return truncation_strategy;
}

void
CreateRunRequest::setTruncationStrategy(TruncationObject  truncation_strategy)
{
	this->truncation_strategy = truncation_strategy;
}

AssistantsApiToolChoiceOption
CreateRunRequest::getToolChoice()
{
	return tool_choice;
}

void
CreateRunRequest::setToolChoice(AssistantsApiToolChoiceOption  tool_choice)
{
	this->tool_choice = tool_choice;
}

bool
CreateRunRequest::isParallelToolCalls()
{
	return parallel_tool_calls;
}

void
CreateRunRequest::setParallelToolCalls(bool  parallel_tool_calls)
{
	this->parallel_tool_calls = parallel_tool_calls;
}

AssistantsApiResponseFormatOption
CreateRunRequest::getResponseFormat()
{
	return response_format;
}

void
CreateRunRequest::setResponseFormat(AssistantsApiResponseFormatOption  response_format)
{
	this->response_format = response_format;
}



