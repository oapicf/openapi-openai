#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Embedding.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Embedding::Embedding()
{
	//__init();
}

Embedding::~Embedding()
{
	//__cleanup();
}

void
Embedding::__init()
{
	//index = int(0);
	//new std::list()std::list> embedding;
	//object = std::string();
}

void
Embedding::__cleanup()
{
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
	//if(embedding != NULL) {
	//embedding.RemoveAll(true);
	//delete embedding;
	//embedding = NULL;
	//}
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//
}

void
Embedding::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *indexKey = "index";
	node = json_object_get_member(pJsonObject, indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&index, node, "int", "");
		} else {
			
		}
	}
	const gchar *embeddingKey = "embedding";
	node = json_object_get_member(pJsonObject, embeddingKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<long long> new_list;
			long long inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("long long")) {
					jsonToValue(&inst, temp_json, "long long", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			embedding = new_list;
		}
		
	}
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
}

Embedding::Embedding(char* json)
{
	this->fromJson(json);
}

char*
Embedding::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *indexKey = "index";
	json_object_set_member(pJsonObject, indexKey, node);
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getEmbedding());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getEmbedding());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<long long>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			long long obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *embeddingKey = "embedding";
	json_object_set_member(pJsonObject, embeddingKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
Embedding::getIndex()
{
	return index;
}

void
Embedding::setIndex(int  index)
{
	this->index = index;
}

std::list<long long>
Embedding::getEmbedding()
{
	return embedding;
}

void
Embedding::setEmbedding(std::list <long long> embedding)
{
	this->embedding = embedding;
}

std::string
Embedding::getObject()
{
	return object;
}

void
Embedding::setObject(std::string  object)
{
	this->object = object;
}


