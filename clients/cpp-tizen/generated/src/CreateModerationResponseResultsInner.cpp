#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateModerationResponse_results_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateModerationResponse_results_inner::CreateModerationResponse_results_inner()
{
	//__init();
}

CreateModerationResponse_results_inner::~CreateModerationResponse_results_inner()
{
	//__cleanup();
}

void
CreateModerationResponse_results_inner::__init()
{
	//flagged = bool(false);
	//categories = new CreateModerationResponse_results_inner_categories();
	//category_scores = new CreateModerationResponse_results_inner_category_scores();
	//category_applied_input_types = new CreateModerationResponse_results_inner_category_applied_input_types();
}

void
CreateModerationResponse_results_inner::__cleanup()
{
	//if(flagged != NULL) {
	//
	//delete flagged;
	//flagged = NULL;
	//}
	//if(categories != NULL) {
	//
	//delete categories;
	//categories = NULL;
	//}
	//if(category_scores != NULL) {
	//
	//delete category_scores;
	//category_scores = NULL;
	//}
	//if(category_applied_input_types != NULL) {
	//
	//delete category_applied_input_types;
	//category_applied_input_types = NULL;
	//}
	//
}

void
CreateModerationResponse_results_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *flaggedKey = "flagged";
	node = json_object_get_member(pJsonObject, flaggedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&flagged, node, "bool", "");
		} else {
			
		}
	}
	const gchar *categoriesKey = "categories";
	node = json_object_get_member(pJsonObject, categoriesKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateModerationResponse_results_inner_categories")) {
			jsonToValue(&categories, node, "CreateModerationResponse_results_inner_categories", "CreateModerationResponse_results_inner_categories");
		} else {
			
			CreateModerationResponse_results_inner_categories* obj = static_cast<CreateModerationResponse_results_inner_categories*> (&categories);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *category_scoresKey = "category_scores";
	node = json_object_get_member(pJsonObject, category_scoresKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateModerationResponse_results_inner_category_scores")) {
			jsonToValue(&category_scores, node, "CreateModerationResponse_results_inner_category_scores", "CreateModerationResponse_results_inner_category_scores");
		} else {
			
			CreateModerationResponse_results_inner_category_scores* obj = static_cast<CreateModerationResponse_results_inner_category_scores*> (&category_scores);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *category_applied_input_typesKey = "category_applied_input_types";
	node = json_object_get_member(pJsonObject, category_applied_input_typesKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateModerationResponse_results_inner_category_applied_input_types")) {
			jsonToValue(&category_applied_input_types, node, "CreateModerationResponse_results_inner_category_applied_input_types", "CreateModerationResponse_results_inner_category_applied_input_types");
		} else {
			
			CreateModerationResponse_results_inner_category_applied_input_types* obj = static_cast<CreateModerationResponse_results_inner_category_applied_input_types*> (&category_applied_input_types);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateModerationResponse_results_inner::CreateModerationResponse_results_inner(char* json)
{
	this->fromJson(json);
}

char*
CreateModerationResponse_results_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getFlagged();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *flaggedKey = "flagged";
	json_object_set_member(pJsonObject, flaggedKey, node);
	if (isprimitive("CreateModerationResponse_results_inner_categories")) {
		CreateModerationResponse_results_inner_categories obj = getCategories();
		node = converttoJson(&obj, "CreateModerationResponse_results_inner_categories", "");
	}
	else {
		
		CreateModerationResponse_results_inner_categories obj = static_cast<CreateModerationResponse_results_inner_categories> (getCategories());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *categoriesKey = "categories";
	json_object_set_member(pJsonObject, categoriesKey, node);
	if (isprimitive("CreateModerationResponse_results_inner_category_scores")) {
		CreateModerationResponse_results_inner_category_scores obj = getCategoryScores();
		node = converttoJson(&obj, "CreateModerationResponse_results_inner_category_scores", "");
	}
	else {
		
		CreateModerationResponse_results_inner_category_scores obj = static_cast<CreateModerationResponse_results_inner_category_scores> (getCategoryScores());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *category_scoresKey = "category_scores";
	json_object_set_member(pJsonObject, category_scoresKey, node);
	if (isprimitive("CreateModerationResponse_results_inner_category_applied_input_types")) {
		CreateModerationResponse_results_inner_category_applied_input_types obj = getCategoryAppliedInputTypes();
		node = converttoJson(&obj, "CreateModerationResponse_results_inner_category_applied_input_types", "");
	}
	else {
		
		CreateModerationResponse_results_inner_category_applied_input_types obj = static_cast<CreateModerationResponse_results_inner_category_applied_input_types> (getCategoryAppliedInputTypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *category_applied_input_typesKey = "category_applied_input_types";
	json_object_set_member(pJsonObject, category_applied_input_typesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
CreateModerationResponse_results_inner::getFlagged()
{
	return flagged;
}

void
CreateModerationResponse_results_inner::setFlagged(bool  flagged)
{
	this->flagged = flagged;
}

CreateModerationResponse_results_inner_categories
CreateModerationResponse_results_inner::getCategories()
{
	return categories;
}

void
CreateModerationResponse_results_inner::setCategories(CreateModerationResponse_results_inner_categories  categories)
{
	this->categories = categories;
}

CreateModerationResponse_results_inner_category_scores
CreateModerationResponse_results_inner::getCategoryScores()
{
	return category_scores;
}

void
CreateModerationResponse_results_inner::setCategoryScores(CreateModerationResponse_results_inner_category_scores  category_scores)
{
	this->category_scores = category_scores;
}

CreateModerationResponse_results_inner_category_applied_input_types
CreateModerationResponse_results_inner::getCategoryAppliedInputTypes()
{
	return category_applied_input_types;
}

void
CreateModerationResponse_results_inner::setCategoryAppliedInputTypes(CreateModerationResponse_results_inner_category_applied_input_types  category_applied_input_types)
{
	this->category_applied_input_types = category_applied_input_types;
}


