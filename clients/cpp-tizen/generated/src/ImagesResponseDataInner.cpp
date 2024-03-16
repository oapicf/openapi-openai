#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ImagesResponse_data_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ImagesResponse_data_inner::ImagesResponse_data_inner()
{
	//__init();
}

ImagesResponse_data_inner::~ImagesResponse_data_inner()
{
	//__cleanup();
}

void
ImagesResponse_data_inner::__init()
{
	//url = std::string();
	//b64_json = std::string();
}

void
ImagesResponse_data_inner::__cleanup()
{
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//if(b64_json != NULL) {
	//
	//delete b64_json;
	//b64_json = NULL;
	//}
	//
}

void
ImagesResponse_data_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *b64_jsonKey = "b64_json";
	node = json_object_get_member(pJsonObject, b64_jsonKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&b64_json, node, "std::string", "");
		} else {
			
		}
	}
}

ImagesResponse_data_inner::ImagesResponse_data_inner(char* json)
{
	this->fromJson(json);
}

char*
ImagesResponse_data_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getB64Json();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *b64_jsonKey = "b64_json";
	json_object_set_member(pJsonObject, b64_jsonKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ImagesResponse_data_inner::getUrl()
{
	return url;
}

void
ImagesResponse_data_inner::setUrl(std::string  url)
{
	this->url = url;
}

std::string
ImagesResponse_data_inner::getB64Json()
{
	return b64_json;
}

void
ImagesResponse_data_inner::setB64Json(std::string  b64_json)
{
	this->b64_json = b64_json;
}


