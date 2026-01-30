#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ResponseFormatText.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ResponseFormatText::ResponseFormatText()
{
	//__init();
}

ResponseFormatText::~ResponseFormatText()
{
	//__cleanup();
}

void
ResponseFormatText::__init()
{
	//type = std::string();
}

void
ResponseFormatText::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
ResponseFormatText::fromJson(char* jsonStr)
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
}

ResponseFormatText::ResponseFormatText(char* json)
{
	this->fromJson(json);
}

char*
ResponseFormatText::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ResponseFormatText::getType()
{
	return type;
}

void
ResponseFormatText::setType(std::string  type)
{
	this->type = type;
}


