#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageDeltaObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageDeltaObject::MessageDeltaObject()
{
	//__init();
}

MessageDeltaObject::~MessageDeltaObject()
{
	//__cleanup();
}

void
MessageDeltaObject::__init()
{
	//id = std::string();
	//object = std::string();
	//delta = new MessageDeltaObject_delta();
}

void
MessageDeltaObject::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(delta != NULL) {
	//
	//delete delta;
	//delta = NULL;
	//}
	//
}

void
MessageDeltaObject::fromJson(char* jsonStr)
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
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *deltaKey = "delta";
	node = json_object_get_member(pJsonObject, deltaKey);
	if (node !=NULL) {
	

		if (isprimitive("MessageDeltaObject_delta")) {
			jsonToValue(&delta, node, "MessageDeltaObject_delta", "MessageDeltaObject_delta");
		} else {
			
			MessageDeltaObject_delta* obj = static_cast<MessageDeltaObject_delta*> (&delta);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MessageDeltaObject::MessageDeltaObject(char* json)
{
	this->fromJson(json);
}

char*
MessageDeltaObject::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	if (isprimitive("MessageDeltaObject_delta")) {
		MessageDeltaObject_delta obj = getDelta();
		node = converttoJson(&obj, "MessageDeltaObject_delta", "");
	}
	else {
		
		MessageDeltaObject_delta obj = static_cast<MessageDeltaObject_delta> (getDelta());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deltaKey = "delta";
	json_object_set_member(pJsonObject, deltaKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MessageDeltaObject::getId()
{
	return id;
}

void
MessageDeltaObject::setId(std::string  id)
{
	this->id = id;
}

std::string
MessageDeltaObject::getObject()
{
	return object;
}

void
MessageDeltaObject::setObject(std::string  object)
{
	this->object = object;
}

MessageDeltaObject_delta
MessageDeltaObject::getDelta()
{
	return delta;
}

void
MessageDeltaObject::setDelta(MessageDeltaObject_delta  delta)
{
	this->delta = delta;
}


