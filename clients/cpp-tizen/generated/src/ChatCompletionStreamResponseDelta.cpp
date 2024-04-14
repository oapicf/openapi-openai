#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionStreamResponseDelta.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionStreamResponseDelta::ChatCompletionStreamResponseDelta()
{
	//__init();
}

ChatCompletionStreamResponseDelta::~ChatCompletionStreamResponseDelta()
{
	//__cleanup();
}

void
ChatCompletionStreamResponseDelta::__init()
{
	//content = std::string();
	//function_call = new ChatCompletionStreamResponseDelta_function_call();
	//new std::list()std::list> tool_calls;
	//role = std::string();
}

void
ChatCompletionStreamResponseDelta::__cleanup()
{
	//if(content != NULL) {
	//
	//delete content;
	//content = NULL;
	//}
	//if(function_call != NULL) {
	//
	//delete function_call;
	//function_call = NULL;
	//}
	//if(tool_calls != NULL) {
	//tool_calls.RemoveAll(true);
	//delete tool_calls;
	//tool_calls = NULL;
	//}
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//
}

void
ChatCompletionStreamResponseDelta::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *contentKey = "content";
	node = json_object_get_member(pJsonObject, contentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&content, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *function_callKey = "function_call";
	node = json_object_get_member(pJsonObject, function_callKey);
	if (node !=NULL) {
	

		if (isprimitive("ChatCompletionStreamResponseDelta_function_call")) {
			jsonToValue(&function_call, node, "ChatCompletionStreamResponseDelta_function_call", "ChatCompletionStreamResponseDelta_function_call");
		} else {
			
			ChatCompletionStreamResponseDelta_function_call* obj = static_cast<ChatCompletionStreamResponseDelta_function_call*> (&function_call);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tool_callsKey = "tool_calls";
	node = json_object_get_member(pJsonObject, tool_callsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ChatCompletionMessageToolCallChunk> new_list;
			ChatCompletionMessageToolCallChunk inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ChatCompletionMessageToolCallChunk")) {
					jsonToValue(&inst, temp_json, "ChatCompletionMessageToolCallChunk", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tool_calls = new_list;
		}
		
	}
	const gchar *roleKey = "role";
	node = json_object_get_member(pJsonObject, roleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&role, node, "std::string", "");
		} else {
			
		}
	}
}

ChatCompletionStreamResponseDelta::ChatCompletionStreamResponseDelta(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionStreamResponseDelta::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getContent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *contentKey = "content";
	json_object_set_member(pJsonObject, contentKey, node);
	if (isprimitive("ChatCompletionStreamResponseDelta_function_call")) {
		ChatCompletionStreamResponseDelta_function_call obj = getFunctionCall();
		node = converttoJson(&obj, "ChatCompletionStreamResponseDelta_function_call", "");
	}
	else {
		
		ChatCompletionStreamResponseDelta_function_call obj = static_cast<ChatCompletionStreamResponseDelta_function_call> (getFunctionCall());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *function_callKey = "function_call";
	json_object_set_member(pJsonObject, function_callKey, node);
	if (isprimitive("ChatCompletionMessageToolCallChunk")) {
		list<ChatCompletionMessageToolCallChunk> new_list = static_cast<list <ChatCompletionMessageToolCallChunk> > (getToolCalls());
		node = converttoJson(&new_list, "ChatCompletionMessageToolCallChunk", "array");
	} else {
		node = json_node_alloc();
		list<ChatCompletionMessageToolCallChunk> new_list = static_cast<list <ChatCompletionMessageToolCallChunk> > (getToolCalls());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ChatCompletionMessageToolCallChunk>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ChatCompletionMessageToolCallChunk obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *tool_callsKey = "tool_calls";
	json_object_set_member(pJsonObject, tool_callsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRole();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *roleKey = "role";
	json_object_set_member(pJsonObject, roleKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ChatCompletionStreamResponseDelta::getContent()
{
	return content;
}

void
ChatCompletionStreamResponseDelta::setContent(std::string  content)
{
	this->content = content;
}

ChatCompletionStreamResponseDelta_function_call
ChatCompletionStreamResponseDelta::getFunctionCall()
{
	return function_call;
}

void
ChatCompletionStreamResponseDelta::setFunctionCall(ChatCompletionStreamResponseDelta_function_call  function_call)
{
	this->function_call = function_call;
}

std::list<ChatCompletionMessageToolCallChunk>
ChatCompletionStreamResponseDelta::getToolCalls()
{
	return tool_calls;
}

void
ChatCompletionStreamResponseDelta::setToolCalls(std::list <ChatCompletionMessageToolCallChunk> tool_calls)
{
	this->tool_calls = tool_calls;
}

std::string
ChatCompletionStreamResponseDelta::getRole()
{
	return role;
}

void
ChatCompletionStreamResponseDelta::setRole(std::string  role)
{
	this->role = role;
}


