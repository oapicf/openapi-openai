#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunObject::RunObject()
{
	//__init();
}

RunObject::~RunObject()
{
	//__cleanup();
}

void
RunObject::__init()
{
	//id = std::string();
	//object = std::string();
	//created_at = int(0);
	//thread_id = std::string();
	//assistant_id = std::string();
	//status = std::string();
	//required_action = new RunObject_required_action();
	//last_error = new RunObject_last_error();
	//expires_at = int(0);
	//started_at = int(0);
	//cancelled_at = int(0);
	//failed_at = int(0);
	//completed_at = int(0);
	//incomplete_details = new RunObject_incomplete_details();
	//model = std::string();
	//instructions = std::string();
	//new std::list()std::list> tools;
	//metadata = null;
	//usage = new RunCompletionUsage();
	//temperature = double(0);
	//top_p = double(0);
	//max_prompt_tokens = int(0);
	//max_completion_tokens = int(0);
	//truncation_strategy = new TruncationObject();
	//tool_choice = new AssistantsApiToolChoiceOption();
	//parallel_tool_calls = bool(false);
	//response_format = new AssistantsApiResponseFormatOption();
}

void
RunObject::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(thread_id != NULL) {
	//
	//delete thread_id;
	//thread_id = NULL;
	//}
	//if(assistant_id != NULL) {
	//
	//delete assistant_id;
	//assistant_id = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(required_action != NULL) {
	//
	//delete required_action;
	//required_action = NULL;
	//}
	//if(last_error != NULL) {
	//
	//delete last_error;
	//last_error = NULL;
	//}
	//if(expires_at != NULL) {
	//
	//delete expires_at;
	//expires_at = NULL;
	//}
	//if(started_at != NULL) {
	//
	//delete started_at;
	//started_at = NULL;
	//}
	//if(cancelled_at != NULL) {
	//
	//delete cancelled_at;
	//cancelled_at = NULL;
	//}
	//if(failed_at != NULL) {
	//
	//delete failed_at;
	//failed_at = NULL;
	//}
	//if(completed_at != NULL) {
	//
	//delete completed_at;
	//completed_at = NULL;
	//}
	//if(incomplete_details != NULL) {
	//
	//delete incomplete_details;
	//incomplete_details = NULL;
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
	//if(usage != NULL) {
	//
	//delete usage;
	//usage = NULL;
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
RunObject::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *thread_idKey = "thread_id";
	node = json_object_get_member(pJsonObject, thread_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&thread_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *assistant_idKey = "assistant_id";
	node = json_object_get_member(pJsonObject, assistant_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&assistant_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *required_actionKey = "required_action";
	node = json_object_get_member(pJsonObject, required_actionKey);
	if (node !=NULL) {
	

		if (isprimitive("RunObject_required_action")) {
			jsonToValue(&required_action, node, "RunObject_required_action", "RunObject_required_action");
		} else {
			
			RunObject_required_action* obj = static_cast<RunObject_required_action*> (&required_action);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *last_errorKey = "last_error";
	node = json_object_get_member(pJsonObject, last_errorKey);
	if (node !=NULL) {
	

		if (isprimitive("RunObject_last_error")) {
			jsonToValue(&last_error, node, "RunObject_last_error", "RunObject_last_error");
		} else {
			
			RunObject_last_error* obj = static_cast<RunObject_last_error*> (&last_error);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *expires_atKey = "expires_at";
	node = json_object_get_member(pJsonObject, expires_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&expires_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *started_atKey = "started_at";
	node = json_object_get_member(pJsonObject, started_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&started_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *cancelled_atKey = "cancelled_at";
	node = json_object_get_member(pJsonObject, cancelled_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&cancelled_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *failed_atKey = "failed_at";
	node = json_object_get_member(pJsonObject, failed_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&failed_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *completed_atKey = "completed_at";
	node = json_object_get_member(pJsonObject, completed_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&completed_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *incomplete_detailsKey = "incomplete_details";
	node = json_object_get_member(pJsonObject, incomplete_detailsKey);
	if (node !=NULL) {
	

		if (isprimitive("RunObject_incomplete_details")) {
			jsonToValue(&incomplete_details, node, "RunObject_incomplete_details", "RunObject_incomplete_details");
		} else {
			
			RunObject_incomplete_details* obj = static_cast<RunObject_incomplete_details*> (&incomplete_details);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&model, node, "std::string", "");
		} else {
			
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
	const gchar *usageKey = "usage";
	node = json_object_get_member(pJsonObject, usageKey);
	if (node !=NULL) {
	

		if (isprimitive("RunCompletionUsage")) {
			jsonToValue(&usage, node, "RunCompletionUsage", "RunCompletionUsage");
		} else {
			
			RunCompletionUsage* obj = static_cast<RunCompletionUsage*> (&usage);
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

RunObject::RunObject(char* json)
{
	this->fromJson(json);
}

char*
RunObject::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getThreadId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *thread_idKey = "thread_id";
	json_object_set_member(pJsonObject, thread_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAssistantId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *assistant_idKey = "assistant_id";
	json_object_set_member(pJsonObject, assistant_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("RunObject_required_action")) {
		RunObject_required_action obj = getRequiredAction();
		node = converttoJson(&obj, "RunObject_required_action", "");
	}
	else {
		
		RunObject_required_action obj = static_cast<RunObject_required_action> (getRequiredAction());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *required_actionKey = "required_action";
	json_object_set_member(pJsonObject, required_actionKey, node);
	if (isprimitive("RunObject_last_error")) {
		RunObject_last_error obj = getLastError();
		node = converttoJson(&obj, "RunObject_last_error", "");
	}
	else {
		
		RunObject_last_error obj = static_cast<RunObject_last_error> (getLastError());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *last_errorKey = "last_error";
	json_object_set_member(pJsonObject, last_errorKey, node);
	if (isprimitive("int")) {
		int obj = getExpiresAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *expires_atKey = "expires_at";
	json_object_set_member(pJsonObject, expires_atKey, node);
	if (isprimitive("int")) {
		int obj = getStartedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *started_atKey = "started_at";
	json_object_set_member(pJsonObject, started_atKey, node);
	if (isprimitive("int")) {
		int obj = getCancelledAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *cancelled_atKey = "cancelled_at";
	json_object_set_member(pJsonObject, cancelled_atKey, node);
	if (isprimitive("int")) {
		int obj = getFailedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *failed_atKey = "failed_at";
	json_object_set_member(pJsonObject, failed_atKey, node);
	if (isprimitive("int")) {
		int obj = getCompletedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *completed_atKey = "completed_at";
	json_object_set_member(pJsonObject, completed_atKey, node);
	if (isprimitive("RunObject_incomplete_details")) {
		RunObject_incomplete_details obj = getIncompleteDetails();
		node = converttoJson(&obj, "RunObject_incomplete_details", "");
	}
	else {
		
		RunObject_incomplete_details obj = static_cast<RunObject_incomplete_details> (getIncompleteDetails());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *incomplete_detailsKey = "incomplete_details";
	json_object_set_member(pJsonObject, incomplete_detailsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
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
	if (isprimitive("RunCompletionUsage")) {
		RunCompletionUsage obj = getUsage();
		node = converttoJson(&obj, "RunCompletionUsage", "");
	}
	else {
		
		RunCompletionUsage obj = static_cast<RunCompletionUsage> (getUsage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *usageKey = "usage";
	json_object_set_member(pJsonObject, usageKey, node);
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

std::string
RunObject::getMetadata()
{
	return metadata;
}

void
RunObject::setMetadata(std::string  metadata)
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

long long
RunObject::getTemperature()
{
	return temperature;
}

void
RunObject::setTemperature(long long  temperature)
{
	this->temperature = temperature;
}

long long
RunObject::getTopP()
{
	return top_p;
}

void
RunObject::setTopP(long long  top_p)
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
RunObject::getParallelToolCalls()
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


