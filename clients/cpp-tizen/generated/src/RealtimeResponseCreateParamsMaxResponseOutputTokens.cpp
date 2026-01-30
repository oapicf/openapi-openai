#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeResponseCreateParams_max_response_output_tokens.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeResponseCreateParams_max_response_output_tokens::RealtimeResponseCreateParams_max_response_output_tokens()
{
	//__init();
}

RealtimeResponseCreateParams_max_response_output_tokens::~RealtimeResponseCreateParams_max_response_output_tokens()
{
	//__cleanup();
}

void
RealtimeResponseCreateParams_max_response_output_tokens::__init()
{
}

void
RealtimeResponseCreateParams_max_response_output_tokens::__cleanup()
{
	//
}

void
RealtimeResponseCreateParams_max_response_output_tokens::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

RealtimeResponseCreateParams_max_response_output_tokens::RealtimeResponseCreateParams_max_response_output_tokens(char* json)
{
	this->fromJson(json);
}

char*
RealtimeResponseCreateParams_max_response_output_tokens::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}


