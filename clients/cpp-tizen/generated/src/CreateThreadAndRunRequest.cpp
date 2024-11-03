#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateThreadAndRunRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateThreadAndRunRequest::CreateThreadAndRunRequest()
{
	//__init();
}

CreateThreadAndRunRequest::~CreateThreadAndRunRequest()
{
	//__cleanup();
}

void
CreateThreadAndRunRequest::__init()
{
	//assistant_id = std::string();
	//thread = new CreateThreadRequest();
	//model = new CreateRunRequest_model();
	//instructions = std::string();
	//new std::list()std::list> tools;
	//metadata = null;
	//temperature = double(0);
	//stream = bool(false);
	//max_prompt_tokens = int(0);
	//max_completion_tokens = int(0);
	//truncation_strategy = new TruncationObject();
	//tool_choice = new AssistantsApiToolChoiceOption();
	//response_format = new AssistantsApiResponseFormatOption();
}

void
CreateThreadAndRunRequest::__cleanup()
{
	//if(assistant_id != NULL) {
	//
	//delete assistant_id;
	//assistant_id = NULL;
	//}
	//if(thread != NULL) {
	//
	//delete thread;
	//thread = NULL;
	//}
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(instructions != NULL) {
	//
	//delete instructions;
	//instructions = NULL;
	//}
	//if(tools != NULL) {
	//tools.RemoveAll(true);
	//delete tools;
	//tools = NULL;
	//}
	//if(metadata != NULL) {
	//
	//delete metadata;
	//metadata = NULL;
	//}
	//if(temperature != NULL) {
	//
	//delete temperature;
	//temperature = NULL;
	//}
	//if(stream != NULL) {
	//
	//delete stream;
	//stream = NULL;
	//}
	//if(max_prompt_tokens != NULL) {
	//
	//delete max_prompt_tokens;
	//max_prompt_tokens = NULL;
	//}
	//if(max_completion_tokens != NULL) {
	//
	//delete max_completion_tokens;
	//max_completion_tokens = NULL;
	//}
	//if(truncation_strategy != NULL) {
	//
	//delete truncation_strategy;
	//truncation_strategy = NULL;
	//}
	//if(tool_choice != NULL) {
	//
	//delete tool_choice;
	//tool_choice = NULL;
	//}
	//if(response_format != NULL) {
	//
	//delete response_format;
	//response_format = NULL;
	//}
	//
}

void
CreateThreadAndRunRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *assistant_idKey = "assistant_id";
	node = json_object_get_member(pJsonObject, assistant_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&assistant_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *threadKey = "thread";
	node = json_object_get_member(pJsonObject, threadKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateThreadRequest")) {
			jsonToValue(&thread, node, "CreateThreadRequest", "CreateThreadRequest");
		} else {
			
			CreateThreadRequest* obj = static_cast<CreateThreadRequest*> (&thread);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateRunRequest_model")) {
			jsonToValue(&model, node, "CreateRunRequest_model", "CreateRunRequest_model");
		} else {
			
			CreateRunRequest_model* obj = static_cast<CreateRunRequest_model*> (&model);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *instructionsKey = "instructions";
	node = json_object_get_member(pJsonObject, instructionsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&instructions, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *toolsKey = "tools";
	node = json_object_get_member(pJsonObject, toolsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CreateThreadAndRunRequest_tools_inner> new_list;
			CreateThreadAndRunRequest_tools_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CreateThreadAndRunRequest_tools_inner")) {
					jsonToValue(&inst, temp_json, "CreateThreadAndRunRequest_tools_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tools = new_list;
		}
		
	}
	const gchar *metadataKey = "metadata";
	node = json_object_get_member(pJsonObject, metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&metadata, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *temperatureKey = "temperature";
	node = json_object_get_member(pJsonObject, temperatureKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&temperature, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&temperature);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *streamKey = "stream";
	node = json_object_get_member(pJsonObject, streamKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&stream, node, "bool", "");
		} else {
			
		}
	}
	const gchar *max_prompt_tokensKey = "max_prompt_tokens";
	node = json_object_get_member(pJsonObject, max_prompt_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_prompt_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *max_completion_tokensKey = "max_completion_tokens";
	node = json_object_get_member(pJsonObject, max_completion_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_completion_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *truncation_strategyKey = "truncation_strategy";
	node = json_object_get_member(pJsonObject, truncation_strategyKey);
	if (node !=NULL) {
	

		if (isprimitive("TruncationObject")) {
			jsonToValue(&truncation_strategy, node, "TruncationObject", "TruncationObject");
		} else {
			
			TruncationObject* obj = static_cast<TruncationObject*> (&truncation_strategy);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tool_choiceKey = "tool_choice";
	node = json_object_get_member(pJsonObject, tool_choiceKey);
	if (node !=NULL) {
	

		if (isprimitive("AssistantsApiToolChoiceOption")) {
			jsonToValue(&tool_choice, node, "AssistantsApiToolChoiceOption", "AssistantsApiToolChoiceOption");
		} else {
			
			AssistantsApiToolChoiceOption* obj = static_cast<AssistantsApiToolChoiceOption*> (&tool_choice);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *response_formatKey = "response_format";
	node = json_object_get_member(pJsonObject, response_formatKey);
	if (node !=NULL) {
	

		if (isprimitive("AssistantsApiResponseFormatOption")) {
			jsonToValue(&response_format, node, "AssistantsApiResponseFormatOption", "AssistantsApiResponseFormatOption");
		} else {
			
			AssistantsApiResponseFormatOption* obj = static_cast<AssistantsApiResponseFormatOption*> (&response_format);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateThreadAndRunRequest::CreateThreadAndRunRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateThreadAndRunRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAssistantId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *assistant_idKey = "assistant_id";
	json_object_set_member(pJsonObject, assistant_idKey, node);
	if (isprimitive("CreateThreadRequest")) {
		CreateThreadRequest obj = getThread();
		node = converttoJson(&obj, "CreateThreadRequest", "");
	}
	else {
		
		CreateThreadRequest obj = static_cast<CreateThreadRequest> (getThread());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *threadKey = "thread";
	json_object_set_member(pJsonObject, threadKey, node);
	if (isprimitive("CreateRunRequest_model")) {
		CreateRunRequest_model obj = getModel();
		node = converttoJson(&obj, "CreateRunRequest_model", "");
	}
	else {
		
		CreateRunRequest_model obj = static_cast<CreateRunRequest_model> (getModel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getInstructions();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *instructionsKey = "instructions";
	json_object_set_member(pJsonObject, instructionsKey, node);
	if (isprimitive("CreateThreadAndRunRequest_tools_inner")) {
		list<CreateThreadAndRunRequest_tools_inner> new_list = static_cast<list <CreateThreadAndRunRequest_tools_inner> > (getTools());
		node = converttoJson(&new_list, "CreateThreadAndRunRequest_tools_inner", "array");
	} else {
		node = json_node_alloc();
		list<CreateThreadAndRunRequest_tools_inner> new_list = static_cast<list <CreateThreadAndRunRequest_tools_inner> > (getTools());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CreateThreadAndRunRequest_tools_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CreateThreadAndRunRequest_tools_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *toolsKey = "tools";
	json_object_set_member(pJsonObject, toolsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMetadata();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *metadataKey = "metadata";
	json_object_set_member(pJsonObject, metadataKey, node);
	if (isprimitive("long long")) {
		long long obj = getTemperature();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getTemperature());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *temperatureKey = "temperature";
	json_object_set_member(pJsonObject, temperatureKey, node);
	if (isprimitive("bool")) {
		bool obj = getStream();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *streamKey = "stream";
	json_object_set_member(pJsonObject, streamKey, node);
	if (isprimitive("int")) {
		int obj = getMaxPromptTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_prompt_tokensKey = "max_prompt_tokens";
	json_object_set_member(pJsonObject, max_prompt_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getMaxCompletionTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_completion_tokensKey = "max_completion_tokens";
	json_object_set_member(pJsonObject, max_completion_tokensKey, node);
	if (isprimitive("TruncationObject")) {
		TruncationObject obj = getTruncationStrategy();
		node = converttoJson(&obj, "TruncationObject", "");
	}
	else {
		
		TruncationObject obj = static_cast<TruncationObject> (getTruncationStrategy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *truncation_strategyKey = "truncation_strategy";
	json_object_set_member(pJsonObject, truncation_strategyKey, node);
	if (isprimitive("AssistantsApiToolChoiceOption")) {
		AssistantsApiToolChoiceOption obj = getToolChoice();
		node = converttoJson(&obj, "AssistantsApiToolChoiceOption", "");
	}
	else {
		
		AssistantsApiToolChoiceOption obj = static_cast<AssistantsApiToolChoiceOption> (getToolChoice());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tool_choiceKey = "tool_choice";
	json_object_set_member(pJsonObject, tool_choiceKey, node);
	if (isprimitive("AssistantsApiResponseFormatOption")) {
		AssistantsApiResponseFormatOption obj = getResponseFormat();
		node = converttoJson(&obj, "AssistantsApiResponseFormatOption", "");
	}
	else {
		
		AssistantsApiResponseFormatOption obj = static_cast<AssistantsApiResponseFormatOption> (getResponseFormat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *response_formatKey = "response_format";
	json_object_set_member(pJsonObject, response_formatKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateThreadAndRunRequest::getAssistantId()
{
	return assistant_id;
}

void
CreateThreadAndRunRequest::setAssistantId(std::string  assistant_id)
{
	this->assistant_id = assistant_id;
}

CreateThreadRequest
CreateThreadAndRunRequest::getThread()
{
	return thread;
}

void
CreateThreadAndRunRequest::setThread(CreateThreadRequest  thread)
{
	this->thread = thread;
}

CreateRunRequest_model
CreateThreadAndRunRequest::getModel()
{
	return model;
}

void
CreateThreadAndRunRequest::setModel(CreateRunRequest_model  model)
{
	this->model = model;
}

std::string
CreateThreadAndRunRequest::getInstructions()
{
	return instructions;
}

void
CreateThreadAndRunRequest::setInstructions(std::string  instructions)
{
	this->instructions = instructions;
}

std::list<CreateThreadAndRunRequest_tools_inner>
CreateThreadAndRunRequest::getTools()
{
	return tools;
}

void
CreateThreadAndRunRequest::setTools(std::list <CreateThreadAndRunRequest_tools_inner> tools)
{
	this->tools = tools;
}

std::string
CreateThreadAndRunRequest::getMetadata()
{
	return metadata;
}

void
CreateThreadAndRunRequest::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}

long long
CreateThreadAndRunRequest::getTemperature()
{
	return temperature;
}

void
CreateThreadAndRunRequest::setTemperature(long long  temperature)
{
	this->temperature = temperature;
}

bool
CreateThreadAndRunRequest::getStream()
{
	return stream;
}

void
CreateThreadAndRunRequest::setStream(bool  stream)
{
	this->stream = stream;
}

int
CreateThreadAndRunRequest::getMaxPromptTokens()
{
	return max_prompt_tokens;
}

void
CreateThreadAndRunRequest::setMaxPromptTokens(int  max_prompt_tokens)
{
	this->max_prompt_tokens = max_prompt_tokens;
}

int
CreateThreadAndRunRequest::getMaxCompletionTokens()
{
	return max_completion_tokens;
}

void
CreateThreadAndRunRequest::setMaxCompletionTokens(int  max_completion_tokens)
{
	this->max_completion_tokens = max_completion_tokens;
}

TruncationObject
CreateThreadAndRunRequest::getTruncationStrategy()
{
	return truncation_strategy;
}

void
CreateThreadAndRunRequest::setTruncationStrategy(TruncationObject  truncation_strategy)
{
	this->truncation_strategy = truncation_strategy;
}

AssistantsApiToolChoiceOption
CreateThreadAndRunRequest::getToolChoice()
{
	return tool_choice;
}

void
CreateThreadAndRunRequest::setToolChoice(AssistantsApiToolChoiceOption  tool_choice)
{
	this->tool_choice = tool_choice;
}

AssistantsApiResponseFormatOption
CreateThreadAndRunRequest::getResponseFormat()
{
	return response_format;
}

void
CreateThreadAndRunRequest::setResponseFormat(AssistantsApiResponseFormatOption  response_format)
{
	this->response_format = response_format;
}


