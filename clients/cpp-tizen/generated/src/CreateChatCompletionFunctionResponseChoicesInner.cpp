#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateChatCompletionFunctionResponse_choices_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateChatCompletionFunctionResponse_choices_inner::CreateChatCompletionFunctionResponse_choices_inner()
{
	//__init();
}

CreateChatCompletionFunctionResponse_choices_inner::~CreateChatCompletionFunctionResponse_choices_inner()
{
	//__cleanup();
}

void
CreateChatCompletionFunctionResponse_choices_inner::__init()
{
	//finish_reason = std::string();
	//index = int(0);
	//message = new ChatCompletionResponseMessage();
}

void
CreateChatCompletionFunctionResponse_choices_inner::__cleanup()
{
	//if(finish_reason != NULL) {
	//
	//delete finish_reason;
	//finish_reason = NULL;
	//}
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//
}

void
CreateChatCompletionFunctionResponse_choices_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *finish_reasonKey = "finish_reason";
	node = json_object_get_member(pJsonObject, finish_reasonKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&finish_reason, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *indexKey = "index";
	node = json_object_get_member(pJsonObject, indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&index, node, "int", "");
		} else {
			
		}
	}
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("ChatCompletionResponseMessage")) {
			jsonToValue(&message, node, "ChatCompletionResponseMessage", "ChatCompletionResponseMessage");
		} else {
			
			ChatCompletionResponseMessage* obj = static_cast<ChatCompletionResponseMessage*> (&message);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateChatCompletionFunctionResponse_choices_inner::CreateChatCompletionFunctionResponse_choices_inner(char* json)
{
	this->fromJson(json);
}

char*
CreateChatCompletionFunctionResponse_choices_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getFinishReason();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *finish_reasonKey = "finish_reason";
	json_object_set_member(pJsonObject, finish_reasonKey, node);
	if (isprimitive("int")) {
		int obj = getIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *indexKey = "index";
	json_object_set_member(pJsonObject, indexKey, node);
	if (isprimitive("ChatCompletionResponseMessage")) {
		ChatCompletionResponseMessage obj = getMessage();
		node = converttoJson(&obj, "ChatCompletionResponseMessage", "");
	}
	else {
		
		ChatCompletionResponseMessage obj = static_cast<ChatCompletionResponseMessage> (getMessage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateChatCompletionFunctionResponse_choices_inner::getFinishReason()
{
	return finish_reason;
}

void
CreateChatCompletionFunctionResponse_choices_inner::setFinishReason(std::string  finish_reason)
{
	this->finish_reason = finish_reason;
}

int
CreateChatCompletionFunctionResponse_choices_inner::getIndex()
{
	return index;
}

void
CreateChatCompletionFunctionResponse_choices_inner::setIndex(int  index)
{
	this->index = index;
}

ChatCompletionResponseMessage
CreateChatCompletionFunctionResponse_choices_inner::getMessage()
{
	return message;
}

void
CreateChatCompletionFunctionResponse_choices_inner::setMessage(ChatCompletionResponseMessage  message)
{
	this->message = message;
}


