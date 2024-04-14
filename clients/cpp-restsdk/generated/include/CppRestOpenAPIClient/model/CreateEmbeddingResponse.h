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

/*
 * CreateEmbeddingResponse.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateEmbeddingResponse_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateEmbeddingResponse_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/CreateEmbeddingResponse_usage.h"
#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/Embedding.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class Embedding;
class CreateEmbeddingResponse_usage;

/// <summary>
/// 
/// </summary>
class  CreateEmbeddingResponse
    : public ModelBase
{
public:
    CreateEmbeddingResponse();
    virtual ~CreateEmbeddingResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateEmbeddingResponse members

    /// <summary>
    /// The list of embeddings generated by the model.
    /// </summary>
    std::vector<std::shared_ptr<Embedding>>& getData();
    bool dataIsSet() const;
    void unsetData();

    void setData(const std::vector<std::shared_ptr<Embedding>>& value);

    /// <summary>
    /// The name of the model used to generate the embedding.
    /// </summary>
    utility::string_t getModel() const;
    bool modelIsSet() const;
    void unsetModel();

    void setModel(const utility::string_t& value);

    /// <summary>
    /// The object type, which is always \&quot;list\&quot;.
    /// </summary>
    utility::string_t getObject() const;
    bool objectIsSet() const;
    void unsetobject();

    void setObject(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CreateEmbeddingResponse_usage> getUsage() const;
    bool usageIsSet() const;
    void unsetUsage();

    void setUsage(const std::shared_ptr<CreateEmbeddingResponse_usage>& value);


protected:
    std::vector<std::shared_ptr<Embedding>> m_Data;
    bool m_DataIsSet;
    utility::string_t m_Model;
    bool m_ModelIsSet;
    utility::string_t m_object;
    bool m_objectIsSet;
    std::shared_ptr<CreateEmbeddingResponse_usage> m_Usage;
    bool m_UsageIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateEmbeddingResponse_H_ */
