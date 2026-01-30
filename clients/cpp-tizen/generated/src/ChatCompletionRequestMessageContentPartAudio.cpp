#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionRequestMessageContentPartAudio.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionRequestMessageContentPartAudio::ChatCompletionRequestMessageContentPartAudio()
{
	//__init();
}

ChatCompletionRequestMessageContentPartAudio::~ChatCompletionRequestMessageContentPartAudio()
{
	//__cleanup();
}

void
ChatCompletionRequestMessageContentPartAudio::__init()
{
	//type = std::string();
	//input_audio = new ChatCompletionRequestMessageContentPartAudio_input_audio();
}

void
ChatCompletionRequestMessageContentPartAudio::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(input_audio != NULL) {
	//
	//delete input_audio;
	//input_audio = NULL;
	//}
	//
}

void
ChatCompletionRequestMessageContentPartAudio::fromJson(char* jsonStr)
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
	const gchar *input_audioKey = "input_audio";
	node = json_object_get_member(pJsonObject, input_audioKey);
	if (node !=NULL) {
	

		if (isprimitive("ChatCompletionRequestMessageContentPartAudio_input_audio")) {
			jsonToValue(&input_audio, node, "ChatCompletionRequestMessageContentPartAudio_input_audio", "ChatCompletionRequestMessageContentPartAudio_input_audio");
		} else {
			
			ChatCompletionRequestMessageContentPartAudio_input_audio* obj = static_cast<ChatCompletionRequestMessageContentPartAudio_input_audio*> (&input_audio);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ChatCompletionRequestMessageContentPartAudio::ChatCompletionRequestMessageContentPartAudio(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionRequestMessageContentPartAudio::toJson()
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
	if (isprimitive("ChatCompletionRequestMessageContentPartAudio_input_audio")) {
		ChatCompletionRequestMessageContentPartAudio_input_audio obj = getInputAudio();
		node = converttoJson(&obj, "ChatCompletionRequestMessageContentPartAudio_input_audio", "");
	}
	else {
		
		ChatCompletionRequestMessageContentPartAudio_input_audio obj = static_cast<ChatCompletionRequestMessageContentPartAudio_input_audio> (getInputAudio());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *input_audioKey = "input_audio";
	json_object_set_member(pJsonObject, input_audioKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ChatCompletionRequestMessageContentPartAudio::getType()
{
	return type;
}

void
ChatCompletionRequestMessageContentPartAudio::setType(std::string  type)
{
	this->type = type;
}

ChatCompletionRequestMessageContentPartAudio_input_audio
ChatCompletionRequestMessageContentPartAudio::getInputAudio()
{
	return input_audio;
}

void
ChatCompletionRequestMessageContentPartAudio::setInputAudio(ChatCompletionRequestMessageContentPartAudio_input_audio  input_audio)
{
	this->input_audio = input_audio;
}


