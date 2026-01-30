#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateModerationResponse_results_inner_category_applied_input_types.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateModerationResponse_results_inner_category_applied_input_types::CreateModerationResponse_results_inner_category_applied_input_types()
{
	//__init();
}

CreateModerationResponse_results_inner_category_applied_input_types::~CreateModerationResponse_results_inner_category_applied_input_types()
{
	//__cleanup();
}

void
CreateModerationResponse_results_inner_category_applied_input_types::__init()
{
	//new std::list()std::list> hate;
	//new std::list()std::list> hatethreatening;
	//new std::list()std::list> harassment;
	//new std::list()std::list> harassmentthreatening;
	//new std::list()std::list> illicit;
	//new std::list()std::list> illicitviolent;
	//new std::list()std::list> selfharm;
	//new std::list()std::list> selfharmintent;
	//new std::list()std::list> selfharminstructions;
	//new std::list()std::list> sexual;
	//new std::list()std::list> sexualminors;
	//new std::list()std::list> violence;
	//new std::list()std::list> violencegraphic;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::__cleanup()
{
	//if(hate != NULL) {
	//hate.RemoveAll(true);
	//delete hate;
	//hate = NULL;
	//}
	//if(hatethreatening != NULL) {
	//hatethreatening.RemoveAll(true);
	//delete hatethreatening;
	//hatethreatening = NULL;
	//}
	//if(harassment != NULL) {
	//harassment.RemoveAll(true);
	//delete harassment;
	//harassment = NULL;
	//}
	//if(harassmentthreatening != NULL) {
	//harassmentthreatening.RemoveAll(true);
	//delete harassmentthreatening;
	//harassmentthreatening = NULL;
	//}
	//if(illicit != NULL) {
	//illicit.RemoveAll(true);
	//delete illicit;
	//illicit = NULL;
	//}
	//if(illicitviolent != NULL) {
	//illicitviolent.RemoveAll(true);
	//delete illicitviolent;
	//illicitviolent = NULL;
	//}
	//if(selfharm != NULL) {
	//selfharm.RemoveAll(true);
	//delete selfharm;
	//selfharm = NULL;
	//}
	//if(selfharmintent != NULL) {
	//selfharmintent.RemoveAll(true);
	//delete selfharmintent;
	//selfharmintent = NULL;
	//}
	//if(selfharminstructions != NULL) {
	//selfharminstructions.RemoveAll(true);
	//delete selfharminstructions;
	//selfharminstructions = NULL;
	//}
	//if(sexual != NULL) {
	//sexual.RemoveAll(true);
	//delete sexual;
	//sexual = NULL;
	//}
	//if(sexualminors != NULL) {
	//sexualminors.RemoveAll(true);
	//delete sexualminors;
	//sexualminors = NULL;
	//}
	//if(violence != NULL) {
	//violence.RemoveAll(true);
	//delete violence;
	//violence = NULL;
	//}
	//if(violencegraphic != NULL) {
	//violencegraphic.RemoveAll(true);
	//delete violencegraphic;
	//violencegraphic = NULL;
	//}
	//
}

void
CreateModerationResponse_results_inner_category_applied_input_types::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hateKey = "hate";
	node = json_object_get_member(pJsonObject, hateKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			hate = new_list;
		}
		
	}
	const gchar *hatethreateningKey = "hate/threatening";
	node = json_object_get_member(pJsonObject, hatethreateningKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			hatethreatening = new_list;
		}
		
	}
	const gchar *harassmentKey = "harassment";
	node = json_object_get_member(pJsonObject, harassmentKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			harassment = new_list;
		}
		
	}
	const gchar *harassmentthreateningKey = "harassment/threatening";
	node = json_object_get_member(pJsonObject, harassmentthreateningKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			harassmentthreatening = new_list;
		}
		
	}
	const gchar *illicitKey = "illicit";
	node = json_object_get_member(pJsonObject, illicitKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			illicit = new_list;
		}
		
	}
	const gchar *illicitviolentKey = "illicit/violent";
	node = json_object_get_member(pJsonObject, illicitviolentKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			illicitviolent = new_list;
		}
		
	}
	const gchar *selfharmKey = "self-harm";
	node = json_object_get_member(pJsonObject, selfharmKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			selfharm = new_list;
		}
		
	}
	const gchar *selfharmintentKey = "self-harm/intent";
	node = json_object_get_member(pJsonObject, selfharmintentKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			selfharmintent = new_list;
		}
		
	}
	const gchar *selfharminstructionsKey = "self-harm/instructions";
	node = json_object_get_member(pJsonObject, selfharminstructionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			selfharminstructions = new_list;
		}
		
	}
	const gchar *sexualKey = "sexual";
	node = json_object_get_member(pJsonObject, sexualKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			sexual = new_list;
		}
		
	}
	const gchar *sexualminorsKey = "sexual/minors";
	node = json_object_get_member(pJsonObject, sexualminorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			sexualminors = new_list;
		}
		
	}
	const gchar *violenceKey = "violence";
	node = json_object_get_member(pJsonObject, violenceKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			violence = new_list;
		}
		
	}
	const gchar *violencegraphicKey = "violence/graphic";
	node = json_object_get_member(pJsonObject, violencegraphicKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			violencegraphic = new_list;
		}
		
	}
}

