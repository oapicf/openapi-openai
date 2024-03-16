/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/CreateEditRequest_model.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateEditRequest_model::CreateEditRequest_model()
{
}

CreateEditRequest_model::~CreateEditRequest_model()
{
}

void CreateEditRequest_model::validate()
{
    // TODO: implement validation
}

web::json::value CreateEditRequest_model::toJson() const
{

    web::json::value val = web::json::value::object();
    

    return val;
}

bool CreateEditRequest_model::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    return ok;
}

void CreateEditRequest_model::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
}

bool CreateEditRequest_model::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    return ok;
}

}
}
}
}

