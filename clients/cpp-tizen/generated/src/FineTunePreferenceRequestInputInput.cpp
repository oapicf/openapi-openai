#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTunePreferenceRequestInput_input.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTunePreferenceRequestInput_input::FineTunePreferenceRequestInput_input()
{
	//__init();
}

FineTunePreferenceRequestInput_input::~FineTunePreferenceRequestInput_input()
{
	//__cleanup();
}

void
FineTunePreferenceRequestInput_input::__init()
{
	//new std::list()std::list> messages;
	//new std::list()std::list> tools;
	//parallel_tool_calls = bool(false);
}

void
FineTunePreferenceRequestInput_input::__cleanup()
{
	//if(messages != NULL) {
	//messages.RemoveAll(true);
	//delete messages;
	//messages = NULL;
	//}
	//if(tools != NULL) {
	//tools.RemoveAll(true);
	//delete tools;
	//tools = NULL;
	//}
	//if(parallel_tool_calls != NULL) {
	//
	//delete parallel_tool_calls;
	//parallel_tool_calls = NULL;
	//}
	//
}

void
FineTunePreferenceRequestInput_input::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *messagesKey = "messages";
	node = json_object_get_member(pJsonObject, messagesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FineTuneChatRequestInput_messages_inner> new_list;
			FineTuneChatRequestInput_messages_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FineTuneChatRequestInput_messages_inner")) {
					jsonToValue(&inst, temp_json, "FineTuneChatRequestInput_messages_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			messages = new_list;
		}
		
	}
	const gchar *toolsKey = "tools";
	node = json_object_get_member(pJsonObject, toolsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ChatCompletionTool> new_list;
			ChatCompletionTool inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ChatCompletionTool")) {
					jsonToValue(&inst, temp_json, "ChatCompletionTool", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tools = new_list;
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
}

FineTunePreferenceRequestInput_input::FineTunePreferenceRequestInput_input(char* json)
{
	this->fromJson(json);
}

char*
FineTunePreferenceRequestInput_input::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FineTuneChatRequestInput_messages_inner")) {
		list<FineTuneChatRequestInput_messages_inner> new_list = static_cast<list <FineTuneChatRequestInput_messages_inner> > (getMessages());
		node = converttoJson(&new_list, "FineTuneChatRequestInput_messages_inner", "array");
	} else {
		node = json_node_alloc();
		list<FineTuneChatRequestInput_messages_inner> new_list = static_cast<list <FineTuneChatRequestInput_messages_inner> > (getMessages());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FineTuneChatRequestInput_messages_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FineTuneChatRequestInput_messages_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *messagesKey = "messages";
	json_object_set_member(pJsonObject, messagesKey, node);
	if (isprimitive("ChatCompletionTool")) {
		list<ChatCompletionTool> new_list = static_cast<list <ChatCompletionTool> > (getTools());
		node = converttoJson(&new_list, "ChatCompletionTool", "array");
	} else {
		node = json_node_alloc();
		list<ChatCompletionTool> new_list = static_cast<list <ChatCompletionTool> > (getTools());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ChatCompletionTool>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ChatCompletionTool obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *toolsKey = "tools";
	json_object_set_member(pJsonObject, toolsKey, node);
	if (isprimitive("bool")) {
		bool obj = getParallelToolCalls();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *parallel_tool_callsKey = "parallel_tool_calls";
	json_object_set_member(pJsonObject, parallel_tool_callsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<FineTuneChatRequestInput_messages_inner>
FineTunePreferenceRequestInput_input::getMessages()
{
	return messages;
}

void
FineTunePreferenceRequestInput_input::setMessages(std::list <FineTuneChatRequestInput_messages_inner> messages)
{
	this->messages = messages;
}

std::list<ChatCompletionTool>
FineTunePreferenceRequestInput_input::getTools()
{
	return tools;
}

void
FineTunePreferenceRequestInput_input::setTools(std::list <ChatCompletionTool> tools)
{
	this->tools = tools;
}

bool
FineTunePreferenceRequestInput_input::getParallelToolCalls()
{
	return parallel_tool_calls;
}

void
FineTunePreferenceRequestInput_input::setParallelToolCalls(bool  parallel_tool_calls)
{
	this->parallel_tool_calls = parallel_tool_calls;
}


