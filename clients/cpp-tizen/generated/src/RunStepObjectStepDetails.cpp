#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepObject_step_details.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepObject_step_details::RunStepObject_step_details()
{
	//__init();
}

RunStepObject_step_details::~RunStepObject_step_details()
{
	//__cleanup();
}

void
RunStepObject_step_details::__init()
{
	//type = std::string();
	//message_creation = new RunStepDetailsMessageCreationObject_message_creation();
	//new std::list()std::list> tool_calls;
}

void
RunStepObject_step_details::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(message_creation != NULL) {
	//
	//delete message_creation;
	//message_creation = NULL;
	//}
	//if(tool_calls != NULL) {
	//tool_calls.RemoveAll(true);
	//delete tool_calls;
	//tool_calls = NULL;
	//}
	//
}

void
RunStepObject_step_details::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *message_creationKey = "message_creation";
	node = json_object_get_member(pJsonObject, message_creationKey);
	if (node !=NULL) {
	

		if (isprimitive("RunStepDetailsMessageCreationObject_message_creation")) {
			jsonToValue(&message_creation, node, "RunStepDetailsMessageCreationObject_message_creation", "RunStepDetailsMessageCreationObject_message_creation");
		} else {
			
			RunStepDetailsMessageCreationObject_message_creation* obj = static_cast<RunStepDetailsMessageCreationObject_message_creation*> (&message_creation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tool_callsKey = "tool_calls";
	node = json_object_get_member(pJsonObject, tool_callsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RunStepDetailsToolCallsObject_tool_calls_inner> new_list;
			RunStepDetailsToolCallsObject_tool_calls_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RunStepDetailsToolCallsObject_tool_calls_inner")) {
					jsonToValue(&inst, temp_json, "RunStepDetailsToolCallsObject_tool_calls_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tool_calls = new_list;
		}
		
	}
}

RunStepObject_step_details::RunStepObject_step_details(char* json)
{
	this->fromJson(json);
}

char*
RunStepObject_step_details::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("RunStepDetailsMessageCreationObject_message_creation")) {
		RunStepDetailsMessageCreationObject_message_creation obj = getMessageCreation();
		node = converttoJson(&obj, "RunStepDetailsMessageCreationObject_message_creation", "");
	}
	else {
		
		RunStepDetailsMessageCreationObject_message_creation obj = static_cast<RunStepDetailsMessageCreationObject_message_creation> (getMessageCreation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *message_creationKey = "message_creation";
	json_object_set_member(pJsonObject, message_creationKey, node);
	if (isprimitive("RunStepDetailsToolCallsObject_tool_calls_inner")) {
		list<RunStepDetailsToolCallsObject_tool_calls_inner> new_list = static_cast<list <RunStepDetailsToolCallsObject_tool_calls_inner> > (getToolCalls());
		node = converttoJson(&new_list, "RunStepDetailsToolCallsObject_tool_calls_inner", "array");
	} else {
		node = json_node_alloc();
		list<RunStepDetailsToolCallsObject_tool_calls_inner> new_list = static_cast<list <RunStepDetailsToolCallsObject_tool_calls_inner> > (getToolCalls());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RunStepDetailsToolCallsObject_tool_calls_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RunStepDetailsToolCallsObject_tool_calls_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *tool_callsKey = "tool_calls";
	json_object_set_member(pJsonObject, tool_callsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RunStepObject_step_details::getType()
{
	return type;
}

void
RunStepObject_step_details::setType(std::string  type)
{
	this->type = type;
}

RunStepDetailsMessageCreationObject_message_creation
RunStepObject_step_details::getMessageCreation()
{
	return message_creation;
}

void
RunStepObject_step_details::setMessageCreation(RunStepDetailsMessageCreationObject_message_creation  message_creation)
{
	this->message_creation = message_creation;
}

std::list<RunStepDetailsToolCallsObject_tool_calls_inner>
RunStepObject_step_details::getToolCalls()
{
	return tool_calls;
}

void
RunStepObject_step_details::setToolCalls(std::list <RunStepDetailsToolCallsObject_tool_calls_inner> tool_calls)
{
	this->tool_calls = tool_calls;
}