CreateModerationResponse_results_inner_category_applied_input_types::CreateModerationResponse_results_inner_category_applied_input_types(char* json)
{
	this->fromJson(json);
}

char*
CreateModerationResponse_results_inner_category_applied_input_types::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getHate());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getHate());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *hateKey = "hate";
	json_object_set_member(pJsonObject, hateKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getHatethreatening());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getHatethreatening());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *hatethreateningKey = "hate/threatening";
	json_object_set_member(pJsonObject, hatethreateningKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getHarassment());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getHarassment());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *harassmentKey = "harassment";
	json_object_set_member(pJsonObject, harassmentKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getHarassmentthreatening());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getHarassmentthreatening());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *harassmentthreateningKey = "harassment/threatening";
	json_object_set_member(pJsonObject, harassmentthreateningKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getIllicit());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getIllicit());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *illicitKey = "illicit";
	json_object_set_member(pJsonObject, illicitKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getIllicitviolent());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getIllicitviolent());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *illicitviolentKey = "illicit/violent";
	json_object_set_member(pJsonObject, illicitviolentKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getSelfharm());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getSelfharm());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *selfharmKey = "self-harm";
	json_object_set_member(pJsonObject, selfharmKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getSelfharmintent());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getSelfharmintent());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *selfharmintentKey = "self-harm/intent";
	json_object_set_member(pJsonObject, selfharmintentKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getSelfharminstructions());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getSelfharminstructions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *selfharminstructionsKey = "self-harm/instructions";
	json_object_set_member(pJsonObject, selfharminstructionsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getSexual());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getSexual());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *sexualKey = "sexual";
	json_object_set_member(pJsonObject, sexualKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getSexualminors());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getSexualminors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *sexualminorsKey = "sexual/minors";
	json_object_set_member(pJsonObject, sexualminorsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getViolence());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getViolence());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *violenceKey = "violence";
	json_object_set_member(pJsonObject, violenceKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getViolencegraphic());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getViolencegraphic());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *violencegraphicKey = "violence/graphic";
	json_object_set_member(pJsonObject, violencegraphicKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getHate()
{
	return hate;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setHate(std::list <std::string> hate)
{
	this->hate = hate;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getHatethreatening()
{
	return hatethreatening;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setHatethreatening(std::list <std::string> hatethreatening)
{
	this->hatethreatening = hatethreatening;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getHarassment()
{
	return harassment;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setHarassment(std::list <std::string> harassment)
{
	this->harassment = harassment;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getHarassmentthreatening()
{
	return harassmentthreatening;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setHarassmentthreatening(std::list <std::string> harassmentthreatening)
{
	this->harassmentthreatening = harassmentthreatening;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getIllicit()
{
	return illicit;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setIllicit(std::list <std::string> illicit)
{
	this->illicit = illicit;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getIllicitviolent()
{
	return illicitviolent;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setIllicitviolent(std::list <std::string> illicitviolent)
{
	this->illicitviolent = illicitviolent;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getSelfharm()
{
	return selfharm;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setSelfharm(std::list <std::string> selfharm)
{
	this->selfharm = selfharm;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getSelfharmintent()
{
	return selfharmintent;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setSelfharmintent(std::list <std::string> selfharmintent)
{
	this->selfharmintent = selfharmintent;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getSelfharminstructions()
{
	return selfharminstructions;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setSelfharminstructions(std::list <std::string> selfharminstructions)
{
	this->selfharminstructions = selfharminstructions;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getSexual()
{
	return sexual;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setSexual(std::list <std::string> sexual)
{
	this->sexual = sexual;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getSexualminors()
{
	return sexualminors;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setSexualminors(std::list <std::string> sexualminors)
{
	this->sexualminors = sexualminors;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getViolence()
{
	return violence;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setViolence(std::list <std::string> violence)
{
	this->violence = violence;
}

std::list<std::string>
CreateModerationResponse_results_inner_category_applied_input_types::getViolencegraphic()
{
	return violencegraphic;
}

void
CreateModerationResponse_results_inner_category_applied_input_types::setViolencegraphic(std::list <std::string> violencegraphic)
{
	this->violencegraphic = violencegraphic;
}


