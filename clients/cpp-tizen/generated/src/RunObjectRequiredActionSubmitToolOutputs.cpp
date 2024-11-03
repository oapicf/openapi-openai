#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunObject_required_action_submit_tool_outputs.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunObject_required_action_submit_tool_outputs::RunObject_required_action_submit_tool_outputs()
{
	//__init();
}

RunObject_required_action_submit_tool_outputs::~RunObject_required_action_submit_tool_outputs()
{
	//__cleanup();
}

void
RunObject_required_action_submit_tool_outputs::__init()
{
	//new std::list()std::list> tool_calls;
}

void
RunObject_required_action_submit_tool_outputs::__cleanup()
{
	//if(tool_calls != NULL) {
	//tool_calls.RemoveAll(true);
	//delete tool_calls;
	//tool_calls = NULL;
	//}
	//
}

void
RunObject_required_action_submit_tool_outputs::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *tool_callsKey = "tool_calls";
	node = json_object_get_member(pJsonObject, tool_callsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RunToolCallObject> new_list;
			RunToolCallObject inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RunToolCallObject")) {
					jsonToValue(&inst, temp_json, "RunToolCallObject", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tool_calls = new_list;
		}
		
	}
}

RunObject_required_action_submit_tool_outputs::RunObject_required_action_submit_tool_outputs(char* json)
{
	this->fromJson(json);
}

char*
RunObject_required_action_submit_tool_outputs::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("RunToolCallObject")) {
		list<RunToolCallObject> new_list = static_cast<list <RunToolCallObject> > (getToolCalls());
		node = converttoJson(&new_list, "RunToolCallObject", "array");
	} else {
		node = json_node_alloc();
		list<RunToolCallObject> new_list = static_cast<list <RunToolCallObject> > (getToolCalls());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RunToolCallObject>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RunToolCallObject obj = *it;
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

std::list<RunToolCallObject>
RunObject_required_action_submit_tool_outputs::getToolCalls()
{
	return tool_calls;
}

void
RunObject_required_action_submit_tool_outputs::setToolCalls(std::list <RunToolCallObject> tool_calls)
{
	this->tool_calls = tool_calls;
}


