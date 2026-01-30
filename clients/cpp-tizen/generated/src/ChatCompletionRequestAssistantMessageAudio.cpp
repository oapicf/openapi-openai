#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionRequestAssistantMessage_audio.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionRequestAssistantMessage_audio::ChatCompletionRequestAssistantMessage_audio()
{
	//__init();
}

ChatCompletionRequestAssistantMessage_audio::~ChatCompletionRequestAssistantMessage_audio()
{
	//__cleanup();
}

void
ChatCompletionRequestAssistantMessage_audio::__init()
{
	//id = std::string();
}

void
ChatCompletionRequestAssistantMessage_audio::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
ChatCompletionRequestAssistantMessage_audio::fromJson(char* jsonStr)
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
}

ChatCompletionRequestAssistantMessage_audio::ChatCompletionRequestAssistantMessage_audio(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionRequestAssistantMessage_audio::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ChatCompletionRequestAssistantMessage_audio::getId()
{
	return id;
}

void
ChatCompletionRequestAssistantMessage_audio::setId(std::string  id)
{
	this->id = id;
}


