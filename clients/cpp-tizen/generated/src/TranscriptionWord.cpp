#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TranscriptionWord.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TranscriptionWord::TranscriptionWord()
{
	//__init();
}

TranscriptionWord::~TranscriptionWord()
{
	//__cleanup();
}

void
TranscriptionWord::__init()
{
	//word = std::string();
	//start = float(0);
	//end = float(0);
}

void
TranscriptionWord::__cleanup()
{
	//if(word != NULL) {
	//
	//delete word;
	//word = NULL;
	//}
	//if(start != NULL) {
	//
	//delete start;
	//start = NULL;
	//}
	//if(end != NULL) {
	//
	//delete end;
	//end = NULL;
	//}
	//
}

void
TranscriptionWord::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *wordKey = "word";
	node = json_object_get_member(pJsonObject, wordKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&word, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *startKey = "start";
	node = json_object_get_member(pJsonObject, startKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&start, node, "float", "");
		} else {
			
		}
	}
	const gchar *endKey = "end";
	node = json_object_get_member(pJsonObject, endKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&end, node, "float", "");
		} else {
			
		}
	}
}

TranscriptionWord::TranscriptionWord(char* json)
{
	this->fromJson(json);
}

char*
TranscriptionWord::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getWord();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *wordKey = "word";
	json_object_set_member(pJsonObject, wordKey, node);
	if (isprimitive("float")) {
		float obj = getStart();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *startKey = "start";
	json_object_set_member(pJsonObject, startKey, node);
	if (isprimitive("float")) {
		float obj = getEnd();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *endKey = "end";
	json_object_set_member(pJsonObject, endKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TranscriptionWord::getWord()
{
	return word;
}

void
TranscriptionWord::setWord(std::string  word)
{
	this->word = word;
}

float
TranscriptionWord::getStart()
{
	return start;
}

void
TranscriptionWord::setStart(float  start)
{
	this->start = start;
}

float
TranscriptionWord::getEnd()
{
	return end;
}

void
TranscriptionWord::setEnd(float  end)
{
	this->end = end;
}


