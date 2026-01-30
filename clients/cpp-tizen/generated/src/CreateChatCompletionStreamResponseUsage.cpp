#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateChatCompletionStreamResponse_usage.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateChatCompletionStreamResponse_usage::CreateChatCompletionStreamResponse_usage()
{
	//__init();
}

CreateChatCompletionStreamResponse_usage::~CreateChatCompletionStreamResponse_usage()
{
	//__cleanup();
}

void
CreateChatCompletionStreamResponse_usage::__init()
{
	//completion_tokens = int(0);
	//prompt_tokens = int(0);
	//total_tokens = int(0);
}

void
CreateChatCompletionStreamResponse_usage::__cleanup()
{
	//if(completion_tokens != NULL) {
	//
	//delete completion_tokens;
	//completion_tokens = NULL;
	//}
	//if(prompt_tokens != NULL) {
	//
	//delete prompt_tokens;
	//prompt_tokens = NULL;
	//}
	//if(total_tokens != NULL) {
	//
	//delete total_tokens;
	//total_tokens = NULL;
	//}
	//
}

void
CreateChatCompletionStreamResponse_usage::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *completion_tokensKey = "completion_tokens";
	node = json_object_get_member(pJsonObject, completion_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&completion_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *prompt_tokensKey = "prompt_tokens";
	node = json_object_get_member(pJsonObject, prompt_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&prompt_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *total_tokensKey = "total_tokens";
	node = json_object_get_member(pJsonObject, total_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&total_tokens, node, "int", "");
		} else {
			
		}
	}
}

CreateChatCompletionStreamResponse_usage::CreateChatCompletionStreamResponse_usage(char* json)
{
	this->fromJson(json);
}

char*
CreateChatCompletionStreamResponse_usage::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getCompletionTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *completion_tokensKey = "completion_tokens";
	json_object_set_member(pJsonObject, completion_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getPromptTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *prompt_tokensKey = "prompt_tokens";
	json_object_set_member(pJsonObject, prompt_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getTotalTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *total_tokensKey = "total_tokens";
	json_object_set_member(pJsonObject, total_tokensKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CreateChatCompletionStreamResponse_usage::getCompletionTokens()
{
	return completion_tokens;
}

void
CreateChatCompletionStreamResponse_usage::setCompletionTokens(int  completion_tokens)
{
	this->completion_tokens = completion_tokens;
}

int
CreateChatCompletionStreamResponse_usage::getPromptTokens()
{
	return prompt_tokens;
}

void
CreateChatCompletionStreamResponse_usage::setPromptTokens(int  prompt_tokens)
{
	this->prompt_tokens = prompt_tokens;
}

int
CreateChatCompletionStreamResponse_usage::getTotalTokens()
{
	return total_tokens;
}

void
CreateChatCompletionStreamResponse_usage::setTotalTokens(int  total_tokens)
{
	this->total_tokens = total_tokens;
}


