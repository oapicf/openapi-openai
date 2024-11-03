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
 * OAIRunStepDeltaStepDetailsMessageCreationObject_message_creation.h
 *
 * 
 */

#ifndef OAIRunStepDeltaStepDetailsMessageCreationObject_message_creation_H
#define OAIRunStepDeltaStepDetailsMessageCreationObject_message_creation_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIRunStepDeltaStepDetailsMessageCreationObject_message_creation : public OAIObject {
public:
    OAIRunStepDeltaStepDetailsMessageCreationObject_message_creation();
    OAIRunStepDeltaStepDetailsMessageCreationObject_message_creation(QString json);
    ~OAIRunStepDeltaStepDetailsMessageCreationObject_message_creation() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getMessageId() const;
    void setMessageId(const QString &message_id);
    bool is_message_id_Set() const;
    bool is_message_id_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString message_id;
    bool m_message_id_isSet;
    bool m_message_id_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIRunStepDeltaStepDetailsMessageCreationObject_message_creation)

#endif // OAIRunStepDeltaStepDetailsMessageCreationObject_message_creation_H
