

#include "CreateModerationResponse.h"

using namespace Tiny;

CreateModerationResponse::CreateModerationResponse()
{
	id = std::string();
	model = std::string();
	results = std::list<CreateModerationResponse_results_inner>();
}

CreateModerationResponse::CreateModerationResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateModerationResponse::~CreateModerationResponse()
{

}

void
CreateModerationResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];



        jsonToValue(&model, value, "std::string");


    }

    const char *resultsKey = "results";

    if(object.has_key(resultsKey))
    {
        bourne::json value = object[resultsKey];


        std::list<CreateModerationResponse_results_inner> results_list;
        CreateModerationResponse_results_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
CreateModerationResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["model"] = getModel();





    std::list<CreateModerationResponse_results_inner> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        CreateModerationResponse_results_inner obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

std::string
CreateModerationResponse::getId()
{
	return id;
}

void
CreateModerationResponse::setId(std::string  id)
{
	this->id = id;
}

std::string
CreateModerationResponse::getModel()
{
	return model;
}

void
CreateModerationResponse::setModel(std::string  model)
{
	this->model = model;
}

std::list<CreateModerationResponse_results_inner>
CreateModerationResponse::getResults()
{
	return results;
}

void
CreateModerationResponse::setResults(std::list <CreateModerationResponse_results_inner> results)
{
	this->results = results;
}



