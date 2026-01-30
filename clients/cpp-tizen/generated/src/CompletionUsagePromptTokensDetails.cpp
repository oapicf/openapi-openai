#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CompletionUsage_prompt_tokens_details.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CompletionUsage_prompt_tokens_details::CompletionUsage_prompt_tokens_details()
{
	//__init();
}

CompletionUsage_prompt_tokens_details::~CompletionUsage_prompt_tokens_details()
{
	//__cleanup();
}

void
CompletionUsage_prompt_tokens_details::__init()
{
	//audio_tokens = int(0);
	//cached_tokens = int(0);
}

void
CompletionUsage_prompt_tokens_details::__cleanup()
{
	//if(audio_tokens != NULL) {
	//
	//delete audio_tokens;
	//audio_tokens = NULL;
	//}
	//if(cached_tokens != NULL) {
	//
	//delete cached_tokens;
	//cached_tokens = NULL;
	//}
	//
}

void
CompletionUsage_prompt_tokens_details::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *audio_tokensKey = "audio_tokens";
	node = json_object_get_member(pJsonObject, audio_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&audio_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *cached_tokensKey = "cached_tokens";
	node = json_object_get_member(pJsonObject, cached_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&cached_tokens, node, "int", "");
		} else {
			
		}
	}
}

CompletionUsage_prompt_tokens_details::CompletionUsage_prompt_tokens_details(char* json)
{
	this->fromJson(json);
}

char*
CompletionUsage_prompt_tokens_details::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getAudioTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *audio_tokensKey = "audio_tokens";
	json_object_set_member(pJsonObject, audio_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getCachedTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *cached_tokensKey = "cached_tokens";
	json_object_set_member(pJsonObject, cached_tokensKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CompletionUsage_prompt_tokens_details::getAudioTokens()
{
	return audio_tokens;
}

void
CompletionUsage_prompt_tokens_details::setAudioTokens(int  audio_tokens)
{
	this->audio_tokens = audio_tokens;
}

int
CompletionUsage_prompt_tokens_details::getCachedTokens()
{
	return cached_tokens;
}

void
CompletionUsage_prompt_tokens_details::setCachedTokens(int  cached_tokens)
{
	this->cached_tokens = cached_tokens;
}


