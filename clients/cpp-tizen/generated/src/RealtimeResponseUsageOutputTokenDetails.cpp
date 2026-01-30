#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeResponse_usage_output_token_details.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeResponse_usage_output_token_details::RealtimeResponse_usage_output_token_details()
{
	//__init();
}

RealtimeResponse_usage_output_token_details::~RealtimeResponse_usage_output_token_details()
{
	//__cleanup();
}

void
RealtimeResponse_usage_output_token_details::__init()
{
	//text_tokens = int(0);
	//audio_tokens = int(0);
}

void
RealtimeResponse_usage_output_token_details::__cleanup()
{
	//if(text_tokens != NULL) {
	//
	//delete text_tokens;
	//text_tokens = NULL;
	//}
	//if(audio_tokens != NULL) {
	//
	//delete audio_tokens;
	//audio_tokens = NULL;
	//}
	//
}

void
RealtimeResponse_usage_output_token_details::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *text_tokensKey = "text_tokens";
	node = json_object_get_member(pJsonObject, text_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&text_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *audio_tokensKey = "audio_tokens";
	node = json_object_get_member(pJsonObject, audio_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&audio_tokens, node, "int", "");
		} else {
			
		}
	}
}

RealtimeResponse_usage_output_token_details::RealtimeResponse_usage_output_token_details(char* json)
{
	this->fromJson(json);
}

char*
RealtimeResponse_usage_output_token_details::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getTextTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *text_tokensKey = "text_tokens";
	json_object_set_member(pJsonObject, text_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getAudioTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *audio_tokensKey = "audio_tokens";
	json_object_set_member(pJsonObject, audio_tokensKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
RealtimeResponse_usage_output_token_details::getTextTokens()
{
	return text_tokens;
}

void
RealtimeResponse_usage_output_token_details::setTextTokens(int  text_tokens)
{
	this->text_tokens = text_tokens;
}

int
RealtimeResponse_usage_output_token_details::getAudioTokens()
{
	return audio_tokens;
}

void
RealtimeResponse_usage_output_token_details::setAudioTokens(int  audio_tokens)
{
	this->audio_tokens = audio_tokens;
}


