#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FunctionObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FunctionObject::FunctionObject()
{
	//__init();
}

FunctionObject::~FunctionObject()
{
	//__cleanup();
}

void
FunctionObject::__init()
{
	//description = std::string();
	//name = std::string();
	//new std::map()std::map> parameters;
	//strict = bool(false);
}

void
FunctionObject::__cleanup()
{
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(parameters != NULL) {
	//parameters.RemoveAll(true);
	//delete parameters;
	//parameters = NULL;
	//}
	//if(strict != NULL) {
	//
	//delete strict;
	//strict = NULL;
	//}
	//
}

void
FunctionObject::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
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
	const gchar *parametersKey = "parameters";
	node = json_object_get_member(pJsonObject, parametersKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			parameters = new_map;
		}
		
	}
	const gchar *strictKey = "strict";
	node = json_object_get_member(pJsonObject, strictKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&strict, node, "bool", "");
		} else {
			
		}
	}
}

FunctionObject::FunctionObject(char* json)
{
	this->fromJson(json);
}

char*
FunctionObject::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getParameters());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *parametersKey = "parameters";
	json_object_set_member(pJsonObject, parametersKey, node);
	if (isprimitive("bool")) {
		bool obj = getStrict();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *strictKey = "strict";
	json_object_set_member(pJsonObject, strictKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
FunctionObject::getDescription()
{
	return description;
}

void
FunctionObject::setDescription(std::string  description)
{
	this->description = description;
}

std::string
FunctionObject::getName()
{
	return name;
}

void
FunctionObject::setName(std::string  name)
{
	this->name = name;
}

std::map<string, string>
FunctionObject::getParameters()
{
	return parameters;
}

void
FunctionObject::setParameters(std::map <string, string> parameters)
{
	this->parameters = parameters;
}

bool
FunctionObject::getStrict()
{
	return strict;
}

void
FunctionObject::setStrict(bool  strict)
{
	this->strict = strict;
}


