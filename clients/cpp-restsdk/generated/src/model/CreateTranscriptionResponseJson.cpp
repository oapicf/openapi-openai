/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/CreateTranscriptionResponseJson.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateTranscriptionResponseJson::CreateTranscriptionResponseJson()
{
    m_Text = utility::conversions::to_string_t("");
    m_TextIsSet = false;
}

CreateTranscriptionResponseJson::~CreateTranscriptionResponseJson()
{
}

void CreateTranscriptionResponseJson::validate()
{
    // TODO: implement validation
}

web::json::value CreateTranscriptionResponseJson::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_TextIsSet)
    {
        val[utility::conversions::to_string_t(U("text"))] = ModelBase::toJson(m_Text);
    }

    return val;
}

bool CreateTranscriptionResponseJson::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("text"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("text")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setText;
            ok &= ModelBase::fromJson(fieldValue, refVal_setText);
            setText(refVal_setText);
        }
    }
    return ok;
}

void CreateTranscriptionResponseJson::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_TextIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("text")), m_Text));
    }
}

bool CreateTranscriptionResponseJson::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("text"))))
    {
        utility::string_t refVal_setText;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("text"))), refVal_setText );
        setText(refVal_setText);
    }
    return ok;
}

utility::string_t CreateTranscriptionResponseJson::getText() const
{
    return m_Text;
}

void CreateTranscriptionResponseJson::setText(const utility::string_t& value)
{
    m_Text = value;
    m_TextIsSet = true;
}

bool CreateTranscriptionResponseJson::textIsSet() const
{
    return m_TextIsSet;
}

void CreateTranscriptionResponseJson::unsetText()
{
    m_TextIsSet = false;
}
}
}
}
}


