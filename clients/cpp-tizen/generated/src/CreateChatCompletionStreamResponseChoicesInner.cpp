#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateChatCompletionStreamResponse_choices_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateChatCompletionStreamResponse_choices_inner::CreateChatCompletionStreamResponse_choices_inner()
{
	//__init();
}

CreateChatCompletionStreamResponse_choices_inner::~CreateChatCompletionStreamResponse_choices_inner()
{
	//__cleanup();
}

void
CreateChatCompletionStreamResponse_choices_inner::__init()
{
	//index = int(0);
	//delta = new ChatCompletionStreamResponseDelta();
	//finish_reason = std::string();
}

void
CreateChatCompletionStreamResponse_choices_inner::__cleanup()
{
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
	//if(delta != NULL) {
	//
	//delete delta;
	//delta = NULL;
	//}
	//if(finish_reason != NULL) {
	//
	//delete finish_reason;
	//finish_reason = NULL;
	//}
	//
}

void
CreateChatCompletionStreamResponse_choices_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *indexKey = "index";
	node = json_object_get_member(pJsonObject, indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&index, node, "int", "");
		} else {
			
		}
	}
	const gchar *deltaKey = "delta";
	node = json_object_get_member(pJsonObject, deltaKey);
	if (node !=NULL) {
	

		if (isprimitive("ChatCompletionStreamResponseDelta")) {
			jsonToValue(&delta, node, "ChatCompletionStreamResponseDelta", "ChatCompletionStreamResponseDelta");
		} else {
			
			ChatCompletionStreamResponseDelta* obj = static_cast<ChatCompletionStreamResponseDelta*> (&delta);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *finish_reasonKey = "finish_reason";
	node = json_object_get_member(pJsonObject, finish_reasonKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&finish_reason, node, "std::string", "");
		} else {
			
		}
	}
}

CreateChatCompletionStreamResponse_choices_inner::CreateChatCompletionStreamResponse_choices_inner(char* json)
{
	this->fromJson(json);
}

char*
CreateChatCompletionStreamResponse_choices_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *indexKey = "index";
	json_object_set_member(pJsonObject, indexKey, node);
	if (isprimitive("ChatCompletionStreamResponseDelta")) {
		ChatCompletionStreamResponseDelta obj = getDelta();
		node = converttoJson(&obj, "ChatCompletionStreamResponseDelta", "");
	}
	else {
		
		ChatCompletionStreamResponseDelta obj = static_cast<ChatCompletionStreamResponseDelta> (getDelta());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deltaKey = "delta";
	json_object_set_member(pJsonObject, deltaKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFinishReason();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *finish_reasonKey = "finish_reason";
	json_object_set_member(pJsonObject, finish_reasonKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CreateChatCompletionStreamResponse_choices_inner::getIndex()
{
	return index;
}

void
CreateChatCompletionStreamResponse_choices_inner::setIndex(int  index)
{
	this->index = index;
}

ChatCompletionStreamResponseDelta
CreateChatCompletionStreamResponse_choices_inner::getDelta()
{
	return delta;
}

void
CreateChatCompletionStreamResponse_choices_inner::setDelta(ChatCompletionStreamResponseDelta  delta)
{
	this->delta = delta;
}

std::string
CreateChatCompletionStreamResponse_choices_inner::getFinishReason()
{
	return finish_reason;
}

void
CreateChatCompletionStreamResponse_choices_inner::setFinishReason(std::string  finish_reason)
{
	this->finish_reason = finish_reason;
}


