#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDetailsToolCallsFileSearchResultObject_content_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDetailsToolCallsFileSearchResultObject_content_inner::RunStepDetailsToolCallsFileSearchResultObject_content_inner()
{
	//__init();
}

RunStepDetailsToolCallsFileSearchResultObject_content_inner::~RunStepDetailsToolCallsFileSearchResultObject_content_inner()
{
	//__cleanup();
}

void
RunStepDetailsToolCallsFileSearchResultObject_content_inner::__init()
{
	//type = std::string();
	//text = std::string();
}

void
RunStepDetailsToolCallsFileSearchResultObject_content_inner::__cleanup()
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
RunStepDetailsToolCallsFileSearchResultObject_content_inner::fromJson(char* jsonStr)
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

RunStepDetailsToolCallsFileSearchResultObject_content_inner::RunStepDetailsToolCallsFileSearchResultObject_content_inner(char* json)
{
	this->fromJson(json);
}

char*
RunStepDetailsToolCallsFileSearchResultObject_content_inner::toJson()
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
RunStepDetailsToolCallsFileSearchResultObject_content_inner::getType()
{
	return type;
}

void
RunStepDetailsToolCallsFileSearchResultObject_content_inner::setType(std::string  type)
{
	this->type = type;
}

std::string
RunStepDetailsToolCallsFileSearchResultObject_content_inner::getText()
{
	return text;
}

void
RunStepDetailsToolCallsFileSearchResultObject_content_inner::setText(std::string  text)
{
	this->text = text;
}


