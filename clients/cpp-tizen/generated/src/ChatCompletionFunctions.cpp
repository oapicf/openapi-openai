#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionFunctions.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionFunctions::ChatCompletionFunctions()
{
	//__init();
}

ChatCompletionFunctions::~ChatCompletionFunctions()
{
	//__cleanup();
}

void
ChatCompletionFunctions::__init()
{
	//name = std::string();
	//description = std::string();
	//new std::map()std::map> parameters;
}

void
ChatCompletionFunctions::__cleanup()
{
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
	//parameters.RemoveAll(true);
	//delete parameters;
	//parameters = NULL;
	//}
	//
}

void
ChatCompletionFunctions::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			parameters = new_map;
		}
		
	}
}

ChatCompletionFunctions::ChatCompletionFunctions(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionFunctions::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ChatCompletionFunctions::getName()
{
	return name;
}

void
ChatCompletionFunctions::setName(std::string  name)
{
	this->name = name;
}

std::string
ChatCompletionFunctions::getDescription()
{
	return description;
}

void
ChatCompletionFunctions::setDescription(std::string  description)
{
	this->description = description;
}

std::map<string, string>
ChatCompletionFunctions::getParameters()
{
	return parameters;
}

void
ChatCompletionFunctions::setParameters(std::map <string, string> parameters)
{
	this->parameters = parameters;
}


