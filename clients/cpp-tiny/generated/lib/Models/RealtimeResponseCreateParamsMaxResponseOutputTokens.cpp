

#include "RealtimeResponseCreateParams_max_response_output_tokens.h"

using namespace Tiny;

RealtimeResponseCreateParams_max_response_output_tokens::RealtimeResponseCreateParams_max_response_output_tokens()
{
}

RealtimeResponseCreateParams_max_response_output_tokens::RealtimeResponseCreateParams_max_response_output_tokens(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeResponseCreateParams_max_response_output_tokens::~RealtimeResponseCreateParams_max_response_output_tokens()
{

}

void
RealtimeResponseCreateParams_max_response_output_tokens::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
RealtimeResponseCreateParams_max_response_output_tokens::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



