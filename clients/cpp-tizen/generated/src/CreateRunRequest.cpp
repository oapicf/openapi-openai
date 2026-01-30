#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateRunRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateRunRequest::CreateRunRequest()
{
	//__init();
}

CreateRunRequest::~CreateRunRequest()
{
	//__cleanup();
}

void
CreateRunRequest::__init()
{
	//assistant_id = std::string();
	//model = new CreateRunRequest_model();
	//instructions = std::string();
	//additional_instructions = std::string();
	//new std::list()std::list> additional_messages;
	//new std::list()std::list> tools;
	//metadata = null;
	//temperature = double(0);
	//top_p = double(0);
	//stream = bool(false);
	//max_prompt_tokens = int(0);
	//max_completion_tokens = int(0);
	//truncation_strategy = new TruncationObject();
	//tool_choice = new AssistantsApiToolChoiceOption();
	//parallel_tool_calls = bool(false);
	//response_format = new AssistantsApiResponseFormatOption();
}

void
CreateRunRequest::__cleanup()
{
	//if(assistant_id != NULL) {
	//
	//delete assistant_id;
	//assistant_id = NULL;
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
	//if(additional_instructions != NULL) {
	//
	//delete additional_instructions;
	//additional_instructions = NULL;
	//}
	//if(additional_messages != NULL) {
	//additional_messages.RemoveAll(true);
	//delete additional_messages;
	//additional_messages = NULL;
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
	//if(top_p != NULL) {
	//
	//delete top_p;
	//top_p = NULL;
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
	//if(parallel_tool_calls != NULL) {
	//
	//delete parallel_tool_calls;
	//parallel_tool_calls = NULL;
	//}
	//if(response_format != NULL) {
	//
	//delete response_format;
	//response_format = NULL;
	//}
	//
}

void
CreateRunRequest::fromJson(char* jsonStr)
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
	const gchar *additional_instructionsKey = "additional_instructions";
	node = json_object_get_member(pJsonObject, additional_instructionsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&additional_instructions, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *additional_messagesKey = "additional_messages";
	node = json_object_get_member(pJsonObject, additional_messagesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CreateMessageRequest> new_list;
			CreateMessageRequest inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CreateMessageRequest")) {
					jsonToValue(&inst, temp_json, "CreateMessageRequest", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			additional_messages = new_list;
		}
		
	}
	const gchar *toolsKey = "tools";
	node = json_object_get_member(pJsonObject, toolsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssistantObject_tools_inner> new_list;
			AssistantObject_tools_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssistantObject_tools_inner")) {
					jsonToValue(&inst, temp_json, "AssistantObject_tools_inner", "");
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
	const gchar *top_pKey = "top_p";
	node = json_object_get_member(pJsonObject, top_pKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&top_p, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&top_p);
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
	const gchar *parallel_tool_callsKey = "parallel_tool_calls";
	node = json_object_get_member(pJsonObject, parallel_tool_callsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&parallel_tool_calls, node, "bool", "");
		} else {
			
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

CreateRunRequest::CreateRunRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateRunRequest::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getAdditionalInstructions();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *additional_instructionsKey = "additional_instructions";
	json_object_set_member(pJsonObject, additional_instructionsKey, node);
	if (isprimitive("CreateMessageRequest")) {
		list<CreateMessageRequest> new_list = static_cast<list <CreateMessageRequest> > (getAdditionalMessages());
		node = converttoJson(&new_list, "CreateMessageRequest", "array");
	} else {
		node = json_node_alloc();
		list<CreateMessageRequest> new_list = static_cast<list <CreateMessageRequest> > (getAdditionalMessages());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CreateMessageRequest>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CreateMessageRequest obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *additional_messagesKey = "additional_messages";
	json_object_set_member(pJsonObject, additional_messagesKey, node);
	if (isprimitive("AssistantObject_tools_inner")) {
		list<AssistantObject_tools_inner> new_list = static_cast<list <AssistantObject_tools_inner> > (getTools());
		node = converttoJson(&new_list, "AssistantObject_tools_inner", "array");
	} else {
		node = json_node_alloc();
		list<AssistantObject_tools_inner> new_list = static_cast<list <AssistantObject_tools_inner> > (getTools());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssistantObject_tools_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssistantObject_tools_inner obj = *it;
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
	if (isprimitive("long long")) {
		long long obj = getTopP();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getTopP());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *top_pKey = "top_p";
	json_object_set_member(pJsonObject, top_pKey, node);
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
	if (isprimitive("bool")) {
		bool obj = getParallelToolCalls();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *parallel_tool_callsKey = "parallel_tool_calls";
	json_object_set_member(pJsonObject, parallel_tool_callsKey, node);
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

std::string
CreateRunRequest::getMetadata()
{
	return metadata;
}

void
CreateRunRequest::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}

long long
CreateRunRequest::getTemperature()
{
	return temperature;
}

void
CreateRunRequest::setTemperature(long long  temperature)
{
	this->temperature = temperature;
}

long long
CreateRunRequest::getTopP()
{
	return top_p;
}

void
CreateRunRequest::setTopP(long long  top_p)
{
	this->top_p = top_p;
}

bool
CreateRunRequest::getStream()
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
CreateRunRequest::getParallelToolCalls()
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


