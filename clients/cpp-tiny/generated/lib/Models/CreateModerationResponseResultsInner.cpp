

#include "CreateModerationResponse_results_inner.h"

using namespace Tiny;

CreateModerationResponse_results_inner::CreateModerationResponse_results_inner()
{
	flagged = bool(false);
	categories = CreateModerationResponse_results_inner_categories();
	category_scores = CreateModerationResponse_results_inner_category_scores();
	category_applied_input_types = CreateModerationResponse_results_inner_category_applied_input_types();
}

CreateModerationResponse_results_inner::CreateModerationResponse_results_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateModerationResponse_results_inner::~CreateModerationResponse_results_inner()
{

}

void
CreateModerationResponse_results_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *flaggedKey = "flagged";

    if(object.has_key(flaggedKey))
    {
        bourne::json value = object[flaggedKey];



        jsonToValue(&flagged, value, "bool");


    }

    const char *categoriesKey = "categories";

    if(object.has_key(categoriesKey))
    {
        bourne::json value = object[categoriesKey];




        CreateModerationResponse_results_inner_categories* obj = &categories;
		obj->fromJson(value.dump());

    }

    const char *category_scoresKey = "category_scores";

    if(object.has_key(category_scoresKey))
    {
        bourne::json value = object[category_scoresKey];




        CreateModerationResponse_results_inner_category_scores* obj = &category_scores;
		obj->fromJson(value.dump());

    }

    const char *category_applied_input_typesKey = "category_applied_input_types";

    if(object.has_key(category_applied_input_typesKey))
    {
        bourne::json value = object[category_applied_input_typesKey];




        CreateModerationResponse_results_inner_category_applied_input_types* obj = &category_applied_input_types;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateModerationResponse_results_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["flagged"] = isFlagged();







	object["categories"] = getCategories().toJson();






	object["category_scores"] = getCategoryScores().toJson();






	object["category_applied_input_types"] = getCategoryAppliedInputTypes().toJson();


    return object;

}

bool
CreateModerationResponse_results_inner::isFlagged()
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



