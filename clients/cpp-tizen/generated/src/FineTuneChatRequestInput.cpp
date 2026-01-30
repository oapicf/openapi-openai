#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTuneChatRequestInput.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTuneChatRequestInput::FineTuneChatRequestInput()
{
	//__init();
}

FineTuneChatRequestInput::~FineTuneChatRequestInput()
{
	//__cleanup();
}

void
FineTuneChatRequestInput::__init()
{
	//new std::list()std::list> messages;
	//new std::list()std::list> tools;
	//parallel_tool_calls = bool(false);
	//new std::list()std::list> functions;
}

void
FineTuneChatRequestInput::__cleanup()
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
	//if(functions != NULL) {
	//functions.RemoveAll(true);
	//delete functions;
	//functions = NULL;
	//}
	//
}

void
FineTuneChatRequestInput::fromJson(char* jsonStr)
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
	const gchar *functionsKey = "functions";
	node = json_object_get_member(pJsonObject, functionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ChatCompletionFunctions> new_list;
			ChatCompletionFunctions inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ChatCompletionFunctions")) {
					jsonToValue(&inst, temp_json, "ChatCompletionFunctions", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			functions = new_list;
		}
		
	}
}

FineTuneChatRequestInput::FineTuneChatRequestInput(char* json)
{
	this->fromJson(json);
}

char*
FineTuneChatRequestInput::toJson()
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
	if (isprimitive("ChatCompletionFunctions")) {
		list<ChatCompletionFunctions> new_list = static_cast<list <ChatCompletionFunctions> > (getFunctions());
		node = converttoJson(&new_list, "ChatCompletionFunctions", "array");
	} else {
		node = json_node_alloc();
		list<ChatCompletionFunctions> new_list = static_cast<list <ChatCompletionFunctions> > (getFunctions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ChatCompletionFunctions>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ChatCompletionFunctions obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *functionsKey = "functions";
	json_object_set_member(pJsonObject, functionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<FineTuneChatRequestInput_messages_inner>
FineTuneChatRequestInput::getMessages()
{
	return messages;
}

void
FineTuneChatRequestInput::setMessages(std::list <FineTuneChatRequestInput_messages_inner> messages)
{
	this->messages = messages;
}

std::list<ChatCompletionTool>
FineTuneChatRequestInput::getTools()
{
	return tools;
}

void
FineTuneChatRequestInput::setTools(std::list <ChatCompletionTool> tools)
{
	this->tools = tools;
}

bool
FineTuneChatRequestInput::getParallelToolCalls()
{
	return parallel_tool_calls;
}

void
FineTuneChatRequestInput::setParallelToolCalls(bool  parallel_tool_calls)
{
	this->parallel_tool_calls = parallel_tool_calls;
}

std::list<ChatCompletionFunctions>
FineTuneChatRequestInput::getFunctions()
{
	return functions;
}

void
FineTuneChatRequestInput::setFunctions(std::list <ChatCompletionFunctions> functions)
{
	this->functions = functions;
}


