/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/RunStepDetailsToolCallsCodeOutputImageObject.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



RunStepDetailsToolCallsCodeOutputImageObject::RunStepDetailsToolCallsCodeOutputImageObject()
{
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_ImageIsSet = false;
}

RunStepDetailsToolCallsCodeOutputImageObject::~RunStepDetailsToolCallsCodeOutputImageObject()
{
}

void RunStepDetailsToolCallsCodeOutputImageObject::validate()
{
    // TODO: implement validation
}

web::json::value RunStepDetailsToolCallsCodeOutputImageObject::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_ImageIsSet)
    {
        val[utility::conversions::to_string_t(U("image"))] = ModelBase::toJson(m_Image);
    }

    return val;
}

bool RunStepDetailsToolCallsCodeOutputImageObject::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setType);
            setType(refVal_setType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("image"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("image")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<RunStepDetailsToolCallsCodeOutputImageObject_image> refVal_setImage;
            ok &= ModelBase::fromJson(fieldValue, refVal_setImage);
            setImage(refVal_setImage);
        }
    }
    return ok;
}

void RunStepDetailsToolCallsCodeOutputImageObject::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_ImageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("image")), m_Image));
    }
}

bool RunStepDetailsToolCallsCodeOutputImageObject::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        utility::string_t refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("image"))))
    {
        std::shared_ptr<RunStepDetailsToolCallsCodeOutputImageObject_image> refVal_setImage;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("image"))), refVal_setImage );
        setImage(refVal_setImage);
    }
    return ok;
}

utility::string_t RunStepDetailsToolCallsCodeOutputImageObject::getType() const
{
    return m_Type;
}

void RunStepDetailsToolCallsCodeOutputImageObject::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool RunStepDetailsToolCallsCodeOutputImageObject::typeIsSet() const
{
    return m_TypeIsSet;
}

void RunStepDetailsToolCallsCodeOutputImageObject::unsetType()
{
    m_TypeIsSet = false;
}
std::shared_ptr<RunStepDetailsToolCallsCodeOutputImageObject_image> RunStepDetailsToolCallsCodeOutputImageObject::getImage() const
{
    return m_Image;
}

void RunStepDetailsToolCallsCodeOutputImageObject::setImage(const std::shared_ptr<RunStepDetailsToolCallsCodeOutputImageObject_image>& value)
{
    m_Image = value;
    m_ImageIsSet = true;
}

bool RunStepDetailsToolCallsCodeOutputImageObject::imageIsSet() const
{
    return m_ImageIsSet;
}

void RunStepDetailsToolCallsCodeOutputImageObject::unsetImage()
{
    m_ImageIsSet = false;
}
}
}
}
}


