#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionResponseMessage_audio.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionResponseMessage_audio::ChatCompletionResponseMessage_audio()
{
	//__init();
}

ChatCompletionResponseMessage_audio::~ChatCompletionResponseMessage_audio()
{
	//__cleanup();
}

void
ChatCompletionResponseMessage_audio::__init()
{
	//id = std::string();
	//expires_at = int(0);
	//data = std::string();
	//transcript = std::string();
}

void
ChatCompletionResponseMessage_audio::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(expires_at != NULL) {
	//
	//delete expires_at;
	//expires_at = NULL;
	//}
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//if(transcript != NULL) {
	//
	//delete transcript;
	//transcript = NULL;
	//}
	//
}

void
ChatCompletionResponseMessage_audio::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *expires_atKey = "expires_at";
	node = json_object_get_member(pJsonObject, expires_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&expires_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&data, node, "std::string", "");
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

ChatCompletionResponseMessage_audio::ChatCompletionResponseMessage_audio(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionResponseMessage_audio::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("int")) {
		int obj = getExpiresAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *expires_atKey = "expires_at";
	json_object_set_member(pJsonObject, expires_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getData();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
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
ChatCompletionResponseMessage_audio::getId()
{
	return id;
}

void
ChatCompletionResponseMessage_audio::setId(std::string  id)
{
	this->id = id;
}

int
ChatCompletionResponseMessage_audio::getExpiresAt()
{
	return expires_at;
}

void
ChatCompletionResponseMessage_audio::setExpiresAt(int  expires_at)
{
	this->expires_at = expires_at;
}

std::string
ChatCompletionResponseMessage_audio::getData()
{
	return data;
}

void
ChatCompletionResponseMessage_audio::setData(std::string  data)
{
	this->data = data;
}

std::string
ChatCompletionResponseMessage_audio::getTranscript()
{
	return transcript;
}

void
ChatCompletionResponseMessage_audio::setTranscript(std::string  transcript)
{
	this->transcript = transcript;
}


