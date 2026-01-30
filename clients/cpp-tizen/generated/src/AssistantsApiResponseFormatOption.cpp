#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssistantsApiResponseFormatOption.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssistantsApiResponseFormatOption::AssistantsApiResponseFormatOption()
{
	//__init();
}

AssistantsApiResponseFormatOption::~AssistantsApiResponseFormatOption()
{
	//__cleanup();
}

void
AssistantsApiResponseFormatOption::__init()
{
	//type = std::string();
	//json_schema = new ResponseFormatJsonSchema_json_schema();
}

void
AssistantsApiResponseFormatOption::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(json_schema != NULL) {
	//
	//delete json_schema;
	//json_schema = NULL;
	//}
	//
}

void
AssistantsApiResponseFormatOption::fromJson(char* jsonStr)
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
	const gchar *json_schemaKey = "json_schema";
	node = json_object_get_member(pJsonObject, json_schemaKey);
	if (node !=NULL) {
	

		if (isprimitive("ResponseFormatJsonSchema_json_schema")) {
			jsonToValue(&json_schema, node, "ResponseFormatJsonSchema_json_schema", "ResponseFormatJsonSchema_json_schema");
		} else {
			
			ResponseFormatJsonSchema_json_schema* obj = static_cast<ResponseFormatJsonSchema_json_schema*> (&json_schema);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AssistantsApiResponseFormatOption::AssistantsApiResponseFormatOption(char* json)
{
	this->fromJson(json);
}

char*
AssistantsApiResponseFormatOption::toJson()
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
	if (isprimitive("ResponseFormatJsonSchema_json_schema")) {
		ResponseFormatJsonSchema_json_schema obj = getJsonSchema();
		node = converttoJson(&obj, "ResponseFormatJsonSchema_json_schema", "");
	}
	else {
		
		ResponseFormatJsonSchema_json_schema obj = static_cast<ResponseFormatJsonSchema_json_schema> (getJsonSchema());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *json_schemaKey = "json_schema";
	json_object_set_member(pJsonObject, json_schemaKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AssistantsApiResponseFormatOption::getType()
{
	return type;
}

void
AssistantsApiResponseFormatOption::setType(std::string  type)
{
	this->type = type;
}

ResponseFormatJsonSchema_json_schema
AssistantsApiResponseFormatOption::getJsonSchema()
{
	return json_schema;
}

void
AssistantsApiResponseFormatOption::setJsonSchema(ResponseFormatJsonSchema_json_schema  json_schema)
{
	this->json_schema = json_schema;
}


