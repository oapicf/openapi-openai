#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionRequestMessageContentPartAudio_input_audio.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionRequestMessageContentPartAudio_input_audio::ChatCompletionRequestMessageContentPartAudio_input_audio()
{
	//__init();
}

ChatCompletionRequestMessageContentPartAudio_input_audio::~ChatCompletionRequestMessageContentPartAudio_input_audio()
{
	//__cleanup();
}

void
ChatCompletionRequestMessageContentPartAudio_input_audio::__init()
{
	//data = std::string();
	//format = std::string();
}

void
ChatCompletionRequestMessageContentPartAudio_input_audio::__cleanup()
{
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//if(format != NULL) {
	//
	//delete format;
	//format = NULL;
	//}
	//
}

void
ChatCompletionRequestMessageContentPartAudio_input_audio::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&data, node, "std::string", "");
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

ChatCompletionRequestMessageContentPartAudio_input_audio::ChatCompletionRequestMessageContentPartAudio_input_audio(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionRequestMessageContentPartAudio_input_audio::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getData();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
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
ChatCompletionRequestMessageContentPartAudio_input_audio::getData()
{
	return data;
}

void
ChatCompletionRequestMessageContentPartAudio_input_audio::setData(std::string  data)
{
	this->data = data;
}

std::string
ChatCompletionRequestMessageContentPartAudio_input_audio::getFormat()
{
	return format;
}

void
ChatCompletionRequestMessageContentPartAudio_input_audio::setFormat(std::string  format)
{
	this->format = format;
}


