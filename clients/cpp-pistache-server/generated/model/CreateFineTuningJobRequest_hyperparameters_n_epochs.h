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
 * CreateFineTuningJobRequest_hyperparameters_n_epochs.h
 *
 * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
 */

#ifndef CreateFineTuningJobRequest_hyperparameters_n_epochs_H_
#define CreateFineTuningJobRequest_hyperparameters_n_epochs_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
/// </summary>
class  CreateFineTuningJobRequest_hyperparameters_n_epochs
{
public:
    CreateFineTuningJobRequest_hyperparameters_n_epochs();
    virtual ~CreateFineTuningJobRequest_hyperparameters_n_epochs() = default;


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

    bool operator==(const CreateFineTuningJobRequest_hyperparameters_n_epochs& rhs) const;
    bool operator!=(const CreateFineTuningJobRequest_hyperparameters_n_epochs& rhs) const;

    /////////////////////////////////////////////
    /// CreateFineTuningJobRequest_hyperparameters_n_epochs members


    friend  void to_json(nlohmann::json& j, const CreateFineTuningJobRequest_hyperparameters_n_epochs& o);
    friend  void from_json(const nlohmann::json& j, CreateFineTuningJobRequest_hyperparameters_n_epochs& o);
protected:
    
};

} // namespace org::openapitools::server::model

#endif /* CreateFineTuningJobRequest_hyperparameters_n_epochs_H_ */
