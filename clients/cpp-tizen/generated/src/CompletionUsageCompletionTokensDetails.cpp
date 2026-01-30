#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CompletionUsage_completion_tokens_details.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CompletionUsage_completion_tokens_details::CompletionUsage_completion_tokens_details()
{
	//__init();
}

CompletionUsage_completion_tokens_details::~CompletionUsage_completion_tokens_details()
{
	//__cleanup();
}

void
CompletionUsage_completion_tokens_details::__init()
{
	//accepted_prediction_tokens = int(0);
	//audio_tokens = int(0);
	//reasoning_tokens = int(0);
	//rejected_prediction_tokens = int(0);
}

void
CompletionUsage_completion_tokens_details::__cleanup()
{
	//if(accepted_prediction_tokens != NULL) {
	//
	//delete accepted_prediction_tokens;
	//accepted_prediction_tokens = NULL;
	//}
	//if(audio_tokens != NULL) {
	//
	//delete audio_tokens;
	//audio_tokens = NULL;
	//}
	//if(reasoning_tokens != NULL) {
	//
	//delete reasoning_tokens;
	//reasoning_tokens = NULL;
	//}
	//if(rejected_prediction_tokens != NULL) {
	//
	//delete rejected_prediction_tokens;
	//rejected_prediction_tokens = NULL;
	//}
	//
}

void
CompletionUsage_completion_tokens_details::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *accepted_prediction_tokensKey = "accepted_prediction_tokens";
	node = json_object_get_member(pJsonObject, accepted_prediction_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&accepted_prediction_tokens, node, "int", "");
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
	const gchar *reasoning_tokensKey = "reasoning_tokens";
	node = json_object_get_member(pJsonObject, reasoning_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&reasoning_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *rejected_prediction_tokensKey = "rejected_prediction_tokens";
	node = json_object_get_member(pJsonObject, rejected_prediction_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&rejected_prediction_tokens, node, "int", "");
		} else {
			
		}
	}
}

CompletionUsage_completion_tokens_details::CompletionUsage_completion_tokens_details(char* json)
{
	this->fromJson(json);
}

char*
CompletionUsage_completion_tokens_details::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getAcceptedPredictionTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *accepted_prediction_tokensKey = "accepted_prediction_tokens";
	json_object_set_member(pJsonObject, accepted_prediction_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getAudioTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *audio_tokensKey = "audio_tokens";
	json_object_set_member(pJsonObject, audio_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getReasoningTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *reasoning_tokensKey = "reasoning_tokens";
	json_object_set_member(pJsonObject, reasoning_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getRejectedPredictionTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *rejected_prediction_tokensKey = "rejected_prediction_tokens";
	json_object_set_member(pJsonObject, rejected_prediction_tokensKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CompletionUsage_completion_tokens_details::getAcceptedPredictionTokens()
{
	return accepted_prediction_tokens;
}

void
CompletionUsage_completion_tokens_details::setAcceptedPredictionTokens(int  accepted_prediction_tokens)
{
	this->accepted_prediction_tokens = accepted_prediction_tokens;
}

int
CompletionUsage_completion_tokens_details::getAudioTokens()
{
	return audio_tokens;
}

void
CompletionUsage_completion_tokens_details::setAudioTokens(int  audio_tokens)
{
	this->audio_tokens = audio_tokens;
}

int
CompletionUsage_completion_tokens_details::getReasoningTokens()
{
	return reasoning_tokens;
}

void
CompletionUsage_completion_tokens_details::setReasoningTokens(int  reasoning_tokens)
{
	this->reasoning_tokens = reasoning_tokens;
}

int
CompletionUsage_completion_tokens_details::getRejectedPredictionTokens()
{
	return rejected_prediction_tokens;
}

void
CompletionUsage_completion_tokens_details::setRejectedPredictionTokens(int  rejected_prediction_tokens)
{
	this->rejected_prediction_tokens = rejected_prediction_tokens;
}


