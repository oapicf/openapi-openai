#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDetailsMessageCreationObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDetailsMessageCreationObject::RunStepDetailsMessageCreationObject()
{
	//__init();
}

RunStepDetailsMessageCreationObject::~RunStepDetailsMessageCreationObject()
{
	//__cleanup();
}

void
RunStepDetailsMessageCreationObject::__init()
{
	//type = std::string();
	//message_creation = new RunStepDetailsMessageCreationObject_message_creation();
}

void
RunStepDetailsMessageCreationObject::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(message_creation != NULL) {
	//
	//delete message_creation;
	//message_creation = NULL;
	//}
	//
}

void
RunStepDetailsMessageCreationObject::fromJson(char* jsonStr)
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
	const gchar *message_creationKey = "message_creation";
	node = json_object_get_member(pJsonObject, message_creationKey);
	if (node !=NULL) {
	

		if (isprimitive("RunStepDetailsMessageCreationObject_message_creation")) {
			jsonToValue(&message_creation, node, "RunStepDetailsMessageCreationObject_message_creation", "RunStepDetailsMessageCreationObject_message_creation");
		} else {
			
			RunStepDetailsMessageCreationObject_message_creation* obj = static_cast<RunStepDetailsMessageCreationObject_message_creation*> (&message_creation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunStepDetailsMessageCreationObject::RunStepDetailsMessageCreationObject(char* json)
{
	this->fromJson(json);
}

char*
RunStepDetailsMessageCreationObject::toJson()
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
	if (isprimitive("RunStepDetailsMessageCreationObject_message_creation")) {
		RunStepDetailsMessageCreationObject_message_creation obj = getMessageCreation();
		node = converttoJson(&obj, "RunStepDetailsMessageCreationObject_message_creation", "");
	}
	else {
		
		RunStepDetailsMessageCreationObject_message_creation obj = static_cast<RunStepDetailsMessageCreationObject_message_creation> (getMessageCreation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *message_creationKey = "message_creation";
	json_object_set_member(pJsonObject, message_creationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RunStepDetailsMessageCreationObject::getType()
{
	return type;
}

void
RunStepDetailsMessageCreationObject::setType(std::string  type)
{
	this->type = type;
}

RunStepDetailsMessageCreationObject_message_creation
RunStepDetailsMessageCreationObject::getMessageCreation()
{
	return message_creation;
}

void
RunStepDetailsMessageCreationObject::setMessageCreation(RunStepDetailsMessageCreationObject_message_creation  message_creation)
{
	this->message_creation = message_creation;
}


