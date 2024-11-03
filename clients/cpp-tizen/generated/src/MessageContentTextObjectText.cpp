#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageContentTextObject_text.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageContentTextObject_text::MessageContentTextObject_text()
{
	//__init();
}

MessageContentTextObject_text::~MessageContentTextObject_text()
{
	//__cleanup();
}

void
MessageContentTextObject_text::__init()
{
	//value = std::string();
	//new std::list()std::list> annotations;
}

void
MessageContentTextObject_text::__cleanup()
{
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(annotations != NULL) {
	//annotations.RemoveAll(true);
	//delete annotations;
	//annotations = NULL;
	//}
	//
}

void
MessageContentTextObject_text::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *annotationsKey = "annotations";
	node = json_object_get_member(pJsonObject, annotationsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MessageContentTextObject_text_annotations_inner> new_list;
			MessageContentTextObject_text_annotations_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MessageContentTextObject_text_annotations_inner")) {
					jsonToValue(&inst, temp_json, "MessageContentTextObject_text_annotations_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			annotations = new_list;
		}
		
	}
}

MessageContentTextObject_text::MessageContentTextObject_text(char* json)
{
	this->fromJson(json);
}

char*
MessageContentTextObject_text::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	if (isprimitive("MessageContentTextObject_text_annotations_inner")) {
		list<MessageContentTextObject_text_annotations_inner> new_list = static_cast<list <MessageContentTextObject_text_annotations_inner> > (getAnnotations());
		node = converttoJson(&new_list, "MessageContentTextObject_text_annotations_inner", "array");
	} else {
		node = json_node_alloc();
		list<MessageContentTextObject_text_annotations_inner> new_list = static_cast<list <MessageContentTextObject_text_annotations_inner> > (getAnnotations());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MessageContentTextObject_text_annotations_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MessageContentTextObject_text_annotations_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *annotationsKey = "annotations";
	json_object_set_member(pJsonObject, annotationsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MessageContentTextObject_text::getValue()
{
	return value;
}

void
MessageContentTextObject_text::setValue(std::string  value)
{
	this->value = value;
}

std::list<MessageContentTextObject_text_annotations_inner>
MessageContentTextObject_text::getAnnotations()
{
	return annotations;
}

void
MessageContentTextObject_text::setAnnotations(std::list <MessageContentTextObject_text_annotations_inner> annotations)
{
	this->annotations = annotations;
}


