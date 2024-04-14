#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateModerationResponse_results_inner_categories.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateModerationResponse_results_inner_categories::CreateModerationResponse_results_inner_categories()
{
	//__init();
}

CreateModerationResponse_results_inner_categories::~CreateModerationResponse_results_inner_categories()
{
	//__cleanup();
}

void
CreateModerationResponse_results_inner_categories::__init()
{
	//hate = bool(false);
	//hatethreatening = bool(false);
	//harassment = bool(false);
	//harassmentthreatening = bool(false);
	//selfharm = bool(false);
	//selfharmintent = bool(false);
	//selfharminstructions = bool(false);
	//sexual = bool(false);
	//sexualminors = bool(false);
	//violence = bool(false);
	//violencegraphic = bool(false);
}

void
CreateModerationResponse_results_inner_categories::__cleanup()
{
	//if(hate != NULL) {
	//
	//delete hate;
	//hate = NULL;
	//}
	//if(hatethreatening != NULL) {
	//
	//delete hatethreatening;
	//hatethreatening = NULL;
	//}
	//if(harassment != NULL) {
	//
	//delete harassment;
	//harassment = NULL;
	//}
	//if(harassmentthreatening != NULL) {
	//
	//delete harassmentthreatening;
	//harassmentthreatening = NULL;
	//}
	//if(selfharm != NULL) {
	//
	//delete selfharm;
	//selfharm = NULL;
	//}
	//if(selfharmintent != NULL) {
	//
	//delete selfharmintent;
	//selfharmintent = NULL;
	//}
	//if(selfharminstructions != NULL) {
	//
	//delete selfharminstructions;
	//selfharminstructions = NULL;
	//}
	//if(sexual != NULL) {
	//
	//delete sexual;
	//sexual = NULL;
	//}
	//if(sexualminors != NULL) {
	//
	//delete sexualminors;
	//sexualminors = NULL;
	//}
	//if(violence != NULL) {
	//
	//delete violence;
	//violence = NULL;
	//}
	//if(violencegraphic != NULL) {
	//
	//delete violencegraphic;
	//violencegraphic = NULL;
	//}
	//
}

void
CreateModerationResponse_results_inner_categories::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hateKey = "hate";
	node = json_object_get_member(pJsonObject, hateKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&hate, node, "bool", "");
		} else {
			
		}
	}
	const gchar *hatethreateningKey = "hate/threatening";
	node = json_object_get_member(pJsonObject, hatethreateningKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&hatethreatening, node, "bool", "");
		} else {
			
		}
	}
	const gchar *harassmentKey = "harassment";
	node = json_object_get_member(pJsonObject, harassmentKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&harassment, node, "bool", "");
		} else {
			
		}
	}
	const gchar *harassmentthreateningKey = "harassment/threatening";
	node = json_object_get_member(pJsonObject, harassmentthreateningKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&harassmentthreatening, node, "bool", "");
		} else {
			
		}
	}
	const gchar *selfharmKey = "self-harm";
	node = json_object_get_member(pJsonObject, selfharmKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&selfharm, node, "bool", "");
		} else {
			
		}
	}
	const gchar *selfharmintentKey = "self-harm/intent";
	node = json_object_get_member(pJsonObject, selfharmintentKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&selfharmintent, node, "bool", "");
		} else {
			
		}
	}
	const gchar *selfharminstructionsKey = "self-harm/instructions";
	node = json_object_get_member(pJsonObject, selfharminstructionsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&selfharminstructions, node, "bool", "");
		} else {
			
		}
	}
	const gchar *sexualKey = "sexual";
	node = json_object_get_member(pJsonObject, sexualKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&sexual, node, "bool", "");
		} else {
			
		}
	}
	const gchar *sexualminorsKey = "sexual/minors";
	node = json_object_get_member(pJsonObject, sexualminorsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&sexualminors, node, "bool", "");
		} else {
			
		}
	}
	const gchar *violenceKey = "violence";
	node = json_object_get_member(pJsonObject, violenceKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&violence, node, "bool", "");
		} else {
			
		}
	}
	const gchar *violencegraphicKey = "violence/graphic";
	node = json_object_get_member(pJsonObject, violencegraphicKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&violencegraphic, node, "bool", "");
		} else {
			
		}
	}
}

CreateModerationResponse_results_inner_categories::CreateModerationResponse_results_inner_categories(char* json)
{
	this->fromJson(json);
}

