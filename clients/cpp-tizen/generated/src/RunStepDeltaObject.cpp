#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDeltaObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDeltaObject::RunStepDeltaObject()
{
	//__init();
}

RunStepDeltaObject::~RunStepDeltaObject()
{
	//__cleanup();
}

void
RunStepDeltaObject::__init()
{
	//id = std::string();
	//object = std::string();
	//delta = new RunStepDeltaObject_delta();
}

void
RunStepDeltaObject::__cleanup()
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
RunStepDeltaObject::fromJson(char* jsonStr)
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
	

		if (isprimitive("RunStepDeltaObject_delta")) {
			jsonToValue(&delta, node, "RunStepDeltaObject_delta", "RunStepDeltaObject_delta");
		} else {
			
			RunStepDeltaObject_delta* obj = static_cast<RunStepDeltaObject_delta*> (&delta);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunStepDeltaObject::RunStepDeltaObject(char* json)
{
	this->fromJson(json);
}

char*
RunStepDeltaObject::toJson()
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
	if (isprimitive("RunStepDeltaObject_delta")) {
		RunStepDeltaObject_delta obj = getDelta();
		node = converttoJson(&obj, "RunStepDeltaObject_delta", "");
	}
	else {
		
		RunStepDeltaObject_delta obj = static_cast<RunStepDeltaObject_delta> (getDelta());
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
RunStepDeltaObject::getId()
{
	return id;
}

void
RunStepDeltaObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDeltaObject::getObject()
{
	return object;
}

void
RunStepDeltaObject::setObject(std::string  object)
{
	this->object = object;
}

RunStepDeltaObject_delta
RunStepDeltaObject::getDelta()
{
	return delta;
}

void
RunStepDeltaObject::setDelta(RunStepDeltaObject_delta  delta)
{
	this->delta = delta;
}


