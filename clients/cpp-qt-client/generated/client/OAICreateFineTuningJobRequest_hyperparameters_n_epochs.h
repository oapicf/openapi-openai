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
 * OAICreateFineTuningJobRequest_hyperparameters_n_epochs.h
 *
 * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
 */

#ifndef OAICreateFineTuningJobRequest_hyperparameters_n_epochs_H
#define OAICreateFineTuningJobRequest_hyperparameters_n_epochs_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICreateFineTuningJobRequest_hyperparameters_n_epochs : public OAIObject {
public:
    OAICreateFineTuningJobRequest_hyperparameters_n_epochs();
    OAICreateFineTuningJobRequest_hyperparameters_n_epochs(QString json);
    ~OAICreateFineTuningJobRequest_hyperparameters_n_epochs() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateFineTuningJobRequest_hyperparameters_n_epochs)

#endif // OAICreateFineTuningJobRequest_hyperparameters_n_epochs_H
