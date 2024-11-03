#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateTranslation_200_response.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateTranslation_200_response::CreateTranslation_200_response()
{
	//__init();
}

CreateTranslation_200_response::~CreateTranslation_200_response()
{
	//__cleanup();
}

void
CreateTranslation_200_response::__init()
{
	//text = std::string();
	//language = std::string();
	//duration = std::string();
	//new std::list()std::list> segments;
}

void
CreateTranslation_200_response::__cleanup()
{
	//if(text != NULL) {
	//
	//delete text;
	//text = NULL;
	//}
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//if(duration != NULL) {
	//
	//delete duration;
	//duration = NULL;
	//}
	//if(segments != NULL) {
	//segments.RemoveAll(true);
	//delete segments;
	//segments = NULL;
	//}
	//
}

void
CreateTranslation_200_response::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *textKey = "text";
	node = json_object_get_member(pJsonObject, textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&text, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *languageKey = "language";
	node = json_object_get_member(pJsonObject, languageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&language, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *durationKey = "duration";
	node = json_object_get_member(pJsonObject, durationKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&duration, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *segmentsKey = "segments";
	node = json_object_get_member(pJsonObject, segmentsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TranscriptionSegment> new_list;
			TranscriptionSegment inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TranscriptionSegment")) {
					jsonToValue(&inst, temp_json, "TranscriptionSegment", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			segments = new_list;
		}
		
	}
}

CreateTranslation_200_response::CreateTranslation_200_response(char* json)
{
	this->fromJson(json);
}

char*
CreateTranslation_200_response::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *textKey = "text";
	json_object_set_member(pJsonObject, textKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLanguage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *languageKey = "language";
	json_object_set_member(pJsonObject, languageKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDuration();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *durationKey = "duration";
	json_object_set_member(pJsonObject, durationKey, node);
	if (isprimitive("TranscriptionSegment")) {
		list<TranscriptionSegment> new_list = static_cast<list <TranscriptionSegment> > (getSegments());
		node = converttoJson(&new_list, "TranscriptionSegment", "array");
	} else {
		node = json_node_alloc();
		list<TranscriptionSegment> new_list = static_cast<list <TranscriptionSegment> > (getSegments());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TranscriptionSegment>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TranscriptionSegment obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *segmentsKey = "segments";
	json_object_set_member(pJsonObject, segmentsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateTranslation_200_response::getText()
{
	return text;
}

void
CreateTranslation_200_response::setText(std::string  text)
{
	this->text = text;
}

std::string
CreateTranslation_200_response::getLanguage()
{
	return language;
}

void
CreateTranslation_200_response::setLanguage(std::string  language)
{
	this->language = language;
}

std::string
CreateTranslation_200_response::getDuration()
{
	return duration;
}

void
CreateTranslation_200_response::setDuration(std::string  duration)
{
	this->duration = duration;
}

std::list<TranscriptionSegment>
CreateTranslation_200_response::getSegments()
{
	return segments;
}

void
CreateTranslation_200_response::setSegments(std::list <TranscriptionSegment> segments)
{
	this->segments = segments;
}


