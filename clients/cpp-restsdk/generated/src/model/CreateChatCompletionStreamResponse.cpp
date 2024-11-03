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



#include "CppRestOpenAPIClient/model/CreateChatCompletionStreamResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateChatCompletionStreamResponse::CreateChatCompletionStreamResponse()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_ChoicesIsSet = false;
    m_Created = 0;
    m_CreatedIsSet = false;
    m_Model = utility::conversions::to_string_t("");
    m_ModelIsSet = false;
    m_System_fingerprint = utility::conversions::to_string_t("");
    m_System_fingerprintIsSet = false;
    m_object = utility::conversions::to_string_t("");
    m_objectIsSet = false;
}

CreateChatCompletionStreamResponse::~CreateChatCompletionStreamResponse()
{
}

void CreateChatCompletionStreamResponse::validate()
{
    // TODO: implement validation
}

web::json::value CreateChatCompletionStreamResponse::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_ChoicesIsSet)
    {
        val[utility::conversions::to_string_t(U("choices"))] = ModelBase::toJson(m_Choices);
    }
    if(m_CreatedIsSet)
    {
        val[utility::conversions::to_string_t(U("created"))] = ModelBase::toJson(m_Created);
    }
    if(m_ModelIsSet)
    {
        val[utility::conversions::to_string_t(U("model"))] = ModelBase::toJson(m_Model);
    }
    if(m_System_fingerprintIsSet)
    {
        val[utility::conversions::to_string_t(U("system_fingerprint"))] = ModelBase::toJson(m_System_fingerprint);
    }
    if(m_objectIsSet)
    {
        val[utility::conversions::to_string_t(U("object"))] = ModelBase::toJson(m_object);
    }

    return val;
}

bool CreateChatCompletionStreamResponse::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("choices"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("choices")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<CreateChatCompletionStreamResponse_choices_inner>> refVal_setChoices;
            ok &= ModelBase::fromJson(fieldValue, refVal_setChoices);
            setChoices(refVal_setChoices);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("created"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("created")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setCreated;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreated);
            setCreated(refVal_setCreated);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("model"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("model")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setModel;
            ok &= ModelBase::fromJson(fieldValue, refVal_setModel);
            setModel(refVal_setModel);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("system_fingerprint"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("system_fingerprint")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSystemFingerprint;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSystemFingerprint);
            setSystemFingerprint(refVal_setSystemFingerprint);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("object"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("object")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setObject;
            ok &= ModelBase::fromJson(fieldValue, refVal_setObject);
            setObject(refVal_setObject);
        }
    }
    return ok;
}

void CreateChatCompletionStreamResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_ChoicesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("choices")), m_Choices));
    }
    if(m_CreatedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("created")), m_Created));
    }
    if(m_ModelIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("model")), m_Model));
    }
    if(m_System_fingerprintIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("system_fingerprint")), m_System_fingerprint));
    }
    if(m_objectIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("object")), m_object));
    }
}

bool CreateChatCompletionStreamResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("choices"))))
    {
        std::vector<std::shared_ptr<CreateChatCompletionStreamResponse_choices_inner>> refVal_setChoices;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("choices"))), refVal_setChoices );
        setChoices(refVal_setChoices);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("created"))))
    {
        int32_t refVal_setCreated;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("created"))), refVal_setCreated );
        setCreated(refVal_setCreated);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("model"))))
    {
        utility::string_t refVal_setModel;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("model"))), refVal_setModel );
        setModel(refVal_setModel);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("system_fingerprint"))))
    {
        utility::string_t refVal_setSystemFingerprint;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("system_fingerprint"))), refVal_setSystemFingerprint );
        setSystemFingerprint(refVal_setSystemFingerprint);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("object"))))
    {
        utility::string_t refVal_setObject;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("object"))), refVal_setObject );
        setObject(refVal_setObject);
    }
    return ok;
}

utility::string_t CreateChatCompletionStreamResponse::getId() const
{
    return m_Id;
}

void CreateChatCompletionStreamResponse::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool CreateChatCompletionStreamResponse::idIsSet() const
{
    return m_IdIsSet;
}

void CreateChatCompletionStreamResponse::unsetId()
{
    m_IdIsSet = false;
}
std::vector<std::shared_ptr<CreateChatCompletionStreamResponse_choices_inner>>& CreateChatCompletionStreamResponse::getChoices()
{
    return m_Choices;
}

void CreateChatCompletionStreamResponse::setChoices(const std::vector<std::shared_ptr<CreateChatCompletionStreamResponse_choices_inner>>& value)
{
    m_Choices = value;
    m_ChoicesIsSet = true;
}

bool CreateChatCompletionStreamResponse::choicesIsSet() const
{
    return m_ChoicesIsSet;
}

void CreateChatCompletionStreamResponse::unsetChoices()
{
    m_ChoicesIsSet = false;
}
int32_t CreateChatCompletionStreamResponse::getCreated() const
{
    return m_Created;
}

void CreateChatCompletionStreamResponse::setCreated(int32_t value)
{
    m_Created = value;
    m_CreatedIsSet = true;
}

bool CreateChatCompletionStreamResponse::createdIsSet() const
{
    return m_CreatedIsSet;
}

void CreateChatCompletionStreamResponse::unsetCreated()
{
    m_CreatedIsSet = false;
}
utility::string_t CreateChatCompletionStreamResponse::getModel() const
{
    return m_Model;
}

void CreateChatCompletionStreamResponse::setModel(const utility::string_t& value)
{
    m_Model = value;
    m_ModelIsSet = true;
}

bool CreateChatCompletionStreamResponse::modelIsSet() const
{
    return m_ModelIsSet;
}

void CreateChatCompletionStreamResponse::unsetModel()
{
    m_ModelIsSet = false;
}
utility::string_t CreateChatCompletionStreamResponse::getSystemFingerprint() const
{
    return m_System_fingerprint;
}

void CreateChatCompletionStreamResponse::setSystemFingerprint(const utility::string_t& value)
{
    m_System_fingerprint = value;
    m_System_fingerprintIsSet = true;
}

bool CreateChatCompletionStreamResponse::systemFingerprintIsSet() const
{
    return m_System_fingerprintIsSet;
}

void CreateChatCompletionStreamResponse::unsetSystem_fingerprint()
{
    m_System_fingerprintIsSet = false;
}
utility::string_t CreateChatCompletionStreamResponse::getObject() const
{
    return m_object;
}

void CreateChatCompletionStreamResponse::setObject(const utility::string_t& value)
{
    m_object = value;
    m_objectIsSet = true;
}

bool CreateChatCompletionStreamResponse::objectIsSet() const
{
    return m_objectIsSet;
}

void CreateChatCompletionStreamResponse::unsetobject()
{
    m_objectIsSet = false;
}
}
}
}
}


