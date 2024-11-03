#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDetailsToolCallsFunctionObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDetailsToolCallsFunctionObject::RunStepDetailsToolCallsFunctionObject()
{
	//__init();
}

RunStepDetailsToolCallsFunctionObject::~RunStepDetailsToolCallsFunctionObject()
{
	//__cleanup();
}

void
RunStepDetailsToolCallsFunctionObject::__init()
{
	//id = std::string();
	//type = std::string();
	//function = new RunStepDetailsToolCallsFunctionObject_function();
}

void
RunStepDetailsToolCallsFunctionObject::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(function != NULL) {
	//
	//delete function;
	//function = NULL;
	//}
	//
}

void
RunStepDetailsToolCallsFunctionObject::fromJson(char* jsonStr)
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
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *functionKey = "function";
	node = json_object_get_member(pJsonObject, functionKey);
	if (node !=NULL) {
	

		if (isprimitive("RunStepDetailsToolCallsFunctionObject_function")) {
			jsonToValue(&function, node, "RunStepDetailsToolCallsFunctionObject_function", "RunStepDetailsToolCallsFunctionObject_function");
		} else {
			
			RunStepDetailsToolCallsFunctionObject_function* obj = static_cast<RunStepDetailsToolCallsFunctionObject_function*> (&function);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunStepDetailsToolCallsFunctionObject::RunStepDetailsToolCallsFunctionObject(char* json)
{
	this->fromJson(json);
}

char*
RunStepDetailsToolCallsFunctionObject::toJson()
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
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("RunStepDetailsToolCallsFunctionObject_function")) {
		RunStepDetailsToolCallsFunctionObject_function obj = getFunction();
		node = converttoJson(&obj, "RunStepDetailsToolCallsFunctionObject_function", "");
	}
	else {
		
		RunStepDetailsToolCallsFunctionObject_function obj = static_cast<RunStepDetailsToolCallsFunctionObject_function> (getFunction());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *functionKey = "function";
	json_object_set_member(pJsonObject, functionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RunStepDetailsToolCallsFunctionObject::getId()
{
	return id;
}

void
RunStepDetailsToolCallsFunctionObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepDetailsToolCallsFunctionObject::getType()
{
	return type;
}

void
RunStepDetailsToolCallsFunctionObject::setType(std::string  type)
{
	this->type = type;
}

RunStepDetailsToolCallsFunctionObject_function
RunStepDetailsToolCallsFunctionObject::getFunction()
{
	return function;
}

void
RunStepDetailsToolCallsFunctionObject::setFunction(RunStepDetailsToolCallsFunctionObject_function  function)
{
	this->function = function;
}


