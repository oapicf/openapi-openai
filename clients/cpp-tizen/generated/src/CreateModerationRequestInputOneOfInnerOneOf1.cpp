#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateModerationRequest_input_oneOf_inner_oneOf_1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateModerationRequest_input_oneOf_inner_oneOf_1::CreateModerationRequest_input_oneOf_inner_oneOf_1()
{
	//__init();
}

CreateModerationRequest_input_oneOf_inner_oneOf_1::~CreateModerationRequest_input_oneOf_inner_oneOf_1()
{
	//__cleanup();
}

void
CreateModerationRequest_input_oneOf_inner_oneOf_1::__init()
{
	//type = std::string();
	//text = std::string();
}

void
CreateModerationRequest_input_oneOf_inner_oneOf_1::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(text != NULL) {
	//
	//delete text;
	//text = NULL;
	//}
	//
}

void
CreateModerationRequest_input_oneOf_inner_oneOf_1::fromJson(char* jsonStr)
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
	const gchar *textKey = "text";
	node = json_object_get_member(pJsonObject, textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&text, node, "std::string", "");
		} else {
			
		}
	}
}

CreateModerationRequest_input_oneOf_inner_oneOf_1::CreateModerationRequest_input_oneOf_inner_oneOf_1(char* json)
{
	this->fromJson(json);
}

char*
CreateModerationRequest_input_oneOf_inner_oneOf_1::toJson()
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
		std::string obj = getText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *textKey = "text";
	json_object_set_member(pJsonObject, textKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateModerationRequest_input_oneOf_inner_oneOf_1::getType()
{
	return type;
}

void
CreateModerationRequest_input_oneOf_inner_oneOf_1::setType(std::string  type)
{
	this->type = type;
}

std::string
CreateModerationRequest_input_oneOf_inner_oneOf_1::getText()
{
	return text;
}

void
CreateModerationRequest_input_oneOf_inner_oneOf_1::setText(std::string  text)
{
	this->text = text;
}


