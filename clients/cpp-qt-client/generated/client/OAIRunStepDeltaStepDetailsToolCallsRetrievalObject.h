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
 * OAIRunStepDeltaStepDetailsToolCallsRetrievalObject.h
 *
 * 
 */

#ifndef OAIRunStepDeltaStepDetailsToolCallsRetrievalObject_H
#define OAIRunStepDeltaStepDetailsToolCallsRetrievalObject_H

#include <QJsonObject>

#include "OAIObject.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIRunStepDeltaStepDetailsToolCallsRetrievalObject : public OAIObject {
public:
    OAIRunStepDeltaStepDetailsToolCallsRetrievalObject();
    OAIRunStepDeltaStepDetailsToolCallsRetrievalObject(QString json);
    ~OAIRunStepDeltaStepDetailsToolCallsRetrievalObject() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint32 getIndex() const;
    void setIndex(const qint32 &index);
    bool is_index_Set() const;
    bool is_index_Valid() const;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getType() const;
    void setType(const QString &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    OAIObject getRetrieval() const;
    void setRetrieval(const OAIObject &retrieval);
    bool is_retrieval_Set() const;
    bool is_retrieval_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint32 m_index;
    bool m_index_isSet;
    bool m_index_isValid;

    QString m_id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString m_type;
    bool m_type_isSet;
    bool m_type_isValid;

    OAIObject m_retrieval;
    bool m_retrieval_isSet;
    bool m_retrieval_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIRunStepDeltaStepDetailsToolCallsRetrievalObject)

#endif // OAIRunStepDeltaStepDetailsToolCallsRetrievalObject_H
