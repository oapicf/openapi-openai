#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionRequestAssistantMessageContentPart.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionRequestAssistantMessageContentPart::ChatCompletionRequestAssistantMessageContentPart()
{
	//__init();
}

ChatCompletionRequestAssistantMessageContentPart::~ChatCompletionRequestAssistantMessageContentPart()
{
	//__cleanup();
}

void
ChatCompletionRequestAssistantMessageContentPart::__init()
{
	//type = std::string();
	//text = std::string();
	//refusal = std::string();
}

void
ChatCompletionRequestAssistantMessageContentPart::__cleanup()
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
	//if(refusal != NULL) {
	//
	//delete refusal;
	//refusal = NULL;
	//}
	//
}

void
ChatCompletionRequestAssistantMessageContentPart::fromJson(char* jsonStr)
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
	const gchar *refusalKey = "refusal";
	node = json_object_get_member(pJsonObject, refusalKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&refusal, node, "std::string", "");
		} else {
			
		}
	}
}

ChatCompletionRequestAssistantMessageContentPart::ChatCompletionRequestAssistantMessageContentPart(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionRequestAssistantMessageContentPart::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getRefusal();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *refusalKey = "refusal";
	json_object_set_member(pJsonObject, refusalKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ChatCompletionRequestAssistantMessageContentPart::getType()
{
	return type;
}

void
ChatCompletionRequestAssistantMessageContentPart::setType(std::string  type)
{
	this->type = type;
}

std::string
ChatCompletionRequestAssistantMessageContentPart::getText()
{
	return text;
}

void
ChatCompletionRequestAssistantMessageContentPart::setText(std::string  text)
{
	this->text = text;
}

std::string
ChatCompletionRequestAssistantMessageContentPart::getRefusal()
{
	return refusal;
}

void
ChatCompletionRequestAssistantMessageContentPart::setRefusal(std::string  refusal)
{
	this->refusal = refusal;
}


