

#include "CreateModerationRequest.h"

using namespace Tiny;

CreateModerationRequest::CreateModerationRequest()
{
	input = CreateModerationRequest_input();
	model = CreateModerationRequest_model();
}

CreateModerationRequest::CreateModerationRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateModerationRequest::~CreateModerationRequest()
{

}

void
CreateModerationRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *inputKey = "input";

    if(object.has_key(inputKey))
    {
        bourne::json value = object[inputKey];




        CreateModerationRequest_input* obj = &input;
		obj->fromJson(value.dump());

    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];




        CreateModerationRequest_model* obj = &model;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateModerationRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["input"] = getInput().toJson();






	object["model"] = getModel().toJson();


    return object;

}

CreateModerationRequest_input
CreateModerationRequest::getInput()
{
	return input;
}

void
CreateModerationRequest::setInput(CreateModerationRequest_input  input)
{
	this->input = input;
}

CreateModerationRequest_model
CreateModerationRequest::getModel()
{
	return model;
}

void
CreateModerationRequest::setModel(CreateModerationRequest_model  model)
{
	this->model = model;
}



