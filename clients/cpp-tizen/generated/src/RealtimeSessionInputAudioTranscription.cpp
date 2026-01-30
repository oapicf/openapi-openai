#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeSession_input_audio_transcription.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeSession_input_audio_transcription::RealtimeSession_input_audio_transcription()
{
	//__init();
}

RealtimeSession_input_audio_transcription::~RealtimeSession_input_audio_transcription()
{
	//__cleanup();
}

void
RealtimeSession_input_audio_transcription::__init()
{
	//model = std::string();
}

void
RealtimeSession_input_audio_transcription::__cleanup()
{
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//
}

void
RealtimeSession_input_audio_transcription::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&model, node, "std::string", "");
		} else {
			
		}
	}
}

RealtimeSession_input_audio_transcription::RealtimeSession_input_audio_transcription(char* json)
{
	this->fromJson(json);
}

char*
RealtimeSession_input_audio_transcription::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeSession_input_audio_transcription::getModel()
{
	return model;
}

void
RealtimeSession_input_audio_transcription::setModel(std::string  model)
{
	this->model = model;
}


