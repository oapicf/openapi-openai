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
 * CreateFineTuningJobRequest_hyperparameters_batch_size.h
 *
 * Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateFineTuningJobRequest_hyperparameters_batch_size_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateFineTuningJobRequest_hyperparameters_batch_size_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
/// </summary>
class  CreateFineTuningJobRequest_hyperparameters_batch_size
    : public ModelBase
{
public:
    CreateFineTuningJobRequest_hyperparameters_batch_size();
    virtual ~CreateFineTuningJobRequest_hyperparameters_batch_size();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateFineTuningJobRequest_hyperparameters_batch_size members


protected:
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateFineTuningJobRequest_hyperparameters_batch_size_H_ */
