#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDeltaStepDetailsMessageCreationObject_message_creation.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDeltaStepDetailsMessageCreationObject_message_creation::RunStepDeltaStepDetailsMessageCreationObject_message_creation()
{
	//__init();
}

RunStepDeltaStepDetailsMessageCreationObject_message_creation::~RunStepDeltaStepDetailsMessageCreationObject_message_creation()
{
	//__cleanup();
}

void
RunStepDeltaStepDetailsMessageCreationObject_message_creation::__init()
{
	//message_id = std::string();
}

void
RunStepDeltaStepDetailsMessageCreationObject_message_creation::__cleanup()
{
	//if(message_id != NULL) {
	//
	//delete message_id;
	//message_id = NULL;
	//}
	//
}

void
RunStepDeltaStepDetailsMessageCreationObject_message_creation::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *message_idKey = "message_id";
	node = json_object_get_member(pJsonObject, message_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message_id, node, "std::string", "");
		} else {
			
		}
	}
}

RunStepDeltaStepDetailsMessageCreationObject_message_creation::RunStepDeltaStepDetailsMessageCreationObject_message_creation(char* json)
{
	this->fromJson(json);
}

char*
RunStepDeltaStepDetailsMessageCreationObject_message_creation::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getMessageId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *message_idKey = "message_id";
	json_object_set_member(pJsonObject, message_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RunStepDeltaStepDetailsMessageCreationObject_message_creation::getMessageId()
{
	return message_id;
}

void
RunStepDeltaStepDetailsMessageCreationObject_message_creation::setMessageId(std::string  message_id)
{
	this->message_id = message_id;
}


