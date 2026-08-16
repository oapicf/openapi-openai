

#include "CreateTranscriptionRequest_model.h"

using namespace Tiny;

CreateTranscriptionRequest_model::CreateTranscriptionRequest_model()
{
}

CreateTranscriptionRequest_model::CreateTranscriptionRequest_model(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateTranscriptionRequest_model::~CreateTranscriptionRequest_model()
{

}

void
CreateTranscriptionRequest_model::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateTranscriptionRequest_model::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



