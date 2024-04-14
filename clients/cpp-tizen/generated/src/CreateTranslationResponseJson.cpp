#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateTranslationResponseJson.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateTranslationResponseJson::CreateTranslationResponseJson()
{
	//__init();
}

CreateTranslationResponseJson::~CreateTranslationResponseJson()
{
	//__cleanup();
}

void
CreateTranslationResponseJson::__init()
{
	//text = std::string();
}

void
CreateTranslationResponseJson::__cleanup()
{
	//if(text != NULL) {
	//
	//delete text;
	//text = NULL;
	//}
	//
}

void
CreateTranslationResponseJson::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *textKey = "text";
	node = json_object_get_member(pJsonObject, textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&text, node, "std::string", "");
		} else {
			
		}
	}
}

CreateTranslationResponseJson::CreateTranslationResponseJson(char* json)
{
	this->fromJson(json);
}

char*
CreateTranslationResponseJson::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
CreateTranslationResponseJson::getText()
{
	return text;
}

void
CreateTranslationResponseJson::setText(std::string  text)
{
	this->text = text;
}


