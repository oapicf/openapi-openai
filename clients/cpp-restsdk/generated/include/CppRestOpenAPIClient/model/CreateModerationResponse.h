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
 * CreateModerationResponse.h
 *
 * Represents if a given text input is potentially harmful.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateModerationResponse_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateModerationResponse_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/CreateModerationResponse_results_inner.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class CreateModerationResponse_results_inner;

/// <summary>
/// Represents if a given text input is potentially harmful.
/// </summary>
class  CreateModerationResponse
    : public ModelBase
{
public:
    CreateModerationResponse();
    virtual ~CreateModerationResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateModerationResponse members

    /// <summary>
    /// The unique identifier for the moderation request.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// The model used to generate the moderation results.
    /// </summary>
    utility::string_t getModel() const;
    bool modelIsSet() const;
    void unsetModel();

    void setModel(const utility::string_t& value);

    /// <summary>
    /// A list of moderation objects.
    /// </summary>
    std::vector<std::shared_ptr<CreateModerationResponse_results_inner>>& getResults();
    bool resultsIsSet() const;
    void unsetResults();

    void setResults(const std::vector<std::shared_ptr<CreateModerationResponse_results_inner>>& value);


protected:
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Model;
    bool m_ModelIsSet;
    std::vector<std::shared_ptr<CreateModerationResponse_results_inner>> m_Results;
    bool m_ResultsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateModerationResponse_H_ */
