#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionMessageToolCallChunk.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionMessageToolCallChunk::ChatCompletionMessageToolCallChunk()
{
	//__init();
}

ChatCompletionMessageToolCallChunk::~ChatCompletionMessageToolCallChunk()
{
	//__cleanup();
}

void
ChatCompletionMessageToolCallChunk::__init()
{
	//index = int(0);
	//id = std::string();
	//type = std::string();
	//function = new ChatCompletionMessageToolCallChunk_function();
}

void
ChatCompletionMessageToolCallChunk::__cleanup()
{
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(function != NULL) {
	//
	//delete function;
	//function = NULL;
	//}
	//
}

void
ChatCompletionMessageToolCallChunk::fromJson(char* jsonStr)
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *functionKey = "function";
	node = json_object_get_member(pJsonObject, functionKey);
	if (node !=NULL) {
	

		if (isprimitive("ChatCompletionMessageToolCallChunk_function")) {
			jsonToValue(&function, node, "ChatCompletionMessageToolCallChunk_function", "ChatCompletionMessageToolCallChunk_function");
		} else {
			
			ChatCompletionMessageToolCallChunk_function* obj = static_cast<ChatCompletionMessageToolCallChunk_function*> (&function);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ChatCompletionMessageToolCallChunk::ChatCompletionMessageToolCallChunk(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionMessageToolCallChunk::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("ChatCompletionMessageToolCallChunk_function")) {
		ChatCompletionMessageToolCallChunk_function obj = getFunction();
		node = converttoJson(&obj, "ChatCompletionMessageToolCallChunk_function", "");
	}
	else {
		
		ChatCompletionMessageToolCallChunk_function obj = static_cast<ChatCompletionMessageToolCallChunk_function> (getFunction());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *functionKey = "function";
	json_object_set_member(pJsonObject, functionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
ChatCompletionMessageToolCallChunk::getIndex()
{
	return index;
}

void
ChatCompletionMessageToolCallChunk::setIndex(int  index)
{
	this->index = index;
}

std::string
ChatCompletionMessageToolCallChunk::getId()
{
	return id;
}

void
ChatCompletionMessageToolCallChunk::setId(std::string  id)
{
	this->id = id;
}

std::string
ChatCompletionMessageToolCallChunk::getType()
{
	return type;
}

void
ChatCompletionMessageToolCallChunk::setType(std::string  type)
{
	this->type = type;
}

ChatCompletionMessageToolCallChunk_function
ChatCompletionMessageToolCallChunk::getFunction()
{
	return function;
}

void
ChatCompletionMessageToolCallChunk::setFunction(ChatCompletionMessageToolCallChunk_function  function)
{
	this->function = function;
}


