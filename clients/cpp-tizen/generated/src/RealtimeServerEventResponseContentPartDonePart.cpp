#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeServerEventResponseContentPartDone_part.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeServerEventResponseContentPartDone_part::RealtimeServerEventResponseContentPartDone_part()
{
	//__init();
}

RealtimeServerEventResponseContentPartDone_part::~RealtimeServerEventResponseContentPartDone_part()
{
	//__cleanup();
}

void
RealtimeServerEventResponseContentPartDone_part::__init()
{
	//type = std::string();
	//text = std::string();
	//audio = std::string();
	//transcript = std::string();
}

void
RealtimeServerEventResponseContentPartDone_part::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(text != NULL) {
	//
	//delete text;
	//text = NULL;
	//}
	//if(audio != NULL) {
	//
	//delete audio;
	//audio = NULL;
	//}
	//if(transcript != NULL) {
	//
	//delete transcript;
	//transcript = NULL;
	//}
	//
}

void
RealtimeServerEventResponseContentPartDone_part::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *textKey = "text";
	node = json_object_get_member(pJsonObject, textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&text, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *audioKey = "audio";
	node = json_object_get_member(pJsonObject, audioKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&audio, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *transcriptKey = "transcript";
	node = json_object_get_member(pJsonObject, transcriptKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&transcript, node, "std::string", "");
		} else {
			
		}
	}
}

RealtimeServerEventResponseContentPartDone_part::RealtimeServerEventResponseContentPartDone_part(char* json)
{
	this->fromJson(json);
}

char*
RealtimeServerEventResponseContentPartDone_part::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *textKey = "text";
	json_object_set_member(pJsonObject, textKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAudio();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *audioKey = "audio";
	json_object_set_member(pJsonObject, audioKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTranscript();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *transcriptKey = "transcript";
	json_object_set_member(pJsonObject, transcriptKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeServerEventResponseContentPartDone_part::getType()
{
	return type;
}

void
RealtimeServerEventResponseContentPartDone_part::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeServerEventResponseContentPartDone_part::getText()
{
	return text;
}

void
RealtimeServerEventResponseContentPartDone_part::setText(std::string  text)
{
	this->text = text;
}

std::string
RealtimeServerEventResponseContentPartDone_part::getAudio()
{
	return audio;
}

void
RealtimeServerEventResponseContentPartDone_part::setAudio(std::string  audio)
{
	this->audio = audio;
}

std::string
RealtimeServerEventResponseContentPartDone_part::getTranscript()
{
	return transcript;
}

void
RealtimeServerEventResponseContentPartDone_part::setTranscript(std::string  transcript)
{
	this->transcript = transcript;
}


