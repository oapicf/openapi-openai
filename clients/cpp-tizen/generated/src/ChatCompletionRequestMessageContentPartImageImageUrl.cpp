#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionRequestMessageContentPartImage_image_url.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionRequestMessageContentPartImage_image_url::ChatCompletionRequestMessageContentPartImage_image_url()
{
	//__init();
}

ChatCompletionRequestMessageContentPartImage_image_url::~ChatCompletionRequestMessageContentPartImage_image_url()
{
	//__cleanup();
}

void
ChatCompletionRequestMessageContentPartImage_image_url::__init()
{
	//url = std::string();
	//detail = std::string();
}

void
ChatCompletionRequestMessageContentPartImage_image_url::__cleanup()
{
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//if(detail != NULL) {
	//
	//delete detail;
	//detail = NULL;
	//}
	//
}

void
ChatCompletionRequestMessageContentPartImage_image_url::fromJson(char* jsonStr)
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
	const gchar *detailKey = "detail";
	node = json_object_get_member(pJsonObject, detailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&detail, node, "std::string", "");
		} else {
			
		}
	}
}

ChatCompletionRequestMessageContentPartImage_image_url::ChatCompletionRequestMessageContentPartImage_image_url(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionRequestMessageContentPartImage_image_url::toJson()
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
		std::string obj = getDetail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *detailKey = "detail";
	json_object_set_member(pJsonObject, detailKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ChatCompletionRequestMessageContentPartImage_image_url::getUrl()
{
	return url;
}

void
ChatCompletionRequestMessageContentPartImage_image_url::setUrl(std::string  url)
{
	this->url = url;
}

std::string
ChatCompletionRequestMessageContentPartImage_image_url::getDetail()
{
	return detail;
}

void
ChatCompletionRequestMessageContentPartImage_image_url::setDetail(std::string  detail)
{
	this->detail = detail;
}


