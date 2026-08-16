

#include "RunObject.h"

using namespace Tiny;

RunObject::RunObject()
{
	id = std::string();
	object = std::string();
	created_at = int(0);
	thread_id = std::string();
	assistant_id = std::string();
	status = std::string();
	required_action = RunObject_required_action();
	last_error = RunObject_last_error();
	expires_at = int(0);
	started_at = int(0);
	cancelled_at = int(0);
	failed_at = int(0);
	completed_at = int(0);
	incomplete_details = RunObject_incomplete_details();
	model = std::string();
	instructions = std::string();
	tools = std::list<AssistantObject_tools_inner>();
	metadata = null;
	usage = RunCompletionUsage();
	temperature = float(0);
	top_p = float(0);
	max_prompt_tokens = int(0);
	max_completion_tokens = int(0);
	truncation_strategy = TruncationObject();
	tool_choice = AssistantsApiToolChoiceOption();
	parallel_tool_calls = bool(false);
	response_format = AssistantsApiResponseFormatOption();
}

RunObject::RunObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunObject::~RunObject()
{

}

void
RunObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "int");


    }

    const char *thread_idKey = "thread_id";

    if(object.has_key(thread_idKey))
    {
        bourne::json value = object[thread_idKey];



        jsonToValue(&thread_id, value, "std::string");


    }

    const char *assistant_idKey = "assistant_id";

    if(object.has_key(assistant_idKey))
    {
        bourne::json value = object[assistant_idKey];



        jsonToValue(&assistant_id, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }

    const char *required_actionKey = "required_action";

    if(object.has_key(required_actionKey))
    {
        bourne::json value = object[required_actionKey];




        RunObject_required_action* obj = &required_action;
		obj->fromJson(value.dump());

    }

    const char *last_errorKey = "last_error";

    if(object.has_key(last_errorKey))
    {
        bourne::json value = object[last_errorKey];




        RunObject_last_error* obj = &last_error;
		obj->fromJson(value.dump());

    }

    const char *expires_atKey = "expires_at";

    if(object.has_key(expires_atKey))
    {
        bourne::json value = object[expires_atKey];



        jsonToValue(&expires_at, value, "int");


    }

    const char *started_atKey = "started_at";

    if(object.has_key(started_atKey))
    {
        bourne::json value = object[started_atKey];



        jsonToValue(&started_at, value, "int");


    }

    const char *cancelled_atKey = "cancelled_at";

    if(object.has_key(cancelled_atKey))
    {
        bourne::json value = object[cancelled_atKey];



        jsonToValue(&cancelled_at, value, "int");


    }

    const char *failed_atKey = "failed_at";

    if(object.has_key(failed_atKey))
    {
        bourne::json value = object[failed_atKey];



        jsonToValue(&failed_at, value, "int");


    }

    const char *completed_atKey = "completed_at";

    if(object.has_key(completed_atKey))
    {
        bourne::json value = object[completed_atKey];



        jsonToValue(&completed_at, value, "int");


    }

    const char *incomplete_detailsKey = "incomplete_details";

    if(object.has_key(incomplete_detailsKey))
    {
        bourne::json value = object[incomplete_detailsKey];




        RunObject_incomplete_details* obj = &incomplete_details;
		obj->fromJson(value.dump());

    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];



        jsonToValue(&model, value, "std::string");


    }

    const char *instructionsKey = "instructions";

    if(object.has_key(instructionsKey))
    {
        bourne::json value = object[instructionsKey];



        jsonToValue(&instructions, value, "std::string");


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

    const char *usageKey = "usage";

    if(object.has_key(usageKey))
    {
        bourne::json value = object[usageKey];




        RunCompletionUsage* obj = &usage;
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
RunObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["object"] = getObject();






    object["created_at"] = getCreatedAt();






    object["thread_id"] = getThreadId();






    object["assistant_id"] = getAssistantId();






    object["status"] = getStatus();







	object["required_action"] = getRequiredAction().toJson();






	object["last_error"] = getLastError().toJson();





    object["expires_at"] = getExpiresAt();






    object["started_at"] = getStartedAt();






    object["cancelled_at"] = getCancelledAt();






    object["failed_at"] = getFailedAt();






    object["completed_at"] = getCompletedAt();







	object["incomplete_details"] = getIncompleteDetails().toJson();





    object["model"] = getModel();






    object["instructions"] = getInstructions();





    std::list<AssistantObject_tools_inner> tools_list = getTools();
    bourne::json tools_arr = bourne::json::array();

    for(auto& var : tools_list)
    {
        AssistantObject_tools_inner obj = var;
        tools_arr.append(obj.toJson());
    }
    object["tools"] = tools_arr;








	object["metadata"] = getMetadata().toJson();






	object["usage"] = getUsage().toJson();





    object["temperature"] = getTemperature();






    object["top_p"] = getTopP();






    object["max_prompt_tokens"] = getMaxPromptTokens();






    object["max_completion_tokens"] = getMaxCompletionTokens();







	object["truncation_strategy"] = getTruncationStrategy().toJson();






	object["tool_choice"] = getToolChoice().toJson();





    object["parallel_tool_calls"] = isParallelToolCalls();







	object["response_format"] = getResponseFormat().toJson();


    return object;

}

std::string
RunObject::getId()
{
	return id;
}

void
RunObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunObject::getObject()
{
	return object;
}

void
RunObject::setObject(std::string  object)
{
	this->object = object;
}

int
RunObject::getCreatedAt()
{
	return created_at;
}

void
RunObject::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
RunObject::getThreadId()
{
	return thread_id;
}

void
RunObject::setThreadId(std::string  thread_id)
{
	this->thread_id = thread_id;
}

std::string
RunObject::getAssistantId()
{
	return assistant_id;
}

void
RunObject::setAssistantId(std::string  assistant_id)
{
	this->assistant_id = assistant_id;
}

std::string
RunObject::getStatus()
{
	return status;
}

void
RunObject::setStatus(std::string  status)
{
	this->status = status;
}

RunObject_required_action
RunObject::getRequiredAction()
{
	return required_action;
}

void
RunObject::setRequiredAction(RunObject_required_action  required_action)
{
	this->required_action = required_action;
}

RunObject_last_error
RunObject::getLastError()
{
	return last_error;
}

void
RunObject::setLastError(RunObject_last_error  last_error)
{
	this->last_error = last_error;
}

int
RunObject::getExpiresAt()
{
	return expires_at;
}

void
RunObject::setExpiresAt(int  expires_at)
{
	this->expires_at = expires_at;
}

int
RunObject::getStartedAt()
{
	return started_at;
}

void
RunObject::setStartedAt(int  started_at)
{
	this->started_at = started_at;
}

int
RunObject::getCancelledAt()
{
	return cancelled_at;
}

void
RunObject::setCancelledAt(int  cancelled_at)
{
	this->cancelled_at = cancelled_at;
}

int
RunObject::getFailedAt()
{
	return failed_at;
}

void
RunObject::setFailedAt(int  failed_at)
{
	this->failed_at = failed_at;
}

int
RunObject::getCompletedAt()
{
	return completed_at;
}

void
RunObject::setCompletedAt(int  completed_at)
{
	this->completed_at = completed_at;
}

RunObject_incomplete_details
RunObject::getIncompleteDetails()
{
	return incomplete_details;
}

void
RunObject::setIncompleteDetails(RunObject_incomplete_details  incomplete_details)
{
	this->incomplete_details = incomplete_details;
}

std::string
RunObject::getModel()
{
	return model;
}

void
RunObject::setModel(std::string  model)
{
	this->model = model;
}

std::string
RunObject::getInstructions()
{
	return instructions;
}

void
RunObject::setInstructions(std::string  instructions)
{
	this->instructions = instructions;
}

std::list<AssistantObject_tools_inner>
RunObject::getTools()
{
	return tools;
}

void
RunObject::setTools(std::list <AssistantObject_tools_inner> tools)
{
	this->tools = tools;
}

Object
RunObject::getMetadata()
{
	return metadata;
}

void
RunObject::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}

