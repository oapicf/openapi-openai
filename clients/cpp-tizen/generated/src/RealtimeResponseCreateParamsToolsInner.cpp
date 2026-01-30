#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeResponseCreateParams_tools_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeResponseCreateParams_tools_inner::RealtimeResponseCreateParams_tools_inner()
{
	//__init();
}

RealtimeResponseCreateParams_tools_inner::~RealtimeResponseCreateParams_tools_inner()
{
	//__cleanup();
}

void
RealtimeResponseCreateParams_tools_inner::__init()
{
	//type = std::string();
	//name = std::string();
	//description = std::string();
	//parameters = null;
}

void
RealtimeResponseCreateParams_tools_inner::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(parameters != NULL) {
	//
	//delete parameters;
	//parameters = NULL;
	//}
	//
}

void
RealtimeResponseCreateParams_tools_inner::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *parametersKey = "parameters";
	node = json_object_get_member(pJsonObject, parametersKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&parameters, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&parameters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RealtimeResponseCreateParams_tools_inner::RealtimeResponseCreateParams_tools_inner(char* json)
{
	this->fromJson(json);
}

char*
RealtimeResponseCreateParams_tools_inner::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getParameters();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getParameters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *parametersKey = "parameters";
	json_object_set_member(pJsonObject, parametersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeResponseCreateParams_tools_inner::getType()
{
	return type;
}

void
RealtimeResponseCreateParams_tools_inner::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeResponseCreateParams_tools_inner::getName()
{
	return name;
}

void
RealtimeResponseCreateParams_tools_inner::setName(std::string  name)
{
	this->name = name;
}

std::string
RealtimeResponseCreateParams_tools_inner::getDescription()
{
	return description;
}

void
RealtimeResponseCreateParams_tools_inner::setDescription(std::string  description)
{
	this->description = description;
}

std::string
RealtimeResponseCreateParams_tools_inner::getParameters()
{
	return parameters;
}

void
RealtimeResponseCreateParams_tools_inner::setParameters(std::string  parameters)
{
	this->parameters = parameters;
}


