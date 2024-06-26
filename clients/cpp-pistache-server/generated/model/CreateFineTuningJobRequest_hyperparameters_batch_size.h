/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * CreateFineTuningJobRequest_hyperparameters_batch_size.h
 *
 * Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
 */

#ifndef CreateFineTuningJobRequest_hyperparameters_batch_size_H_
#define CreateFineTuningJobRequest_hyperparameters_batch_size_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
/// </summary>
class  CreateFineTuningJobRequest_hyperparameters_batch_size
{
public:
    CreateFineTuningJobRequest_hyperparameters_batch_size();
    virtual ~CreateFineTuningJobRequest_hyperparameters_batch_size() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const CreateFineTuningJobRequest_hyperparameters_batch_size& rhs) const;
    bool operator!=(const CreateFineTuningJobRequest_hyperparameters_batch_size& rhs) const;

    /////////////////////////////////////////////
    /// CreateFineTuningJobRequest_hyperparameters_batch_size members


    friend  void to_json(nlohmann::json& j, const CreateFineTuningJobRequest_hyperparameters_batch_size& o);
    friend  void from_json(const nlohmann::json& j, CreateFineTuningJobRequest_hyperparameters_batch_size& o);
protected:
    
};

} // namespace org::openapitools::server::model

#endif /* CreateFineTuningJobRequest_hyperparameters_batch_size_H_ */
