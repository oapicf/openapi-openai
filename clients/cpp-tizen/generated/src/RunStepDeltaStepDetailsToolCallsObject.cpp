#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDeltaStepDetailsToolCallsObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDeltaStepDetailsToolCallsObject::RunStepDeltaStepDetailsToolCallsObject()
{
	//__init();
}

RunStepDeltaStepDetailsToolCallsObject::~RunStepDeltaStepDetailsToolCallsObject()
{
	//__cleanup();
}

void
RunStepDeltaStepDetailsToolCallsObject::__init()
{
	//type = std::string();
	//new std::list()std::list> tool_calls;
}

void
RunStepDeltaStepDetailsToolCallsObject::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(tool_calls != NULL) {
	//tool_calls.RemoveAll(true);
	//delete tool_calls;
	//tool_calls = NULL;
	//}
	//
}

void
RunStepDeltaStepDetailsToolCallsObject::fromJson(char* jsonStr)
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
	const gchar *tool_callsKey = "tool_calls";
	node = json_object_get_member(pJsonObject, tool_callsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> new_list;
			RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner")) {
					jsonToValue(&inst, temp_json, "RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tool_calls = new_list;
		}
		
	}
}

RunStepDeltaStepDetailsToolCallsObject::RunStepDeltaStepDetailsToolCallsObject(char* json)
{
	this->fromJson(json);
}

char*
RunStepDeltaStepDetailsToolCallsObject::toJson()
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
	if (isprimitive("RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner")) {
		list<RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> new_list = static_cast<list <RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> > (getToolCalls());
		node = converttoJson(&new_list, "RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner", "array");
	} else {
		node = json_node_alloc();
		list<RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> new_list = static_cast<list <RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> > (getToolCalls());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner obj = *it;
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
RunStepDeltaStepDetailsToolCallsObject::getType()
{
	return type;
}

void
RunStepDeltaStepDetailsToolCallsObject::setType(std::string  type)
{
	this->type = type;
}

std::list<RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner>
RunStepDeltaStepDetailsToolCallsObject::getToolCalls()
{
	return tool_calls;
}

void
RunStepDeltaStepDetailsToolCallsObject::setToolCalls(std::list <RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> tool_calls)
{
	this->tool_calls = tool_calls;
}


