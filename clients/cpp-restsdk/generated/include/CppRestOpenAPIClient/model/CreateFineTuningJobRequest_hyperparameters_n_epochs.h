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
 * CreateFineTuningJobRequest_hyperparameters_n_epochs.h
 *
 * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateFineTuningJobRequest_hyperparameters_n_epochs_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateFineTuningJobRequest_hyperparameters_n_epochs_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
/// </summary>
class  CreateFineTuningJobRequest_hyperparameters_n_epochs
    : public ModelBase
{
public:
    CreateFineTuningJobRequest_hyperparameters_n_epochs();
    virtual ~CreateFineTuningJobRequest_hyperparameters_n_epochs();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateFineTuningJobRequest_hyperparameters_n_epochs members


protected:
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateFineTuningJobRequest_hyperparameters_n_epochs_H_ */
