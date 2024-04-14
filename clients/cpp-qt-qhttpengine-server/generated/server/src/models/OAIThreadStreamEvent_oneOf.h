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
 * OAIThreadStreamEvent_oneOf.h
 *
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 */

#ifndef OAIThreadStreamEvent_oneOf_H
#define OAIThreadStreamEvent_oneOf_H

#include <QJsonObject>

#include "OAIThreadObject.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIThreadStreamEvent_oneOf : public OAIObject {
public:
    OAIThreadStreamEvent_oneOf();
    OAIThreadStreamEvent_oneOf(QString json);
    ~OAIThreadStreamEvent_oneOf() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getEvent() const;
    void setEvent(const QString &event);
    bool is_event_Set() const;
    bool is_event_Valid() const;

    OAIThreadObject getData() const;
    void setData(const OAIThreadObject &data);
    bool is_data_Set() const;
    bool is_data_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString event;
    bool m_event_isSet;
    bool m_event_isValid;

    OAIThreadObject data;
    bool m_data_isSet;
    bool m_data_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIThreadStreamEvent_oneOf)

#endif // OAIThreadStreamEvent_oneOf_H
