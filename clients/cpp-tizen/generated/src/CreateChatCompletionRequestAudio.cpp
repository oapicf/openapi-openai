#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateChatCompletionRequest_audio.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateChatCompletionRequest_audio::CreateChatCompletionRequest_audio()
{
	//__init();
}

CreateChatCompletionRequest_audio::~CreateChatCompletionRequest_audio()
{
	//__cleanup();
}

void
CreateChatCompletionRequest_audio::__init()
{
	//voice = std::string();
	//format = std::string();
}

void
CreateChatCompletionRequest_audio::__cleanup()
{
	//if(voice != NULL) {
	//
	//delete voice;
	//voice = NULL;
	//}
	//if(format != NULL) {
	//
	//delete format;
	//format = NULL;
	//}
	//
}

void
CreateChatCompletionRequest_audio::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *voiceKey = "voice";
	node = json_object_get_member(pJsonObject, voiceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&voice, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *formatKey = "format";
	node = json_object_get_member(pJsonObject, formatKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&format, node, "std::string", "");
		} else {
			
		}
	}
}

CreateChatCompletionRequest_audio::CreateChatCompletionRequest_audio(char* json)
{
	this->fromJson(json);
}

char*
CreateChatCompletionRequest_audio::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getVoice();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *voiceKey = "voice";
	json_object_set_member(pJsonObject, voiceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFormat();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *formatKey = "format";
	json_object_set_member(pJsonObject, formatKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateChatCompletionRequest_audio::getVoice()
{
	return voice;
}

void
CreateChatCompletionRequest_audio::setVoice(std::string  voice)
{
	this->voice = voice;
}

std::string
CreateChatCompletionRequest_audio::getFormat()
{
	return format;
}

void
CreateChatCompletionRequest_audio::setFormat(std::string  format)
{
	this->format = format;
}


