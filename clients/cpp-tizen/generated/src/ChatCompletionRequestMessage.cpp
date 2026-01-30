#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionRequestMessage.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionRequestMessage::ChatCompletionRequestMessage()
{
	//__init();
}

ChatCompletionRequestMessage::~ChatCompletionRequestMessage()
{
	//__cleanup();
}

void
ChatCompletionRequestMessage::__init()
{
	//content = std::string();
	//role = std::string();
	//name = std::string();
	//refusal = std::string();
	//audio = new ChatCompletionRequestAssistantMessage_audio();
	//new std::list()std::list> tool_calls;
	//function_call = new ChatCompletionRequestAssistantMessage_function_call();
	//tool_call_id = std::string();
}

void
ChatCompletionRequestMessage::__cleanup()
{
	//if(content != NULL) {
	//
	//delete content;
	//content = NULL;
	//}
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(refusal != NULL) {
	//
	//delete refusal;
	//refusal = NULL;
	//}
	//if(audio != NULL) {
	//
	//delete audio;
	//audio = NULL;
	//}
	//if(tool_calls != NULL) {
	//tool_calls.RemoveAll(true);
	//delete tool_calls;
	//tool_calls = NULL;
	//}
	//if(function_call != NULL) {
	//
	//delete function_call;
	//function_call = NULL;
	//}
	//if(tool_call_id != NULL) {
	//
	//delete tool_call_id;
	//tool_call_id = NULL;
	//}
	//
}

void
ChatCompletionRequestMessage::fromJson(char* jsonStr)
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
	const gchar *roleKey = "role";
	node = json_object_get_member(pJsonObject, roleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&role, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *refusalKey = "refusal";
	node = json_object_get_member(pJsonObject, refusalKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&refusal, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *audioKey = "audio";
	node = json_object_get_member(pJsonObject, audioKey);
	if (node !=NULL) {
	

		if (isprimitive("ChatCompletionRequestAssistantMessage_audio")) {
			jsonToValue(&audio, node, "ChatCompletionRequestAssistantMessage_audio", "ChatCompletionRequestAssistantMessage_audio");
		} else {
			
			ChatCompletionRequestAssistantMessage_audio* obj = static_cast<ChatCompletionRequestAssistantMessage_audio*> (&audio);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tool_callsKey = "tool_calls";
	node = json_object_get_member(pJsonObject, tool_callsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ChatCompletionMessageToolCall> new_list;
			ChatCompletionMessageToolCall inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ChatCompletionMessageToolCall")) {
					jsonToValue(&inst, temp_json, "ChatCompletionMessageToolCall", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tool_calls = new_list;
		}
		
	}
	const gchar *function_callKey = "function_call";
	node = json_object_get_member(pJsonObject, function_callKey);
	if (node !=NULL) {
	

		if (isprimitive("ChatCompletionRequestAssistantMessage_function_call")) {
			jsonToValue(&function_call, node, "ChatCompletionRequestAssistantMessage_function_call", "ChatCompletionRequestAssistantMessage_function_call");
		} else {
			
			ChatCompletionRequestAssistantMessage_function_call* obj = static_cast<ChatCompletionRequestAssistantMessage_function_call*> (&function_call);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tool_call_idKey = "tool_call_id";
	node = json_object_get_member(pJsonObject, tool_call_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&tool_call_id, node, "std::string", "");
		} else {
			
		}
	}
}

ChatCompletionRequestMessage::ChatCompletionRequestMessage(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionRequestMessage::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getRole();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *roleKey = "role";
	json_object_set_member(pJsonObject, roleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRefusal();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *refusalKey = "refusal";
	json_object_set_member(pJsonObject, refusalKey, node);
	if (isprimitive("ChatCompletionRequestAssistantMessage_audio")) {
		ChatCompletionRequestAssistantMessage_audio obj = getAudio();
		node = converttoJson(&obj, "ChatCompletionRequestAssistantMessage_audio", "");
	}
	else {
		
		ChatCompletionRequestAssistantMessage_audio obj = static_cast<ChatCompletionRequestAssistantMessage_audio> (getAudio());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *audioKey = "audio";
	json_object_set_member(pJsonObject, audioKey, node);
	if (isprimitive("ChatCompletionMessageToolCall")) {
		list<ChatCompletionMessageToolCall> new_list = static_cast<list <ChatCompletionMessageToolCall> > (getToolCalls());
		node = converttoJson(&new_list, "ChatCompletionMessageToolCall", "array");
	} else {
		node = json_node_alloc();
		list<ChatCompletionMessageToolCall> new_list = static_cast<list <ChatCompletionMessageToolCall> > (getToolCalls());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ChatCompletionMessageToolCall>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ChatCompletionMessageToolCall obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *tool_callsKey = "tool_calls";
	json_object_set_member(pJsonObject, tool_callsKey, node);
	if (isprimitive("ChatCompletionRequestAssistantMessage_function_call")) {
		ChatCompletionRequestAssistantMessage_function_call obj = getFunctionCall();
		node = converttoJson(&obj, "ChatCompletionRequestAssistantMessage_function_call", "");
	}
	else {
		
		ChatCompletionRequestAssistantMessage_function_call obj = static_cast<ChatCompletionRequestAssistantMessage_function_call> (getFunctionCall());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *function_callKey = "function_call";
	json_object_set_member(pJsonObject, function_callKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getToolCallId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *tool_call_idKey = "tool_call_id";
	json_object_set_member(pJsonObject, tool_call_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ChatCompletionRequestMessage::getContent()
{
	return content;
}

void
ChatCompletionRequestMessage::setContent(std::string  content)
{
	this->content = content;
}

std::string
ChatCompletionRequestMessage::getRole()
{
	return role;
}

void
ChatCompletionRequestMessage::setRole(std::string  role)
{
	this->role = role;
}

std::string
ChatCompletionRequestMessage::getName()
{
	return name;
}

void
ChatCompletionRequestMessage::setName(std::string  name)
{
	this->name = name;
}

std::string
ChatCompletionRequestMessage::getRefusal()
{
	return refusal;
}

void
ChatCompletionRequestMessage::setRefusal(std::string  refusal)
{
	this->refusal = refusal;
}

ChatCompletionRequestAssistantMessage_audio
ChatCompletionRequestMessage::getAudio()
{
	return audio;
}

void
ChatCompletionRequestMessage::setAudio(ChatCompletionRequestAssistantMessage_audio  audio)
{
	this->audio = audio;
}

std::list<ChatCompletionMessageToolCall>
ChatCompletionRequestMessage::getToolCalls()
{
	return tool_calls;
}

void
ChatCompletionRequestMessage::setToolCalls(std::list <ChatCompletionMessageToolCall> tool_calls)
{
	this->tool_calls = tool_calls;
}

ChatCompletionRequestAssistantMessage_function_call
ChatCompletionRequestMessage::getFunctionCall()
{
	return function_call;
}

void
ChatCompletionRequestMessage::setFunctionCall(ChatCompletionRequestAssistantMessage_function_call  function_call)
{
	this->function_call = function_call;
}

std::string
ChatCompletionRequestMessage::getToolCallId()
{
	return tool_call_id;
}

void
ChatCompletionRequestMessage::setToolCallId(std::string  tool_call_id)
{
	this->tool_call_id = tool_call_id;
}


