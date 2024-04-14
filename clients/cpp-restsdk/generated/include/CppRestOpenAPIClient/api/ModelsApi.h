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
 * ModelsApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_ModelsApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_ModelsApi_H_



#include "CppRestOpenAPIClient/ApiClient.h"

#include "CppRestOpenAPIClient/model/DeleteModelResponse.h"
#include "CppRestOpenAPIClient/model/ListModelsResponse.h"
#include "CppRestOpenAPIClient/model/Model.h"
#include <cpprest/details/basic_types.h>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  ModelsApi 
{
public:

    explicit ModelsApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~ModelsApi();

    /// <summary>
    /// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="model">The model to delete</param>
    pplx::task<std::shared_ptr<DeleteModelResponse>> deleteModel(
        utility::string_t model
    ) const;
    /// <summary>
    /// Lists the currently available models, and provides basic information about each one such as the owner and availability.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    pplx::task<std::shared_ptr<ListModelsResponse>> listModels(
    ) const;
    /// <summary>
    /// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="model">The ID of the model to use for this request</param>
    pplx::task<std::shared_ptr<Model>> retrieveModel(
        utility::string_t model
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_ModelsApi_H_ */