RunCompletionUsage
RunObject::getUsage()
{
	return usage;
}

void
RunObject::setUsage(RunCompletionUsage  usage)
{
	this->usage = usage;
}

long
RunObject::getTemperature()
{
	return temperature;
}

void
RunObject::setTemperature(long  temperature)
{
	this->temperature = temperature;
}

long
RunObject::getTopP()
{
	return top_p;
}

void
RunObject::setTopP(long  top_p)
{
	this->top_p = top_p;
}

int
RunObject::getMaxPromptTokens()
{
	return max_prompt_tokens;
}

void
RunObject::setMaxPromptTokens(int  max_prompt_tokens)
{
	this->max_prompt_tokens = max_prompt_tokens;
}

int
RunObject::getMaxCompletionTokens()
{
	return max_completion_tokens;
}

void
RunObject::setMaxCompletionTokens(int  max_completion_tokens)
{
	this->max_completion_tokens = max_completion_tokens;
}

TruncationObject
RunObject::getTruncationStrategy()
{
	return truncation_strategy;
}

void
RunObject::setTruncationStrategy(TruncationObject  truncation_strategy)
{
	this->truncation_strategy = truncation_strategy;
}

AssistantsApiToolChoiceOption
RunObject::getToolChoice()
{
	return tool_choice;
}

void
RunObject::setToolChoice(AssistantsApiToolChoiceOption  tool_choice)
{
	this->tool_choice = tool_choice;
}

bool
RunObject::isParallelToolCalls()
{
	return parallel_tool_calls;
}

void
RunObject::setParallelToolCalls(bool  parallel_tool_calls)
{
	this->parallel_tool_calls = parallel_tool_calls;
}

AssistantsApiResponseFormatOption
RunObject::getResponseFormat()
{
	return response_format;
}

void
RunObject::setResponseFormat(AssistantsApiResponseFormatOption  response_format)
{
	this->response_format = response_format;
}



