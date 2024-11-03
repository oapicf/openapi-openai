#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateEmbeddingResponse_usage.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateEmbeddingResponse_usage::CreateEmbeddingResponse_usage()
{
	//__init();
}

CreateEmbeddingResponse_usage::~CreateEmbeddingResponse_usage()
{
	//__cleanup();
}

void
CreateEmbeddingResponse_usage::__init()
{
	//prompt_tokens = int(0);
	//total_tokens = int(0);
}

void
CreateEmbeddingResponse_usage::__cleanup()
{
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
CreateEmbeddingResponse_usage::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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

CreateEmbeddingResponse_usage::CreateEmbeddingResponse_usage(char* json)
{
	this->fromJson(json);
}

char*
CreateEmbeddingResponse_usage::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
CreateEmbeddingResponse_usage::getPromptTokens()
{
	return prompt_tokens;
}

void
CreateEmbeddingResponse_usage::setPromptTokens(int  prompt_tokens)
{
	this->prompt_tokens = prompt_tokens;
}

int
CreateEmbeddingResponse_usage::getTotalTokens()
{
	return total_tokens;
}

void
CreateEmbeddingResponse_usage::setTotalTokens(int  total_tokens)
{
	this->total_tokens = total_tokens;
}


