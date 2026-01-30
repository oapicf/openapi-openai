#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateMessageRequest_attachments_inner_tools_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateMessageRequest_attachments_inner_tools_inner::CreateMessageRequest_attachments_inner_tools_inner()
{
	//__init();
}

CreateMessageRequest_attachments_inner_tools_inner::~CreateMessageRequest_attachments_inner_tools_inner()
{
	//__cleanup();
}

void
CreateMessageRequest_attachments_inner_tools_inner::__init()
{
	//type = std::string();
}

void
CreateMessageRequest_attachments_inner_tools_inner::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
CreateMessageRequest_attachments_inner_tools_inner::fromJson(char* jsonStr)
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

CreateMessageRequest_attachments_inner_tools_inner::CreateMessageRequest_attachments_inner_tools_inner(char* json)
{
	this->fromJson(json);
}

char*
CreateMessageRequest_attachments_inner_tools_inner::toJson()
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
CreateMessageRequest_attachments_inner_tools_inner::getType()
{
	return type;
}

void
CreateMessageRequest_attachments_inner_tools_inner::setType(std::string  type)
{
	this->type = type;
}


