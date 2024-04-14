#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionRequestMessageContentPartText.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionRequestMessageContentPartText::ChatCompletionRequestMessageContentPartText()
{
	//__init();
}

ChatCompletionRequestMessageContentPartText::~ChatCompletionRequestMessageContentPartText()
{
	//__cleanup();
}

void
ChatCompletionRequestMessageContentPartText::__init()
{
	//type = std::string();
	//text = std::string();
}

void
ChatCompletionRequestMessageContentPartText::__cleanup()
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
ChatCompletionRequestMessageContentPartText::fromJson(char* jsonStr)
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

ChatCompletionRequestMessageContentPartText::ChatCompletionRequestMessageContentPartText(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionRequestMessageContentPartText::toJson()
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
ChatCompletionRequestMessageContentPartText::getType()
{
	return type;
}

void
ChatCompletionRequestMessageContentPartText::setType(std::string  type)
{
	this->type = type;
}

std::string
ChatCompletionRequestMessageContentPartText::getText()
{
	return text;
}

void
ChatCompletionRequestMessageContentPartText::setText(std::string  text)
{
	this->text = text;
}


