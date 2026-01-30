#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeConversationItem_content_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeConversationItem_content_inner::RealtimeConversationItem_content_inner()
{
	//__init();
}

RealtimeConversationItem_content_inner::~RealtimeConversationItem_content_inner()
{
	//__cleanup();
}

void
RealtimeConversationItem_content_inner::__init()
{
	//type = std::string();
	//text = std::string();
	//id = std::string();
	//audio = std::string();
	//transcript = std::string();
}

void
RealtimeConversationItem_content_inner::__cleanup()
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
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
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
RealtimeConversationItem_content_inner::fromJson(char* jsonStr)
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
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

RealtimeConversationItem_content_inner::RealtimeConversationItem_content_inner(char* json)
{
	this->fromJson(json);
}

char*
RealtimeConversationItem_content_inner::toJson()
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
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
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
RealtimeConversationItem_content_inner::getType()
{
	return type;
}

void
RealtimeConversationItem_content_inner::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeConversationItem_content_inner::getText()
{
	return text;
}

void
RealtimeConversationItem_content_inner::setText(std::string  text)
{
	this->text = text;
}

std::string
RealtimeConversationItem_content_inner::getId()
{
	return id;
}

void
RealtimeConversationItem_content_inner::setId(std::string  id)
{
	this->id = id;
}

std::string
RealtimeConversationItem_content_inner::getAudio()
{
	return audio;
}

void
RealtimeConversationItem_content_inner::setAudio(std::string  audio)
{
	this->audio = audio;
}

std::string
RealtimeConversationItem_content_inner::getTranscript()
{
	return transcript;
}

void
RealtimeConversationItem_content_inner::setTranscript(std::string  transcript)
{
	this->transcript = transcript;
}