char*
CreateModerationResponse_results_inner_categories::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getHate();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *hateKey = "hate";
	json_object_set_member(pJsonObject, hateKey, node);
	if (isprimitive("bool")) {
		bool obj = getHatethreatening();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *hatethreateningKey = "hate/threatening";
	json_object_set_member(pJsonObject, hatethreateningKey, node);
	if (isprimitive("bool")) {
		bool obj = getHarassment();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *harassmentKey = "harassment";
	json_object_set_member(pJsonObject, harassmentKey, node);
	if (isprimitive("bool")) {
		bool obj = getHarassmentthreatening();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *harassmentthreateningKey = "harassment/threatening";
	json_object_set_member(pJsonObject, harassmentthreateningKey, node);
	if (isprimitive("bool")) {
		bool obj = getSelfharm();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *selfharmKey = "self-harm";
	json_object_set_member(pJsonObject, selfharmKey, node);
	if (isprimitive("bool")) {
		bool obj = getSelfharmintent();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *selfharmintentKey = "self-harm/intent";
	json_object_set_member(pJsonObject, selfharmintentKey, node);
	if (isprimitive("bool")) {
		bool obj = getSelfharminstructions();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *selfharminstructionsKey = "self-harm/instructions";
	json_object_set_member(pJsonObject, selfharminstructionsKey, node);
	if (isprimitive("bool")) {
		bool obj = getSexual();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *sexualKey = "sexual";
	json_object_set_member(pJsonObject, sexualKey, node);
	if (isprimitive("bool")) {
		bool obj = getSexualminors();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *sexualminorsKey = "sexual/minors";
	json_object_set_member(pJsonObject, sexualminorsKey, node);
	if (isprimitive("bool")) {
		bool obj = getViolence();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *violenceKey = "violence";
	json_object_set_member(pJsonObject, violenceKey, node);
	if (isprimitive("bool")) {
		bool obj = getViolencegraphic();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
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

bool
CreateModerationResponse_results_inner_categories::getHate()
{
	return hate;
}

void
CreateModerationResponse_results_inner_categories::setHate(bool  hate)
{
	this->hate = hate;
}

bool
CreateModerationResponse_results_inner_categories::getHatethreatening()
{
	return hatethreatening;
}

void
CreateModerationResponse_results_inner_categories::setHatethreatening(bool  hatethreatening)
{
	this->hatethreatening = hatethreatening;
}

bool
CreateModerationResponse_results_inner_categories::getHarassment()
{
	return harassment;
}

void
CreateModerationResponse_results_inner_categories::setHarassment(bool  harassment)
{
	this->harassment = harassment;
}

bool
CreateModerationResponse_results_inner_categories::getHarassmentthreatening()
{
	return harassmentthreatening;
}

void
CreateModerationResponse_results_inner_categories::setHarassmentthreatening(bool  harassmentthreatening)
{
	this->harassmentthreatening = harassmentthreatening;
}

bool
CreateModerationResponse_results_inner_categories::getSelfharm()
{
	return selfharm;
}

void
CreateModerationResponse_results_inner_categories::setSelfharm(bool  selfharm)
{
	this->selfharm = selfharm;
}

bool
CreateModerationResponse_results_inner_categories::getSelfharmintent()
{
	return selfharmintent;
}

void
CreateModerationResponse_results_inner_categories::setSelfharmintent(bool  selfharmintent)
{
	this->selfharmintent = selfharmintent;
}

bool
CreateModerationResponse_results_inner_categories::getSelfharminstructions()
{
	return selfharminstructions;
}

void
CreateModerationResponse_results_inner_categories::setSelfharminstructions(bool  selfharminstructions)
{
	this->selfharminstructions = selfharminstructions;
}

bool
CreateModerationResponse_results_inner_categories::getSexual()
{
	return sexual;
}

void
CreateModerationResponse_results_inner_categories::setSexual(bool  sexual)
{
	this->sexual = sexual;
}

bool
CreateModerationResponse_results_inner_categories::getSexualminors()
{
	return sexualminors;
}

void
CreateModerationResponse_results_inner_categories::setSexualminors(bool  sexualminors)
{
	this->sexualminors = sexualminors;
}

bool
CreateModerationResponse_results_inner_categories::getViolence()
{
	return violence;
}

void
CreateModerationResponse_results_inner_categories::setViolence(bool  violence)
{
	this->violence = violence;
}

bool
CreateModerationResponse_results_inner_categories::getViolencegraphic()
{
	return violencegraphic;
}

void
CreateModerationResponse_results_inner_categories::setViolencegraphic(bool  violencegraphic)
{
	this->violencegraphic = violencegraphic;
}


